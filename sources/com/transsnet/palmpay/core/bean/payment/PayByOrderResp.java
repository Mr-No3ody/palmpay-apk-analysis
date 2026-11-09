package com.transsnet.palmpay.core.bean.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes3.dex */
public class PayByOrderResp extends CommonResult {
    public static final int VERIFY_METHOD_PAY_WITH_USSD = 1;
    public static final int VERIFY_METHOD_PAY_WITH_USSD_BY_PUSH = 2;
    public static final int VERIFY_METHOD_PAY_WITH_USSD_NEW = 3;
    private DataBean data;

    public static class DataBean implements Parcelable {
        public static final Parcelable.Creator<DataBean> CREATOR = new Parcelable.Creator<DataBean>() { // from class: com.transsnet.palmpay.core.bean.payment.PayByOrderResp.DataBean.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public DataBean createFromParcel(Parcel source) {
                return new DataBean(source);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public DataBean[] newArray(int size) {
                return new DataBean[size];
            }
        };
        public String businessData;
        public String channelTransactionId;
        public String clientCfg;
        public String discountTips;
        public String errorMsg;
        public int extVerifyMethod;
        public boolean flag;
        public Boolean needPaymentRetry;
        public String orderData;
        public String orderNo;
        public String otpReference;
        public String payId;
        public String payRouteId;
        public int payStatus;
        public String payStatusDesc;
        public String paymentRetryToken;
        public long pendingAcTime;
        public String pendingAcTips;
        public String pendingCountdownAcTips;
        public String pendingDesc;
        public String promptMessage;
        public int queryMaxSec;
        public String riskTips;
        public boolean showPayAmount;
        public String subPayId;
        public String successfulDesc;
        public String token;
        public String transType;
        public String url;
        public int verifyMethod;
        public String verifyTransactionId;

        public DataBean() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void readFromParcel(Parcel source) {
            this.businessData = source.readString();
            this.orderData = source.readString();
            this.orderNo = source.readString();
            this.flag = source.readByte() != 0;
            this.payId = source.readString();
            this.subPayId = source.readString();
            this.verifyMethod = source.readInt();
            this.url = source.readString();
            this.payRouteId = source.readString();
            this.queryMaxSec = source.readInt();
            this.payStatus = source.readInt();
            this.payStatusDesc = source.readString();
            this.successfulDesc = source.readString();
            this.extVerifyMethod = source.readInt();
            this.otpReference = source.readString();
            this.errorMsg = source.readString();
            this.pendingAcTime = source.readLong();
            this.pendingAcTips = source.readString();
            this.discountTips = source.readString();
            this.pendingCountdownAcTips = source.readString();
            this.promptMessage = source.readString();
            this.channelTransactionId = source.readString();
            this.transType = source.readString();
            this.pendingDesc = source.readString();
            this.verifyTransactionId = source.readString();
            this.clientCfg = source.readString();
            this.showPayAmount = source.readByte() != 0;
            this.needPaymentRetry = (Boolean) source.readValue(Boolean.class.getClassLoader());
            this.paymentRetryToken = source.readString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.businessData);
            parcel.writeString(this.orderData);
            parcel.writeString(this.orderNo);
            parcel.writeByte(this.flag ? (byte) 1 : (byte) 0);
            parcel.writeString(this.payId);
            parcel.writeString(this.subPayId);
            parcel.writeInt(this.verifyMethod);
            parcel.writeString(this.url);
            parcel.writeString(this.payRouteId);
            parcel.writeInt(this.queryMaxSec);
            parcel.writeInt(this.payStatus);
            parcel.writeString(this.payStatusDesc);
            parcel.writeString(this.successfulDesc);
            parcel.writeInt(this.extVerifyMethod);
            parcel.writeString(this.otpReference);
            parcel.writeString(this.errorMsg);
            parcel.writeLong(this.pendingAcTime);
            parcel.writeString(this.pendingAcTips);
            parcel.writeString(this.discountTips);
            parcel.writeString(this.pendingCountdownAcTips);
            parcel.writeString(this.promptMessage);
            parcel.writeString(this.channelTransactionId);
            parcel.writeString(this.transType);
            parcel.writeString(this.pendingDesc);
            parcel.writeString(this.verifyTransactionId);
            parcel.writeString(this.clientCfg);
            parcel.writeByte(this.showPayAmount ? (byte) 1 : (byte) 0);
            parcel.writeValue(this.needPaymentRetry);
            parcel.writeString(this.paymentRetryToken);
        }

        public DataBean(Parcel in) {
            this.businessData = in.readString();
            this.orderData = in.readString();
            this.orderNo = in.readString();
            this.flag = in.readByte() != 0;
            this.payId = in.readString();
            this.subPayId = in.readString();
            this.verifyMethod = in.readInt();
            this.url = in.readString();
            this.payRouteId = in.readString();
            this.queryMaxSec = in.readInt();
            this.payStatus = in.readInt();
            this.payStatusDesc = in.readString();
            this.successfulDesc = in.readString();
            this.extVerifyMethod = in.readInt();
            this.otpReference = in.readString();
            this.errorMsg = in.readString();
            this.pendingAcTime = in.readLong();
            this.pendingAcTips = in.readString();
            this.discountTips = in.readString();
            this.pendingCountdownAcTips = in.readString();
            this.promptMessage = in.readString();
            this.channelTransactionId = in.readString();
            this.transType = in.readString();
            this.pendingDesc = in.readString();
            this.verifyTransactionId = in.readString();
            this.clientCfg = in.readString();
            this.showPayAmount = in.readByte() != 0;
            this.needPaymentRetry = (Boolean) in.readValue(Boolean.class.getClassLoader());
            this.paymentRetryToken = in.readString();
        }
    }

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }
}
