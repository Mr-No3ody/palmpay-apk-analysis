package Zf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class B implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProducerScope f11725a;

    public B(ProducerScope producerScope) {
        this.f11725a = producerScope;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Object objSend = this.f11725a.send(obj, continuation);
        return objSend == Ef.a.f2423a ? objSend : Unit.f38893a;
    }
}
