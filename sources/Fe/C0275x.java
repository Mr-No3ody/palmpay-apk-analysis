package Fe;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: Fe.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0275x extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f2823b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0275x(I i7, Continuation continuation) {
        super(2, continuation);
        this.f2823b = i7;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0275x(this.f2823b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0275x) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f2822a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            this.f2822a = 1;
            if (Wf.D.b(32L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        this.f2823b.queryHomeRewardTasks();
        return Unit.f38893a;
    }
}
