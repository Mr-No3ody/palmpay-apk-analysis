package p235pb;

import Z4.e;
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.credit.contract.CLRepayPreviewContract;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b f41274f;

    public a(b bVar) {
        this.f41274f = bVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f41274f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        this.f41274f.f41275f.showLoadingDialog(false);
        ToastUtils.showLong(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        PreviewPayInfoResp previewPayInfoResp = (PreviewPayInfoResp) obj;
        b bVar = this.f41274f;
        bVar.f41275f.showLoadingDialog(false);
        if (!previewPayInfoResp.isSuccess() || previewPayInfoResp.getData() == null) {
            ToastUtils.showLong(previewPayInfoResp.getRespMsg());
        } else {
            ((CLRepayPreviewContract.ICLRepayPreviewView) bVar.f27351a).showPreviewInfo(previewPayInfoResp.getData());
        }
    }
}
