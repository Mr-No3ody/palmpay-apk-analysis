package p271re;

import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.ui.activity.qr.PayMoneyToPartnerPreviewActivity;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PayMoneyToPartnerPreviewActivity f41792f;

    public e(PayMoneyToPartnerPreviewActivity payMoneyToPartnerPreviewActivity) {
        this.f41792f = payMoneyToPartnerPreviewActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f41792f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ToastUtils.showLong(str);
        this.f41792f.showLoadingDialog(false);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        PreviewPayInfoResp previewPayInfoResp = (PreviewPayInfoResp) obj;
        PayMoneyToPartnerPreviewActivity payMoneyToPartnerPreviewActivity = this.f41792f;
        payMoneyToPartnerPreviewActivity.showLoadingDialog(false);
        if (previewPayInfoResp.isSuccess()) {
            payMoneyToPartnerPreviewActivity.showPreviewPayInfo(null, previewPayInfoResp.getData());
            return;
        }
        ToastUtils.showLong(previewPayInfoResp.getRespMsg());
        int i7 = PayMoneyToPartnerPreviewActivity.f34852B0;
        payMoneyToPartnerPreviewActivity.f34854Y.setEnabled(false);
    }
}
