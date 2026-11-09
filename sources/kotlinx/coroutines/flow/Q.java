package kotlinx.coroutines.flow;

import Yf.EnumC0789a;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.internal.FusibleFlow;

/* JADX INFO: loaded from: classes4.dex */
public final class Q implements SharedFlow, CancellableFlow, FusibleFlow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W f39101a;

    public Q(W w3) {
        this.f39101a = w3;
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) throws Throwable {
        this.f39101a.collect(flowCollector, continuation);
        return Ef.a.f2423a;
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public final Flow fuse(CoroutineContext coroutineContext, int i7, EnumC0789a enumC0789a) {
        return X.o(this, coroutineContext, i7, enumC0789a);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public final List getReplayCache() {
        return this.f39101a.getReplayCache();
    }
}
