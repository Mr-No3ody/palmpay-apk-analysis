package com.transsnet.palmpay.core.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.chad.library.adapter.base.entity.SectionEntity;

/* JADX INFO: loaded from: classes3.dex */
public class BankInfo implements Parcelable, SectionEntity, BaseData {
    public static int ACCOUNT_TYPE_OTHER = 2;
    public static int ACCOUNT_TYPE_PALMPAY = 1;
    public static final Parcelable.Creator<BankInfo> CREATOR = new Parcelable.Creator<BankInfo>() { // from class: com.transsnet.palmpay.core.bean.BankInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BankInfo createFromParcel(Parcel in) {
            return new BankInfo(in);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BankInfo[] newArray(int size) {
            return new BankInfo[size];
        }
    };
    public int accountType;
    public String bankCardNo;
    public String bankCode;
    public String bankDarkMark;
    public String bankMark;
    public String bankName;
    public String bankUrl;
    public String bgUrl;
    public String countryCode;
    public String indexType;
    public boolean isHeader = false;
    public String label;
    public int mmo;
    public String relationshipDarkPic;
    public String relationshipPic;

    public BankInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.chad.library.adapter.base.entity.SectionEntity, com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return this.isHeader ? -99 : -100;
    }

    @Override // com.chad.library.adapter.base.entity.SectionEntity
    public boolean isHeader() {
        return this.isHeader;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.bankCode);
        dest.writeString(this.bankName);
        dest.writeString(this.bankUrl);
        dest.writeString(this.bgUrl);
        dest.writeString(this.countryCode);
        dest.writeInt(this.mmo);
        dest.writeInt(this.accountType);
        dest.writeString(this.indexType);
        dest.writeString(this.bankCardNo);
        dest.writeString(this.bankMark);
        dest.writeString(this.bankDarkMark);
        dest.writeString(this.relationshipPic);
        dest.writeString(this.relationshipDarkPic);
        dest.writeString(this.label);
    }

    public BankInfo(Parcel in) {
        this.bankCode = in.readString();
        this.bankName = in.readString();
        this.bankUrl = in.readString();
        this.bgUrl = in.readString();
        this.countryCode = in.readString();
        this.mmo = in.readInt();
        this.accountType = in.readInt();
        this.indexType = in.readString();
        this.bankCardNo = in.readString();
        this.bankMark = in.readString();
        this.bankDarkMark = in.readString();
        this.relationshipPic = in.readString();
        this.relationshipDarkPic = in.readString();
        this.label = in.readString();
    }
}
