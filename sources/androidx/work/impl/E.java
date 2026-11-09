package androidx.work.impl;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class E extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J f18357b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(J j6, Continuation continuation) {
        super(2, continuation);
        this.f18357b = j6;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new E(this.f18357b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((E) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f18356a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        this.f18356a = 1;
        Object objA = J.a(this.f18357b, this);
        return objA == aVar ? aVar : objA;
    }
}
