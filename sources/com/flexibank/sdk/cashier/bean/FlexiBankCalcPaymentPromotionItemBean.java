package com.flexibank.sdk.cashier.bean;

import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.F;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Parcelize
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001d\u0010\rR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b\u001f\u0010\rR\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0006R\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/flexibank/sdk/cashier/bean/FlexiBankCalcPaymentPromotionItemBean;", "Landroid/os/Parcelable;", "", "promotionType", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "showName", "getShowName", "", "promotionAmount", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "promotionValue", "getPromotionValue", "", "isUsed", "Ljava/lang/Boolean;", "i", "()Ljava/lang/Boolean;", "isAvailable", "isShow", "h", "discountAmountType", "getDiscountAmountType", "discountTariffName", "getDiscountTariffName", "discountTariffId", "getDiscountTariffId", "couponId", "d", "couponType", "e", "", "availableCoupon", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FlexiBankCalcPaymentPromotionItemBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FlexiBankCalcPaymentPromotionItemBean> CREATOR;

    @Nullable
    private final Integer availableCoupon;

    @Nullable
    private final Long couponId;

    @Nullable
    private final String couponType;

    @Nullable
    private final Long discountAmountType;

    @Nullable
    private final Long discountTariffId;

    @Nullable
    private final String discountTariffName;

    @Nullable
    private final Boolean isAvailable;

    @Nullable
    private final Boolean isShow;

    @Nullable
    private final Boolean isUsed;

    @Nullable
    private final Long promotionAmount;

    @Nullable
    private final String promotionType;

    @Nullable
    private final Long promotionValue;

    @Nullable
    private final String showName;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/flexibank/sdk/cashier/bean/FlexiBankCalcPaymentPromotionItemBean$a;", "", "<init>", "()V", "", "PROMOTION_TYPE_POINT", "Ljava/lang/String;", "PROMOTION_TYPE_DATA_BONUS", "PROMOTION_TYPE_DISCOUNT", "PROMOTION_TYPE_COUPON", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<FlexiBankCalcPaymentPromotionItemBean> {
        @Override // android.os.Parcelable.Creator
        public final FlexiBankCalcPaymentPromotionItemBean createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FlexiBankCalcPaymentPromotionItemBean(string, string2, lValueOf, lValueOf2, boolValueOf, boolValueOf2, boolValueOf3, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final FlexiBankCalcPaymentPromotionItemBean[] newArray(int i7) {
            return new FlexiBankCalcPaymentPromotionItemBean[i7];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public FlexiBankCalcPaymentPromotionItemBean(String str, String str2, Long l5, Long l6, Boolean bool, Boolean bool2, Boolean bool3, Long l8, String str3, Long l10, Long l11, String str4, Integer num) {
        this.promotionType = str;
        this.showName = str2;
        this.promotionAmount = l5;
        this.promotionValue = l6;
        this.isUsed = bool;
        this.isAvailable = bool2;
        this.isShow = bool3;
        this.discountAmountType = l8;
        this.discountTariffName = str3;
        this.discountTariffId = l10;
        this.couponId = l11;
        this.couponType = str4;
        this.availableCoupon = num;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getAvailableCoupon() {
        return this.availableCoupon;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getCouponId() {
        return this.couponId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCouponType() {
        return this.couponType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlexiBankCalcPaymentPromotionItemBean)) {
            return false;
        }
        FlexiBankCalcPaymentPromotionItemBean flexiBankCalcPaymentPromotionItemBean = (FlexiBankCalcPaymentPromotionItemBean) obj;
        return Intrinsics.c(this.promotionType, flexiBankCalcPaymentPromotionItemBean.promotionType) && Intrinsics.c(this.showName, flexiBankCalcPaymentPromotionItemBean.showName) && Intrinsics.c(this.promotionAmount, flexiBankCalcPaymentPromotionItemBean.promotionAmount) && Intrinsics.c(this.promotionValue, flexiBankCalcPaymentPromotionItemBean.promotionValue) && Intrinsics.c(this.isUsed, flexiBankCalcPaymentPromotionItemBean.isUsed) && Intrinsics.c(this.isAvailable, flexiBankCalcPaymentPromotionItemBean.isAvailable) && Intrinsics.c(this.isShow, flexiBankCalcPaymentPromotionItemBean.isShow) && Intrinsics.c(this.discountAmountType, flexiBankCalcPaymentPromotionItemBean.discountAmountType) && Intrinsics.c(this.discountTariffName, flexiBankCalcPaymentPromotionItemBean.discountTariffName) && Intrinsics.c(this.discountTariffId, flexiBankCalcPaymentPromotionItemBean.discountTariffId) && Intrinsics.c(this.couponId, flexiBankCalcPaymentPromotionItemBean.couponId) && Intrinsics.c(this.couponType, flexiBankCalcPaymentPromotionItemBean.couponType) && Intrinsics.c(this.availableCoupon, flexiBankCalcPaymentPromotionItemBean.availableCoupon);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getPromotionAmount() {
        return this.promotionAmount;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPromotionType() {
        return this.promotionType;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Boolean getIsShow() {
        return this.isShow;
    }

    public final int hashCode() {
        String str = this.promotionType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.showName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l5 = this.promotionAmount;
        int iHashCode3 = (iHashCode2 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.promotionValue;
        int iHashCode4 = (iHashCode3 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Boolean bool = this.isUsed;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isAvailable;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isShow;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l8 = this.discountAmountType;
        int iHashCode8 = (iHashCode7 + (l8 == null ? 0 : l8.hashCode())) * 31;
        String str3 = this.discountTariffName;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l10 = this.discountTariffId;
        int iHashCode10 = (iHashCode9 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.couponId;
        int iHashCode11 = (iHashCode10 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str4 = this.couponType;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.availableCoupon;
        return iHashCode12 + (num != null ? num.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Boolean getIsUsed() {
        return this.isUsed;
    }

    public final String toString() {
        String str = this.promotionType;
        String str2 = this.showName;
        Long l5 = this.promotionAmount;
        Long l6 = this.promotionValue;
        Boolean bool = this.isUsed;
        Boolean bool2 = this.isAvailable;
        Boolean bool3 = this.isShow;
        Long l8 = this.discountAmountType;
        String str3 = this.discountTariffName;
        Long l10 = this.discountTariffId;
        Long l11 = this.couponId;
        String str4 = this.couponType;
        Integer num = this.availableCoupon;
        StringBuilder sbF = F.f("FlexiBankCalcPaymentPromotionItemBean(promotionType=", str, ", showName=", str2, ", promotionAmount=");
        q0.w(sbF, l5, ", promotionValue=", l6, ", isUsed=");
        sbF.append(bool);
        sbF.append(", isAvailable=");
        sbF.append(bool2);
        sbF.append(", isShow=");
        sbF.append(bool3);
        sbF.append(", discountAmountType=");
        sbF.append(l8);
        sbF.append(", discountTariffName=");
        sbF.append(str3);
        sbF.append(", discountTariffId=");
        sbF.append(l10);
        sbF.append(", couponId=");
        sbF.append(l11);
        sbF.append(", couponType=");
        sbF.append(str4);
        sbF.append(", availableCoupon=");
        sbF.append(num);
        sbF.append(")");
        return sbF.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.promotionType);
        dest.writeString(this.showName);
        Long l5 = this.promotionAmount;
        if (l5 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l5);
        }
        Long l6 = this.promotionValue;
        if (l6 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l6);
        }
        Boolean bool = this.isUsed;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            q0.r(dest, 1, bool);
        }
        Boolean bool2 = this.isAvailable;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            q0.r(dest, 1, bool2);
        }
        Boolean bool3 = this.isShow;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            q0.r(dest, 1, bool3);
        }
        Long l8 = this.discountAmountType;
        if (l8 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l8);
        }
        dest.writeString(this.discountTariffName);
        Long l10 = this.discountTariffId;
        if (l10 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l10);
        }
        Long l11 = this.couponId;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l11);
        }
        dest.writeString(this.couponType);
        Integer num = this.availableCoupon;
        if (num == null) {
            dest.writeInt(0);
        } else {
            q0.s(dest, 1, num);
        }
    }
}
