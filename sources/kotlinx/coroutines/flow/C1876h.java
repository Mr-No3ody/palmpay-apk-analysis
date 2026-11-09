package kotlinx.coroutines.flow;

import Zf.AbstractC0807c;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1876h implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Flow f39172a;

    public C1876h(Flow flow) {
        this.f39172a = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        kotlin.jvm.internal.F f10 = new kotlin.jvm.internal.F();
        f10.f38951a = AbstractC0807c.f11737b;
        Object objCollect = this.f39172a.collect(new C1875g(this, f10, flowCollector), continuation);
        return objCollect == Ef.a.f2423a ? objCollect : Unit.f38893a;
    }
}
