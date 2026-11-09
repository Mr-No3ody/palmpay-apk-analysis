package com.transsnet.palmpay.account.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class Tier3ApplyStatusRsp implements Parcelable {
    public static final Parcelable.Creator<Tier3ApplyStatusRsp> CREATOR = new Parcelable.Creator<Tier3ApplyStatusRsp>() { // from class: com.transsnet.palmpay.account.bean.Tier3ApplyStatusRsp.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Tier3ApplyStatusRsp createFromParcel(Parcel parcel) {
            return new Tier3ApplyStatusRsp(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Tier3ApplyStatusRsp[] newArray(int i7) {
            return new Tier3ApplyStatusRsp[i7];
        }
    };
    public String addressInMsg;
    public String addressMsg;
    public int approveStatus;
    public int approveStatusNew;
    public String areaCode;
    public String areaName;
    public ResultBannerBean bannerInfo;
    public String birthplace;
    public long createTime;
    public String homeAddress;
    public String homeAddressImg;
    public String houseNo;
    public String idImg;
    public String idNo;
    public String idType;
    public String jumpParams;
    public String jumpPath;
    public String jumpType;
    public String lgaCode;
    public String lgaName;
    public int ninStatus;
    public String passportImg;
    public List<ReasonsBean> reasons;
    public String stateCode;
    public String stateName;
    public String street;
    public String subMsg;
    public String titleMsg;
    public long updateTime;

    public static class ReasonsBean implements Parcelable {
        public static final Parcelable.Creator<ReasonsBean> CREATOR = new Parcelable.Creator<ReasonsBean>() { // from class: com.transsnet.palmpay.account.bean.Tier3ApplyStatusRsp.ReasonsBean.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ReasonsBean createFromParcel(Parcel parcel) {
                return new ReasonsBean(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ReasonsBean[] newArray(int i7) {
                return new ReasonsBean[i7];
            }
        };
        public String item;
        public String reason;

        public ReasonsBean() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.item);
            parcel.writeString(this.reason);
        }

        public ReasonsBean(Parcel parcel) {
            this.item = parcel.readString();
            this.reason = parcel.readString();
        }
    }

    public static class ResultBannerBean implements Parcelable {
        public static final Parcelable.Creator<ResultBannerBean> CREATOR = new Parcelable.Creator<ResultBannerBean>() { // from class: com.transsnet.palmpay.account.bean.Tier3ApplyStatusRsp.ResultBannerBean.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ResultBannerBean createFromParcel(Parcel parcel) {
                return new ResultBannerBean(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ResultBannerBean[] newArray(int i7) {
                return new ResultBannerBean[i7];
            }
        };
        public String buttonText;
        public String jumpPath;
        public String subMsg;
        public String titleMsg;
        public String transactionLimitDarkUrl;
        public String transactionLimitUrl;

        public ResultBannerBean() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.titleMsg);
            parcel.writeString(this.subMsg);
            parcel.writeString(this.buttonText);
            parcel.writeString(this.jumpPath);
            parcel.writeString(this.transactionLimitUrl);
            parcel.writeString(this.transactionLimitDarkUrl);
        }

        public ResultBannerBean(Parcel parcel) {
            this.titleMsg = parcel.readString();
            this.subMsg = parcel.readString();
            this.buttonText = parcel.readString();
            this.jumpPath = parcel.readString();
            this.transactionLimitUrl = parcel.readString();
            this.transactionLimitDarkUrl = parcel.readString();
        }
    }

    public Tier3ApplyStatusRsp() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isApplyFailed() {
        return this.approveStatus == 9997 || this.approveStatusNew == 3 || this.ninStatus == 2;
    }

    public void readFromParcel(Parcel parcel) {
        this.approveStatus = parcel.readInt();
        this.ninStatus = parcel.readInt();
        this.birthplace = parcel.readString();
        this.homeAddress = parcel.readString();
        this.homeAddressImg = parcel.readString();
        this.idImg = parcel.readString();
        this.idNo = parcel.readString();
        this.idType = parcel.readString();
        this.passportImg = parcel.readString();
        this.reasons = parcel.createTypedArrayList(ReasonsBean.CREATOR);
        this.createTime = parcel.readLong();
        this.updateTime = parcel.readLong();
        this.titleMsg = parcel.readString();
        this.subMsg = parcel.readString();
        this.stateCode = parcel.readString();
        this.stateName = parcel.readString();
        this.lgaCode = parcel.readString();
        this.lgaName = parcel.readString();
        this.areaCode = parcel.readString();
        this.areaName = parcel.readString();
        this.street = parcel.readString();
        this.houseNo = parcel.readString();
        this.addressMsg = parcel.readString();
        this.addressInMsg = parcel.readString();
        this.jumpType = parcel.readString();
        this.jumpPath = parcel.readString();
        this.jumpParams = parcel.readString();
        this.bannerInfo = (ResultBannerBean) parcel.readParcelable(ResultBannerBean.class.getClassLoader());
        this.approveStatusNew = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.approveStatus);
        parcel.writeInt(this.ninStatus);
        parcel.writeString(this.birthplace);
        parcel.writeString(this.homeAddress);
        parcel.writeString(this.homeAddressImg);
        parcel.writeString(this.idImg);
        parcel.writeString(this.idNo);
        parcel.writeString(this.idType);
        parcel.writeString(this.passportImg);
        parcel.writeTypedList(this.reasons);
        parcel.writeLong(this.createTime);
        parcel.writeLong(this.updateTime);
        parcel.writeString(this.titleMsg);
        parcel.writeString(this.subMsg);
        parcel.writeString(this.stateCode);
        parcel.writeString(this.stateName);
        parcel.writeString(this.lgaCode);
        parcel.writeString(this.lgaName);
        parcel.writeString(this.areaCode);
        parcel.writeString(this.areaName);
        parcel.writeString(this.street);
        parcel.writeString(this.houseNo);
        parcel.writeString(this.addressMsg);
        parcel.writeString(this.addressInMsg);
        parcel.writeString(this.jumpType);
        parcel.writeString(this.jumpPath);
        parcel.writeString(this.jumpParams);
        parcel.writeParcelable(this.bannerInfo, i7);
        parcel.writeInt(this.approveStatusNew);
    }

    public Tier3ApplyStatusRsp(Parcel parcel) {
        this.approveStatus = parcel.readInt();
        this.ninStatus = parcel.readInt();
        this.birthplace = parcel.readString();
        this.homeAddress = parcel.readString();
        this.homeAddressImg = parcel.readString();
        this.idImg = parcel.readString();
        this.idNo = parcel.readString();
        this.idType = parcel.readString();
        this.passportImg = parcel.readString();
        this.reasons = parcel.createTypedArrayList(ReasonsBean.CREATOR);
        this.createTime = parcel.readLong();
        this.updateTime = parcel.readLong();
        this.titleMsg = parcel.readString();
        this.subMsg = parcel.readString();
        this.stateCode = parcel.readString();
        this.stateName = parcel.readString();
        this.lgaCode = parcel.readString();
        this.lgaName = parcel.readString();
        this.areaCode = parcel.readString();
        this.areaName = parcel.readString();
        this.street = parcel.readString();
        this.houseNo = parcel.readString();
        this.addressMsg = parcel.readString();
        this.addressInMsg = parcel.readString();
        this.jumpType = parcel.readString();
        this.jumpPath = parcel.readString();
        this.jumpParams = parcel.readString();
        this.bannerInfo = (ResultBannerBean) parcel.readParcelable(ResultBannerBean.class.getClassLoader());
        this.approveStatusNew = parcel.readInt();
    }
}
