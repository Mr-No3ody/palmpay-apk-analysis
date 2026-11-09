package com.transsnet.palmpay.main.export.bean.rsp;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0011HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/SavingStat;", "Landroid/os/Parcelable;", "totalSavingBalance", "", "maturedEarning", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getTotalSavingBalance", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMaturedEarning", "writeToParcel", "", "flags", "", "describeContents", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/Long;)Lcom/transsnet/palmpay/main/export/bean/rsp/SavingStat;", "equals", "", "other", "", "hashCode", "toString", "", "CREATOR", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SavingStat implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Long maturedEarning;

    @Nullable
    private final Long totalSavingBalance;

    /* JADX INFO: renamed from: com.transsnet.palmpay.main.export.bean.rsp.SavingStat$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/SavingStat$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/main/export/bean/rsp/SavingStat;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/main/export/bean/rsp/SavingStat;", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<SavingStat> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SavingStat createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SavingStat(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SavingStat[] newArray(int size) {
            return new SavingStat[size];
        }
    }

    public SavingStat(@Nullable Long l5, @Nullable Long l6) {
        this.totalSavingBalance = l5;
        this.maturedEarning = l6;
    }

    public static /* synthetic */ SavingStat copy$default(SavingStat savingStat, Long l5, Long l6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            l5 = savingStat.totalSavingBalance;
        }
        if ((i7 & 2) != 0) {
            l6 = savingStat.maturedEarning;
        }
        return savingStat.copy(l5, l6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getTotalSavingBalance() {
        return this.totalSavingBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getMaturedEarning() {
        return this.maturedEarning;
    }

    @NotNull
    public final SavingStat copy(@Nullable Long totalSavingBalance, @Nullable Long maturedEarning) {
        return new SavingStat(totalSavingBalance, maturedEarning);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavingStat)) {
            return false;
        }
        SavingStat savingStat = (SavingStat) other;
        return Intrinsics.c(this.totalSavingBalance, savingStat.totalSavingBalance) && Intrinsics.c(this.maturedEarning, savingStat.maturedEarning);
    }

    @Nullable
    public final Long getMaturedEarning() {
        return this.maturedEarning;
    }

    @Nullable
    public final Long getTotalSavingBalance() {
        return this.totalSavingBalance;
    }

    public int hashCode() {
        Long l5 = this.totalSavingBalance;
        int iHashCode = (l5 == null ? 0 : l5.hashCode()) * 31;
        Long l6 = this.maturedEarning;
        return iHashCode + (l6 != null ? l6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SavingStat(totalSavingBalance=" + this.totalSavingBalance + ", maturedEarning=" + this.maturedEarning + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeValue(this.totalSavingBalance);
        parcel.writeValue(this.maturedEarning);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SavingStat(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Class cls = Long.TYPE;
        Object value = parcel.readValue(cls.getClassLoader());
        Long l5 = value instanceof Long ? (Long) value : null;
        Object value2 = parcel.readValue(cls.getClassLoader());
        this(l5, value2 instanceof Long ? (Long) value2 : null);
    }
}
