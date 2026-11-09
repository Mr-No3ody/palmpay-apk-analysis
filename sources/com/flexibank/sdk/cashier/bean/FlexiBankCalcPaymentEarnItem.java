package com.flexibank.sdk.cashier.bean;

import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.F;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Parcelize
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/flexibank/sdk/cashier/bean/FlexiBankCalcPaymentEarnItem;", "Landroid/os/Parcelable;", "", "earnType", "Ljava/lang/String;", "getEarnType", "()Ljava/lang/String;", "showName", "c", "", "earnAmount", "Ljava/lang/Integer;", "getEarnAmount", "()Ljava/lang/Integer;", "showValue", "d", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FlexiBankCalcPaymentEarnItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FlexiBankCalcPaymentEarnItem> CREATOR = new a();

    @Nullable
    private final Integer earnAmount;

    @Nullable
    private final String earnType;

    @Nullable
    private final String showName;

    @Nullable
    private final String showValue;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FlexiBankCalcPaymentEarnItem> {
        @Override // android.os.Parcelable.Creator
        public final FlexiBankCalcPaymentEarnItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FlexiBankCalcPaymentEarnItem(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FlexiBankCalcPaymentEarnItem[] newArray(int i7) {
            return new FlexiBankCalcPaymentEarnItem[i7];
        }
    }

    public FlexiBankCalcPaymentEarnItem(String str, String str2, Integer num, String str3) {
        this.earnType = str;
        this.showName = str2;
        this.earnAmount = num;
        this.showValue = str3;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getShowName() {
        return this.showName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getShowValue() {
        return this.showValue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlexiBankCalcPaymentEarnItem)) {
            return false;
        }
        FlexiBankCalcPaymentEarnItem flexiBankCalcPaymentEarnItem = (FlexiBankCalcPaymentEarnItem) obj;
        return Intrinsics.c(this.earnType, flexiBankCalcPaymentEarnItem.earnType) && Intrinsics.c(this.showName, flexiBankCalcPaymentEarnItem.showName) && Intrinsics.c(this.earnAmount, flexiBankCalcPaymentEarnItem.earnAmount) && Intrinsics.c(this.showValue, flexiBankCalcPaymentEarnItem.showValue);
    }

    public final int hashCode() {
        String str = this.earnType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.showName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.earnAmount;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.showValue;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.earnType;
        String str2 = this.showName;
        Integer num = this.earnAmount;
        String str3 = this.showValue;
        StringBuilder sbF = F.f("FlexiBankCalcPaymentEarnItem(earnType=", str, ", showName=", str2, ", earnAmount=");
        sbF.append(num);
        sbF.append(", showValue=");
        sbF.append(str3);
        sbF.append(")");
        return sbF.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.earnType);
        dest.writeString(this.showName);
        Integer num = this.earnAmount;
        if (num == null) {
            dest.writeInt(0);
        } else {
            q0.s(dest, 1, num);
        }
        dest.writeString(this.showValue);
    }

    public FlexiBankCalcPaymentEarnItem() {
        this(null, null, 0, null);
    }
}
