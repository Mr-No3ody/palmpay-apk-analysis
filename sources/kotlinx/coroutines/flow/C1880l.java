package kotlinx.coroutines.flow;

import Zf.AbstractC0807c;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1880l extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f39187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.F f39188c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1880l(Continuation continuation, kotlin.jvm.internal.F f10, FlowCollector flowCollector) {
        super(1, continuation);
        this.f39187b = flowCollector;
        this.f39188c = f10;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C1880l(continuation, this.f39188c, this.f39187b);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1880l) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f39186a;
        kotlin.jvm.internal.F f10 = this.f39188c;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            Pa.a0 a0Var = AbstractC0807c.f11737b;
            Object obj2 = f10.f38951a;
            if (obj2 == a0Var) {
                obj2 = null;
            }
            this.f39186a = 1;
            if (this.f39187b.emit(obj2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        f10.f38951a = null;
        return Unit.f38893a;
    }
}
