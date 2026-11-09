package Uc;

import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.bean.payment.PayByOrderReq;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.p2pcash.bean.rsp.GetCashierInfoResp;
import com.transsnet.palmpay.p2pcash.ui.atm.CashierDeskPage;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CashierDeskPage f9576a;

    public L(CashierDeskPage cashierDeskPage) {
        this.f9576a = cashierDeskPage;
    }

    public final void a() {
        int i7 = CashierDeskPage.f32844B;
        CashierDeskPage cashierDeskPage = this.f9576a;
        String str = cashierDeskPage.l().f9571e;
        if (str != null) {
            ToastUtils.showLong(str, new Object[0]);
            return;
        }
        if (cashierDeskPage.l().f9572f == null || cashierDeskPage.l().f9573g == null) {
            return;
        }
        K kL = cashierDeskPage.l();
        kL.getClass();
        PayByOrderReq payByOrderReq = new PayByOrderReq();
        GetCashierInfoResp.CalculationDtoBean calculationDtoBean = kL.f9573g;
        Intrinsics.e(calculationDtoBean);
        payByOrderReq.amount = calculationDtoBean.payAmount;
        payByOrderReq.currency = BaseApplication.getCurrency();
        payByOrderReq.orderNo = kL.f();
        payByOrderReq.orderType = kL.g();
        PaymentMethod paymentMethod = kL.f9572f;
        Intrinsics.e(paymentMethod);
        payByOrderReq.payType = paymentMethod.payType;
        PaymentMethod paymentMethod2 = kL.f9572f;
        Intrinsics.e(paymentMethod2);
        payByOrderReq.payerAccountId = paymentMethod2.accountId;
        payByOrderReq.transType = kL.h();
        GetCashierInfoResp.CalculationDtoBean calculationDtoBean2 = kL.f9573g;
        Intrinsics.e(calculationDtoBean2);
        payByOrderReq.cacheKey = calculationDtoBean2.cacheKey;
        CashierDeskPage cashierDeskPage2 = kL.f9574h;
        cashierDeskPage2.showLoadingDialog(true);
        ((PayApiService) p324va.c.f43141a.f14621b).payByNewOrderNoV2(payByOrderReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new H(cashierDeskPage2, kL));
    }
}
