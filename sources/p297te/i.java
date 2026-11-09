package p297te;

import android.view.View;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.req.ShareOrderReq;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.ui.activity.thirdpartymerchant.ThirdPartyMerchantOrderDetailActivity;
import p071ef.b;
import p298tf.f;
import p324va.c;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f42615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f42616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f42617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ThirdPartyMerchantOrderDetailActivity f42618d;

    public i(ThirdPartyMerchantOrderDetailActivity thirdPartyMerchantOrderDetailActivity, long j6, String str, String str2) {
        this.f42618d = thirdPartyMerchantOrderDetailActivity;
        this.f42615a = j6;
        this.f42616b = str;
        this.f42617c = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = ThirdPartyMerchantOrderDetailActivity.f35001M;
        ThirdPartyMerchantOrderDetailActivity thirdPartyMerchantOrderDetailActivity = this.f42618d;
        thirdPartyMerchantOrderDetailActivity.showLoadingDialog(true);
        ShareOrderReq shareOrderReq = new ShareOrderReq();
        shareOrderReq.orderNo = this.f42616b;
        shareOrderReq.transType = TransType.TRANS_TYPE_THIRD_PARTY_MERCHANT;
        ((PayApiService) c.f43141a.f14621b).shareOrder(shareOrderReq).k(f.f42629b).i(b.a()).subscribe(new j(thirdPartyMerchantOrderDetailActivity, BaseApplication.getInstance().getUser(), this.f42615a, this.f42617c));
    }
}
