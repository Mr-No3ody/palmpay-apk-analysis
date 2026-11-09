package com.transsnet.palmpay.airtime.bean;

import C0.G;
import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Parcelize
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003JV\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010)J\u0006\u0010*\u001a\u00020+J\u0013\u0010,\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020+HÖ\u0001J\t\u00100\u001a\u00020\u0004HÖ\u0001J\u0016\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020+R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011¨\u00066"}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/AirtimeItemsBean;", "Landroid/os/Parcelable;", "Lcom/transsnet/palmpay/airtime/bean/BaseAirtimeItemsBean;", "itemId", "", FirebaseAnalytics.Param.PRICE, "", "productName", "suspend", "", "rewardsRateText", "rewardsText", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getItemId", "()Ljava/lang/String;", "setItemId", "(Ljava/lang/String;)V", "getPrice", "()Ljava/lang/Long;", "setPrice", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getProductName", "setProductName", "getSuspend", "()Ljava/lang/Boolean;", "setSuspend", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getRewardsRateText", "setRewardsRateText", "getRewardsText", "setRewardsText", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/transsnet/palmpay/airtime/bean/AirtimeItemsBean;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AirtimeItemsBean extends BaseAirtimeItemsBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AirtimeItemsBean> CREATOR = new Creator();

    @Nullable
    private String itemId;

    @Nullable
    private Long price;

    @Nullable
    private String productName;

    @Nullable
    private String rewardsRateText;

    @Nullable
    private String rewardsText;

    @Nullable
    private Boolean suspend;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AirtimeItemsBean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AirtimeItemsBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Boolean boolValueOf = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AirtimeItemsBean(string, lValueOf, string2, boolValueOf, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AirtimeItemsBean[] newArray(int i7) {
            return new AirtimeItemsBean[i7];
        }
    }

    public AirtimeItemsBean() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ AirtimeItemsBean copy$default(AirtimeItemsBean airtimeItemsBean, String str, Long l5, String str2, Boolean bool, String str3, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = airtimeItemsBean.itemId;
        }
        if ((i7 & 2) != 0) {
            l5 = airtimeItemsBean.price;
        }
        if ((i7 & 4) != 0) {
            str2 = airtimeItemsBean.productName;
        }
        if ((i7 & 8) != 0) {
            bool = airtimeItemsBean.suspend;
        }
        if ((i7 & 16) != 0) {
            str3 = airtimeItemsBean.rewardsRateText;
        }
        if ((i7 & 32) != 0) {
            str4 = airtimeItemsBean.rewardsText;
        }
        String str5 = str3;
        String str6 = str4;
        return airtimeItemsBean.copy(str, l5, str2, bool, str5, str6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getSuspend() {
        return this.suspend;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRewardsRateText() {
        return this.rewardsRateText;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRewardsText() {
        return this.rewardsText;
    }

    @NotNull
    public final AirtimeItemsBean copy(@Nullable String itemId, @Nullable Long price, @Nullable String productName, @Nullable Boolean suspend, @Nullable String rewardsRateText, @Nullable String rewardsText) {
        return new AirtimeItemsBean(itemId, price, productName, suspend, rewardsRateText, rewardsText);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AirtimeItemsBean)) {
            return false;
        }
        AirtimeItemsBean airtimeItemsBean = (AirtimeItemsBean) other;
        return Intrinsics.c(this.itemId, airtimeItemsBean.itemId) && Intrinsics.c(this.price, airtimeItemsBean.price) && Intrinsics.c(this.productName, airtimeItemsBean.productName) && Intrinsics.c(this.suspend, airtimeItemsBean.suspend) && Intrinsics.c(this.rewardsRateText, airtimeItemsBean.rewardsRateText) && Intrinsics.c(this.rewardsText, airtimeItemsBean.rewardsText);
    }

    @Nullable
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    public final Long getPrice() {
        return this.price;
    }

    @Nullable
    public final String getProductName() {
        return this.productName;
    }

    @Nullable
    public final String getRewardsRateText() {
        return this.rewardsRateText;
    }

    @Nullable
    public final String getRewardsText() {
        return this.rewardsText;
    }

    @Nullable
    public final Boolean getSuspend() {
        return this.suspend;
    }

    public int hashCode() {
        String str = this.itemId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l5 = this.price;
        int iHashCode2 = (iHashCode + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str2 = this.productName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.suspend;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.rewardsRateText;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rewardsText;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setItemId(@Nullable String str) {
        this.itemId = str;
    }

    public final void setPrice(@Nullable Long l5) {
        this.price = l5;
    }

    public final void setProductName(@Nullable String str) {
        this.productName = str;
    }

    public final void setRewardsRateText(@Nullable String str) {
        this.rewardsRateText = str;
    }

    public final void setRewardsText(@Nullable String str) {
        this.rewardsText = str;
    }

    public final void setSuspend(@Nullable Boolean bool) {
        this.suspend = bool;
    }

    @NotNull
    public String toString() {
        String str = this.itemId;
        Long l5 = this.price;
        String str2 = this.productName;
        Boolean bool = this.suspend;
        String str3 = this.rewardsRateText;
        String str4 = this.rewardsText;
        StringBuilder sb2 = new StringBuilder("AirtimeItemsBean(itemId=");
        sb2.append(str);
        sb2.append(", price=");
        sb2.append(l5);
        sb2.append(", productName=");
        sb2.append(str2);
        sb2.append(", suspend=");
        sb2.append(bool);
        sb2.append(", rewardsRateText=");
        return G.s(sb2, str3, ", rewardsText=", str4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.itemId);
        Long l5 = this.price;
        if (l5 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l5);
        }
        dest.writeString(this.productName);
        Boolean bool = this.suspend;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            q0.r(dest, 1, bool);
        }
        dest.writeString(this.rewardsRateText);
        dest.writeString(this.rewardsText);
    }

    public /* synthetic */ AirtimeItemsBean(String str, Long l5, String str2, Boolean bool, String str3, String str4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? 0L : l5, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? Boolean.FALSE : bool, (i7 & 16) != 0 ? null : str3, (i7 & 32) != 0 ? null : str4);
    }

    public AirtimeItemsBean(@Nullable String str, @Nullable Long l5, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3, @Nullable String str4) {
        this.itemId = str;
        this.price = l5;
        this.productName = str2;
        this.suspend = bool;
        this.rewardsRateText = str3;
        this.rewardsText = str4;
    }
}
