package com.transsnet.palmpay.account.ui.mvp.contract;

import com.transsnet.palmpay.account.bean.RegularRuleRsp;
import com.transsnet.palmpay.account.bean.req.ChangeUserInfoReq;
import com.transsnet.palmpay.account.bean.req.ModifyMemberInfoReq;
import com.transsnet.palmpay.account.bean.req.VerifyRealNameReq;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes3.dex */
public interface VerifyRealNameContract {

    public interface Presenter extends IBasePresenter<View> {
        void addMiddleName(String str);

        void changeName(ChangeUserInfoReq changeUserInfoReq);

        void getRegularRule(boolean z3);

        void verifyMobileNumberRealName(ModifyMemberInfoReq modifyMemberInfoReq);

        void verifyName(VerifyRealNameReq verifyRealNameReq);
    }

    public interface View extends IBaseView {
        void handleRegularRule(RegularRuleRsp regularRuleRsp, boolean z3);

        void handleVerifyName(CommonResult commonResult);

        void showLoadingView(boolean z3);
    }
}
