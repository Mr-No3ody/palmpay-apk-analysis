package androidx.work.impl;

import C0.C0129v;
import E.AbstractC0198c;
import V0.AbstractC0703w;
import V0.C0684c;
import V0.C0697p;
import V0.M;
import V0.U;
import Wf.AbstractC0774s;
import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.work.Configuration$Provider;
import androidx.work.Operation;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C1878j;
import kotlinx.coroutines.flow.C1888u;
import kotlinx.coroutines.flow.X;

/* JADX INFO: loaded from: classes.dex */
public final class s extends U {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static s f18672l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static s f18673m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Object f18674n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f18675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0684c f18676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WorkDatabase f18677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.work.impl.utils.taskexecutor.a f18678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f18679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1271d f18680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p1.c f18681h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18682i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f18683j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.work.impl.constraints.trackers.k f18684k;

    static {
        V0.C.d("WorkManagerImpl");
        f18672l = null;
        f18673m = null;
        f18674n = new Object();
    }

    public s(Context context, final C0684c configuration, androidx.work.impl.utils.taskexecutor.a taskExecutor, final WorkDatabase db2, final List list, C1271d c1271d, androidx.work.impl.constraints.trackers.k kVar) {
        Context appContext = context.getApplicationContext();
        if (appContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        V0.C c6 = new V0.C(configuration.f9929j);
        synchronized (V0.C.f9860b) {
            try {
                if (V0.C.f9861c == null) {
                    V0.C.f9861c = c6;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f18675b = appContext;
        this.f18678e = taskExecutor;
        this.f18677d = db2;
        this.f18680g = c1271d;
        this.f18684k = kVar;
        this.f18676c = configuration;
        this.f18679f = list;
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        AbstractC0774s abstractC0774s = taskExecutor.f18728b;
        Intrinsics.checkNotNullExpressionValue(abstractC0774s, "taskExecutor.taskCoroutineDispatcher");
        p015ag.c cVarA = AbstractC0777v.a(abstractC0774s);
        this.f18681h = new p1.c(db2, 16);
        final androidx.work.impl.utils.k kVar2 = taskExecutor.f18727a;
        int i7 = AbstractC1274g.f18562a;
        c1271d.a(new ExecutionListener() { // from class: androidx.work.impl.f
            @Override // androidx.work.impl.ExecutionListener
            public final void onExecuted(androidx.work.impl.model.e eVar, boolean z3) {
                kVar2.execute(new Da.g(list, eVar, configuration, db2, 11));
            }
        });
        taskExecutor.executeOnTaskThread(new androidx.work.impl.utils.d(appContext, this));
        String str = m.f18572a;
        Intrinsics.checkNotNullParameter(cVarA, "<this>");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(db2, "db");
        if (androidx.work.impl.utils.j.a(appContext, configuration)) {
            AbstractC0780y.m(cVarA, null, null, new C1878j(new C1888u(X.i(X.e(new androidx.slidingpanelayout.widget.b(db2.h().hasUnfinishedWorkFlow(), new C1278k(4, null), 1), -1)), new l(appContext, null), 3), null), 3);
        }
    }

    public static s f() {
        synchronized (f18674n) {
            try {
                s sVar = f18672l;
                if (sVar != null) {
                    return sVar;
                }
                return f18673m;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static s g(Context context) {
        s sVarF;
        synchronized (f18674n) {
            try {
                sVarF = f();
                if (sVarF == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (!(applicationContext instanceof Configuration$Provider)) {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                    h(applicationContext, ((Configuration$Provider) applicationContext).getWorkManagerConfiguration());
                    sVarF = g(applicationContext);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVarF;
    }

    public static void h(Context context, C0684c c0684c) {
        synchronized (f18674n) {
            try {
                s sVar = f18672l;
                if (sVar != null && f18673m != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (sVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f18673m == null) {
                        f18673m = u.a(applicationContext, c0684c);
                    }
                    f18672l = f18673m;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // V0.U
    public final p1.d a() {
        Intrinsics.checkNotNullParameter("PeriodWakeUpWorker", "tag");
        Intrinsics.checkNotNullParameter(this, "workManagerImpl");
        C0697p c0697p = this.f18676c.f9934o;
        androidx.work.impl.utils.k kVar = this.f18678e.f18727a;
        Intrinsics.checkNotNullExpressionValue(kVar, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return p002a.a.q(c0697p, "CancelWorkByTag_PeriodWakeUpWorker", kVar, new androidx.work.impl.utils.b(this, 1));
    }

    @Override // V0.U
    public final p1.d b() {
        Intrinsics.checkNotNullParameter("PeriodWakeUpWorker", "name");
        Intrinsics.checkNotNullParameter(this, "workManagerImpl");
        C0697p c0697p = this.f18676c.f9934o;
        androidx.work.impl.utils.k kVar = this.f18678e.f18727a;
        Intrinsics.checkNotNullExpressionValue(kVar, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return p002a.a.q(c0697p, "CancelWorkByName_PeriodWakeUpWorker", kVar, new androidx.work.impl.utils.b(this, 0));
    }

    @Override // V0.U
    public final Operation c(M workRequest) {
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter("PeriodWakeUpWorker", "name");
        Intrinsics.checkNotNullParameter(workRequest, "workRequest");
        C0697p c0697p = this.f18676c.f9934o;
        androidx.work.impl.utils.k kVar = this.f18678e.f18727a;
        Intrinsics.checkNotNullExpressionValue(kVar, "workTaskExecutor.serialTaskExecutor");
        return p002a.a.q(c0697p, "enqueueUniquePeriodic_PeriodWakeUpWorker", kVar, new x(this, workRequest));
    }

    @Override // V0.U
    public final androidx.concurrent.futures.m e(String tag) {
        WorkDatabase workDatabase = this.f18677d;
        Intrinsics.checkNotNullParameter(workDatabase, "<this>");
        androidx.work.impl.utils.taskexecutor.a executor = this.f18678e;
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(tag, "tag");
        C0129v c0129v = new C0129v(tag, 2);
        androidx.work.impl.utils.k kVar = executor.f18727a;
        Intrinsics.checkNotNullExpressionValue(kVar, "executor.serialTaskExecutor");
        return AbstractC0703w.a(kVar, "loadStatusFuture", new E0.h(3, c0129v, workDatabase));
    }

    public final void i() {
        synchronized (f18674n) {
            try {
                this.f18682i = true;
                BroadcastReceiver.PendingResult pendingResult = this.f18683j;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f18683j = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        C0697p c0697p = this.f18676c.f9934o;
        X6.c block = new X6.c(this, 7);
        Intrinsics.checkNotNullParameter(c0697p, "<this>");
        Intrinsics.checkNotNullParameter("ReschedulingWork", Constants.ScionAnalytics.PARAM_LABEL);
        Intrinsics.checkNotNullParameter(block, "block");
        c0697p.getClass();
        boolean zJ = AbstractC0198c.J();
        if (zJ) {
            try {
                Intrinsics.checkNotNullParameter("ReschedulingWork", Constants.ScionAnalytics.PARAM_LABEL);
                AbstractC0198c.e("ReschedulingWork");
            } finally {
                if (zJ) {
                    Trace.endSection();
                }
            }
        }
        block.invoke();
    }
}
