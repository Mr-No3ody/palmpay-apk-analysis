package com.transsnet.palmpay.account.bean.req;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class CheckIdentifyReq extends AddUserExtraInfoReq implements Parcelable {
    public static final Parcelable.Creator<CheckIdentifyReq> CREATOR = new Parcelable.Creator<CheckIdentifyReq>() { // from class: com.transsnet.palmpay.account.bean.req.CheckIdentifyReq.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CheckIdentifyReq createFromParcel(Parcel parcel) {
            return new CheckIdentifyReq(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CheckIdentifyReq[] newArray(int i7) {
            return new CheckIdentifyReq[i7];
        }
    };
    public String bankCode;
    public boolean identityAuthen;
    public String phone;
    public String temporaryToken;

    public CheckIdentifyReq(String str) {
        this.phone = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.verifyType = Integer.valueOf(parcel.readInt());
        this.verifyNum = parcel.readString();
        this.bankCode = parcel.readString();
        this.phone = parcel.readString();
        this.faceToken = parcel.readString();
        this.firstName = parcel.readString();
        this.lastName = parcel.readString();
        this.middleName = parcel.readString();
        this.birthday = parcel.readString();
        this.gender = parcel.readString();
        this.identityAuthen = parcel.readByte() != 0;
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
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.verifyType.intValue());
        parcel.writeString(this.verifyNum);
        parcel.writeString(this.bankCode);
        parcel.writeString(this.phone);
        parcel.writeString(this.faceToken);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.middleName);
        parcel.writeString(this.birthday);
        parcel.writeString(this.gender);
        parcel.writeByte(this.identityAuthen ? (byte) 1 : (byte) 0);
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
    }

    public CheckIdentifyReq(Parcel parcel) {
        this.verifyType = Integer.valueOf(parcel.readInt());
        this.verifyNum = parcel.readString();
        this.bankCode = parcel.readString();
        this.phone = parcel.readString();
        this.faceToken = parcel.readString();
        this.firstName = parcel.readString();
        this.lastName = parcel.readString();
        this.middleName = parcel.readString();
        this.birthday = parcel.readString();
        this.gender = parcel.readString();
        this.identityAuthen = parcel.readByte() != 0;
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
    }
}
