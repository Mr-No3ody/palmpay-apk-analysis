package Od;

import com.transsnet.palmpay.task.HomeMenuConfigTask;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeMenuConfigTask f6808b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(HomeMenuConfigTask homeMenuConfigTask, Continuation continuation) {
        super(2, continuation);
        this.f6808b = homeMenuConfigTask;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f6808b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f6807a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            this.f6807a = 1;
            if (this.f6808b.preloadHomeMenu(this) == aVar) {
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
