package com.transsnet.palmpay.managemoney.bean;

import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u0000 -2\u00020\u0001:\u0001-B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\bH\u0016J\b\u0010 \u001a\u00020\bH\u0016J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J:\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010*J\t\u0010+\u001a\u00020\bHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006."}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/AdvanceSummary;", "Landroid/os/Parcelable;", "advanceNo", "", "totalRepayableAmount", "", "dueDate", "repayStatus", "", "<init>", "(Ljava/lang/String;Ljava/lang/Long;JI)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getAdvanceNo", "()Ljava/lang/String;", "getTotalRepayableAmount", "()Ljava/lang/Long;", "setTotalRepayableAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getDueDate", "()J", "setDueDate", "(J)V", "getRepayStatus", "()I", "setRepayStatus", "(I)V", "writeToParcel", "", "flags", "describeContents", "equals", "", "other", "", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Long;JI)Lcom/transsnet/palmpay/managemoney/bean/AdvanceSummary;", "hashCode", "toString", "CREATOR", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AdvanceSummary implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String advanceNo;
    private long dueDate;
    private int repayStatus;

    @Nullable
    private Long totalRepayableAmount;

    /* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.bean.AdvanceSummary$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/AdvanceSummary$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/managemoney/bean/AdvanceSummary;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/managemoney/bean/AdvanceSummary;", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<AdvanceSummary> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public AdvanceSummary createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdvanceSummary(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public AdvanceSummary[] newArray(int size) {
            return new AdvanceSummary[size];
        }
    }

    public AdvanceSummary(@Nullable String str, @Nullable Long l5, long j6, int i7) {
        this.advanceNo = str;
        this.totalRepayableAmount = l5;
        this.dueDate = j6;
        this.repayStatus = i7;
    }

    public static /* synthetic */ AdvanceSummary copy$default(AdvanceSummary advanceSummary, String str, Long l5, long j6, int i7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = advanceSummary.advanceNo;
        }
        if ((i10 & 2) != 0) {
            l5 = advanceSummary.totalRepayableAmount;
        }
        if ((i10 & 4) != 0) {
            j6 = advanceSummary.dueDate;
        }
        if ((i10 & 8) != 0) {
            i7 = advanceSummary.repayStatus;
        }
        int i11 = i7;
        return advanceSummary.copy(str, l5, j6, i11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAdvanceNo() {
        return this.advanceNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getTotalRepayableAmount() {
        return this.totalRepayableAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getDueDate() {
        return this.dueDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getRepayStatus() {
        return this.repayStatus;
    }

    @NotNull
    public final AdvanceSummary copy(@Nullable String advanceNo, @Nullable Long totalRepayableAmount, long dueDate, int repayStatus) {
        return new AdvanceSummary(advanceNo, totalRepayableAmount, dueDate, repayStatus);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!AdvanceSummary.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.f(other, "null cannot be cast to non-null type com.transsnet.palmpay.managemoney.bean.AdvanceSummary");
        return true;
    }

    @Nullable
    public final String getAdvanceNo() {
        return this.advanceNo;
    }

    public final long getDueDate() {
        return this.dueDate;
    }

    public final int getRepayStatus() {
        return this.repayStatus;
    }

    @Nullable
    public final Long getTotalRepayableAmount() {
        return this.totalRepayableAmount;
    }

    public int hashCode() {
        String str = this.advanceNo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l5 = this.totalRepayableAmount;
        return Integer.hashCode(this.repayStatus) + q0.b((iHashCode + (l5 != null ? l5.hashCode() : 0)) * 31, 31, this.dueDate);
    }

    public final void setDueDate(long j6) {
        this.dueDate = j6;
    }

    public final void setRepayStatus(int i7) {
        this.repayStatus = i7;
    }

    public final void setTotalRepayableAmount(@Nullable Long l5) {
        this.totalRepayableAmount = l5;
    }

    @NotNull
    public String toString() {
        return "AdvanceSummary(advanceNo=" + this.advanceNo + ", totalRepayableAmount=" + this.totalRepayableAmount + ", dueDate=" + this.dueDate + ", repayStatus=" + this.repayStatus + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.advanceNo);
        parcel.writeValue(this.totalRepayableAmount);
        parcel.writeLong(this.dueDate);
        parcel.writeInt(this.repayStatus);
    }

    public /* synthetic */ AdvanceSummary(String str, Long l5, long j6, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l5, (i10 & 4) != 0 ? 0L : j6, (i10 & 8) != 0 ? 0 : i7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AdvanceSummary(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        Object value = parcel.readValue(Long.TYPE.getClassLoader());
        this(string, value instanceof Long ? (Long) value : null, parcel.readLong(), parcel.readInt());
    }
}
