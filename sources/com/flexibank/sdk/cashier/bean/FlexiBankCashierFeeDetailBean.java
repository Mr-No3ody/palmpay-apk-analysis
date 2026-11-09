package com.flexibank.sdk.cashier.bean;

import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Parcelize
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R$\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R$\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/flexibank/sdk/cashier/bean/FlexiBankCashierFeeDetailBean;", "Landroid/os/Parcelable;", "", "fee", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "setFee", "(Ljava/lang/Long;)V", "vat", "h", "setVat", "", "remark", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "setRemark", "(Ljava/lang/String;)V", "subTypeId", "e", "setSubTypeId", "subTypeName", "f", "setSubTypeName", "tariffName", "getTariffName", "setTariffName", "Lcom/flexibank/sdk/cashier/bean/FlexiBankTransferServiceFee;", "transferServiceFee", "Lcom/flexibank/sdk/cashier/bean/FlexiBankTransferServiceFee;", "g", "()Lcom/flexibank/sdk/cashier/bean/FlexiBankTransferServiceFee;", "setTransferServiceFee", "(Lcom/flexibank/sdk/cashier/bean/FlexiBankTransferServiceFee;)V", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FlexiBankCashierFeeDetailBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FlexiBankCashierFeeDetailBean> CREATOR = new a();

    @Nullable
    private Long fee;

    @Nullable
    private String remark;

    @Nullable
    private String subTypeId;

    @Nullable
    private String subTypeName;

    @Nullable
    private String tariffName;

    @Nullable
    private FlexiBankTransferServiceFee transferServiceFee;

    @Nullable
    private Long vat;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FlexiBankCashierFeeDetailBean> {
        @Override // android.os.Parcelable.Creator
        public final FlexiBankCashierFeeDetailBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FlexiBankCashierFeeDetailBean(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? FlexiBankTransferServiceFee.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final FlexiBankCashierFeeDetailBean[] newArray(int i7) {
            return new FlexiBankCashierFeeDetailBean[i7];
        }
    }

    public FlexiBankCashierFeeDetailBean(Long l5, Long l6, String str, String str2, String str3, String str4, FlexiBankTransferServiceFee flexiBankTransferServiceFee) {
        this.fee = l5;
        this.vat = l6;
        this.remark = str;
        this.subTypeId = str2;
        this.subTypeName = str3;
        this.tariffName = str4;
        this.transferServiceFee = flexiBankTransferServiceFee;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSubTypeId() {
        return this.subTypeId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlexiBankCashierFeeDetailBean)) {
            return false;
        }
        FlexiBankCashierFeeDetailBean flexiBankCashierFeeDetailBean = (FlexiBankCashierFeeDetailBean) obj;
        return Intrinsics.c(this.fee, flexiBankCashierFeeDetailBean.fee) && Intrinsics.c(this.vat, flexiBankCashierFeeDetailBean.vat) && Intrinsics.c(this.remark, flexiBankCashierFeeDetailBean.remark) && Intrinsics.c(this.subTypeId, flexiBankCashierFeeDetailBean.subTypeId) && Intrinsics.c(this.subTypeName, flexiBankCashierFeeDetailBean.subTypeName) && Intrinsics.c(this.tariffName, flexiBankCashierFeeDetailBean.tariffName) && Intrinsics.c(this.transferServiceFee, flexiBankCashierFeeDetailBean.transferServiceFee);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSubTypeName() {
        return this.subTypeName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final FlexiBankTransferServiceFee getTransferServiceFee() {
        return this.transferServiceFee;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Long getVat() {
        return this.vat;
    }

    public final int hashCode() {
        Long l5 = this.fee;
        int iHashCode = (l5 == null ? 0 : l5.hashCode()) * 31;
        Long l6 = this.vat;
        int iHashCode2 = (iHashCode + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str = this.remark;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subTypeId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subTypeName;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tariffName;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        FlexiBankTransferServiceFee flexiBankTransferServiceFee = this.transferServiceFee;
        return iHashCode6 + (flexiBankTransferServiceFee != null ? flexiBankTransferServiceFee.hashCode() : 0);
    }

    public final String toString() {
        Long l5 = this.fee;
        Long l6 = this.vat;
        String str = this.remark;
        String str2 = this.subTypeId;
        String str3 = this.subTypeName;
        String str4 = this.tariffName;
        FlexiBankTransferServiceFee flexiBankTransferServiceFee = this.transferServiceFee;
        StringBuilder sb2 = new StringBuilder("FlexiBankCashierFeeDetailBean(fee=");
        sb2.append(l5);
        sb2.append(", vat=");
        sb2.append(l6);
        sb2.append(", remark=");
        u.x(sb2, str, ", subTypeId=", str2, ", subTypeName=");
        u.x(sb2, str3, ", tariffName=", str4, ", transferServiceFee=");
        sb2.append(flexiBankTransferServiceFee);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
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
        dest.writeString(this.remark);
        dest.writeString(this.subTypeId);
        dest.writeString(this.subTypeName);
        dest.writeString(this.tariffName);
        FlexiBankTransferServiceFee flexiBankTransferServiceFee = this.transferServiceFee;
        if (flexiBankTransferServiceFee == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            flexiBankTransferServiceFee.writeToParcel(dest, i7);
        }
    }

    public FlexiBankCashierFeeDetailBean() {
        this(0L, 0L, null, null, null, null, null);
    }
}
