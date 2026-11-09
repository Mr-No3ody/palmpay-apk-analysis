package com.palmpay.lib.apm.startup;

import C0.G;
import Pa.RunnableC0527y;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.camera.camera2.internal.F;
import androidx.camera.core.impl.utils.executor.g;
import androidx.camera.video.u;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.metrics.Trace;
import com.palmpay.lib.apm.LibApm;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p125i6.a;
import p355xf.o;
import p355xf.p;
import p355xf.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u00018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010\u0003J\u000f\u0010#\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010\u0003J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0011H\u0002¢\u0006\u0004\b%\u0010\u0014R\u0014\u0010&\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010)\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010*R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00102R\u0016\u00104\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010*R\u0016\u00105\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00106R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00106R\u0016\u0010<\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00106R\u0016\u0010=\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010*R\u0016\u0010>\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010*R\u0016\u0010?\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010*R\u0018\u0010@\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010'R\u0018\u0010A\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010'R\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010DR\u0016\u0010G\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010'¨\u0006H"}, d2 = {"Lcom/palmpay/lib/apm/startup/AppStartupPerfTracker;", "", "<init>", "()V", "", "markApplicationStart", "Landroid/app/Activity;", "activity", "onActivityCreated", "(Landroid/app/Activity;)V", "onIgnoreActivityResumed", "onActivityResumed", "onActivityDestroyed", "onFirebaseReady", "scheduleReport", "postReportOnIdle", "reportToFirebase", "", "reason", "invalidate", "(Ljava/lang/String;)V", "terminate", "", "isSessionCollecting", "()Z", "", "nanos", "nanosToMs", "(J)J", "scheduleSplashCreateResumeTimeout", "cancelSplashCreateResumeTimeout", "scheduleFullStartupTimeout", "cancelFullStartupTimeout", "scheduleFirebaseWaitTimeout", "cancelFirebaseWaitTimeout", "cancelAllTimeouts", "message", "logDebug", "TAG", "Ljava/lang/String;", "TRACE_NAME", "ACTIVITY_CREATE_RESUME_TIMEOUT_MS", "J", "FULL_STARTUP_TIMEOUT_MS", "FIREBASE_READY_WAIT_TIMEOUT_MS", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasReported", "Ljava/util/concurrent/atomic/AtomicBoolean;", "reportScheduled", "appStartNanos", "sessionActive", "Z", "sessionInvalidated", "Li6/a;", "splashPending", "Li6/a;", "terminated", "firstActResumed", "appToFirstActCreateMs", "firstActCreateToResumeMs", "appToFirstActResumeMs", "splashActivityName", "ignoreActivityName", "Ljava/lang/Runnable;", "splashCreateResumeTimeout", "Ljava/lang/Runnable;", "fullStartupTimeout", "firebaseWaitTimeout", "launchType", "apm_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppStartupPerfTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppStartupPerfTracker.kt\ncom/palmpay/lib/apm/startup/AppStartupPerfTracker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,393:1\n1#2:394\n*E\n"})
public final class AppStartupPerfTracker {
    private static final long ACTIVITY_CREATE_RESUME_TIMEOUT_MS = 10000;
    private static final long FIREBASE_READY_WAIT_TIMEOUT_MS = 60000;
    private static final long FULL_STARTUP_TIMEOUT_MS = 30000;

    @NotNull
    private static final String TAG = "AppStartupPerf";

    @NotNull
    private static final String TRACE_NAME = "app_startup_v1";
    private static volatile long appStartNanos;

    @Nullable
    private static Runnable firebaseWaitTimeout;
    private static volatile boolean firstActResumed;

    @Nullable
    private static Runnable fullStartupTimeout;

    @Nullable
    private static String ignoreActivityName;
    private static volatile boolean sessionActive;
    private static volatile boolean sessionInvalidated;

    @Nullable
    private static String splashActivityName;

    @Nullable
    private static Runnable splashCreateResumeTimeout;

    @Nullable
    private static a splashPending;
    private static volatile boolean terminated;

    @NotNull
    public static final AppStartupPerfTracker INSTANCE = new AppStartupPerfTracker();

    @NotNull
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());

    @NotNull
    private static final AtomicBoolean hasReported = new AtomicBoolean(false);

    @NotNull
    private static final AtomicBoolean reportScheduled = new AtomicBoolean(false);
    private static long appToFirstActCreateMs = -1;
    private static long firstActCreateToResumeMs = -1;
    private static long appToFirstActResumeMs = -1;

    @NotNull
    private static String launchType = "normal";

    private AppStartupPerfTracker() {
    }

    private final void cancelAllTimeouts() {
        cancelSplashCreateResumeTimeout();
        cancelFullStartupTimeout();
        cancelFirebaseWaitTimeout();
    }

    private final void cancelFirebaseWaitTimeout() {
        Runnable runnable = firebaseWaitTimeout;
        if (runnable != null) {
            mainHandler.removeCallbacks(runnable);
        }
        firebaseWaitTimeout = null;
    }

    private final void cancelFullStartupTimeout() {
        Runnable runnable = fullStartupTimeout;
        if (runnable != null) {
            mainHandler.removeCallbacks(runnable);
        }
        fullStartupTimeout = null;
    }

    private final void cancelSplashCreateResumeTimeout() {
        Runnable runnable = splashCreateResumeTimeout;
        if (runnable != null) {
            mainHandler.removeCallbacks(runnable);
        }
        splashCreateResumeTimeout = null;
    }

    private final void invalidate(String reason) {
        if (sessionInvalidated) {
            return;
        }
        sessionInvalidated = true;
        cancelAllTimeouts();
        splashPending = null;
        logDebug(G.o("invalidate: ", reason));
        terminate();
    }

    private final boolean isSessionCollecting() {
        return sessionActive && !sessionInvalidated && appStartNanos > 0;
    }

    private final void logDebug(String message) {
        LibApm.INSTANCE.getDebug();
    }

    @JvmStatic
    public static final void markApplicationStart() {
        if (appStartNanos > 0) {
            return;
        }
        appStartNanos = SystemClock.elapsedRealtimeNanos();
        sessionActive = true;
        launchType = LibApm.INSTANCE.checkAndMarkLaunchType();
        INSTANCE.scheduleFullStartupTimeout();
    }

    private final long nanosToMs(long nanos) {
        long j6 = nanos / 1000000;
        if (j6 < 0) {
            return 0L;
        }
        return j6;
    }

    @JvmStatic
    public static final void onActivityCreated(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        AppStartupPerfTracker appStartupPerfTracker = INSTANCE;
        if (appStartupPerfTracker.isSessionCollecting()) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            if (firstActResumed || splashPending != null) {
                return;
            }
            String simpleName = activity.getClass().getSimpleName();
            splashActivityName = simpleName;
            appToFirstActCreateMs = appStartupPerfTracker.nanosToMs(jElapsedRealtimeNanos - appStartNanos);
            splashPending = new a(simpleName, jElapsedRealtimeNanos);
            appStartupPerfTracker.scheduleSplashCreateResumeTimeout();
        }
    }

    @JvmStatic
    public static final void onActivityDestroyed(@NotNull Activity activity) {
        a aVar;
        Intrinsics.checkNotNullParameter(activity, "activity");
        AppStartupPerfTracker appStartupPerfTracker = INSTANCE;
        if (appStartupPerfTracker.isSessionCollecting() && (aVar = splashPending) != null && Intrinsics.c(aVar.f37426a, activity.getClass().getSimpleName()) && !firstActResumed) {
            appStartupPerfTracker.invalidate("activity_destroyed_before_resume");
        }
    }

    @JvmStatic
    public static final void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        AppStartupPerfTracker appStartupPerfTracker = INSTANCE;
        if (appStartupPerfTracker.isSessionCollecting() && !firstActResumed) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            a aVar = splashPending;
            if (aVar == null || !Intrinsics.c(aVar.f37426a, activity.getClass().getSimpleName())) {
                appStartupPerfTracker.invalidate("resume_without_create");
                return;
            }
            long jNanosToMs = appStartupPerfTracker.nanosToMs(jElapsedRealtimeNanos - aVar.f37427b);
            if (jNanosToMs > 10000) {
                appStartupPerfTracker.invalidate("create_resume_too_slow");
                return;
            }
            firstActCreateToResumeMs = jNanosToMs;
            long jNanosToMs2 = appStartupPerfTracker.nanosToMs(jElapsedRealtimeNanos - appStartNanos);
            appToFirstActResumeMs = jNanosToMs2;
            if (jNanosToMs2 > FULL_STARTUP_TIMEOUT_MS) {
                appStartupPerfTracker.invalidate("delayed_start");
                return;
            }
            firstActResumed = true;
            splashPending = null;
            appStartupPerfTracker.cancelSplashCreateResumeTimeout();
            appStartupPerfTracker.scheduleReport();
        }
    }

    @JvmStatic
    public static final void onFirebaseReady() {
        mainHandler.post(new RunnableC0527y(11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFirebaseReady$lambda$1() {
        if (!reportScheduled.get() || hasReported.get() || !firstActResumed || sessionInvalidated) {
            return;
        }
        AppStartupPerfTracker appStartupPerfTracker = INSTANCE;
        appStartupPerfTracker.cancelFirebaseWaitTimeout();
        appStartupPerfTracker.postReportOnIdle();
    }

    @JvmStatic
    public static final void onIgnoreActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (INSTANCE.isSessionCollecting() && !firstActResumed) {
            ignoreActivityName = activity.getClass().getSimpleName();
        }
    }

    private final void postReportOnIdle() {
        mainHandler.post(new RunnableC0527y(12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postReportOnIdle$lambda$2() {
        if (sessionInvalidated || hasReported.get()) {
            return;
        }
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.palmpay.lib.apm.startup.AppStartupPerfTracker$postReportOnIdle$1$1
            @Override // android.os.MessageQueue.IdleHandler
            public boolean queueIdle() {
                AppStartupPerfTracker.INSTANCE.reportToFirebase();
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportToFirebase() {
        Object objF;
        AtomicBoolean atomicBoolean = hasReported;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (sessionInvalidated || !firstActResumed) {
                atomicBoolean.set(false);
                return;
            }
            long j6 = appToFirstActCreateMs;
            long j10 = firstActCreateToResumeMs;
            long j11 = appToFirstActResumeMs;
            String splashActivity = splashActivityName;
            if (splashActivity == null) {
                splashActivity = "";
            }
            String str = ignoreActivityName;
            Intrinsics.checkNotNullParameter(splashActivity, "splashActivity");
            try {
                o oVar = q.f43977a;
                Trace traceNewTrace = FirebasePerformance.getInstance().newTrace(TRACE_NAME);
                Intrinsics.checkNotNullExpressionValue(traceNewTrace, "newTrace(...)");
                traceNewTrace.start();
                traceNewTrace.putMetric("appCreateTime", j6);
                traceNewTrace.putMetric("activityTime", j10);
                traceNewTrace.putMetric("appStartTime", j11);
                traceNewTrace.putAttribute("Activity", splashActivity);
                if (!TextUtils.isEmpty(str)) {
                    Intrinsics.e(str);
                    traceNewTrace.putAttribute("ignoreActivity", str);
                }
                traceNewTrace.putAttribute("launchType", launchType);
                traceNewTrace.stop();
                objF = Unit.f38893a;
            } catch (Throwable th) {
                o oVar2 = q.f43977a;
                objF = g.f(th);
            }
            if (!(objF instanceof p)) {
                AppStartupPerfTracker appStartupPerfTracker = INSTANCE;
                StringBuilder sbR = u.r(j6, "report ok appCreateTime=", " activityTime=");
                sbR.append(j10);
                u.v(sbR, " appStartTime=", j11, " splash=");
                appStartupPerfTracker.logDebug(F.d(sbR, splashActivity, " ignoreActivity=", str));
            }
            Throwable thA = q.a(objF);
            if (thA != null) {
                hasReported.set(true);
                INSTANCE.logDebug(G.o("report failed: ", thA.getMessage()));
            }
            terminate();
        }
    }

    private final void scheduleFirebaseWaitTimeout() {
        cancelFirebaseWaitTimeout();
        RunnableC0527y runnableC0527y = new RunnableC0527y(13);
        firebaseWaitTimeout = runnableC0527y;
        mainHandler.postDelayed(runnableC0527y, FIREBASE_READY_WAIT_TIMEOUT_MS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleFirebaseWaitTimeout$lambda$10() {
        if (hasReported.get() || !reportScheduled.get()) {
            return;
        }
        AppStartupPerfTracker appStartupPerfTracker = INSTANCE;
        appStartupPerfTracker.logDebug("firebase wait timeout, drop report");
        appStartupPerfTracker.invalidate("firebase_wait_timeout");
    }

    private final void scheduleFullStartupTimeout() {
        cancelFullStartupTimeout();
        RunnableC0527y runnableC0527y = new RunnableC0527y(14);
        fullStartupTimeout = runnableC0527y;
        mainHandler.postDelayed(runnableC0527y, FULL_STARTUP_TIMEOUT_MS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleFullStartupTimeout$lambda$8() {
        AppStartupPerfTracker appStartupPerfTracker = INSTANCE;
        if (!appStartupPerfTracker.isSessionCollecting() || hasReported.get() || firstActResumed) {
            return;
        }
        appStartupPerfTracker.invalidate("no_splash_resume");
    }

    private final void scheduleReport() {
        if (sessionInvalidated || hasReported.get() || !reportScheduled.compareAndSet(false, true)) {
            return;
        }
        cancelFullStartupTimeout();
        if (LibApm.INSTANCE.isFirebaseInitialized()) {
            postReportOnIdle();
        } else {
            scheduleFirebaseWaitTimeout();
        }
    }

    private final void scheduleSplashCreateResumeTimeout() {
        cancelSplashCreateResumeTimeout();
        RunnableC0527y runnableC0527y = new RunnableC0527y(15);
        splashCreateResumeTimeout = runnableC0527y;
        mainHandler.postDelayed(runnableC0527y, 10000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleSplashCreateResumeTimeout$lambda$6() {
        AppStartupPerfTracker appStartupPerfTracker = INSTANCE;
        if (!appStartupPerfTracker.isSessionCollecting() || firstActResumed || splashPending == null) {
            return;
        }
        appStartupPerfTracker.invalidate("create_resume_timeout");
    }

    private final void terminate() {
        if (terminated) {
            return;
        }
        terminated = true;
        LibApm.INSTANCE.unregisterLifecycleCallback();
    }
}
