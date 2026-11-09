package androidx.work.impl.background.systemalarm;

import C0.G;
import V0.C;
import Wf.AbstractC0774s;
import Wf.t0;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.C1275h;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.constraints.trackers.k;
import androidx.work.impl.utils.WorkTimer$TimeLimitExceededListener;
import androidx.work.impl.utils.m;
import androidx.work.impl.utils.t;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.u;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class f implements OnConstraintsStateChangedListener, WorkTimer$TimeLimitExceededListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.work.impl.model.e f18427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f18428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F1.b f18429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f18430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18431g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SerialExecutor f18432i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Executor f18433j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PowerManager.WakeLock f18434o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f18435p;
    public final C1275h t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AbstractC0774s f18436v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile t0 f18437w;

    static {
        C.d("DelayMetCommandHandler");
    }

    public f(Context context, int i7, h hVar, C1275h c1275h) {
        this.f18425a = context;
        this.f18426b = i7;
        this.f18428d = hVar;
        this.f18427c = c1275h.f18563a;
        this.t = c1275h;
        k kVar = hVar.f18444e.f18684k;
        androidx.work.impl.utils.taskexecutor.a aVar = hVar.f18441b;
        this.f18432i = aVar.f18727a;
        this.f18433j = aVar.f18730d;
        this.f18436v = aVar.f18728b;
        this.f18429e = new F1.b(kVar);
        this.f18435p = false;
        this.f18431g = 0;
        this.f18430f = new Object();
    }

    public static void a(f fVar) {
        androidx.work.impl.model.e eVar = fVar.f18427c;
        String str = eVar.f18587a;
        if (fVar.f18431g >= 2) {
            C.c().getClass();
            return;
        }
        fVar.f18431g = 2;
        C.c().getClass();
        Context context = fVar.f18425a;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        b.c(intent, eVar);
        h hVar = fVar.f18428d;
        int i7 = fVar.f18426b;
        F6.a aVar = new F6.a(hVar, intent, i7, 3);
        Executor executor = fVar.f18433j;
        executor.execute(aVar);
        if (!hVar.f18443d.e(eVar.f18587a)) {
            C.c().getClass();
            return;
        }
        C.c().getClass();
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        b.c(intent2, eVar);
        executor.execute(new F6.a(hVar, intent2, i7, 3));
    }

    public static void b(f fVar) {
        if (fVar.f18431g != 0) {
            C c6 = C.c();
            Objects.toString(fVar.f18427c);
            c6.getClass();
            return;
        }
        fVar.f18431g = 1;
        C c10 = C.c();
        Objects.toString(fVar.f18427c);
        c10.getClass();
        if (!fVar.f18428d.f18443d.g(fVar.t, null)) {
            fVar.c();
            return;
        }
        u uVar = fVar.f18428d.f18442c;
        androidx.work.impl.model.e eVar = fVar.f18427c;
        synchronized (uVar.f18734d) {
            C c11 = C.c();
            Objects.toString(eVar);
            c11.getClass();
            uVar.a(eVar);
            t tVar = new t(uVar, eVar);
            uVar.f18732b.put(eVar, tVar);
            uVar.f18733c.put(eVar, fVar);
            uVar.f18731a.scheduleWithDelay(600000L, tVar);
        }
    }

    public final void c() {
        synchronized (this.f18430f) {
            try {
                if (this.f18437w != null) {
                    this.f18437w.cancel((CancellationException) null);
                }
                this.f18428d.f18442c.a(this.f18427c);
                PowerManager.WakeLock wakeLock = this.f18434o;
                if (wakeLock != null && wakeLock.isHeld()) {
                    C c6 = C.c();
                    Objects.toString(this.f18434o);
                    Objects.toString(this.f18427c);
                    c6.getClass();
                    this.f18434o.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        String str = this.f18427c.f18587a;
        Context context = this.f18425a;
        StringBuilder sbT = G.t(str, " (");
        sbT.append(this.f18426b);
        sbT.append(")");
        this.f18434o = m.a(context, sbT.toString());
        C c6 = C.c();
        Objects.toString(this.f18434o);
        c6.getClass();
        this.f18434o.acquire();
        androidx.work.impl.model.k workSpec = this.f18428d.f18444e.f18677d.h().getWorkSpec(str);
        if (workSpec == null) {
            this.f18432i.execute(new e(this, 0));
            return;
        }
        boolean zC = workSpec.c();
        this.f18435p = zC;
        if (zC) {
            this.f18437w = androidx.work.impl.constraints.m.a(this.f18429e, workSpec, this.f18436v, this);
        } else {
            C.c().getClass();
            this.f18432i.execute(new e(this, 1));
        }
    }

    public final void e(boolean z3) {
        C c6 = C.c();
        androidx.work.impl.model.e eVar = this.f18427c;
        Objects.toString(eVar);
        c6.getClass();
        c();
        int i7 = this.f18426b;
        h hVar = this.f18428d;
        Executor executor = this.f18433j;
        Context context = this.f18425a;
        if (z3) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            b.c(intent, eVar);
            executor.execute(new F6.a(hVar, intent, i7, 3));
        }
        if (this.f18435p) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            executor.execute(new F6.a(hVar, intent2, i7, 3));
        }
    }

    @Override // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public final void onConstraintsStateChanged(androidx.work.impl.model.k kVar, androidx.work.impl.constraints.c cVar) {
        boolean z3 = cVar instanceof androidx.work.impl.constraints.a;
        SerialExecutor serialExecutor = this.f18432i;
        if (z3) {
            serialExecutor.execute(new e(this, 1));
        } else {
            serialExecutor.execute(new e(this, 0));
        }
    }

    @Override // androidx.work.impl.utils.WorkTimer$TimeLimitExceededListener
    public final void onTimeLimitExceeded(androidx.work.impl.model.e eVar) {
        C c6 = C.c();
        Objects.toString(eVar);
        c6.getClass();
        this.f18432i.execute(new e(this, 0));
    }
}
