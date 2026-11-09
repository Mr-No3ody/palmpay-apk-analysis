package p235pb;

import Z4.e;
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.credit.contract.OcRepayExtendPreviewContract;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s f41293f;

    public q(s sVar) {
        this.f41293f = sVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f41293f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        this.f41293f.f41295f.showLoadingDialog(false);
        ToastUtils.showLong(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        PreviewPayInfoResp previewPayInfoResp = (PreviewPayInfoResp) obj;
        s sVar = this.f41293f;
        sVar.f41295f.showLoadingDialog(false);
        if (!previewPayInfoResp.isSuccess() || previewPayInfoResp.getData() == null) {
            ToastUtils.showLong(previewPayInfoResp.getRespMsg());
        } else {
            ((OcRepayExtendPreviewContract.IPreviewView) sVar.f27351a).showPreviewInfo(previewPayInfoResp.getData());
        }
    }
}
