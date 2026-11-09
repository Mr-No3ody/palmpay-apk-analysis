package p297te;

import Z4.e;
import com.transsnet.palmpay.main.export.bean.rsp.ThirdPartyMerchantListResp;
import com.transsnet.palmpay.main.export.bean.rsp.ThirdPartyMerchantResp;
import com.transsnet.palmpay.ui.activity.thirdpartymerchant.ThirdPartyMerchantActivity;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ThirdPartyMerchantActivity f42610f;

    public f(ThirdPartyMerchantActivity thirdPartyMerchantActivity) {
        this.f42610f = thirdPartyMerchantActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f42610f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ThirdPartyMerchantActivity thirdPartyMerchantActivity = this.f42610f;
        thirdPartyMerchantActivity.f34993b.setVisibility(8);
        thirdPartyMerchantActivity.f34993b.setProgress(0);
        ToastUtils.showLong(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        ThirdPartyMerchantResp thirdPartyMerchantResp = (ThirdPartyMerchantResp) obj;
        boolean zIsSuccess = thirdPartyMerchantResp.isSuccess();
        ThirdPartyMerchantActivity thirdPartyMerchantActivity = this.f42610f;
        if (!zIsSuccess) {
            thirdPartyMerchantActivity.f34993b.setVisibility(8);
            thirdPartyMerchantActivity.f34993b.setProgress(0);
            ToastUtils.showLong(thirdPartyMerchantResp.getRespMsg());
        } else {
            ThirdPartyMerchantListResp.ThirdPartyMerchant data = thirdPartyMerchantResp.getData();
            thirdPartyMerchantActivity.f34994c = data;
            if (data != null) {
                thirdPartyMerchantActivity.f34996e.setTitle(data.getMerchantName());
                thirdPartyMerchantActivity.f34992a.loadUrl(thirdPartyMerchantActivity.f34994c.getServiceLink());
            }
        }
    }
}
