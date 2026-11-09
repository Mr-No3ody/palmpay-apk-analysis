package p015ag;

import Ef.f;
import Wf.AbstractC0752a;
import Wf.AbstractC0780y;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* JADX INFO: loaded from: classes4.dex */
public class r extends AbstractC0752a implements CoroutineStackFrame {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Continuation f11962d;

    public r(Continuation continuation, CoroutineContext coroutineContext) {
        super(coroutineContext, true);
        this.f11962d = continuation;
    }

    @Override // Wf.n0
    public void a(Object obj) {
        a.g(AbstractC0780y.n(obj), f.b(this.f11962d));
    }

    @Override // Wf.n0
    public void b(Object obj) {
        this.f11962d.resumeWith(AbstractC0780y.n(obj));
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f11962d;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // Wf.n0
    public final boolean u() {
        return true;
    }

    public void M() {
    }
}
