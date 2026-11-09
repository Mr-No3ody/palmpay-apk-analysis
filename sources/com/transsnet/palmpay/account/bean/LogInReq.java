package com.transsnet.palmpay.account.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class LogInReq extends SignUpInReq implements Parcelable {
    public static final Parcelable.Creator<LogInReq> CREATOR = new Parcelable.Creator<LogInReq>() { // from class: com.transsnet.palmpay.account.bean.LogInReq.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LogInReq createFromParcel(Parcel parcel) {
            return new LogInReq(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LogInReq[] newArray(int i7) {
            return new LogInReq[i7];
        }
    };
    public String loginName;
    public String loginPassword;
    public int pinType;
    public String riskPassType;

    public LogInReq() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.riskPassType);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.certificatesId);
        parcel.writeString(this.certificatesType);
        parcel.writeString(this.addressLine1);
        parcel.writeString(this.gender);
        parcel.writeString(this.birthday);
        parcel.writeString(this.appVersion);
        parcel.writeString(this.brand);
        parcel.writeString(this.countryCode);
        parcel.writeString(this.deviceInfo);
        parcel.writeString(this.deviceModel);
        parcel.writeString(this.deviceVersion);
        parcel.writeString(this.resolution);
        parcel.writeString(this.mobileNo);
        parcel.writeString(this.pin);
        parcel.writeString(this.smsToken);
        parcel.writeString(this.fcmToken);
        parcel.writeString(this.gaid);
        parcel.writeString(this.imei);
        parcel.writeByte(this.supplement ? (byte) 1 : (byte) 0);
        parcel.writeString(this.faceToken);
        parcel.writeString(this.loginName);
        parcel.writeInt(this.pinType);
        parcel.writeString(this.stateCode);
        parcel.writeString(this.stateName);
        parcel.writeString(this.areaCode);
        parcel.writeString(this.areaName);
        parcel.writeString(this.lgaCode);
        parcel.writeString(this.lgaName);
        parcel.writeString(this.street);
        parcel.writeString(this.loginPassword);
        parcel.writeString(this.industry);
        parcel.writeString(this.profession);
        parcel.writeString(this.sourceOfFunds);
        parcel.writeString(this.annualIncome);
        parcel.writeByte(this.politicallyExposedPerson ? (byte) 1 : (byte) 0);
        parcel.writeString(this.positionHeld);
        parcel.writeByte(this.currentPolitically ? (byte) 1 : (byte) 0);
        parcel.writeString(this.nationality);
    }

    public LogInReq(Parcel parcel) {
        this.riskPassType = parcel.readString();
        this.firstName = parcel.readString();
        this.lastName = parcel.readString();
        this.certificatesId = parcel.readString();
        this.certificatesType = parcel.readString();
        this.addressLine1 = parcel.readString();
        this.gender = parcel.readString();
        this.birthday = parcel.readString();
        this.appVersion = parcel.readString();
        this.brand = parcel.readString();
        this.countryCode = parcel.readString();
        this.deviceInfo = parcel.readString();
        this.deviceModel = parcel.readString();
        this.deviceVersion = parcel.readString();
        this.resolution = parcel.readString();
        this.mobileNo = parcel.readString();
        this.pin = parcel.readString();
        this.smsToken = parcel.readString();
        this.fcmToken = parcel.readString();
        this.gaid = parcel.readString();
        this.imei = parcel.readString();
        this.supplement = parcel.readByte() != 0;
        this.faceToken = parcel.readString();
        this.loginName = parcel.readString();
        this.pinType = parcel.readInt();
        this.stateCode = parcel.readString();
        this.stateName = parcel.readString();
        this.areaCode = parcel.readString();
        this.areaName = parcel.readString();
        this.lgaCode = parcel.readString();
        this.lgaName = parcel.readString();
        this.street = parcel.readString();
        this.loginPassword = parcel.readString();
        this.industry = parcel.readString();
        this.profession = parcel.readString();
        this.sourceOfFunds = parcel.readString();
        this.annualIncome = parcel.readString();
        this.politicallyExposedPerson = parcel.readByte() != 0;
        this.positionHeld = parcel.readString();
        this.currentPolitically = parcel.readByte() != 0;
        this.nationality = parcel.readString();
    }
}
