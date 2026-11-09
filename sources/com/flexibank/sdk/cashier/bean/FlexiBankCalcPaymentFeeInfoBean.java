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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u000fR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001b\u0010\u000fR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u000fR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u001f\u0010\u000fR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010%\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0019\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R$\u0010,\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010$\"\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/flexibank/sdk/cashier/bean/FlexiBankCalcPaymentFeeInfoBean;", "Landroid/os/Parcelable;", "", "feeTraiffId", "Ljava/lang/Integer;", "getFeeTraiffId", "()Ljava/lang/Integer;", "payeeFeeTraiffId", "getPayeeFeeTraiffId", "platformFeeTraiffId", "getPlatformFeeTraiffId", "", "fee", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "vat", "h", "payeeFee", "getPayeeFee", "payeeVat", "getPayeeVat", "platformFee", "f", "platformVat", "g", "payStampDuty", "getPayStampDuty", "receiveStampDuty", "getReceiveStampDuty", "okcardFee", "getOkcardFee", "Lcom/flexibank/sdk/cashier/bean/FlexiBankPaymentFeeDetailBean;", "payeeFeeDetail", "Lcom/flexibank/sdk/cashier/bean/FlexiBankPaymentFeeDetailBean;", "getPayeeFeeDetail", "()Lcom/flexibank/sdk/cashier/bean/FlexiBankPaymentFeeDetailBean;", "platFormFeeDetail", "getPlatFormFeeDetail", "Lcom/flexibank/sdk/cashier/bean/FlexiBankFeeTips;", "feeTips", "Lcom/flexibank/sdk/cashier/bean/FlexiBankFeeTips;", "e", "()Lcom/flexibank/sdk/cashier/bean/FlexiBankFeeTips;", "feeDetail", "d", "setFeeDetail", "(Lcom/flexibank/sdk/cashier/bean/FlexiBankPaymentFeeDetailBean;)V", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FlexiBankCalcPaymentFeeInfoBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FlexiBankCalcPaymentFeeInfoBean> CREATOR = new a();

    @Nullable
    private final Long fee;

    @Nullable
    private FlexiBankPaymentFeeDetailBean feeDetail;

    @Nullable
    private final FlexiBankFeeTips feeTips;

    @Nullable
    private final Integer feeTraiffId;

    @Nullable
    private final Long okcardFee;

    @Nullable
    private final Long payStampDuty;

    @Nullable
    private final Long payeeFee;

    @Nullable
    private final FlexiBankPaymentFeeDetailBean payeeFeeDetail;

    @Nullable
    private final Integer payeeFeeTraiffId;

    @Nullable
    private final Long payeeVat;

    @Nullable
    private final FlexiBankPaymentFeeDetailBean platFormFeeDetail;

    @Nullable
    private final Long platformFee;

    @Nullable
    private final Integer platformFeeTraiffId;

    @Nullable
    private final Long platformVat;

    @Nullable
    private final Long receiveStampDuty;

    @Nullable
    private final Long vat;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FlexiBankCalcPaymentFeeInfoBean> {
        @Override // android.os.Parcelable.Creator
        public final FlexiBankCalcPaymentFeeInfoBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FlexiBankCalcPaymentFeeInfoBean(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : FlexiBankPaymentFeeDetailBean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FlexiBankPaymentFeeDetailBean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FlexiBankFeeTips.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FlexiBankPaymentFeeDetailBean.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final FlexiBankCalcPaymentFeeInfoBean[] newArray(int i7) {
            return new FlexiBankCalcPaymentFeeInfoBean[i7];
        }
    }

    public FlexiBankCalcPaymentFeeInfoBean(Integer num, Integer num2, Integer num3, Long l5, Long l6, Long l8, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15, FlexiBankPaymentFeeDetailBean flexiBankPaymentFeeDetailBean, FlexiBankPaymentFeeDetailBean flexiBankPaymentFeeDetailBean2, FlexiBankFeeTips flexiBankFeeTips, FlexiBankPaymentFeeDetailBean flexiBankPaymentFeeDetailBean3) {
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
        this.payeeFeeDetail = flexiBankPaymentFeeDetailBean;
        this.platFormFeeDetail = flexiBankPaymentFeeDetailBean2;
        this.feeTips = flexiBankFeeTips;
        this.feeDetail = flexiBankPaymentFeeDetailBean3;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final FlexiBankPaymentFeeDetailBean getFeeDetail() {
        return this.feeDetail;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final FlexiBankFeeTips getFeeTips() {
        return this.feeTips;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlexiBankCalcPaymentFeeInfoBean)) {
            return false;
        }
        FlexiBankCalcPaymentFeeInfoBean flexiBankCalcPaymentFeeInfoBean = (FlexiBankCalcPaymentFeeInfoBean) obj;
        return Intrinsics.c(this.feeTraiffId, flexiBankCalcPaymentFeeInfoBean.feeTraiffId) && Intrinsics.c(this.payeeFeeTraiffId, flexiBankCalcPaymentFeeInfoBean.payeeFeeTraiffId) && Intrinsics.c(this.platformFeeTraiffId, flexiBankCalcPaymentFeeInfoBean.platformFeeTraiffId) && Intrinsics.c(this.fee, flexiBankCalcPaymentFeeInfoBean.fee) && Intrinsics.c(this.vat, flexiBankCalcPaymentFeeInfoBean.vat) && Intrinsics.c(this.payeeFee, flexiBankCalcPaymentFeeInfoBean.payeeFee) && Intrinsics.c(this.payeeVat, flexiBankCalcPaymentFeeInfoBean.payeeVat) && Intrinsics.c(this.platformFee, flexiBankCalcPaymentFeeInfoBean.platformFee) && Intrinsics.c(this.platformVat, flexiBankCalcPaymentFeeInfoBean.platformVat) && Intrinsics.c(this.payStampDuty, flexiBankCalcPaymentFeeInfoBean.payStampDuty) && Intrinsics.c(this.receiveStampDuty, flexiBankCalcPaymentFeeInfoBean.receiveStampDuty) && Intrinsics.c(this.okcardFee, flexiBankCalcPaymentFeeInfoBean.okcardFee) && Intrinsics.c(this.payeeFeeDetail, flexiBankCalcPaymentFeeInfoBean.payeeFeeDetail) && Intrinsics.c(this.platFormFeeDetail, flexiBankCalcPaymentFeeInfoBean.platFormFeeDetail) && Intrinsics.c(this.feeTips, flexiBankCalcPaymentFeeInfoBean.feeTips) && Intrinsics.c(this.feeDetail, flexiBankCalcPaymentFeeInfoBean.feeDetail);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getPlatformFee() {
        return this.platformFee;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getPlatformVat() {
        return this.platformVat;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Long getVat() {
        return this.vat;
    }

    public final int hashCode() {
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
        FlexiBankPaymentFeeDetailBean flexiBankPaymentFeeDetailBean = this.payeeFeeDetail;
        int iHashCode13 = (iHashCode12 + (flexiBankPaymentFeeDetailBean == null ? 0 : flexiBankPaymentFeeDetailBean.hashCode())) * 31;
        FlexiBankPaymentFeeDetailBean flexiBankPaymentFeeDetailBean2 = this.platFormFeeDetail;
        int iHashCode14 = (iHashCode13 + (flexiBankPaymentFeeDetailBean2 == null ? 0 : flexiBankPaymentFeeDetailBean2.hashCode())) * 31;
        FlexiBankFeeTips flexiBankFeeTips = this.feeTips;
        int iHashCode15 = (iHashCode14 + (flexiBankFeeTips == null ? 0 : flexiBankFeeTips.hashCode())) * 31;
        FlexiBankPaymentFeeDetailBean flexiBankPaymentFeeDetailBean3 = this.feeDetail;
        return iHashCode15 + (flexiBankPaymentFeeDetailBean3 != null ? flexiBankPaymentFeeDetailBean3.hashCode() : 0);
    }

    public final String toString() {
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
        FlexiBankPaymentFeeDetailBean flexiBankPaymentFeeDetailBean = this.payeeFeeDetail;
        FlexiBankPaymentFeeDetailBean flexiBankPaymentFeeDetailBean2 = this.platFormFeeDetail;
        FlexiBankFeeTips flexiBankFeeTips = this.feeTips;
        FlexiBankPaymentFeeDetailBean flexiBankPaymentFeeDetailBean3 = this.feeDetail;
        StringBuilder sb2 = new StringBuilder("FlexiBankCalcPaymentFeeInfoBean(feeTraiffId=");
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
        sb2.append(flexiBankPaymentFeeDetailBean);
        sb2.append(", platFormFeeDetail=");
        sb2.append(flexiBankPaymentFeeDetailBean2);
        sb2.append(", feeTips=");
        sb2.append(flexiBankFeeTips);
        sb2.append(", feeDetail=");
        sb2.append(flexiBankPaymentFeeDetailBean3);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
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
        FlexiBankPaymentFeeDetailBean flexiBankPaymentFeeDetailBean = this.payeeFeeDetail;
        if (flexiBankPaymentFeeDetailBean == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            flexiBankPaymentFeeDetailBean.writeToParcel(dest, i7);
        }
        FlexiBankPaymentFeeDetailBean flexiBankPaymentFeeDetailBean2 = this.platFormFeeDetail;
        if (flexiBankPaymentFeeDetailBean2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            flexiBankPaymentFeeDetailBean2.writeToParcel(dest, i7);
        }
        FlexiBankFeeTips flexiBankFeeTips = this.feeTips;
        if (flexiBankFeeTips == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            flexiBankFeeTips.writeToParcel(dest, i7);
        }
        FlexiBankPaymentFeeDetailBean flexiBankPaymentFeeDetailBean3 = this.feeDetail;
        if (flexiBankPaymentFeeDetailBean3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            flexiBankPaymentFeeDetailBean3.writeToParcel(dest, i7);
        }
    }

    public FlexiBankCalcPaymentFeeInfoBean() {
        this(0, 0, 0, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, null, null, null);
    }
}
