package Wf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 extends t0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Continuation f10892d;

    public o0(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, false);
        this.f10892d = Ef.f.a(this, this, function2);
    }

    @Override // Wf.n0
    public final void B() throws Throwable {
        try {
            Continuation continuationB = Ef.f.b(this.f10892d);
            p355xf.o oVar = p355xf.q.f43977a;
            p015ag.a.g(Unit.f38893a, continuationB);
        } catch (Throwable th) {
            th = th;
            if (th instanceof E) {
                th = ((E) th).f10804a;
            }
            p355xf.o oVar2 = p355xf.q.f43977a;
            resumeWith(androidx.camera.core.impl.utils.executor.g.f(th));
            throw th;
        }
    }
}
