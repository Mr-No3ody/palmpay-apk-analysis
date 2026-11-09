package Zf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f11770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f11771d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, FlowCollector flowCollector, Continuation continuation) {
        super(2, continuation);
        this.f11770c = oVar;
        this.f11771d = flowCollector;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        n nVar = new n(this.f11770c, this.f11771d, continuation);
        nVar.f11769b = obj;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f11768a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f11769b;
            F f10 = new F();
            o oVar = this.f11770c;
            Flow flow = oVar.f11753d;
            m mVar = new m(f10, coroutineScope, oVar, this.f11771d);
            this.f11768a = 1;
            if (flow.collect(mVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        return Unit.f38893a;
    }
}
