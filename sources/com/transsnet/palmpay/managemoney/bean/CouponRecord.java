package com.transsnet.palmpay.managemoney.bean;

import N8.q0;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b1\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\tHÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0085\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\u0007HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0013\"\u0004\b+\u0010\u0015R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0013\"\u0004\b-\u0010\u0015¨\u0006?"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/CouponRecord;", "", "couponId", "", "itemName", "image", "itemType", "", "nominalValue", "", FirebaseAnalytics.Param.QUANTITY, "itemStatus", "couponCode", "actNo", "pushCode", "sceneDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCouponId", "()Ljava/lang/String;", "setCouponId", "(Ljava/lang/String;)V", "getItemName", "setItemName", "getImage", "setImage", "getItemType", "()I", "setItemType", "(I)V", "getNominalValue", "()J", "setNominalValue", "(J)V", "getQuantity", "setQuantity", "getItemStatus", "setItemStatus", "getCouponCode", "setCouponCode", "getActNo", "setActNo", "getPushCode", "setPushCode", "getSceneDescription", "setSceneDescription", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CouponRecord {

    @Nullable
    private String actNo;

    @Nullable
    private String couponCode;

    @Nullable
    private String couponId;

    @Nullable
    private String image;

    @Nullable
    private String itemName;
    private int itemStatus;
    private int itemType;
    private long nominalValue;

    @Nullable
    private String pushCode;
    private int quantity;

    @Nullable
    private String sceneDescription;

    public CouponRecord() {
        this(null, null, null, 0, 0L, 0, 0, null, null, null, null, 2047, null);
    }

    public static /* synthetic */ CouponRecord copy$default(CouponRecord couponRecord, String str, String str2, String str3, int i7, long j6, int i10, int i11, String str4, String str5, String str6, String str7, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = couponRecord.couponId;
        }
        if ((i12 & 2) != 0) {
            str2 = couponRecord.itemName;
        }
        if ((i12 & 4) != 0) {
            str3 = couponRecord.image;
        }
        if ((i12 & 8) != 0) {
            i7 = couponRecord.itemType;
        }
        if ((i12 & 16) != 0) {
            j6 = couponRecord.nominalValue;
        }
        if ((i12 & 32) != 0) {
            i10 = couponRecord.quantity;
        }
        if ((i12 & 64) != 0) {
            i11 = couponRecord.itemStatus;
        }
        if ((i12 & 128) != 0) {
            str4 = couponRecord.couponCode;
        }
        if ((i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            str5 = couponRecord.actNo;
        }
        if ((i12 & 512) != 0) {
            str6 = couponRecord.pushCode;
        }
        if ((i12 & 1024) != 0) {
            str7 = couponRecord.sceneDescription;
        }
        String str8 = str6;
        String str9 = str7;
        long j10 = j6;
        String str10 = str3;
        int i13 = i7;
        return couponRecord.copy(str, str2, str10, i13, j10, i10, i11, str4, str5, str8, str9);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCouponId() {
        return this.couponId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPushCode() {
        return this.pushCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSceneDescription() {
        return this.sceneDescription;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getItemType() {
        return this.itemType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getNominalValue() {
        return this.nominalValue;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getItemStatus() {
        return this.itemStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCouponCode() {
        return this.couponCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getActNo() {
        return this.actNo;
    }

    @NotNull
    public final CouponRecord copy(@Nullable String couponId, @Nullable String itemName, @Nullable String image, int itemType, long nominalValue, int quantity, int itemStatus, @Nullable String couponCode, @Nullable String actNo, @Nullable String pushCode, @Nullable String sceneDescription) {
        return new CouponRecord(couponId, itemName, image, itemType, nominalValue, quantity, itemStatus, couponCode, actNo, pushCode, sceneDescription);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponRecord)) {
            return false;
        }
        CouponRecord couponRecord = (CouponRecord) other;
        return Intrinsics.c(this.couponId, couponRecord.couponId) && Intrinsics.c(this.itemName, couponRecord.itemName) && Intrinsics.c(this.image, couponRecord.image) && this.itemType == couponRecord.itemType && this.nominalValue == couponRecord.nominalValue && this.quantity == couponRecord.quantity && this.itemStatus == couponRecord.itemStatus && Intrinsics.c(this.couponCode, couponRecord.couponCode) && Intrinsics.c(this.actNo, couponRecord.actNo) && Intrinsics.c(this.pushCode, couponRecord.pushCode) && Intrinsics.c(this.sceneDescription, couponRecord.sceneDescription);
    }

    @Nullable
    public final String getActNo() {
        return this.actNo;
    }

    @Nullable
    public final String getCouponCode() {
        return this.couponCode;
    }

    @Nullable
    public final String getCouponId() {
        return this.couponId;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @Nullable
    public final String getItemName() {
        return this.itemName;
    }

    public final int getItemStatus() {
        return this.itemStatus;
    }

    public final int getItemType() {
        return this.itemType;
    }

    public final long getNominalValue() {
        return this.nominalValue;
    }

    @Nullable
    public final String getPushCode() {
        return this.pushCode;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    @Nullable
    public final String getSceneDescription() {
        return this.sceneDescription;
    }

    public int hashCode() {
        String str = this.couponId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.itemName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.image;
        int iB = u.b(this.itemStatus, u.b(this.quantity, q0.b(u.b(this.itemType, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31, this.nominalValue), 31), 31);
        String str4 = this.couponCode;
        int iHashCode3 = (iB + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.actNo;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.pushCode;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.sceneDescription;
        return iHashCode5 + (str7 != null ? str7.hashCode() : 0);
    }

    public final void setActNo(@Nullable String str) {
        this.actNo = str;
    }

    public final void setCouponCode(@Nullable String str) {
        this.couponCode = str;
    }

    public final void setCouponId(@Nullable String str) {
        this.couponId = str;
    }

    public final void setImage(@Nullable String str) {
        this.image = str;
    }

    public final void setItemName(@Nullable String str) {
        this.itemName = str;
    }

    public final void setItemStatus(int i7) {
        this.itemStatus = i7;
    }

    public final void setItemType(int i7) {
        this.itemType = i7;
    }

    public final void setNominalValue(long j6) {
        this.nominalValue = j6;
    }

    public final void setPushCode(@Nullable String str) {
        this.pushCode = str;
    }

    public final void setQuantity(int i7) {
        this.quantity = i7;
    }

    public final void setSceneDescription(@Nullable String str) {
        this.sceneDescription = str;
    }

    @NotNull
    public String toString() {
        String str = this.couponId;
        String str2 = this.itemName;
        String str3 = this.image;
        int i7 = this.itemType;
        long j6 = this.nominalValue;
        int i10 = this.quantity;
        int i11 = this.itemStatus;
        String str4 = this.couponCode;
        String str5 = this.actNo;
        String str6 = this.pushCode;
        String str7 = this.sceneDescription;
        StringBuilder sbF = F.f("CouponRecord(couponId=", str, ", itemName=", str2, ", image=");
        sbF.append(str3);
        sbF.append(", itemType=");
        sbF.append(i7);
        sbF.append(", nominalValue=");
        sbF.append(j6);
        sbF.append(", quantity=");
        sbF.append(i10);
        sbF.append(", itemStatus=");
        sbF.append(i11);
        sbF.append(", couponCode=");
        sbF.append(str4);
        u.x(sbF, ", actNo=", str5, ", pushCode=", str6);
        return F.d(sbF, ", sceneDescription=", str7, ")");
    }

    public CouponRecord(@Nullable String str, @Nullable String str2, @Nullable String str3, int i7, long j6, int i10, int i11, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.couponId = str;
        this.itemName = str2;
        this.image = str3;
        this.itemType = i7;
        this.nominalValue = j6;
        this.quantity = i10;
        this.itemStatus = i11;
        this.couponCode = str4;
        this.actNo = str5;
        this.pushCode = str6;
        this.sceneDescription = str7;
    }

    public /* synthetic */ CouponRecord(String str, String str2, String str3, int i7, long j6, int i10, int i11, String str4, String str5, String str6, String str7, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? 0 : i7, (i12 & 16) != 0 ? 0L : j6, (i12 & 32) != 0 ? 0 : i10, (i12 & 64) == 0 ? i11 : 0, (i12 & 128) != 0 ? null : str4, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str5, (i12 & 512) != 0 ? null : str6, (i12 & 1024) != 0 ? null : str7);
    }
}
