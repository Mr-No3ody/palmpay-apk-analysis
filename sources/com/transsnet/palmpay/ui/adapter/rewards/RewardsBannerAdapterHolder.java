package com.transsnet.palmpay.ui.adapter.rewards;

import android.view.View;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsCenterInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/ui/adapter/rewards/RewardsBannerAdapterHolder;", "", "bindRewardsCenterData", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/main/export/bean/rsp/HomeRewardsCenterInfo;", "claimListener", "Landroid/view/View$OnClickListener;", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface RewardsBannerAdapterHolder {
    void bindRewardsCenterData(@NotNull HomeRewardsCenterInfo data, @NotNull View.OnClickListener claimListener);
}
