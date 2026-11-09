package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class T implements Flow, CancellableFlow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ff.h f39104a;

    /* JADX WARN: Multi-variable type inference failed */
    public T(Function2 function2) {
        this.f39104a = (Ff.h) function2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [Ff.h, kotlin.jvm.functions.Function2] */
    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) throws Throwable {
        C1869a c1869a;
        Throwable th;
        Zf.y yVar;
        if (continuation instanceof C1869a) {
            c1869a = (C1869a) continuation;
            int i7 = c1869a.f39135d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c1869a.f39135d = i7 - Integer.MIN_VALUE;
            } else {
                c1869a = new C1869a(this, continuation);
            }
        } else {
            c1869a = new C1869a(this, continuation);
        }
        Object obj = c1869a.f39133b;
        Object obj2 = Ef.a.f2423a;
        int i10 = c1869a.f39135d;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yVar = c1869a.f39132a;
            try {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                yVar.releaseIntercepted();
                return Unit.f38893a;
            } catch (Throwable th2) {
                th = th2;
                yVar.releaseIntercepted();
                throw th;
            }
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        Zf.y yVar2 = new Zf.y(flowCollector, c1869a.getContext());
        try {
            c1869a.f39132a = yVar2;
            c1869a.f39135d = 1;
            Object objInvoke = this.f39104a.invoke(yVar2, c1869a);
            if (objInvoke != obj2) {
                objInvoke = Unit.f38893a;
            }
            if (objInvoke == obj2) {
                return obj2;
            }
            yVar = yVar2;
            yVar.releaseIntercepted();
            return Unit.f38893a;
        } catch (Throwable th3) {
            th = th3;
            yVar = yVar2;
            yVar.releaseIntercepted();
            throw th;
        }
    }
}
