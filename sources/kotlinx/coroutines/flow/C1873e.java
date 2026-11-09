package kotlinx.coroutines.flow;

import Yf.EnumC0789a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1873e extends Zf.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ff.h f39153d;

    /* JADX WARN: Multi-variable type inference failed */
    public C1873e(Function2 function2, CoroutineContext coroutineContext, int i7, EnumC0789a enumC0789a) {
        super(coroutineContext, i7, enumC0789a);
        this.f39153d = (Ff.h) function2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Ff.h, kotlin.jvm.functions.Function2] */
    @Override // Zf.g
    public Object b(ProducerScope producerScope, Continuation continuation) {
        Object objInvoke = this.f39153d.invoke(producerScope, continuation);
        return objInvoke == Ef.a.f2423a ? objInvoke : Unit.f38893a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Ff.h, kotlin.jvm.functions.Function2] */
    @Override // Zf.g
    public Zf.g c(CoroutineContext coroutineContext, int i7, EnumC0789a enumC0789a) {
        return new C1873e(this.f39153d, coroutineContext, i7, enumC0789a);
    }

    @Override // Zf.g
    public final String toString() {
        return "block[" + this.f39153d + "] -> " + super.toString();
    }
}
