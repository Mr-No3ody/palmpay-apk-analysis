package Ob;

import Ff.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function0 f6720a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f6720a = function0;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f6720a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        this.f6720a.invoke();
        return Unit.f38893a;
    }
}
