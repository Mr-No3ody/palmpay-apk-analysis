package p294tb;

import Z4.e;
import androidx.camera.core.impl.utils.n;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.credit.bean.resp.CLOpenAccountData;
import com.transsnet.palmpay.credit.bean.resp.CLOpenAccountResp;
import com.transsnet.palmpay.credit.ui.activity.cashloan.UpgradeInstallmentTransParentActivity;
import com.transsnet.palmpay.credit.ui.dialog.CLCashLoadingDialog;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class B0 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f42398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ UpgradeInstallmentTransParentActivity f42399g;

    public /* synthetic */ B0(UpgradeInstallmentTransParentActivity upgradeInstallmentTransParentActivity, int i7) {
        this.f42398f = i7;
        this.f42399g = upgradeInstallmentTransParentActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f42398f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42399g.addSubscription(d2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42399g.addSubscription(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42399g.addSubscription(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        switch (this.f42398f) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                UpgradeInstallmentTransParentActivity upgradeInstallmentTransParentActivity = this.f42399g;
                upgradeInstallmentTransParentActivity.showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                upgradeInstallmentTransParentActivity.A(-1);
                break;
            case 1:
                n.u(message);
                CLCashLoadingDialog cLCashLoadingDialog = this.f42399g.f29190k0;
                if (cLCashLoadingDialog != null) {
                    cLCashLoadingDialog.dismiss();
                }
                break;
            default:
                ToastUtils.showLong(message, new Object[0]);
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        Integer applyStatus;
        UpgradeInstallmentTransParentActivity upgradeInstallmentTransParentActivity = this.f42399g;
        switch (this.f42398f) {
            case 0:
                CLOpenAccountResp response = (CLOpenAccountResp) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                upgradeInstallmentTransParentActivity.showLoadingDialog(false);
                if (response.isSuccess() && response.getData() != null) {
                    upgradeInstallmentTransParentActivity.f29193r0 = response.getData();
                }
                CLOpenAccountData cLOpenAccountData = upgradeInstallmentTransParentActivity.f29193r0;
                upgradeInstallmentTransParentActivity.A((cLOpenAccountData == null || (applyStatus = cLOpenAccountData.getApplyStatus()) == null) ? -1 : applyStatus.intValue());
                break;
            case 1:
                CLOpenAccountResp response2 = (CLOpenAccountResp) obj;
                Intrinsics.checkNotNullParameter(response2, "response");
                if (response2.isSuccess()) {
                    upgradeInstallmentTransParentActivity.f29193r0 = response2.getData();
                    upgradeInstallmentTransParentActivity.f29195t0.postDelayed((Runnable) upgradeInstallmentTransParentActivity.f29194s0.getValue(), upgradeInstallmentTransParentActivity.f29188Y);
                } else if (!"INSTALLMENT_LOAN_BACK_ERROR".equals(response2.getRespCode())) {
                    CLCashLoadingDialog cLCashLoadingDialog = upgradeInstallmentTransParentActivity.f29190k0;
                    if (cLCashLoadingDialog != null) {
                        cLCashLoadingDialog.dismiss();
                    }
                    n.u(response2.getRespMsg());
                } else {
                    int i7 = UpgradeInstallmentTransParentActivity.f29187u0;
                    upgradeInstallmentTransParentActivity.z();
                }
                break;
            default:
                CommonResult response3 = (CommonResult) obj;
                Intrinsics.checkNotNullParameter(response3, "response");
                if (!response3.isSuccess()) {
                    ToastUtils.showLong(response3.getRespMsg(), new Object[0]);
                }
                break;
        }
    }
}
