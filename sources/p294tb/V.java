package p294tb;

import android.view.View;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayActivity;
import com.transsnet.palmpay.credit.ui.dialog.OcRepayExitMarketingDialog;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class V implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OcRepayExitMarketingDialog f42435b;

    public /* synthetic */ V(OcRepayExitMarketingDialog ocRepayExitMarketingDialog, int i7) {
        this.f42434a = i7;
        this.f42435b = ocRepayExitMarketingDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        OcRepayExitMarketingDialog ocRepayExitMarketingDialog = this.f42435b;
        switch (this.f42434a) {
            case 0:
                int i7 = CLRepaymentActivity.f29036w0;
                ocRepayExitMarketingDialog.dismiss();
                break;
            default:
                int i10 = OcRepayActivity.f29705v1;
                ocRepayExitMarketingDialog.dismiss();
                break;
        }
    }
}
