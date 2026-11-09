package C9;

import com.transsnet.palmpay.cash_in.ui.activity.WithdrawAgentPaymentResultActivity;
import com.transsnet.palmpay.cash_in.ui.viewmodel.WithdrawDetailViewModel;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class J extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WithdrawAgentPaymentResultActivity f1261b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(WithdrawAgentPaymentResultActivity withdrawAgentPaymentResultActivity, Continuation continuation) {
        super(2, continuation);
        this.f1261b = withdrawAgentPaymentResultActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new J(this.f1261b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f1260a;
        WithdrawAgentPaymentResultActivity withdrawAgentPaymentResultActivity = this.f1261b;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            long j6 = withdrawAgentPaymentResultActivity.f26923w;
            this.f1260a = 1;
            if (Wf.D.b(j6, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        int i10 = WithdrawAgentPaymentResultActivity.f26909H;
        PayByOrderResp.DataBean dataBean = withdrawAgentPaymentResultActivity.f26921p;
        if (dataBean != null && dataBean.payStatus == 0) {
            ((WithdrawDetailViewModel) withdrawAgentPaymentResultActivity.l()).d(dataBean.orderNo);
        }
        return Unit.f38893a;
    }
}
