package com.transsnet.palmpay.airtime.bean;

import C0.G;
import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.microsoft.codepush.react.CodePushConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Parcelize
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\bN\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bë\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u0010I\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010N\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010O\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010T\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010U\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010V\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0004HÆ\u0003Jò\u0001\u0010\\\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010]J\u0006\u0010^\u001a\u00020\u0011J\u0013\u0010_\u001a\u00020`2\b\u0010a\u001a\u0004\u0018\u00010bHÖ\u0003J\t\u0010c\u001a\u00020\u0011HÖ\u0001J\t\u0010d\u001a\u00020\u0004HÖ\u0001J\u0016\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010\n\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001c\"\u0004\b-\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001c\"\u0004\b/\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001c\"\u0004\b1\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001c\"\u0004\b3\u0010\u001eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001c\"\u0004\b5\u0010\u001eR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010:\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b;\u0010&\"\u0004\b<\u0010(R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001c\"\u0004\b>\u0010\u001eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001c\"\u0004\b@\u0010\u001eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001c\"\u0004\bB\u0010\u001eR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u001c\"\u0004\bD\u0010\u001eR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u001c\"\u0004\bF\u0010\u001eR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u001c\"\u0004\bH\u0010\u001e¨\u0006j"}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/AirtimeSpecialRechargeItem;", "Lcom/transsnet/palmpay/airtime/bean/BaseAirtimeItemsBean;", "Landroid/os/Parcelable;", "spotType", "", "billerId", "itemId", "itemName", FirebaseAnalytics.Param.PRICE, "", "discountAmount", "description", "validity", "validityExtDesc", "volume", "volumeUnit", "validityDay", "", "volumeSize", "jumpUrl", "imageUrl", "darkImageUrl", "rewardsRateText", "cornerMark", "rewardsText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSpotType", "()Ljava/lang/String;", "setSpotType", "(Ljava/lang/String;)V", "getBillerId", "setBillerId", "getItemId", "setItemId", "getItemName", "setItemName", "getPrice", "()Ljava/lang/Long;", "setPrice", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getDiscountAmount", "setDiscountAmount", "getDescription", "setDescription", "getValidity", "setValidity", "getValidityExtDesc", "setValidityExtDesc", "getVolume", "setVolume", "getVolumeUnit", "setVolumeUnit", "getValidityDay", "()Ljava/lang/Integer;", "setValidityDay", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getVolumeSize", "setVolumeSize", "getJumpUrl", "setJumpUrl", "getImageUrl", "setImageUrl", "getDarkImageUrl", "setDarkImageUrl", "getRewardsRateText", "setRewardsRateText", "getCornerMark", "setCornerMark", "getRewardsText", "setRewardsText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/transsnet/palmpay/airtime/bean/AirtimeSpecialRechargeItem;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AirtimeSpecialRechargeItem extends BaseAirtimeItemsBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AirtimeSpecialRechargeItem> CREATOR = new Creator();

    @Nullable
    private String billerId;

    @Nullable
    private String cornerMark;

    @Nullable
    private String darkImageUrl;

    @Nullable
    private String description;

    @Nullable
    private Long discountAmount;

    @Nullable
    private String imageUrl;

    @Nullable
    private String itemId;

    @Nullable
    private String itemName;

    @Nullable
    private String jumpUrl;

    @Nullable
    private Long price;

    @Nullable
    private String rewardsRateText;

    @Nullable
    private String rewardsText;

    @Nullable
    private String spotType;

    @Nullable
    private String validity;

    @Nullable
    private Integer validityDay;

    @Nullable
    private String validityExtDesc;

    @Nullable
    private String volume;

    @Nullable
    private Long volumeSize;

    @Nullable
    private String volumeUnit;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AirtimeSpecialRechargeItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AirtimeSpecialRechargeItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AirtimeSpecialRechargeItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AirtimeSpecialRechargeItem[] newArray(int i7) {
            return new AirtimeSpecialRechargeItem[i7];
        }
    }

    public AirtimeSpecialRechargeItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    public static /* synthetic */ AirtimeSpecialRechargeItem copy$default(AirtimeSpecialRechargeItem airtimeSpecialRechargeItem, String str, String str2, String str3, String str4, Long l5, Long l6, String str5, String str6, String str7, String str8, String str9, Integer num, Long l8, String str10, String str11, String str12, String str13, String str14, String str15, int i7, Object obj) {
        String str16;
        String str17;
        String str18 = (i7 & 1) != 0 ? airtimeSpecialRechargeItem.spotType : str;
        String str19 = (i7 & 2) != 0 ? airtimeSpecialRechargeItem.billerId : str2;
        String str20 = (i7 & 4) != 0 ? airtimeSpecialRechargeItem.itemId : str3;
        String str21 = (i7 & 8) != 0 ? airtimeSpecialRechargeItem.itemName : str4;
        Long l10 = (i7 & 16) != 0 ? airtimeSpecialRechargeItem.price : l5;
        Long l11 = (i7 & 32) != 0 ? airtimeSpecialRechargeItem.discountAmount : l6;
        String str22 = (i7 & 64) != 0 ? airtimeSpecialRechargeItem.description : str5;
        String str23 = (i7 & 128) != 0 ? airtimeSpecialRechargeItem.validity : str6;
        String str24 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? airtimeSpecialRechargeItem.validityExtDesc : str7;
        String str25 = (i7 & 512) != 0 ? airtimeSpecialRechargeItem.volume : str8;
        String str26 = (i7 & 1024) != 0 ? airtimeSpecialRechargeItem.volumeUnit : str9;
        Integer num2 = (i7 & 2048) != 0 ? airtimeSpecialRechargeItem.validityDay : num;
        Long l12 = (i7 & 4096) != 0 ? airtimeSpecialRechargeItem.volumeSize : l8;
        String str27 = (i7 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? airtimeSpecialRechargeItem.jumpUrl : str10;
        String str28 = str18;
        String str29 = (i7 & 16384) != 0 ? airtimeSpecialRechargeItem.imageUrl : str11;
        String str30 = (i7 & 32768) != 0 ? airtimeSpecialRechargeItem.darkImageUrl : str12;
        String str31 = (i7 & 65536) != 0 ? airtimeSpecialRechargeItem.rewardsRateText : str13;
        String str32 = (i7 & 131072) != 0 ? airtimeSpecialRechargeItem.cornerMark : str14;
        if ((i7 & CodePushConstants.DOWNLOAD_BUFFER_SIZE) != 0) {
            str17 = str32;
            str16 = airtimeSpecialRechargeItem.rewardsText;
        } else {
            str16 = str15;
            str17 = str32;
        }
        return airtimeSpecialRechargeItem.copy(str28, str19, str20, str21, l10, l11, str22, str23, str24, str25, str26, num2, l12, str27, str29, str30, str31, str17, str16);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSpotType() {
        return this.spotType;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getVolume() {
        return this.volume;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getVolumeUnit() {
        return this.volumeUnit;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getValidityDay() {
        return this.validityDay;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Long getVolumeSize() {
        return this.volumeSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getDarkImageUrl() {
        return this.darkImageUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getRewardsRateText() {
        return this.rewardsRateText;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getCornerMark() {
        return this.cornerMark;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getRewardsText() {
        return this.rewardsText;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBillerId() {
        return this.billerId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getDiscountAmount() {
        return this.discountAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getValidity() {
        return this.validity;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getValidityExtDesc() {
        return this.validityExtDesc;
    }

    @NotNull
    public final AirtimeSpecialRechargeItem copy(@Nullable String spotType, @Nullable String billerId, @Nullable String itemId, @Nullable String itemName, @Nullable Long price, @Nullable Long discountAmount, @Nullable String description, @Nullable String validity, @Nullable String validityExtDesc, @Nullable String volume, @Nullable String volumeUnit, @Nullable Integer validityDay, @Nullable Long volumeSize, @Nullable String jumpUrl, @Nullable String imageUrl, @Nullable String darkImageUrl, @Nullable String rewardsRateText, @Nullable String cornerMark, @Nullable String rewardsText) {
        return new AirtimeSpecialRechargeItem(spotType, billerId, itemId, itemName, price, discountAmount, description, validity, validityExtDesc, volume, volumeUnit, validityDay, volumeSize, jumpUrl, imageUrl, darkImageUrl, rewardsRateText, cornerMark, rewardsText);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AirtimeSpecialRechargeItem)) {
            return false;
        }
        AirtimeSpecialRechargeItem airtimeSpecialRechargeItem = (AirtimeSpecialRechargeItem) other;
        return Intrinsics.c(this.spotType, airtimeSpecialRechargeItem.spotType) && Intrinsics.c(this.billerId, airtimeSpecialRechargeItem.billerId) && Intrinsics.c(this.itemId, airtimeSpecialRechargeItem.itemId) && Intrinsics.c(this.itemName, airtimeSpecialRechargeItem.itemName) && Intrinsics.c(this.price, airtimeSpecialRechargeItem.price) && Intrinsics.c(this.discountAmount, airtimeSpecialRechargeItem.discountAmount) && Intrinsics.c(this.description, airtimeSpecialRechargeItem.description) && Intrinsics.c(this.validity, airtimeSpecialRechargeItem.validity) && Intrinsics.c(this.validityExtDesc, airtimeSpecialRechargeItem.validityExtDesc) && Intrinsics.c(this.volume, airtimeSpecialRechargeItem.volume) && Intrinsics.c(this.volumeUnit, airtimeSpecialRechargeItem.volumeUnit) && Intrinsics.c(this.validityDay, airtimeSpecialRechargeItem.validityDay) && Intrinsics.c(this.volumeSize, airtimeSpecialRechargeItem.volumeSize) && Intrinsics.c(this.jumpUrl, airtimeSpecialRechargeItem.jumpUrl) && Intrinsics.c(this.imageUrl, airtimeSpecialRechargeItem.imageUrl) && Intrinsics.c(this.darkImageUrl, airtimeSpecialRechargeItem.darkImageUrl) && Intrinsics.c(this.rewardsRateText, airtimeSpecialRechargeItem.rewardsRateText) && Intrinsics.c(this.cornerMark, airtimeSpecialRechargeItem.cornerMark) && Intrinsics.c(this.rewardsText, airtimeSpecialRechargeItem.rewardsText);
    }

    @Nullable
    public final String getBillerId() {
        return this.billerId;
    }

    @Nullable
    public final String getCornerMark() {
        return this.cornerMark;
    }

    @Nullable
    public final String getDarkImageUrl() {
        return this.darkImageUrl;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final Long getDiscountAmount() {
        return this.discountAmount;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    public final String getItemName() {
        return this.itemName;
    }

    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    public final Long getPrice() {
        return this.price;
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
    public final String getSpotType() {
        return this.spotType;
    }

    @Nullable
    public final String getValidity() {
        return this.validity;
    }

    @Nullable
    public final Integer getValidityDay() {
        return this.validityDay;
    }

    @Nullable
    public final String getValidityExtDesc() {
        return this.validityExtDesc;
    }

    @Nullable
    public final String getVolume() {
        return this.volume;
    }

    @Nullable
    public final Long getVolumeSize() {
        return this.volumeSize;
    }

    @Nullable
    public final String getVolumeUnit() {
        return this.volumeUnit;
    }

    public int hashCode() {
        String str = this.spotType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.billerId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.itemId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.itemName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l5 = this.price;
        int iHashCode5 = (iHashCode4 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.discountAmount;
        int iHashCode6 = (iHashCode5 + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str5 = this.description;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.validity;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.validityExtDesc;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.volume;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.volumeUnit;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num = this.validityDay;
        int iHashCode12 = (iHashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        Long l8 = this.volumeSize;
        int iHashCode13 = (iHashCode12 + (l8 == null ? 0 : l8.hashCode())) * 31;
        String str10 = this.jumpUrl;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.imageUrl;
        int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.darkImageUrl;
        int iHashCode16 = (iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.rewardsRateText;
        int iHashCode17 = (iHashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.cornerMark;
        int iHashCode18 = (iHashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.rewardsText;
        return iHashCode18 + (str15 != null ? str15.hashCode() : 0);
    }

    public final void setBillerId(@Nullable String str) {
        this.billerId = str;
    }

    public final void setCornerMark(@Nullable String str) {
        this.cornerMark = str;
    }

    public final void setDarkImageUrl(@Nullable String str) {
        this.darkImageUrl = str;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setDiscountAmount(@Nullable Long l5) {
        this.discountAmount = l5;
    }

    public final void setImageUrl(@Nullable String str) {
        this.imageUrl = str;
    }

    public final void setItemId(@Nullable String str) {
        this.itemId = str;
    }

    public final void setItemName(@Nullable String str) {
        this.itemName = str;
    }

    public final void setJumpUrl(@Nullable String str) {
        this.jumpUrl = str;
    }

    public final void setPrice(@Nullable Long l5) {
        this.price = l5;
    }

    public final void setRewardsRateText(@Nullable String str) {
        this.rewardsRateText = str;
    }

    public final void setRewardsText(@Nullable String str) {
        this.rewardsText = str;
    }

    public final void setSpotType(@Nullable String str) {
        this.spotType = str;
    }

    public final void setValidity(@Nullable String str) {
        this.validity = str;
    }

    public final void setValidityDay(@Nullable Integer num) {
        this.validityDay = num;
    }

    public final void setValidityExtDesc(@Nullable String str) {
        this.validityExtDesc = str;
    }

    public final void setVolume(@Nullable String str) {
        this.volume = str;
    }

    public final void setVolumeSize(@Nullable Long l5) {
        this.volumeSize = l5;
    }

    public final void setVolumeUnit(@Nullable String str) {
        this.volumeUnit = str;
    }

    @NotNull
    public String toString() {
        String str = this.spotType;
        String str2 = this.billerId;
        String str3 = this.itemId;
        String str4 = this.itemName;
        Long l5 = this.price;
        Long l6 = this.discountAmount;
        String str5 = this.description;
        String str6 = this.validity;
        String str7 = this.validityExtDesc;
        String str8 = this.volume;
        String str9 = this.volumeUnit;
        Integer num = this.validityDay;
        Long l8 = this.volumeSize;
        String str10 = this.jumpUrl;
        String str11 = this.imageUrl;
        String str12 = this.darkImageUrl;
        String str13 = this.rewardsRateText;
        String str14 = this.cornerMark;
        String str15 = this.rewardsText;
        StringBuilder sbF = F.f("AirtimeSpecialRechargeItem(spotType=", str, ", billerId=", str2, ", itemId=");
        u.x(sbF, str3, ", itemName=", str4, ", price=");
        q0.w(sbF, l5, ", discountAmount=", l6, ", description=");
        u.x(sbF, str5, ", validity=", str6, ", validityExtDesc=");
        u.x(sbF, str7, ", volume=", str8, ", volumeUnit=");
        sbF.append(str9);
        sbF.append(", validityDay=");
        sbF.append(num);
        sbF.append(", volumeSize=");
        sbF.append(l8);
        sbF.append(", jumpUrl=");
        sbF.append(str10);
        sbF.append(", imageUrl=");
        u.x(sbF, str11, ", darkImageUrl=", str12, ", rewardsRateText=");
        u.x(sbF, str13, ", cornerMark=", str14, ", rewardsText=");
        return G.r(sbF, str15, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.spotType);
        dest.writeString(this.billerId);
        dest.writeString(this.itemId);
        dest.writeString(this.itemName);
        Long l5 = this.price;
        if (l5 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l5);
        }
        Long l6 = this.discountAmount;
        if (l6 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l6);
        }
        dest.writeString(this.description);
        dest.writeString(this.validity);
        dest.writeString(this.validityExtDesc);
        dest.writeString(this.volume);
        dest.writeString(this.volumeUnit);
        Integer num = this.validityDay;
        if (num == null) {
            dest.writeInt(0);
        } else {
            q0.s(dest, 1, num);
        }
        Long l8 = this.volumeSize;
        if (l8 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l8);
        }
        dest.writeString(this.jumpUrl);
        dest.writeString(this.imageUrl);
        dest.writeString(this.darkImageUrl);
        dest.writeString(this.rewardsRateText);
        dest.writeString(this.cornerMark);
        dest.writeString(this.rewardsText);
    }

    public /* synthetic */ AirtimeSpecialRechargeItem(String str, String str2, String str3, String str4, Long l5, Long l6, String str5, String str6, String str7, String str8, String str9, Integer num, Long l8, String str10, String str11, String str12, String str13, String str14, String str15, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4, (i7 & 16) != 0 ? null : l5, (i7 & 32) != 0 ? null : l6, (i7 & 64) != 0 ? null : str5, (i7 & 128) != 0 ? null : str6, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str7, (i7 & 512) != 0 ? null : str8, (i7 & 1024) != 0 ? null : str9, (i7 & 2048) != 0 ? null : num, (i7 & 4096) != 0 ? null : l8, (i7 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? null : str10, (i7 & 16384) != 0 ? null : str11, (i7 & 32768) != 0 ? null : str12, (i7 & 65536) != 0 ? null : str13, (i7 & 131072) != 0 ? null : str14, (i7 & CodePushConstants.DOWNLOAD_BUFFER_SIZE) != 0 ? null : str15);
    }

    public AirtimeSpecialRechargeItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Long l5, @Nullable Long l6, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Integer num, @Nullable Long l8, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15) {
        this.spotType = str;
        this.billerId = str2;
        this.itemId = str3;
        this.itemName = str4;
        this.price = l5;
        this.discountAmount = l6;
        this.description = str5;
        this.validity = str6;
        this.validityExtDesc = str7;
        this.volume = str8;
        this.volumeUnit = str9;
        this.validityDay = num;
        this.volumeSize = l8;
        this.jumpUrl = str10;
        this.imageUrl = str11;
        this.darkImageUrl = str12;
        this.rewardsRateText = str13;
        this.cornerMark = str14;
        this.rewardsText = str15;
    }
}
