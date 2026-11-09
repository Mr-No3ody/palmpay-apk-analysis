package Ua;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class T extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f9366a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(Continuation continuation, Throwable th) {
        super(2, continuation);
        this.f9366a = th;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new T(continuation, this.f9366a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((T) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        org.chromium.support_lib_boundary.util.b.W(this.f9366a);
        return Unit.f38893a;
    }
}
