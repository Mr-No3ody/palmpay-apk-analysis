package com.transsnet.palmpay.account.ui.mvp.contract;

import android.content.Context;
import com.transsnet.palmpay.account.bean.RegularRuleRsp;
import com.transsnet.palmpay.account.bean.SignUpReq;
import com.transsnet.palmpay.account.bean.req.NameCheckReq;
import com.transsnet.palmpay.account.bean.req.SignUpSuccessCouponReq;
import com.transsnet.palmpay.account.bean.rsp.CountryRegionList;
import com.transsnet.palmpay.account.bean.rsp.NameCheckRsp;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.bean.rsp.PreSignUpRsp;
import com.transsnet.palmpay.account.bean.rsp.RegisterCouponResp;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.MemberInfo;
import com.transsnet.palmpay.core.bean.rsp.QueryUiResourceRsp1;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface SignUpContract {

    public interface Presenter extends IBasePresenter<View> {
        boolean checkInvitationCode(String str);

        void checkMobileNumber(String str, String str2);

        void checkName(NameCheckReq nameCheckReq);

        void getRegularRule(boolean z3);

        void preSignUp(SignUpReq signUpReq);

        void queryAppConfig();

        void queryRegionList(boolean z3);

        void queryRegisterCoupon(SignUpSuccessCouponReq signUpSuccessCouponReq);

        void updateUser(boolean z3);

        void verifyMtnNumber(Context context, String str, String str2);
    }

    public interface View extends IBaseView {
        default void handleAppConfigResult(QueryUiResourceRsp1 queryUiResourceRsp1) {
        }

        default void handleCheckInvitationCode(CommonResult commonResult) {
        }

        default void handleCheckName(CommonBeanResult<NameCheckRsp> commonBeanResult) {
        }

        default void handleCountryRegionListData(boolean z3, List<CountryRegionList> list) {
        }

        default void handlePreSignUpResult(CommonBeanResult<PreSignUpRsp> commonBeanResult) {
        }

        default void handleRegisterCoupon(CommonBeanResult<RegisterCouponResp> commonBeanResult) {
        }

        default void handleRegularRule(RegularRuleRsp regularRuleRsp, boolean z3) {
        }

        default void handleUserInfo(CommonBeanResult<MemberInfo> commonBeanResult, boolean z3) {
        }

        default void handleVerifyMtnNumber(boolean z3, String str) {
        }

        default void onCheckMobileNumberResult(CommonBeanResult<PreCheckPhoneRsp> commonBeanResult) {
        }

        void showLoadingView(boolean z3);
    }
}
