package p310ub;

import C0.G;
import Z4.e;
import com.transsnet.palmpay.core.bean.rsp.SmsActionRsp;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV2View;
import com.transsnet.palmpay.credit.bean.req.OcApplyData;
import com.transsnet.palmpay.credit.bean.req.OcSaveSmsTokenReq;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcOtpVerifyActivity;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;
import p071ef.b;
import p221ob.c;
import p294tb.C2055q;
import p298tf.f;

/* JADX INFO: renamed from: ub.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2114z0 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ OcOtpVerifyActivity f42954f;

    public C2114z0(OcOtpVerifyActivity ocOtpVerifyActivity) {
        this.f42954f = ocOtpVerifyActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f42954f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f42954f.showLoadingDialog(false);
        ToastUtils.showLong(message, new Object[0]);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        PinEntryView pinEntryView;
        SmsActionRsp smsActionRsp = (SmsActionRsp) obj;
        OcOtpVerifyActivity ocOtpVerifyActivity = this.f42954f;
        ocOtpVerifyActivity.showLoadingDialog(false);
        if (smsActionRsp != null && smsActionRsp.isSuccess()) {
            ocOtpVerifyActivity.f29632t0 = smsActionRsp.data.getSmsToken();
            IApiCreditService iApiCreditServiceH = G.h(c.f40268a);
            OcApplyData ocApplyData = ocOtpVerifyActivity.f29248B;
            iApiCreditServiceH.ocSaveSmsCode(new OcSaveSmsTokenReq(ocApplyData != null ? ocApplyData.getApplyId() : null, ocOtpVerifyActivity.f29632t0)).k(f.f42629b).i(b.a()).subscribe(new C2055q(ocOtpVerifyActivity, 22));
            return;
        }
        ToastUtils.showLong(smsActionRsp != null ? smsActionRsp.getRespMsg() : null, new Object[0]);
        int i7 = OcOtpVerifyActivity.f29624v0;
        OneTimeCodeV2View oneTimeCodeV2ViewZ = ocOtpVerifyActivity.z();
        if (oneTimeCodeV2ViewZ == null || (pinEntryView = oneTimeCodeV2ViewZ.f28453b) == null) {
            return;
        }
        pinEntryView.setText("");
    }
}
