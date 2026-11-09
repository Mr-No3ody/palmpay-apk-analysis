package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import p355xf.C2127f;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StateFlow f39145c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(StateFlow stateFlow, Continuation continuation) {
        super(2, continuation);
        this.f39145c = stateFlow;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        b0 b0Var = new b0(this.f39145c, continuation);
        b0Var.f39144b = obj;
        return b0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((b0) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
        return Ef.a.f2423a;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f39143a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            B6.W w3 = new B6.W(7, new kotlin.jvm.internal.B(), (FlowCollector) this.f39144b);
            this.f39143a = 1;
            if (this.f39145c.collect(w3, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        throw new C2127f();
    }
}
