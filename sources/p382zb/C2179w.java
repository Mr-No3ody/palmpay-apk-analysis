package p382zb;

import Pa.i0;
import com.transsnet.palmpay.credit.ui.dialog.CLNoPermissionDialog;
import com.transsnet.palmpay.credit.ui.fragment.LoanHomeFragment;

/* JADX INFO: renamed from: zb.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2179w implements CLNoPermissionDialog.NoPermissionDialogInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LoanHomeFragment f44622a;

    public C2179w(LoanHomeFragment loanHomeFragment) {
        this.f44622a = loanHomeFragment;
    }

    @Override // com.transsnet.palmpay.credit.ui.dialog.CLNoPermissionDialog.NoPermissionDialogInterface
    public final void positiveClick() {
        i0.L(this.f44622a.getActivity());
    }

    @Override // com.transsnet.palmpay.credit.ui.dialog.CLNoPermissionDialog.NoPermissionDialogInterface
    public final void negativeClick() {
    }
}
