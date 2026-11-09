package com.transsnet.palmpay.core.bean.cashier;

import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 <2\u00020\u0001:\u0001<Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\f\u0010\u0010J\u0018\u0010'\u001a\u00020(2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020*H\u0016J\u0010\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u00103\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010#Jn\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u00020\u000b2\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u00020*HÖ\u0001J\t\u0010:\u001a\u00020;HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u0014R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u001a\u0010\u0012\"\u0004\b\u001b\u0010\u0014R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u0014R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u0014R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006="}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/CalcPaymentAvailableBean;", "Landroid/os/Parcelable;", "bonus", "", "bonusAmount", "couponAvailableCount", "deductionPoint", "deductionPointAmount", "discountAmount", "couponMaxAmount", "showAvailable", "", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getBonus", "()Ljava/lang/Long;", "setBonus", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getBonusAmount", "setBonusAmount", "getCouponAvailableCount", "setCouponAvailableCount", "getDeductionPoint", "setDeductionPoint", "getDeductionPointAmount", "setDeductionPointAmount", "getDiscountAmount", "setDiscountAmount", "getCouponMaxAmount", "setCouponMaxAmount", "getShowAvailable", "()Ljava/lang/Boolean;", "setShowAvailable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "writeToParcel", "", "flags", "", "describeContents", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/transsnet/palmpay/core/bean/cashier/CalcPaymentAvailableBean;", "equals", "other", "", "hashCode", "toString", "", "CREATOR", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CalcPaymentAvailableBean implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

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

    /* JADX INFO: renamed from: com.transsnet.palmpay.core.bean.cashier.CalcPaymentAvailableBean$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/CalcPaymentAvailableBean$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/core/bean/cashier/CalcPaymentAvailableBean;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/core/bean/cashier/CalcPaymentAvailableBean;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<CalcPaymentAvailableBean> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CalcPaymentAvailableBean createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CalcPaymentAvailableBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CalcPaymentAvailableBean[] newArray(int size) {
            return new CalcPaymentAvailableBean[size];
        }
    }

    public CalcPaymentAvailableBean() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ CalcPaymentAvailableBean copy$default(CalcPaymentAvailableBean calcPaymentAvailableBean, Long l5, Long l6, Long l8, Long l10, Long l11, Long l12, Long l13, Boolean bool, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            l5 = calcPaymentAvailableBean.bonus;
        }
        if ((i7 & 2) != 0) {
            l6 = calcPaymentAvailableBean.bonusAmount;
        }
        if ((i7 & 4) != 0) {
            l8 = calcPaymentAvailableBean.couponAvailableCount;
        }
        if ((i7 & 8) != 0) {
            l10 = calcPaymentAvailableBean.deductionPoint;
        }
        if ((i7 & 16) != 0) {
            l11 = calcPaymentAvailableBean.deductionPointAmount;
        }
        if ((i7 & 32) != 0) {
            l12 = calcPaymentAvailableBean.discountAmount;
        }
        if ((i7 & 64) != 0) {
            l13 = calcPaymentAvailableBean.couponMaxAmount;
        }
        if ((i7 & 128) != 0) {
            bool = calcPaymentAvailableBean.showAvailable;
        }
        Long l14 = l13;
        Boolean bool2 = bool;
        Long l15 = l11;
        Long l16 = l12;
        return calcPaymentAvailableBean.copy(l5, l6, l8, l10, l15, l16, l14, bool2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getBonus() {
        return this.bonus;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getBonusAmount() {
        return this.bonusAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getCouponAvailableCount() {
        return this.couponAvailableCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getDeductionPoint() {
        return this.deductionPoint;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getDeductionPointAmount() {
        return this.deductionPointAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getDiscountAmount() {
        return this.discountAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getCouponMaxAmount() {
        return this.couponMaxAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getShowAvailable() {
        return this.showAvailable;
    }

    @NotNull
    public final CalcPaymentAvailableBean copy(@Nullable Long bonus, @Nullable Long bonusAmount, @Nullable Long couponAvailableCount, @Nullable Long deductionPoint, @Nullable Long deductionPointAmount, @Nullable Long discountAmount, @Nullable Long couponMaxAmount, @Nullable Boolean showAvailable) {
        return new CalcPaymentAvailableBean(bonus, bonusAmount, couponAvailableCount, deductionPoint, deductionPointAmount, discountAmount, couponMaxAmount, showAvailable);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalcPaymentAvailableBean)) {
            return false;
        }
        CalcPaymentAvailableBean calcPaymentAvailableBean = (CalcPaymentAvailableBean) other;
        return Intrinsics.c(this.bonus, calcPaymentAvailableBean.bonus) && Intrinsics.c(this.bonusAmount, calcPaymentAvailableBean.bonusAmount) && Intrinsics.c(this.couponAvailableCount, calcPaymentAvailableBean.couponAvailableCount) && Intrinsics.c(this.deductionPoint, calcPaymentAvailableBean.deductionPoint) && Intrinsics.c(this.deductionPointAmount, calcPaymentAvailableBean.deductionPointAmount) && Intrinsics.c(this.discountAmount, calcPaymentAvailableBean.discountAmount) && Intrinsics.c(this.couponMaxAmount, calcPaymentAvailableBean.couponMaxAmount) && Intrinsics.c(this.showAvailable, calcPaymentAvailableBean.showAvailable);
    }

    @Nullable
    public final Long getBonus() {
        return this.bonus;
    }

    @Nullable
    public final Long getBonusAmount() {
        return this.bonusAmount;
    }

    @Nullable
    public final Long getCouponAvailableCount() {
        return this.couponAvailableCount;
    }

    @Nullable
    public final Long getCouponMaxAmount() {
        return this.couponMaxAmount;
    }

    @Nullable
    public final Long getDeductionPoint() {
        return this.deductionPoint;
    }

    @Nullable
    public final Long getDeductionPointAmount() {
        return this.deductionPointAmount;
    }

    @Nullable
    public final Long getDiscountAmount() {
        return this.discountAmount;
    }

    @Nullable
    public final Boolean getShowAvailable() {
        return this.showAvailable;
    }

    public int hashCode() {
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

    public final void setBonus(@Nullable Long l5) {
        this.bonus = l5;
    }

    public final void setBonusAmount(@Nullable Long l5) {
        this.bonusAmount = l5;
    }

    public final void setCouponAvailableCount(@Nullable Long l5) {
        this.couponAvailableCount = l5;
    }

    public final void setCouponMaxAmount(@Nullable Long l5) {
        this.couponMaxAmount = l5;
    }

    public final void setDeductionPoint(@Nullable Long l5) {
        this.deductionPoint = l5;
    }

    public final void setDeductionPointAmount(@Nullable Long l5) {
        this.deductionPointAmount = l5;
    }

    public final void setDiscountAmount(@Nullable Long l5) {
        this.discountAmount = l5;
    }

    public final void setShowAvailable(@Nullable Boolean bool) {
        this.showAvailable = bool;
    }

    @NotNull
    public String toString() {
        Long l5 = this.bonus;
        Long l6 = this.bonusAmount;
        Long l8 = this.couponAvailableCount;
        Long l10 = this.deductionPoint;
        Long l11 = this.deductionPointAmount;
        Long l12 = this.discountAmount;
        Long l13 = this.couponMaxAmount;
        Boolean bool = this.showAvailable;
        StringBuilder sb2 = new StringBuilder("CalcPaymentAvailableBean(bonus=");
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
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeValue(this.bonus);
        parcel.writeValue(this.bonusAmount);
        parcel.writeValue(this.couponAvailableCount);
        parcel.writeValue(this.deductionPoint);
        parcel.writeValue(this.deductionPointAmount);
        parcel.writeValue(this.discountAmount);
        parcel.writeValue(this.couponMaxAmount);
        parcel.writeValue(this.showAvailable);
    }

    public CalcPaymentAvailableBean(@Nullable Long l5, @Nullable Long l6, @Nullable Long l8, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @Nullable Boolean bool) {
        this.bonus = l5;
        this.bonusAmount = l6;
        this.couponAvailableCount = l8;
        this.deductionPoint = l10;
        this.deductionPointAmount = l11;
        this.discountAmount = l12;
        this.couponMaxAmount = l13;
        this.showAvailable = bool;
    }

    public /* synthetic */ CalcPaymentAvailableBean(Long l5, Long l6, Long l8, Long l10, Long l11, Long l12, Long l13, Boolean bool, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0L : l5, (i7 & 2) != 0 ? 0L : l6, (i7 & 4) != 0 ? 0L : l8, (i7 & 8) != 0 ? 0L : l10, (i7 & 16) != 0 ? 0L : l11, (i7 & 32) != 0 ? 0L : l12, (i7 & 64) != 0 ? 0L : l13, (i7 & 128) != 0 ? Boolean.FALSE : bool);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CalcPaymentAvailableBean(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Class cls = Long.TYPE;
        Object value = parcel.readValue(cls.getClassLoader());
        Long l5 = value instanceof Long ? (Long) value : null;
        Object value2 = parcel.readValue(cls.getClassLoader());
        Long l6 = value2 instanceof Long ? (Long) value2 : null;
        Object value3 = parcel.readValue(cls.getClassLoader());
        Long l8 = value3 instanceof Long ? (Long) value3 : null;
        Object value4 = parcel.readValue(cls.getClassLoader());
        Long l10 = value4 instanceof Long ? (Long) value4 : null;
        Object value5 = parcel.readValue(cls.getClassLoader());
        Long l11 = value5 instanceof Long ? (Long) value5 : null;
        Object value6 = parcel.readValue(cls.getClassLoader());
        Long l12 = value6 instanceof Long ? (Long) value6 : null;
        Object value7 = parcel.readValue(cls.getClassLoader());
        Long l13 = value7 instanceof Long ? (Long) value7 : null;
        Object value8 = parcel.readValue(Boolean.TYPE.getClassLoader());
        this(l5, l6, l8, l10, l11, l12, l13, value8 instanceof Boolean ? (Boolean) value8 : null);
    }
}
