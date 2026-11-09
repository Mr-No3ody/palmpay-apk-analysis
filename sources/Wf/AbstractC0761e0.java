package Wf;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Incomplete;
import kotlinx.coroutines.Job;

/* JADX INFO: renamed from: Wf.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0761e0 extends p015ag.j implements DisposableHandle, Incomplete {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n0 f10848d;

    @Override // kotlinx.coroutines.DisposableHandle
    public final void dispose() {
        n0 n0VarF = f();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n0.f10888a;
            Object obj = atomicReferenceFieldUpdater.get(n0VarF);
            if (obj instanceof AbstractC0761e0) {
                if (obj != this) {
                    return;
                }
                L l5 = AbstractC0780y.f10918j;
                while (!atomicReferenceFieldUpdater.compareAndSet(n0VarF, obj, l5)) {
                    if (atomicReferenceFieldUpdater.get(n0VarF) != obj) {
                    }
                }
                return;
            }
            if (!(obj instanceof Incomplete) || ((Incomplete) obj).getList() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = p015ag.j.f11947a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof p015ag.p) {
                    p015ag.j jVar = ((p015ag.p) obj2).f11961a;
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                Intrinsics.f(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                p015ag.j jVar2 = (p015ag.j) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = p015ag.j.f11949c;
                p015ag.p pVar = (p015ag.p) atomicReferenceFieldUpdater3.get(jVar2);
                if (pVar == null) {
                    pVar = new p015ag.p(jVar2);
                    atomicReferenceFieldUpdater3.set(jVar2, pVar);
                }
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, pVar)) {
                        jVar2.b();
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj2);
            }
        }
    }

    public final n0 f() {
        n0 n0Var = this.f10848d;
        if (n0Var != null) {
            return n0Var;
        }
        Intrinsics.n("job");
        throw null;
    }

    public abstract boolean g();

    @Override // kotlinx.coroutines.Incomplete
    public final q0 getList() {
        return null;
    }

    public Job getParent() {
        return f();
    }

    public abstract void h(Throwable th);

    @Override // kotlinx.coroutines.Incomplete
    public final boolean isActive() {
        return true;
    }

    @Override // p015ag.j
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0780y.i(this) + "[job@" + AbstractC0780y.i(f()) + ']';
    }
}
