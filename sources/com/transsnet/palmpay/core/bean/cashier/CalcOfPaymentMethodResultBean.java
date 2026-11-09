package com.transsnet.palmpay.core.bean.cashier;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.microsoft.codepush.react.CodePushConstants;
import com.transsnet.palmpay.core.bean.EarlyRefundBean;
import com.transsnet.palmpay.core.bean.payment.CashierManualGet;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 ,2\u00020\u0001:\u0001,B÷\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b \u0010!B\u0011\b\u0016\u0012\u0006\u0010\"\u001a\u00020#¢\u0006\u0004\b \u0010$J\u0018\u0010'\u001a\u00020(2\u0006\u0010\"\u001a\u00020#2\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020*H\u0016R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010%R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010%R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010%R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010%R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010%R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010%R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010&R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010%R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010&R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/CalcOfPaymentMethodResultBean;", "Landroid/os/Parcelable;", "cacheKey", "", "seqId", "orderAmount", "", "payAmount", "discountPackageAmount", "payeeAmount", "totalAmount", "totalDiscountAmount", "feeInfo", "Lcom/transsnet/palmpay/core/bean/cashier/CalcPaymentFeeInfoBean;", "taxesInfo", "promotion", "Lcom/transsnet/palmpay/core/bean/cashier/CalcPaymentPromotionBean;", "earnInfo", "Lcom/transsnet/palmpay/core/bean/cashier/CalcPaymentEarnInfoBean;", "earlyRefundEnable", "", "earlyRefund", "Lcom/transsnet/palmpay/core/bean/EarlyRefundBean;", "cusRightsDto", "Lcom/transsnet/palmpay/core/bean/cashier/CusRightsDto;", "riskMsg", "paymentMethodsDiscount", "isQuickPay", "manualGet", "Lcom/transsnet/palmpay/core/bean/payment/CashierManualGet;", "combinationInfo", "Lcom/transsnet/palmpay/core/bean/cashier/CalcOfCombinationInfoBean;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/transsnet/palmpay/core/bean/cashier/CalcPaymentFeeInfoBean;Lcom/transsnet/palmpay/core/bean/cashier/CalcPaymentFeeInfoBean;Lcom/transsnet/palmpay/core/bean/cashier/CalcPaymentPromotionBean;Lcom/transsnet/palmpay/core/bean/cashier/CalcPaymentEarnInfoBean;Ljava/lang/Boolean;Lcom/transsnet/palmpay/core/bean/EarlyRefundBean;Lcom/transsnet/palmpay/core/bean/cashier/CusRightsDto;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Lcom/transsnet/palmpay/core/bean/payment/CashierManualGet;Lcom/transsnet/palmpay/core/bean/cashier/CalcOfCombinationInfoBean;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "Ljava/lang/Long;", "Ljava/lang/Boolean;", "writeToParcel", "", "flags", "", "describeContents", "CREATOR", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CalcOfPaymentMethodResultBean implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @Nullable
    public String cacheKey;

    @JvmField
    @Nullable
    public CalcOfCombinationInfoBean combinationInfo;

    @JvmField
    @Nullable
    public CusRightsDto cusRightsDto;

    @JvmField
    @Nullable
    public Long discountPackageAmount;

    @JvmField
    @Nullable
    public EarlyRefundBean earlyRefund;

    @JvmField
    @Nullable
    public Boolean earlyRefundEnable;

    @JvmField
    @Nullable
    public CalcPaymentEarnInfoBean earnInfo;

    @JvmField
    @Nullable
    public CalcPaymentFeeInfoBean feeInfo;

    @JvmField
    @Nullable
    public Boolean isQuickPay;

    @JvmField
    @Nullable
    public CashierManualGet manualGet;

    @JvmField
    @Nullable
    public Long orderAmount;

    @JvmField
    @Nullable
    public Long payAmount;

    @JvmField
    @Nullable
    public Long payeeAmount;

    @JvmField
    @Nullable
    public Long paymentMethodsDiscount;

    @JvmField
    @Nullable
    public CalcPaymentPromotionBean promotion;

    @JvmField
    @Nullable
    public String riskMsg;

    @JvmField
    @Nullable
    public String seqId;

    @JvmField
    @Nullable
    public CalcPaymentFeeInfoBean taxesInfo;

    @JvmField
    @Nullable
    public Long totalAmount;

    @JvmField
    @Nullable
    public Long totalDiscountAmount;

    /* JADX INFO: renamed from: com.transsnet.palmpay.core.bean.cashier.CalcOfPaymentMethodResultBean$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/CalcOfPaymentMethodResultBean$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/core/bean/cashier/CalcOfPaymentMethodResultBean;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/core/bean/cashier/CalcOfPaymentMethodResultBean;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<CalcOfPaymentMethodResultBean> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CalcOfPaymentMethodResultBean createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CalcOfPaymentMethodResultBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CalcOfPaymentMethodResultBean[] newArray(int size) {
            return new CalcOfPaymentMethodResultBean[size];
        }
    }

    public CalcOfPaymentMethodResultBean() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.cacheKey);
        parcel.writeString(this.seqId);
        parcel.writeValue(this.orderAmount);
        parcel.writeValue(this.payAmount);
        parcel.writeValue(this.discountPackageAmount);
        parcel.writeValue(this.payeeAmount);
        parcel.writeValue(this.totalAmount);
        parcel.writeValue(this.totalDiscountAmount);
        parcel.writeParcelable(this.feeInfo, flags);
        parcel.writeParcelable(this.taxesInfo, flags);
        parcel.writeParcelable(this.promotion, flags);
        parcel.writeParcelable(this.earnInfo, flags);
        parcel.writeValue(this.earlyRefundEnable);
        parcel.writeParcelable(this.earlyRefund, flags);
        parcel.writeParcelable(this.cusRightsDto, flags);
        parcel.writeString(this.riskMsg);
        parcel.writeValue(this.paymentMethodsDiscount);
        parcel.writeValue(this.isQuickPay);
        parcel.writeParcelable(this.manualGet, flags);
    }

    public CalcOfPaymentMethodResultBean(@Nullable String str, @Nullable String str2, @Nullable Long l5, @Nullable Long l6, @Nullable Long l8, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable CalcPaymentFeeInfoBean calcPaymentFeeInfoBean, @Nullable CalcPaymentFeeInfoBean calcPaymentFeeInfoBean2, @Nullable CalcPaymentPromotionBean calcPaymentPromotionBean, @Nullable CalcPaymentEarnInfoBean calcPaymentEarnInfoBean, @Nullable Boolean bool, @Nullable EarlyRefundBean earlyRefundBean, @Nullable CusRightsDto cusRightsDto, @Nullable String str3, @Nullable Long l13, @Nullable Boolean bool2, @Nullable CashierManualGet cashierManualGet, @Nullable CalcOfCombinationInfoBean calcOfCombinationInfoBean) {
        this.cacheKey = str;
        this.seqId = str2;
        this.orderAmount = l5;
        this.payAmount = l6;
        this.discountPackageAmount = l8;
        this.payeeAmount = l10;
        this.totalAmount = l11;
        this.totalDiscountAmount = l12;
        this.feeInfo = calcPaymentFeeInfoBean;
        this.taxesInfo = calcPaymentFeeInfoBean2;
        this.promotion = calcPaymentPromotionBean;
        this.earnInfo = calcPaymentEarnInfoBean;
        this.earlyRefundEnable = bool;
        this.earlyRefund = earlyRefundBean;
        this.cusRightsDto = cusRightsDto;
        this.riskMsg = str3;
        this.paymentMethodsDiscount = l13;
        this.isQuickPay = bool2;
        this.manualGet = cashierManualGet;
        this.combinationInfo = calcOfCombinationInfoBean;
    }

    public /* synthetic */ CalcOfPaymentMethodResultBean(String str, String str2, Long l5, Long l6, Long l8, Long l10, Long l11, Long l12, CalcPaymentFeeInfoBean calcPaymentFeeInfoBean, CalcPaymentFeeInfoBean calcPaymentFeeInfoBean2, CalcPaymentPromotionBean calcPaymentPromotionBean, CalcPaymentEarnInfoBean calcPaymentEarnInfoBean, Boolean bool, EarlyRefundBean earlyRefundBean, CusRightsDto cusRightsDto, String str3, Long l13, Boolean bool2, CashierManualGet cashierManualGet, CalcOfCombinationInfoBean calcOfCombinationInfoBean, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? 0L : l5, (i7 & 8) != 0 ? 0L : l6, (i7 & 16) != 0 ? 0L : l8, (i7 & 32) != 0 ? 0L : l10, (i7 & 64) != 0 ? 0L : l11, (i7 & 128) != 0 ? 0L : l12, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : calcPaymentFeeInfoBean, (i7 & 512) != 0 ? null : calcPaymentFeeInfoBean2, (i7 & 1024) != 0 ? null : calcPaymentPromotionBean, (i7 & 2048) != 0 ? null : calcPaymentEarnInfoBean, (i7 & 4096) != 0 ? Boolean.FALSE : bool, (i7 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? null : earlyRefundBean, (i7 & 16384) != 0 ? null : cusRightsDto, (i7 & 32768) != 0 ? null : str3, (i7 & 65536) != 0 ? 0L : l13, (i7 & 131072) != 0 ? Boolean.FALSE : bool2, (i7 & CodePushConstants.DOWNLOAD_BUFFER_SIZE) != 0 ? null : cashierManualGet, (i7 & 524288) != 0 ? null : calcOfCombinationInfoBean);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CalcOfPaymentMethodResultBean(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        String string2 = parcel.readString();
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
        CalcPaymentFeeInfoBean calcPaymentFeeInfoBean = (CalcPaymentFeeInfoBean) parcel.readParcelable(CalcPaymentFeeInfoBean.class.getClassLoader());
        CalcPaymentFeeInfoBean calcPaymentFeeInfoBean2 = (CalcPaymentFeeInfoBean) parcel.readParcelable(CalcPaymentFeeInfoBean.class.getClassLoader());
        CalcPaymentPromotionBean calcPaymentPromotionBean = (CalcPaymentPromotionBean) parcel.readParcelable(CalcPaymentPromotionBean.class.getClassLoader());
        CalcPaymentEarnInfoBean calcPaymentEarnInfoBean = (CalcPaymentEarnInfoBean) parcel.readParcelable(CalcPaymentEarnInfoBean.class.getClassLoader());
        Class cls2 = Boolean.TYPE;
        Object value7 = parcel.readValue(cls2.getClassLoader());
        Boolean bool = value7 instanceof Boolean ? (Boolean) value7 : null;
        EarlyRefundBean earlyRefundBean = (EarlyRefundBean) parcel.readParcelable(EarlyRefundBean.class.getClassLoader());
        CusRightsDto cusRightsDto = (CusRightsDto) parcel.readParcelable(CusRightsDto.class.getClassLoader());
        String string3 = parcel.readString();
        Object value8 = parcel.readValue(cls.getClassLoader());
        Long l13 = l6;
        Long l14 = value8 instanceof Long ? (Long) value8 : null;
        Object value9 = parcel.readValue(cls2.getClassLoader());
        Long l15 = l14;
        this(string, string2, l5, l13, l8, l10, l11, l12, calcPaymentFeeInfoBean, calcPaymentFeeInfoBean2, calcPaymentPromotionBean, calcPaymentEarnInfoBean, bool, earlyRefundBean, cusRightsDto, string3, l15, value9 instanceof Boolean ? (Boolean) value9 : null, (CashierManualGet) parcel.readParcelable(CashierManualGet.class.getClassLoader()), null, 524288, null);
    }
}
