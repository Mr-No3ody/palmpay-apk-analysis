package Zf;

import Yf.EnumC0789a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends i {
    public j(Flow flow, CoroutineContext coroutineContext, int i7, EnumC0789a enumC0789a, int i10) {
        super(flow, (i10 & 2) != 0 ? kotlin.coroutines.f.f38943a : coroutineContext, (i10 & 4) != 0 ? -3 : i7, (i10 & 8) != 0 ? EnumC0789a.f11390a : enumC0789a);
    }

    @Override // Zf.g
    public final g c(CoroutineContext coroutineContext, int i7, EnumC0789a enumC0789a) {
        return new j(this.f11753d, coroutineContext, i7, enumC0789a);
    }

    @Override // Zf.g
    public final Flow d() {
        return this.f11753d;
    }

    @Override // Zf.i
    public final Object f(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.f11753d.collect(flowCollector, continuation);
        return objCollect == Ef.a.f2423a ? objCollect : Unit.f38893a;
    }
}
