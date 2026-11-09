package p271re;

import Pa.r0;
import V9.C0714c;
import Z4.e;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.core.bean.req.PayPalmPayBusinessOrderAddReq;
import com.transsnet.palmpay.core.bean.rsp.QueryLimitAmountResp;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.ui.activity.qr.PayMoneyToPalmPayBusinessPreviewActivity;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import p025ba.k;
import p071ef.b;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PayMoneyToPalmPayBusinessPreviewActivity f41790f;

    public c(PayMoneyToPalmPayBusinessPreviewActivity payMoneyToPalmPayBusinessPreviewActivity) {
        this.f41790f = payMoneyToPalmPayBusinessPreviewActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f41790f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ToastUtils.showLong(str);
        this.f41790f.showLoadingDialog(false);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        QueryLimitAmountResp.DataBean dataBean;
        QueryLimitAmountResp queryLimitAmountResp = (QueryLimitAmountResp) obj;
        if (queryLimitAmountResp == null) {
            return;
        }
        if (!queryLimitAmountResp.isSuccess() || (dataBean = queryLimitAmountResp.data) == null) {
            ToastUtils.showShort(queryLimitAmountResp.getRespMsg());
            return;
        }
        PayMoneyToPalmPayBusinessPreviewActivity payMoneyToPalmPayBusinessPreviewActivity = this.f41790f;
        long j6 = payMoneyToPalmPayBusinessPreviewActivity.f34830x0;
        if (j6 > dataBean.getMaxAmount()) {
            ToastUtils.showLong(payMoneyToPalmPayBusinessPreviewActivity.getString(k.core_msg_amount_below_desc, r0.B(queryLimitAmountResp.data.getMaxAmount(), true)));
            payMoneyToPalmPayBusinessPreviewActivity.showLoadingDialog(false);
            return;
        }
        if (j6 < queryLimitAmountResp.data.getMinAmount()) {
            ToastUtils.showLong(payMoneyToPalmPayBusinessPreviewActivity.getString(k.core_msg_amount_above_desc, r0.B(queryLimitAmountResp.data.getMinAmount(), true)));
            payMoneyToPalmPayBusinessPreviewActivity.showLoadingDialog(false);
            return;
        }
        PayPalmPayBusinessOrderAddReq payPalmPayBusinessOrderAddReq = new PayPalmPayBusinessOrderAddReq();
        payPalmPayBusinessOrderAddReq.currency = BaseApplication.getCurrency();
        PreviewPayInfoResp.DataBean dataBean2 = payMoneyToPalmPayBusinessPreviewActivity.f34817A0;
        payPalmPayBusinessOrderAddReq.deductAmount = dataBean2.deductionPointAmount;
        payPalmPayBusinessOrderAddReq.deductPoint = dataBean2.deductionPoint;
        payPalmPayBusinessOrderAddReq.payAmount = dataBean2.payAmount;
        payPalmPayBusinessOrderAddReq.qrCode = payMoneyToPalmPayBusinessPreviewActivity.f34831y0;
        payPalmPayBusinessOrderAddReq.payFee = dataBean2.fee;
        payPalmPayBusinessOrderAddReq.payeeAmount = dataBean2.payeeAmount;
        payPalmPayBusinessOrderAddReq.payeeFee = dataBean2.payeeFee;
        payPalmPayBusinessOrderAddReq.payeeVat = dataBean2.payeeVat;
        payPalmPayBusinessOrderAddReq.platformFee = dataBean2.platformFee;
        payPalmPayBusinessOrderAddReq.platformVat = dataBean2.platformVat;
        PaymentMethod paymentMethod = payMoneyToPalmPayBusinessPreviewActivity.f27789d;
        if (paymentMethod != null) {
            payPalmPayBusinessOrderAddReq.senderAccountId = paymentMethod.accountId;
        }
        payPalmPayBusinessOrderAddReq.redeemPoint = dataBean2.returnPoint;
        payPalmPayBusinessOrderAddReq.seqId = dataBean2.seqId;
        payMoneyToPalmPayBusinessPreviewActivity.showLoadingDialog(true);
        ((PayApiService) p324va.c.f43141a.f14621b).payMerchantOrderAdd(payPalmPayBusinessOrderAddReq).k(f.f42629b).i(b.a()).subscribe(new C0714c(payMoneyToPalmPayBusinessPreviewActivity, 20));
    }
}
