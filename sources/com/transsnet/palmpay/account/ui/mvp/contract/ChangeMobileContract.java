package com.transsnet.palmpay.account.ui.mvp.contract;

import com.transsnet.palmpay.account.bean.SendSmsNewV2Rsp;
import com.transsnet.palmpay.account.bean.req.ChangePhoneNoTokenReq;
import com.transsnet.palmpay.account.bean.rsp.CheckPinRsp;
import com.transsnet.palmpay.account.bean.rsp.GetSecurityFlowRsp;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.req.SmsActionReq;

/* JADX INFO: loaded from: classes3.dex */
public interface ChangeMobileContract {

    public interface Presenter extends IBasePresenter<View> {
        void changePhone(ChangePhoneNoTokenReq changePhoneNoTokenReq, String str);

        void checkPhoneIsReg(String str);

        void checkPin(String str, String str2);

        void getSecurityFlow(String str);

        void sendSms(SmsActionReq smsActionReq);
    }

    public interface View extends IBaseView {
        default void handChangeNumberResult(CommonResult commonResult) {
        }

        default void handCheckSmsResult(boolean z3, String str) {
        }

        default void handSendMessageResult(CommonResult commonResult) {
        }

        default void handSendSmsMessageResult(SendSmsNewV2Rsp sendSmsNewV2Rsp) {
        }

        default void handleCheckNumberResult(CommonResult commonResult, String str) {
        }

        default void handleCheckPinRsp(CommonBeanResult<CheckPinRsp> commonBeanResult) {
        }

        default void handleSecurityFlowResult(GetSecurityFlowRsp getSecurityFlowRsp) {
        }

        void showLoadingView(boolean z3);
    }
}
