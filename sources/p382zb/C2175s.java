package p382zb;

import Pa.i0;
import android.content.Context;
import com.transsnet.palmpay.credit.ui.dialog.CLNoPermissionDialog;

/* JADX INFO: renamed from: zb.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2175s implements CLNoPermissionDialog.NoPermissionDialogInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f44616a;

    public C2175s(Context context) {
        this.f44616a = context;
    }

    @Override // com.transsnet.palmpay.credit.ui.dialog.CLNoPermissionDialog.NoPermissionDialogInterface
    public final void positiveClick() {
        i0.L(this.f44616a);
    }

    @Override // com.transsnet.palmpay.credit.ui.dialog.CLNoPermissionDialog.NoPermissionDialogInterface
    public final void negativeClick() {
    }
}
