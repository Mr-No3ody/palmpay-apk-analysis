package N8;

import C9.ViewOnClickListenerC0146m;
import Pa.r0;
import android.os.SystemClock;
import com.transsnet.palmpay.account.ui.activity.VerificationPatternPinActivity;
import com.transsnet.palmpay.custom_view.PatternLockView;
import com.transsnet.palmpay.util.SPUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements PatternLockView.UnlockListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VerificationPatternPinActivity f6227a;

    public j0(VerificationPatternPinActivity verificationPatternPinActivity) {
        this.f6227a = verificationPatternPinActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.PatternLockView.UnlockListener
    public final void drawOver(int[] iArr) {
        int i7 = 1;
        int i10 = VerificationPatternPinActivity.f26054i;
        VerificationPatternPinActivity verificationPatternPinActivity = this.f6227a;
        if (!r0.X0(iArr)) {
            String string = verificationPatternPinActivity.getResources().getString(F8.h.ac_msg_connect_4_dots);
            verificationPatternPinActivity.f26057c.setTextColor(verificationPatternPinActivity.getResources().getColor(L6.b.ppColorError));
            verificationPatternPinActivity.f26057c.setText(string);
            L8.a.c(verificationPatternPinActivity.f26058d);
            return;
        }
        verificationPatternPinActivity.f26057c.setTextColor(verificationPatternPinActivity.getResources().getColor(L6.b.ppColorTextDisable));
        verificationPatternPinActivity.f26057c.setText(F8.h.ac_verify_your_pattern);
        verificationPatternPinActivity.f26060f = (int[]) iArr.clone();
        verificationPatternPinActivity.f26056b.setNumbers(iArr);
        if (r0.m(verificationPatternPinActivity.f26060f)) {
            verificationPatternPinActivity.setResult(-1);
            verificationPatternPinActivity.finish();
            return;
        }
        verificationPatternPinActivity.f26059e.setRightText(verificationPatternPinActivity.getResources().getString(F8.h.ac_forgot_pattern));
        verificationPatternPinActivity.f26059e.setRightTextViewClickListener(new ViewOnClickListenerC0146m(verificationPatternPinActivity, 5));
        int i11 = verificationPatternPinActivity.f26061g + 1;
        verificationPatternPinActivity.f26061g = i11;
        if (i11 >= 5) {
            SPUtils.getInstance().put(com.transsnet.palmpay.core.config.d.k(), SystemClock.elapsedRealtime());
            verificationPatternPinActivity.showErrorMessageDialog(verificationPatternPinActivity.getResources().getString(p025ba.k.core_verification_failed), verificationPatternPinActivity.getResources().getString(F8.h.ac_verify_pattern_pw_fail_hint), verificationPatternPinActivity.getResources().getString(F8.h.ac_use_pin), verificationPatternPinActivity.getResources().getString(F8.h.ac_cancel), new i0(this, 0), new i0(this, i7));
            return;
        }
        String str = "Incorrect pattern. " + (5 - verificationPatternPinActivity.f26061g) + " attempt(s) remaining";
        verificationPatternPinActivity.f26057c.setTextColor(verificationPatternPinActivity.getResources().getColor(L6.b.ppColorError));
        verificationPatternPinActivity.f26057c.setText(str);
        L8.a.c(verificationPatternPinActivity.f26058d);
    }
}
