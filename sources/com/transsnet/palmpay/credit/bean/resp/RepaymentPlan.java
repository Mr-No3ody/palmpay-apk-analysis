package com.transsnet.palmpay.credit.bean.resp;

import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 82\u00020\u0001:\u00018Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u000e\u0010\u0012J\u0018\u0010!\u001a\u00020\"2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0003H\u0016J\b\u0010$\u001a\u00020\u0003H\u0016J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0086\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020\u0003HÖ\u0001J\t\u00106\u001a\u000207HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001a\u0010\u0017R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001b\u0010\u0017R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001c\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001d\u0010\u0017R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001e\u0010\u0017R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001f\u0010\u0017R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b \u0010\u0017¨\u00069"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/RepaymentPlan;", "Landroid/os/Parcelable;", "currentTerm", "", "interest", "", "outstandingAmount", "principal", "repaymentDate", "serviceFee", "originInterestSum", "discountInterestSum", "dailyInterest", "interestDays", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getCurrentTerm", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getInterest", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOutstandingAmount", "getPrincipal", "getRepaymentDate", "getServiceFee", "getOriginInterestSum", "getDiscountInterestSum", "getDailyInterest", "getInterestDays", "writeToParcel", "", "flags", "describeContents", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/transsnet/palmpay/credit/bean/resp/RepaymentPlan;", "equals", "", "other", "", "hashCode", "toString", "", "CREATOR", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RepaymentPlan implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

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

    /* JADX INFO: renamed from: com.transsnet.palmpay.credit.bean.resp.RepaymentPlan$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/RepaymentPlan$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/credit/bean/resp/RepaymentPlan;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/credit/bean/resp/RepaymentPlan;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<RepaymentPlan> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public RepaymentPlan createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RepaymentPlan(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public RepaymentPlan[] newArray(int size) {
            return new RepaymentPlan[size];
        }
    }

    public RepaymentPlan(@Nullable Integer num, @Nullable Long l5, @Nullable Long l6, @Nullable Long l8, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @Nullable Long l14, @Nullable Long l15) {
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

    public static /* synthetic */ RepaymentPlan copy$default(RepaymentPlan repaymentPlan, Integer num, Long l5, Long l6, Long l8, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            num = repaymentPlan.currentTerm;
        }
        if ((i7 & 2) != 0) {
            l5 = repaymentPlan.interest;
        }
        if ((i7 & 4) != 0) {
            l6 = repaymentPlan.outstandingAmount;
        }
        if ((i7 & 8) != 0) {
            l8 = repaymentPlan.principal;
        }
        if ((i7 & 16) != 0) {
            l10 = repaymentPlan.repaymentDate;
        }
        if ((i7 & 32) != 0) {
            l11 = repaymentPlan.serviceFee;
        }
        if ((i7 & 64) != 0) {
            l12 = repaymentPlan.originInterestSum;
        }
        if ((i7 & 128) != 0) {
            l13 = repaymentPlan.discountInterestSum;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            l14 = repaymentPlan.dailyInterest;
        }
        if ((i7 & 512) != 0) {
            l15 = repaymentPlan.interestDays;
        }
        Long l16 = l14;
        Long l17 = l15;
        Long l18 = l12;
        Long l19 = l13;
        Long l20 = l10;
        Long l21 = l11;
        return repaymentPlan.copy(num, l5, l6, l8, l20, l21, l18, l19, l16, l17);
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
    public final RepaymentPlan copy(@Nullable Integer currentTerm, @Nullable Long interest, @Nullable Long outstandingAmount, @Nullable Long principal, @Nullable Long repaymentDate, @Nullable Long serviceFee, @Nullable Long originInterestSum, @Nullable Long discountInterestSum, @Nullable Long dailyInterest, @Nullable Long interestDays) {
        return new RepaymentPlan(currentTerm, interest, outstandingAmount, principal, repaymentDate, serviceFee, originInterestSum, discountInterestSum, dailyInterest, interestDays);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RepaymentPlan)) {
            return false;
        }
        RepaymentPlan repaymentPlan = (RepaymentPlan) other;
        return Intrinsics.c(this.currentTerm, repaymentPlan.currentTerm) && Intrinsics.c(this.interest, repaymentPlan.interest) && Intrinsics.c(this.outstandingAmount, repaymentPlan.outstandingAmount) && Intrinsics.c(this.principal, repaymentPlan.principal) && Intrinsics.c(this.repaymentDate, repaymentPlan.repaymentDate) && Intrinsics.c(this.serviceFee, repaymentPlan.serviceFee) && Intrinsics.c(this.originInterestSum, repaymentPlan.originInterestSum) && Intrinsics.c(this.discountInterestSum, repaymentPlan.discountInterestSum) && Intrinsics.c(this.dailyInterest, repaymentPlan.dailyInterest) && Intrinsics.c(this.interestDays, repaymentPlan.interestDays);
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
        StringBuilder sb2 = new StringBuilder("RepaymentPlan(currentTerm=");
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

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeValue(this.currentTerm);
        parcel.writeValue(this.interest);
        parcel.writeValue(this.outstandingAmount);
        parcel.writeValue(this.principal);
        parcel.writeValue(this.repaymentDate);
        parcel.writeValue(this.serviceFee);
        parcel.writeValue(this.originInterestSum);
        parcel.writeValue(this.discountInterestSum);
        parcel.writeValue(this.dailyInterest);
        parcel.writeValue(this.interestDays);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RepaymentPlan(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Object value = parcel.readValue(Integer.TYPE.getClassLoader());
        Integer num = value instanceof Integer ? (Integer) value : null;
        Class cls = Long.TYPE;
        Object value2 = parcel.readValue(cls.getClassLoader());
        Long l5 = value2 instanceof Long ? (Long) value2 : null;
        Object value3 = parcel.readValue(cls.getClassLoader());
        Long l6 = value3 instanceof Long ? (Long) value3 : null;
        Object value4 = parcel.readValue(cls.getClassLoader());
        Long l8 = value4 instanceof Long ? (Long) value4 : null;
        Object value5 = parcel.readValue(cls.getClassLoader());
        Long l10 = value5 instanceof Long ? (Long) value5 : null;
        Object value6 = parcel.readValue(cls.getClassLoader());
        Long l11 = value6 instanceof Long ? (Long) value6 : null;
        Object value7 = parcel.readValue(cls.getClassLoader());
        Long l12 = value7 instanceof Long ? (Long) value7 : null;
        Object value8 = parcel.readValue(cls.getClassLoader());
        Long l13 = value8 instanceof Long ? (Long) value8 : null;
        Object value9 = parcel.readValue(cls.getClassLoader());
        Long l14 = value9 instanceof Long ? (Long) value9 : null;
        Object value10 = parcel.readValue(cls.getClassLoader());
        this(num, l5, l6, l8, l10, l11, l12, l13, l14, value10 instanceof Long ? (Long) value10 : null);
    }
}
