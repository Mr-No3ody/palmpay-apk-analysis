package B6;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p355xf.C2127f;

/* JADX INFO: loaded from: classes3.dex */
public final class U extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f424b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(b0 b0Var, Continuation continuation) {
        super(2, continuation);
        this.f424b = b0Var;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new U(this.f424b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((U) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
        return Ef.a.f2423a;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f423a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            b0 b0Var = this.f424b;
            kotlinx.coroutines.flow.S s3 = b0Var.f458i.f403d;
            T t = new T(b0Var, 0);
            this.f423a = 1;
            if (s3.f39102a.collect(t, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        throw new C2127f();
    }
}
