package Wf;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class u0 extends p015ag.r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10899e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(CoroutineContext coroutineContext, Continuation continuation, int i7) {
        super(continuation, coroutineContext);
        this.f10899e = i7;
    }

    @Override // Wf.n0
    public final boolean h(Throwable th) {
        switch (this.f10899e) {
            case 0:
                return false;
            default:
                if (th instanceof Zf.p) {
                    return true;
                }
                return d(th);
        }
    }
}
