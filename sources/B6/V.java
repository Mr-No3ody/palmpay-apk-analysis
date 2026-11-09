package B6;

import com.palmpay.lib.liveness.model.LiveIDException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class V extends Ff.h implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f425a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f428d;

    public /* synthetic */ V(int i7, Continuation continuation) {
        super(i7, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FlowCollector flowCollector = (FlowCollector) obj;
        switch (this.f425a) {
            case 0:
                V v3 = new V((b0) this.f428d, (Continuation) obj3);
                v3.f427c = (Throwable) obj2;
                return v3.invokeSuspend(Unit.f38893a);
            default:
                V v4 = new V(3, (Continuation) obj3);
                v4.f427c = flowCollector;
                v4.f428d = (Object[]) obj2;
                return v4.invokeSuspend(Unit.f38893a);
        }
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        androidx.work.impl.constraints.c cVar;
        androidx.work.impl.constraints.c cVar2;
        switch (this.f425a) {
            case 0:
                Ef.a aVar = Ef.a.f2423a;
                int i7 = this.f426b;
                if (i7 == 0) {
                    androidx.camera.core.impl.utils.executor.g.M(obj);
                    ((Throwable) this.f427c).printStackTrace();
                    p232p6.p.f41245l.detectError();
                    Yf.n nVar = ((b0) this.f428d).f461p;
                    D6.f fVar = D6.f.f1631p;
                    A a3 = new A(new LiveIDException(fVar.f1633a, fVar.f1634b, null, null, 12, null));
                    this.f426b = 1;
                    if (nVar.send(a3, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidx.camera.core.impl.utils.executor.g.M(obj);
                }
                return Unit.f38893a;
            default:
                Ef.a aVar2 = Ef.a.f2423a;
                int i10 = this.f426b;
                if (i10 == 0) {
                    androidx.camera.core.impl.utils.executor.g.M(obj);
                    FlowCollector flowCollector = (FlowCollector) this.f427c;
                    androidx.work.impl.constraints.c[] cVarArr = (androidx.work.impl.constraints.c[]) ((Object[]) this.f428d);
                    int length = cVarArr.length;
                    int i11 = 0;
                    while (true) {
                        cVar = androidx.work.impl.constraints.a.f18470a;
                        if (i11 < length) {
                            cVar2 = cVarArr[i11];
                            if (Intrinsics.c(cVar2, cVar)) {
                                i11++;
                            }
                        } else {
                            cVar2 = null;
                        }
                    }
                    if (cVar2 != null) {
                        cVar = cVar2;
                    }
                    this.f426b = 1;
                    if (flowCollector.emit(cVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidx.camera.core.impl.utils.executor.g.M(obj);
                }
                return Unit.f38893a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(b0 b0Var, Continuation continuation) {
        super(3, continuation);
        this.f428d = b0Var;
    }
}
