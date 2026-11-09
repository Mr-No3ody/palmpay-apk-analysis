package p271re;

import Z4.e;
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.ui.activity.qr.PayMoneyToPalmPayBusinessPreviewActivity;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PayMoneyToPalmPayBusinessPreviewActivity f41789f;

    public b(PayMoneyToPalmPayBusinessPreviewActivity payMoneyToPalmPayBusinessPreviewActivity) {
        this.f41789f = payMoneyToPalmPayBusinessPreviewActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f41789f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        PayMoneyToPalmPayBusinessPreviewActivity payMoneyToPalmPayBusinessPreviewActivity = this.f41789f;
        payMoneyToPalmPayBusinessPreviewActivity.showLoadingDialog(false);
        ToastUtils.showLong(str);
        payMoneyToPalmPayBusinessPreviewActivity.R();
    }

    @Override // Z4.e
    public final void y(Object obj) {
        PreviewPayInfoResp previewPayInfoResp = (PreviewPayInfoResp) obj;
        PayMoneyToPalmPayBusinessPreviewActivity payMoneyToPalmPayBusinessPreviewActivity = this.f41789f;
        payMoneyToPalmPayBusinessPreviewActivity.showLoadingDialog(false);
        if (previewPayInfoResp.isSuccess()) {
            payMoneyToPalmPayBusinessPreviewActivity.showPreviewPayInfo(null, previewPayInfoResp.getData());
            return;
        }
        int i7 = PayMoneyToPalmPayBusinessPreviewActivity.f34816C0;
        payMoneyToPalmPayBusinessPreviewActivity.f34819Y.setEnabled(false);
        ToastUtils.showLong(previewPayInfoResp.getRespMsg());
        payMoneyToPalmPayBusinessPreviewActivity.R();
    }
}
