package Ua;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: Ua.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0641w extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f9499a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0641w(Continuation continuation, Throwable th) {
        super(2, continuation);
        this.f9499a = th;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0641w(continuation, this.f9499a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0641w) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        org.chromium.support_lib_boundary.util.b.W(this.f9499a);
        return Unit.f38893a;
    }
}
