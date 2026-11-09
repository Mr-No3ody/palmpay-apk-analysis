package F0;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f2498b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar, Continuation continuation) {
        super(2, continuation);
        this.f2498b = hVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f2498b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f2497a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        G0.d dVar = this.f2498b.f2512b;
        this.f2497a = 1;
        Object objB = dVar.b(this);
        return objB == aVar ? aVar : objB;
    }
}
