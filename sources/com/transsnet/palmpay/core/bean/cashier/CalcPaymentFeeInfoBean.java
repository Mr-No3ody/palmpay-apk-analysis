package com.transsnet.palmpay.core.bean.cashier;

import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Parcelize
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010:\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010;\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010<\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010=\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010>\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010@\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010A\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010B\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0017HÆ\u0003JÚ\u0001\u0010G\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0002\u0010HJ\u0006\u0010I\u001a\u00020\u0003J\u0013\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010MHÖ\u0003J\t\u0010N\u001a\u00020\u0003HÖ\u0001J\t\u0010O\u001a\u00020PHÖ\u0001J\u0016\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001e\u0010\u001bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\"\u0010 R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010!\u001a\u0004\b#\u0010 R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010!\u001a\u0004\b$\u0010 R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010!\u001a\u0004\b%\u0010 R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010!\u001a\u0004\b&\u0010 R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010!\u001a\u0004\b'\u0010 R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010!\u001a\u0004\b(\u0010 R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010!\u001a\u0004\b)\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010+\"\u0004\b0\u00101R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u0006V"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/CalcPaymentFeeInfoBean;", "Landroid/os/Parcelable;", "feeTraiffId", "", "payeeFeeTraiffId", "platformFeeTraiffId", "fee", "", "vat", "payeeFee", "payeeVat", "platformFee", "platformVat", "payStampDuty", "receiveStampDuty", "okcardFee", "payeeFeeDetail", "Lcom/transsnet/palmpay/core/bean/cashier/PaymentFeeDetailBean;", "platFormFeeDetail", "feeTips", "Lcom/transsnet/palmpay/core/bean/cashier/FeeTips;", "feeDetail", "taxInfo", "Lcom/transsnet/palmpay/core/bean/cashier/CashierTaxDetailBean;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/transsnet/palmpay/core/bean/cashier/PaymentFeeDetailBean;Lcom/transsnet/palmpay/core/bean/cashier/PaymentFeeDetailBean;Lcom/transsnet/palmpay/core/bean/cashier/FeeTips;Lcom/transsnet/palmpay/core/bean/cashier/PaymentFeeDetailBean;Lcom/transsnet/palmpay/core/bean/cashier/CashierTaxDetailBean;)V", "getFeeTraiffId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPayeeFeeTraiffId", "getPlatformFeeTraiffId", "getFee", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getVat", "getPayeeFee", "getPayeeVat", "getPlatformFee", "getPlatformVat", "getPayStampDuty", "getReceiveStampDuty", "getOkcardFee", "getPayeeFeeDetail", "()Lcom/transsnet/palmpay/core/bean/cashier/PaymentFeeDetailBean;", "getPlatFormFeeDetail", "getFeeTips", "()Lcom/transsnet/palmpay/core/bean/cashier/FeeTips;", "getFeeDetail", "setFeeDetail", "(Lcom/transsnet/palmpay/core/bean/cashier/PaymentFeeDetailBean;)V", "getTaxInfo", "()Lcom/transsnet/palmpay/core/bean/cashier/CashierTaxDetailBean;", "setTaxInfo", "(Lcom/transsnet/palmpay/core/bean/cashier/CashierTaxDetailBean;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/transsnet/palmpay/core/bean/cashier/PaymentFeeDetailBean;Lcom/transsnet/palmpay/core/bean/cashier/PaymentFeeDetailBean;Lcom/transsnet/palmpay/core/bean/cashier/FeeTips;Lcom/transsnet/palmpay/core/bean/cashier/PaymentFeeDetailBean;Lcom/transsnet/palmpay/core/bean/cashier/CashierTaxDetailBean;)Lcom/transsnet/palmpay/core/bean/cashier/CalcPaymentFeeInfoBean;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CalcPaymentFeeInfoBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CalcPaymentFeeInfoBean> CREATOR = new Creator();

    @Nullable
    private final Long fee;

    @Nullable
    private PaymentFeeDetailBean feeDetail;

    @Nullable
    private final FeeTips feeTips;

    @Nullable
    private final Integer feeTraiffId;

    @Nullable
    private final Long okcardFee;

    @Nullable
    private final Long payStampDuty;

    @Nullable
    private final Long payeeFee;

    @Nullable
    private final PaymentFeeDetailBean payeeFeeDetail;

    @Nullable
    private final Integer payeeFeeTraiffId;

    @Nullable
    private final Long payeeVat;

    @Nullable
    private final PaymentFeeDetailBean platFormFeeDetail;

    @Nullable
    private final Long platformFee;

    @Nullable
    private final Integer platformFeeTraiffId;

    @Nullable
    private final Long platformVat;

    @Nullable
    private final Long receiveStampDuty;

    @Nullable
    private CashierTaxDetailBean taxInfo;

    @Nullable
    private final Long vat;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CalcPaymentFeeInfoBean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CalcPaymentFeeInfoBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CalcPaymentFeeInfoBean(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : PaymentFeeDetailBean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PaymentFeeDetailBean.CREATOR.createFromParcel(parcel), (FeeTips) parcel.readParcelable(CalcPaymentFeeInfoBean.class.getClassLoader()), parcel.readInt() == 0 ? null : PaymentFeeDetailBean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CashierTaxDetailBean.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CalcPaymentFeeInfoBean[] newArray(int i7) {
            return new CalcPaymentFeeInfoBean[i7];
        }
    }

    public CalcPaymentFeeInfoBean() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public static /* synthetic */ CalcPaymentFeeInfoBean copy$default(CalcPaymentFeeInfoBean calcPaymentFeeInfoBean, Integer num, Integer num2, Integer num3, Long l5, Long l6, Long l8, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15, PaymentFeeDetailBean paymentFeeDetailBean, PaymentFeeDetailBean paymentFeeDetailBean2, FeeTips feeTips, PaymentFeeDetailBean paymentFeeDetailBean3, CashierTaxDetailBean cashierTaxDetailBean, int i7, Object obj) {
        CashierTaxDetailBean cashierTaxDetailBean2;
        PaymentFeeDetailBean paymentFeeDetailBean4;
        Integer num4 = (i7 & 1) != 0 ? calcPaymentFeeInfoBean.feeTraiffId : num;
        Integer num5 = (i7 & 2) != 0 ? calcPaymentFeeInfoBean.payeeFeeTraiffId : num2;
        Integer num6 = (i7 & 4) != 0 ? calcPaymentFeeInfoBean.platformFeeTraiffId : num3;
        Long l16 = (i7 & 8) != 0 ? calcPaymentFeeInfoBean.fee : l5;
        Long l17 = (i7 & 16) != 0 ? calcPaymentFeeInfoBean.vat : l6;
        Long l18 = (i7 & 32) != 0 ? calcPaymentFeeInfoBean.payeeFee : l8;
        Long l19 = (i7 & 64) != 0 ? calcPaymentFeeInfoBean.payeeVat : l10;
        Long l20 = (i7 & 128) != 0 ? calcPaymentFeeInfoBean.platformFee : l11;
        Long l21 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? calcPaymentFeeInfoBean.platformVat : l12;
        Long l22 = (i7 & 512) != 0 ? calcPaymentFeeInfoBean.payStampDuty : l13;
        Long l23 = (i7 & 1024) != 0 ? calcPaymentFeeInfoBean.receiveStampDuty : l14;
        Long l24 = (i7 & 2048) != 0 ? calcPaymentFeeInfoBean.okcardFee : l15;
        PaymentFeeDetailBean paymentFeeDetailBean5 = (i7 & 4096) != 0 ? calcPaymentFeeInfoBean.payeeFeeDetail : paymentFeeDetailBean;
        PaymentFeeDetailBean paymentFeeDetailBean6 = (i7 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? calcPaymentFeeInfoBean.platFormFeeDetail : paymentFeeDetailBean2;
        Integer num7 = num4;
        FeeTips feeTips2 = (i7 & 16384) != 0 ? calcPaymentFeeInfoBean.feeTips : feeTips;
        PaymentFeeDetailBean paymentFeeDetailBean7 = (i7 & 32768) != 0 ? calcPaymentFeeInfoBean.feeDetail : paymentFeeDetailBean3;
        if ((i7 & 65536) != 0) {
            paymentFeeDetailBean4 = paymentFeeDetailBean7;
            cashierTaxDetailBean2 = calcPaymentFeeInfoBean.taxInfo;
        } else {
            cashierTaxDetailBean2 = cashierTaxDetailBean;
            paymentFeeDetailBean4 = paymentFeeDetailBean7;
        }
        return calcPaymentFeeInfoBean.copy(num7, num5, num6, l16, l17, l18, l19, l20, l21, l22, l23, l24, paymentFeeDetailBean5, paymentFeeDetailBean6, feeTips2, paymentFeeDetailBean4, cashierTaxDetailBean2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getFeeTraiffId() {
        return this.feeTraiffId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getPayStampDuty() {
        return this.payStampDuty;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Long getReceiveStampDuty() {
        return this.receiveStampDuty;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Long getOkcardFee() {
        return this.okcardFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final PaymentFeeDetailBean getPayeeFeeDetail() {
        return this.payeeFeeDetail;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final PaymentFeeDetailBean getPlatFormFeeDetail() {
        return this.platFormFeeDetail;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final FeeTips getFeeTips() {
        return this.feeTips;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final PaymentFeeDetailBean getFeeDetail() {
        return this.feeDetail;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final CashierTaxDetailBean getTaxInfo() {
        return this.taxInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getPayeeFeeTraiffId() {
        return this.payeeFeeTraiffId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getPlatformFeeTraiffId() {
        return this.platformFeeTraiffId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getFee() {
        return this.fee;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getVat() {
        return this.vat;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getPayeeFee() {
        return this.payeeFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getPayeeVat() {
        return this.payeeVat;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getPlatformFee() {
        return this.platformFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getPlatformVat() {
        return this.platformVat;
    }

    @NotNull
    public final CalcPaymentFeeInfoBean copy(@Nullable Integer feeTraiffId, @Nullable Integer payeeFeeTraiffId, @Nullable Integer platformFeeTraiffId, @Nullable Long fee, @Nullable Long vat, @Nullable Long payeeFee, @Nullable Long payeeVat, @Nullable Long platformFee, @Nullable Long platformVat, @Nullable Long payStampDuty, @Nullable Long receiveStampDuty, @Nullable Long okcardFee, @Nullable PaymentFeeDetailBean payeeFeeDetail, @Nullable PaymentFeeDetailBean platFormFeeDetail, @Nullable FeeTips feeTips, @Nullable PaymentFeeDetailBean feeDetail, @Nullable CashierTaxDetailBean taxInfo) {
        return new CalcPaymentFeeInfoBean(feeTraiffId, payeeFeeTraiffId, platformFeeTraiffId, fee, vat, payeeFee, payeeVat, platformFee, platformVat, payStampDuty, receiveStampDuty, okcardFee, payeeFeeDetail, platFormFeeDetail, feeTips, feeDetail, taxInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalcPaymentFeeInfoBean)) {
            return false;
        }
        CalcPaymentFeeInfoBean calcPaymentFeeInfoBean = (CalcPaymentFeeInfoBean) other;
        return Intrinsics.c(this.feeTraiffId, calcPaymentFeeInfoBean.feeTraiffId) && Intrinsics.c(this.payeeFeeTraiffId, calcPaymentFeeInfoBean.payeeFeeTraiffId) && Intrinsics.c(this.platformFeeTraiffId, calcPaymentFeeInfoBean.platformFeeTraiffId) && Intrinsics.c(this.fee, calcPaymentFeeInfoBean.fee) && Intrinsics.c(this.vat, calcPaymentFeeInfoBean.vat) && Intrinsics.c(this.payeeFee, calcPaymentFeeInfoBean.payeeFee) && Intrinsics.c(this.payeeVat, calcPaymentFeeInfoBean.payeeVat) && Intrinsics.c(this.platformFee, calcPaymentFeeInfoBean.platformFee) && Intrinsics.c(this.platformVat, calcPaymentFeeInfoBean.platformVat) && Intrinsics.c(this.payStampDuty, calcPaymentFeeInfoBean.payStampDuty) && Intrinsics.c(this.receiveStampDuty, calcPaymentFeeInfoBean.receiveStampDuty) && Intrinsics.c(this.okcardFee, calcPaymentFeeInfoBean.okcardFee) && Intrinsics.c(this.payeeFeeDetail, calcPaymentFeeInfoBean.payeeFeeDetail) && Intrinsics.c(this.platFormFeeDetail, calcPaymentFeeInfoBean.platFormFeeDetail) && Intrinsics.c(this.feeTips, calcPaymentFeeInfoBean.feeTips) && Intrinsics.c(this.feeDetail, calcPaymentFeeInfoBean.feeDetail) && Intrinsics.c(this.taxInfo, calcPaymentFeeInfoBean.taxInfo);
    }

    @Nullable
    public final Long getFee() {
        return this.fee;
    }

    @Nullable
    public final PaymentFeeDetailBean getFeeDetail() {
        return this.feeDetail;
    }

    @Nullable
    public final FeeTips getFeeTips() {
        return this.feeTips;
    }

    @Nullable
    public final Integer getFeeTraiffId() {
        return this.feeTraiffId;
    }

    @Nullable
    public final Long getOkcardFee() {
        return this.okcardFee;
    }

    @Nullable
    public final Long getPayStampDuty() {
        return this.payStampDuty;
    }

    @Nullable
    public final Long getPayeeFee() {
        return this.payeeFee;
    }

    @Nullable
    public final PaymentFeeDetailBean getPayeeFeeDetail() {
        return this.payeeFeeDetail;
    }

    @Nullable
    public final Integer getPayeeFeeTraiffId() {
        return this.payeeFeeTraiffId;
    }

    @Nullable
    public final Long getPayeeVat() {
        return this.payeeVat;
    }

    @Nullable
    public final PaymentFeeDetailBean getPlatFormFeeDetail() {
        return this.platFormFeeDetail;
    }

    @Nullable
    public final Long getPlatformFee() {
        return this.platformFee;
    }

    @Nullable
    public final Integer getPlatformFeeTraiffId() {
        return this.platformFeeTraiffId;
    }

    @Nullable
    public final Long getPlatformVat() {
        return this.platformVat;
    }

    @Nullable
    public final Long getReceiveStampDuty() {
        return this.receiveStampDuty;
    }

    @Nullable
    public final CashierTaxDetailBean getTaxInfo() {
        return this.taxInfo;
    }

    @Nullable
    public final Long getVat() {
        return this.vat;
    }

    public int hashCode() {
        Integer num = this.feeTraiffId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.payeeFeeTraiffId;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.platformFeeTraiffId;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l5 = this.fee;
        int iHashCode4 = (iHashCode3 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.vat;
        int iHashCode5 = (iHashCode4 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l8 = this.payeeFee;
        int iHashCode6 = (iHashCode5 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Long l10 = this.payeeVat;
        int iHashCode7 = (iHashCode6 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.platformFee;
        int iHashCode8 = (iHashCode7 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.platformVat;
        int iHashCode9 = (iHashCode8 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.payStampDuty;
        int iHashCode10 = (iHashCode9 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.receiveStampDuty;
        int iHashCode11 = (iHashCode10 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.okcardFee;
        int iHashCode12 = (iHashCode11 + (l15 == null ? 0 : l15.hashCode())) * 31;
        PaymentFeeDetailBean paymentFeeDetailBean = this.payeeFeeDetail;
        int iHashCode13 = (iHashCode12 + (paymentFeeDetailBean == null ? 0 : paymentFeeDetailBean.hashCode())) * 31;
        PaymentFeeDetailBean paymentFeeDetailBean2 = this.platFormFeeDetail;
        int iHashCode14 = (iHashCode13 + (paymentFeeDetailBean2 == null ? 0 : paymentFeeDetailBean2.hashCode())) * 31;
        FeeTips feeTips = this.feeTips;
        int iHashCode15 = (iHashCode14 + (feeTips == null ? 0 : feeTips.hashCode())) * 31;
        PaymentFeeDetailBean paymentFeeDetailBean3 = this.feeDetail;
        int iHashCode16 = (iHashCode15 + (paymentFeeDetailBean3 == null ? 0 : paymentFeeDetailBean3.hashCode())) * 31;
        CashierTaxDetailBean cashierTaxDetailBean = this.taxInfo;
        return iHashCode16 + (cashierTaxDetailBean != null ? cashierTaxDetailBean.hashCode() : 0);
    }

    public final void setFeeDetail(@Nullable PaymentFeeDetailBean paymentFeeDetailBean) {
        this.feeDetail = paymentFeeDetailBean;
    }

    public final void setTaxInfo(@Nullable CashierTaxDetailBean cashierTaxDetailBean) {
        this.taxInfo = cashierTaxDetailBean;
    }

    @NotNull
    public String toString() {
        Integer num = this.feeTraiffId;
        Integer num2 = this.payeeFeeTraiffId;
        Integer num3 = this.platformFeeTraiffId;
        Long l5 = this.fee;
        Long l6 = this.vat;
        Long l8 = this.payeeFee;
        Long l10 = this.payeeVat;
        Long l11 = this.platformFee;
        Long l12 = this.platformVat;
        Long l13 = this.payStampDuty;
        Long l14 = this.receiveStampDuty;
        Long l15 = this.okcardFee;
        PaymentFeeDetailBean paymentFeeDetailBean = this.payeeFeeDetail;
        PaymentFeeDetailBean paymentFeeDetailBean2 = this.platFormFeeDetail;
        FeeTips feeTips = this.feeTips;
        PaymentFeeDetailBean paymentFeeDetailBean3 = this.feeDetail;
        CashierTaxDetailBean cashierTaxDetailBean = this.taxInfo;
        StringBuilder sb2 = new StringBuilder("CalcPaymentFeeInfoBean(feeTraiffId=");
        sb2.append(num);
        sb2.append(", payeeFeeTraiffId=");
        sb2.append(num2);
        sb2.append(", platformFeeTraiffId=");
        sb2.append(num3);
        sb2.append(", fee=");
        sb2.append(l5);
        sb2.append(", vat=");
        q0.w(sb2, l6, ", payeeFee=", l8, ", payeeVat=");
        q0.w(sb2, l10, ", platformFee=", l11, ", platformVat=");
        q0.w(sb2, l12, ", payStampDuty=", l13, ", receiveStampDuty=");
        q0.w(sb2, l14, ", okcardFee=", l15, ", payeeFeeDetail=");
        sb2.append(paymentFeeDetailBean);
        sb2.append(", platFormFeeDetail=");
        sb2.append(paymentFeeDetailBean2);
        sb2.append(", feeTips=");
        sb2.append(feeTips);
        sb2.append(", feeDetail=");
        sb2.append(paymentFeeDetailBean3);
        sb2.append(", taxInfo=");
        sb2.append(cashierTaxDetailBean);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.feeTraiffId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            q0.s(dest, 1, num);
        }
        Integer num2 = this.payeeFeeTraiffId;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            q0.s(dest, 1, num2);
        }
        Integer num3 = this.platformFeeTraiffId;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            q0.s(dest, 1, num3);
        }
        Long l5 = this.fee;
        if (l5 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l5);
        }
        Long l6 = this.vat;
        if (l6 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l6);
        }
        Long l8 = this.payeeFee;
        if (l8 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l8);
        }
        Long l10 = this.payeeVat;
        if (l10 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l10);
        }
        Long l11 = this.platformFee;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l11);
        }
        Long l12 = this.platformVat;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l12);
        }
        Long l13 = this.payStampDuty;
        if (l13 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l13);
        }
        Long l14 = this.receiveStampDuty;
        if (l14 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l14);
        }
        Long l15 = this.okcardFee;
        if (l15 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l15);
        }
        PaymentFeeDetailBean paymentFeeDetailBean = this.payeeFeeDetail;
        if (paymentFeeDetailBean == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            paymentFeeDetailBean.writeToParcel(dest, flags);
        }
        PaymentFeeDetailBean paymentFeeDetailBean2 = this.platFormFeeDetail;
        if (paymentFeeDetailBean2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            paymentFeeDetailBean2.writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.feeTips, flags);
        PaymentFeeDetailBean paymentFeeDetailBean3 = this.feeDetail;
        if (paymentFeeDetailBean3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            paymentFeeDetailBean3.writeToParcel(dest, flags);
        }
        CashierTaxDetailBean cashierTaxDetailBean = this.taxInfo;
        if (cashierTaxDetailBean == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cashierTaxDetailBean.writeToParcel(dest, flags);
        }
    }

    public CalcPaymentFeeInfoBean(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Long l5, @Nullable Long l6, @Nullable Long l8, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @Nullable Long l14, @Nullable Long l15, @Nullable PaymentFeeDetailBean paymentFeeDetailBean, @Nullable PaymentFeeDetailBean paymentFeeDetailBean2, @Nullable FeeTips feeTips, @Nullable PaymentFeeDetailBean paymentFeeDetailBean3, @Nullable CashierTaxDetailBean cashierTaxDetailBean) {
        this.feeTraiffId = num;
        this.payeeFeeTraiffId = num2;
        this.platformFeeTraiffId = num3;
        this.fee = l5;
        this.vat = l6;
        this.payeeFee = l8;
        this.payeeVat = l10;
        this.platformFee = l11;
        this.platformVat = l12;
        this.payStampDuty = l13;
        this.receiveStampDuty = l14;
        this.okcardFee = l15;
        this.payeeFeeDetail = paymentFeeDetailBean;
        this.platFormFeeDetail = paymentFeeDetailBean2;
        this.feeTips = feeTips;
        this.feeDetail = paymentFeeDetailBean3;
        this.taxInfo = cashierTaxDetailBean;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CalcPaymentFeeInfoBean(Integer num, Integer num2, Integer num3, Long l5, Long l6, Long l8, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15, PaymentFeeDetailBean paymentFeeDetailBean, PaymentFeeDetailBean paymentFeeDetailBean2, FeeTips feeTips, PaymentFeeDetailBean paymentFeeDetailBean3, CashierTaxDetailBean cashierTaxDetailBean, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num4 = 0;
        this((i7 & 1) != 0 ? num4 : num, (i7 & 2) != 0 ? num4 : num2, (i7 & 4) == 0 ? num3 : 0, (i7 & 8) != 0 ? 0L : l5, (i7 & 16) != 0 ? 0L : l6, (i7 & 32) != 0 ? 0L : l8, (i7 & 64) != 0 ? 0L : l10, (i7 & 128) != 0 ? 0L : l11, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? 0L : l12, (i7 & 512) != 0 ? 0L : l13, (i7 & 1024) != 0 ? 0L : l14, (i7 & 2048) != 0 ? 0L : l15, (i7 & 4096) != 0 ? null : paymentFeeDetailBean, (i7 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? null : paymentFeeDetailBean2, (i7 & 16384) != 0 ? null : feeTips, (i7 & 32768) != 0 ? null : paymentFeeDetailBean3, (i7 & 65536) != 0 ? null : cashierTaxDetailBean);
    }
}
