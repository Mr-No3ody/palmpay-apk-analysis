package com.transsnet.palmpay.jara_packet.ui.mvp.contract;

import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnDetailsResp;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnRecordsResp;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnResolveResp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/ui/mvp/contract/ReferEarnResolveContract;", "", "Presenter", "View", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ReferEarnResolveContract {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0007H&¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/ui/mvp/contract/ReferEarnResolveContract$Presenter;", "Lcom/transsnet/palmpay/core/base/IBasePresenter;", "Lcom/transsnet/palmpay/jara_packet/ui/mvp/contract/ReferEarnResolveContract$View;", "queryResolveConfig", "", "queryReferEarnById", "id", "", "queryReferEarnRecords", "pageNum", "", "queryReferEarnWithDrawEnable", "referEarnWithDrawCreate", "remindFriendsBySms", "phone", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Presenter extends IBasePresenter<View> {
        void queryReferEarnById(@NotNull String id2);

        void queryReferEarnRecords(@NotNull String id2, int pageNum);

        void queryReferEarnWithDrawEnable(@NotNull String id2);

        void queryResolveConfig();

        void referEarnWithDrawCreate(@Nullable String id2);

        void remindFriendsBySms(@NotNull String phone);
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH&J\u0016\u0010\u000f\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bH&J\b\u0010\u0011\u001a\u00020\u0003H&J.\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\bH&¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/ui/mvp/contract/ReferEarnResolveContract$View;", "Lcom/transsnet/palmpay/core/base/IBaseView;", "showLoadingView", "", "show", "", "showToastDialog", "msg", "", "referEarnDetail", "result", "Lcom/transsnet/palmpay/core/bean/CommonBeanResult;", "Lcom/transsnet/palmpay/jara_packet/bean/resp/ReferEarnDetailsResp;", "referEarnResolveConfig", "Lcom/transsnet/palmpay/jara_packet/bean/resp/ReferEarnResolveResp;", "queryReferRecordsResult", "Lcom/transsnet/palmpay/jara_packet/bean/resp/ReferEarnRecordsResp;", "withDrawCallback", "showRichDialog", "type", "", "extraString", "extraString2", "extraString3", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface View extends IBaseView {
        void queryReferRecordsResult(@NotNull CommonBeanResult<ReferEarnRecordsResp> result);

        void referEarnDetail(@NotNull CommonBeanResult<ReferEarnDetailsResp> result);

        void referEarnResolveConfig(@NotNull CommonBeanResult<ReferEarnResolveResp> result);

        void showLoadingView(boolean show);

        void showRichDialog(int type, @Nullable String extraString, @Nullable String extraString2, @Nullable String extraString3);

        void showToastDialog(@Nullable String msg);

        void withDrawCallback();
    }
}
