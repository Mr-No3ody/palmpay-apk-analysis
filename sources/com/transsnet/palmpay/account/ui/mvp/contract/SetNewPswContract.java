package com.transsnet.palmpay.account.ui.mvp.contract;

import com.transsnet.palmpay.account.bean.ChangeTempPinReq;
import com.transsnet.palmpay.account.bean.ChangeTempPinRsp;
import com.transsnet.palmpay.account.bean.req.ResetPasswordReq;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes3.dex */
public interface SetNewPswContract {

    public interface Presenter extends IBasePresenter<View> {
        void resetPassword(ResetPasswordReq resetPasswordReq);

        void resetTempPassword(ChangeTempPinReq changeTempPinReq);
    }

    public interface View extends IBaseView {
        void handleResetPasswordResult(CommonResult commonResult);

        void handleResetTempPasswordResult(CommonBeanResult<ChangeTempPinRsp> commonBeanResult);

        void showLoadingView(boolean z3);
    }
}
