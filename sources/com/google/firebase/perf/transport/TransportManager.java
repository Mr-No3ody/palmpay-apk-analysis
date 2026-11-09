package com.google.firebase.perf.transport;

import C0.G;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.camera.camera2.internal.F;
import androidx.emoji2.text.j;
import com.didiglobal.booster.instrument.ShadowThreadPoolExecutor;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.BuildConfig;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.logging.ConsoleUrlGenerator;
import com.google.firebase.perf.metrics.validator.PerfMetricValidator;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.util.Rate;
import com.google.firebase.perf.v1.AndroidApplicationInfo;
import com.google.firebase.perf.v1.ApplicationInfo;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.GaugeMetric;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.firebase.perf.v1.PerfMetricOrBuilder;
import com.google.firebase.perf.v1.TraceMetric;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p381za.c;

/* JADX INFO: loaded from: classes2.dex */
public class TransportManager implements AppStateMonitor.AppStateCallback {
    private static final int CORE_POOL_SIZE = 0;
    private static final String KEY_AVAILABLE_GAUGES_FOR_CACHING = "KEY_AVAILABLE_GAUGES_FOR_CACHING";
    private static final String KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING = "KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING";
    private static final String KEY_AVAILABLE_TRACES_FOR_CACHING = "KEY_AVAILABLE_TRACES_FOR_CACHING";
    private static final int MAX_GAUGE_METRICS_CACHE_SIZE = 50;
    private static final int MAX_NETWORK_REQUEST_METRICS_CACHE_SIZE = 50;
    private static final int MAX_POOL_SIZE = 1;
    private static final int MAX_TRACE_METRICS_CACHE_SIZE = 50;
    private Context appContext;
    private AppStateMonitor appStateMonitor;
    private ApplicationInfo.Builder applicationInfoBuilder;
    private final Map<String, Integer> cacheMap;
    private ConfigResolver configResolver;
    private FirebaseApp firebaseApp;
    private FirebaseInstallationsApi firebaseInstallationsApi;

    @Nullable
    private FirebasePerformance firebasePerformance;
    private FlgTransport flgTransport;
    private Provider<TransportFactory> flgTransportFactoryProvider;
    private String packageName;
    private String projectId;
    private RateLimiter rateLimiter;
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private static final TransportManager instance = new TransportManager();
    private final ConcurrentLinkedQueue<PendingPerfEvent> pendingEventsQueue = new ConcurrentLinkedQueue<>();
    private final AtomicBoolean isTransportInitialized = new AtomicBoolean(false);
    private boolean isForegroundState = false;
    private ExecutorService executorService = new ShadowThreadPoolExecutor(0, 1, 10L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) new LinkedBlockingQueue(), "\u200bcom.google.firebase.perf.transport.TransportManager", true);

    @SuppressLint({"ThreadPoolCreation"})
    private TransportManager() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.cacheMap = concurrentHashMap;
        concurrentHashMap.put(KEY_AVAILABLE_TRACES_FOR_CACHING, 50);
        concurrentHashMap.put(KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING, 50);
        concurrentHashMap.put(KEY_AVAILABLE_GAUGES_FOR_CACHING, 50);
    }

    @WorkerThread
    private void dispatchLog(PerfMetric perfMetric) {
        if (perfMetric.hasTraceMetric()) {
            logger.info("Logging %s. In a minute, visit the Firebase console to view your data: %s", getLogcatMsg(perfMetric), getConsoleUrl(perfMetric.getTraceMetric()));
        } else {
            logger.info("Logging %s", getLogcatMsg(perfMetric));
        }
        this.flgTransport.log(perfMetric);
    }

    private void finishInitialization() {
        this.appStateMonitor.registerForAppState(new WeakReference<>(instance));
        ApplicationInfo.Builder builderNewBuilder = ApplicationInfo.newBuilder();
        this.applicationInfoBuilder = builderNewBuilder;
        builderNewBuilder.setGoogleAppId(this.firebaseApp.getOptions().getApplicationId()).setAndroidAppInfo(AndroidApplicationInfo.newBuilder().setPackageName(this.packageName).setSdkVersion(BuildConfig.FIREPERF_VERSION_NAME).setVersionName(getVersionName(this.appContext)));
        this.isTransportInitialized.set(true);
        while (!this.pendingEventsQueue.isEmpty()) {
            final PendingPerfEvent pendingPerfEventPoll = this.pendingEventsQueue.poll();
            if (pendingPerfEventPoll != null) {
                this.executorService.execute(new Runnable() { // from class: com.google.firebase.perf.transport.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f23052a.lambda$finishInitialization$0(pendingPerfEventPoll);
                    }
                });
            }
        }
    }

    private String getConsoleUrl(TraceMetric traceMetric) {
        String name = traceMetric.getName();
        return name.startsWith(Constants.SCREEN_TRACE_PREFIX) ? ConsoleUrlGenerator.generateScreenTraceUrl(this.projectId, this.packageName, name) : ConsoleUrlGenerator.generateCustomTraceUrl(this.projectId, this.packageName, name);
    }

    private Map<String, String> getGlobalCustomAttributes() {
        updateFirebasePerformanceIfPossibleAndNeeded();
        FirebasePerformance firebasePerformance = this.firebasePerformance;
        return firebasePerformance != null ? firebasePerformance.getAttributes() : Collections.EMPTY_MAP;
    }

    public static TransportManager getInstance() {
        return instance;
    }

    private static String getLogcatMsg(PerfMetricOrBuilder perfMetricOrBuilder) {
        if (perfMetricOrBuilder.hasTraceMetric()) {
            return getLogcatMsg(perfMetricOrBuilder.getTraceMetric());
        }
        if (perfMetricOrBuilder.hasNetworkRequestMetric()) {
            return getLogcatMsg(perfMetricOrBuilder.getNetworkRequestMetric());
        }
        return perfMetricOrBuilder.hasGaugeMetric() ? getLogcatMsg(perfMetricOrBuilder.getGaugeMetric()) : "log";
    }

    private static String getVersionName(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str == null ? "" : str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    private void incrementDropCount(PerfMetric perfMetric) {
        if (perfMetric.hasTraceMetric()) {
            this.appStateMonitor.incrementCount(Constants.CounterNames.TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        } else if (perfMetric.hasNetworkRequestMetric()) {
            this.appStateMonitor.incrementCount(Constants.CounterNames.NETWORK_TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        }
    }

    @WorkerThread
    private boolean isAllowedToCache(PerfMetricOrBuilder perfMetricOrBuilder) {
        Integer num = this.cacheMap.get(KEY_AVAILABLE_TRACES_FOR_CACHING);
        int iIntValue = num.intValue();
        Integer num2 = this.cacheMap.get(KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING);
        int iIntValue2 = num2.intValue();
        Integer num3 = this.cacheMap.get(KEY_AVAILABLE_GAUGES_FOR_CACHING);
        int iIntValue3 = num3.intValue();
        if (perfMetricOrBuilder.hasTraceMetric() && iIntValue > 0) {
            this.cacheMap.put(KEY_AVAILABLE_TRACES_FOR_CACHING, Integer.valueOf(iIntValue - 1));
            return true;
        }
        if (perfMetricOrBuilder.hasNetworkRequestMetric() && iIntValue2 > 0) {
            this.cacheMap.put(KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING, Integer.valueOf(iIntValue2 - 1));
            return true;
        }
        if (!perfMetricOrBuilder.hasGaugeMetric() || iIntValue3 <= 0) {
            logger.debug("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", getLogcatMsg(perfMetricOrBuilder), num, num2, num3);
            return false;
        }
        this.cacheMap.put(KEY_AVAILABLE_GAUGES_FOR_CACHING, Integer.valueOf(iIntValue3 - 1));
        return true;
    }

    @WorkerThread
    private boolean isAllowedToDispatch(PerfMetric perfMetric) {
        if (!this.configResolver.isPerformanceMonitoringEnabled()) {
            logger.info("Performance collection is not enabled, dropping %s", getLogcatMsg(perfMetric));
            return false;
        }
        if (!perfMetric.getApplicationInfo().hasAppInstanceId()) {
            logger.warn("App Instance ID is null or empty, dropping %s", getLogcatMsg(perfMetric));
            return false;
        }
        if (!PerfMetricValidator.isValid(perfMetric, this.appContext)) {
            logger.warn("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", getLogcatMsg(perfMetric));
            return false;
        }
        if (!this.rateLimiter.isEventSampled(perfMetric)) {
            incrementDropCount(perfMetric);
            logger.info("Event dropped due to device sampling - %s", getLogcatMsg(perfMetric));
            return false;
        }
        if (!this.rateLimiter.isEventRateLimited(perfMetric)) {
            return true;
        }
        incrementDropCount(perfMetric);
        logger.info("Rate limited (per device) - %s", getLogcatMsg(perfMetric));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$finishInitialization$0(PendingPerfEvent pendingPerfEvent) {
        syncLog(pendingPerfEvent.perfMetricBuilder, pendingPerfEvent.appState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$log$2(TraceMetric traceMetric, ApplicationProcessState applicationProcessState) {
        syncLog(PerfMetric.newBuilder().setTraceMetric(traceMetric), applicationProcessState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$log$3(NetworkRequestMetric networkRequestMetric, ApplicationProcessState applicationProcessState) {
        syncLog(PerfMetric.newBuilder().setNetworkRequestMetric(networkRequestMetric), applicationProcessState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$log$4(GaugeMetric gaugeMetric, ApplicationProcessState applicationProcessState) {
        syncLog(PerfMetric.newBuilder().setGaugeMetric(gaugeMetric), applicationProcessState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUpdateAppState$1() {
        this.rateLimiter.changeRate(this.isForegroundState);
    }

    private PerfMetric setApplicationInfoAndBuild(PerfMetric.Builder builder, ApplicationProcessState applicationProcessState) {
        updateFirebaseInstallationIdIfPossibleAndNeeded();
        ApplicationInfo.Builder applicationProcessState2 = this.applicationInfoBuilder.setApplicationProcessState(applicationProcessState);
        if (builder.hasTraceMetric() || builder.hasNetworkRequestMetric()) {
            applicationProcessState2 = applicationProcessState2.mo102clone().putAllCustomAttributes(getGlobalCustomAttributes());
        }
        return builder.setApplicationInfo(applicationProcessState2).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public void syncInit() {
        Context applicationContext = this.firebaseApp.getApplicationContext();
        this.appContext = applicationContext;
        this.packageName = applicationContext.getPackageName();
        this.configResolver = ConfigResolver.getInstance();
        this.rateLimiter = new RateLimiter(this.appContext, new Rate(100L, 1L, TimeUnit.MINUTES), 500L);
        this.appStateMonitor = AppStateMonitor.getInstance();
        this.flgTransport = new FlgTransport(this.flgTransportFactoryProvider, this.configResolver.getAndCacheLogSourceName());
        finishInitialization();
    }

    @WorkerThread
    private void syncLog(PerfMetric.Builder builder, ApplicationProcessState applicationProcessState) {
        if (!isInitialized()) {
            if (isAllowedToCache(builder)) {
                logger.debug("Transport is not initialized yet, %s will be queued for to be dispatched later", getLogcatMsg(builder));
                this.pendingEventsQueue.add(new PendingPerfEvent(builder, applicationProcessState));
                return;
            }
            return;
        }
        PerfMetric applicationInfoAndBuild = setApplicationInfoAndBuild(builder, applicationProcessState);
        if (isAllowedToDispatch(applicationInfoAndBuild)) {
            dispatchLog(applicationInfoAndBuild);
            SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
        }
    }

    @WorkerThread
    private void updateFirebaseInstallationIdIfPossibleAndNeeded() {
        String str;
        if (this.configResolver.isPerformanceMonitoringEnabled()) {
            if (!this.applicationInfoBuilder.hasAppInstanceId() || this.isForegroundState) {
                try {
                    str = (String) Tasks.await(this.firebaseInstallationsApi.getId(), 60000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e10) {
                    logger.error("Task to retrieve Installation Id is interrupted: %s", e10.getMessage());
                    str = null;
                } catch (ExecutionException e11) {
                    logger.error("Unable to retrieve Installation Id: %s", e11.getMessage());
                    str = null;
                } catch (TimeoutException e12) {
                    logger.error("Task to retrieve Installation Id is timed out: %s", e12.getMessage());
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    logger.warn("Firebase Installation Id is empty, contact Firebase Support for debugging.");
                } else {
                    this.applicationInfoBuilder.setAppInstanceId(str);
                }
            }
        }
    }

    private void updateFirebasePerformanceIfPossibleAndNeeded() {
        if (this.firebasePerformance == null && isInitialized()) {
            this.firebasePerformance = FirebasePerformance.getInstance();
        }
    }

    @VisibleForTesting
    public void clearAppInstanceId() {
        this.applicationInfoBuilder.clearAppInstanceId();
    }

    @VisibleForTesting
    public ConcurrentLinkedQueue<PendingPerfEvent> getPendingEventsQueue() {
        return new ConcurrentLinkedQueue<>(this.pendingEventsQueue);
    }

    public void initialize(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseInstallationsApi firebaseInstallationsApi, @NonNull Provider<TransportFactory> provider) {
        this.firebaseApp = firebaseApp;
        this.projectId = firebaseApp.getOptions().getProjectId();
        this.firebaseInstallationsApi = firebaseInstallationsApi;
        this.flgTransportFactoryProvider = provider;
        this.executorService.execute(new a(this, 1));
    }

    @VisibleForTesting(otherwise = 5)
    public void initializeForTest(FirebaseApp firebaseApp, FirebasePerformance firebasePerformance, FirebaseInstallationsApi firebaseInstallationsApi, Provider<TransportFactory> provider, ConfigResolver configResolver, RateLimiter rateLimiter, AppStateMonitor appStateMonitor, FlgTransport flgTransport, ExecutorService executorService) {
        this.firebaseApp = firebaseApp;
        this.projectId = firebaseApp.getOptions().getProjectId();
        this.appContext = firebaseApp.getApplicationContext();
        this.firebasePerformance = firebasePerformance;
        this.firebaseInstallationsApi = firebaseInstallationsApi;
        this.flgTransportFactoryProvider = provider;
        this.configResolver = configResolver;
        this.rateLimiter = rateLimiter;
        this.appStateMonitor = appStateMonitor;
        this.flgTransport = flgTransport;
        this.executorService = executorService;
        this.cacheMap.put(KEY_AVAILABLE_TRACES_FOR_CACHING, 50);
        this.cacheMap.put(KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING, 50);
        this.cacheMap.put(KEY_AVAILABLE_GAUGES_FOR_CACHING, 50);
        finishInitialization();
    }

    public boolean isInitialized() {
        return this.isTransportInitialized.get();
    }

    public void log(TraceMetric traceMetric) {
        log(traceMetric, ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN);
    }

    @Override // com.google.firebase.perf.application.AppStateMonitor.AppStateCallback
    public void onUpdateAppState(ApplicationProcessState applicationProcessState) {
        this.isForegroundState = applicationProcessState == ApplicationProcessState.FOREGROUND;
        if (isInitialized()) {
            this.executorService.execute(new a(this, 0));
        }
    }

    @VisibleForTesting
    public void setInitialized(boolean z3) {
        this.isTransportInitialized.set(z3);
    }

    public void log(TraceMetric traceMetric, ApplicationProcessState applicationProcessState) {
        this.executorService.execute(new j(this, 15, traceMetric, applicationProcessState));
    }

    public void log(NetworkRequestMetric networkRequestMetric) {
        log(networkRequestMetric, ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN);
    }

    public void log(NetworkRequestMetric networkRequestMetric, ApplicationProcessState applicationProcessState) {
        this.executorService.execute(new j(this, 16, networkRequestMetric, applicationProcessState));
    }

    public void log(GaugeMetric gaugeMetric) {
        log(gaugeMetric, ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN);
    }

    public void log(GaugeMetric gaugeMetric, ApplicationProcessState applicationProcessState) {
        this.executorService.execute(new j(this, 14, gaugeMetric, applicationProcessState));
    }

    private static String getLogcatMsg(TraceMetric traceMetric) {
        long durationUs = traceMetric.getDurationUs();
        Locale locale = Locale.ENGLISH;
        return G.q("trace metric: ", traceMetric.getName(), " (duration: ", new DecimalFormat("#.####").format(durationUs / 1000.0d), "ms)");
    }

    private static String getLogcatMsg(NetworkRequestMetric networkRequestMetric) {
        String strValueOf;
        long timeToResponseCompletedUs = networkRequestMetric.hasTimeToResponseCompletedUs() ? networkRequestMetric.getTimeToResponseCompletedUs() : 0L;
        if (networkRequestMetric.hasHttpResponseCode()) {
            strValueOf = String.valueOf(networkRequestMetric.getHttpResponseCode());
        } else {
            strValueOf = c.UNKNOWN_PROCESS_NAME;
        }
        Locale locale = Locale.ENGLISH;
        return G.r(F.f("network request trace: ", networkRequestMetric.getUrl(), " (responseCode: ", strValueOf, ", responseTime: "), new DecimalFormat("#.####").format(timeToResponseCompletedUs / 1000.0d), "ms)");
    }

    private static String getLogcatMsg(GaugeMetric gaugeMetric) {
        Locale locale = Locale.ENGLISH;
        boolean zHasGaugeMetadata = gaugeMetric.hasGaugeMetadata();
        int cpuMetricReadingsCount = gaugeMetric.getCpuMetricReadingsCount();
        int androidMemoryReadingsCount = gaugeMetric.getAndroidMemoryReadingsCount();
        StringBuilder sb2 = new StringBuilder("gauges (hasMetadata: ");
        sb2.append(zHasGaugeMetadata);
        sb2.append(", cpuGaugeCount: ");
        sb2.append(cpuMetricReadingsCount);
        sb2.append(", memoryGaugeCount: ");
        return G.n(androidMemoryReadingsCount, ")", sb2);
    }
}
