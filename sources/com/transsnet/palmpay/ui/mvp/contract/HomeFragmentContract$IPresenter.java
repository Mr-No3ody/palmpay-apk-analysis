package com.transsnet.palmpay.ui.mvp.contract;

import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.main.export.bean.req.ClaimRewardReq;
import com.transsnet.palmpay.main.export.bean.req.ClearRewardCacheReq;

/* JADX INFO: loaded from: classes4.dex */
public interface HomeFragmentContract$IPresenter<T> extends IBasePresenter<T> {
    void claimRewardsCenterReward(ClaimRewardReq claimRewardReq);

    void claimTaskCenterReward(String str);

    void clearRewardsResultCache(ClearRewardCacheReq clearRewardCacheReq);

    void loanEnterPreCheck();

    void queryClipboardMatchInfo(String str);

    boolean queryHomeAccountInfo(boolean z3);

    void queryHomeBannerInfo(boolean z3);

    void queryHomeBusinessInfo();

    void queryHomeRewardTasks();

    void queryLastTransactionHistory();

    void queryMeTabTotalAssetInfo();

    void queryMenuList();

    void queryMessages();

    void smDialogShown(String str);
}
