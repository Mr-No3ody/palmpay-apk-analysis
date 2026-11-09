package W0;

import V0.C;
import V0.C0684c;
import V0.C0689h;
import V0.Q;
import android.content.Context;
import android.text.TextUtils;
import androidx.camera.core.impl.utils.futures.i;
import androidx.work.impl.C1271d;
import androidx.work.impl.C1275h;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Scheduler;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.constraints.m;
import androidx.work.impl.constraints.trackers.k;
import androidx.work.impl.model.e;
import androidx.work.impl.utils.j;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;
import p140j8.f;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Scheduler, OnConstraintsStateChangedListener, ExecutionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10354a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f10356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10357d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1271d f10360g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p279s5.d f10361i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0684c f10362j;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Boolean f10364p;
    public final F1.b t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TaskExecutor f10365v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f10366w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f10355b = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f10358e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final StartStopTokens f10359f = StartStopTokens.create();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final HashMap f10363o = new HashMap();

    static {
        C.d("GreedyScheduler");
    }

    public c(Context context, C0684c c0684c, k kVar, C1271d c1271d, p279s5.d dVar, TaskExecutor taskExecutor) {
        this.f10354a = context;
        p045d3.k kVar2 = c0684c.f9926g;
        this.f10356c = new a(this, kVar2, c0684c.f9923d);
        this.f10366w = new d(kVar2, dVar);
        this.f10365v = taskExecutor;
        this.t = new F1.b(kVar);
        this.f10362j = c0684c;
        this.f10360g = c1271d;
        this.f10361i = dVar;
    }

    @Override // androidx.work.impl.Scheduler
    public final void cancel(String str) {
        Runnable runnable;
        if (this.f10364p == null) {
            this.f10364p = Boolean.valueOf(j.a(this.f10354a, this.f10362j));
        }
        if (!this.f10364p.booleanValue()) {
            C.c().getClass();
            return;
        }
        if (!this.f10357d) {
            this.f10360g.a(this);
            this.f10357d = true;
        }
        C.c().getClass();
        a aVar = this.f10356c;
        if (aVar != null && (runnable = (Runnable) aVar.f10351d.remove(str)) != null) {
            aVar.f10349b.cancel(runnable);
        }
        for (C1275h c1275h : this.f10359f.remove(str)) {
            this.f10366w.a(c1275h);
            this.f10361i.stopWork(c1275h);
        }
    }

    @Override // androidx.work.impl.Scheduler
    public final boolean hasLimitedSchedulingSlots() {
        return false;
    }

    @Override // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public final void onConstraintsStateChanged(androidx.work.impl.model.k kVar, androidx.work.impl.constraints.c cVar) {
        e eVarJ = f.j(kVar);
        boolean z3 = cVar instanceof androidx.work.impl.constraints.a;
        p279s5.d dVar = this.f10361i;
        d dVar2 = this.f10366w;
        StartStopTokens startStopTokens = this.f10359f;
        if (z3) {
            if (startStopTokens.contains(eVarJ)) {
                return;
            }
            C c6 = C.c();
            eVarJ.toString();
            c6.getClass();
            C1275h c1275h = startStopTokens.tokenFor(eVarJ);
            dVar2.b(c1275h);
            dVar.startWork(c1275h);
            return;
        }
        C c10 = C.c();
        eVarJ.toString();
        c10.getClass();
        C1275h c1275hRemove = startStopTokens.remove(eVarJ);
        if (c1275hRemove != null) {
            dVar2.a(c1275hRemove);
            dVar.stopWorkWithReason(c1275hRemove, ((androidx.work.impl.constraints.b) cVar).f18471a);
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public final void onExecuted(e eVar, boolean z3) {
        Job job;
        C1275h c1275hRemove = this.f10359f.remove(eVar);
        if (c1275hRemove != null) {
            this.f10366w.a(c1275hRemove);
        }
        synchronized (this.f10358e) {
            job = (Job) this.f10355b.remove(eVar);
        }
        if (job != null) {
            C c6 = C.c();
            Objects.toString(eVar);
            c6.getClass();
            job.cancel((CancellationException) null);
        }
        if (z3) {
            return;
        }
        synchronized (this.f10358e) {
            this.f10363o.remove(eVar);
        }
    }

    @Override // androidx.work.impl.Scheduler
    public final void schedule(androidx.work.impl.model.k... kVarArr) {
        long jMax;
        if (this.f10364p == null) {
            this.f10364p = Boolean.valueOf(j.a(this.f10354a, this.f10362j));
        }
        if (!this.f10364p.booleanValue()) {
            C.c().getClass();
            return;
        }
        if (!this.f10357d) {
            this.f10360g.a(this);
            this.f10357d = true;
        }
        HashSet<androidx.work.impl.model.k> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (androidx.work.impl.model.k kVar : kVarArr) {
            if (!this.f10359f.contains(f.j(kVar))) {
                synchronized (this.f10358e) {
                    try {
                        e eVarJ = f.j(kVar);
                        b bVar = (b) this.f10363o.get(eVarJ);
                        if (bVar == null) {
                            int i7 = kVar.f18622k;
                            this.f10362j.f9923d.getClass();
                            bVar = new b(i7, System.currentTimeMillis());
                            this.f10363o.put(eVarJ, bVar);
                        }
                        jMax = (((long) Math.max((kVar.f18622k - bVar.f10352a) - 5, 0)) * 30000) + bVar.f10353b;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                long jMax2 = Math.max(kVar.a(), jMax);
                this.f10362j.f9923d.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (kVar.f18613b == Q.f9885a) {
                    if (jCurrentTimeMillis < jMax2) {
                        a aVar = this.f10356c;
                        if (aVar != null) {
                            HashMap map = aVar.f10351d;
                            Runnable runnable = (Runnable) map.remove(kVar.f18612a);
                            p045d3.k kVar2 = aVar.f10349b;
                            if (runnable != null) {
                                kVar2.cancel(runnable);
                            }
                            i iVar = new i(aVar, 19, kVar, false);
                            map.put(kVar.f18612a, iVar);
                            aVar.f10350c.getClass();
                            kVar2.scheduleWithDelay(jMax2 - System.currentTimeMillis(), iVar);
                        }
                    } else if (kVar.c()) {
                        C0689h c0689h = kVar.f18621j;
                        if (c0689h.f9943d) {
                            C c6 = C.c();
                            kVar.toString();
                            c6.getClass();
                        } else if (c0689h.f9948i.isEmpty()) {
                            hashSet.add(kVar);
                            hashSet2.add(kVar.f18612a);
                        } else {
                            C c10 = C.c();
                            kVar.toString();
                            c10.getClass();
                        }
                    } else if (!this.f10359f.contains(f.j(kVar))) {
                        C.c().getClass();
                        C1275h c1275h = this.f10359f.tokenFor(kVar);
                        this.f10366w.b(c1275h);
                        this.f10361i.startWork(c1275h);
                    }
                }
            }
        }
        synchronized (this.f10358e) {
            try {
                if (!hashSet.isEmpty()) {
                    TextUtils.join(",", hashSet2);
                    C.c().getClass();
                    for (androidx.work.impl.model.k kVar3 : hashSet) {
                        e eVarJ2 = f.j(kVar3);
                        if (!this.f10355b.containsKey(eVarJ2)) {
                            this.f10355b.put(eVarJ2, m.a(this.t, kVar3, this.f10365v.getTaskCoroutineDispatcher(), this));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
