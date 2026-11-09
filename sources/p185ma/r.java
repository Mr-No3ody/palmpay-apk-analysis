package p185ma;

import Pa.i0;
import Z4.e;
import android.text.TextUtils;
import com.flexibank.sdk.g;
import com.transsnet.adsdk.widgets.banner.bannerview.b;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.req.CommonShareReq;
import com.transsnet.palmpay.core.bean.rsp.CommonShareNewRsp;
import com.transsnet.palmpay.core.bean.rsp.CommonStringResult;
import com.transsnet.palmpay.core.dialog.ShareDialog;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f39619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CommonShareReq f39620g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ShareDialog f39621i;

    public /* synthetic */ r(ShareDialog shareDialog, CommonShareReq commonShareReq, int i7) {
        this.f39619f = i7;
        this.f39621i = shareDialog;
        this.f39620g = commonShareReq;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        switch (this.f39619f) {
            case 0:
                this.f39621i.addDisposable(disposable);
                break;
            default:
                this.f39621i.addDisposable(disposable);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String str) {
        switch (this.f39619f) {
            case 0:
                ToastUtils.showShort(str);
                break;
            default:
                ToastUtils.showShort(str);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z4.e
    public final void y(Object obj) {
        switch (this.f39619f) {
            case 0:
                CommonStringResult commonStringResult = (CommonStringResult) obj;
                if (!commonStringResult.isSuccess()) {
                    ToastUtils.showShort(commonStringResult.getRespMsg());
                } else {
                    int i7 = CommonShareReq.TYPE_RETURN_WEB_PAGE_PATH_AND_SHARE_TEXT;
                    CommonShareReq commonShareReq = this.f39620g;
                    if (i7 == commonShareReq.type) {
                        String str = commonStringResult.data;
                        ShareDialog shareDialog = this.f39621i;
                        shareDialog.mShareText = str;
                        if (!TextUtils.isEmpty(shareDialog.mShareText)) {
                            shareDialog.getUiHandler().post(new b(this, 15));
                        }
                    }
                    if (CommonShareReq.TYPE_SEND_NOTIFICATION == commonShareReq.type) {
                        ToastUtils.showShort(commonStringResult.getRespMsg());
                        i0.f0(commonShareReq.businessType, commonShareReq.memberId);
                    }
                }
                break;
            default:
                CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
                if (!commonBeanResult.isSuccess()) {
                    ToastUtils.showShort(commonBeanResult.getRespMsg());
                } else {
                    int i10 = CommonShareReq.TYPE_RETURN_WEB_PAGE_PATH_AND_SHARE_TEXT;
                    CommonShareReq commonShareReq2 = this.f39620g;
                    if (i10 == commonShareReq2.type) {
                        T t = commonBeanResult.data;
                        ShareDialog shareDialog2 = this.f39621i;
                        if (t != 0) {
                            shareDialog2.mShareText = ((CommonShareNewRsp) t).url;
                        }
                        shareDialog2.getUiHandler().post(new g(24, this, commonBeanResult));
                    }
                    if (CommonShareReq.TYPE_SEND_NOTIFICATION == commonShareReq2.type) {
                        ToastUtils.showShort(commonBeanResult.getRespMsg());
                        i0.f0(commonShareReq2.businessType, commonShareReq2.memberId);
                    }
                }
                break;
        }
    }
}
