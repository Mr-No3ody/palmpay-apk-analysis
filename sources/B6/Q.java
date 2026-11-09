package B6;

import java.util.Objects;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class Q extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f416b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(b0 b0Var, Continuation continuation) {
        super(2, continuation);
        this.f416b = b0Var;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Q(this.f416b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Q) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f415a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            b0 b0Var = this.f416b;
            EnumC0100w enumC0100w = ((O) b0Var.f459j.getValue()).f410a;
            Objects.toString(enumC0100w);
            Yf.n nVar = b0Var.f461p;
            C0101x c0101x = new C0101x(enumC0100w);
            this.f415a = 1;
            if (nVar.send(c0101x, this) == aVar) {
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
