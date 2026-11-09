package com.transsnet.palmpay.core.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class CloseContactBeanV2 implements Parcelable {
    public static final Parcelable.Creator<CloseContactBeanV2> CREATOR = new Parcelable.Creator<CloseContactBeanV2>() { // from class: com.transsnet.palmpay.core.bean.CloseContactBeanV2.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CloseContactBeanV2 createFromParcel(Parcel source) {
            return new CloseContactBeanV2(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CloseContactBeanV2[] newArray(int size) {
            return new CloseContactBeanV2[size];
        }
    };
    public String accountId;
    public String billerId;
    public String billerName;
    public long businessAmount;
    public String businessType;
    public long createTime;
    public String customerId;
    public String fullName;
    public String icon;
    public String itemId;
    public String memberId;
    public boolean notEditable;
    public String paymentItemName;
    public String phone;
    public int relationship;
    public String relationshipPic;
    public List<RemindListBean> remindList;
    public int status;
    public String tag;
    public long updateTime;

    public CloseContactBeanV2(String phone, String tag) {
        this.relationship = -1;
        this.phone = phone;
        this.tag = tag;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel source) {
        this.accountId = source.readString();
        this.createTime = source.readLong();
        this.memberId = source.readString();
        this.phone = source.readString();
        this.status = source.readInt();
        this.tag = source.readString();
        this.customerId = source.readString();
        this.billerId = source.readString();
        this.itemId = source.readString();
        this.paymentItemName = source.readString();
        this.icon = source.readString();
        this.fullName = source.readString();
        this.billerName = source.readString();
        this.businessType = source.readString();
        this.updateTime = source.readLong();
        this.businessAmount = source.readLong();
        this.notEditable = source.readByte() != 0;
        this.remindList = source.createTypedArrayList(RemindListBean.CREATOR);
        this.relationship = source.readInt();
        this.relationshipPic = source.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.accountId);
        parcel.writeLong(this.createTime);
        parcel.writeString(this.memberId);
        parcel.writeString(this.phone);
        parcel.writeInt(this.status);
        parcel.writeString(this.tag);
        parcel.writeString(this.customerId);
        parcel.writeString(this.billerId);
        parcel.writeString(this.itemId);
        parcel.writeString(this.paymentItemName);
        parcel.writeString(this.icon);
        parcel.writeString(this.fullName);
        parcel.writeString(this.billerName);
        parcel.writeString(this.businessType);
        parcel.writeLong(this.updateTime);
        parcel.writeLong(this.businessAmount);
        parcel.writeByte(this.notEditable ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(this.remindList);
        parcel.writeInt(this.relationship);
        parcel.writeString(this.relationshipPic);
    }

    public CloseContactBeanV2(Parcel in) {
        this.relationship = -1;
        this.accountId = in.readString();
        this.createTime = in.readLong();
        this.memberId = in.readString();
        this.phone = in.readString();
        this.status = in.readInt();
        this.tag = in.readString();
        this.customerId = in.readString();
        this.billerId = in.readString();
        this.itemId = in.readString();
        this.paymentItemName = in.readString();
        this.icon = in.readString();
        this.fullName = in.readString();
        this.billerName = in.readString();
        this.businessType = in.readString();
        this.updateTime = in.readLong();
        this.businessAmount = in.readLong();
        this.notEditable = in.readByte() != 0;
        this.remindList = in.createTypedArrayList(RemindListBean.CREATOR);
        this.relationship = in.readInt();
        this.relationshipPic = in.readString();
    }
}
