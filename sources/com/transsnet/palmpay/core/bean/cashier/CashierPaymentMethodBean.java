package com.transsnet.palmpay.core.bean.cashier;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class CashierPaymentMethodBean implements Parcelable {
    public static final Parcelable.Creator<CashierPaymentMethodBean> CREATOR = new Parcelable.Creator<CashierPaymentMethodBean>() { // from class: com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CashierPaymentMethodBean createFromParcel(Parcel source) {
            return new CashierPaymentMethodBean(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CashierPaymentMethodBean[] newArray(int size) {
            return new CashierPaymentMethodBean[size];
        }
    };
    public static final int ITEM_VIEW_TYPE_COMBINATION = 35;
    public static final int ITEM_VIEW_TYPE_FLEXI_GUIDE = 34;
    public static final int ITEM_VIEW_TYPE_NORMAL = 33;
    public String acTips;
    public String accountId;
    public int accountStatus;
    public long availableBalance;
    public String bankAccountNo;
    public String bankCode;
    public String bankName;
    public String bankUrl;
    public String cardNo;
    public String cardPin;
    public String cardType;
    public String countryCode;
    public String currency;
    public String cvv;
    public boolean defaultMethodFlag;
    public int defaultPayFlag;
    public boolean enable;
    public boolean expiryFlag;
    public String expiryMonth;
    public String expiryYear;
    public int itemViewType;
    public String logoUrl;
    public String memberId;
    public boolean needSign;
    public String okcardTips;
    public String partnerAccNo;
    public String partnerBankCode;
    public int payType;
    public long paymentMethodsDiscount;
    public int reUseable;
    public String remark;
    public long reservedBalance;
    public int senderAccountType;
    public boolean showInPreview;
    public String showName;
    public String tips;
    public String token;
    public long unclearedBalance;

    public CashierPaymentMethodBean() {
        this.showInPreview = false;
        this.itemViewType = 33;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CashierPaymentMethodBean)) {
            return false;
        }
        CashierPaymentMethodBean cashierPaymentMethodBean = (CashierPaymentMethodBean) obj;
        int i7 = cashierPaymentMethodBean.payType;
        int i10 = this.payType;
        if (i7 != i10) {
            return false;
        }
        if (i10 == 1) {
            return this.accountId.equals(cashierPaymentMethodBean.accountId);
        }
        if (i10 == 2) {
            return this.cardNo.equals(cashierPaymentMethodBean.cardNo);
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    @NotNull
    public boolean isSelfMethod() {
        int i7 = this.senderAccountType;
        return i7 == 1 || i7 == 40 || i7 == 28 || this.payType == 36;
    }

    public void readFromParcel(Parcel source) {
        this.accountId = source.readString();
        this.accountStatus = source.readInt();
        this.availableBalance = source.readLong();
        this.cardNo = source.readString();
        this.cardType = source.readString();
        this.countryCode = source.readString();
        this.currency = source.readString();
        this.cvv = source.readString();
        this.cardPin = source.readString();
        this.expiryMonth = source.readString();
        this.expiryYear = source.readString();
        this.memberId = source.readString();
        this.partnerAccNo = source.readString();
        this.partnerBankCode = source.readString();
        this.remark = source.readString();
        this.bankName = source.readString();
        this.bankUrl = source.readString();
        this.bankCode = source.readString();
        this.reservedBalance = source.readLong();
        this.senderAccountType = source.readInt();
        this.token = source.readString();
        this.unclearedBalance = source.readLong();
        this.payType = source.readInt();
        this.reUseable = source.readInt();
        this.bankAccountNo = source.readString();
        this.defaultPayFlag = source.readInt();
        this.enable = source.readByte() != 0;
        this.tips = source.readString();
        this.acTips = source.readString();
        this.okcardTips = source.readString();
        this.paymentMethodsDiscount = source.readLong();
        this.expiryFlag = source.readByte() != 0;
        this.needSign = source.readByte() != 0;
        this.defaultMethodFlag = source.readByte() != 0;
        this.showInPreview = source.readByte() != 0;
        this.showName = source.readString();
        this.logoUrl = source.readString();
        this.itemViewType = source.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.accountId);
        parcel.writeInt(this.accountStatus);
        parcel.writeLong(this.availableBalance);
        parcel.writeString(this.cardNo);
        parcel.writeString(this.cardType);
        parcel.writeString(this.countryCode);
        parcel.writeString(this.currency);
        parcel.writeString(this.cvv);
        parcel.writeString(this.cardPin);
        parcel.writeString(this.expiryMonth);
        parcel.writeString(this.expiryYear);
        parcel.writeString(this.memberId);
        parcel.writeString(this.partnerAccNo);
        parcel.writeString(this.partnerBankCode);
        parcel.writeString(this.remark);
        parcel.writeString(this.bankName);
        parcel.writeString(this.bankUrl);
        parcel.writeString(this.bankCode);
        parcel.writeLong(this.reservedBalance);
        parcel.writeInt(this.senderAccountType);
        parcel.writeString(this.token);
        parcel.writeLong(this.unclearedBalance);
        parcel.writeInt(this.payType);
        parcel.writeInt(this.reUseable);
        parcel.writeString(this.bankAccountNo);
        parcel.writeInt(this.defaultPayFlag);
        parcel.writeByte(this.enable ? (byte) 1 : (byte) 0);
        parcel.writeString(this.tips);
        parcel.writeString(this.acTips);
        parcel.writeString(this.okcardTips);
        parcel.writeLong(this.paymentMethodsDiscount);
        parcel.writeByte(this.expiryFlag ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.needSign ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.defaultMethodFlag ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.showInPreview ? (byte) 1 : (byte) 0);
        parcel.writeString(this.showName);
        parcel.writeString(this.logoUrl);
        parcel.writeInt(this.itemViewType);
    }

    public CashierPaymentMethodBean(Parcel in) {
        this.showInPreview = false;
        this.itemViewType = 33;
        this.accountId = in.readString();
        this.accountStatus = in.readInt();
        this.availableBalance = in.readLong();
        this.cardNo = in.readString();
        this.cardType = in.readString();
        this.countryCode = in.readString();
        this.currency = in.readString();
        this.cvv = in.readString();
        this.cardPin = in.readString();
        this.expiryMonth = in.readString();
        this.expiryYear = in.readString();
        this.memberId = in.readString();
        this.partnerAccNo = in.readString();
        this.partnerBankCode = in.readString();
        this.remark = in.readString();
        this.bankName = in.readString();
        this.bankUrl = in.readString();
        this.bankCode = in.readString();
        this.reservedBalance = in.readLong();
        this.senderAccountType = in.readInt();
        this.token = in.readString();
        this.unclearedBalance = in.readLong();
        this.payType = in.readInt();
        this.reUseable = in.readInt();
        this.bankAccountNo = in.readString();
        this.defaultPayFlag = in.readInt();
        this.enable = in.readByte() != 0;
        this.tips = in.readString();
        this.acTips = in.readString();
        this.okcardTips = in.readString();
        this.paymentMethodsDiscount = in.readLong();
        this.expiryFlag = in.readByte() != 0;
        this.needSign = in.readByte() != 0;
        this.defaultMethodFlag = in.readByte() != 0;
        this.showInPreview = in.readByte() != 0;
        this.showName = in.readString();
        this.logoUrl = in.readString();
        this.itemViewType = in.readInt();
    }
}
