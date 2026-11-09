package La;

import com.transsnet.palmpay.core.bean.rsp.VerifyRiskControlSmsRsp;
import com.transsnet.palmpay.core.ui.mvp.contract.RiskControlCheckOtcContact;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ A f5610f;

    public z(A a3) {
        this.f5610f = a3;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f5610f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ToastUtils.showLong(str);
        ((RiskControlCheckOtcContact.View) this.f5610f.f27351a).showLoadingView(false);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        VerifyRiskControlSmsRsp verifyRiskControlSmsRsp = (VerifyRiskControlSmsRsp) obj;
        A a3 = this.f5610f;
        ((RiskControlCheckOtcContact.View) a3.f27351a).showLoadingView(false);
        if (verifyRiskControlSmsRsp.isSuccess()) {
            ((RiskControlCheckOtcContact.View) a3.f27351a).handleCheckResult(verifyRiskControlSmsRsp);
        } else {
            ((RiskControlCheckOtcContact.View) a3.f27351a).showErrorMessage(verifyRiskControlSmsRsp.getRespMsg());
        }
    }
}
