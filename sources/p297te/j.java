package p297te;

import Nd.c;
import Pa.r0;
import Z4.e;
import android.text.TextUtils;
import com.facebook.imagepipeline.nativecode.b;
import com.transsnet.palmpay.core.bean.rsp.ShareOrderRsp;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.ui.activity.thirdpartymerchant.ThirdPartyMerchantOrderDetailActivity;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ User f42619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f42620g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f42621i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ThirdPartyMerchantOrderDetailActivity f42622j;

    public j(ThirdPartyMerchantOrderDetailActivity thirdPartyMerchantOrderDetailActivity, User user, long j6, String str) {
        this.f42622j = thirdPartyMerchantOrderDetailActivity;
        this.f42619f = user;
        this.f42620g = j6;
        this.f42621i = str;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f42622j.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        this.f42622j.showLoadingDialog(false);
        ToastUtils.showLong(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        ShareOrderRsp shareOrderRsp = (ShareOrderRsp) obj;
        ThirdPartyMerchantOrderDetailActivity thirdPartyMerchantOrderDetailActivity = this.f42622j;
        thirdPartyMerchantOrderDetailActivity.showLoadingDialog(false);
        if (!shareOrderRsp.isSuccess()) {
            ToastUtils.showLong(shareOrderRsp.getRespMsg());
        } else {
            if (TextUtils.isEmpty(shareOrderRsp.url)) {
                return;
            }
            b.D(thirdPartyMerchantOrderDetailActivity, thirdPartyMerchantOrderDetailActivity.getString(c.share_third_party_service_bill_info, this.f42619f.getNickName(), r0.B(this.f42620g, true), this.f42621i, shareOrderRsp.url));
        }
    }
}
