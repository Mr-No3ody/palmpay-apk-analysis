package com.transsnet.palmpay.core.bean;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0016\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/transsnet/palmpay/core/bean/CreateBizOrderReq;", "", "transType", "", "orderSourceType", "", "accountNo", "amount", "", "transferNotes", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getTransType", "()Ljava/lang/String;", "setTransType", "(Ljava/lang/String;)V", "getOrderSourceType", "()Ljava/lang/Integer;", "setOrderSourceType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getAccountNo", "setAccountNo", "getAmount", "()Ljava/lang/Long;", "setAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getTransferNotes", "setTransferNotes", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CreateBizOrderReq {

    @Nullable
    private String accountNo;

    @Nullable
    private Long amount;

    @Nullable
    private Integer orderSourceType;

    @Nullable
    private String transType;

    @Nullable
    private String transferNotes;

    public CreateBizOrderReq(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable Long l5, @Nullable String str3) {
        this.transType = str;
        this.orderSourceType = num;
        this.accountNo = str2;
        this.amount = l5;
        this.transferNotes = str3;
    }

    @Nullable
    public final String getAccountNo() {
        return this.accountNo;
    }

    @Nullable
    public final Long getAmount() {
        return this.amount;
    }

    @Nullable
    public final Integer getOrderSourceType() {
        return this.orderSourceType;
    }

    @Nullable
    public final String getTransType() {
        return this.transType;
    }

    @Nullable
    public final String getTransferNotes() {
        return this.transferNotes;
    }

    public final void setAccountNo(@Nullable String str) {
        this.accountNo = str;
    }

    public final void setAmount(@Nullable Long l5) {
        this.amount = l5;
    }

    public final void setOrderSourceType(@Nullable Integer num) {
        this.orderSourceType = num;
    }

    public final void setTransType(@Nullable String str) {
        this.transType = str;
    }

    public final void setTransferNotes(@Nullable String str) {
        this.transferNotes = str;
    }
}
