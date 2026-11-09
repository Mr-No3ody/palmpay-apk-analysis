package kotlinx.coroutines.flow;

import B6.C0094p;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1888u implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f39224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ff.h f39225c;

    /* JADX WARN: Multi-variable type inference failed */
    public C1888u(Function2 function2, Flow flow) {
        this.f39223a = 0;
        this.f39225c = (Ff.h) function2;
        this.f39224b = flow;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v9, types: [Ff.h, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v11, types: [Ff.h, kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r2v14, types: [Ff.h, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [Ff.h, kotlin.jvm.functions.Function2] */
    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        C1887t c1887t;
        Throwable th;
        Zf.y yVar;
        C1888u c1888u;
        FlowCollector flowCollector2;
        Flow flow;
        C1889v c1889v;
        C1888u c1888u2;
        switch (this.f39223a) {
            case 0:
                if (continuation instanceof C1887t) {
                    c1887t = (C1887t) continuation;
                    int i7 = c1887t.f39218b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        c1887t.f39218b = i7 - Integer.MIN_VALUE;
                    } else {
                        c1887t = new C1887t(this, continuation);
                    }
                } else {
                    c1887t = new C1887t(this, continuation);
                }
                Object obj = c1887t.f39217a;
                Ef.a aVar = Ef.a.f2423a;
                int i10 = c1887t.f39218b;
                if (i10 == 0) {
                    androidx.camera.core.impl.utils.executor.g.M(obj);
                    Zf.y yVar2 = new Zf.y(flowCollector, c1887t.getContext());
                    try {
                        ?? r3 = this.f39225c;
                        c1887t.f39220d = this;
                        c1887t.f39221e = flowCollector;
                        c1887t.f39222f = yVar2;
                        c1887t.f39218b = 1;
                        if (r3.invoke(yVar2, c1887t) == aVar) {
                            return aVar;
                        }
                        c1888u = this;
                        flowCollector2 = flowCollector;
                        yVar = yVar2;
                        yVar.releaseIntercepted();
                        flow = c1888u.f39224b;
                        c1887t.f39220d = null;
                        c1887t.f39221e = null;
                        c1887t.f39222f = null;
                        c1887t.f39218b = 2;
                        if (flow.collect(flowCollector2, c1887t) == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        yVar = yVar2;
                        yVar.releaseIntercepted();
                        throw th;
                    }
                } else if (i10 == 1) {
                    yVar = c1887t.f39222f;
                    flowCollector2 = c1887t.f39221e;
                    c1888u = c1887t.f39220d;
                    try {
                        androidx.camera.core.impl.utils.executor.g.M(obj);
                        yVar.releaseIntercepted();
                        flow = c1888u.f39224b;
                        c1887t.f39220d = null;
                        c1887t.f39221e = null;
                        c1887t.f39222f = null;
                        c1887t.f39218b = 2;
                        if (flow.collect(flowCollector2, c1887t) == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        yVar.releaseIntercepted();
                        throw th;
                    }
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidx.camera.core.impl.utils.executor.g.M(obj);
                }
                return Unit.f38893a;
            case 1:
                if (continuation instanceof C1889v) {
                    c1889v = (C1889v) continuation;
                    int i11 = c1889v.f39227b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c1889v.f39227b = i11 - Integer.MIN_VALUE;
                    } else {
                        c1889v = new C1889v(this, continuation);
                    }
                } else {
                    c1889v = new C1889v(this, continuation);
                }
                Object objF = c1889v.f39226a;
                Object obj2 = Ef.a.f2423a;
                int i12 = c1889v.f39227b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        flowCollector = c1889v.f39230e;
                        c1888u2 = c1889v.f39229d;
                        androidx.camera.core.impl.utils.executor.g.M(objF);
                    } else {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        androidx.camera.core.impl.utils.executor.g.M(objF);
                    }
                    return Unit.f38893a;
                }
                androidx.camera.core.impl.utils.executor.g.M(objF);
                c1889v.f39229d = this;
                c1889v.f39230e = flowCollector;
                c1889v.f39227b = 1;
                objF = X.f(this.f39224b, flowCollector, c1889v);
                if (objF == obj2) {
                    return obj2;
                }
                c1888u2 = this;
                Throwable th4 = (Throwable) objF;
                if (th4 != null) {
                    ?? r10 = c1888u2.f39225c;
                    c1889v.f39229d = null;
                    c1889v.f39230e = null;
                    c1889v.f39227b = 2;
                    if (r10.invoke(flowCollector, th4, c1889v) == obj2) {
                        return obj2;
                    }
                }
                return Unit.f38893a;
            case 2:
                Object objCollect = this.f39224b.collect(new C0094p(new kotlin.jvm.internal.B(), flowCollector, this.f39225c), continuation);
                return objCollect == Ef.a.f2423a ? objCollect : Unit.f38893a;
            default:
                Object objCollect2 = this.f39224b.collect(new B6.W(flowCollector, this.f39225c), continuation);
                return objCollect2 == Ef.a.f2423a ? objCollect2 : Unit.f38893a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1888u(Flow flow, Function2 function2, int i7) {
        this.f39223a = i7;
        switch (i7) {
            case 3:
                this.f39224b = flow;
                this.f39225c = (Ff.h) function2;
                break;
            default:
                this.f39224b = flow;
                this.f39225c = (Ff.h) function2;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1888u(Flow flow, Function3 function3) {
        this.f39223a = 1;
        this.f39224b = flow;
        this.f39225c = (Ff.h) function3;
    }
}
