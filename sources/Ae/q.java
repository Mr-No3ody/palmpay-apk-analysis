package Ae;

import C0.G;
import Pa.n0;
import android.view.View;
import com.transsnet.palmpay.account.ui.fragment.upgrade.UpgradeTier3StepFaceFragment;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f302c;

    public /* synthetic */ q(String str, String str2, int i7) {
        this.f300a = i7;
        this.f301b = str;
        this.f302c = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str = this.f302c;
        String str2 = this.f301b;
        switch (this.f300a) {
            case 0:
                G.z("/account/login", "extra_type", str2, "core_extra_bank_account_data", str);
                break;
            case 1:
                int i7 = UpgradeTier3StepFaceFragment.f26297p;
                n0.g().k(new ClickEvent("KYC_ReFaceVerify_Click").add("ReFaceVerifyError_type", str2).add("ReFaceVerifyError_Text", str));
                break;
            default:
                int i10 = UpgradeTier3StepFaceFragment.f26297p;
                n0.g().k(new ClickEvent("KYC_ReFaceVerify_Click").add("ReFaceVerifyError_type", str2).add("ReFaceVerifyError_Text", str));
                break;
        }
    }
}
