package p284sb;

import Pa.i0;
import com.transsnet.palmpay.credit.ui.activity.LoanLocationRequestPermissionActivity;
import com.transsnet.palmpay.credit.ui.dialog.CLNoPermissionDialog;

/* JADX INFO: renamed from: sb.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2015m implements CLNoPermissionDialog.NoPermissionDialogInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LoanLocationRequestPermissionActivity f42173a;

    public C2015m(LoanLocationRequestPermissionActivity loanLocationRequestPermissionActivity) {
        this.f42173a = loanLocationRequestPermissionActivity;
    }

    @Override // com.transsnet.palmpay.credit.ui.dialog.CLNoPermissionDialog.NoPermissionDialogInterface
    public final void positiveClick() {
        i0.L(this.f42173a);
    }

    @Override // com.transsnet.palmpay.credit.ui.dialog.CLNoPermissionDialog.NoPermissionDialogInterface
    public final void negativeClick() {
    }
}
