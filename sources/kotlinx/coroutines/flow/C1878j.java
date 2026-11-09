package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1878j extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f39182b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1878j(Flow flow, Continuation continuation) {
        super(2, continuation);
        this.f39182b = flow;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1878j(this.f39182b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1878j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f39181a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            this.f39181a = 1;
            Object objCollect = this.f39182b.collect(Zf.x.f11801a, this);
            if (objCollect != aVar) {
                objCollect = Unit.f38893a;
            }
            if (objCollect == aVar) {
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
