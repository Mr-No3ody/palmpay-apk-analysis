package kotlinx.coroutines.flow;

import Wf.C0765i;
import Zf.AbstractC0806b;
import Zf.AbstractC0807c;
import Zf.AbstractC0808d;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends AbstractC0808d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f39173a = new AtomicReference(null);

    @Override // Zf.AbstractC0808d
    public final boolean a(AbstractC0806b abstractC0806b) {
        AtomicReference atomicReference = this.f39173a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(X.f39124b);
        return true;
    }

    @Override // Zf.AbstractC0808d
    public final Continuation[] b(AbstractC0806b abstractC0806b) {
        this.f39173a.set(null);
        return AbstractC0807c.f11736a;
    }

    public final Object c(f0 frame) {
        C0765i c0765i = new C0765i(1, Ef.f.b(frame));
        c0765i.initCancellability();
        AtomicReference atomicReference = this.f39173a;
        Pa.a0 a0Var = X.f39124b;
        while (!atomicReference.compareAndSet(a0Var, c0765i)) {
            if (atomicReference.get() != a0Var) {
                p355xf.o oVar = p355xf.q.f43977a;
                c0765i.resumeWith(Unit.f38893a);
                break;
            }
        }
        Object objM = c0765i.m();
        Ef.a aVar = Ef.a.f2423a;
        if (objM == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objM == aVar ? objM : Unit.f38893a;
    }
}
