package com.transsnet.palmpay.managemoney.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/CashBoxInterestDetail;", "", "amount", "", "interestTime", "paymentTime", "orgOrderNo", "", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getInterestTime", "getPaymentTime", "getOrgOrderNo", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lcom/transsnet/palmpay/managemoney/bean/CashBoxInterestDetail;", "equals", "", "other", "hashCode", "", "toString", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CashBoxInterestDetail {

    @Nullable
    private final Long amount;

    @Nullable
    private final Long interestTime;

    @Nullable
    private final String orgOrderNo;

    @Nullable
    private final Long paymentTime;

    public CashBoxInterestDetail(@Nullable Long l5, @Nullable Long l6, @Nullable Long l8, @Nullable String str) {
        this.amount = l5;
        this.interestTime = l6;
        this.paymentTime = l8;
        this.orgOrderNo = str;
    }

    public static /* synthetic */ CashBoxInterestDetail copy$default(CashBoxInterestDetail cashBoxInterestDetail, Long l5, Long l6, Long l8, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            l5 = cashBoxInterestDetail.amount;
        }
        if ((i7 & 2) != 0) {
            l6 = cashBoxInterestDetail.interestTime;
        }
        if ((i7 & 4) != 0) {
            l8 = cashBoxInterestDetail.paymentTime;
        }
        if ((i7 & 8) != 0) {
            str = cashBoxInterestDetail.orgOrderNo;
        }
        return cashBoxInterestDetail.copy(l5, l6, l8, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getInterestTime() {
        return this.interestTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getPaymentTime() {
        return this.paymentTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOrgOrderNo() {
        return this.orgOrderNo;
    }

    @NotNull
    public final CashBoxInterestDetail copy(@Nullable Long amount, @Nullable Long interestTime, @Nullable Long paymentTime, @Nullable String orgOrderNo) {
        return new CashBoxInterestDetail(amount, interestTime, paymentTime, orgOrderNo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashBoxInterestDetail)) {
            return false;
        }
        CashBoxInterestDetail cashBoxInterestDetail = (CashBoxInterestDetail) other;
        return Intrinsics.c(this.amount, cashBoxInterestDetail.amount) && Intrinsics.c(this.interestTime, cashBoxInterestDetail.interestTime) && Intrinsics.c(this.paymentTime, cashBoxInterestDetail.paymentTime) && Intrinsics.c(this.orgOrderNo, cashBoxInterestDetail.orgOrderNo);
    }

    @Nullable
    public final Long getAmount() {
        return this.amount;
    }

    @Nullable
    public final Long getInterestTime() {
        return this.interestTime;
    }

    @Nullable
    public final String getOrgOrderNo() {
        return this.orgOrderNo;
    }

    @Nullable
    public final Long getPaymentTime() {
        return this.paymentTime;
    }

    public int hashCode() {
        Long l5 = this.amount;
        int iHashCode = (l5 == null ? 0 : l5.hashCode()) * 31;
        Long l6 = this.interestTime;
        int iHashCode2 = (iHashCode + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l8 = this.paymentTime;
        int iHashCode3 = (iHashCode2 + (l8 == null ? 0 : l8.hashCode())) * 31;
        String str = this.orgOrderNo;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CashBoxInterestDetail(amount=" + this.amount + ", interestTime=" + this.interestTime + ", paymentTime=" + this.paymentTime + ", orgOrderNo=" + this.orgOrderNo + ")";
    }
}
