package com.transsnet.palmpay.core.bean.req;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class AddBankAccSendOtpReq implements Parcelable {
    public static final Parcelable.Creator<AddBankAccSendOtpReq> CREATOR = new Parcelable.Creator<AddBankAccSendOtpReq>() { // from class: com.transsnet.palmpay.core.bean.req.AddBankAccSendOtpReq.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AddBankAccSendOtpReq createFromParcel(Parcel source) {
            return new AddBankAccSendOtpReq(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AddBankAccSendOtpReq[] newArray(int size) {
            return new AddBankAccSendOtpReq[size];
        }
    };
    public String accountNo;
    public String bankCode;
    public String birth;
    public String bvn;
    public String mobile;
    public String reference;

    public AddBankAccSendOtpReq() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.accountNo);
        dest.writeString(this.bankCode);
        dest.writeString(this.reference);
        dest.writeString(this.birth);
        dest.writeString(this.bvn);
        dest.writeString(this.mobile);
    }

    public AddBankAccSendOtpReq(Parcel in) {
        this.accountNo = in.readString();
        this.bankCode = in.readString();
        this.reference = in.readString();
        this.birth = in.readString();
        this.bvn = in.readString();
        this.mobile = in.readString();
    }
}
