package com.flexibank.sdk.cashier.bean;

import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Parcelize
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/flexibank/sdk/cashier/bean/FlexiBankCalcPaymentAvailableBean;", "Landroid/os/Parcelable;", "", "bonus", "Ljava/lang/Long;", "getBonus", "()Ljava/lang/Long;", "setBonus", "(Ljava/lang/Long;)V", "bonusAmount", "getBonusAmount", "setBonusAmount", "couponAvailableCount", "getCouponAvailableCount", "setCouponAvailableCount", "deductionPoint", "getDeductionPoint", "setDeductionPoint", "deductionPointAmount", "getDeductionPointAmount", "setDeductionPointAmount", "discountAmount", "getDiscountAmount", "setDiscountAmount", "couponMaxAmount", "getCouponMaxAmount", "setCouponMaxAmount", "", "showAvailable", "Ljava/lang/Boolean;", "getShowAvailable", "()Ljava/lang/Boolean;", "setShowAvailable", "(Ljava/lang/Boolean;)V", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FlexiBankCalcPaymentAvailableBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FlexiBankCalcPaymentAvailableBean> CREATOR = new a();

    @Nullable
    private Long bonus;

    @Nullable
    private Long bonusAmount;

    @Nullable
    private Long couponAvailableCount;

    @Nullable
    private Long couponMaxAmount;

    @Nullable
    private Long deductionPoint;

    @Nullable
    private Long deductionPointAmount;

    @Nullable
    private Long discountAmount;

    @Nullable
    private Boolean showAvailable;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FlexiBankCalcPaymentAvailableBean> {
        @Override // android.os.Parcelable.Creator
        public final FlexiBankCalcPaymentAvailableBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Boolean boolValueOf = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf4 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf5 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf6 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf7 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FlexiBankCalcPaymentAvailableBean(lValueOf, lValueOf2, lValueOf3, lValueOf4, lValueOf5, lValueOf6, lValueOf7, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final FlexiBankCalcPaymentAvailableBean[] newArray(int i7) {
            return new FlexiBankCalcPaymentAvailableBean[i7];
        }
    }

    public FlexiBankCalcPaymentAvailableBean(Long l5, Long l6, Long l8, Long l10, Long l11, Long l12, Long l13, Boolean bool) {
        this.bonus = l5;
        this.bonusAmount = l6;
        this.couponAvailableCount = l8;
        this.deductionPoint = l10;
        this.deductionPointAmount = l11;
        this.discountAmount = l12;
        this.couponMaxAmount = l13;
        this.showAvailable = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlexiBankCalcPaymentAvailableBean)) {
            return false;
        }
        FlexiBankCalcPaymentAvailableBean flexiBankCalcPaymentAvailableBean = (FlexiBankCalcPaymentAvailableBean) obj;
        return Intrinsics.c(this.bonus, flexiBankCalcPaymentAvailableBean.bonus) && Intrinsics.c(this.bonusAmount, flexiBankCalcPaymentAvailableBean.bonusAmount) && Intrinsics.c(this.couponAvailableCount, flexiBankCalcPaymentAvailableBean.couponAvailableCount) && Intrinsics.c(this.deductionPoint, flexiBankCalcPaymentAvailableBean.deductionPoint) && Intrinsics.c(this.deductionPointAmount, flexiBankCalcPaymentAvailableBean.deductionPointAmount) && Intrinsics.c(this.discountAmount, flexiBankCalcPaymentAvailableBean.discountAmount) && Intrinsics.c(this.couponMaxAmount, flexiBankCalcPaymentAvailableBean.couponMaxAmount) && Intrinsics.c(this.showAvailable, flexiBankCalcPaymentAvailableBean.showAvailable);
    }

    public final int hashCode() {
        Long l5 = this.bonus;
        int iHashCode = (l5 == null ? 0 : l5.hashCode()) * 31;
        Long l6 = this.bonusAmount;
        int iHashCode2 = (iHashCode + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l8 = this.couponAvailableCount;
        int iHashCode3 = (iHashCode2 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Long l10 = this.deductionPoint;
        int iHashCode4 = (iHashCode3 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.deductionPointAmount;
        int iHashCode5 = (iHashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.discountAmount;
        int iHashCode6 = (iHashCode5 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.couponMaxAmount;
        int iHashCode7 = (iHashCode6 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Boolean bool = this.showAvailable;
        return iHashCode7 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        Long l5 = this.bonus;
        Long l6 = this.bonusAmount;
        Long l8 = this.couponAvailableCount;
        Long l10 = this.deductionPoint;
        Long l11 = this.deductionPointAmount;
        Long l12 = this.discountAmount;
        Long l13 = this.couponMaxAmount;
        Boolean bool = this.showAvailable;
        StringBuilder sb2 = new StringBuilder("FlexiBankCalcPaymentAvailableBean(bonus=");
        sb2.append(l5);
        sb2.append(", bonusAmount=");
        sb2.append(l6);
        sb2.append(", couponAvailableCount=");
        q0.w(sb2, l8, ", deductionPoint=", l10, ", deductionPointAmount=");
        q0.w(sb2, l11, ", discountAmount=", l12, ", couponMaxAmount=");
        sb2.append(l13);
        sb2.append(", showAvailable=");
        sb2.append(bool);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Long l5 = this.bonus;
        if (l5 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l5);
        }
        Long l6 = this.bonusAmount;
        if (l6 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l6);
        }
        Long l8 = this.couponAvailableCount;
        if (l8 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l8);
        }
        Long l10 = this.deductionPoint;
        if (l10 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l10);
        }
        Long l11 = this.deductionPointAmount;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l11);
        }
        Long l12 = this.discountAmount;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l12);
        }
        Long l13 = this.couponMaxAmount;
        if (l13 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l13);
        }
        Boolean bool = this.showAvailable;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            q0.r(dest, 1, bool);
        }
    }

    public FlexiBankCalcPaymentAvailableBean() {
        this(0L, 0L, 0L, 0L, 0L, 0L, 0L, Boolean.FALSE);
    }
}
