package com.transsnet.palmpay.core.init;

import Pa.AbstractC0520q;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.V;
import android.app.Application;
import android.os.Process;
import android.util.Log;
import com.alibaba.android.alpha.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.perf.FirebasePerformance;
import com.palmpay.init.annotation.InitTask;
import com.palmpay.lib.apm.startup.AppStartupPerfTracker;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p015ag.o;
import p042cg.f;

/* JADX INFO: loaded from: classes3.dex */
@InitTask(background = true, name = BaseInitTaskKt.TASK_FIREBASE_INIT)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/core/init/FirebaseInitTask;", "Lcom/transsnet/palmpay/core/init/BaseInitTask;", "<init>", "()V", "getTaskName", "", "getTask", "Lcom/alibaba/android/alpha/Task;", "application", "Landroid/app/Application;", "Companion", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FirebaseInitTask extends BaseInitTask {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static volatile boolean ready;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0007J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0005H\u0007J\b\u0010\f\u001a\u00020\bH\u0007J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/core/init/FirebaseInitTask$Companion;", "", "<init>", "()V", "ready", "", "isReady", "initFirebase", "", "application", "Landroid/app/Application;", "enableNonEssentialCollection", "enableNonEssentialCollectionForMainProcess", "disableAnalyticsCollectionIfNeeded", "disablePerformanceCollectionIfNeeded", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void disableAnalyticsCollectionIfNeeded(Application application) {
            if (AbstractC0520q.f7145k) {
                try {
                    FirebaseAnalytics.getInstance(application).setAnalyticsCollectionEnabled(false);
                } catch (Exception unused) {
                }
            }
        }

        private final void disablePerformanceCollectionIfNeeded() {
            if (AbstractC0520q.f7145k) {
                try {
                    FirebasePerformance.getInstance().setPerformanceCollectionEnabled(false);
                } catch (Exception unused) {
                }
            }
        }

        public static /* synthetic */ void initFirebase$default(Companion companion, Application application, boolean z3, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                z3 = false;
            }
            companion.initFirebase(application, z3);
        }

        @JvmStatic
        public final void enableNonEssentialCollectionForMainProcess() {
            try {
                FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(true);
            } catch (Exception unused) {
            }
            if (AbstractC0520q.f7145k) {
                return;
            }
            try {
                FirebasePerformance.getInstance().setPerformanceCollectionEnabled(true);
            } catch (Exception unused2) {
            }
        }

        @JvmStatic
        @JvmOverloads
        public final void initFirebase(@NotNull Application application) {
            Intrinsics.checkNotNullParameter(application, "application");
            initFirebase$default(this, application, false, 2, null);
        }

        @JvmStatic
        public final boolean isReady() {
            return FirebaseInitTask.ready;
        }

        private Companion() {
        }

        @JvmStatic
        @JvmOverloads
        public final void initFirebase(@NotNull Application application, boolean enableNonEssentialCollection) {
            Intrinsics.checkNotNullParameter(application, "application");
            try {
                FirebaseOptions.Builder builder = new FirebaseOptions.Builder();
                builder.setApplicationId("1:1018069716389:android:4d171525bd0697d6");
                builder.setApiKey("AIzaSyDmRr8cZu7Ss23atlyIYI7StHP27ec26oo");
                builder.setDatabaseUrl("https://palmpay-nigeria.firebaseio.com");
                builder.setGcmSenderId("1018069716389");
                builder.setStorageBucket("palmpay-nigeria.appspot.com");
                builder.setProjectId("palmpay-nigeria");
                builder.setGaTrackingId(null);
                FirebaseApp.initializeApp(application, builder.build());
                disableAnalyticsCollectionIfNeeded(application);
                if (enableNonEssentialCollection) {
                    disablePerformanceCollectionIfNeeded();
                    enableNonEssentialCollectionForMainProcess();
                }
            } finally {
                FirebaseInitTask.ready = true;
            }
        }
    }

    @JvmStatic
    public static final void enableNonEssentialCollectionForMainProcess() {
        INSTANCE.enableNonEssentialCollectionForMainProcess();
    }

    @JvmStatic
    @JvmOverloads
    public static final void initFirebase(@NotNull Application application) {
        INSTANCE.initFirebase(application);
    }

    @JvmStatic
    public static final boolean isReady() {
        return INSTANCE.isReady();
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public Task getTask(@NotNull final Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new Task(getTaskName()) { // from class: com.transsnet.palmpay.core.init.FirebaseInitTask.getTask.1
            @Override // com.alibaba.android.alpha.Task
            public void run() {
                Process.setThreadPriority(-2);
                BaseInitTask.beginSection$default(FirebaseInitTask.this, null, 1, null);
                try {
                    if (!AbstractC0520q.a()) {
                        Log.e(BaseInitTask.TAG, "initFirebase in sub thread");
                        FirebaseInitTask.INSTANCE.initFirebase(application, true);
                        AppStartupPerfTracker.onFirebaseReady();
                    }
                } catch (Exception unused) {
                }
                G8.a.F(application);
                application.registerActivityLifecycleCallbacks(p115ha.b.f37362a);
                V v3 = V.f10828a;
                f fVar = I.f10809a;
                AbstractC0780y.m(v3, o.f11960a, null, new FirebaseInitTask$getTask$1$run$1(application, null), 2);
                BaseInitTask.endSection$default(FirebaseInitTask.this, null, 1, null);
                Process.setThreadPriority(0);
            }
        };
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public String getTaskName() {
        return BaseInitTaskKt.TASK_FIREBASE_INIT;
    }

    @JvmStatic
    @JvmOverloads
    public static final void initFirebase(@NotNull Application application, boolean z3) {
        INSTANCE.initFirebase(application, z3);
    }
}
