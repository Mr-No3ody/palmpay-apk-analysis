package p037c9;

import Bc.C0107d;
import Pa.r0;
import android.text.TextUtils;
import android.widget.TextView;
import com.transsnet.palmpay.account.ui.fragment.verify.VerifyAccountOtpFragment;
import com.transsnet.palmpay.core.bean.req.SmsActionReq;
import com.transsnet.palmpay.core.listener.OnSendCodeListener;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV4View;
import com.transsnet.palmpay.custom_view.PinEntryView;
import kotlin.jvm.internal.Intrinsics;
import p051d9.n0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements OnSendCodeListener, PinEntryView.OnPinEnteredListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VerifyAccountOtpFragment f18879a;

    @Override // com.transsnet.palmpay.custom_view.PinEntryView.OnPinEnteredListener
    public void onPinEntered(String code) {
        C0107d c0107d;
        TextView textView;
        int i7 = VerifyAccountOtpFragment.f26314H;
        Intrinsics.checkNotNullParameter(code, "code");
        boolean zIsEmpty = TextUtils.isEmpty(code);
        VerifyAccountOtpFragment verifyAccountOtpFragment = this.f18879a;
        if (zIsEmpty || code.length() < 4) {
            if (code.length() <= 0 || (c0107d = verifyAccountOtpFragment.f26318o) == null || (textView = ((OneTimeCodeV4View) c0107d.f682d).f28487f) == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        SmsActionReq smsActionReq = new SmsActionReq();
        smsActionReq.businessType = verifyAccountOtpFragment.f26316B;
        smsActionReq.phoneNo = verifyAccountOtpFragment.f26321w;
        smsActionReq.smsCode = code;
        smsActionReq.codeCount = 4;
        smsActionReq.email = verifyAccountOtpFragment.f26320v;
        n0 n0Var = (n0) verifyAccountOtpFragment.f27328i;
        if (n0Var != null) {
            n0Var.getSmsToken(smsActionReq);
        }
    }

    @Override // com.transsnet.palmpay.core.listener.OnSendCodeListener
    public void onSend(int i7, int i10, String str) {
        VerifyAccountOtpFragment verifyAccountOtpFragment = this.f18879a;
        verifyAccountOtpFragment.t = i10;
        if (i7 != 4 || TextUtils.isEmpty(str)) {
            verifyAccountOtpFragment.B(i7);
            return;
        }
        Intrinsics.e(str);
        verifyAccountOtpFragment.f26319p = str;
        if (r0.j(verifyAccountOtpFragment.getActivity(), verifyAccountOtpFragment.t, verifyAccountOtpFragment.f26319p, 740, verifyAccountOtpFragment)) {
            verifyAccountOtpFragment.showLoadingDialog(true);
        }
    }
}
