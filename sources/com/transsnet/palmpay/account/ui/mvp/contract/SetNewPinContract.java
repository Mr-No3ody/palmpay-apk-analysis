package com.transsnet.palmpay.account.ui.mvp.contract;

import com.transsnet.palmpay.account.bean.ChangeTempPinRsp;
import com.transsnet.palmpay.account.bean.SignUpRsp;
import com.transsnet.palmpay.account.bean.req.ResetPinNoTokenReq;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes3.dex */
public interface SetNewPinContract {

    public interface Presenter extends IBasePresenter<View> {
        void changeTempPin(String str, String str2, String str3);

        void login(String str, String str2);

        void resetPin(ResetPinNoTokenReq resetPinNoTokenReq);
    }

    public interface View extends IBaseView {
        void AutoLoginFail();

        void handleChangePinResult(CommonResult commonResult);

        void loginFailShowDialog(String str);

        void loginSuccess(SignUpRsp signUpRsp);

        void showChangeTempPinResult(CommonBeanResult<ChangeTempPinRsp> commonBeanResult);

        void showLoadingView(boolean z3);

        void showSuccessDialog();
    }
}
