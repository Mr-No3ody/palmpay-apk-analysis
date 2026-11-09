package kotlinx.coroutines.flow;

import Yf.EnumC0789a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1872d extends Zf.g {
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Yf.n f39151d;

    static {
        AtomicIntegerFieldUpdater.newUpdater(C1872d.class, "consumed$volatile");
    }

    public /* synthetic */ C1872d(Yf.n nVar) {
        this(nVar, kotlin.coroutines.f.f38943a, -3, EnumC0789a.f11390a);
    }

    @Override // Zf.g
    public final String a() {
        return "channel=" + this.f39151d;
    }

    @Override // Zf.g
    public final Object b(ProducerScope producerScope, Continuation continuation) throws Throwable {
        Object objJ = X.j(new Zf.B(producerScope), this.f39151d, false, continuation);
        return objJ == Ef.a.f2423a ? objJ : Unit.f38893a;
    }

    @Override // Zf.g
    public final Zf.g c(CoroutineContext coroutineContext, int i7, EnumC0789a enumC0789a) {
        return new C1872d(this.f39151d, coroutineContext, i7, enumC0789a);
    }

    @Override // Zf.g, kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) throws Throwable {
        if (this.f11748b == -3) {
            Object objJ = X.j(flowCollector, this.f39151d, false, continuation);
            return objJ == Ef.a.f2423a ? objJ : Unit.f38893a;
        }
        Object objCollect = super.collect(flowCollector, continuation);
        return objCollect == Ef.a.f2423a ? objCollect : Unit.f38893a;
    }

    @Override // Zf.g
    public final Flow d() {
        return new C1872d(this.f39151d);
    }

    @Override // Zf.g
    public final ReceiveChannel e(CoroutineScope coroutineScope) {
        return this.f11748b == -3 ? this.f39151d : super.e(coroutineScope);
    }

    public C1872d(Yf.n nVar, CoroutineContext coroutineContext, int i7, EnumC0789a enumC0789a) {
        super(coroutineContext, i7, enumC0789a);
        this.f39151d = nVar;
    }
}
