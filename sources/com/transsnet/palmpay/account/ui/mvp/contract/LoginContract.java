package com.transsnet.palmpay.account.ui.mvp.contract;

import com.transsnet.palmpay.account.bean.LogInReq;
import com.transsnet.palmpay.account.bean.SendSmsNewV2Rsp;
import com.transsnet.palmpay.account.bean.SignUpRsp;
import com.transsnet.palmpay.account.bean.SmsActionRsp;
import com.transsnet.palmpay.account.bean.rsp.CheckPasswordRsp;
import com.transsnet.palmpay.account.bean.rsp.CheckPinRsp;
import com.transsnet.palmpay.account.bean.rsp.GetSecurityFlowRsp;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.req.ShareAccountDetailReq;
import com.transsnet.palmpay.core.bean.req.SmsActionReq;
import com.transsnet.palmpay.core.bean.rsp.QueryUiResourceRsp1;
import com.transsnet.palmpay.core.bean.rsp.ShareAccountDetailBean;

/* JADX INFO: loaded from: classes3.dex */
public interface LoginContract {

    public interface Presenter extends IBasePresenter<View> {
        void checkMobileNumber(String str, String str2);

        void checkPassword(String str, String str2, int i7);

        void checkPin(String str, String str2, int i7);

        void checkSmsCode(String str, String str2, String str3, int i7);

        void getSmsCode(String str, String str2, int i7, int i10);

        void login(LogInReq logInReq);

        void queryConfig();

        void queryShareAccountDetail(ShareAccountDetailReq shareAccountDetailReq);
    }

    public interface View extends IBaseView {
        default void handleCheckPasswordResult(CommonBeanResult<CheckPasswordRsp> commonBeanResult, int i7) {
        }

        default void handleCheckPinResult(CommonBeanResult<CheckPinRsp> commonBeanResult, int i7) {
        }

        default void handleConfig(QueryUiResourceRsp1 queryUiResourceRsp1) {
        }

        default void handleLoginResult(LogInReq logInReq, CommonBeanResult<SignUpRsp> commonBeanResult, String str) {
        }

        default void handleSecurityFlowResult(GetSecurityFlowRsp getSecurityFlowRsp) {
        }

        default void handleSendSmsResult(SmsActionReq smsActionReq, SendSmsNewV2Rsp sendSmsNewV2Rsp) {
        }

        default void handleShareAccountDetailResult(CommonBeanResult<ShareAccountDetailBean> commonBeanResult) {
        }

        default void onCheckMobileNumberResult(CommonBeanResult<PreCheckPhoneRsp> commonBeanResult) {
        }

        default void onGetSmsTokenFail(String str) {
        }

        default void onSmsTokenReceived(SmsActionRsp.DataBean dataBean) {
        }

        void showLoadingView(boolean z3);

        default void updateSendSmsButton(boolean z3) {
        }
    }
}
