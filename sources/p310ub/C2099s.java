package p310ub;

import Z4.e;
import android.text.TextUtils;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcAuthActivity;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ub.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2099s extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f42915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ OcAuthActivity f42916g;

    public /* synthetic */ C2099s(OcAuthActivity ocAuthActivity, int i7) {
        this.f42915f = i7;
        this.f42916g = ocAuthActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f42915f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42916g.addSubscription(d2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42916g.addSubscription(d2);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42916g.addSubscription(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42916g.addSubscription(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        switch (this.f42915f) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                OcAuthActivity ocAuthActivity = this.f42916g;
                ocAuthActivity.showLoadingDialog(false);
                ocAuthActivity.f29325e--;
                ocAuthActivity.f29326f = false;
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(message, "message");
                OcAuthActivity ocAuthActivity2 = this.f42916g;
                ocAuthActivity2.showLoadingDialog(false);
                ocAuthActivity2.f29325e--;
                ocAuthActivity2.f29326f = false;
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(message, "message");
                OcAuthActivity ocAuthActivity3 = this.f42916g;
                ocAuthActivity3.showLoadingDialog(false);
                ocAuthActivity3.f29325e--;
                ocAuthActivity3.f29326f = false;
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
        switch (this.f42915f) {
            case 0:
                CommonResult commonResult = (CommonResult) obj;
                OcAuthActivity ocAuthActivity = this.f42916g;
                ocAuthActivity.f29325e--;
                if (commonResult == null || !commonResult.isSuccess()) {
                    ocAuthActivity.showLoadingDialog(false);
                    ocAuthActivity.f29326f = false;
                    ToastUtils.showShort(commonResult != null ? commonResult.getRespMsg() : null, new Object[0]);
                }
                ocAuthActivity.n();
                break;
            case 1:
                CommonResult commonResult2 = (CommonResult) obj;
                OcAuthActivity ocAuthActivity2 = this.f42916g;
                ocAuthActivity2.f29325e--;
                if (commonResult2 == null || !commonResult2.isSuccess()) {
                    ocAuthActivity2.showLoadingDialog(false);
                    ocAuthActivity2.f29326f = false;
                    ToastUtils.showShort(commonResult2 != null ? commonResult2.getRespMsg() : null, new Object[0]);
                }
                ocAuthActivity2.n();
                break;
            case 2:
                CommonResult commonResult3 = (CommonResult) obj;
                OcAuthActivity ocAuthActivity3 = this.f42916g;
                ocAuthActivity3.f29325e--;
                if (commonResult3 == null || !commonResult3.isSuccess()) {
                    ocAuthActivity3.showLoadingDialog(false);
                    ocAuthActivity3.f29326f = false;
                    ToastUtils.showShort(commonResult3 != null ? commonResult3.getRespMsg() : null, new Object[0]);
                }
                ocAuthActivity3.n();
                break;
            default:
                CommonResult commonResult4 = (CommonResult) obj;
                if (commonResult4 == null || !commonResult4.isSuccess()) {
                    if (!TextUtils.isEmpty(commonResult4 != null ? commonResult4.getRespMsg() : null)) {
                        ToastUtils.showShort(commonResult4 != null ? commonResult4.getRespMsg() : null, new Object[0]);
                    }
                }
                break;
        }
    }
}
