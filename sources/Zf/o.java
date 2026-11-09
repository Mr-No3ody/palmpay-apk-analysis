package Zf;

import Wf.AbstractC0777v;
import Yf.EnumC0789a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ff.h f11772e;

    /* JADX WARN: Multi-variable type inference failed */
    public o(Function3 function3, Flow flow, CoroutineContext coroutineContext, int i7, EnumC0789a enumC0789a) {
        super(flow, coroutineContext, i7, enumC0789a);
        this.f11772e = (Ff.h) function3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Ff.h, kotlin.jvm.functions.Function3] */
    @Override // Zf.g
    public final g c(CoroutineContext coroutineContext, int i7, EnumC0789a enumC0789a) {
        return new o(this.f11772e, this.f11753d, coroutineContext, i7, enumC0789a);
    }

    @Override // Zf.i
    public final Object f(FlowCollector flowCollector, Continuation continuation) throws Throwable {
        Object objD = AbstractC0777v.d(new n(this, flowCollector, null), continuation);
        return objD == Ef.a.f2423a ? objD : Unit.f38893a;
    }
}
