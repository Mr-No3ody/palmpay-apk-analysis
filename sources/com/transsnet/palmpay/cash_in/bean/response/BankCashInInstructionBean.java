package com.transsnet.palmpay.cash_in.bean.response;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class BankCashInInstructionBean implements Parcelable {
    public static final Parcelable.Creator<BankCashInInstructionBean> CREATOR = new Parcelable.Creator<BankCashInInstructionBean>() { // from class: com.transsnet.palmpay.cash_in.bean.response.BankCashInInstructionBean.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BankCashInInstructionBean createFromParcel(Parcel parcel) {
            return new BankCashInInstructionBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BankCashInInstructionBean[] newArray(int i7) {
            return new BankCashInInstructionBean[i7];
        }
    };
    public String appUrl;
    public String bankBackground;
    public String bankIcon1;
    public String bankIcon2;
    public InstructionTextItem bankName;
    public InstructionTextItem text1;

    public BankCashInInstructionBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.bankBackground);
        parcel.writeString(this.bankIcon1);
        parcel.writeString(this.bankIcon2);
        parcel.writeParcelable(this.bankName, i7);
        parcel.writeParcelable(this.text1, i7);
        parcel.writeString(this.appUrl);
    }

    public BankCashInInstructionBean(Parcel parcel) {
        this.bankBackground = parcel.readString();
        this.bankIcon1 = parcel.readString();
        this.bankIcon2 = parcel.readString();
        this.bankName = (InstructionTextItem) parcel.readParcelable(InstructionTextItem.class.getClassLoader());
        this.text1 = (InstructionTextItem) parcel.readParcelable(InstructionTextItem.class.getClassLoader());
        this.appUrl = parcel.readString();
    }
}
