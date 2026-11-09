package com.transsnet.palmpay.credit.contract;

import android.content.Context;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonLongResult;
import com.transsnet.palmpay.credit.bean.resp.OcInviteListResp;
import com.transsnet.palmpay.credit.bean.resp.OcMarqueeResp;
import com.transsnet.palmpay.credit.bean.resp.OcSumRewardResp;
import com.transsnet.palmpay.credit.bean.resp.ReferEarnHomeResp;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/contract/OcReferEarnHomeContract;", "", "View", "Presenter", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface OcReferEarnHomeContract {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0004H&J\b\u0010\t\u001a\u00020\u0004H&J\b\u0010\n\u001a\u00020\u0004H&J(\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011H&¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/credit/contract/OcReferEarnHomeContract$Presenter;", "Lcom/transsnet/palmpay/core/base/IBasePresenter;", "Lcom/transsnet/palmpay/credit/contract/OcReferEarnHomeContract$View;", "queryReferEarnHome", "", "okCardBaseAmount", "querySumReward", "queryHasUnfreeze", "inviteList", "queryMarquee", "withdraw", "inviteSms", "context", "Landroid/content/Context;", "phones", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Presenter extends IBasePresenter<View> {
        void inviteList();

        void inviteSms(@NotNull Context context, @NotNull ArrayList<String> phones);

        void okCardBaseAmount();

        void queryHasUnfreeze();

        void queryMarquee();

        void queryReferEarnHome();

        void querySumReward();

        void withdraw();
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0013H&¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/credit/contract/OcReferEarnHomeContract$View;", "Lcom/transsnet/palmpay/core/base/IBaseView;", "showLoadingView", "", "show", "", "hasUnfreeze", "sumRewardResult", "result", "Lcom/transsnet/palmpay/credit/bean/resp/OcSumRewardResp;", "queryMarqueeResult", "Lcom/transsnet/palmpay/credit/bean/resp/OcMarqueeResp;", "withdrawResult", "", "inviteListResult", "Lcom/transsnet/palmpay/credit/bean/resp/OcInviteListResp;", "queryReferEarnHomeResult", "Lcom/transsnet/palmpay/credit/bean/resp/ReferEarnHomeResp;", "okCardBaseAmountResult", "Lcom/transsnet/palmpay/core/bean/CommonLongResult;", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface View extends IBaseView {
        void hasUnfreeze();

        void inviteListResult(@NotNull OcInviteListResp result);

        void okCardBaseAmountResult(@NotNull CommonLongResult result);

        void queryMarqueeResult(@NotNull OcMarqueeResp result);

        void queryReferEarnHomeResult(@NotNull ReferEarnHomeResp result);

        void showLoadingView(boolean show);

        void sumRewardResult(@NotNull OcSumRewardResp result);

        void withdrawResult(int result);
    }
}
