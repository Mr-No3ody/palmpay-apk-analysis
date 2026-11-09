package p284sb;

import C0.G;
import Ef.a;
import Ff.h;
import Ya.b;
import android.text.TextUtils;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.credit.ui.activity.PayShopPaymentResultActivity;
import com.transsnet.palmpay.custom_view.v;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class F extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PayByOrderResp.DataBean f42119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PayShopPaymentResultActivity f42120b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(PayByOrderResp.DataBean dataBean, PayShopPaymentResultActivity payShopPaymentResultActivity, Continuation continuation) {
        super(1, continuation);
        this.f42119a = dataBean;
        this.f42120b = payShopPaymentResultActivity;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new F(this.f42119a, this.f42120b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((F) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        PayByOrderResp.DataBean dataBean = this.f42119a;
        if (dataBean.payStatus == 0) {
            int i7 = PayShopPaymentResultActivity.f28737Q;
            PayShopPaymentResultActivity payShopPaymentResultActivity = this.f42120b;
            payShopPaymentResultActivity.p().getOrderStatusTv().setText(payShopPaymentResultActivity.getString(v.cv_processing));
            String str = dataBean.pendingAcTips;
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            if (str != null) {
                payShopPaymentResultActivity.p().h(G.i(str).append(payShopPaymentResultActivity.getString(v.cv_view_overtime_rewards)).setForegroundColor(payShopPaymentResultActivity.getColor(b.cs_main_color)).create());
            }
        }
        return Unit.f38893a;
    }
}
