package com.transsnet.palmpay.core.bean.cashier;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.microsoft.codepush.react.CodePushConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 =2\u00020\u0001:\u0001=B\u008b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b1\u00102B\u0011\b\u0016\u0012\u0006\u00103\u001a\u000204¢\u0006\u0004\b1\u00105J\u0018\u00109\u001a\u00020:2\u0006\u00103\u001a\u0002042\u0006\u0010;\u001a\u00020\u000eH\u0016J\b\u0010<\u001a\u00020\u000eH\u0016R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u00106R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u00106R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u00106R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u00106R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u00106R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u00106R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u00107R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u00107R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u00106R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u00106R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u00106R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u00108R\u0014\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010$\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u00107R\u0014\u0010%\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010)\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u00108R\u0016\u0010*\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u00107R\u0016\u0010+\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u00107R\u0016\u0010,\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u00106R\u0014\u0010-\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010.\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u00108R\u0016\u0010/\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u00108R\u0014\u00100\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/CashierCouponItem;", "Landroid/os/Parcelable;", "id", "", "couponType", "nominaValue", "", "limitAmt", "couponName", "createTime", "updateTime", "startTime", "endTime", "appSource", "", "actName", "actNo", "busRes", "consumeAmt", "consumeTime", "couponCode", "couponId", "couponSubhead", "createId", "limtType", "orderNo", "reqSn", "spreaderId", "spuCode", "status", "transType", "updateId", "layoutExpand", "", "limitStores", "couponDesc", "useLimitType", "qrCode", "useAccountType", "androidLinkUrl", "couponIcon", "showOnlyMeErrors", "preferentialDays", "discountRate", "systemTime", "remark", "isUsable", "available", "unavailableReason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "Ljava/lang/Long;", "Ljava/lang/Integer;", "Ljava/lang/Boolean;", "writeToParcel", "", "flags", "describeContents", "Companion", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CashierCouponItem implements Parcelable {

    @NotNull
    public static final String COUPON_TYPE_DAYS = "DAYS";

    @NotNull
    public static final String COUPON_TYPE_DISCOUNT = "DISCOUNT";

    @NotNull
    public static final String COUPON_TYPE_GOODS = "PRIZE";

    @NotNull
    public static final String COUPON_TYPE_RECHARGE = "RECHARGE";

    @JvmField
    @Nullable
    public String actName;

    @JvmField
    @Nullable
    public String actNo;

    @JvmField
    @Nullable
    public String androidLinkUrl;

    @JvmField
    @Nullable
    public Integer appSource;

    @JvmField
    @Nullable
    public Boolean available;

    @JvmField
    @Nullable
    public Integer busRes;

    @JvmField
    @Nullable
    public Long consumeAmt;

    @JvmField
    @Nullable
    public Long consumeTime;

    @JvmField
    @Nullable
    public String couponCode;

    @JvmField
    @Nullable
    public String couponDesc;

    @JvmField
    @Nullable
    public String couponIcon;

    @JvmField
    @Nullable
    public Long couponId;

    @JvmField
    @Nullable
    public String couponName;

    @JvmField
    @Nullable
    public String couponSubhead;

    @JvmField
    @Nullable
    public String couponType;

    @JvmField
    @Nullable
    public String createId;

    @JvmField
    @Nullable
    public Long createTime;

    @JvmField
    @Nullable
    public Integer discountRate;

    @JvmField
    @Nullable
    public Long endTime;

    @JvmField
    @Nullable
    public String id;

    @JvmField
    @Nullable
    public Boolean isUsable;

    @JvmField
    @Nullable
    public Boolean layoutExpand;

    @JvmField
    @Nullable
    public Long limitAmt;

    @JvmField
    @Nullable
    public String limitStores;

    @JvmField
    @Nullable
    public String limtType;

    @JvmField
    @Nullable
    public Long nominaValue;

    @JvmField
    @Nullable
    public String orderNo;

    @JvmField
    @Nullable
    public Integer preferentialDays;

    @JvmField
    @Nullable
    public String qrCode;

    @JvmField
    @Nullable
    public String remark;

    @JvmField
    @Nullable
    public String reqSn;

    @JvmField
    @Nullable
    public Boolean showOnlyMeErrors;

    @JvmField
    @Nullable
    public String spreaderId;

    @JvmField
    @Nullable
    public String spuCode;

    @JvmField
    @Nullable
    public Long startTime;

    @JvmField
    @Nullable
    public String status;

    @JvmField
    @Nullable
    public Long systemTime;

    @JvmField
    @Nullable
    public String transType;

    @JvmField
    @Nullable
    public String unavailableReason;

    @JvmField
    @Nullable
    public String updateId;

    @JvmField
    @Nullable
    public Long updateTime;

    @JvmField
    @Nullable
    public String useAccountType;

    @JvmField
    @Nullable
    public Integer useLimitType;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<CashierCouponItem> CREATOR = new Parcelable.Creator<CashierCouponItem>() { // from class: com.transsnet.palmpay.core.bean.cashier.CashierCouponItem$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CashierCouponItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CashierCouponItem(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CashierCouponItem[] newArray(int size) {
            return new CashierCouponItem[size];
        }
    };

    public CashierCouponItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 2047, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.id);
        parcel.writeString(this.couponType);
        parcel.writeValue(this.nominaValue);
        parcel.writeValue(this.limitAmt);
        parcel.writeString(this.couponName);
        parcel.writeValue(this.createTime);
        parcel.writeValue(this.updateTime);
        parcel.writeValue(this.startTime);
        parcel.writeValue(this.endTime);
        parcel.writeValue(this.appSource);
        parcel.writeString(this.actName);
        parcel.writeString(this.actNo);
        parcel.writeValue(this.busRes);
        parcel.writeValue(this.consumeAmt);
        parcel.writeValue(this.consumeTime);
        parcel.writeString(this.couponCode);
        parcel.writeValue(this.couponId);
        parcel.writeString(this.couponSubhead);
        parcel.writeString(this.createId);
        parcel.writeString(this.limtType);
        parcel.writeString(this.orderNo);
        parcel.writeString(this.reqSn);
        parcel.writeString(this.spreaderId);
        parcel.writeString(this.spuCode);
        parcel.writeString(this.status);
        parcel.writeString(this.transType);
        parcel.writeString(this.updateId);
        parcel.writeValue(this.layoutExpand);
        parcel.writeString(this.limitStores);
        parcel.writeString(this.couponDesc);
        parcel.writeValue(this.useLimitType);
        parcel.writeString(this.qrCode);
        parcel.writeString(this.useAccountType);
        parcel.writeString(this.androidLinkUrl);
        parcel.writeString(this.couponIcon);
        parcel.writeValue(this.showOnlyMeErrors);
        parcel.writeValue(this.preferentialDays);
        parcel.writeValue(this.discountRate);
        parcel.writeValue(this.systemTime);
        parcel.writeString(this.remark);
        parcel.writeValue(this.isUsable);
        parcel.writeValue(this.available);
        parcel.writeString(this.unavailableReason);
    }

    public CashierCouponItem(@Nullable String str, @Nullable String str2, @Nullable Long l5, @Nullable Long l6, @Nullable String str3, @Nullable Long l8, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable Integer num, @Nullable String str4, @Nullable String str5, @Nullable Integer num2, @Nullable Long l13, @Nullable Long l14, @Nullable String str6, @Nullable Long l15, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable Boolean bool, @Nullable String str17, @Nullable String str18, @Nullable Integer num3, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable Boolean bool2, @Nullable Integer num4, @Nullable Integer num5, @Nullable Long l16, @Nullable String str23, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable String str24) {
        this.id = str;
        this.couponType = str2;
        this.nominaValue = l5;
        this.limitAmt = l6;
        this.couponName = str3;
        this.createTime = l8;
        this.updateTime = l10;
        this.startTime = l11;
        this.endTime = l12;
        this.appSource = num;
        this.actName = str4;
        this.actNo = str5;
        this.busRes = num2;
        this.consumeAmt = l13;
        this.consumeTime = l14;
        this.couponCode = str6;
        this.couponId = l15;
        this.couponSubhead = str7;
        this.createId = str8;
        this.limtType = str9;
        this.orderNo = str10;
        this.reqSn = str11;
        this.spreaderId = str12;
        this.spuCode = str13;
        this.status = str14;
        this.transType = str15;
        this.updateId = str16;
        this.layoutExpand = bool;
        this.limitStores = str17;
        this.couponDesc = str18;
        this.useLimitType = num3;
        this.qrCode = str19;
        this.useAccountType = str20;
        this.androidLinkUrl = str21;
        this.couponIcon = str22;
        this.showOnlyMeErrors = bool2;
        this.preferentialDays = num4;
        this.discountRate = num5;
        this.systemTime = l16;
        this.remark = str23;
        this.isUsable = bool3;
        this.available = bool4;
        this.unavailableReason = str24;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CashierCouponItem(String str, String str2, Long l5, Long l6, String str3, Long l8, Long l10, Long l11, Long l12, Integer num, String str4, String str5, Integer num2, Long l13, Long l14, String str6, Long l15, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, String str17, String str18, Integer num3, String str19, String str20, String str21, String str22, Boolean bool2, Integer num4, Integer num5, Long l16, String str23, Boolean bool3, Boolean bool4, String str24, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        String str25 = (i7 & 1) != 0 ? null : str;
        this(str25, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? 0L : l5, (i7 & 8) != 0 ? 0L : l6, (i7 & 16) != 0 ? null : str3, (i7 & 32) != 0 ? 0L : l8, (i7 & 64) != 0 ? 0L : l10, (i7 & 128) != 0 ? 0L : l11, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? 0L : l12, (i7 & 512) != 0 ? 0 : num, (i7 & 1024) != 0 ? null : str4, (i7 & 2048) != 0 ? null : str5, (i7 & 4096) != 0 ? 0 : num2, (i7 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? 0L : l13, (i7 & 16384) != 0 ? 0L : l14, (i7 & 32768) != 0 ? null : str6, (i7 & 65536) != 0 ? 0L : l15, (i7 & 131072) != 0 ? null : str7, (i7 & CodePushConstants.DOWNLOAD_BUFFER_SIZE) != 0 ? null : str8, (i7 & 524288) != 0 ? null : str9, (i7 & 1048576) != 0 ? null : str10, (i7 & 2097152) != 0 ? null : str11, (i7 & 4194304) != 0 ? null : str12, (i7 & 8388608) != 0 ? null : str13, (i7 & PointerEventHelper.X_FLAG_SUPPORTS_HOVER) != 0 ? null : str14, (i7 & 33554432) != 0 ? null : str15, (i7 & 67108864) != 0 ? null : str16, (i7 & 134217728) != 0 ? Boolean.FALSE : bool, (i7 & 268435456) != 0 ? null : str17, (i7 & 536870912) != 0 ? null : str18, (i7 & 1073741824) != 0 ? 0 : num3, (i7 & Integer.MIN_VALUE) != 0 ? null : str19, (i10 & 1) != 0 ? null : str20, (i10 & 2) != 0 ? null : str21, (i10 & 4) != 0 ? null : str22, (i10 & 8) != 0 ? Boolean.FALSE : bool2, (i10 & 16) != 0 ? 0 : num4, (i10 & 32) != 0 ? 0 : num5, (i10 & 64) != 0 ? 0L : l16, (i10 & 128) != 0 ? null : str23, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? Boolean.TRUE : bool3, (i10 & 512) != 0 ? Boolean.TRUE : bool4, (i10 & 1024) != 0 ? null : str24);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CashierCouponItem(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        String string2 = parcel.readString();
        Class cls = Long.TYPE;
        Object value = parcel.readValue(cls.getClassLoader());
        Long l5 = value instanceof Long ? (Long) value : null;
        Object value2 = parcel.readValue(cls.getClassLoader());
        Long l6 = value2 instanceof Long ? (Long) value2 : null;
        String string3 = parcel.readString();
        Object value3 = parcel.readValue(cls.getClassLoader());
        Long l8 = value3 instanceof Long ? (Long) value3 : null;
        Object value4 = parcel.readValue(cls.getClassLoader());
        Long l10 = value4 instanceof Long ? (Long) value4 : null;
        Object value5 = parcel.readValue(cls.getClassLoader());
        Long l11 = value5 instanceof Long ? (Long) value5 : null;
        Object value6 = parcel.readValue(cls.getClassLoader());
        Long l12 = value6 instanceof Long ? (Long) value6 : null;
        Class cls2 = Integer.TYPE;
        Object value7 = parcel.readValue(cls2.getClassLoader());
        Integer num = value7 instanceof Integer ? (Integer) value7 : null;
        String string4 = parcel.readString();
        Integer num2 = num;
        String string5 = parcel.readString();
        Object value8 = parcel.readValue(cls2.getClassLoader());
        Integer num3 = value8 instanceof Integer ? (Integer) value8 : null;
        Object value9 = parcel.readValue(cls.getClassLoader());
        Long l13 = l6;
        Long l14 = value9 instanceof Long ? (Long) value9 : null;
        Object value10 = parcel.readValue(cls.getClassLoader());
        Long l15 = l14;
        Long l16 = value10 instanceof Long ? (Long) value10 : null;
        Integer num4 = num3;
        String string6 = parcel.readString();
        Object value11 = parcel.readValue(cls.getClassLoader());
        Long l17 = l16;
        Long l18 = value11 instanceof Long ? (Long) value11 : null;
        String string7 = parcel.readString();
        String string8 = parcel.readString();
        String string9 = parcel.readString();
        String string10 = parcel.readString();
        String string11 = parcel.readString();
        String string12 = parcel.readString();
        String string13 = parcel.readString();
        String string14 = parcel.readString();
        String string15 = parcel.readString();
        String string16 = parcel.readString();
        Class cls3 = Boolean.TYPE;
        Long l19 = l18;
        Object value12 = parcel.readValue(cls3.getClassLoader());
        Boolean bool = value12 instanceof Boolean ? (Boolean) value12 : null;
        String string17 = parcel.readString();
        String string18 = parcel.readString();
        Boolean bool2 = bool;
        Object value13 = parcel.readValue(cls2.getClassLoader());
        Integer num5 = value13 instanceof Integer ? (Integer) value13 : null;
        String string19 = parcel.readString();
        String string20 = parcel.readString();
        String string21 = parcel.readString();
        String string22 = parcel.readString();
        Object value14 = parcel.readValue(cls3.getClassLoader());
        Integer num6 = num5;
        Boolean bool3 = value14 instanceof Boolean ? (Boolean) value14 : null;
        Object value15 = parcel.readValue(cls2.getClassLoader());
        Boolean bool4 = bool3;
        Integer num7 = value15 instanceof Integer ? (Integer) value15 : null;
        Object value16 = parcel.readValue(cls2.getClassLoader());
        Integer num8 = num7;
        Integer num9 = value16 instanceof Integer ? (Integer) value16 : null;
        Object value17 = parcel.readValue(cls.getClassLoader());
        Integer num10 = num9;
        Long l20 = value17 instanceof Long ? (Long) value17 : null;
        String string23 = parcel.readString();
        Long l21 = l20;
        Object value18 = parcel.readValue(cls3.getClassLoader());
        Boolean bool5 = value18 instanceof Boolean ? (Boolean) value18 : null;
        Object value19 = parcel.readValue(cls3.getClassLoader());
        this(string, string2, l5, l13, string3, l8, l10, l11, l12, num2, string4, string5, num4, l15, l17, string6, l19, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, bool2, string17, string18, num6, string19, string20, string21, string22, bool4, num8, num10, l21, string23, bool5, value19 instanceof Boolean ? (Boolean) value19 : null, parcel.readString());
    }
}
