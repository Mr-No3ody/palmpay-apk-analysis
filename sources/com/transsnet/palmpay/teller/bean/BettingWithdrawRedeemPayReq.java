package com.transsnet.palmpay.teller.bean;

import N8.q0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/BettingWithdrawRedeemPayReq;", "", "orderNo", "", "<init>", "(Ljava/lang/String;)V", "getOrderNo", "()Ljava/lang/String;", "setOrderNo", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BettingWithdrawRedeemPayReq {

    @Nullable
    private String orderNo;

    public BettingWithdrawRedeemPayReq(@Nullable String str) {
        this.orderNo = str;
    }

    public static /* synthetic */ BettingWithdrawRedeemPayReq copy$default(BettingWithdrawRedeemPayReq bettingWithdrawRedeemPayReq, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = bettingWithdrawRedeemPayReq.orderNo;
        }
        return bettingWithdrawRedeemPayReq.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderNo() {
        return this.orderNo;
    }

    @NotNull
    public final BettingWithdrawRedeemPayReq copy(@Nullable String orderNo) {
        return new BettingWithdrawRedeemPayReq(orderNo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BettingWithdrawRedeemPayReq) && Intrinsics.c(this.orderNo, ((BettingWithdrawRedeemPayReq) other).orderNo);
    }

    @Nullable
    public final String getOrderNo() {
        return this.orderNo;
    }

    public int hashCode() {
        String str = this.orderNo;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setOrderNo(@Nullable String str) {
        this.orderNo = str;
    }

    @NotNull
    public String toString() {
        return q0.k("BettingWithdrawRedeemPayReq(orderNo=", this.orderNo, ")");
    }
}
