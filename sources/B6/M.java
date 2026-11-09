package B6;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class M extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f398b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(N n10, Continuation continuation) {
        super(2, continuation);
        this.f398b = n10;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new M(this.f398b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((M) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f397a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            this.f397a = 1;
            if (Wf.D.b(300L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        this.f398b.f407h = false;
        return Unit.f38893a;
    }
}
