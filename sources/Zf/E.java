package Zf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class E extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f11730c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(FlowCollector flowCollector, Continuation continuation) {
        super(2, continuation);
        this.f11730c = flowCollector;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        E e10 = new E(this.f11730c, continuation);
        e10.f11729b = obj;
        return e10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((E) create(obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f11728a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            Object obj2 = this.f11729b;
            this.f11728a = 1;
            if (this.f11730c.emit(obj2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        return Unit.f38893a;
    }
}
