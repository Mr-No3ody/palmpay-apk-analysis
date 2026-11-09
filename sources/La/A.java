package La;

import com.transsnet.palmpay.core.bean.req.RiskControlOtcReq;
import com.transsnet.palmpay.core.bean.req.VerifyRiskControlSmsReq;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.ui.mvp.contract.RiskControlCheckOtcContact;

/* JADX INFO: loaded from: classes3.dex */
public final class A extends com.transsnet.palmpay.core.base.j implements RiskControlCheckOtcContact.Presenter {
    @Override // com.transsnet.palmpay.core.ui.mvp.contract.RiskControlCheckOtcContact.Presenter
    public final void checkSms(VerifyRiskControlSmsReq verifyRiskControlSmsReq) {
        ((RiskControlCheckOtcContact.View) this.f27351a).showLoadingView(true);
        ((PayApiService) p324va.c.f43141a.f14621b).verifyRiskControlSms(verifyRiskControlSmsReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new z(this));
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.RiskControlCheckOtcContact.Presenter
    public final void sendSms(int i7, int i10) {
        ((RiskControlCheckOtcContact.View) this.f27351a).showLoadingView(true);
        RiskControlOtcReq riskControlOtcReq = new RiskControlOtcReq();
        riskControlOtcReq.scene = i7;
        riskControlOtcReq.voiceSms = i10;
        ((PayApiService) p324va.c.f43141a.f14621b).sendPayVerifySms(riskControlOtcReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new y(this));
    }
}
