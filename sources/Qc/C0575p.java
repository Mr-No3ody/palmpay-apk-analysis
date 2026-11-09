package Qc;

import Ed.C0238s;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1888u;

/* JADX INFO: renamed from: Qc.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0575p extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CashBoxViewModel f7816b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0575p(CashBoxViewModel cashBoxViewModel, Continuation continuation) {
        super(2, continuation);
        this.f7816b = cashBoxViewModel;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0575p(this.f7816b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0575p) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7815a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            kotlinx.coroutines.flow.T t = new kotlinx.coroutines.flow.T(new C0573n(2, null));
            p042cg.f fVar = Wf.I.f10809a;
            C1888u c1888u = new C1888u(kotlinx.coroutines.flow.X.n(t, p042cg.e.f19009c), new C0238s(3, null, 5));
            C0574o c0574o = new C0574o(this.f7816b, null);
            this.f7815a = 1;
            if (kotlinx.coroutines.flow.X.g(c1888u, c0574o, this) == aVar) {
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
