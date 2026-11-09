package com.transsnet.palmpay.core.init;

import C0.G;
import F6.d;
import Fe.Z;
import Pa.T;
import Wf.AbstractC0780y;
import Xa.e;
import Xa.h;
import Xa.i;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.PowerManager;
import android.webkit.WebSettings;
import androidx.annotation.OptIn;
import androidx.camera.camera2.internal.F;
import androidx.webkit.StartUpLocation;
import androidx.webkit.WebViewCompat$ExperimentalAsyncStartUp;
import androidx.webkit.WebViewStartUpResult;
import androidx.webkit.j;
import androidx.webkit.k;
import com.alibaba.android.alpha.Task;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.metrics.Trace;
import com.palmpay.init.annotation.InitTask;
import com.palmpay.lib.webview.WebInit;
import com.palmpay.lib.webview.offline.OfflineConfig;
import com.palmpay.lib.webview.offline.OfflineParams;
import com.palmpay.lib.webview.offline.OfflineWebClient;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.util.DeviceUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.U;
import org.jetbrains.annotations.NotNull;
import p183m6.n;
import p355xf.l;

/* JADX INFO: loaded from: classes3.dex */
@InitTask(background = false, depends = {BaseInitTaskKt.LATE_INIT_PRELOAD_RN_TASK}, group = BaseInitTaskKt.GROUP_LATE_INIT, name = BaseInitTaskKt.LATE_INIT_WEB_VIEW_TASK)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\tH\u0003J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¨\u0006\u0019"}, d2 = {"Lcom/transsnet/palmpay/core/init/WebViewInitTask;", "Lcom/transsnet/palmpay/core/init/BaseInitTask;", "<init>", "()V", "getTask", "Lcom/alibaba/android/alpha/Task;", "application", "Landroid/app/Application;", "shouldSkipPreloadAndPrewarm", "", "dispatchPrewarm", "", "choosePrewarmStrategy", "Lcom/transsnet/palmpay/core/init/WebViewInitTask$PrewarmStrategy;", "isAsyncStartUpSupported", "context", "Landroid/content/Context;", "shouldSkipByRuntimeSignal", "prewarmWebViewPlanA", "runUiThreadStartUpTasks", "prewarmWebViewPlanB", "getTaskName", "", "initOfflineWebView", "PrewarmStrategy", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWebViewInitTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewInitTask.kt\ncom/transsnet/palmpay/core/init/WebViewInitTask\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,388:1\n1869#2,2:389\n1869#2,2:391\n*S KotlinDebug\n*F\n+ 1 WebViewInitTask.kt\ncom/transsnet/palmpay/core/init/WebViewInitTask\n*L\n257#1:389,2\n260#1:391,2\n*E\n"})
public final class WebViewInitTask extends BaseInitTask {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/core/init/WebViewInitTask$PrewarmStrategy;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "HALF", "FULL_ASYNC", "FULL_SYNC_FALLBACK", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum PrewarmStrategy {
        NONE,
        HALF,
        FULL_ASYNC,
        FULL_SYNC_FALLBACK;

        private static final /* synthetic */ EnumEntries $ENTRIES = com.facebook.imagepipeline.nativecode.b.n(values());

        @NotNull
        public static EnumEntries<PrewarmStrategy> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PrewarmStrategy.values().length];
            try {
                iArr[PrewarmStrategy.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrewarmStrategy.HALF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrewarmStrategy.FULL_ASYNC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrewarmStrategy.FULL_SYNC_FALLBACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final PrewarmStrategy choosePrewarmStrategy(Application application) {
        boolean zB = false;
        try {
            zB = n.f39523a.instance().b("featureWebViewPrewarmEnable", false);
        } catch (Exception unused) {
        }
        if (!zB) {
            d.h(BaseInitTask.TAG, 3, "prewarm skipped: remote toggle off");
            return PrewarmStrategy.NONE;
        }
        if (shouldSkipByRuntimeSignal(application)) {
            d.h(BaseInitTask.TAG, 3, "prewarm skipped: runtime signal");
            return PrewarmStrategy.NONE;
        }
        DeviceUtils.LEVEL deviceLevel = DeviceUtils.getDeviceLevel(application);
        boolean zIsAsyncStartUpSupported = isAsyncStartUpSupported(application);
        if (deviceLevel == DeviceUtils.LEVEL.BEST) {
            if (zIsAsyncStartUpSupported) {
                return PrewarmStrategy.FULL_ASYNC;
            }
            d.h(BaseInitTask.TAG, 3, "prewarm fallback: async startup unsupported");
            return PrewarmStrategy.FULL_SYNC_FALLBACK;
        }
        if (deviceLevel == DeviceUtils.LEVEL.HIGH && zIsAsyncStartUpSupported) {
            return PrewarmStrategy.FULL_ASYNC;
        }
        return zIsAsyncStartUpSupported ? PrewarmStrategy.HALF : PrewarmStrategy.NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @OptIn(markerClass = {WebViewCompat$ExperimentalAsyncStartUp.class})
    public final void dispatchPrewarm(Application application) {
        PrewarmStrategy prewarmStrategyChoosePrewarmStrategy = choosePrewarmStrategy(application);
        d.h(BaseInitTask.TAG, 3, "dispatchPrewarm strategy=" + prewarmStrategyChoosePrewarmStrategy);
        int i7 = WhenMappings.$EnumSwitchMapping$0[prewarmStrategyChoosePrewarmStrategy.ordinal()];
        if (i7 != 1) {
            if (i7 == 2) {
                prewarmWebViewPlanA(application, false);
            } else if (i7 == 3) {
                prewarmWebViewPlanA(application, true);
            } else {
                if (i7 != 4) {
                    throw new l();
                }
                prewarmWebViewPlanB(application);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initOfflineWebView(Context context) {
        OfflineConfig offlineConfigBuild = new OfflineConfig.Builder(true).build();
        U httpClient = BaseApplication.get().getHttpClient();
        OfflineParams offlineParamsMonitor = new OfflineParams().executorServiceProvider(new com.palmpay.lib.bridgewrapper.photo.upload.a(17)).config(offlineConfigBuild).monitor(new com.palmpay.lib.bridgewrapper.photo.upload.a(18));
        Intrinsics.e(httpClient);
        OfflineWebClient.init(context, offlineParamsMonitor.downloader(new CustomDownloader(httpClient)).requestServer(new CustomOfflineRequest(httpClient)).preloadServer(new CustomPreloadServer(httpClient)).isDebug(false));
        WebInit.init(context, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExecutorService initOfflineWebView$lambda$5() {
        return T.b(-4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOfflineWebView$lambda$6(String str, HashMap map, HashMap map2) {
        Trace traceNewTrace = FirebasePerformance.getInstance().newTrace(str);
        Intrinsics.checkNotNullExpressionValue(traceNewTrace, "newTrace(...)");
        traceNewTrace.start();
        Intrinsics.e(map);
        for (Map.Entry entry : map.entrySet()) {
            traceNewTrace.putAttribute((String) entry.getKey(), entry.getValue().toString());
        }
        Intrinsics.e(map2);
        for (Map.Entry entry2 : map2.entrySet()) {
            String str2 = (String) entry2.getKey();
            Object value = entry2.getValue();
            Intrinsics.f(value, "null cannot be cast to non-null type kotlin.Long");
            traceNewTrace.putMetric(str2, ((Long) value).longValue());
        }
        traceNewTrace.stop();
    }

    private final boolean isAsyncStartUpSupported(Context context) {
        try {
            return k.b(context, "STARTUP_FEATURE_SET_UI_THREAD_STARTUP_MODE_V2") || k.b(context, "STARTUP_FEATURE_SET_UI_THREAD_STARTUP_MODE");
        } catch (Throwable th) {
            d.c(BaseInitTask.TAG, "isAsyncStartUpSupported", th);
            return false;
        }
    }

    @OptIn(markerClass = {WebViewCompat$ExperimentalAsyncStartUp.class})
    private final void prewarmWebViewPlanA(Application application, boolean runUiThreadStartUpTasks) {
        String str = runUiThreadStartUpTasks ? "full" : "half";
        try {
            ExecutorService executorServiceB = T.b(-4);
            androidx.webkit.l lVar = new androidx.webkit.l(runUiThreadStartUpTasks, executorServiceB);
            Z z3 = new Z(str, 2);
            WeakHashMap weakHashMap = j.f18330a;
            executorServiceB.execute(new androidx.emoji2.text.j(lVar, 1, z3, application));
        } catch (Throwable th) {
            d.c(BaseInitTask.TAG, "prewarmWebViewPlanA", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prewarmWebViewPlanA$lambda$2(String str, WebViewStartUpResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        d.h(BaseInitTask.TAG, 3, "WebViewStartUpCallback(" + str + ") " + result.getTotalTimeInUiThreadMillis() + " " + result.getMaxTimePerTaskInUiThreadMillis());
        List<StartUpLocation> uiThreadBlockingStartUpLocations = result.getUiThreadBlockingStartUpLocations();
        if (uiThreadBlockingStartUpLocations != null) {
            Iterator<T> it = uiThreadBlockingStartUpLocations.iterator();
            while (it.hasNext()) {
                d.h(BaseInitTask.TAG, 3, G.p("uiThreadBlockingStartUpLocations(", str, ") ", ((StartUpLocation) it.next()).getStackInformation()));
            }
        }
        List<StartUpLocation> nonUiThreadBlockingStartUpLocations = result.getNonUiThreadBlockingStartUpLocations();
        if (nonUiThreadBlockingStartUpLocations != null) {
            Iterator<T> it2 = nonUiThreadBlockingStartUpLocations.iterator();
            while (it2.hasNext()) {
                d.h(BaseInitTask.TAG, 3, G.p("nonUiThreadBlockingStartUpLocations(", str, ") ", ((StartUpLocation) it2.next()).getStackInformation()));
            }
        }
    }

    private final void prewarmWebViewPlanB(final Application application) {
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.transsnet.palmpay.core.init.c
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                return WebViewInitTask.prewarmWebViewPlanB$lambda$4(application);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean prewarmWebViewPlanB$lambda$4(Application application) {
        T.b(-4).execute(new com.transsnet.adsdk.widgets.banner.bannerview.b(application, 3));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prewarmWebViewPlanB$lambda$4$lambda$3(Application application) {
        WebSettings.getDefaultUserAgent(application.getApplicationContext());
    }

    private final boolean shouldSkipByRuntimeSignal(Context context) {
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager != null) {
            if (activityManager.isLowRamDevice()) {
                return true;
            }
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            if (memoryInfo.lowMemory) {
                return true;
            }
            long j6 = memoryInfo.totalMem;
            if (j6 > 0 && memoryInfo.availMem / j6 < 0.18d) {
                return true;
            }
        }
        Object systemService2 = context.getSystemService("power");
        PowerManager powerManager = systemService2 instanceof PowerManager ? (PowerManager) systemService2 : null;
        if (powerManager == null) {
            return false;
        }
        if (powerManager.isPowerSaveMode()) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 29 && powerManager.getCurrentThermalStatus() >= 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldSkipPreloadAndPrewarm() {
        int i7 = Build.VERSION.SDK_INT;
        return i7 == 31 || i7 == 32 || i7 == 34;
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public Task getTask(@NotNull final Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new Task(getTaskName()) { // from class: com.transsnet.palmpay.core.init.WebViewInitTask.getTask.1
            @Override // com.alibaba.android.alpha.Task
            public void run() {
                BaseInitTask.beginSection$default(WebViewInitTask.this, null, 1, null);
                if (BaseApplication.isFirebaseInitialized()) {
                    WebViewInitTask.this.initOfflineWebView(application);
                }
                if (WebViewInitTask.this.shouldSkipPreloadAndPrewarm()) {
                    d.h(BaseInitTask.TAG, 3, F.c(Build.VERSION.SDK_INT, "preload/prewarm skipped: sdk=", " (Android 12/14)"));
                } else {
                    List urls = com.transsnet.palmpay.core.config.d.o();
                    List paths = com.transsnet.palmpay.core.config.d.n();
                    d.h("WebPerfBenchmark", 3, "remote preload paths=" + paths + " urls=" + urls);
                    if (paths != null) {
                        if (paths.isEmpty()) {
                            paths = null;
                        }
                        if (paths != null) {
                            Application context = application;
                            i iVar = i.f11106a;
                            Intrinsics.checkNotNullParameter(context, "context");
                            Intrinsics.checkNotNullParameter(paths, "paths");
                            if (!paths.isEmpty()) {
                                AbstractC0780y.m(i.f11107b, null, null, new e(paths, context.getApplicationContext(), null), 3);
                            }
                        }
                    }
                    if (urls != null) {
                        if (urls.isEmpty()) {
                            urls = null;
                        }
                        if (urls != null) {
                            Application context2 = application;
                            i iVar2 = i.f11106a;
                            Intrinsics.checkNotNullParameter(context2, "context");
                            Intrinsics.checkNotNullParameter(urls, "urls");
                            if (!urls.isEmpty()) {
                                AbstractC0780y.m(i.f11107b, null, null, new h(urls, context2.getApplicationContext(), null), 3);
                            }
                        }
                    }
                    WebViewInitTask.this.dispatchPrewarm(application);
                }
                BaseInitTask.endSection$default(WebViewInitTask.this, null, 1, null);
            }
        };
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public String getTaskName() {
        return BaseInitTaskKt.LATE_INIT_WEB_VIEW_TASK;
    }
}
