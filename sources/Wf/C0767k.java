package Wf;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Wf.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0767k extends AbstractC0761e0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0765i f10878f;

    public /* synthetic */ C0767k(C0765i c0765i, int i7) {
        this.f10877e = i7;
        this.f10878f = c0765i;
    }

    @Override // Wf.AbstractC0761e0
    public final boolean g() {
        switch (this.f10877e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // Wf.AbstractC0761e0
    public final void h(Throwable th) {
        C0765i c0765i = this.f10878f;
        switch (this.f10877e) {
            case 0:
                Throwable thL = c0765i.l(f());
                if (c0765i.p()) {
                    Continuation continuation = c0765i.f10866d;
                    Intrinsics.f(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
                    p015ag.f fVar = (p015ag.f) continuation;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p015ag.f.f11935i;
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        Pa.a0 a0Var = p015ag.a.f11929c;
                        if (Intrinsics.c(obj, a0Var)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, a0Var, thL)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != a0Var) {
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (true) {
                                if (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                    }
                                }
                            }
                        }
                    }
                }
                c0765i.cancel(thL);
                if (!c0765i.p()) {
                    c0765i.j();
                }
                break;
            default:
                p355xf.o oVar = p355xf.q.f43977a;
                c0765i.resumeWith(Unit.f38893a);
                break;
        }
    }
}
