package p310ub;

import Pa.n0;
import android.text.TextUtils;
import com.transsnet.palmpay.core.bean.req.SmsActionReq;
import com.transsnet.palmpay.core.listener.OnSendCodeListener;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcOtpVerifyActivity;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.util.KeyboardUtils;
import kotlin.jvm.internal.Intrinsics;
import p071ef.b;
import p298tf.f;
import p324va.c;

/* JADX INFO: renamed from: ub.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2110x0 implements PinEntryView.OnPinEnteredListener, OnSendCodeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OcOtpVerifyActivity f42945a;

    public /* synthetic */ C2110x0(OcOtpVerifyActivity ocOtpVerifyActivity) {
        this.f42945a = ocOtpVerifyActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.PinEntryView.OnPinEnteredListener
    public void onPinEntered(String code) {
        int i7 = OcOtpVerifyActivity.f29624v0;
        Intrinsics.checkNotNullParameter(code, "code");
        OcOtpVerifyActivity ocOtpVerifyActivity = this.f42945a;
        ocOtpVerifyActivity.f29633u0 = code;
        if (TextUtils.isEmpty(code) || code.length() < 4) {
            return;
        }
        KeyboardUtils.hideSoftInput(ocOtpVerifyActivity);
        SmsActionReq smsActionReq = new SmsActionReq();
        smsActionReq.businessType = 15;
        smsActionReq.phoneNo = OcOtpVerifyActivity.y();
        smsActionReq.smsCode = code;
        smsActionReq.email = ocOtpVerifyActivity.z().getEmail();
        ocOtpVerifyActivity.showLoadingDialog(true);
        ((PayApiService) c.f43141a.f14621b).checkSmsCode(smsActionReq).k(f.f42629b).i(b.a()).subscribe(new C2114z0(ocOtpVerifyActivity));
    }

    @Override // com.transsnet.palmpay.core.listener.OnSendCodeListener
    public void onSend(int i7, int i10, String str) {
        int i11 = OcOtpVerifyActivity.f29624v0;
        this.f42945a.A(i7);
        n0.g().m("OcOtpVerifyActivity_element_click", "otp_view", "sendSms");
    }
}
