package F0;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f2504b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, Continuation continuation) {
        super(2, continuation);
        this.f2504b = hVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f2504b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f2503a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            G0.d dVar = this.f2504b.f2512b;
            this.f2503a = 1;
            if (dVar.c(null, this) == aVar) {
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
