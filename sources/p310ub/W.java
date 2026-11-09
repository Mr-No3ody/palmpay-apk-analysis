package p310ub;

import Z4.e;
import android.text.TextUtils;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcGetInstallmentCreditActivity;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class W extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f42801f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ OcGetInstallmentCreditActivity f42802g;

    public /* synthetic */ W(OcGetInstallmentCreditActivity ocGetInstallmentCreditActivity, int i7) {
        this.f42801f = i7;
        this.f42802g = ocGetInstallmentCreditActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f42801f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42802g.addSubscription(d2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42802g.addSubscription(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42802g.addSubscription(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        switch (this.f42801f) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showShort(message, new Object[0]);
                break;
            default:
                if (!TextUtils.isEmpty(message)) {
                    ToastUtils.showShort(message, new Object[0]);
                }
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        switch (this.f42801f) {
            case 0:
                CommonResult commonResult = (CommonResult) obj;
                if (commonResult == null || !commonResult.isSuccess()) {
                    ToastUtils.showShort(commonResult != null ? commonResult.getRespMsg() : null, new Object[0]);
                }
                break;
            case 1:
                CommonResult commonResult2 = (CommonResult) obj;
                if (commonResult2 == null || !commonResult2.isSuccess()) {
                    ToastUtils.showShort(commonResult2 != null ? commonResult2.getRespMsg() : null, new Object[0]);
                }
                break;
            default:
                CommonResult commonResult3 = (CommonResult) obj;
                if (commonResult3 == null || !commonResult3.isSuccess()) {
                    if (!TextUtils.isEmpty(commonResult3 != null ? commonResult3.getRespMsg() : null)) {
                        ToastUtils.showShort(commonResult3 != null ? commonResult3.getRespMsg() : null, new Object[0]);
                    }
                }
                break;
        }
    }
}
