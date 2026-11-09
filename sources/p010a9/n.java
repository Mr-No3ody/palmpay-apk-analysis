package p010a9;

import Bc.D;
import G8.a;
import L6.b;
import Pa.n0;
import Pa.r0;
import android.view.View;
import androidx.fragment.app.E;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.transsnet.palmpay.account.ui.activity.SignUpActivity;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStepInputPinV2Fragment;
import com.transsnet.palmpay.core.viewmodel.c;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.util.KeyboardUtils;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SignUpStepInputPinV2Fragment f11853b;

    public /* synthetic */ n(SignUpStepInputPinV2Fragment signUpStepInputPinV2Fragment, int i7) {
        this.f11852a = i7;
        this.f11853b = signUpStepInputPinV2Fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PinEntryView pinEntryView;
        PinEntryView pinEntryView2;
        SignUpStepInputPinV2Fragment signUpStepInputPinV2Fragment = this.f11853b;
        switch (this.f11852a) {
            case 0:
                SignUpStepInputPinV2Fragment.a aVar = SignUpStepInputPinV2Fragment.f26273A;
                signUpStepInputPinV2Fragment.y(true);
                break;
            case 1:
                SignUpStepInputPinV2Fragment.a aVar2 = SignUpStepInputPinV2Fragment.f26273A;
                SignUpActivity signUpActivityV = signUpStepInputPinV2Fragment.v();
                if (signUpActivityV != null) {
                    signUpActivityV.onBackPressed();
                }
                break;
            case 2:
                SignUpStepInputPinV2Fragment.a aVar3 = SignUpStepInputPinV2Fragment.f26273A;
                if (!r0.U0()) {
                    boolean z3 = true ^ signUpStepInputPinV2Fragment.f26276p;
                    signUpStepInputPinV2Fragment.f26276p = z3;
                    D d2 = signUpStepInputPinV2Fragment.f26274j;
                    if (d2 != null && (pinEntryView2 = (PinEntryView) d2.f627w) != null) {
                        pinEntryView2.d(z3);
                    }
                    D d10 = signUpStepInputPinV2Fragment.f26274j;
                    if (d10 != null && (pinEntryView = (PinEntryView) d10.f614A) != null) {
                        pinEntryView.d(signUpStepInputPinV2Fragment.f26276p);
                    }
                    signUpStepInputPinV2Fragment.A(signUpStepInputPinV2Fragment.f26276p);
                    break;
                }
                break;
            case 3:
                SignUpStepInputPinV2Fragment.a aVar4 = SignUpStepInputPinV2Fragment.f26273A;
                n0.g().l("SignUp_click_Invitation_Code");
                KeyboardUtils.hideSoftInput(signUpStepInputPinV2Fragment.getActivity());
                c cVar = signUpStepInputPinV2Fragment.t;
                if (cVar != null) {
                    cVar.d();
                }
                D d11 = signUpStepInputPinV2Fragment.f26274j;
                if (d11 != null && h.e((PpFormVertical) d11.f617c)) {
                    D d12 = signUpStepInputPinV2Fragment.f26274j;
                    if (d12 != null) {
                        IconicsImageView iconicsImageView = (IconicsImageView) d12.f618d;
                        E activity = signUpStepInputPinV2Fragment.getActivity();
                        iconicsImageView.setImageDrawable(activity != null ? a.x(activity, S6.a.pay_Arrowdown, null, Integer.valueOf(b.ppColorPrimary), 24.0f, 114) : null);
                    }
                    D d13 = signUpStepInputPinV2Fragment.f26274j;
                    if (d13 != null) {
                        h.c((PpFormVertical) d13.f617c);
                    }
                    D d14 = signUpStepInputPinV2Fragment.f26274j;
                    if (d14 != null) {
                        ((PpFormVertical) d14.f617c).setEditContent("");
                    }
                } else {
                    D d15 = signUpStepInputPinV2Fragment.f26274j;
                    if (d15 != null) {
                        IconicsImageView iconicsImageView2 = (IconicsImageView) d15.f618d;
                        E activity2 = signUpStepInputPinV2Fragment.getActivity();
                        iconicsImageView2.setImageDrawable(activity2 != null ? a.x(activity2, S6.a.pay_ArrowUp, null, Integer.valueOf(b.ppColorPrimary), 24.0f, 114) : null);
                    }
                    D d16 = signUpStepInputPinV2Fragment.f26274j;
                    if (d16 != null) {
                        h.C((PpFormVertical) d16.f617c);
                    }
                }
                break;
            default:
                n0.g().l("SignUpSetPINPopupQuit");
                signUpStepInputPinV2Fragment.f26275o = true;
                E activity3 = signUpStepInputPinV2Fragment.getActivity();
                if (activity3 != null) {
                    activity3.onBackPressed();
                }
                break;
        }
    }
}
