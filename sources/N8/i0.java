package N8;

import android.content.Intent;
import android.view.View;
import com.transsnet.palmpay.account.ui.activity.VerificationPatternPinActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f6223b;

    public /* synthetic */ i0(j0 j0Var, int i7) {
        this.f6222a = i7;
        this.f6223b = j0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j0 j0Var = this.f6223b;
        switch (this.f6222a) {
            case 0:
                VerificationPatternPinActivity verificationPatternPinActivity = j0Var.f6227a;
                int i7 = VerificationPatternPinActivity.f26054i;
                Intent intentQ = Pa.i0.q(verificationPatternPinActivity);
                intentQ.putExtra("extra_use_night_mode", !verificationPatternPinActivity.isForceNoNightMode());
                verificationPatternPinActivity.startActivityForResult(intentQ, 145);
                break;
            default:
                j0Var.f6227a.f26055a.setEnabled(false);
                j0Var.f6227a.setResult(31);
                j0Var.f6227a.finish();
                break;
        }
    }
}
