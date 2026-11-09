package Wf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Delay;
import p355xf.C2127f;

/* JADX INFO: loaded from: classes4.dex */
public abstract class D {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void a(Ff.c cVar) {
        C frame;
        if (cVar instanceof C) {
            frame = (C) cVar;
            int i7 = frame.f10802b;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                frame.f10802b = i7 - Integer.MIN_VALUE;
            } else {
                frame = new C(cVar);
            }
        } else {
            frame = new C(cVar);
        }
        Object obj = frame.f10801a;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = frame.f10802b;
        if (i10 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            frame.f10802b = 1;
            C0765i c0765i = new C0765i(1, Ef.f.b(frame));
            c0765i.initCancellability();
            Object objM = c0765i.m();
            if (objM == aVar) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            if (objM == aVar) {
                return;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        throw new C2127f();
    }

    public static final Object b(long j6, Continuation frame) {
        if (j6 <= 0) {
            return Unit.f38893a;
        }
        C0765i c0765i = new C0765i(1, Ef.f.b(frame));
        c0765i.initCancellability();
        if (j6 < Long.MAX_VALUE) {
            c(c0765i.f10867e).scheduleResumeAfterDelay(j6, c0765i);
        }
        Object objM = c0765i.m();
        Ef.a aVar = Ef.a.f2423a;
        if (objM == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objM == aVar ? objM : Unit.f38893a;
    }

    public static final Delay c(CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(ContinuationInterceptor.f38936l0);
        Delay delay = element instanceof Delay ? (Delay) element : null;
        return delay == null ? A.f10798a : delay;
    }
}
