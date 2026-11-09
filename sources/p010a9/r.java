package p010a9;

import Pa.n0;
import android.view.View;
import androidx.fragment.app.E;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStepOtcFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SignUpStepOtcFragment f11861b;

    public /* synthetic */ r(SignUpStepOtcFragment signUpStepOtcFragment, int i7) {
        this.f11860a = i7;
        this.f11861b = signUpStepOtcFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SignUpStepOtcFragment signUpStepOtcFragment = this.f11861b;
        switch (this.f11860a) {
            case 0:
                SignUpStepOtcFragment.a aVar = SignUpStepOtcFragment.f26279v;
                E activity = signUpStepOtcFragment.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                break;
            default:
                n0.g().l("SignUpOtpPopupQuit");
                signUpStepOtcFragment.t = true;
                E activity2 = signUpStepOtcFragment.getActivity();
                if (activity2 != null) {
                    activity2.onBackPressed();
                }
                break;
        }
    }
}
