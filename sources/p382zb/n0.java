package p382zb;

import Pa.i0;
import android.content.Intent;
import android.net.Uri;
import com.transsnet.palmpay.credit.ui.dialog.CLNoPermissionDialog;
import com.transsnet.palmpay.credit.ui.fragment.OpenAccountBaseFragment;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.AppUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 implements CLNoPermissionDialog.NoPermissionDialogInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OpenAccountBaseFragment f44608a;

    public n0(OpenAccountBaseFragment openAccountBaseFragment) {
        this.f44608a = openAccountBaseFragment;
    }

    @Override // com.transsnet.palmpay.credit.ui.dialog.CLNoPermissionDialog.NoPermissionDialogInterface
    public final void positiveClick() {
        OpenAccountBaseFragment openAccountBaseFragment = this.f44608a;
        if (openAccountBaseFragment.isAdded() && openAccountBaseFragment.getContext() != null && i0.W(openAccountBaseFragment.getActivity())) {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + AppUtils.getAppPackageName()));
            ActivityUtils.startActivity(intent);
        }
    }

    @Override // com.transsnet.palmpay.credit.ui.dialog.CLNoPermissionDialog.NoPermissionDialogInterface
    public final void negativeClick() {
    }
}
