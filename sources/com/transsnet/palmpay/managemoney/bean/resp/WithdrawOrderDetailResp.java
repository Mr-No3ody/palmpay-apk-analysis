package com.transsnet.palmpay.managemoney.bean.resp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010$\u001a\u00020\u0005HÆ\u0003Jl\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\t\u0010+\u001a\u00020\bHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0019\u0010\u0013R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/WithdrawOrderDetailResp;", "", "payStatus", "", "amount", "", "completionTime", "orderId", "", "transType", "principal", "earlyWithdrawalFee", "advanceRepayAmount", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;J)V", "getPayStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCompletionTime", "getOrderId", "()Ljava/lang/String;", "getTransType", "getPrincipal", "getEarlyWithdrawalFee", "getAdvanceRepayAmount", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;J)Lcom/transsnet/palmpay/managemoney/bean/resp/WithdrawOrderDetailResp;", "equals", "", "other", "hashCode", "toString", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class WithdrawOrderDetailResp {
    private final long advanceRepayAmount;

    @Nullable
    private final Long amount;

    @Nullable
    private final Long completionTime;

    @Nullable
    private final Long earlyWithdrawalFee;

    @Nullable
    private final String orderId;

    @Nullable
    private final Integer payStatus;

    @Nullable
    private final Long principal;

    @Nullable
    private final String transType;

    public WithdrawOrderDetailResp(@Nullable Integer num, @Nullable Long l5, @Nullable Long l6, @Nullable String str, @Nullable String str2, @Nullable Long l8, @Nullable Long l10, long j6) {
        this.payStatus = num;
        this.amount = l5;
        this.completionTime = l6;
        this.orderId = str;
        this.transType = str2;
        this.principal = l8;
        this.earlyWithdrawalFee = l10;
        this.advanceRepayAmount = j6;
    }

    public static /* synthetic */ WithdrawOrderDetailResp copy$default(WithdrawOrderDetailResp withdrawOrderDetailResp, Integer num, Long l5, Long l6, String str, String str2, Long l8, Long l10, long j6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            num = withdrawOrderDetailResp.payStatus;
        }
        if ((i7 & 2) != 0) {
            l5 = withdrawOrderDetailResp.amount;
        }
        if ((i7 & 4) != 0) {
            l6 = withdrawOrderDetailResp.completionTime;
        }
        if ((i7 & 8) != 0) {
            str = withdrawOrderDetailResp.orderId;
        }
        if ((i7 & 16) != 0) {
            str2 = withdrawOrderDetailResp.transType;
        }
        if ((i7 & 32) != 0) {
            l8 = withdrawOrderDetailResp.principal;
        }
        if ((i7 & 64) != 0) {
            l10 = withdrawOrderDetailResp.earlyWithdrawalFee;
        }
        if ((i7 & 128) != 0) {
            j6 = withdrawOrderDetailResp.advanceRepayAmount;
        }
        long j10 = j6;
        Long l11 = l8;
        Long l12 = l10;
        String str3 = str2;
        Long l13 = l6;
        return withdrawOrderDetailResp.copy(num, l5, l13, str, str3, l11, l12, j10);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getPayStatus() {
        return this.payStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getCompletionTime() {
        return this.completionTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTransType() {
        return this.transType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getPrincipal() {
        return this.principal;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getEarlyWithdrawalFee() {
        return this.earlyWithdrawalFee;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getAdvanceRepayAmount() {
        return this.advanceRepayAmount;
    }

    @NotNull
    public final WithdrawOrderDetailResp copy(@Nullable Integer payStatus, @Nullable Long amount, @Nullable Long completionTime, @Nullable String orderId, @Nullable String transType, @Nullable Long principal, @Nullable Long earlyWithdrawalFee, long advanceRepayAmount) {
        return new WithdrawOrderDetailResp(payStatus, amount, completionTime, orderId, transType, principal, earlyWithdrawalFee, advanceRepayAmount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithdrawOrderDetailResp)) {
            return false;
        }
        WithdrawOrderDetailResp withdrawOrderDetailResp = (WithdrawOrderDetailResp) other;
        return Intrinsics.c(this.payStatus, withdrawOrderDetailResp.payStatus) && Intrinsics.c(this.amount, withdrawOrderDetailResp.amount) && Intrinsics.c(this.completionTime, withdrawOrderDetailResp.completionTime) && Intrinsics.c(this.orderId, withdrawOrderDetailResp.orderId) && Intrinsics.c(this.transType, withdrawOrderDetailResp.transType) && Intrinsics.c(this.principal, withdrawOrderDetailResp.principal) && Intrinsics.c(this.earlyWithdrawalFee, withdrawOrderDetailResp.earlyWithdrawalFee) && this.advanceRepayAmount == withdrawOrderDetailResp.advanceRepayAmount;
    }

    public final long getAdvanceRepayAmount() {
        return this.advanceRepayAmount;
    }

    @Nullable
    public final Long getAmount() {
        return this.amount;
    }

    @Nullable
    public final Long getCompletionTime() {
        return this.completionTime;
    }

    @Nullable
    public final Long getEarlyWithdrawalFee() {
        return this.earlyWithdrawalFee;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final Integer getPayStatus() {
        return this.payStatus;
    }

    @Nullable
    public final Long getPrincipal() {
        return this.principal;
    }

    @Nullable
    public final String getTransType() {
        return this.transType;
    }

    public int hashCode() {
        Integer num = this.payStatus;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l5 = this.amount;
        int iHashCode2 = (iHashCode + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.completionTime;
        int iHashCode3 = (iHashCode2 + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str = this.orderId;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.transType;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l8 = this.principal;
        int iHashCode6 = (iHashCode5 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Long l10 = this.earlyWithdrawalFee;
        return Long.hashCode(this.advanceRepayAmount) + ((iHashCode6 + (l10 != null ? l10.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "WithdrawOrderDetailResp(payStatus=" + this.payStatus + ", amount=" + this.amount + ", completionTime=" + this.completionTime + ", orderId=" + this.orderId + ", transType=" + this.transType + ", principal=" + this.principal + ", earlyWithdrawalFee=" + this.earlyWithdrawalFee + ", advanceRepayAmount=" + this.advanceRepayAmount + ")";
    }
}
