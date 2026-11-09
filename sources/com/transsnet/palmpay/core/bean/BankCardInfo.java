package com.transsnet.palmpay.core.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class BankCardInfo implements Parcelable, BaseData {
    public static final Parcelable.Creator<BankCardInfo> CREATOR = new Parcelable.Creator<BankCardInfo>() { // from class: com.transsnet.palmpay.core.bean.BankCardInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BankCardInfo createFromParcel(Parcel in) {
            return new BankCardInfo(in);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BankCardInfo[] newArray(int size) {
            return new BankCardInfo[size];
        }
    };
    public String accessBank;
    public String accountId;
    public String accountType;
    public int authFlag;
    public String bankAccountNo;
    public String bankCode;
    public String bankName;
    public String bankUrl;
    public String cardNo;
    public String cardType;
    public String countryCode;
    public String currency;
    public String cvv;
    public int defaultCard;
    public String expiryMonth;
    public String expiryYear;
    public int isNewAdded;
    public String memberId;
    public int payeeAccountType;
    public String phone;
    public String remark;
    public String token;
    public String userName;
    public int verifyFlag;

    public BankCardInfo() {
        this.isNewAdded = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.accessBank);
        dest.writeString(this.cardNo);
        dest.writeString(this.bankAccountNo);
        dest.writeString(this.cardType);
        dest.writeString(this.countryCode);
        dest.writeString(this.currency);
        dest.writeString(this.cvv);
        dest.writeString(this.expiryMonth);
        dest.writeString(this.expiryYear);
        dest.writeString(this.memberId);
        dest.writeString(this.remark);
        dest.writeString(this.token);
        dest.writeString(this.accountId);
        dest.writeString(this.userName);
        dest.writeString(this.bankCode);
        dest.writeString(this.bankName);
        dest.writeString(this.bankUrl);
        dest.writeInt(this.defaultCard);
        dest.writeInt(this.payeeAccountType);
        dest.writeString(this.phone);
        dest.writeString(this.accountType);
        dest.writeInt(this.isNewAdded);
    }

    public BankCardInfo(Parcel in) {
        this.isNewAdded = 0;
        this.accessBank = in.readString();
        this.cardNo = in.readString();
        this.bankAccountNo = in.readString();
        this.cardType = in.readString();
        this.countryCode = in.readString();
        this.currency = in.readString();
        this.cvv = in.readString();
        this.expiryMonth = in.readString();
        this.expiryYear = in.readString();
        this.memberId = in.readString();
        this.remark = in.readString();
        this.token = in.readString();
        this.accountId = in.readString();
        this.userName = in.readString();
        this.bankCode = in.readString();
        this.bankName = in.readString();
        this.bankUrl = in.readString();
        this.defaultCard = in.readInt();
        this.payeeAccountType = in.readInt();
        this.phone = in.readString();
        this.accountType = in.readString();
        this.isNewAdded = in.readInt();
    }
}
