package com.transsnet.palmpay.jara_packet.ui.adapter;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnRecord;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/transsnet/palmpay/jara_packet/ui/adapter/ReferEarnInviteesRVAdapter$ReferEarnInviteesOnclickInterface", "", "Lcom/transsnet/palmpay/jara_packet/bean/resp/ReferEarnRecord;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "inviteesClick", "(Lcom/transsnet/palmpay/jara_packet/bean/resp/ReferEarnRecord;)V", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ReferEarnInviteesRVAdapter$ReferEarnInviteesOnclickInterface {
    void inviteesClick(@NotNull ReferEarnRecord data);
}
