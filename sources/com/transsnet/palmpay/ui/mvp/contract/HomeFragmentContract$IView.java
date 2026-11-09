package com.transsnet.palmpay.ui.mvp.contract;

import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.LastPayerDataBean;
import com.transsnet.palmpay.core.bean.message.GetMsgRsp;
import com.transsnet.palmpay.core.bean.rsp.ClipboardMatchInfoResp;
import com.transsnet.palmpay.core.bean.rsp.UnReadMsgCntRsp;
import com.transsnet.palmpay.credit.bean.LoanEnterPreCheckInfo;
import com.transsnet.palmpay.main.export.bean.rsp.GetHomeCommonRsp;
import com.transsnet.palmpay.main.export.bean.rsp.HomeCouponAreaRsp;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardTasksRsp;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsCenterRsp;
import com.transsnet.palmpay.main.export.bean.rsp.HomeTaskCenterRsp;
import com.transsnet.palmpay.main.export.bean.rsp.HomeWealthProductRsp;
import com.transsnet.palmpay.main.export.bean.rsp.MeTabTotalAssetInfo;
import com.transsnet.palmpay.main.export.bean.rsp.QueryHomeAccountInfoRsp;
import com.transsnet.palmpay.main.export.bean.rsp.SlideMenuListRsp;
import com.transsnet.palmpay.main.export.bean.rsp.TaskCenterRewardResultBean;
import com.transsnet.palmpay.main.export.bean.rsp.TransactionHistoryBean;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface HomeFragmentContract$IView extends IBaseView {
    default void handleClaimRewardsCenterRewardResult(CommonResult commonResult) {
    }

    default void handleClearRewardsResultCacheResult(CommonResult commonResult) {
    }

    default void handleClipboardMatchInfo(String str, ClipboardMatchInfoResp clipboardMatchInfoResp) {
    }

    default void handleHomeAccountInfo(QueryHomeAccountInfoRsp queryHomeAccountInfoRsp) {
    }

    default void handleHomeRewards(HomeRewardTasksRsp homeRewardTasksRsp) {
    }

    default void handleHomeRewardsCenter(HomeRewardsCenterRsp homeRewardsCenterRsp) {
    }

    default void handleHomeTaskCenter(HomeTaskCenterRsp homeTaskCenterRsp) {
    }

    default void handleHomeWealthResult(HomeWealthProductRsp homeWealthProductRsp) {
    }

    default void handleImportantNotice(List<GetMsgRsp.DataBean.ListBean> list) {
    }

    default void handleLastPayer(LastPayerDataBean lastPayerDataBean) {
    }

    default void handleLoanPreCheckInfoResult(CommonBeanResult<LoanEnterPreCheckInfo> commonBeanResult) {
    }

    default void handleMeTabTotalAssetInfo(MeTabTotalAssetInfo meTabTotalAssetInfo) {
    }

    default void handleTaskCenterRewardResult(CommonBeanResult<TaskCenterRewardResultBean> commonBeanResult) {
    }

    default void handleUnreadMsgCntRsp(UnReadMsgCntRsp unReadMsgCntRsp) {
    }

    default void queryHomeCouponAreaOk(HomeCouponAreaRsp homeCouponAreaRsp) {
    }

    default void queryLastTransactionHistoryOk(List<TransactionHistoryBean> list) {
    }

    default void showHomeCommonInfo(GetHomeCommonRsp.DataBean dataBean) {
    }

    @Override // com.transsnet.palmpay.core.base.IBaseView
    void showLoadingDialog(boolean z3);

    default void showSlideMenuList(SlideMenuListRsp slideMenuListRsp) {
    }
}
