package Yf;

import Wf.C0753a0;
import Wf.C0765i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class C {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(ProducerScope producerScope, Function0 function0, Ff.c cVar) {
        B frame;
        if (cVar instanceof B) {
            frame = (B) cVar;
            int i7 = frame.f11384d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                frame.f11384d = i7 - Integer.MIN_VALUE;
            } else {
                frame = new B(cVar);
            }
        } else {
            frame = new B(cVar);
        }
        Object obj = frame.f11383c;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = frame.f11384d;
        try {
            if (i10 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                if (frame.getContext().get(C0753a0.f10836a) != producerScope) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                frame.f11381a = producerScope;
                frame.f11382b = function0;
                frame.f11384d = 1;
                C0765i c0765i = new C0765i(1, Ef.f.b(frame));
                c0765i.initCancellability();
                producerScope.invokeOnClose(new V8.w(c0765i, 3));
                Object objM = c0765i.m();
                if (objM == aVar) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                if (objM == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function0 = frame.f11382b;
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            function0.invoke();
            return Unit.f38893a;
        } catch (Throwable th) {
            function0.invoke();
            throw th;
        }
    }
}
