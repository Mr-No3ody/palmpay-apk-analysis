package com.flexibank.sdk.cashier.bean;

import C0.G;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/flexibank/sdk/cashier/bean/FlexiBankFeeTips;", "Landroid/os/Parcelable;", "", "tipsText", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "setTipsText", "(Ljava/lang/String;)V", "tipsTitle", "getTipsTitle", "setTipsTitle", "confirmPaymentTips", "getConfirmPaymentTips", "setConfirmPaymentTips", "showConfirmPaymentTipsFlag", "getShowConfirmPaymentTipsFlag", "setShowConfirmPaymentTipsFlag", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FlexiBankFeeTips implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FlexiBankFeeTips> CREATOR = new a();

    @Nullable
    private String confirmPaymentTips;

    @Nullable
    private String showConfirmPaymentTipsFlag;

    @Nullable
    private String tipsText;

    @Nullable
    private String tipsTitle;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FlexiBankFeeTips> {
        @Override // android.os.Parcelable.Creator
        public final FlexiBankFeeTips createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FlexiBankFeeTips(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FlexiBankFeeTips[] newArray(int i7) {
            return new FlexiBankFeeTips[i7];
        }
    }

    public FlexiBankFeeTips() {
        this(null, null, null, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTipsText() {
        return this.tipsText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlexiBankFeeTips)) {
            return false;
        }
        FlexiBankFeeTips flexiBankFeeTips = (FlexiBankFeeTips) obj;
        return Intrinsics.c(this.tipsText, flexiBankFeeTips.tipsText) && Intrinsics.c(this.tipsTitle, flexiBankFeeTips.tipsTitle) && Intrinsics.c(this.confirmPaymentTips, flexiBankFeeTips.confirmPaymentTips) && Intrinsics.c(this.showConfirmPaymentTipsFlag, flexiBankFeeTips.showConfirmPaymentTipsFlag);
    }

    public final int hashCode() {
        String str = this.tipsText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tipsTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.confirmPaymentTips;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.showConfirmPaymentTipsFlag;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.tipsText;
        String str2 = this.tipsTitle;
        return G.s(F.f("FlexiBankFeeTips(tipsText=", str, ", tipsTitle=", str2, ", confirmPaymentTips="), this.confirmPaymentTips, ", showConfirmPaymentTipsFlag=", this.showConfirmPaymentTipsFlag, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.tipsText);
        dest.writeString(this.tipsTitle);
        dest.writeString(this.confirmPaymentTips);
        dest.writeString(this.showConfirmPaymentTipsFlag);
    }

    public FlexiBankFeeTips(String str, String str2, String str3, String str4) {
        this.tipsText = str;
        this.tipsTitle = str2;
        this.confirmPaymentTips = str3;
        this.showConfirmPaymentTipsFlag = str4;
    }
}
