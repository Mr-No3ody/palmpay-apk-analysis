package com.transsnet.palmpay.jara_packet.ui.mvp.contract;

import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.jara_packet.bean.resp.CommentResp;
import com.transsnet.palmpay.jara_packet.bean.resp.RankListResp;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnPersonalRankResp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/ui/mvp/contract/ReferEarnRankContract;", "", "View", "Presenter", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ReferEarnRankContract {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0004H&¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/ui/mvp/contract/ReferEarnRankContract$Presenter;", "Lcom/transsnet/palmpay/core/base/IBasePresenter;", "Lcom/transsnet/palmpay/jara_packet/ui/mvp/contract/ReferEarnRankContract$View;", "queryPersonalRank", "", "queryComment", "queryRankList", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Presenter extends IBasePresenter<View> {
        void queryComment();

        void queryPersonalRank();

        void queryRankList();
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH&J\u0016\u0010\u000f\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bH&¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/ui/mvp/contract/ReferEarnRankContract$View;", "Lcom/transsnet/palmpay/core/base/IBaseView;", "showLoadingView", "", "show", "", "showToastDialog", "msg", "", "personalRankResult", "resp", "Lcom/transsnet/palmpay/core/bean/CommonBeanResult;", "Lcom/transsnet/palmpay/jara_packet/bean/resp/ReferEarnPersonalRankResp;", "commentListResult", "Lcom/transsnet/palmpay/jara_packet/bean/resp/CommentResp;", "rankListResult", "Lcom/transsnet/palmpay/jara_packet/bean/resp/RankListResp;", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface View extends IBaseView {
        void commentListResult(@NotNull CommonBeanResult<CommentResp> resp);

        void personalRankResult(@NotNull CommonBeanResult<ReferEarnPersonalRankResp> resp);

        void rankListResult(@NotNull CommonBeanResult<RankListResp> resp);

        void showLoadingView(boolean show);

        void showToastDialog(@NotNull String msg);
    }
}
