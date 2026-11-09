package Pe;

import Ed.C0238s;
import com.transsnet.palmpay.viewmodule.BalanceViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1888u;

/* JADX INFO: renamed from: Pe.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0531c extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BalanceViewModel f7225b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0531c(BalanceViewModel balanceViewModel, Continuation continuation) {
        super(2, continuation);
        this.f7225b = balanceViewModel;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0531c(this.f7225b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0531c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7224a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            kotlinx.coroutines.flow.T t = new kotlinx.coroutines.flow.T(new C0529a(2, null));
            p042cg.f fVar = Wf.I.f10809a;
            C1888u c1888u = new C1888u(kotlinx.coroutines.flow.X.n(t, p042cg.e.f19009c), new C0238s(3, null, 4));
            C0530b c0530b = new C0530b(this.f7225b, null);
            this.f7224a = 1;
            if (kotlinx.coroutines.flow.X.g(c1888u, c0530b, this) == aVar) {
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
