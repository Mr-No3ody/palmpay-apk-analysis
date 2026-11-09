package com.transsnet.palmpay.teller.bean;

import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Parcelize
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b?\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010B\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010C\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010D\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u00103J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u00103J¶\u0001\u0010K\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010LJ\u0006\u0010M\u001a\u00020\u0010J\u0013\u0010N\u001a\u00020\b2\b\u0010O\u001a\u0004\u0018\u00010PHÖ\u0003J\t\u0010Q\u001a\u00020\u0010HÖ\u0001J\t\u0010R\u001a\u00020\u0003HÖ\u0001J\u0016\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u001e\u0010\f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b,\u0010&\"\u0004\b-\u0010(R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0017\"\u0004\b/\u0010\u0019R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0017\"\u0004\b1\u0010\u0019R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0017\"\u0004\b8\u0010\u0019R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0017\"\u0004\b:\u0010\u0019R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\b;\u00103\"\u0004\b<\u00105¨\u0006X"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/AutoRenewalOrderBean;", "Landroid/os/Parcelable;", "volume", "", "volumeUnit", "validityUnit", "validity", "active", "", "amount", "", "businessAmount", "discountAmount", "itemId", "timeText", "timeValue", "", "title", "subTitle", "timeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getVolume", "()Ljava/lang/String;", "setVolume", "(Ljava/lang/String;)V", "getVolumeUnit", "setVolumeUnit", "getValidityUnit", "setValidityUnit", "getValidity", "setValidity", "getActive", "()Ljava/lang/Boolean;", "setActive", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getAmount", "()Ljava/lang/Long;", "setAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getBusinessAmount", "setBusinessAmount", "getDiscountAmount", "setDiscountAmount", "getItemId", "setItemId", "getTimeText", "setTimeText", "getTimeValue", "()Ljava/lang/Integer;", "setTimeValue", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTitle", "setTitle", "getSubTitle", "setSubTitle", "getTimeType", "setTimeType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/transsnet/palmpay/teller/bean/AutoRenewalOrderBean;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AutoRenewalOrderBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AutoRenewalOrderBean> CREATOR = new Creator();

    @Nullable
    private Boolean active;

    @Nullable
    private Long amount;

    @Nullable
    private Long businessAmount;

    @Nullable
    private Long discountAmount;

    @Nullable
    private String itemId;

    @Nullable
    private String subTitle;

    @Nullable
    private String timeText;

    @Nullable
    private Integer timeType;

    @Nullable
    private Integer timeValue;

    @Nullable
    private String title;

    @Nullable
    private String validity;

    @Nullable
    private String validityUnit;

    @Nullable
    private String volume;

    @Nullable
    private String volumeUnit;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutoRenewalOrderBean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoRenewalOrderBean createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AutoRenewalOrderBean(string, string2, string3, string4, boolValueOf, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoRenewalOrderBean[] newArray(int i7) {
            return new AutoRenewalOrderBean[i7];
        }
    }

    public AutoRenewalOrderBean() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVolume() {
        return this.volume;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTimeText() {
        return this.timeText;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getTimeValue() {
        return this.timeValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getTimeType() {
        return this.timeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVolumeUnit() {
        return this.volumeUnit;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getValidityUnit() {
        return this.validityUnit;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getValidity() {
        return this.validity;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getActive() {
        return this.active;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getBusinessAmount() {
        return this.businessAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getDiscountAmount() {
        return this.discountAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @NotNull
    public final AutoRenewalOrderBean copy(@Nullable String volume, @Nullable String volumeUnit, @Nullable String validityUnit, @Nullable String validity, @Nullable Boolean active, @Nullable Long amount, @Nullable Long businessAmount, @Nullable Long discountAmount, @Nullable String itemId, @Nullable String timeText, @Nullable Integer timeValue, @Nullable String title, @Nullable String subTitle, @Nullable Integer timeType) {
        return new AutoRenewalOrderBean(volume, volumeUnit, validityUnit, validity, active, amount, businessAmount, discountAmount, itemId, timeText, timeValue, title, subTitle, timeType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoRenewalOrderBean)) {
            return false;
        }
        AutoRenewalOrderBean autoRenewalOrderBean = (AutoRenewalOrderBean) other;
        return Intrinsics.c(this.volume, autoRenewalOrderBean.volume) && Intrinsics.c(this.volumeUnit, autoRenewalOrderBean.volumeUnit) && Intrinsics.c(this.validityUnit, autoRenewalOrderBean.validityUnit) && Intrinsics.c(this.validity, autoRenewalOrderBean.validity) && Intrinsics.c(this.active, autoRenewalOrderBean.active) && Intrinsics.c(this.amount, autoRenewalOrderBean.amount) && Intrinsics.c(this.businessAmount, autoRenewalOrderBean.businessAmount) && Intrinsics.c(this.discountAmount, autoRenewalOrderBean.discountAmount) && Intrinsics.c(this.itemId, autoRenewalOrderBean.itemId) && Intrinsics.c(this.timeText, autoRenewalOrderBean.timeText) && Intrinsics.c(this.timeValue, autoRenewalOrderBean.timeValue) && Intrinsics.c(this.title, autoRenewalOrderBean.title) && Intrinsics.c(this.subTitle, autoRenewalOrderBean.subTitle) && Intrinsics.c(this.timeType, autoRenewalOrderBean.timeType);
    }

    @Nullable
    public final Boolean getActive() {
        return this.active;
    }

    @Nullable
    public final Long getAmount() {
        return this.amount;
    }

    @Nullable
    public final Long getBusinessAmount() {
        return this.businessAmount;
    }

    @Nullable
    public final Long getDiscountAmount() {
        return this.discountAmount;
    }

    @Nullable
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    public final String getTimeText() {
        return this.timeText;
    }

    @Nullable
    public final Integer getTimeType() {
        return this.timeType;
    }

    @Nullable
    public final Integer getTimeValue() {
        return this.timeValue;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getValidity() {
        return this.validity;
    }

    @Nullable
    public final String getValidityUnit() {
        return this.validityUnit;
    }

    @Nullable
    public final String getVolume() {
        return this.volume;
    }

    @Nullable
    public final String getVolumeUnit() {
        return this.volumeUnit;
    }

    public int hashCode() {
        String str = this.volume;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.volumeUnit;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.validityUnit;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.validity;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.active;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l5 = this.amount;
        int iHashCode6 = (iHashCode5 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.businessAmount;
        int iHashCode7 = (iHashCode6 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l8 = this.discountAmount;
        int iHashCode8 = (iHashCode7 + (l8 == null ? 0 : l8.hashCode())) * 31;
        String str5 = this.itemId;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.timeText;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.timeValue;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.title;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.subTitle;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num2 = this.timeType;
        return iHashCode13 + (num2 != null ? num2.hashCode() : 0);
    }

    public final void setActive(@Nullable Boolean bool) {
        this.active = bool;
    }

    public final void setAmount(@Nullable Long l5) {
        this.amount = l5;
    }

    public final void setBusinessAmount(@Nullable Long l5) {
        this.businessAmount = l5;
    }

    public final void setDiscountAmount(@Nullable Long l5) {
        this.discountAmount = l5;
    }

    public final void setItemId(@Nullable String str) {
        this.itemId = str;
    }

    public final void setSubTitle(@Nullable String str) {
        this.subTitle = str;
    }

    public final void setTimeText(@Nullable String str) {
        this.timeText = str;
    }

    public final void setTimeType(@Nullable Integer num) {
        this.timeType = num;
    }

    public final void setTimeValue(@Nullable Integer num) {
        this.timeValue = num;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setValidity(@Nullable String str) {
        this.validity = str;
    }

    public final void setValidityUnit(@Nullable String str) {
        this.validityUnit = str;
    }

    public final void setVolume(@Nullable String str) {
        this.volume = str;
    }

    public final void setVolumeUnit(@Nullable String str) {
        this.volumeUnit = str;
    }

    @NotNull
    public String toString() {
        String str = this.volume;
        String str2 = this.volumeUnit;
        String str3 = this.validityUnit;
        String str4 = this.validity;
        Boolean bool = this.active;
        Long l5 = this.amount;
        Long l6 = this.businessAmount;
        Long l8 = this.discountAmount;
        String str5 = this.itemId;
        String str6 = this.timeText;
        Integer num = this.timeValue;
        String str7 = this.title;
        String str8 = this.subTitle;
        Integer num2 = this.timeType;
        StringBuilder sbF = F.f("AutoRenewalOrderBean(volume=", str, ", volumeUnit=", str2, ", validityUnit=");
        u.x(sbF, str3, ", validity=", str4, ", active=");
        sbF.append(bool);
        sbF.append(", amount=");
        sbF.append(l5);
        sbF.append(", businessAmount=");
        q0.w(sbF, l6, ", discountAmount=", l8, ", itemId=");
        u.x(sbF, str5, ", timeText=", str6, ", timeValue=");
        sbF.append(num);
        sbF.append(", title=");
        sbF.append(str7);
        sbF.append(", subTitle=");
        sbF.append(str8);
        sbF.append(", timeType=");
        sbF.append(num2);
        sbF.append(")");
        return sbF.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.volume);
        dest.writeString(this.volumeUnit);
        dest.writeString(this.validityUnit);
        dest.writeString(this.validity);
        Boolean bool = this.active;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            q0.r(dest, 1, bool);
        }
        Long l5 = this.amount;
        if (l5 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l5);
        }
        Long l6 = this.businessAmount;
        if (l6 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l6);
        }
        Long l8 = this.discountAmount;
        if (l8 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l8);
        }
        dest.writeString(this.itemId);
        dest.writeString(this.timeText);
        Integer num = this.timeValue;
        if (num == null) {
            dest.writeInt(0);
        } else {
            q0.s(dest, 1, num);
        }
        dest.writeString(this.title);
        dest.writeString(this.subTitle);
        Integer num2 = this.timeType;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            q0.s(dest, 1, num2);
        }
    }

    public AutoRenewalOrderBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable Long l5, @Nullable Long l6, @Nullable Long l8, @Nullable String str5, @Nullable String str6, @Nullable Integer num, @Nullable String str7, @Nullable String str8, @Nullable Integer num2) {
        this.volume = str;
        this.volumeUnit = str2;
        this.validityUnit = str3;
        this.validity = str4;
        this.active = bool;
        this.amount = l5;
        this.businessAmount = l6;
        this.discountAmount = l8;
        this.itemId = str5;
        this.timeText = str6;
        this.timeValue = num;
        this.title = str7;
        this.subTitle = str8;
        this.timeType = num2;
    }

    public /* synthetic */ AutoRenewalOrderBean(String str, String str2, String str3, String str4, Boolean bool, Long l5, Long l6, Long l8, String str5, String str6, Integer num, String str7, String str8, Integer num2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4, (i7 & 16) != 0 ? Boolean.FALSE : bool, (i7 & 32) != 0 ? null : l5, (i7 & 64) != 0 ? null : l6, (i7 & 128) != 0 ? null : l8, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str5, (i7 & 512) != 0 ? null : str6, (i7 & 1024) != 0 ? null : num, (i7 & 2048) != 0 ? null : str7, (i7 & 4096) != 0 ? null : str8, (i7 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? null : num2);
    }
}
