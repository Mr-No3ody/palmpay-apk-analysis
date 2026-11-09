package p010a9;

import Bc.C0105b;
import Pa.r0;
import android.text.TextUtils;
import android.widget.TextView;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStepOtcFragment;
import com.transsnet.palmpay.core.listener.OnSendCodeListener;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV5View;
import com.transsnet.palmpay.custom_view.PinEntryView;
import kotlin.jvm.internal.Intrinsics;
import p051d9.i0;
import p142ja.f;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements OnSendCodeListener, PinEntryView.OnPinEnteredListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SignUpStepOtcFragment f11859a;

    public /* synthetic */ q(SignUpStepOtcFragment signUpStepOtcFragment) {
        this.f11859a = signUpStepOtcFragment;
    }

    @Override // com.transsnet.palmpay.custom_view.PinEntryView.OnPinEnteredListener
    public void onPinEntered(String code) {
        C0105b c0105b;
        f fVar;
        TextView textView;
        SignUpStepOtcFragment.a aVar = SignUpStepOtcFragment.f26279v;
        Intrinsics.checkNotNullParameter(code, "code");
        boolean zIsEmpty = TextUtils.isEmpty(code);
        SignUpStepOtcFragment signUpStepOtcFragment = this.f11859a;
        if (!zIsEmpty && code.length() >= 4) {
            i0 i0Var = (i0) signUpStepOtcFragment.f27328i;
            if (i0Var != null) {
                i0Var.getSmsToken(signUpStepOtcFragment.getFullMobileNumber(), code);
                return;
            }
            return;
        }
        if (code.length() <= 0 || (c0105b = signUpStepOtcFragment.f26280j) == null || (fVar = ((OneTimeCodeV5View) c0105b.f667g).f28496c) == null || (textView = fVar.tvInputError) == null) {
            return;
        }
        h.s(textView, false);
    }

    @Override // com.transsnet.palmpay.core.listener.OnSendCodeListener
    public void onSend(int i7, int i10, String str) {
        SignUpStepOtcFragment signUpStepOtcFragment = this.f11859a;
        signUpStepOtcFragment.f26282p = i10;
        if (i7 != 4 || TextUtils.isEmpty(str)) {
            i0 i0Var = (i0) signUpStepOtcFragment.f27328i;
            if (i0Var != null) {
                i0Var.getSmsCode(i7);
                return;
            }
            return;
        }
        Intrinsics.e(str);
        signUpStepOtcFragment.f26281o = str;
        if (r0.j(signUpStepOtcFragment.getActivity(), signUpStepOtcFragment.f26282p, signUpStepOtcFragment.f26281o, 740, signUpStepOtcFragment)) {
            signUpStepOtcFragment.showLoadingDialog(true);
        }
    }
}
