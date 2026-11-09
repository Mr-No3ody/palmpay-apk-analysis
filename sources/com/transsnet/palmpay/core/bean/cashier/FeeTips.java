package com.transsnet.palmpay.core.bean.cashier;

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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bJ\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0019HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000f¨\u0006'"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/FeeTips;", "Landroid/os/Parcelable;", "tipsText", "", "tipsTitle", "confirmPaymentTips", "showConfirmPaymentTipsFlag", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getTipsText", "()Ljava/lang/String;", "setTipsText", "(Ljava/lang/String;)V", "getTipsTitle", "setTipsTitle", "getConfirmPaymentTips", "setConfirmPaymentTips", "getShowConfirmPaymentTipsFlag", "setShowConfirmPaymentTipsFlag", "writeToParcel", "", "flags", "", "describeContents", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "CREATOR", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FeeTips implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private String confirmPaymentTips;

    @Nullable
    private String showConfirmPaymentTipsFlag;

    @Nullable
    private String tipsText;

    @Nullable
    private String tipsTitle;

    /* JADX INFO: renamed from: com.transsnet.palmpay.core.bean.cashier.FeeTips$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/FeeTips$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/core/bean/cashier/FeeTips;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/core/bean/cashier/FeeTips;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<FeeTips> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public FeeTips createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FeeTips(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public FeeTips[] newArray(int size) {
            return new FeeTips[size];
        }
    }

    public FeeTips() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ FeeTips copy$default(FeeTips feeTips, String str, String str2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = feeTips.tipsText;
        }
        if ((i7 & 2) != 0) {
            str2 = feeTips.tipsTitle;
        }
        if ((i7 & 4) != 0) {
            str3 = feeTips.confirmPaymentTips;
        }
        if ((i7 & 8) != 0) {
            str4 = feeTips.showConfirmPaymentTipsFlag;
        }
        return feeTips.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTipsText() {
        return this.tipsText;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTipsTitle() {
        return this.tipsTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getConfirmPaymentTips() {
        return this.confirmPaymentTips;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getShowConfirmPaymentTipsFlag() {
        return this.showConfirmPaymentTipsFlag;
    }

    @NotNull
    public final FeeTips copy(@Nullable String tipsText, @Nullable String tipsTitle, @Nullable String confirmPaymentTips, @Nullable String showConfirmPaymentTipsFlag) {
        return new FeeTips(tipsText, tipsTitle, confirmPaymentTips, showConfirmPaymentTipsFlag);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeeTips)) {
            return false;
        }
        FeeTips feeTips = (FeeTips) other;
        return Intrinsics.c(this.tipsText, feeTips.tipsText) && Intrinsics.c(this.tipsTitle, feeTips.tipsTitle) && Intrinsics.c(this.confirmPaymentTips, feeTips.confirmPaymentTips) && Intrinsics.c(this.showConfirmPaymentTipsFlag, feeTips.showConfirmPaymentTipsFlag);
    }

    @Nullable
    public final String getConfirmPaymentTips() {
        return this.confirmPaymentTips;
    }

    @Nullable
    public final String getShowConfirmPaymentTipsFlag() {
        return this.showConfirmPaymentTipsFlag;
    }

    @Nullable
    public final String getTipsText() {
        return this.tipsText;
    }

    @Nullable
    public final String getTipsTitle() {
        return this.tipsTitle;
    }

    public int hashCode() {
        String str = this.tipsText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tipsTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.confirmPaymentTips;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.showConfirmPaymentTipsFlag;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setConfirmPaymentTips(@Nullable String str) {
        this.confirmPaymentTips = str;
    }

    public final void setShowConfirmPaymentTipsFlag(@Nullable String str) {
        this.showConfirmPaymentTipsFlag = str;
    }

    public final void setTipsText(@Nullable String str) {
        this.tipsText = str;
    }

    public final void setTipsTitle(@Nullable String str) {
        this.tipsTitle = str;
    }

    @NotNull
    public String toString() {
        String str = this.tipsText;
        String str2 = this.tipsTitle;
        return G.s(F.f("FeeTips(tipsText=", str, ", tipsTitle=", str2, ", confirmPaymentTips="), this.confirmPaymentTips, ", showConfirmPaymentTipsFlag=", this.showConfirmPaymentTipsFlag, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.tipsText);
        parcel.writeString(this.tipsTitle);
        parcel.writeString(this.confirmPaymentTips);
        parcel.writeString(this.showConfirmPaymentTipsFlag);
    }

    public FeeTips(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.tipsText = str;
        this.tipsTitle = str2;
        this.confirmPaymentTips = str3;
        this.showConfirmPaymentTipsFlag = str4;
    }

    public /* synthetic */ FeeTips(String str, String str2, String str3, String str4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeeTips(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
