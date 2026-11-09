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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000fR$\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000fR$\u0010 \u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010\u000f¨\u0006#"}, d2 = {"Lcom/flexibank/sdk/cashier/bean/FlexiBankTransferServiceFee;", "Landroid/os/Parcelable;", "", "nextBillDate", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "setNextBillDate", "(Ljava/lang/String;)V", "", "transferAmount", "Ljava/lang/Long;", "e", "()Ljava/lang/Long;", "setTransferAmount", "(Ljava/lang/Long;)V", "transferBorrowDays", "f", "setTransferBorrowDays", "", "transferRatio", "Ljava/lang/Double;", "g", "()Ljava/lang/Double;", "setTransferRatio", "(Ljava/lang/Double;)V", "transferMinServiceFee", "getTransferMinServiceFee", "setTransferMinServiceFee", "transferServiceFee", "getTransferServiceFee", "setTransferServiceFee", "minAmount", "c", "setMinAmount", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FlexiBankTransferServiceFee implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FlexiBankTransferServiceFee> CREATOR = new a();

    @Nullable
    private Long minAmount;

    @Nullable
    private String nextBillDate;

    @Nullable
    private Long transferAmount;

    @Nullable
    private Long transferBorrowDays;

    @Nullable
    private Long transferMinServiceFee;

    @Nullable
    private Double transferRatio;

    @Nullable
    private Long transferServiceFee;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FlexiBankTransferServiceFee> {
        @Override // android.os.Parcelable.Creator
        public final FlexiBankTransferServiceFee createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FlexiBankTransferServiceFee(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final FlexiBankTransferServiceFee[] newArray(int i7) {
            return new FlexiBankTransferServiceFee[i7];
        }
    }

    public FlexiBankTransferServiceFee(String str, Long l5, Long l6, Double d2, Long l8, Long l10, Long l11) {
        this.nextBillDate = str;
        this.transferAmount = l5;
        this.transferBorrowDays = l6;
        this.transferRatio = d2;
        this.transferMinServiceFee = l8;
        this.transferServiceFee = l10;
        this.minAmount = l11;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getMinAmount() {
        return this.minAmount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getNextBillDate() {
        return this.nextBillDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getTransferAmount() {
        return this.transferAmount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlexiBankTransferServiceFee)) {
            return false;
        }
        FlexiBankTransferServiceFee flexiBankTransferServiceFee = (FlexiBankTransferServiceFee) obj;
        return Intrinsics.c(this.nextBillDate, flexiBankTransferServiceFee.nextBillDate) && Intrinsics.c(this.transferAmount, flexiBankTransferServiceFee.transferAmount) && Intrinsics.c(this.transferBorrowDays, flexiBankTransferServiceFee.transferBorrowDays) && Intrinsics.c(this.transferRatio, flexiBankTransferServiceFee.transferRatio) && Intrinsics.c(this.transferMinServiceFee, flexiBankTransferServiceFee.transferMinServiceFee) && Intrinsics.c(this.transferServiceFee, flexiBankTransferServiceFee.transferServiceFee) && Intrinsics.c(this.minAmount, flexiBankTransferServiceFee.minAmount);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getTransferBorrowDays() {
        return this.transferBorrowDays;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getTransferRatio() {
        return this.transferRatio;
    }

    public final int hashCode() {
        String str = this.nextBillDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l5 = this.transferAmount;
        int iHashCode2 = (iHashCode + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.transferBorrowDays;
        int iHashCode3 = (iHashCode2 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Double d2 = this.transferRatio;
        int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Long l8 = this.transferMinServiceFee;
        int iHashCode5 = (iHashCode4 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Long l10 = this.transferServiceFee;
        int iHashCode6 = (iHashCode5 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.minAmount;
        return iHashCode6 + (l11 != null ? l11.hashCode() : 0);
    }

    public final String toString() {
        String str = this.nextBillDate;
        Long l5 = this.transferAmount;
        Long l6 = this.transferBorrowDays;
        Double d2 = this.transferRatio;
        Long l8 = this.transferMinServiceFee;
        Long l10 = this.transferServiceFee;
        Long l11 = this.minAmount;
        StringBuilder sb2 = new StringBuilder("FlexiBankTransferServiceFee(nextBillDate=");
        sb2.append(str);
        sb2.append(", transferAmount=");
        sb2.append(l5);
        sb2.append(", transferBorrowDays=");
        sb2.append(l6);
        sb2.append(", transferRatio=");
        sb2.append(d2);
        sb2.append(", transferMinServiceFee=");
        q0.w(sb2, l8, ", transferServiceFee=", l10, ", minAmount=");
        sb2.append(l11);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.nextBillDate);
        Long l5 = this.transferAmount;
        if (l5 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l5);
        }
        Long l6 = this.transferBorrowDays;
        if (l6 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l6);
        }
        Double d2 = this.transferRatio;
        if (d2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d2.doubleValue());
        }
        Long l8 = this.transferMinServiceFee;
        if (l8 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l8);
        }
        Long l10 = this.transferServiceFee;
        if (l10 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l10);
        }
        Long l11 = this.minAmount;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l11);
        }
    }

    public FlexiBankTransferServiceFee() {
        this(null, 0L, 0L, Double.valueOf(0.0d), 0L, 0L, 0L);
    }
}
