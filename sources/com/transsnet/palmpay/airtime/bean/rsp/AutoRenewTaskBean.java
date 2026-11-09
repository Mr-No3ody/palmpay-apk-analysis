package com.transsnet.palmpay.airtime.bean.rsp;

import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Parcelize
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b=\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010C\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u00102J\u0010\u0010H\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u00102J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u00102JÂ\u0001\u0010K\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010LJ\u0006\u0010M\u001a\u00020NJ\u0013\u0010O\u001a\u00020\u00102\b\u0010P\u001a\u0004\u0018\u00010QHÖ\u0003J\t\u0010R\u001a\u00020NHÖ\u0001J\t\u0010S\u001a\u00020\u0003HÖ\u0001J\u0016\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020NR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0017\"\u0004\b,\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0017\"\u0004\b.\u0010\u0019R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0017\"\u0004\b0\u0010\u0019R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\b6\u00102\"\u0004\b7\u00104R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0017\"\u0004\b9\u0010\u0019R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\b:\u00102\"\u0004\b;\u00104¨\u0006Y"}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/rsp/AutoRenewTaskBean;", "Landroid/os/Parcelable;", "taskId", "", "billerName", "phone", "itemId", "renewItem", "renewPeriod", "renewPrice", "", "originalPrice", ReactTextInputShadowNode.PROP_TEXT, "benefitsImg", "darkBenefitsImg", "cashInGuidance", "", "pushGuidance", "frequencyRemark", "replace", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V", "getTaskId", "()Ljava/lang/String;", "setTaskId", "(Ljava/lang/String;)V", "getBillerName", "setBillerName", "getPhone", "setPhone", "getItemId", "setItemId", "getRenewItem", "setRenewItem", "getRenewPeriod", "setRenewPeriod", "getRenewPrice", "()Ljava/lang/Long;", "setRenewPrice", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getOriginalPrice", "setOriginalPrice", "getText", "setText", "getBenefitsImg", "setBenefitsImg", "getDarkBenefitsImg", "setDarkBenefitsImg", "getCashInGuidance", "()Ljava/lang/Boolean;", "setCashInGuidance", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getPushGuidance", "setPushGuidance", "getFrequencyRemark", "setFrequencyRemark", "getReplace", "setReplace", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/transsnet/palmpay/airtime/bean/rsp/AutoRenewTaskBean;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AutoRenewTaskBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AutoRenewTaskBean> CREATOR = new Creator();

    @Nullable
    private String benefitsImg;

    @Nullable
    private String billerName;

    @Nullable
    private Boolean cashInGuidance;

    @Nullable
    private String darkBenefitsImg;

    @Nullable
    private String frequencyRemark;

    @Nullable
    private String itemId;

    @Nullable
    private Long originalPrice;

    @Nullable
    private String phone;

    @Nullable
    private Boolean pushGuidance;

    @Nullable
    private String renewItem;

    @Nullable
    private String renewPeriod;

    @Nullable
    private Long renewPrice;

    @Nullable
    private Boolean replace;

    @Nullable
    private String taskId;

    @Nullable
    private String text;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutoRenewTaskBean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoRenewTaskBean createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Boolean boolValueOf3 = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string10 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AutoRenewTaskBean(string, string2, string3, string4, string5, string6, lValueOf, lValueOf2, string7, string8, string9, boolValueOf, boolValueOf2, string10, boolValueOf3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoRenewTaskBean[] newArray(int i7) {
            return new AutoRenewTaskBean[i7];
        }
    }

    public AutoRenewTaskBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Long l5, @Nullable Long l6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str10, @Nullable Boolean bool3) {
        this.taskId = str;
        this.billerName = str2;
        this.phone = str3;
        this.itemId = str4;
        this.renewItem = str5;
        this.renewPeriod = str6;
        this.renewPrice = l5;
        this.originalPrice = l6;
        this.text = str7;
        this.benefitsImg = str8;
        this.darkBenefitsImg = str9;
        this.cashInGuidance = bool;
        this.pushGuidance = bool2;
        this.frequencyRemark = str10;
        this.replace = bool3;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTaskId() {
        return this.taskId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getBenefitsImg() {
        return this.benefitsImg;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDarkBenefitsImg() {
        return this.darkBenefitsImg;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getCashInGuidance() {
        return this.cashInGuidance;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getPushGuidance() {
        return this.pushGuidance;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getFrequencyRemark() {
        return this.frequencyRemark;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getReplace() {
        return this.replace;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRenewItem() {
        return this.renewItem;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRenewPeriod() {
        return this.renewPeriod;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getRenewPrice() {
        return this.renewPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getOriginalPrice() {
        return this.originalPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final AutoRenewTaskBean copy(@Nullable String taskId, @Nullable String billerName, @Nullable String phone, @Nullable String itemId, @Nullable String renewItem, @Nullable String renewPeriod, @Nullable Long renewPrice, @Nullable Long originalPrice, @Nullable String text, @Nullable String benefitsImg, @Nullable String darkBenefitsImg, @Nullable Boolean cashInGuidance, @Nullable Boolean pushGuidance, @Nullable String frequencyRemark, @Nullable Boolean replace) {
        return new AutoRenewTaskBean(taskId, billerName, phone, itemId, renewItem, renewPeriod, renewPrice, originalPrice, text, benefitsImg, darkBenefitsImg, cashInGuidance, pushGuidance, frequencyRemark, replace);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoRenewTaskBean)) {
            return false;
        }
        AutoRenewTaskBean autoRenewTaskBean = (AutoRenewTaskBean) other;
        return Intrinsics.c(this.taskId, autoRenewTaskBean.taskId) && Intrinsics.c(this.billerName, autoRenewTaskBean.billerName) && Intrinsics.c(this.phone, autoRenewTaskBean.phone) && Intrinsics.c(this.itemId, autoRenewTaskBean.itemId) && Intrinsics.c(this.renewItem, autoRenewTaskBean.renewItem) && Intrinsics.c(this.renewPeriod, autoRenewTaskBean.renewPeriod) && Intrinsics.c(this.renewPrice, autoRenewTaskBean.renewPrice) && Intrinsics.c(this.originalPrice, autoRenewTaskBean.originalPrice) && Intrinsics.c(this.text, autoRenewTaskBean.text) && Intrinsics.c(this.benefitsImg, autoRenewTaskBean.benefitsImg) && Intrinsics.c(this.darkBenefitsImg, autoRenewTaskBean.darkBenefitsImg) && Intrinsics.c(this.cashInGuidance, autoRenewTaskBean.cashInGuidance) && Intrinsics.c(this.pushGuidance, autoRenewTaskBean.pushGuidance) && Intrinsics.c(this.frequencyRemark, autoRenewTaskBean.frequencyRemark) && Intrinsics.c(this.replace, autoRenewTaskBean.replace);
    }

    @Nullable
    public final String getBenefitsImg() {
        return this.benefitsImg;
    }

    @Nullable
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    public final Boolean getCashInGuidance() {
        return this.cashInGuidance;
    }

    @Nullable
    public final String getDarkBenefitsImg() {
        return this.darkBenefitsImg;
    }

    @Nullable
    public final String getFrequencyRemark() {
        return this.frequencyRemark;
    }

    @Nullable
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    public final Long getOriginalPrice() {
        return this.originalPrice;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    public final Boolean getPushGuidance() {
        return this.pushGuidance;
    }

    @Nullable
    public final String getRenewItem() {
        return this.renewItem;
    }

    @Nullable
    public final String getRenewPeriod() {
        return this.renewPeriod;
    }

    @Nullable
    public final Long getRenewPrice() {
        return this.renewPrice;
    }

    @Nullable
    public final Boolean getReplace() {
        return this.replace;
    }

    @Nullable
    public final String getTaskId() {
        return this.taskId;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.taskId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.billerName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phone;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.itemId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.renewItem;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.renewPeriod;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l5 = this.renewPrice;
        int iHashCode7 = (iHashCode6 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.originalPrice;
        int iHashCode8 = (iHashCode7 + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str7 = this.text;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.benefitsImg;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.darkBenefitsImg;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool = this.cashInGuidance;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.pushGuidance;
        int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str10 = this.frequencyRemark;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool3 = this.replace;
        return iHashCode14 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final void setBenefitsImg(@Nullable String str) {
        this.benefitsImg = str;
    }

    public final void setBillerName(@Nullable String str) {
        this.billerName = str;
    }

    public final void setCashInGuidance(@Nullable Boolean bool) {
        this.cashInGuidance = bool;
    }

    public final void setDarkBenefitsImg(@Nullable String str) {
        this.darkBenefitsImg = str;
    }

    public final void setFrequencyRemark(@Nullable String str) {
        this.frequencyRemark = str;
    }

    public final void setItemId(@Nullable String str) {
        this.itemId = str;
    }

    public final void setOriginalPrice(@Nullable Long l5) {
        this.originalPrice = l5;
    }

    public final void setPhone(@Nullable String str) {
        this.phone = str;
    }

    public final void setPushGuidance(@Nullable Boolean bool) {
        this.pushGuidance = bool;
    }

    public final void setRenewItem(@Nullable String str) {
        this.renewItem = str;
    }

    public final void setRenewPeriod(@Nullable String str) {
        this.renewPeriod = str;
    }

    public final void setRenewPrice(@Nullable Long l5) {
        this.renewPrice = l5;
    }

    public final void setReplace(@Nullable Boolean bool) {
        this.replace = bool;
    }

    public final void setTaskId(@Nullable String str) {
        this.taskId = str;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    @NotNull
    public String toString() {
        String str = this.taskId;
        String str2 = this.billerName;
        String str3 = this.phone;
        String str4 = this.itemId;
        String str5 = this.renewItem;
        String str6 = this.renewPeriod;
        Long l5 = this.renewPrice;
        Long l6 = this.originalPrice;
        String str7 = this.text;
        String str8 = this.benefitsImg;
        String str9 = this.darkBenefitsImg;
        Boolean bool = this.cashInGuidance;
        Boolean bool2 = this.pushGuidance;
        String str10 = this.frequencyRemark;
        Boolean bool3 = this.replace;
        StringBuilder sbF = F.f("AutoRenewTaskBean(taskId=", str, ", billerName=", str2, ", phone=");
        u.x(sbF, str3, ", itemId=", str4, ", renewItem=");
        u.x(sbF, str5, ", renewPeriod=", str6, ", renewPrice=");
        q0.w(sbF, l5, ", originalPrice=", l6, ", text=");
        u.x(sbF, str7, ", benefitsImg=", str8, ", darkBenefitsImg=");
        sbF.append(str9);
        sbF.append(", cashInGuidance=");
        sbF.append(bool);
        sbF.append(", pushGuidance=");
        sbF.append(bool2);
        sbF.append(", frequencyRemark=");
        sbF.append(str10);
        sbF.append(", replace=");
        sbF.append(bool3);
        sbF.append(")");
        return sbF.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.taskId);
        dest.writeString(this.billerName);
        dest.writeString(this.phone);
        dest.writeString(this.itemId);
        dest.writeString(this.renewItem);
        dest.writeString(this.renewPeriod);
        Long l5 = this.renewPrice;
        if (l5 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l5);
        }
        Long l6 = this.originalPrice;
        if (l6 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l6);
        }
        dest.writeString(this.text);
        dest.writeString(this.benefitsImg);
        dest.writeString(this.darkBenefitsImg);
        Boolean bool = this.cashInGuidance;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            q0.r(dest, 1, bool);
        }
        Boolean bool2 = this.pushGuidance;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            q0.r(dest, 1, bool2);
        }
        dest.writeString(this.frequencyRemark);
        Boolean bool3 = this.replace;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            q0.r(dest, 1, bool3);
        }
    }
}
