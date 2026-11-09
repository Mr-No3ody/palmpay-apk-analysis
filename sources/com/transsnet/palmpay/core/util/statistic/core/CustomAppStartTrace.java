package com.transsnet.palmpay.core.util.statistic.core;

import N8.q0;
import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.Process;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.EnumC1203m;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.M;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.firebase.StartupTime;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.util.FirstDrawDoneListener;
import com.google.firebase.perf.util.PreDrawListener;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.TraceMetric;
import com.google.firebase.provider.FirebaseInitProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class CustomAppStartTrace implements Application.ActivityLifecycleCallbacks, LifecycleObserver {
    private static final int CORE_POOL_SIZE = 0;
    private static final int MAX_POOL_SIZE = 1;
    private static final String TAG = "CustomAppStartTrace";
    private static ExecutorService executorService;
    private static volatile CustomAppStartTrace instance;
    private Context appContext;
    private WeakReference<Activity> appStartActivity;
    private final Clock clock;
    private final TraceMetric.Builder experimentTtid;

    @Nullable
    private final Timer firebaseClassLoadTime;
    private WeakReference<Activity> launchActivity;

    @Nullable
    private final Timer processStartTime;

    @NonNull
    private static final Timer PERF_CLASS_LOAD_TIME = new Clock().getTime();
    private static final long MAX_LATENCY_BEFORE_UI_INIT = TimeUnit.MINUTES.toMicros(1);
    private boolean isRegisteredForLifecycleCallbacks = false;
    private boolean isTooLateToInitUI = false;
    private Timer onCreateTime = null;
    private Timer onStartTime = null;
    private Timer onResumeTime = null;
    private Timer firstForegroundTime = null;

    @Nullable
    private Timer firstBackgroundTime = null;
    private Timer preDrawPostTime = null;
    private Timer preDrawPostAtFrontOfQueueTime = null;
    private Timer onDrawPostAtFrontOfQueueTime = null;
    private boolean isStartedFromBackground = false;
    private int onDrawCount = 0;
    private final DrawCounter onDrawCounterListener = new DrawCounter(this, 0);
    private boolean systemForegroundCheck = false;

    public final class DrawCounter implements ViewTreeObserver.OnDrawListener {
        public /* synthetic */ DrawCounter(CustomAppStartTrace customAppStartTrace, int i7) {
            this();
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            CustomAppStartTrace.this.onDrawCount++;
        }

        private DrawCounter() {
        }
    }

    public static class StartFromBackgroundRunnable implements Runnable {
        private final CustomAppStartTrace trace;

        public StartFromBackgroundRunnable(final CustomAppStartTrace trace) {
            this.trace = trace;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.trace.onCreateTime == null) {
                this.trace.isStartedFromBackground = true;
            }
        }
    }

    public CustomAppStartTrace(@NonNull Clock clock, @NonNull ExecutorService executorService2) {
        this.clock = clock;
        executorService = executorService2;
        this.experimentTtid = TraceMetric.newBuilder().setName("_experiment_app_start_ttid");
        this.processStartTime = Timer.ofElapsedRealtime(Process.getStartElapsedRealtime());
        StartupTime startupTime = FirebaseInitProvider.getStartupTime();
        this.firebaseClassLoadTime = startupTime != null ? Timer.ofElapsedRealtime(startupTime.getElapsedRealtime()) : null;
    }

    @NonNull
    private Timer getClassLoadTimeCompat() {
        Timer timer = this.firebaseClassLoadTime;
        return timer != null ? timer : PERF_CLASS_LOAD_TIME;
    }

    public static CustomAppStartTrace getInstance() {
        return instance != null ? instance : getInstance(new Clock());
    }

    private boolean getIsExperimentTTIDEnabled() {
        return false;
    }

    @NonNull
    private Timer getStartTimerCompat() {
        Timer timer = this.processStartTime;
        return timer != null ? timer : getClassLoadTimeCompat();
    }

    public static boolean isAnyAppProcessInForeground(Context appContext) {
        ActivityManager activityManager = (ActivityManager) appContext.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = appContext.getPackageName();
        String strJ = q0.j(packageName, ":");
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(strJ))) {
                return true;
            }
        }
        return false;
    }

    public static boolean isScreenOn(Context appContext) {
        PowerManager powerManager = (PowerManager) appContext.getSystemService("power");
        if (powerManager == null) {
            return true;
        }
        return powerManager.isInteractive();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logAppStartTrace() {
        TraceMetric.Builder durationUs = TraceMetric.newBuilder().setName(Constants.TraceNames.APP_START_TRACE_NAME.toString()).setClientStartTimeUs(getClassLoadTimeCompat().getMicros()).setDurationUs(getClassLoadTimeCompat().getDurationMicros(this.onResumeTime));
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(TraceMetric.newBuilder().setName(Constants.TraceNames.ON_CREATE_TRACE_NAME.toString()).setClientStartTimeUs(getClassLoadTimeCompat().getMicros()).setDurationUs(getClassLoadTimeCompat().getDurationMicros(this.onCreateTime)).build());
        if (this.onStartTime != null) {
            TraceMetric.Builder builderNewBuilder = TraceMetric.newBuilder();
            builderNewBuilder.setName(Constants.TraceNames.ON_START_TRACE_NAME.toString()).setClientStartTimeUs(this.onCreateTime.getMicros()).setDurationUs(this.onCreateTime.getDurationMicros(this.onStartTime));
            arrayList.add(builderNewBuilder.build());
            TraceMetric.Builder builderNewBuilder2 = TraceMetric.newBuilder();
            builderNewBuilder2.setName(Constants.TraceNames.ON_RESUME_TRACE_NAME.toString()).setClientStartTimeUs(this.onStartTime.getMicros()).setDurationUs(this.onStartTime.getDurationMicros(this.onResumeTime));
            arrayList.add(builderNewBuilder2.build());
        }
        durationUs.addAllSubtraces(arrayList);
    }

    private void logExperimentTrace(TraceMetric.Builder metric) {
        if (this.preDrawPostTime == null || this.preDrawPostAtFrontOfQueueTime == null || this.onDrawPostAtFrontOfQueueTime == null) {
            return;
        }
        unregisterActivityLifecycleCallbacks();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recordOnDrawFrontOfQueue() {
        if (this.onDrawPostAtFrontOfQueueTime != null) {
            return;
        }
        this.onDrawPostAtFrontOfQueueTime = this.clock.getTime();
        this.experimentTtid.addSubtraces(TraceMetric.newBuilder().setName("_experiment_onDrawFoQ").setClientStartTimeUs(getStartTimerCompat().getMicros()).setDurationUs(getStartTimerCompat().getDurationMicros(this.onDrawPostAtFrontOfQueueTime)).build());
        if (this.processStartTime != null) {
            this.experimentTtid.addSubtraces(TraceMetric.newBuilder().setName("_experiment_procStart_to_classLoad").setClientStartTimeUs(getStartTimerCompat().getMicros()).setDurationUs(getStartTimerCompat().getDurationMicros(getClassLoadTimeCompat())).build());
        }
        this.experimentTtid.putCustomAttributes("systemDeterminedForeground", this.systemForegroundCheck ? "true" : "false");
        this.experimentTtid.putCounters("onDrawCount", this.onDrawCount);
        logExperimentTrace(this.experimentTtid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recordPreDraw() {
        if (this.preDrawPostTime != null) {
            return;
        }
        this.preDrawPostTime = this.clock.getTime();
        this.experimentTtid.setClientStartTimeUs(getStartTimerCompat().getMicros()).setDurationUs(getStartTimerCompat().getDurationMicros(this.preDrawPostTime));
        logExperimentTrace(this.experimentTtid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recordPreDrawFrontOfQueue() {
        if (this.preDrawPostAtFrontOfQueueTime != null) {
            return;
        }
        this.preDrawPostAtFrontOfQueueTime = this.clock.getTime();
        this.experimentTtid.addSubtraces(TraceMetric.newBuilder().setName("_experiment_preDrawFoQ").setClientStartTimeUs(getStartTimerCompat().getMicros()).setDurationUs(getStartTimerCompat().getDurationMicros(this.preDrawPostAtFrontOfQueueTime)).build());
        logExperimentTrace(this.experimentTtid);
    }

    @Nullable
    @VisibleForTesting
    public Activity getAppStartActivity() {
        return this.appStartActivity.get();
    }

    @Nullable
    @VisibleForTesting
    public Activity getLaunchActivity() {
        return this.launchActivity.get();
    }

    @VisibleForTesting
    public Timer getOnCreateTime() {
        return this.onCreateTime;
    }

    @VisibleForTesting
    public Timer getOnResumeTime() {
        return this.onResumeTime;
    }

    @VisibleForTesting
    public Timer getOnStartTime() {
        return this.onStartTime;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        try {
            if (!this.isStartedFromBackground && this.onCreateTime == null) {
                this.systemForegroundCheck = this.systemForegroundCheck || isAnyAppProcessInForeground(this.appContext);
                this.launchActivity = new WeakReference<>(activity);
                this.onCreateTime = this.clock.getTime();
                if (getStartTimerCompat().getDurationMicros(this.onCreateTime) > MAX_LATENCY_BEFORE_UI_INIT) {
                    this.isTooLateToInitUI = true;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        View viewFindViewById;
        if (this.isStartedFromBackground || this.isTooLateToInitUI || !getIsExperimentTTIDEnabled() || (viewFindViewById = activity.findViewById(R.id.content)) == null) {
            return;
        }
        viewFindViewById.getViewTreeObserver().removeOnDrawListener(this.onDrawCounterListener);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        View viewFindViewById;
        try {
            if (!this.isStartedFromBackground && !this.isTooLateToInitUI) {
                boolean isExperimentTTIDEnabled = getIsExperimentTTIDEnabled();
                if (isExperimentTTIDEnabled && (viewFindViewById = activity.findViewById(R.id.content)) != null) {
                    viewFindViewById.getViewTreeObserver().addOnDrawListener(this.onDrawCounterListener);
                    final int i7 = 0;
                    FirstDrawDoneListener.registerForNextDraw(viewFindViewById, new Runnable(this) { // from class: com.transsnet.palmpay.core.util.statistic.core.a

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ CustomAppStartTrace f28199b;

                        {
                            this.f28199b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i7) {
                                case 0:
                                    this.f28199b.recordOnDrawFrontOfQueue();
                                    break;
                                case 1:
                                    this.f28199b.recordPreDraw();
                                    break;
                                case 2:
                                    this.f28199b.recordPreDrawFrontOfQueue();
                                    break;
                                default:
                                    this.f28199b.logAppStartTrace();
                                    break;
                            }
                        }
                    });
                    final int i10 = 1;
                    final int i11 = 2;
                    PreDrawListener.registerForNextDraw(viewFindViewById, new Runnable(this) { // from class: com.transsnet.palmpay.core.util.statistic.core.a

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ CustomAppStartTrace f28199b;

                        {
                            this.f28199b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    this.f28199b.recordOnDrawFrontOfQueue();
                                    break;
                                case 1:
                                    this.f28199b.recordPreDraw();
                                    break;
                                case 2:
                                    this.f28199b.recordPreDrawFrontOfQueue();
                                    break;
                                default:
                                    this.f28199b.logAppStartTrace();
                                    break;
                            }
                        }
                    }, new Runnable(this) { // from class: com.transsnet.palmpay.core.util.statistic.core.a

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ CustomAppStartTrace f28199b;

                        {
                            this.f28199b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    this.f28199b.recordOnDrawFrontOfQueue();
                                    break;
                                case 1:
                                    this.f28199b.recordPreDraw();
                                    break;
                                case 2:
                                    this.f28199b.recordPreDrawFrontOfQueue();
                                    break;
                                default:
                                    this.f28199b.logAppStartTrace();
                                    break;
                            }
                        }
                    });
                }
                if (this.onResumeTime != null) {
                    return;
                }
                this.appStartActivity = new WeakReference<>(activity);
                this.onResumeTime = this.clock.getTime();
                activity.getClass();
                getClassLoadTimeCompat().getDurationMicros(this.onResumeTime);
                final int i12 = 3;
                executorService.execute(new Runnable(this) { // from class: com.transsnet.palmpay.core.util.statistic.core.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CustomAppStartTrace f28199b;

                    {
                        this.f28199b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                this.f28199b.recordOnDrawFrontOfQueue();
                                break;
                            case 1:
                                this.f28199b.recordPreDraw();
                                break;
                            case 2:
                                this.f28199b.recordPreDrawFrontOfQueue();
                                break;
                            default:
                                this.f28199b.logAppStartTrace();
                                break;
                        }
                    }
                });
                if (!isExperimentTTIDEnabled) {
                    unregisterActivityLifecycleCallbacks();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (!this.isStartedFromBackground && this.onStartTime == null && !this.isTooLateToInitUI) {
            this.onStartTime = this.clock.getTime();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Keep
    @OnLifecycleEvent(EnumC1203m.ON_STOP)
    public void onAppEnteredBackground() {
        if (this.isStartedFromBackground || this.isTooLateToInitUI || this.firstBackgroundTime != null) {
            return;
        }
        this.firstBackgroundTime = this.clock.getTime();
        this.experimentTtid.addSubtraces(TraceMetric.newBuilder().setName("_experiment_firstBackgrounding").setClientStartTimeUs(getStartTimerCompat().getMicros()).setDurationUs(getStartTimerCompat().getDurationMicros(this.firstBackgroundTime)).build());
    }

    @Keep
    @OnLifecycleEvent(EnumC1203m.ON_START)
    public void onAppEnteredForeground() {
        if (this.isStartedFromBackground || this.isTooLateToInitUI || this.firstForegroundTime != null) {
            return;
        }
        this.firstForegroundTime = this.clock.getTime();
        this.experimentTtid.addSubtraces(TraceMetric.newBuilder().setName("_experiment_firstForegrounding").setClientStartTimeUs(getStartTimerCompat().getMicros()).setDurationUs(getStartTimerCompat().getDurationMicros(this.firstForegroundTime)).build());
    }

    public synchronized void registerActivityLifecycleCallbacks(@NonNull Context context) {
        try {
            if (this.isRegisteredForLifecycleCallbacks) {
                return;
            }
            M.f17358j.get().getLifecycle().a(this);
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
                this.systemForegroundCheck = this.systemForegroundCheck || isAnyAppProcessInForeground(applicationContext);
                this.isRegisteredForLifecycleCallbacks = true;
                this.appContext = applicationContext;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @VisibleForTesting
    public void setIsStartFromBackground() {
        this.isStartedFromBackground = true;
    }

    public synchronized void unregisterActivityLifecycleCallbacks() {
        if (this.isRegisteredForLifecycleCallbacks) {
            M.f17358j.get().getLifecycle().b(this);
            ((Application) this.appContext).unregisterActivityLifecycleCallbacks(this);
            this.isRegisteredForLifecycleCallbacks = false;
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static CustomAppStartTrace getInstance(Clock clock) {
        if (instance == null) {
            synchronized (CustomAppStartTrace.class) {
                try {
                    if (instance == null) {
                        instance = new CustomAppStartTrace(clock, new ThreadPoolExecutor(0, 1, 10 + MAX_LATENCY_BEFORE_UI_INIT, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }
}
