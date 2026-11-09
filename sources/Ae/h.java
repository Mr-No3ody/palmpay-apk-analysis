package Ae;

import android.view.View;
import com.transsnet.palmpay.ui.dialog.MerchantAuthorizationDialog;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MerchantAuthorizationDialog f280b;

    public /* synthetic */ h(MerchantAuthorizationDialog merchantAuthorizationDialog, int i7) {
        this.f279a = i7;
        this.f280b = merchantAuthorizationDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f279a) {
            case 0:
                MerchantAuthorizationDialog merchantAuthorizationDialog = this.f280b;
                merchantAuthorizationDialog.dismiss();
                if (merchantAuthorizationDialog.mNegativeButtonListener != null) {
                    merchantAuthorizationDialog.mNegativeButtonListener.onClick(view);
                }
                break;
            default:
                MerchantAuthorizationDialog merchantAuthorizationDialog2 = this.f280b;
                merchantAuthorizationDialog2.dismiss();
                if (merchantAuthorizationDialog2.mPositiveButtonListener != null) {
                    merchantAuthorizationDialog2.mPositiveButtonListener.onClick(view);
                }
                break;
        }
    }
}
