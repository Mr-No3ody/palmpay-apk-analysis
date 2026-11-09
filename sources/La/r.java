package La;

import C0.G;
import Pa.H;
import Pa.a0;
import Pa.n0;
import Pa.r0;
import com.transsnet.palmpay.core.bean.QueryBankListRsp;
import com.transsnet.palmpay.core.bean.payment.PayByOrderReq;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.bean.req.QueryBankListReq;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.ui.mvp.contract.BasePaymentContract;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r extends com.transsnet.palmpay.core.base.j implements BasePaymentContract.IPresenter {
    public static void b(PayByOrderResp payByOrderResp, PayByOrderReq payByOrderReq) {
        if (!payByOrderResp.isSuccess() || payByOrderReq == null) {
            return;
        }
        n0.g().u(((ViewEvent) G.g("Cashier_Order_Creation", true)).add("TransType", payByOrderReq.transType).add("OrderNo", payByOrderReq.orderNo));
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.BasePaymentContract.IPresenter
    public final void partnerPayByOrderNo(PayByOrderReq payByOrderReq) {
        ((PayApiService) p324va.c.f43141a.f14621b).partnerPayByOrderNo(payByOrderReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new o(this, payByOrderReq));
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.BasePaymentContract.IPresenter
    public final void payByNewOrderNo(PayByOrderReq payByOrderReq) {
        ((PayApiService) p324va.c.f43141a.f14621b).payByNewOrderNoV2(payByOrderReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new n(this, payByOrderReq));
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.BasePaymentContract.IPresenter
    public final void payByOrderNo(PayByOrderReq payByOrderReq) {
        ((PayApiService) p324va.c.f43141a.f14621b).payByOrderNoV2(payByOrderReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new m(this, payByOrderReq));
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.BasePaymentContract.IPresenter
    public final void queryBankList(QueryBankListReq queryBankListReq) {
        String strB = H.b("queryBankList", queryBankListReq);
        df.d.d(r0.H1(QueryBankListRsp.class, strB), ((PayApiService) p324va.c.f43141a.f14621b).queryBankList(queryBankListReq).c(new a0(strB, 0))).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new p(this));
    }
}
