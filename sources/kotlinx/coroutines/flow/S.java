package kotlinx.coroutines.flow;

import Wf.t0;
import Yf.EnumC0789a;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.internal.FusibleFlow;

/* JADX INFO: loaded from: classes4.dex */
public final class S implements StateFlow, CancellableFlow, FusibleFlow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableStateFlow f39102a;

    public S(MutableStateFlow mutableStateFlow, t0 t0Var) {
        this.f39102a = mutableStateFlow;
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        return this.f39102a.collect(flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public final Flow fuse(CoroutineContext coroutineContext, int i7, EnumC0789a enumC0789a) {
        return (((i7 < 0 || i7 >= 2) && i7 != -2) || enumC0789a != EnumC0789a.f11391b) ? X.o(this, coroutineContext, i7, enumC0789a) : this;
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public final List getReplayCache() {
        return this.f39102a.getReplayCache();
    }

    @Override // kotlinx.coroutines.flow.StateFlow
    public final Object getValue() {
        return this.f39102a.getValue();
    }
}
