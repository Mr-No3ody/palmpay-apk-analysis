package Uc;

import Pa.C0525w;
import android.content.Intent;
import com.transsnet.palmpay.core.bean.payment.CheckPayReq;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.p2pcash.bean.rsp.CreateBizOrderResp;
import com.transsnet.palmpay.p2pcash.bean.rsp.GetCashierInfoResp;
import com.transsnet.palmpay.p2pcash.ui.atm.BookingDetailPage;
import com.transsnet.palmpay.p2pcash.ui.atm.CashierDeskPage;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class H extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CashierDeskPage f9551f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ K f9552g;

    public H(CashierDeskPage cashierDeskPage, K k2) {
        this.f9551f = cashierDeskPage;
        this.f9552g = k2;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f9551f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.f9551f.showLoadingDialog(false);
        ToastUtils.showLong(msg, new Object[0]);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        PayByOrderResp resp = (PayByOrderResp) obj;
        Intrinsics.checkNotNullParameter(resp, "resp");
        CashierDeskPage cashierDeskPage = this.f9551f;
        cashierDeskPage.showLoadingDialog(false);
        PayByOrderResp payByOrderResp = resp.isSuccess() ? resp : null;
        String orderId = "";
        if (payByOrderResp != null) {
            PayByOrderResp.DataBean data = payByOrderResp.getData();
            if (data != null) {
                boolean z3 = data.flag;
                K k2 = this.f9552g;
                if (!z3) {
                    Integer num = 8;
                    if (Intrinsics.c(num.toString(), C0525w.j(data.businessData, "payStatus"))) {
                        Pa.K.c(k2.g(), data.businessData);
                        cashierDeskPage.finish();
                        return;
                    }
                    P p3 = (P) cashierDeskPage.f32858w.getValue();
                    CashierDeskPage cashierDeskPage2 = k2.f9574h;
                    int iM = cashierDeskPage2.m();
                    if (iM == 1 || iM == 2) {
                        orderId = (String) cashierDeskPage2.f32850e.getValue();
                    } else if (iM == 3) {
                        CreateBizOrderResp createBizOrderRespD = k2.d();
                        Intrinsics.e(createBizOrderRespD);
                        orderId = createBizOrderRespD.orderNo;
                        Intrinsics.checkNotNullExpressionValue(orderId, "orderNo");
                    }
                    p3.getClass();
                    Intrinsics.checkNotNullParameter(orderId, "orderId");
                    CashierDeskPage cashierDeskPage3 = p3.f9583a;
                    Intrinsics.checkNotNullParameter(cashierDeskPage3, "<this>");
                    Intent intent = new Intent(cashierDeskPage3, (Class<?>) BookingDetailPage.class);
                    intent.putExtra("APPOINTMENT_ORDER_ID", orderId);
                    cashierDeskPage3.startActivity(intent);
                    cashierDeskPage.finish();
                    return;
                }
                CheckPayReq checkPayReq = new CheckPayReq();
                checkPayReq.orderNo = data.orderNo;
                checkPayReq.orderType = k2.g();
                checkPayReq.payId = data.payId;
                checkPayReq.subPayId = data.subPayId;
                checkPayReq.url = data.url;
                checkPayReq.verifyMethod = data.verifyMethod;
                checkPayReq.payRouteId = data.payRouteId;
                checkPayReq.transType = k2.h();
                checkPayReq.otpReference = data.otpReference;
                GetCashierInfoResp.CalculationDtoBean calculationDtoBean = k2.f9573g;
                Intrinsics.e(calculationDtoBean);
                checkPayReq.orderAmount = calculationDtoBean.orderAmount;
                GetCashierInfoResp.CalculationDtoBean calculationDtoBean2 = k2.f9573g;
                Intrinsics.e(calculationDtoBean2);
                checkPayReq.payAmount = calculationDtoBean2.payAmount;
                Intrinsics.checkNotNullParameter(cashierDeskPage, "<this>");
                com.transsnet.palmpay.core.ui.activity.d0 d0Var = new com.transsnet.palmpay.core.ui.activity.d0(cashierDeskPage);
                d0Var.f27748b = checkPayReq;
                d0Var.f27751e = k2.f9572f;
                d0Var.f27749c = resp;
                d0Var.a();
                cashierDeskPage.finish();
            } else {
                ToastUtils.showShort("Pay Order Server Data Error", new Object[0]);
            }
        }
        PayByOrderResp payByOrderResp2 = resp.isSuccess() ? null : resp;
        if (payByOrderResp2 != null) {
            String respCode = resp.getRespCode();
            if (!Intrinsics.c(respCode, "33000039") && !Intrinsics.c(respCode, "33000040") && !Intrinsics.c(respCode, "33000041") && !Intrinsics.c(respCode, "33000093")) {
                ToastUtils.showLong(payByOrderResp2.getRespMsg(), new Object[0]);
                return;
            }
            String respCode2 = resp.getRespCode();
            String respMsg = resp.getRespMsg();
            orderId = respMsg != null ? respMsg : "";
            Pa.i0.i0(cashierDeskPage, respCode2, orderId, true);
        }
    }
}
