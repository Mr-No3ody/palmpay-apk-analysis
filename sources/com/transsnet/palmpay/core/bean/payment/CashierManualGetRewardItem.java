package com.transsnet.palmpay.core.bean.payment;

import C0.G;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.F;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bJ\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0019HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000f¨\u0006'"}, d2 = {"Lcom/transsnet/palmpay/core/bean/payment/CashierManualGetRewardItem;", "Landroid/os/Parcelable;", "name", "", "tagUrl", "value", "GetType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getTagUrl", "setTagUrl", "getValue", "setValue", "getGetType", "setGetType", "writeToParcel", "", "flags", "", "describeContents", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "CREATOR", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CashierManualGetRewardItem implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private String GetType;

    @Nullable
    private String name;

    @Nullable
    private String tagUrl;

    @Nullable
    private String value;

    /* JADX INFO: renamed from: com.transsnet.palmpay.core.bean.payment.CashierManualGetRewardItem$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/core/bean/payment/CashierManualGetRewardItem$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/core/bean/payment/CashierManualGetRewardItem;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/core/bean/payment/CashierManualGetRewardItem;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<CashierManualGetRewardItem> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CashierManualGetRewardItem createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CashierManualGetRewardItem(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CashierManualGetRewardItem[] newArray(int size) {
            return new CashierManualGetRewardItem[size];
        }
    }

    public CashierManualGetRewardItem() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ CashierManualGetRewardItem copy$default(CashierManualGetRewardItem cashierManualGetRewardItem, String str, String str2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = cashierManualGetRewardItem.name;
        }
        if ((i7 & 2) != 0) {
            str2 = cashierManualGetRewardItem.tagUrl;
        }
        if ((i7 & 4) != 0) {
            str3 = cashierManualGetRewardItem.value;
        }
        if ((i7 & 8) != 0) {
            str4 = cashierManualGetRewardItem.GetType;
        }
        return cashierManualGetRewardItem.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTagUrl() {
        return this.tagUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGetType() {
        return this.GetType;
    }

    @NotNull
    public final CashierManualGetRewardItem copy(@Nullable String name, @Nullable String tagUrl, @Nullable String value, @Nullable String GetType) {
        return new CashierManualGetRewardItem(name, tagUrl, value, GetType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashierManualGetRewardItem)) {
            return false;
        }
        CashierManualGetRewardItem cashierManualGetRewardItem = (CashierManualGetRewardItem) other;
        return Intrinsics.c(this.name, cashierManualGetRewardItem.name) && Intrinsics.c(this.tagUrl, cashierManualGetRewardItem.tagUrl) && Intrinsics.c(this.value, cashierManualGetRewardItem.value) && Intrinsics.c(this.GetType, cashierManualGetRewardItem.GetType);
    }

    @Nullable
    public final String getGetType() {
        return this.GetType;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getTagUrl() {
        return this.tagUrl;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tagUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.value;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.GetType;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setGetType(@Nullable String str) {
        this.GetType = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setTagUrl(@Nullable String str) {
        this.tagUrl = str;
    }

    public final void setValue(@Nullable String str) {
        this.value = str;
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.tagUrl;
        return G.s(F.f("CashierManualGetRewardItem(name=", str, ", tagUrl=", str2, ", value="), this.value, ", GetType=", this.GetType, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.name);
        parcel.writeString(this.tagUrl);
        parcel.writeString(this.value);
        parcel.writeString(this.GetType);
    }

    public CashierManualGetRewardItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.name = str;
        this.tagUrl = str2;
        this.value = str3;
        this.GetType = str4;
    }

    public /* synthetic */ CashierManualGetRewardItem(String str, String str2, String str3, String str4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CashierManualGetRewardItem(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
