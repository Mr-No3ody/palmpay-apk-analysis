package com.transsnet.palmpay.account.bean.req;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class ApplyBalanceV2Req extends BaseUserInfoReq implements Parcelable {
    public static final Parcelable.Creator<ApplyBalanceV2Req> CREATOR = new Parcelable.Creator<ApplyBalanceV2Req>() { // from class: com.transsnet.palmpay.account.bean.req.ApplyBalanceV2Req.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ApplyBalanceV2Req createFromParcel(Parcel parcel) {
            return new ApplyBalanceV2Req(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ApplyBalanceV2Req[] newArray(int i7) {
            return new ApplyBalanceV2Req[i7];
        }
    };
    public String campaignContent;
    public String phone;
    public String temporaryToken;
    public String verifyToken;

    public ApplyBalanceV2Req(String str) {
        this.phone = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.phone = parcel.readString();
        this.verifyToken = parcel.readString();
        this.stateCode = parcel.readString();
        this.stateName = parcel.readString();
        this.areaCode = parcel.readString();
        this.areaName = parcel.readString();
        this.lgaCode = parcel.readString();
        this.lgaName = parcel.readString();
        this.street = parcel.readString();
        this.temporaryToken = parcel.readString();
        this.industry = parcel.readString();
        this.profession = parcel.readString();
        this.sourceOfFunds = parcel.readString();
        this.annualIncome = parcel.readString();
        this.politicallyExposedPerson = Boolean.valueOf(parcel.readByte() != 0);
        this.positionHeld = parcel.readString();
        this.currentPolitically = Boolean.valueOf(parcel.readByte() != 0);
        this.nationality = parcel.readString();
        this.campaignContent = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.phone);
        parcel.writeString(this.verifyToken);
        parcel.writeString(this.stateCode);
        parcel.writeString(this.stateName);
        parcel.writeString(this.areaCode);
        parcel.writeString(this.areaName);
        parcel.writeString(this.lgaCode);
        parcel.writeString(this.lgaName);
        parcel.writeString(this.street);
        parcel.writeString(this.temporaryToken);
        parcel.writeString(this.industry);
        parcel.writeString(this.profession);
        parcel.writeString(this.sourceOfFunds);
        parcel.writeString(this.annualIncome);
        parcel.writeByte(this.politicallyExposedPerson.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeString(this.positionHeld);
        parcel.writeByte(this.currentPolitically.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeString(this.nationality);
        parcel.writeString(this.campaignContent);
    }

    public ApplyBalanceV2Req(Parcel parcel) {
        this.phone = parcel.readString();
        this.verifyToken = parcel.readString();
        this.stateCode = parcel.readString();
        this.stateName = parcel.readString();
        this.areaCode = parcel.readString();
        this.areaName = parcel.readString();
        this.lgaCode = parcel.readString();
        this.lgaName = parcel.readString();
        this.street = parcel.readString();
        this.temporaryToken = parcel.readString();
        this.industry = parcel.readString();
        this.profession = parcel.readString();
        this.sourceOfFunds = parcel.readString();
        this.annualIncome = parcel.readString();
        this.politicallyExposedPerson = Boolean.valueOf(parcel.readByte() != 0);
        this.positionHeld = parcel.readString();
        this.currentPolitically = Boolean.valueOf(parcel.readByte() != 0);
        this.nationality = parcel.readString();
        this.campaignContent = parcel.readString();
    }
}
