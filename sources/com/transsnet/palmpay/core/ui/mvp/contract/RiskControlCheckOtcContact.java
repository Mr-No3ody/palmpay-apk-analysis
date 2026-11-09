package com.transsnet.palmpay.core.ui.mvp.contract;

import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.req.VerifyRiskControlSmsReq;
import com.transsnet.palmpay.core.bean.rsp.VerifyRiskControlSmsRsp;

/* JADX INFO: loaded from: classes3.dex */
public interface RiskControlCheckOtcContact {

    public interface Presenter extends IBasePresenter<View> {
        void checkSms(VerifyRiskControlSmsReq verifyRiskControlSmsReq);

        void sendSms(int i7, int i10);
    }

    public interface View extends IBaseView {
        void handleCheckResult(VerifyRiskControlSmsRsp verifyRiskControlSmsRsp);

        void showErrorMessage(String str);

        void showLoadingView(boolean z3);
    }
}
