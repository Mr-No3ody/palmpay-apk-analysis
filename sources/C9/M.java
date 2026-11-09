package C9;

import android.text.TextUtils;
import com.transsnet.palmpay.cash_in.ui.activity.WithdrawAgentPaymentResultActivity;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class M extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PayByOrderResp.DataBean f1265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WithdrawAgentPaymentResultActivity f1266b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(PayByOrderResp.DataBean dataBean, WithdrawAgentPaymentResultActivity withdrawAgentPaymentResultActivity, Continuation continuation) {
        super(1, continuation);
        this.f1265a = dataBean;
        this.f1266b = withdrawAgentPaymentResultActivity;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new M(this.f1265a, this.f1266b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((M) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        PayByOrderResp.DataBean dataBean = this.f1265a;
        if (dataBean.payStatus == 0) {
            int i7 = WithdrawAgentPaymentResultActivity.f26909H;
            WithdrawAgentPaymentResultActivity withdrawAgentPaymentResultActivity = this.f1266b;
            withdrawAgentPaymentResultActivity.n().getOrderStatusTv().setText(withdrawAgentPaymentResultActivity.getString(com.transsnet.palmpay.custom_view.v.cv_processing));
            String str = dataBean.pendingAcTips;
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            if (str != null) {
                withdrawAgentPaymentResultActivity.n().h(C0.G.i(str).append(withdrawAgentPaymentResultActivity.getString(com.transsnet.palmpay.custom_view.v.cv_view_overtime_rewards)).setForegroundColor(withdrawAgentPaymentResultActivity.getColor(L6.b.ppColorPrimary)).create());
            }
        }
        return Unit.f38893a;
    }
}
