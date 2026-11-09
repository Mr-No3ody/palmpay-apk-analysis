package com.transsnet.palmpay.core.bean.cashier;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.F;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\fJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006%"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/CalcPaymentEarnItem;", "Landroid/os/Parcelable;", "earnType", "", "showName", "earnAmount", "", "showValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getEarnType", "()Ljava/lang/String;", "getShowName", "getEarnAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShowValue", "writeToParcel", "", "flags", "describeContents", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/transsnet/palmpay/core/bean/cashier/CalcPaymentEarnItem;", "equals", "", "other", "", "hashCode", "toString", "CREATOR", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CalcPaymentEarnItem implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer earnAmount;

    @Nullable
    private final String earnType;

    @Nullable
    private final String showName;

    @Nullable
    private final String showValue;

    /* JADX INFO: renamed from: com.transsnet.palmpay.core.bean.cashier.CalcPaymentEarnItem$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/CalcPaymentEarnItem$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/core/bean/cashier/CalcPaymentEarnItem;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/core/bean/cashier/CalcPaymentEarnItem;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<CalcPaymentEarnItem> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CalcPaymentEarnItem createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CalcPaymentEarnItem(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CalcPaymentEarnItem[] newArray(int size) {
            return new CalcPaymentEarnItem[size];
        }
    }

    public CalcPaymentEarnItem() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ CalcPaymentEarnItem copy$default(CalcPaymentEarnItem calcPaymentEarnItem, String str, String str2, Integer num, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = calcPaymentEarnItem.earnType;
        }
        if ((i7 & 2) != 0) {
            str2 = calcPaymentEarnItem.showName;
        }
        if ((i7 & 4) != 0) {
            num = calcPaymentEarnItem.earnAmount;
        }
        if ((i7 & 8) != 0) {
            str3 = calcPaymentEarnItem.showValue;
        }
        return calcPaymentEarnItem.copy(str, str2, num, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEarnType() {
        return this.earnType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getShowName() {
        return this.showName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getEarnAmount() {
        return this.earnAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getShowValue() {
        return this.showValue;
    }

    @NotNull
    public final CalcPaymentEarnItem copy(@Nullable String earnType, @Nullable String showName, @Nullable Integer earnAmount, @Nullable String showValue) {
        return new CalcPaymentEarnItem(earnType, showName, earnAmount, showValue);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalcPaymentEarnItem)) {
            return false;
        }
        CalcPaymentEarnItem calcPaymentEarnItem = (CalcPaymentEarnItem) other;
        return Intrinsics.c(this.earnType, calcPaymentEarnItem.earnType) && Intrinsics.c(this.showName, calcPaymentEarnItem.showName) && Intrinsics.c(this.earnAmount, calcPaymentEarnItem.earnAmount) && Intrinsics.c(this.showValue, calcPaymentEarnItem.showValue);
    }

    @Nullable
    public final Integer getEarnAmount() {
        return this.earnAmount;
    }

    @Nullable
    public final String getEarnType() {
        return this.earnType;
    }

    @Nullable
    public final String getShowName() {
        return this.showName;
    }

    @Nullable
    public final String getShowValue() {
        return this.showValue;
    }

    public int hashCode() {
        String str = this.earnType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.showName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.earnAmount;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.showValue;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.earnType;
        String str2 = this.showName;
        Integer num = this.earnAmount;
        String str3 = this.showValue;
        StringBuilder sbF = F.f("CalcPaymentEarnItem(earnType=", str, ", showName=", str2, ", earnAmount=");
        sbF.append(num);
        sbF.append(", showValue=");
        sbF.append(str3);
        sbF.append(")");
        return sbF.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.earnType);
        parcel.writeString(this.showName);
        parcel.writeValue(this.earnAmount);
        parcel.writeString(this.showValue);
    }

    public CalcPaymentEarnItem(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3) {
        this.earnType = str;
        this.showName = str2;
        this.earnAmount = num;
        this.showValue = str3;
    }

    public /* synthetic */ CalcPaymentEarnItem(String str, String str2, Integer num, String str3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? 0 : num, (i7 & 8) != 0 ? null : str3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CalcPaymentEarnItem(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        String string2 = parcel.readString();
        Object value = parcel.readValue(Integer.TYPE.getClassLoader());
        this(string, string2, value instanceof Integer ? (Integer) value : null, parcel.readString());
    }
}
