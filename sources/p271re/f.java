package p271re;

import Pa.r0;
import V9.C0714c;
import Z4.e;
import com.transsnet.palmpay.core.bean.req.PayMerchantOrderAddReq;
import com.transsnet.palmpay.core.bean.rsp.QueryLimitAmountResp;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.ui.activity.qr.PayMoneyToPartnerPreviewActivity;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import p025ba.k;
import p071ef.b;
import p324va.c;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PayMoneyToPartnerPreviewActivity f41793f;

    public f(PayMoneyToPartnerPreviewActivity payMoneyToPartnerPreviewActivity) {
        this.f41793f = payMoneyToPartnerPreviewActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f41793f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ToastUtils.showLong(str);
        this.f41793f.showLoadingDialog(false);
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
        PayMoneyToPartnerPreviewActivity payMoneyToPartnerPreviewActivity = this.f41793f;
        long j6 = payMoneyToPartnerPreviewActivity.f34865x0;
        if (j6 > dataBean.getMaxAmount()) {
            ToastUtils.showLong(payMoneyToPartnerPreviewActivity.getString(k.core_msg_amount_below_desc, r0.B(queryLimitAmountResp.data.getMaxAmount(), true)));
            payMoneyToPartnerPreviewActivity.showLoadingDialog(false);
        } else if (j6 < queryLimitAmountResp.data.getMinAmount()) {
            ToastUtils.showLong(payMoneyToPartnerPreviewActivity.getString(k.core_msg_amount_above_desc, r0.B(queryLimitAmountResp.data.getMinAmount(), true)));
            payMoneyToPartnerPreviewActivity.showLoadingDialog(false);
        } else {
            PayMerchantOrderAddReq payMerchantOrderAddReq = new PayMerchantOrderAddReq();
            payMerchantOrderAddReq.seqId = payMoneyToPartnerPreviewActivity.f34867z0.seqId;
            payMoneyToPartnerPreviewActivity.showLoadingDialog(true);
            ((PayApiService) c.f43141a.f14621b).payMerchantOrderAdd(payMerchantOrderAddReq).k(p298tf.f.f42629b).i(b.a()).subscribe(new C0714c(payMoneyToPartnerPreviewActivity, 22));
        }
    }
}
