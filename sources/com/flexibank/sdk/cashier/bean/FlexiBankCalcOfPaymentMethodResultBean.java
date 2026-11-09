package com.flexibank.sdk.cashier.bean;

import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.F;
import com.flexibank.sdk.core.bean.FlexiBankEarlyRefundBean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Parcelize
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R$\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R$\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R$\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R$\u0010\u001f\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R$\u0010#\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010*\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00101\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00108\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010?\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010F\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010L\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010\u0004\u001a\u0004\bM\u0010\u0006\"\u0004\bN\u0010\bR$\u0010O\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010\u000e\u001a\u0004\bP\u0010\u0010\"\u0004\bQ\u0010\u0012R$\u0010R\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010@\u001a\u0004\bS\u0010B\"\u0004\bT\u0010D¨\u0006U"}, d2 = {"Lcom/flexibank/sdk/cashier/bean/FlexiBankCalcOfPaymentMethodResultBean;", "Landroid/os/Parcelable;", "", "cacheKey", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "setCacheKey", "(Ljava/lang/String;)V", "seqId", "getSeqId", "setSeqId", "", "orderAmount", "Ljava/lang/Long;", "getOrderAmount", "()Ljava/lang/Long;", "setOrderAmount", "(Ljava/lang/Long;)V", "payAmount", "h", "setPayAmount", "discountPackageAmount", "d", "setDiscountPackageAmount", "payeeAmount", "getPayeeAmount", "setPayeeAmount", "totalAmount", "getTotalAmount", "setTotalAmount", "totalDiscountAmount", "m", "setTotalDiscountAmount", "Lcom/flexibank/sdk/cashier/bean/FlexiBankCalcPaymentFeeInfoBean;", "feeInfo", "Lcom/flexibank/sdk/cashier/bean/FlexiBankCalcPaymentFeeInfoBean;", "g", "()Lcom/flexibank/sdk/cashier/bean/FlexiBankCalcPaymentFeeInfoBean;", "setFeeInfo", "(Lcom/flexibank/sdk/cashier/bean/FlexiBankCalcPaymentFeeInfoBean;)V", "Lcom/flexibank/sdk/cashier/bean/FlexiBankCashierTaxDetailBean;", "taxInfo", "Lcom/flexibank/sdk/cashier/bean/FlexiBankCashierTaxDetailBean;", "l", "()Lcom/flexibank/sdk/cashier/bean/FlexiBankCashierTaxDetailBean;", "setTaxInfo", "(Lcom/flexibank/sdk/cashier/bean/FlexiBankCashierTaxDetailBean;)V", "Lcom/flexibank/sdk/cashier/bean/FlexiBankCalcPaymentPromotionBean;", "promotion", "Lcom/flexibank/sdk/cashier/bean/FlexiBankCalcPaymentPromotionBean;", "j", "()Lcom/flexibank/sdk/cashier/bean/FlexiBankCalcPaymentPromotionBean;", "setPromotion", "(Lcom/flexibank/sdk/cashier/bean/FlexiBankCalcPaymentPromotionBean;)V", "Lcom/flexibank/sdk/cashier/bean/FlexiBankCalcPaymentEarnInfoBean;", "earnInfo", "Lcom/flexibank/sdk/cashier/bean/FlexiBankCalcPaymentEarnInfoBean;", "f", "()Lcom/flexibank/sdk/cashier/bean/FlexiBankCalcPaymentEarnInfoBean;", "setEarnInfo", "(Lcom/flexibank/sdk/cashier/bean/FlexiBankCalcPaymentEarnInfoBean;)V", "", "earlyRefundEnable", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "setEarlyRefundEnable", "(Ljava/lang/Boolean;)V", "Lcom/flexibank/sdk/core/bean/FlexiBankEarlyRefundBean;", "earlyRefund", "Lcom/flexibank/sdk/core/bean/FlexiBankEarlyRefundBean;", "getEarlyRefund", "()Lcom/flexibank/sdk/core/bean/FlexiBankEarlyRefundBean;", "setEarlyRefund", "(Lcom/flexibank/sdk/core/bean/FlexiBankEarlyRefundBean;)V", "riskMsg", "k", "setRiskMsg", "paymentMethodsDiscount", "i", "setPaymentMethodsDiscount", "isQuickPay", "n", "setQuickPay", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FlexiBankCalcOfPaymentMethodResultBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FlexiBankCalcOfPaymentMethodResultBean> CREATOR = new a();

    @Nullable
    private String cacheKey;

    @Nullable
    private Long discountPackageAmount;

    @Nullable
    private FlexiBankEarlyRefundBean earlyRefund;

    @Nullable
    private Boolean earlyRefundEnable;

    @Nullable
    private FlexiBankCalcPaymentEarnInfoBean earnInfo;

    @Nullable
    private FlexiBankCalcPaymentFeeInfoBean feeInfo;

    @Nullable
    private Boolean isQuickPay;

    @Nullable
    private Long orderAmount;

    @Nullable
    private Long payAmount;

    @Nullable
    private Long payeeAmount;

    @Nullable
    private Long paymentMethodsDiscount;

    @Nullable
    private FlexiBankCalcPaymentPromotionBean promotion;

    @Nullable
    private String riskMsg;

    @Nullable
    private String seqId;

    @Nullable
    private FlexiBankCashierTaxDetailBean taxInfo;

    @Nullable
    private Long totalAmount;

    @Nullable
    private Long totalDiscountAmount;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FlexiBankCalcOfPaymentMethodResultBean> {
        @Override // android.os.Parcelable.Creator
        public final FlexiBankCalcOfPaymentMethodResultBean createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf4 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf5 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf6 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            FlexiBankCalcPaymentFeeInfoBean flexiBankCalcPaymentFeeInfoBeanCreateFromParcel = parcel.readInt() == 0 ? null : FlexiBankCalcPaymentFeeInfoBean.CREATOR.createFromParcel(parcel);
            FlexiBankCashierTaxDetailBean flexiBankCashierTaxDetailBeanCreateFromParcel = parcel.readInt() == 0 ? null : FlexiBankCashierTaxDetailBean.CREATOR.createFromParcel(parcel);
            FlexiBankCalcPaymentPromotionBean flexiBankCalcPaymentPromotionBeanCreateFromParcel = parcel.readInt() == 0 ? null : FlexiBankCalcPaymentPromotionBean.CREATOR.createFromParcel(parcel);
            FlexiBankCalcPaymentEarnInfoBean flexiBankCalcPaymentEarnInfoBeanCreateFromParcel = parcel.readInt() == 0 ? null : FlexiBankCalcPaymentEarnInfoBean.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            FlexiBankEarlyRefundBean flexiBankEarlyRefundBeanCreateFromParcel = parcel.readInt() == 0 ? null : FlexiBankEarlyRefundBean.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            Long lValueOf7 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FlexiBankCalcOfPaymentMethodResultBean(string, string2, lValueOf, lValueOf2, lValueOf3, lValueOf4, lValueOf5, lValueOf6, flexiBankCalcPaymentFeeInfoBeanCreateFromParcel, flexiBankCashierTaxDetailBeanCreateFromParcel, flexiBankCalcPaymentPromotionBeanCreateFromParcel, flexiBankCalcPaymentEarnInfoBeanCreateFromParcel, boolValueOf, flexiBankEarlyRefundBeanCreateFromParcel, string3, lValueOf7, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final FlexiBankCalcOfPaymentMethodResultBean[] newArray(int i7) {
            return new FlexiBankCalcOfPaymentMethodResultBean[i7];
        }
    }

    public FlexiBankCalcOfPaymentMethodResultBean(String str, String str2, Long l5, Long l6, Long l8, Long l10, Long l11, Long l12, FlexiBankCalcPaymentFeeInfoBean flexiBankCalcPaymentFeeInfoBean, FlexiBankCashierTaxDetailBean flexiBankCashierTaxDetailBean, FlexiBankCalcPaymentPromotionBean flexiBankCalcPaymentPromotionBean, FlexiBankCalcPaymentEarnInfoBean flexiBankCalcPaymentEarnInfoBean, Boolean bool, FlexiBankEarlyRefundBean flexiBankEarlyRefundBean, String str3, Long l13, Boolean bool2) {
        this.cacheKey = str;
        this.seqId = str2;
        this.orderAmount = l5;
        this.payAmount = l6;
        this.discountPackageAmount = l8;
        this.payeeAmount = l10;
        this.totalAmount = l11;
        this.totalDiscountAmount = l12;
        this.feeInfo = flexiBankCalcPaymentFeeInfoBean;
        this.taxInfo = flexiBankCashierTaxDetailBean;
        this.promotion = flexiBankCalcPaymentPromotionBean;
        this.earnInfo = flexiBankCalcPaymentEarnInfoBean;
        this.earlyRefundEnable = bool;
        this.earlyRefund = flexiBankEarlyRefundBean;
        this.riskMsg = str3;
        this.paymentMethodsDiscount = l13;
        this.isQuickPay = bool2;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCacheKey() {
        return this.cacheKey;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getDiscountPackageAmount() {
        return this.discountPackageAmount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getEarlyRefundEnable() {
        return this.earlyRefundEnable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlexiBankCalcOfPaymentMethodResultBean)) {
            return false;
        }
        FlexiBankCalcOfPaymentMethodResultBean flexiBankCalcOfPaymentMethodResultBean = (FlexiBankCalcOfPaymentMethodResultBean) obj;
        return Intrinsics.c(this.cacheKey, flexiBankCalcOfPaymentMethodResultBean.cacheKey) && Intrinsics.c(this.seqId, flexiBankCalcOfPaymentMethodResultBean.seqId) && Intrinsics.c(this.orderAmount, flexiBankCalcOfPaymentMethodResultBean.orderAmount) && Intrinsics.c(this.payAmount, flexiBankCalcOfPaymentMethodResultBean.payAmount) && Intrinsics.c(this.discountPackageAmount, flexiBankCalcOfPaymentMethodResultBean.discountPackageAmount) && Intrinsics.c(this.payeeAmount, flexiBankCalcOfPaymentMethodResultBean.payeeAmount) && Intrinsics.c(this.totalAmount, flexiBankCalcOfPaymentMethodResultBean.totalAmount) && Intrinsics.c(this.totalDiscountAmount, flexiBankCalcOfPaymentMethodResultBean.totalDiscountAmount) && Intrinsics.c(this.feeInfo, flexiBankCalcOfPaymentMethodResultBean.feeInfo) && Intrinsics.c(this.taxInfo, flexiBankCalcOfPaymentMethodResultBean.taxInfo) && Intrinsics.c(this.promotion, flexiBankCalcOfPaymentMethodResultBean.promotion) && Intrinsics.c(this.earnInfo, flexiBankCalcOfPaymentMethodResultBean.earnInfo) && Intrinsics.c(this.earlyRefundEnable, flexiBankCalcOfPaymentMethodResultBean.earlyRefundEnable) && Intrinsics.c(this.earlyRefund, flexiBankCalcOfPaymentMethodResultBean.earlyRefund) && Intrinsics.c(this.riskMsg, flexiBankCalcOfPaymentMethodResultBean.riskMsg) && Intrinsics.c(this.paymentMethodsDiscount, flexiBankCalcOfPaymentMethodResultBean.paymentMethodsDiscount) && Intrinsics.c(this.isQuickPay, flexiBankCalcOfPaymentMethodResultBean.isQuickPay);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final FlexiBankCalcPaymentEarnInfoBean getEarnInfo() {
        return this.earnInfo;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final FlexiBankCalcPaymentFeeInfoBean getFeeInfo() {
        return this.feeInfo;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Long getPayAmount() {
        return this.payAmount;
    }

    public final int hashCode() {
        String str = this.cacheKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.seqId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l5 = this.orderAmount;
        int iHashCode3 = (iHashCode2 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.payAmount;
        int iHashCode4 = (iHashCode3 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l8 = this.discountPackageAmount;
        int iHashCode5 = (iHashCode4 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Long l10 = this.payeeAmount;
        int iHashCode6 = (iHashCode5 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.totalAmount;
        int iHashCode7 = (iHashCode6 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.totalDiscountAmount;
        int iHashCode8 = (iHashCode7 + (l12 == null ? 0 : l12.hashCode())) * 31;
        FlexiBankCalcPaymentFeeInfoBean flexiBankCalcPaymentFeeInfoBean = this.feeInfo;
        int iHashCode9 = (iHashCode8 + (flexiBankCalcPaymentFeeInfoBean == null ? 0 : flexiBankCalcPaymentFeeInfoBean.hashCode())) * 31;
        FlexiBankCashierTaxDetailBean flexiBankCashierTaxDetailBean = this.taxInfo;
        int iHashCode10 = (iHashCode9 + (flexiBankCashierTaxDetailBean == null ? 0 : flexiBankCashierTaxDetailBean.hashCode())) * 31;
        FlexiBankCalcPaymentPromotionBean flexiBankCalcPaymentPromotionBean = this.promotion;
        int iHashCode11 = (iHashCode10 + (flexiBankCalcPaymentPromotionBean == null ? 0 : flexiBankCalcPaymentPromotionBean.hashCode())) * 31;
        FlexiBankCalcPaymentEarnInfoBean flexiBankCalcPaymentEarnInfoBean = this.earnInfo;
        int iHashCode12 = (iHashCode11 + (flexiBankCalcPaymentEarnInfoBean == null ? 0 : flexiBankCalcPaymentEarnInfoBean.hashCode())) * 31;
        Boolean bool = this.earlyRefundEnable;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        FlexiBankEarlyRefundBean flexiBankEarlyRefundBean = this.earlyRefund;
        int iHashCode14 = (iHashCode13 + (flexiBankEarlyRefundBean == null ? 0 : flexiBankEarlyRefundBean.hashCode())) * 31;
        String str3 = this.riskMsg;
        int iHashCode15 = (iHashCode14 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l13 = this.paymentMethodsDiscount;
        int iHashCode16 = (iHashCode15 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Boolean bool2 = this.isQuickPay;
        return iHashCode16 + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getPaymentMethodsDiscount() {
        return this.paymentMethodsDiscount;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final FlexiBankCalcPaymentPromotionBean getPromotion() {
        return this.promotion;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getRiskMsg() {
        return this.riskMsg;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final FlexiBankCashierTaxDetailBean getTaxInfo() {
        return this.taxInfo;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Long getTotalDiscountAmount() {
        return this.totalDiscountAmount;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Boolean getIsQuickPay() {
        return this.isQuickPay;
    }

    public final String toString() {
        String str = this.cacheKey;
        String str2 = this.seqId;
        Long l5 = this.orderAmount;
        Long l6 = this.payAmount;
        Long l8 = this.discountPackageAmount;
        Long l10 = this.payeeAmount;
        Long l11 = this.totalAmount;
        Long l12 = this.totalDiscountAmount;
        FlexiBankCalcPaymentFeeInfoBean flexiBankCalcPaymentFeeInfoBean = this.feeInfo;
        FlexiBankCashierTaxDetailBean flexiBankCashierTaxDetailBean = this.taxInfo;
        FlexiBankCalcPaymentPromotionBean flexiBankCalcPaymentPromotionBean = this.promotion;
        FlexiBankCalcPaymentEarnInfoBean flexiBankCalcPaymentEarnInfoBean = this.earnInfo;
        Boolean bool = this.earlyRefundEnable;
        FlexiBankEarlyRefundBean flexiBankEarlyRefundBean = this.earlyRefund;
        String str3 = this.riskMsg;
        Long l13 = this.paymentMethodsDiscount;
        Boolean bool2 = this.isQuickPay;
        StringBuilder sbF = F.f("FlexiBankCalcOfPaymentMethodResultBean(cacheKey=", str, ", seqId=", str2, ", orderAmount=");
        q0.w(sbF, l5, ", payAmount=", l6, ", discountPackageAmount=");
        q0.w(sbF, l8, ", payeeAmount=", l10, ", totalAmount=");
        q0.w(sbF, l11, ", totalDiscountAmount=", l12, ", feeInfo=");
        sbF.append(flexiBankCalcPaymentFeeInfoBean);
        sbF.append(", taxInfo=");
        sbF.append(flexiBankCashierTaxDetailBean);
        sbF.append(", promotion=");
        sbF.append(flexiBankCalcPaymentPromotionBean);
        sbF.append(", earnInfo=");
        sbF.append(flexiBankCalcPaymentEarnInfoBean);
        sbF.append(", earlyRefundEnable=");
        sbF.append(bool);
        sbF.append(", earlyRefund=");
        sbF.append(flexiBankEarlyRefundBean);
        sbF.append(", riskMsg=");
        sbF.append(str3);
        sbF.append(", paymentMethodsDiscount=");
        sbF.append(l13);
        sbF.append(", isQuickPay=");
        sbF.append(bool2);
        sbF.append(")");
        return sbF.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.cacheKey);
        dest.writeString(this.seqId);
        Long l5 = this.orderAmount;
        if (l5 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l5);
        }
        Long l6 = this.payAmount;
        if (l6 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l6);
        }
        Long l8 = this.discountPackageAmount;
        if (l8 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l8);
        }
        Long l10 = this.payeeAmount;
        if (l10 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l10);
        }
        Long l11 = this.totalAmount;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l11);
        }
        Long l12 = this.totalDiscountAmount;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l12);
        }
        FlexiBankCalcPaymentFeeInfoBean flexiBankCalcPaymentFeeInfoBean = this.feeInfo;
        if (flexiBankCalcPaymentFeeInfoBean == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            flexiBankCalcPaymentFeeInfoBean.writeToParcel(dest, i7);
        }
        FlexiBankCashierTaxDetailBean flexiBankCashierTaxDetailBean = this.taxInfo;
        if (flexiBankCashierTaxDetailBean == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            flexiBankCashierTaxDetailBean.writeToParcel(dest, i7);
        }
        FlexiBankCalcPaymentPromotionBean flexiBankCalcPaymentPromotionBean = this.promotion;
        if (flexiBankCalcPaymentPromotionBean == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            flexiBankCalcPaymentPromotionBean.writeToParcel(dest, i7);
        }
        FlexiBankCalcPaymentEarnInfoBean flexiBankCalcPaymentEarnInfoBean = this.earnInfo;
        if (flexiBankCalcPaymentEarnInfoBean == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            flexiBankCalcPaymentEarnInfoBean.writeToParcel(dest, i7);
        }
        Boolean bool = this.earlyRefundEnable;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            q0.r(dest, 1, bool);
        }
        FlexiBankEarlyRefundBean flexiBankEarlyRefundBean = this.earlyRefund;
        if (flexiBankEarlyRefundBean == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            flexiBankEarlyRefundBean.writeToParcel(dest, i7);
        }
        dest.writeString(this.riskMsg);
        Long l13 = this.paymentMethodsDiscount;
        if (l13 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l13);
        }
        Boolean bool2 = this.isQuickPay;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            q0.r(dest, 1, bool2);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FlexiBankCalcOfPaymentMethodResultBean() {
        Boolean bool = Boolean.FALSE;
        this(null, null, 0L, 0L, 0L, 0L, 0L, 0L, null, null, null, null, bool, null, null, 0L, bool);
    }
}
