package com.transsnet.palmpay.core.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.annotations.Expose;
import com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean;
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.core.bean.rsp.OkCardPreCreditInfoRsp;

/* JADX INFO: loaded from: classes3.dex */
public class PaymentMethod extends CashierPaymentMethodBean implements BaseData {
    public static final Parcelable.Creator<PaymentMethod> CREATOR = new Parcelable.Creator<PaymentMethod>() { // from class: com.transsnet.palmpay.core.bean.PaymentMethod.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PaymentMethod createFromParcel(Parcel source) {
            return new PaymentMethod(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PaymentMethod[] newArray(int size) {
            return new PaymentMethod[size];
        }
    };
    public static final int FLAG_REUSEABLE = 1;
    public static final String TYPE_CASHBACK = "Cashback";
    public static final String TYPE_DISCOUNT = "Discount";
    public static final int UNREUSEABLE = 0;
    public int authFlag;

    @Expose(serialize = false)
    public PreviewPayInfoResp.DataBean calculationDto;
    public long discountAmount;
    public String discountType;
    public boolean installmentActiveGuide;
    public boolean installmentRaiseAmountEnable;
    public int isDefault;
    public int isNewAdded;

    @Expose(deserialize = false, serialize = false)
    public OkCardPreCreditInfoRsp mOkCardPreCreditInfo;
    public long payMentMethodsDiscount;
    public String phone;
    public String tipsColor;
    public String userName;
    public int verifyFlag;

    public PaymentMethod() {
        this.isNewAdded = 0;
    }

    @Override // com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean
    public boolean equals(Object obj) {
        if (!(obj instanceof PaymentMethod)) {
            return false;
        }
        PaymentMethod paymentMethod = (PaymentMethod) obj;
        int i7 = paymentMethod.payType;
        int i10 = this.payType;
        if (i7 != i10) {
            return false;
        }
        if (i10 == 1) {
            return this.accountId.equals(paymentMethod.accountId);
        }
        if (i10 == 2) {
            return this.cardNo.equals(paymentMethod.cardNo);
        }
        return false;
    }

    @Override // com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean
    public int hashCode() {
        return super.hashCode();
    }

    public boolean isCashback() {
        return TYPE_CASHBACK.equals(this.discountType);
    }

    public boolean isDiscount() {
        return TYPE_DISCOUNT.equals(this.discountType);
    }

    public boolean isHasDiscount() {
        return !TextUtils.isEmpty(this.discountType) && this.discountAmount > 0;
    }

    @Override // com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean
    public void readFromParcel(Parcel source) {
        super.readFromParcel(source);
        this.installmentActiveGuide = source.readByte() != 0;
        this.installmentRaiseAmountEnable = source.readByte() != 0;
        this.tipsColor = source.readString();
        this.userName = source.readString();
        this.authFlag = source.readInt();
        this.verifyFlag = source.readInt();
        this.discountType = source.readString();
        this.discountAmount = source.readLong();
        this.isDefault = source.readInt();
        this.isNewAdded = source.readInt();
        this.phone = source.readString();
        this.payMentMethodsDiscount = source.readLong();
    }

    @Override // com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeByte(this.installmentActiveGuide ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.installmentRaiseAmountEnable ? (byte) 1 : (byte) 0);
        parcel.writeString(this.tipsColor);
        parcel.writeString(this.userName);
        parcel.writeInt(this.authFlag);
        parcel.writeInt(this.verifyFlag);
        parcel.writeString(this.discountType);
        parcel.writeLong(this.discountAmount);
        parcel.writeInt(this.isDefault);
        parcel.writeInt(this.isNewAdded);
        parcel.writeString(this.phone);
        parcel.writeLong(this.payMentMethodsDiscount);
    }

    public PaymentMethod(Parcel in) {
        super(in);
        this.isNewAdded = 0;
        this.installmentActiveGuide = in.readByte() != 0;
        this.installmentRaiseAmountEnable = in.readByte() != 0;
        this.tipsColor = in.readString();
        this.userName = in.readString();
        this.authFlag = in.readInt();
        this.verifyFlag = in.readInt();
        this.discountType = in.readString();
        this.discountAmount = in.readLong();
        this.isDefault = in.readInt();
        this.isNewAdded = in.readInt();
        this.phone = in.readString();
        this.payMentMethodsDiscount = in.readLong();
    }
}
