package p102ge;

import Nd.c;
import Pa.r0;
import Z4.e;
import android.text.TextUtils;
import com.facebook.imagepipeline.nativecode.b;
import com.transsnet.palmpay.core.bean.rsp.ShareOrderRsp;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.ui.activity.PayMerchantResultActivity;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes4.dex */
public final class I extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ User f37189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f37190g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ PayMerchantResultActivity f37191i;

    public I(PayMerchantResultActivity payMerchantResultActivity, User user, long j6) {
        this.f37191i = payMerchantResultActivity;
        this.f37189f = user;
        this.f37190g = j6;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f37191i.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        this.f37191i.showLoadingDialog(false);
        ToastUtils.showLong(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        ShareOrderRsp shareOrderRsp = (ShareOrderRsp) obj;
        PayMerchantResultActivity payMerchantResultActivity = this.f37191i;
        payMerchantResultActivity.showLoadingDialog(false);
        if (!shareOrderRsp.isSuccess()) {
            ToastUtils.showLong(shareOrderRsp.getRespMsg());
        } else {
            if (TextUtils.isEmpty(shareOrderRsp.url)) {
                return;
            }
            b.D(payMerchantResultActivity, payMerchantResultActivity.getString(c.share_airtime_bill_info, this.f37189f.getNickName(), r0.B(this.f37190g, true), shareOrderRsp.url));
        }
    }
}
