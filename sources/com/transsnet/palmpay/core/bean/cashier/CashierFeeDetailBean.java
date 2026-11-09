package com.transsnet.palmpay.core.bean.cashier;

import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Parcelize
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003Jb\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010+J\u0006\u0010,\u001a\u00020-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020-HÖ\u0001J\t\u00103\u001a\u00020\u0006HÖ\u0001J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020-R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00069"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/CashierFeeDetailBean;", "Landroid/os/Parcelable;", "fee", "", "vat", "remark", "", "subTypeId", "subTypeName", "tariffName", "transferServiceFee", "Lcom/transsnet/palmpay/core/bean/cashier/TransferServiceFee;", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/transsnet/palmpay/core/bean/cashier/TransferServiceFee;)V", "getFee", "()Ljava/lang/Long;", "setFee", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getVat", "setVat", "getRemark", "()Ljava/lang/String;", "setRemark", "(Ljava/lang/String;)V", "getSubTypeId", "setSubTypeId", "getSubTypeName", "setSubTypeName", "getTariffName", "setTariffName", "getTransferServiceFee", "()Lcom/transsnet/palmpay/core/bean/cashier/TransferServiceFee;", "setTransferServiceFee", "(Lcom/transsnet/palmpay/core/bean/cashier/TransferServiceFee;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/transsnet/palmpay/core/bean/cashier/TransferServiceFee;)Lcom/transsnet/palmpay/core/bean/cashier/CashierFeeDetailBean;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CashierFeeDetailBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CashierFeeDetailBean> CREATOR = new Creator();

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
    private TransferServiceFee transferServiceFee;

    @Nullable
    private Long vat;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CashierFeeDetailBean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CashierFeeDetailBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CashierFeeDetailBean(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (TransferServiceFee) parcel.readParcelable(CashierFeeDetailBean.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CashierFeeDetailBean[] newArray(int i7) {
            return new CashierFeeDetailBean[i7];
        }
    }

    public CashierFeeDetailBean() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ CashierFeeDetailBean copy$default(CashierFeeDetailBean cashierFeeDetailBean, Long l5, Long l6, String str, String str2, String str3, String str4, TransferServiceFee transferServiceFee, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            l5 = cashierFeeDetailBean.fee;
        }
        if ((i7 & 2) != 0) {
            l6 = cashierFeeDetailBean.vat;
        }
        if ((i7 & 4) != 0) {
            str = cashierFeeDetailBean.remark;
        }
        if ((i7 & 8) != 0) {
            str2 = cashierFeeDetailBean.subTypeId;
        }
        if ((i7 & 16) != 0) {
            str3 = cashierFeeDetailBean.subTypeName;
        }
        if ((i7 & 32) != 0) {
            str4 = cashierFeeDetailBean.tariffName;
        }
        if ((i7 & 64) != 0) {
            transferServiceFee = cashierFeeDetailBean.transferServiceFee;
        }
        String str5 = str4;
        TransferServiceFee transferServiceFee2 = transferServiceFee;
        String str6 = str3;
        String str7 = str;
        return cashierFeeDetailBean.copy(l5, l6, str7, str2, str6, str5, transferServiceFee2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getFee() {
        return this.fee;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getVat() {
        return this.vat;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubTypeId() {
        return this.subTypeId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSubTypeName() {
        return this.subTypeName;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTariffName() {
        return this.tariffName;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final TransferServiceFee getTransferServiceFee() {
        return this.transferServiceFee;
    }

    @NotNull
    public final CashierFeeDetailBean copy(@Nullable Long fee, @Nullable Long vat, @Nullable String remark, @Nullable String subTypeId, @Nullable String subTypeName, @Nullable String tariffName, @Nullable TransferServiceFee transferServiceFee) {
        return new CashierFeeDetailBean(fee, vat, remark, subTypeId, subTypeName, tariffName, transferServiceFee);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashierFeeDetailBean)) {
            return false;
        }
        CashierFeeDetailBean cashierFeeDetailBean = (CashierFeeDetailBean) other;
        return Intrinsics.c(this.fee, cashierFeeDetailBean.fee) && Intrinsics.c(this.vat, cashierFeeDetailBean.vat) && Intrinsics.c(this.remark, cashierFeeDetailBean.remark) && Intrinsics.c(this.subTypeId, cashierFeeDetailBean.subTypeId) && Intrinsics.c(this.subTypeName, cashierFeeDetailBean.subTypeName) && Intrinsics.c(this.tariffName, cashierFeeDetailBean.tariffName) && Intrinsics.c(this.transferServiceFee, cashierFeeDetailBean.transferServiceFee);
    }

    @Nullable
    public final Long getFee() {
        return this.fee;
    }

    @Nullable
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    public final String getSubTypeId() {
        return this.subTypeId;
    }

    @Nullable
    public final String getSubTypeName() {
        return this.subTypeName;
    }

    @Nullable
    public final String getTariffName() {
        return this.tariffName;
    }

    @Nullable
    public final TransferServiceFee getTransferServiceFee() {
        return this.transferServiceFee;
    }

    @Nullable
    public final Long getVat() {
        return this.vat;
    }

    public int hashCode() {
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
        TransferServiceFee transferServiceFee = this.transferServiceFee;
        return iHashCode6 + (transferServiceFee != null ? transferServiceFee.hashCode() : 0);
    }

    public final void setFee(@Nullable Long l5) {
        this.fee = l5;
    }

    public final void setRemark(@Nullable String str) {
        this.remark = str;
    }

    public final void setSubTypeId(@Nullable String str) {
        this.subTypeId = str;
    }

    public final void setSubTypeName(@Nullable String str) {
        this.subTypeName = str;
    }

    public final void setTariffName(@Nullable String str) {
        this.tariffName = str;
    }

    public final void setTransferServiceFee(@Nullable TransferServiceFee transferServiceFee) {
        this.transferServiceFee = transferServiceFee;
    }

    public final void setVat(@Nullable Long l5) {
        this.vat = l5;
    }

    @NotNull
    public String toString() {
        Long l5 = this.fee;
        Long l6 = this.vat;
        String str = this.remark;
        String str2 = this.subTypeId;
        String str3 = this.subTypeName;
        String str4 = this.tariffName;
        TransferServiceFee transferServiceFee = this.transferServiceFee;
        StringBuilder sb2 = new StringBuilder("CashierFeeDetailBean(fee=");
        sb2.append(l5);
        sb2.append(", vat=");
        sb2.append(l6);
        sb2.append(", remark=");
        u.x(sb2, str, ", subTypeId=", str2, ", subTypeName=");
        u.x(sb2, str3, ", tariffName=", str4, ", transferServiceFee=");
        sb2.append(transferServiceFee);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
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
        dest.writeParcelable(this.transferServiceFee, flags);
    }

    public CashierFeeDetailBean(@Nullable Long l5, @Nullable Long l6, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable TransferServiceFee transferServiceFee) {
        this.fee = l5;
        this.vat = l6;
        this.remark = str;
        this.subTypeId = str2;
        this.subTypeName = str3;
        this.tariffName = str4;
        this.transferServiceFee = transferServiceFee;
    }

    public /* synthetic */ CashierFeeDetailBean(Long l5, Long l6, String str, String str2, String str3, String str4, TransferServiceFee transferServiceFee, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0L : l5, (i7 & 2) != 0 ? 0L : l6, (i7 & 4) != 0 ? null : str, (i7 & 8) != 0 ? null : str2, (i7 & 16) != 0 ? null : str3, (i7 & 32) != 0 ? null : str4, (i7 & 64) != 0 ? null : transferServiceFee);
    }
}
