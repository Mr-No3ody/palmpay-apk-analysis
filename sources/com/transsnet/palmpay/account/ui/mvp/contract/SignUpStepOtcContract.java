package com.transsnet.palmpay.account.ui.mvp.contract;

import com.transsnet.palmpay.account.bean.SendSmsNewV2Rsp;
import com.transsnet.palmpay.account.bean.SmsActionRsp;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.req.SmsActionReq;

/* JADX INFO: loaded from: classes3.dex */
public interface SignUpStepOtcContract {

    public interface Presenter extends IBasePresenter<View> {
        void getSmsCode(int i7);

        void getSmsToken(String str, String str2);
    }

    public interface View extends IBaseView {
        String getEmail();

        String getFullMobileNumber();

        void handleSendSmsRsp(SmsActionReq smsActionReq, SendSmsNewV2Rsp sendSmsNewV2Rsp);

        void onGetSmsTokenFail(String str);

        void onSmsTokenReceived(SmsActionRsp.DataBean dataBean);

        void showLoadingView(boolean z3);

        void updateSendSmsButton(boolean z3);
    }
}
