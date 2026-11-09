package com.transsnet.palmpay.jara_packet.ui.mvp.contract;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.jara_packet.bean.resp.CommentResp;
import com.transsnet.palmpay.jara_packet.bean.resp.ReInviteListResp;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnHomeResp;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnOrderLatestResp;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnRecordsResp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/ui/mvp/contract/ReferEarnHomePageContract;", "", "View", "Presenter", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ReferEarnHomePageContract {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J \u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH&J\b\u0010\f\u001a\u00020\u0004H&J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\bH&J\b\u0010\u0011\u001a\u00020\u0004H&J\b\u0010\u0012\u001a\u00020\u0004H&J!\u0010\u0013\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\bH&¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/ui/mvp/contract/ReferEarnHomePageContract$Presenter;", "Lcom/transsnet/palmpay/core/base/IBasePresenter;", "Lcom/transsnet/palmpay/jara_packet/ui/mvp/contract/ReferEarnHomePageContract$View;", "queryOrderLatest", "", "queryReferEarnHome", "queryReferEarnRecords", "id", "", "pageNum", "", "pageSize", "queryReferEarnPop", "queryReferEarnWithDrawEnable", "referEarnWithDrawCreate", "queryReferEarnSms", "phone", "commentList", "queryReInviteList", "updateReInviteIsInvite", "", "phoneNo", "(Ljava/lang/Long;Ljava/lang/String;)V", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Presenter extends IBasePresenter<View> {
        void commentList();

        void queryOrderLatest();

        void queryReInviteList();

        void queryReferEarnHome();

        void queryReferEarnPop();

        void queryReferEarnRecords(@NotNull String id2, int pageNum, int pageSize);

        void queryReferEarnSms(@NotNull String phone);

        void queryReferEarnWithDrawEnable(@Nullable String id2);

        void referEarnWithDrawCreate(@Nullable String id2);

        void updateReInviteIsInvite(@Nullable Long id2, @Nullable String phoneNo);
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H&J\u0016\u0010\u0012\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010H&J\u0016\u0010\u0014\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0010H&J.\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\tH&J\u0016\u0010\u001d\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0010H&J\u0012\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\tH&¨\u0006!"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/ui/mvp/contract/ReferEarnHomePageContract$View;", "Lcom/transsnet/palmpay/core/base/IBaseView;", "finishNow", "", "showLoadingView", "show", "", "showToastDialog", "msg", "", "queryOrderLatestResult", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/core/bean/CommonListResultV2;", "Lcom/transsnet/palmpay/jara_packet/bean/resp/ReferEarnOrderLatestResp;", "queryReferEarnHomeResult", "result", "Lcom/transsnet/palmpay/core/bean/CommonBeanResult;", "Lcom/transsnet/palmpay/jara_packet/bean/resp/ReferEarnHomeResp;", "queryReferRecordsResult", "Lcom/transsnet/palmpay/jara_packet/bean/resp/ReferEarnRecordsResp;", "commentListResult", "resp", "Lcom/transsnet/palmpay/jara_packet/bean/resp/CommentResp;", "showRichDialog", "type", "", "extraString", "extraString2", "extraLong", "queryReInviteListResult", "Lcom/transsnet/palmpay/jara_packet/bean/resp/ReInviteListResp;", "onUpdateReInviteIsInviteDone", "phoneNo", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface View extends IBaseView {
        void commentListResult(@NotNull CommonBeanResult<CommentResp> resp);

        void finishNow();

        void onUpdateReInviteIsInviteDone(@Nullable String phoneNo);

        void queryOrderLatestResult(@NotNull CommonListResultV2<ReferEarnOrderLatestResp> data);

        void queryReInviteListResult(@NotNull CommonBeanResult<ReInviteListResp> result);

        void queryReferEarnHomeResult(@NotNull CommonBeanResult<ReferEarnHomeResp> result);

        void queryReferRecordsResult(@NotNull CommonBeanResult<ReferEarnRecordsResp> result);

        void showLoadingView(boolean show);

        void showRichDialog(int type, @Nullable String extraString, @Nullable String extraString2, @Nullable String extraLong);

        void showToastDialog(@Nullable String msg);
    }
}
