package com.transsnet.palmpay.account.ui.mvp.contract;

import com.transsnet.palmpay.account.bean.ResetPinVerifyListRsp;
import com.transsnet.palmpay.account.bean.SendSmsNewV2Rsp;
import com.transsnet.palmpay.account.bean.SmsActionRsp;
import com.transsnet.palmpay.account.bean.rsp.GetSecurityFlowRsp;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.req.SmsActionReq;

/* JADX INFO: loaded from: classes3.dex */
public interface ResetPinContract {

    public interface Presenter extends IBasePresenter<View> {
        void checkSmsCode(SmsActionReq smsActionReq);

        void getResetPinVerifyList(String str);

        void getSecurityFlow(String str);

        void sendSms(SmsActionReq smsActionReq);
    }

    public interface View extends IBaseView {
        void handleCheckSmsResult(SmsActionRsp smsActionRsp);

        void handleResetPinVerifyListRsp(CommonBeanResult<ResetPinVerifyListRsp> commonBeanResult);

        void handleSecurityFlow(GetSecurityFlowRsp getSecurityFlowRsp);

        void handleSendSmsResult(SmsActionReq smsActionReq, SendSmsNewV2Rsp sendSmsNewV2Rsp);

        void showLoadingView(boolean z3);
    }
}
