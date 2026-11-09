package p310ub;

import com.transsnet.palmpay.credit.ui.activity.okcard.OcGetInstallmentCreditActivity;
import com.transsnet.palmpay.credit.ui.dialog.CLNoPermissionDialog;

/* JADX INFO: loaded from: classes4.dex */
public final class V implements CLNoPermissionDialog.NoPermissionDialogInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OcGetInstallmentCreditActivity f42798a;

    public V(OcGetInstallmentCreditActivity ocGetInstallmentCreditActivity) {
        this.f42798a = ocGetInstallmentCreditActivity;
    }

    @Override // com.transsnet.palmpay.credit.ui.dialog.CLNoPermissionDialog.NoPermissionDialogInterface
    public final void negativeClick() {
        this.f42798a.finish();
    }

    @Override // com.transsnet.palmpay.credit.ui.dialog.CLNoPermissionDialog.NoPermissionDialogInterface
    public final void positiveClick() {
        OcGetInstallmentCreditActivity.y(this.f42798a);
    }
}
