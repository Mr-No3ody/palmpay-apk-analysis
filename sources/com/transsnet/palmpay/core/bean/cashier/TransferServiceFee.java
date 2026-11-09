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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 ;2\u00020\u0001:\u0001;B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\f\u0010\u0010J\u0018\u0010'\u001a\u00020(2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020*H\u0016J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016Jb\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u00020*HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001e\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018¨\u0006<"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/TransferServiceFee;", "Landroid/os/Parcelable;", "nextBillDate", "", "transferAmount", "", "transferBorrowDays", "transferRatio", "", "transferMinServiceFee", "transferServiceFee", "minAmount", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getNextBillDate", "()Ljava/lang/String;", "setNextBillDate", "(Ljava/lang/String;)V", "getTransferAmount", "()Ljava/lang/Long;", "setTransferAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getTransferBorrowDays", "setTransferBorrowDays", "getTransferRatio", "()Ljava/lang/Double;", "setTransferRatio", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getTransferMinServiceFee", "setTransferMinServiceFee", "getTransferServiceFee", "setTransferServiceFee", "getMinAmount", "setMinAmount", "writeToParcel", "", "flags", "", "describeContents", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/transsnet/palmpay/core/bean/cashier/TransferServiceFee;", "equals", "", "other", "", "hashCode", "toString", "CREATOR", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TransferServiceFee implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

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

    /* JADX INFO: renamed from: com.transsnet.palmpay.core.bean.cashier.TransferServiceFee$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/TransferServiceFee$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/core/bean/cashier/TransferServiceFee;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/core/bean/cashier/TransferServiceFee;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<TransferServiceFee> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public TransferServiceFee createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferServiceFee(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public TransferServiceFee[] newArray(int size) {
            return new TransferServiceFee[size];
        }
    }

    public TransferServiceFee() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ TransferServiceFee copy$default(TransferServiceFee transferServiceFee, String str, Long l5, Long l6, Double d2, Long l8, Long l10, Long l11, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = transferServiceFee.nextBillDate;
        }
        if ((i7 & 2) != 0) {
            l5 = transferServiceFee.transferAmount;
        }
        if ((i7 & 4) != 0) {
            l6 = transferServiceFee.transferBorrowDays;
        }
        if ((i7 & 8) != 0) {
            d2 = transferServiceFee.transferRatio;
        }
        if ((i7 & 16) != 0) {
            l8 = transferServiceFee.transferMinServiceFee;
        }
        if ((i7 & 32) != 0) {
            l10 = transferServiceFee.transferServiceFee;
        }
        if ((i7 & 64) != 0) {
            l11 = transferServiceFee.minAmount;
        }
        Long l12 = l10;
        Long l13 = l11;
        Long l14 = l8;
        Long l15 = l6;
        return transferServiceFee.copy(str, l5, l15, d2, l14, l12, l13);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNextBillDate() {
        return this.nextBillDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getTransferAmount() {
        return this.transferAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getTransferBorrowDays() {
        return this.transferBorrowDays;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getTransferRatio() {
        return this.transferRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getTransferMinServiceFee() {
        return this.transferMinServiceFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getTransferServiceFee() {
        return this.transferServiceFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getMinAmount() {
        return this.minAmount;
    }

    @NotNull
    public final TransferServiceFee copy(@Nullable String nextBillDate, @Nullable Long transferAmount, @Nullable Long transferBorrowDays, @Nullable Double transferRatio, @Nullable Long transferMinServiceFee, @Nullable Long transferServiceFee, @Nullable Long minAmount) {
        return new TransferServiceFee(nextBillDate, transferAmount, transferBorrowDays, transferRatio, transferMinServiceFee, transferServiceFee, minAmount);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferServiceFee)) {
            return false;
        }
        TransferServiceFee transferServiceFee = (TransferServiceFee) other;
        return Intrinsics.c(this.nextBillDate, transferServiceFee.nextBillDate) && Intrinsics.c(this.transferAmount, transferServiceFee.transferAmount) && Intrinsics.c(this.transferBorrowDays, transferServiceFee.transferBorrowDays) && Intrinsics.c(this.transferRatio, transferServiceFee.transferRatio) && Intrinsics.c(this.transferMinServiceFee, transferServiceFee.transferMinServiceFee) && Intrinsics.c(this.transferServiceFee, transferServiceFee.transferServiceFee) && Intrinsics.c(this.minAmount, transferServiceFee.minAmount);
    }

    @Nullable
    public final Long getMinAmount() {
        return this.minAmount;
    }

    @Nullable
    public final String getNextBillDate() {
        return this.nextBillDate;
    }

    @Nullable
    public final Long getTransferAmount() {
        return this.transferAmount;
    }

    @Nullable
    public final Long getTransferBorrowDays() {
        return this.transferBorrowDays;
    }

    @Nullable
    public final Long getTransferMinServiceFee() {
        return this.transferMinServiceFee;
    }

    @Nullable
    public final Double getTransferRatio() {
        return this.transferRatio;
    }

    @Nullable
    public final Long getTransferServiceFee() {
        return this.transferServiceFee;
    }

    public int hashCode() {
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

    public final void setMinAmount(@Nullable Long l5) {
        this.minAmount = l5;
    }

    public final void setNextBillDate(@Nullable String str) {
        this.nextBillDate = str;
    }

    public final void setTransferAmount(@Nullable Long l5) {
        this.transferAmount = l5;
    }

    public final void setTransferBorrowDays(@Nullable Long l5) {
        this.transferBorrowDays = l5;
    }

    public final void setTransferMinServiceFee(@Nullable Long l5) {
        this.transferMinServiceFee = l5;
    }

    public final void setTransferRatio(@Nullable Double d2) {
        this.transferRatio = d2;
    }

    public final void setTransferServiceFee(@Nullable Long l5) {
        this.transferServiceFee = l5;
    }

    @NotNull
    public String toString() {
        String str = this.nextBillDate;
        Long l5 = this.transferAmount;
        Long l6 = this.transferBorrowDays;
        Double d2 = this.transferRatio;
        Long l8 = this.transferMinServiceFee;
        Long l10 = this.transferServiceFee;
        Long l11 = this.minAmount;
        StringBuilder sb2 = new StringBuilder("TransferServiceFee(nextBillDate=");
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
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.nextBillDate);
        parcel.writeValue(this.transferAmount);
        parcel.writeValue(this.transferBorrowDays);
        parcel.writeValue(this.transferRatio);
        parcel.writeValue(this.transferMinServiceFee);
        parcel.writeValue(this.transferServiceFee);
        parcel.writeValue(this.minAmount);
    }

    public TransferServiceFee(@Nullable String str, @Nullable Long l5, @Nullable Long l6, @Nullable Double d2, @Nullable Long l8, @Nullable Long l10, @Nullable Long l11) {
        this.nextBillDate = str;
        this.transferAmount = l5;
        this.transferBorrowDays = l6;
        this.transferRatio = d2;
        this.transferMinServiceFee = l8;
        this.transferServiceFee = l10;
        this.minAmount = l11;
    }

    public /* synthetic */ TransferServiceFee(String str, Long l5, Long l6, Double d2, Long l8, Long l10, Long l11, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? 0L : l5, (i7 & 4) != 0 ? 0L : l6, (i7 & 8) != 0 ? Double.valueOf(0.0d) : d2, (i7 & 16) != 0 ? 0L : l8, (i7 & 32) != 0 ? 0L : l10, (i7 & 64) != 0 ? 0L : l11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TransferServiceFee(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        Class cls = Long.TYPE;
        Object value = parcel.readValue(cls.getClassLoader());
        Long l5 = value instanceof Long ? (Long) value : null;
        Object value2 = parcel.readValue(cls.getClassLoader());
        Long l6 = value2 instanceof Long ? (Long) value2 : null;
        Object value3 = parcel.readValue(Double.TYPE.getClassLoader());
        Double d2 = value3 instanceof Double ? (Double) value3 : null;
        Object value4 = parcel.readValue(cls.getClassLoader());
        Long l8 = value4 instanceof Long ? (Long) value4 : null;
        Object value5 = parcel.readValue(cls.getClassLoader());
        Long l10 = value5 instanceof Long ? (Long) value5 : null;
        Object value6 = parcel.readValue(cls.getClassLoader());
        this(string, l5, l6, d2, l8, l10, value6 instanceof Long ? (Long) value6 : null);
    }
}
