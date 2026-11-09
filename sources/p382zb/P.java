package p382zb;

import Pa.i0;
import com.transsnet.palmpay.credit.ui.dialog.CLNoPermissionDialog;
import com.transsnet.palmpay.credit.ui.fragment.OcHomeLoanTabFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class P implements CLNoPermissionDialog.NoPermissionDialogInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OcHomeLoanTabFragment f44541a;

    public P(OcHomeLoanTabFragment ocHomeLoanTabFragment) {
        this.f44541a = ocHomeLoanTabFragment;
    }

    @Override // com.transsnet.palmpay.credit.ui.dialog.CLNoPermissionDialog.NoPermissionDialogInterface
    public final void positiveClick() {
        i0.L(this.f44541a.getActivity());
    }

    @Override // com.transsnet.palmpay.credit.ui.dialog.CLNoPermissionDialog.NoPermissionDialogInterface
    public final void negativeClick() {
    }
}
