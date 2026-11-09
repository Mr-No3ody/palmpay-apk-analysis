package com.transsnet.palmpay.send_money.bean.resp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\bB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/QueryRecipientMemberInfoResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/send_money/bean/resp/QueryRecipientMemberInfoResp$Data;", "<init>", "(Lcom/transsnet/palmpay/send_money/bean/resp/QueryRecipientMemberInfoResp$Data;)V", "getData", "()Lcom/transsnet/palmpay/send_money/bean/resp/QueryRecipientMemberInfoResp$Data;", "Data", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryRecipientMemberInfoResp extends CommonResult {

    @Nullable
    private final Data data;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/QueryRecipientMemberInfoResp$Data;", "", "recipientNickname", "", "recipientMemberId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getRecipientNickname", "()Ljava/lang/String;", "getRecipientMemberId", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data {

        @Nullable
        private final String recipientMemberId;

        @Nullable
        private final String recipientNickname;

        public Data(@Nullable String str, @Nullable String str2) {
            this.recipientNickname = str;
            this.recipientMemberId = str2;
        }

        @Nullable
        public final String getRecipientMemberId() {
            return this.recipientMemberId;
        }

        @Nullable
        public final String getRecipientNickname() {
            return this.recipientNickname;
        }
    }

    public QueryRecipientMemberInfoResp(@Nullable Data data) {
        this.data = data;
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }
}
