package androidx.work.impl;

import Wf.AbstractC0780y;
import android.os.Build;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class I extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J f18369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V0.B f18370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.utils.r f18371d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(J j6, V0.B b7, androidx.work.impl.utils.r rVar, Continuation continuation) {
        super(2, continuation);
        this.f18369b = j6;
        this.f18370c = b7;
        this.f18371d = rVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new I(this.f18369b, this.f18370c, this.f18371d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((I) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objS;
        Object obj2 = Ef.a.f2423a;
        int i7 = this.f18368a;
        J j6 = this.f18369b;
        V0.B b7 = this.f18370c;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            androidx.work.impl.model.k kVar = j6.f18372a;
            androidx.work.impl.utils.taskexecutor.a aVar = j6.f18375d;
            this.f18368a = 1;
            int i10 = androidx.work.impl.utils.p.f18717a;
            if (!kVar.f18628q || Build.VERSION.SDK_INT >= 31) {
                objS = Unit.f38893a;
            } else {
                androidx.camera.core.impl.utils.executor.f fVar = aVar.f18730d;
                Intrinsics.checkNotNullExpressionValue(fVar, "taskExecutor.mainThreadExecutor");
                objS = AbstractC0780y.s(AbstractC0780y.h(fVar), new androidx.work.impl.utils.o(b7, kVar, this.f18371d, j6.f18373b, null), this);
                if (objS != obj2) {
                    objS = Unit.f38893a;
                }
            }
            if (objS != obj2) {
            }
        }
        if (i7 != 1) {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        String str = K.f18385a;
        V0.C.c().getClass();
        androidx.concurrent.futures.m mVarB = b7.b();
        Intrinsics.checkNotNullExpressionValue(mVarB, "worker.startWork()");
        this.f18368a = 2;
        Object objA = K.a(mVarB, b7, this);
        return objA == obj2 ? obj2 : objA;
    }
}
