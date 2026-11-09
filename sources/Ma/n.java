package Ma;

import Wf.I;
import com.transsnet.palmpay.core.bean.cashier.CashierReceiveMethodBean;
import com.transsnet.palmpay.core.bean.cashier.DefaultCalcOfWithdrawalReq;
import com.transsnet.palmpay.core.ui.mvvm.CoreWithdrawalViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1888u;
import kotlinx.coroutines.flow.T;
import kotlinx.coroutines.flow.X;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoreWithdrawalViewModel f5906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DefaultCalcOfWithdrawalReq f5907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CashierReceiveMethodBean f5908d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(CoreWithdrawalViewModel coreWithdrawalViewModel, DefaultCalcOfWithdrawalReq defaultCalcOfWithdrawalReq, CashierReceiveMethodBean cashierReceiveMethodBean, Continuation continuation) {
        super(2, continuation);
        this.f5906b = coreWithdrawalViewModel;
        this.f5907c = defaultCalcOfWithdrawalReq;
        this.f5908d = cashierReceiveMethodBean;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new n(this.f5906b, this.f5907c, this.f5908d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5905a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            CoreWithdrawalViewModel coreWithdrawalViewModel = this.f5906b;
            com.transsnet.palmpay.core.base.l lVar = coreWithdrawalViewModel.f28068e;
            DefaultCalcOfWithdrawalReq defaultCalcOfWithdrawalReq = this.f5907c;
            lVar.f27356m = defaultCalcOfWithdrawalReq;
            lVar.k(com.transsnet.palmpay.core.base.o.f27359a);
            T t = new T(new k(defaultCalcOfWithdrawalReq, this.f5908d, null));
            p042cg.f fVar = I.f10809a;
            C1888u c1888u = new C1888u(X.n(t, p042cg.e.f19009c), new l(coreWithdrawalViewModel, (Continuation) null));
            m mVar = new m(coreWithdrawalViewModel, null);
            this.f5905a = 1;
            if (X.g(c1888u, mVar, this) == aVar) {
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
