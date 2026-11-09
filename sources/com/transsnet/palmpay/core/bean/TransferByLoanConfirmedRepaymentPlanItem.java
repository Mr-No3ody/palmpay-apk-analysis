package com.transsnet.palmpay.core.bean;

import N8.q0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0086\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0017\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0018\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0019\u0010\u0014R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001a\u0010\u0014R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001b\u0010\u0014R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001c\u0010\u0014R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001d\u0010\u0014¨\u00060"}, d2 = {"Lcom/transsnet/palmpay/core/bean/TransferByLoanConfirmedRepaymentPlanItem;", "", "currentTerm", "", "interest", "", "outstandingAmount", "principal", "repaymentDate", "serviceFee", "originInterestSum", "discountInterestSum", "dailyInterest", "interestDays", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getCurrentTerm", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getInterest", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOutstandingAmount", "getPrincipal", "getRepaymentDate", "getServiceFee", "getOriginInterestSum", "getDiscountInterestSum", "getDailyInterest", "getInterestDays", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/transsnet/palmpay/core/bean/TransferByLoanConfirmedRepaymentPlanItem;", "equals", "", "other", "hashCode", "toString", "", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TransferByLoanConfirmedRepaymentPlanItem {

    @Nullable
    private final Integer currentTerm;

    @Nullable
    private final Long dailyInterest;

    @Nullable
    private final Long discountInterestSum;

    @Nullable
    private final Long interest;

    @Nullable
    private final Long interestDays;

    @Nullable
    private final Long originInterestSum;

    @Nullable
    private final Long outstandingAmount;

    @Nullable
    private final Long principal;

    @Nullable
    private final Long repaymentDate;

    @Nullable
    private final Long serviceFee;

    public TransferByLoanConfirmedRepaymentPlanItem(@Nullable Integer num, @Nullable Long l5, @Nullable Long l6, @Nullable Long l8, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @Nullable Long l14, @Nullable Long l15) {
        this.currentTerm = num;
        this.interest = l5;
        this.outstandingAmount = l6;
        this.principal = l8;
        this.repaymentDate = l10;
        this.serviceFee = l11;
        this.originInterestSum = l12;
        this.discountInterestSum = l13;
        this.dailyInterest = l14;
        this.interestDays = l15;
    }

    public static /* synthetic */ TransferByLoanConfirmedRepaymentPlanItem copy$default(TransferByLoanConfirmedRepaymentPlanItem transferByLoanConfirmedRepaymentPlanItem, Integer num, Long l5, Long l6, Long l8, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            num = transferByLoanConfirmedRepaymentPlanItem.currentTerm;
        }
        if ((i7 & 2) != 0) {
            l5 = transferByLoanConfirmedRepaymentPlanItem.interest;
        }
        if ((i7 & 4) != 0) {
            l6 = transferByLoanConfirmedRepaymentPlanItem.outstandingAmount;
        }
        if ((i7 & 8) != 0) {
            l8 = transferByLoanConfirmedRepaymentPlanItem.principal;
        }
        if ((i7 & 16) != 0) {
            l10 = transferByLoanConfirmedRepaymentPlanItem.repaymentDate;
        }
        if ((i7 & 32) != 0) {
            l11 = transferByLoanConfirmedRepaymentPlanItem.serviceFee;
        }
        if ((i7 & 64) != 0) {
            l12 = transferByLoanConfirmedRepaymentPlanItem.originInterestSum;
        }
        if ((i7 & 128) != 0) {
            l13 = transferByLoanConfirmedRepaymentPlanItem.discountInterestSum;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            l14 = transferByLoanConfirmedRepaymentPlanItem.dailyInterest;
        }
        if ((i7 & 512) != 0) {
            l15 = transferByLoanConfirmedRepaymentPlanItem.interestDays;
        }
        Long l16 = l14;
        Long l17 = l15;
        Long l18 = l12;
        Long l19 = l13;
        Long l20 = l10;
        Long l21 = l11;
        return transferByLoanConfirmedRepaymentPlanItem.copy(num, l5, l6, l8, l20, l21, l18, l19, l16, l17);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getCurrentTerm() {
        return this.currentTerm;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getInterestDays() {
        return this.interestDays;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getInterest() {
        return this.interest;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getOutstandingAmount() {
        return this.outstandingAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getPrincipal() {
        return this.principal;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getRepaymentDate() {
        return this.repaymentDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getServiceFee() {
        return this.serviceFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getOriginInterestSum() {
        return this.originInterestSum;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getDiscountInterestSum() {
        return this.discountInterestSum;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getDailyInterest() {
        return this.dailyInterest;
    }

    @NotNull
    public final TransferByLoanConfirmedRepaymentPlanItem copy(@Nullable Integer currentTerm, @Nullable Long interest, @Nullable Long outstandingAmount, @Nullable Long principal, @Nullable Long repaymentDate, @Nullable Long serviceFee, @Nullable Long originInterestSum, @Nullable Long discountInterestSum, @Nullable Long dailyInterest, @Nullable Long interestDays) {
        return new TransferByLoanConfirmedRepaymentPlanItem(currentTerm, interest, outstandingAmount, principal, repaymentDate, serviceFee, originInterestSum, discountInterestSum, dailyInterest, interestDays);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferByLoanConfirmedRepaymentPlanItem)) {
            return false;
        }
        TransferByLoanConfirmedRepaymentPlanItem transferByLoanConfirmedRepaymentPlanItem = (TransferByLoanConfirmedRepaymentPlanItem) other;
        return Intrinsics.c(this.currentTerm, transferByLoanConfirmedRepaymentPlanItem.currentTerm) && Intrinsics.c(this.interest, transferByLoanConfirmedRepaymentPlanItem.interest) && Intrinsics.c(this.outstandingAmount, transferByLoanConfirmedRepaymentPlanItem.outstandingAmount) && Intrinsics.c(this.principal, transferByLoanConfirmedRepaymentPlanItem.principal) && Intrinsics.c(this.repaymentDate, transferByLoanConfirmedRepaymentPlanItem.repaymentDate) && Intrinsics.c(this.serviceFee, transferByLoanConfirmedRepaymentPlanItem.serviceFee) && Intrinsics.c(this.originInterestSum, transferByLoanConfirmedRepaymentPlanItem.originInterestSum) && Intrinsics.c(this.discountInterestSum, transferByLoanConfirmedRepaymentPlanItem.discountInterestSum) && Intrinsics.c(this.dailyInterest, transferByLoanConfirmedRepaymentPlanItem.dailyInterest) && Intrinsics.c(this.interestDays, transferByLoanConfirmedRepaymentPlanItem.interestDays);
    }

    @Nullable
    public final Integer getCurrentTerm() {
        return this.currentTerm;
    }

    @Nullable
    public final Long getDailyInterest() {
        return this.dailyInterest;
    }

    @Nullable
    public final Long getDiscountInterestSum() {
        return this.discountInterestSum;
    }

    @Nullable
    public final Long getInterest() {
        return this.interest;
    }

    @Nullable
    public final Long getInterestDays() {
        return this.interestDays;
    }

    @Nullable
    public final Long getOriginInterestSum() {
        return this.originInterestSum;
    }

    @Nullable
    public final Long getOutstandingAmount() {
        return this.outstandingAmount;
    }

    @Nullable
    public final Long getPrincipal() {
        return this.principal;
    }

    @Nullable
    public final Long getRepaymentDate() {
        return this.repaymentDate;
    }

    @Nullable
    public final Long getServiceFee() {
        return this.serviceFee;
    }

    public int hashCode() {
        Integer num = this.currentTerm;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l5 = this.interest;
        int iHashCode2 = (iHashCode + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.outstandingAmount;
        int iHashCode3 = (iHashCode2 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l8 = this.principal;
        int iHashCode4 = (iHashCode3 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Long l10 = this.repaymentDate;
        int iHashCode5 = (iHashCode4 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.serviceFee;
        int iHashCode6 = (iHashCode5 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.originInterestSum;
        int iHashCode7 = (iHashCode6 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.discountInterestSum;
        int iHashCode8 = (iHashCode7 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.dailyInterest;
        int iHashCode9 = (iHashCode8 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.interestDays;
        return iHashCode9 + (l15 != null ? l15.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.currentTerm;
        Long l5 = this.interest;
        Long l6 = this.outstandingAmount;
        Long l8 = this.principal;
        Long l10 = this.repaymentDate;
        Long l11 = this.serviceFee;
        Long l12 = this.originInterestSum;
        Long l13 = this.discountInterestSum;
        Long l14 = this.dailyInterest;
        Long l15 = this.interestDays;
        StringBuilder sb2 = new StringBuilder("TransferByLoanConfirmedRepaymentPlanItem(currentTerm=");
        sb2.append(num);
        sb2.append(", interest=");
        sb2.append(l5);
        sb2.append(", outstandingAmount=");
        q0.w(sb2, l6, ", principal=", l8, ", repaymentDate=");
        q0.w(sb2, l10, ", serviceFee=", l11, ", originInterestSum=");
        q0.w(sb2, l12, ", discountInterestSum=", l13, ", dailyInterest=");
        sb2.append(l14);
        sb2.append(", interestDays=");
        sb2.append(l15);
        sb2.append(")");
        return sb2.toString();
    }
}
