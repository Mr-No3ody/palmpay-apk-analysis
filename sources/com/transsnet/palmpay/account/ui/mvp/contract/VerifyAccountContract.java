package com.transsnet.palmpay.account.ui.mvp.contract;

import com.transsnet.palmpay.account.bean.SendSmsNewV2Rsp;
import com.transsnet.palmpay.account.bean.SmsActionRsp;
import com.transsnet.palmpay.account.bean.rsp.CheckPinRsp;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.req.SmsActionReq;

/* JADX INFO: loaded from: classes3.dex */
public interface VerifyAccountContract {

    public interface Presenter extends IBasePresenter<View> {
        void checkPin(String str);

        void getSmsCode(SmsActionReq smsActionReq);

        void getSmsToken(SmsActionReq smsActionReq);
    }

    public interface View extends IBaseView {
        default void handCheckPinResult(CommonBeanResult<CheckPinRsp> commonBeanResult) {
        }

        default void handleSendSmsRsp(SmsActionReq smsActionReq, SendSmsNewV2Rsp sendSmsNewV2Rsp) {
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
