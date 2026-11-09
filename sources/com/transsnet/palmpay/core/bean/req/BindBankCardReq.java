package com.transsnet.palmpay.core.bean.req;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class BindBankCardReq implements Parcelable {
    public static final Parcelable.Creator<BindBankCardReq> CREATOR = new Parcelable.Creator<BindBankCardReq>() { // from class: com.transsnet.palmpay.core.bean.req.BindBankCardReq.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BindBankCardReq createFromParcel(Parcel source) {
            return new BindBankCardReq(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BindBankCardReq[] newArray(int size) {
            return new BindBankCardReq[size];
        }
    };
    public int bankCardStatus;
    public String bankCode;
    public String bankName;
    public String bankUrl;
    public int cardBusinessType;
    public String cardCvv;
    public String cardExpiryMon;
    public String cardExpiryYear;
    public String cardNo;
    public String cardPin;
    public int source;

    public BindBankCardReq() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.cardNo);
        dest.writeString(this.cardPin);
        dest.writeString(this.cardCvv);
        dest.writeString(this.cardExpiryMon);
        dest.writeString(this.cardExpiryYear);
        dest.writeString(this.bankCode);
        dest.writeString(this.bankName);
        dest.writeString(this.bankUrl);
        dest.writeInt(this.bankCardStatus);
        dest.writeInt(this.source);
        dest.writeInt(this.cardBusinessType);
    }

    public BindBankCardReq(Parcel in) {
        this.cardNo = in.readString();
        this.cardPin = in.readString();
        this.cardCvv = in.readString();
        this.cardExpiryMon = in.readString();
        this.cardExpiryYear = in.readString();
        this.bankCode = in.readString();
        this.bankName = in.readString();
        this.bankUrl = in.readString();
        this.bankCardStatus = in.readInt();
        this.source = in.readInt();
        this.cardBusinessType = in.readInt();
    }
}
