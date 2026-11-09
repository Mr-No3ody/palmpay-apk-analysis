package Ce;

import Wf.AbstractC0780y;
import com.transsnet.palmpay.ui.fragment.HomeFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: Ce.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0173o extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeFragment f1508b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0173o(HomeFragment homeFragment, Continuation continuation) {
        super(2, continuation);
        this.f1508b = homeFragment;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0173o(this.f1508b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0173o) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f1507a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            p042cg.f fVar = Wf.I.f10809a;
            Wf.p0 p0Var = p015ag.o.f11960a;
            C0172n c0172n = new C0172n(this.f1508b, null);
            this.f1507a = 1;
            if (AbstractC0780y.s(p0Var, c0172n, this) == aVar) {
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
