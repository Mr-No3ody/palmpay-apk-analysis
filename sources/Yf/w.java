package Yf;

import Pa.a0;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Waiter;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends p015ag.s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f11450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f11451f;

    public w(long j6, w wVar, n nVar, int i7) {
        super(j6, wVar, i7);
        this.f11450e = nVar;
        this.f11451f = new AtomicReferenceArray(p.f11423b * 2);
    }

    @Override // p015ag.s
    public final int f() {
        return p.f11423b;
    }

    @Override // p015ag.s
    public final void g(int i7, CoroutineContext coroutineContext) {
        n nVar;
        int i10 = p.f11423b;
        boolean z3 = i7 >= i10;
        if (z3) {
            i7 -= i10;
        }
        this.f11451f.get(i7 * 2);
        while (true) {
            Object objK = k(i7);
            boolean z8 = objK instanceof Waiter;
            nVar = this.f11450e;
            if (z8 || (objK instanceof G)) {
                if (j(i7, objK, z3 ? p.f11431j : p.f11432k)) {
                    m(i7, null);
                    l(i7, !z3);
                    if (z3) {
                        Intrinsics.e(nVar);
                        return;
                    }
                    return;
                }
            } else {
                if (objK == p.f11431j || objK == p.f11432k) {
                    break;
                }
                if (objK != p.f11428g && objK != p.f11427f) {
                    if (objK == p.f11430i || objK == p.f11425d || objK == p.f11433l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objK).toString());
                }
            }
        }
        m(i7, null);
        if (z3) {
            Intrinsics.e(nVar);
        }
    }

    public final boolean j(int i7, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f11451f;
        int i10 = (i7 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
            if (atomicReferenceArray.get(i10) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i7) {
        return this.f11451f.get((i7 * 2) + 1);
    }

    public final void l(int i7, boolean z3) {
        if (z3) {
            n nVar = this.f11450e;
            Intrinsics.e(nVar);
            nVar.D((this.f11964c * ((long) p.f11423b)) + ((long) i7));
        }
        h();
    }

    public final void m(int i7, Object obj) {
        this.f11451f.set(i7 * 2, obj);
    }

    public final void n(int i7, a0 a0Var) {
        this.f11451f.set((i7 * 2) + 1, a0Var);
    }
}
