package com.transsnet.palmpay.core.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class CouponItem implements Parcelable {
    public static final String COUPON_TYPE_CASH = "CASH";
    public static final String COUPON_TYPE_COMMON = "COMMON";
    public static final String COUPON_TYPE_DAYS = "DAYS";
    public static final String COUPON_TYPE_DISCOUNT = "DISCOUNT";
    public static final String COUPON_TYPE_GIFT = "GIFT";
    public static final String COUPON_TYPE_GOODS = "PRIZE";
    public static final String COUPON_TYPE_RECHARGE = "RECHARGE";
    public static final Parcelable.Creator<CouponItem> CREATOR = new Parcelable.Creator<CouponItem>() { // from class: com.transsnet.palmpay.core.bean.CouponItem.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CouponItem createFromParcel(Parcel source) {
            return new CouponItem(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CouponItem[] newArray(int size) {
            return new CouponItem[size];
        }
    };
    public String actName;
    public String actNo;
    public String androidLinkUrl;
    public int appSource;
    public boolean available;
    public int busRes;
    public long claimId;
    public long consumeAmt;
    public long consumeTime;
    public String couponCode;
    public String couponDesc;
    public String couponIcon;
    public long couponId;
    public String couponName;
    public String couponSubhead;
    public String couponType;
    public String createId;
    public long createTime;
    public int discountRate;
    public long endTime;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public String f27363id;
    public boolean isUsable;
    public boolean layoutExpand;
    public long limitAmt;
    public String limitStores;
    public String limtType;
    public long nominaValue;
    public String orderNo;
    public int preferentialDays;
    public String qrCode;
    public String remark;
    public String reqSn;
    public boolean showOnlyMeErrors;
    public String spreaderId;
    public String spuCode;
    public long startTime;
    public String status;
    public long systemTime;
    public String transType;
    public String unavailableReason;
    public String updateId;
    public long updateTime;
    public String useAccountType;
    public int useLimitType;

    public CouponItem() {
        this.layoutExpand = false;
        this.isUsable = true;
        this.available = true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f27363id);
        parcel.writeString(this.couponType);
        parcel.writeLong(this.nominaValue);
        parcel.writeLong(this.limitAmt);
        parcel.writeString(this.couponName);
        parcel.writeLong(this.createTime);
        parcel.writeLong(this.updateTime);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeInt(this.appSource);
        parcel.writeString(this.actName);
        parcel.writeString(this.actNo);
        parcel.writeInt(this.busRes);
        parcel.writeLong(this.consumeAmt);
        parcel.writeLong(this.consumeTime);
        parcel.writeString(this.couponCode);
        parcel.writeLong(this.couponId);
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
        parcel.writeByte(this.layoutExpand ? (byte) 1 : (byte) 0);
        parcel.writeString(this.limitStores);
        parcel.writeString(this.couponDesc);
        parcel.writeInt(this.useLimitType);
        parcel.writeString(this.qrCode);
        parcel.writeString(this.useAccountType);
        parcel.writeString(this.androidLinkUrl);
        parcel.writeByte(this.showOnlyMeErrors ? (byte) 1 : (byte) 0);
        parcel.writeString(this.couponIcon);
        parcel.writeInt(this.preferentialDays);
        parcel.writeInt(this.discountRate);
        parcel.writeString(this.remark);
        parcel.writeLong(this.systemTime);
        parcel.writeByte(this.available ? (byte) 1 : (byte) 0);
        parcel.writeString(this.unavailableReason);
    }

    public CouponItem(Parcel in) {
        this.layoutExpand = false;
        this.isUsable = true;
        this.available = true;
        this.f27363id = in.readString();
        this.couponType = in.readString();
        this.nominaValue = in.readLong();
        this.limitAmt = in.readLong();
        this.couponName = in.readString();
        this.createTime = in.readLong();
        this.updateTime = in.readLong();
        this.startTime = in.readLong();
        this.endTime = in.readLong();
        this.appSource = in.readInt();
        this.actName = in.readString();
        this.actNo = in.readString();
        this.busRes = in.readInt();
        this.consumeAmt = in.readLong();
        this.consumeTime = in.readLong();
        this.couponCode = in.readString();
        this.couponId = in.readLong();
        this.couponSubhead = in.readString();
        this.createId = in.readString();
        this.limtType = in.readString();
        this.orderNo = in.readString();
        this.reqSn = in.readString();
        this.spreaderId = in.readString();
        this.spuCode = in.readString();
        this.status = in.readString();
        this.transType = in.readString();
        this.updateId = in.readString();
        this.layoutExpand = in.readByte() != 0;
        this.limitStores = in.readString();
        this.couponDesc = in.readString();
        this.useLimitType = in.readInt();
        this.qrCode = in.readString();
        this.useAccountType = in.readString();
        this.androidLinkUrl = in.readString();
        this.showOnlyMeErrors = in.readByte() != 0;
        this.couponIcon = in.readString();
        this.preferentialDays = in.readInt();
        this.discountRate = in.readInt();
        this.remark = in.readString();
        this.systemTime = in.readLong();
        this.available = in.readByte() != 0;
        this.unavailableReason = in.readString();
    }
}
