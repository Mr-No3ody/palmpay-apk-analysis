package com.transsnet.palmpay.account.ui.mvp.contract;

import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.rsp.QueryUiResourceRsp1;

/* JADX INFO: loaded from: classes3.dex */
public interface LoginInputMobileContact {

    public interface Presenter extends IBasePresenter<View> {
        void checkMobileNumber(String str, String str2);

        void queryConfig();
    }

    public interface View extends IBaseView {
        default void handleConfig(QueryUiResourceRsp1 queryUiResourceRsp1) {
        }

        void onCheckMobileNumberResult(CommonBeanResult<PreCheckPhoneRsp> commonBeanResult);

        void showLoadingView(boolean z3);
    }
}
