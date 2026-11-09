package Zf;

import B6.C0094p;
import Wf.AbstractC0773q;
import Yf.EnumC0789a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Flow f11753d;

    public i(Flow flow, CoroutineContext coroutineContext, int i7, EnumC0789a enumC0789a) {
        super(coroutineContext, i7, enumC0789a);
        this.f11753d = flow;
    }

    @Override // Zf.g
    public final Object b(ProducerScope producerScope, Continuation continuation) {
        Object objF = f(new B(producerScope), continuation);
        return objF == Ef.a.f2423a ? objF : Unit.f38893a;
    }

    @Override // Zf.g, kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) throws Throwable {
        if (this.f11748b == -3) {
            CoroutineContext context = continuation.getContext();
            Boolean bool = Boolean.FALSE;
            Ab.y yVar = new Ab.y(8);
            CoroutineContext coroutineContext = this.f11747a;
            CoroutineContext coroutineContextPlus = !((Boolean) coroutineContext.fold(bool, yVar)).booleanValue() ? context.plus(coroutineContext) : AbstractC0773q.a(context, coroutineContext, false);
            if (Intrinsics.c(coroutineContextPlus, context)) {
                Object objF = f(flowCollector, continuation);
                return objF == Ef.a.f2423a ? objF : Unit.f38893a;
            }
            kotlin.coroutines.d dVar = ContinuationInterceptor.f38936l0;
            if (Intrinsics.c(coroutineContextPlus.get(dVar), context.get(dVar))) {
                CoroutineContext context2 = continuation.getContext();
                if (!(flowCollector instanceof B) && !(flowCollector instanceof x)) {
                    flowCollector = new C0094p(flowCollector, context2);
                }
                Object objB = AbstractC0807c.b(coroutineContextPlus, flowCollector, p015ag.v.b(coroutineContextPlus), new h(this, null), continuation);
                return objB == Ef.a.f2423a ? objB : Unit.f38893a;
            }
        }
        Object objCollect = super.collect(flowCollector, continuation);
        return objCollect == Ef.a.f2423a ? objCollect : Unit.f38893a;
    }

    public abstract Object f(FlowCollector flowCollector, Continuation continuation);

    @Override // Zf.g
    public final String toString() {
        return this.f11753d + " -> " + super.toString();
    }
}
