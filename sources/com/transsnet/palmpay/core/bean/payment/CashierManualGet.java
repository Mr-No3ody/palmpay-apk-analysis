package com.transsnet.palmpay.core.bean.payment;

import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.F;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\fJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001aHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006'"}, d2 = {"Lcom/transsnet/palmpay/core/bean/payment/CashierManualGet;", "Landroid/os/Parcelable;", "title", "", "tips", "list", "", "Lcom/transsnet/palmpay/core/bean/payment/CashierManualGetRewardItem;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getTips", "setTips", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "writeToParcel", "", "flags", "", "describeContents", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "CREATOR", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CashierManualGet implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private List<CashierManualGetRewardItem> list;

    @Nullable
    private String tips;

    @Nullable
    private String title;

    /* JADX INFO: renamed from: com.transsnet.palmpay.core.bean.payment.CashierManualGet$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/core/bean/payment/CashierManualGet$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/core/bean/payment/CashierManualGet;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/core/bean/payment/CashierManualGet;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<CashierManualGet> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CashierManualGet createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CashierManualGet(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CashierManualGet[] newArray(int size) {
            return new CashierManualGet[size];
        }
    }

    public CashierManualGet() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CashierManualGet copy$default(CashierManualGet cashierManualGet, String str, String str2, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = cashierManualGet.title;
        }
        if ((i7 & 2) != 0) {
            str2 = cashierManualGet.tips;
        }
        if ((i7 & 4) != 0) {
            list = cashierManualGet.list;
        }
        return cashierManualGet.copy(str, str2, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTips() {
        return this.tips;
    }

    @Nullable
    public final List<CashierManualGetRewardItem> component3() {
        return this.list;
    }

    @NotNull
    public final CashierManualGet copy(@Nullable String title, @Nullable String tips, @Nullable List<CashierManualGetRewardItem> list) {
        return new CashierManualGet(title, tips, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashierManualGet)) {
            return false;
        }
        CashierManualGet cashierManualGet = (CashierManualGet) other;
        return Intrinsics.c(this.title, cashierManualGet.title) && Intrinsics.c(this.tips, cashierManualGet.tips) && Intrinsics.c(this.list, cashierManualGet.list);
    }

    @Nullable
    public final List<CashierManualGetRewardItem> getList() {
        return this.list;
    }

    @Nullable
    public final String getTips() {
        return this.tips;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tips;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<CashierManualGetRewardItem> list = this.list;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final void setList(@Nullable List<CashierManualGetRewardItem> list) {
        this.list = list;
    }

    public final void setTips(@Nullable String str) {
        this.tips = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.tips;
        return q0.o(F.f("CashierManualGet(title=", str, ", tips=", str2, ", list="), this.list, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.title);
        parcel.writeString(this.tips);
        parcel.writeTypedList(this.list);
    }

    public CashierManualGet(@Nullable String str, @Nullable String str2, @Nullable List<CashierManualGetRewardItem> list) {
        this.title = str;
        this.tips = str2;
        this.list = list;
    }

    public /* synthetic */ CashierManualGet(String str, String str2, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CashierManualGet(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.createTypedArrayList(CashierManualGetRewardItem.INSTANCE));
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
