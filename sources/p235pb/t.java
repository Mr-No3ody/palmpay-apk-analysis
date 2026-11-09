package p235pb;

import Z4.e;
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.credit.contract.OcPrePayPreviewContract;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v f41296f;

    public t(v vVar) {
        this.f41296f = vVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f41296f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        this.f41296f.f41298f.showLoadingDialog(false);
        ToastUtils.showLong(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        PreviewPayInfoResp previewPayInfoResp = (PreviewPayInfoResp) obj;
        v vVar = this.f41296f;
        vVar.f41298f.showLoadingDialog(false);
        if (!previewPayInfoResp.isSuccess() || previewPayInfoResp.getData() == null) {
            ToastUtils.showLong(previewPayInfoResp.getRespMsg());
        } else {
            ((OcPrePayPreviewContract.IPreviewView) vVar.f27351a).showPreviewInfo(previewPayInfoResp.getData());
        }
    }
}
