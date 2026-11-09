package kotlinx.coroutines.flow;

import Yf.EnumC0789a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1871c extends C1873e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ff.h f39146e;

    /* JADX WARN: Multi-variable type inference failed */
    public C1871c(Function2 function2, CoroutineContext coroutineContext, int i7, EnumC0789a enumC0789a) {
        super(function2, coroutineContext, i7, enumC0789a);
        this.f39146e = (Ff.h) function2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.C1873e, Zf.g
    public final Object b(ProducerScope producerScope, Continuation continuation) {
        C1870b c1870b;
        if (continuation instanceof C1870b) {
            c1870b = (C1870b) continuation;
            int i7 = c1870b.f39142d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c1870b.f39142d = i7 - Integer.MIN_VALUE;
            } else {
                c1870b = new C1870b(this, (Ff.c) continuation);
            }
        } else {
            c1870b = new C1870b(this, (Ff.c) continuation);
        }
        Object obj = c1870b.f39140b;
        Object obj2 = Ef.a.f2423a;
        int i10 = c1870b.f39142d;
        if (i10 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            c1870b.f39139a = producerScope;
            c1870b.f39142d = 1;
            if (super.b(producerScope, c1870b) == obj2) {
                return obj2;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            producerScope = c1870b.f39139a;
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        if (producerScope.isClosedForSend()) {
            return Unit.f38893a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Ff.h, kotlin.jvm.functions.Function2] */
    @Override // kotlinx.coroutines.flow.C1873e, Zf.g
    public final Zf.g c(CoroutineContext coroutineContext, int i7, EnumC0789a enumC0789a) {
        return new C1871c(this.f39146e, coroutineContext, i7, enumC0789a);
    }
}
