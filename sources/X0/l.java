package X0;

import V0.C;
import java.util.Objects;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class l extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.model.k f10964a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.work.impl.model.k kVar, Continuation continuation) {
        super(2, continuation);
        this.f10964a = kVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new l(this.f10964a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((androidx.work.impl.constraints.c) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        String str = m.f10965a;
        C c6 = C.c();
        Objects.toString(this.f10964a);
        c6.getClass();
        return Unit.f38893a;
    }
}
