package com.transsnet.palmpay.send_money.bean.req;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/req/QueryRecipientMemberInfoReq;", "", "recipientPhone", "", "source", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getRecipientPhone", "()Ljava/lang/String;", "getSource", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryRecipientMemberInfoReq {

    @Nullable
    private final String recipientPhone;

    @Nullable
    private final Integer source;

    public QueryRecipientMemberInfoReq(@Nullable String str, @Nullable Integer num) {
        this.recipientPhone = str;
        this.source = num;
    }

    @Nullable
    public final String getRecipientPhone() {
        return this.recipientPhone;
    }

    @Nullable
    public final Integer getSource() {
        return this.source;
    }
}
