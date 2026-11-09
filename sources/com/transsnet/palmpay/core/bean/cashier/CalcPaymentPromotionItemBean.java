package com.transsnet.palmpay.core.bean.cashier;

import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.F;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 A2\u00020\u0001:\u0001AB\u009b\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014B\u0011\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0013\u0010\u0017J\u0018\u0010)\u001a\u00020*2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u0012H\u0016J\b\u0010,\u001a\u00020\u0012H\u0016J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010'Jª\u0001\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020\t2\b\u0010=\u001a\u0004\u0018\u00010>HÖ\u0003J\t\u0010?\u001a\u00020\u0012HÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\b\u0010\u001fR\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\n\u0010\u001fR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u000b\u0010\u001fR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b!\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b#\u0010\u001cR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b$\u0010\u001cR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'¨\u0006B"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/CalcPaymentPromotionItemBean;", "Landroid/os/Parcelable;", "promotionType", "", "showName", "promotionAmount", "", "promotionValue", "isUsed", "", "isAvailable", "isShow", "discountAmountType", "discountTariffName", "discountTariffId", "couponId", "couponType", "availableCoupon", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getPromotionType", "()Ljava/lang/String;", "getShowName", "getPromotionAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPromotionValue", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDiscountAmountType", "getDiscountTariffName", "getDiscountTariffId", "getCouponId", "getCouponType", "getAvailableCoupon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "writeToParcel", "", "flags", "describeContents", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)Lcom/transsnet/palmpay/core/bean/cashier/CalcPaymentPromotionItemBean;", "equals", "other", "", "hashCode", "toString", "Companion", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CalcPaymentPromotionItemBean implements Parcelable {

    @NotNull
    public static final String PROMOTION_TYPE_COUPON = "COUPON";

    @NotNull
    public static final String PROMOTION_TYPE_DATA_BONUS = "DATA_BONUS";

    @NotNull
    public static final String PROMOTION_TYPE_DISCOUNT = "DISCOUNT";

    @NotNull
    public static final String PROMOTION_TYPE_POINT = "POINT";

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

    @JvmField
    @NotNull
    public static final Parcelable.Creator<CalcPaymentPromotionItemBean> CREATOR = new Parcelable.Creator<CalcPaymentPromotionItemBean>() { // from class: com.transsnet.palmpay.core.bean.cashier.CalcPaymentPromotionItemBean$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CalcPaymentPromotionItemBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CalcPaymentPromotionItemBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CalcPaymentPromotionItemBean[] newArray(int size) {
            return new CalcPaymentPromotionItemBean[size];
        }
    };

    public CalcPaymentPromotionItemBean(@Nullable String str, @Nullable String str2, @Nullable Long l5, @Nullable Long l6, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Long l8, @Nullable String str3, @Nullable Long l10, @Nullable Long l11, @Nullable String str4, @Nullable Integer num) {
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

    public static /* synthetic */ CalcPaymentPromotionItemBean copy$default(CalcPaymentPromotionItemBean calcPaymentPromotionItemBean, String str, String str2, Long l5, Long l6, Boolean bool, Boolean bool2, Boolean bool3, Long l8, String str3, Long l10, Long l11, String str4, Integer num, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = calcPaymentPromotionItemBean.promotionType;
        }
        return calcPaymentPromotionItemBean.copy(str, (i7 & 2) != 0 ? calcPaymentPromotionItemBean.showName : str2, (i7 & 4) != 0 ? calcPaymentPromotionItemBean.promotionAmount : l5, (i7 & 8) != 0 ? calcPaymentPromotionItemBean.promotionValue : l6, (i7 & 16) != 0 ? calcPaymentPromotionItemBean.isUsed : bool, (i7 & 32) != 0 ? calcPaymentPromotionItemBean.isAvailable : bool2, (i7 & 64) != 0 ? calcPaymentPromotionItemBean.isShow : bool3, (i7 & 128) != 0 ? calcPaymentPromotionItemBean.discountAmountType : l8, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? calcPaymentPromotionItemBean.discountTariffName : str3, (i7 & 512) != 0 ? calcPaymentPromotionItemBean.discountTariffId : l10, (i7 & 1024) != 0 ? calcPaymentPromotionItemBean.couponId : l11, (i7 & 2048) != 0 ? calcPaymentPromotionItemBean.couponType : str4, (i7 & 4096) != 0 ? calcPaymentPromotionItemBean.availableCoupon : num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPromotionType() {
        return this.promotionType;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getDiscountTariffId() {
        return this.discountTariffId;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Long getCouponId() {
        return this.couponId;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCouponType() {
        return this.couponType;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getAvailableCoupon() {
        return this.availableCoupon;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getShowName() {
        return this.showName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getPromotionAmount() {
        return this.promotionAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getPromotionValue() {
        return this.promotionValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIsUsed() {
        return this.isUsed;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIsAvailable() {
        return this.isAvailable;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsShow() {
        return this.isShow;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getDiscountAmountType() {
        return this.discountAmountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDiscountTariffName() {
        return this.discountTariffName;
    }

    @NotNull
    public final CalcPaymentPromotionItemBean copy(@Nullable String promotionType, @Nullable String showName, @Nullable Long promotionAmount, @Nullable Long promotionValue, @Nullable Boolean isUsed, @Nullable Boolean isAvailable, @Nullable Boolean isShow, @Nullable Long discountAmountType, @Nullable String discountTariffName, @Nullable Long discountTariffId, @Nullable Long couponId, @Nullable String couponType, @Nullable Integer availableCoupon) {
        return new CalcPaymentPromotionItemBean(promotionType, showName, promotionAmount, promotionValue, isUsed, isAvailable, isShow, discountAmountType, discountTariffName, discountTariffId, couponId, couponType, availableCoupon);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalcPaymentPromotionItemBean)) {
            return false;
        }
        CalcPaymentPromotionItemBean calcPaymentPromotionItemBean = (CalcPaymentPromotionItemBean) other;
        return Intrinsics.c(this.promotionType, calcPaymentPromotionItemBean.promotionType) && Intrinsics.c(this.showName, calcPaymentPromotionItemBean.showName) && Intrinsics.c(this.promotionAmount, calcPaymentPromotionItemBean.promotionAmount) && Intrinsics.c(this.promotionValue, calcPaymentPromotionItemBean.promotionValue) && Intrinsics.c(this.isUsed, calcPaymentPromotionItemBean.isUsed) && Intrinsics.c(this.isAvailable, calcPaymentPromotionItemBean.isAvailable) && Intrinsics.c(this.isShow, calcPaymentPromotionItemBean.isShow) && Intrinsics.c(this.discountAmountType, calcPaymentPromotionItemBean.discountAmountType) && Intrinsics.c(this.discountTariffName, calcPaymentPromotionItemBean.discountTariffName) && Intrinsics.c(this.discountTariffId, calcPaymentPromotionItemBean.discountTariffId) && Intrinsics.c(this.couponId, calcPaymentPromotionItemBean.couponId) && Intrinsics.c(this.couponType, calcPaymentPromotionItemBean.couponType) && Intrinsics.c(this.availableCoupon, calcPaymentPromotionItemBean.availableCoupon);
    }

    @Nullable
    public final Integer getAvailableCoupon() {
        return this.availableCoupon;
    }

    @Nullable
    public final Long getCouponId() {
        return this.couponId;
    }

    @Nullable
    public final String getCouponType() {
        return this.couponType;
    }

    @Nullable
    public final Long getDiscountAmountType() {
        return this.discountAmountType;
    }

    @Nullable
    public final Long getDiscountTariffId() {
        return this.discountTariffId;
    }

    @Nullable
    public final String getDiscountTariffName() {
        return this.discountTariffName;
    }

    @Nullable
    public final Long getPromotionAmount() {
        return this.promotionAmount;
    }

    @Nullable
    public final String getPromotionType() {
        return this.promotionType;
    }

    @Nullable
    public final Long getPromotionValue() {
        return this.promotionValue;
    }

    @Nullable
    public final String getShowName() {
        return this.showName;
    }

    public int hashCode() {
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

    @Nullable
    public final Boolean isAvailable() {
        return this.isAvailable;
    }

    @Nullable
    public final Boolean isShow() {
        return this.isShow;
    }

    @Nullable
    public final Boolean isUsed() {
        return this.isUsed;
    }

    @NotNull
    public String toString() {
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
        StringBuilder sbF = F.f("CalcPaymentPromotionItemBean(promotionType=", str, ", showName=", str2, ", promotionAmount=");
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
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.promotionType);
        parcel.writeString(this.showName);
        parcel.writeValue(this.promotionAmount);
        parcel.writeValue(this.promotionValue);
        parcel.writeValue(this.isUsed);
        parcel.writeValue(this.isAvailable);
        parcel.writeValue(this.isShow);
        parcel.writeValue(this.discountAmountType);
        parcel.writeString(this.discountTariffName);
        parcel.writeValue(this.discountTariffId);
        parcel.writeValue(this.couponId);
        parcel.writeString(this.couponType);
        parcel.writeValue(this.availableCoupon);
    }

    public /* synthetic */ CalcPaymentPromotionItemBean(String str, String str2, Long l5, Long l6, Boolean bool, Boolean bool2, Boolean bool3, Long l8, String str3, Long l10, Long l11, String str4, Integer num, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i7 & 4) != 0 ? 0L : l5, (i7 & 8) != 0 ? 0L : l6, (i7 & 16) != 0 ? Boolean.FALSE : bool, (i7 & 32) != 0 ? Boolean.FALSE : bool2, (i7 & 64) != 0 ? Boolean.FALSE : bool3, (i7 & 128) != 0 ? 0L : l8, str3, (i7 & 512) != 0 ? 0L : l10, (i7 & 1024) != 0 ? 0L : l11, str4, (i7 & 4096) != 0 ? 0 : num);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CalcPaymentPromotionItemBean(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        String string2 = parcel.readString();
        Class cls = Long.TYPE;
        Object value = parcel.readValue(cls.getClassLoader());
        Long l5 = value instanceof Long ? (Long) value : null;
        Object value2 = parcel.readValue(cls.getClassLoader());
        Long l6 = value2 instanceof Long ? (Long) value2 : null;
        Class cls2 = Boolean.TYPE;
        Object value3 = parcel.readValue(cls2.getClassLoader());
        Boolean bool = value3 instanceof Boolean ? (Boolean) value3 : null;
        Object value4 = parcel.readValue(cls2.getClassLoader());
        Boolean bool2 = value4 instanceof Boolean ? (Boolean) value4 : null;
        Object value5 = parcel.readValue(cls2.getClassLoader());
        Boolean bool3 = value5 instanceof Boolean ? (Boolean) value5 : null;
        Object value6 = parcel.readValue(cls.getClassLoader());
        Long l8 = value6 instanceof Long ? (Long) value6 : null;
        String string3 = parcel.readString();
        Object value7 = parcel.readValue(cls.getClassLoader());
        Long l10 = value7 instanceof Long ? (Long) value7 : null;
        Object value8 = parcel.readValue(cls.getClassLoader());
        Long l11 = value8 instanceof Long ? (Long) value8 : null;
        String string4 = parcel.readString();
        Object value9 = parcel.readValue(Integer.TYPE.getClassLoader());
        Long l12 = l6;
        this(string, string2, l5, l12, bool, bool2, bool3, l8, string3, l10, l11, string4, value9 instanceof Integer ? (Integer) value9 : null);
    }
}
