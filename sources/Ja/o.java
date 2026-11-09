package Ja;

import android.text.TextUtils;
import com.transsnet.palmpay.core.bean.req.RiskControlOtcReq;
import com.transsnet.palmpay.core.callback.PayVerificationCallback;
import com.transsnet.palmpay.core.listener.OnSendCodeListener;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckPalmPayOtpFragment;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeView;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.util.KeyboardUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements OnSendCodeListener, PinEntryView.OnPinEnteredListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CheckPalmPayOtpFragment f4669a;

    public /* synthetic */ o(CheckPalmPayOtpFragment checkPalmPayOtpFragment) {
        this.f4669a = checkPalmPayOtpFragment;
    }

    @Override // com.transsnet.palmpay.custom_view.PinEntryView.OnPinEnteredListener
    public void onPinEntered(String code) {
        CheckPalmPayOtpFragment.a aVar = CheckPalmPayOtpFragment.f27988o;
        Intrinsics.checkNotNullParameter(code, "code");
        if (TextUtils.isEmpty(code) || code.length() < 6) {
            return;
        }
        CheckPalmPayOtpFragment checkPalmPayOtpFragment = this.f4669a;
        OneTimeCodeView oneTimeCodeViewT = checkPalmPayOtpFragment.t();
        if (oneTimeCodeViewT != null) {
            oneTimeCodeViewT.b();
        }
        KeyboardUtils.hideSoftInput(checkPalmPayOtpFragment.getActivity());
        PayVerificationCallback payVerificationCallback = (PayVerificationCallback) checkPalmPayOtpFragment.getActivity();
        if (payVerificationCallback != null) {
            payVerificationCallback.verifyPayMethod(code, 8);
        }
    }

    @Override // com.transsnet.palmpay.core.listener.OnSendCodeListener
    public void onSend(int i7, int i10, String str) {
        CheckPalmPayOtpFragment.a aVar = CheckPalmPayOtpFragment.f27988o;
        CheckPalmPayOtpFragment checkPalmPayOtpFragment = this.f4669a;
        OneTimeCodeView oneTimeCodeViewT = checkPalmPayOtpFragment.t();
        if (oneTimeCodeViewT != null) {
            oneTimeCodeViewT.b();
        }
        KeyboardUtils.hideSoftInput(checkPalmPayOtpFragment.getActivity());
        RiskControlOtcReq riskControlOtcReq = new RiskControlOtcReq();
        riskControlOtcReq.scene = 0;
        riskControlOtcReq.voiceSms = i7;
        ((PayApiService) p324va.c.f43141a.f14621b).sendPayVerifySms(riskControlOtcReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new q(checkPalmPayOtpFragment, i7, 0));
    }
}
