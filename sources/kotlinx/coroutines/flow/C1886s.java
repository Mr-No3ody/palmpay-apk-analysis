package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1886s implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Flow f39215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ff.h f39216b;

    /* JADX WARN: Multi-variable type inference failed */
    public C1886s(Flow flow, Function3 function3) {
        this.f39215a = flow;
        this.f39216b = (Ff.h) function3;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v4, types: [Ff.h, kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r9v6, types: [Ff.h, kotlin.jvm.functions.Function3] */
    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) throws Throwable {
        r rVar;
        C1886s c1886s;
        i0 i0Var;
        ?? r3;
        Zf.y yVar;
        Throwable th;
        Zf.y yVar2;
        ?? r10;
        if (continuation instanceof r) {
            rVar = (r) continuation;
            int i7 = rVar.f39211b;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                rVar.f39211b = i7 - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, continuation);
            }
        } else {
            rVar = new r(this, continuation);
        }
        Object obj = rVar.f39210a;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = rVar.f39211b;
        if (i10 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            try {
                Flow flow = this.f39215a;
                rVar.f39213d = this;
                rVar.f39214e = flowCollector;
                rVar.f39211b = 1;
                if (flow.collect(flowCollector, rVar) != aVar) {
                    c1886s = this;
                    yVar = new Zf.y(flowCollector, rVar.getContext());
                    r10 = c1886s.f39216b;
                    rVar.f39213d = yVar;
                    rVar.f39214e = null;
                    rVar.f39211b = 3;
                    if (r10.invoke(yVar, null, rVar) != aVar) {
                        yVar2 = yVar;
                        yVar2.releaseIntercepted();
                        return Unit.f38893a;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                c1886s = this;
                i0Var = new i0(th);
                r3 = c1886s.f39216b;
                rVar.f39213d = th;
                rVar.f39214e = null;
                rVar.f39211b = 2;
                if (X.b(i0Var, r3, th, rVar) == aVar) {
                    throw th;
                }
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                Throwable th3 = (Throwable) rVar.f39213d;
                androidx.camera.core.impl.utils.executor.g.M(obj);
                throw th3;
            }
            if (i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yVar2 = (Zf.y) rVar.f39213d;
            try {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                yVar2.releaseIntercepted();
                return Unit.f38893a;
            } catch (Throwable th4) {
                th = th4;
                yVar2.releaseIntercepted();
                throw th;
            }
        }
        flowCollector = rVar.f39214e;
        c1886s = (C1886s) rVar.f39213d;
        try {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            yVar = new Zf.y(flowCollector, rVar.getContext());
            try {
                r10 = c1886s.f39216b;
                rVar.f39213d = yVar;
                rVar.f39214e = null;
                rVar.f39211b = 3;
                if (r10.invoke(yVar, null, rVar) != aVar) {
                    yVar2 = yVar;
                    yVar2.releaseIntercepted();
                    return Unit.f38893a;
                }
            } catch (Throwable th5) {
                th = th5;
                yVar2 = yVar;
                yVar2.releaseIntercepted();
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            i0Var = new i0(th);
            r3 = c1886s.f39216b;
            rVar.f39213d = th;
            rVar.f39214e = null;
            rVar.f39211b = 2;
            if (X.b(i0Var, r3, th, rVar) == aVar) {
                throw th;
            }
        }
        return aVar;
    }
}
