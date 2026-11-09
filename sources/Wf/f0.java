package Wf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends C0765i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n0 f10851j;

    public f0(n0 n0Var, Continuation continuation) {
        super(1, continuation);
        this.f10851j = n0Var;
    }

    @Override // Wf.C0765i
    public final Throwable l(n0 n0Var) {
        Throwable thB;
        n0 n0Var2 = this.f10851j;
        n0Var2.getClass();
        Object obj = n0.f10888a.get(n0Var2);
        if (!(obj instanceof h0) || (thB = ((h0) obj).b()) == null) {
            return obj instanceof C0771o ? ((C0771o) obj).f10891a : n0Var.getCancellationException();
        }
        return thB;
    }

    @Override // Wf.C0765i
    public final String r() {
        return "AwaitContinuation";
    }
}
