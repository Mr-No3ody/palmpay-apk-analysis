package com.transsnet.palmpay.account.bean.rsp;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class IdentityVerificationItem implements Parcelable {
    public static final Parcelable.Creator<IdentityVerificationItem> CREATOR = new Parcelable.Creator<IdentityVerificationItem>() { // from class: com.transsnet.palmpay.account.bean.rsp.IdentityVerificationItem.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IdentityVerificationItem createFromParcel(Parcel parcel) {
            return new IdentityVerificationItem(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IdentityVerificationItem[] newArray(int i7) {
            return new IdentityVerificationItem[i7];
        }
    };
    public int maxLength;
    public boolean needUserInformation;
    public boolean pass;
    public String regex;
    public String regexMsg;
    public String title;
    public int verifyType;

    public IdentityVerificationItem() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.title = parcel.readString();
        this.verifyType = parcel.readInt();
        this.needUserInformation = parcel.readByte() != 0;
        this.regex = parcel.readString();
        this.pass = parcel.readByte() != 0;
        this.regexMsg = parcel.readString();
        this.maxLength = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.title);
        parcel.writeInt(this.verifyType);
        parcel.writeByte(this.needUserInformation ? (byte) 1 : (byte) 0);
        parcel.writeString(this.regex);
        parcel.writeByte(this.pass ? (byte) 1 : (byte) 0);
        parcel.writeString(this.regexMsg);
        parcel.writeInt(this.maxLength);
    }

    public IdentityVerificationItem(Parcel parcel) {
        this.title = parcel.readString();
        this.verifyType = parcel.readInt();
        this.needUserInformation = parcel.readByte() != 0;
        this.regex = parcel.readString();
        this.pass = parcel.readByte() != 0;
        this.regexMsg = parcel.readString();
        this.maxLength = parcel.readInt();
    }
}
