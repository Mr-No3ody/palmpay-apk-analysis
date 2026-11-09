package com.transsnet.palmpay.core.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.transsnet.palmpay.util.TimeUtils;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class LinkBankCardResp extends CommonResult {
    public static final int DEFAULT_CARD = 1;
    public static final int REUSEABLE_FLAG = 1;
    public static final int UNDEFAULT_CARD = 0;
    public static final int UNREUSEABLE_FLAG = 0;
    private List<LinkBankCard> data;

    public List<LinkBankCard> getData() {
        return this.data;
    }

    public void setData(List<LinkBankCard> data) {
        this.data = data;
    }

    public static class LinkBankCard implements Parcelable {
        public static final Parcelable.Creator<LinkBankCard> CREATOR = new Parcelable.Creator<LinkBankCard>() { // from class: com.transsnet.palmpay.core.bean.LinkBankCardResp.LinkBankCard.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LinkBankCard createFromParcel(Parcel source) {
                return new LinkBankCard(source);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LinkBankCard[] newArray(int size) {
                return new LinkBankCard[size];
            }
        };
        private String accountId;

        @SerializedName("accountStauts")
        public int accountStatus;
        private String bankCardNoDesensitize;
        public int bankCardStatus;
        private String bankCardStatusDesc;
        private String bankCode;
        private String bankName;
        private String bankUrl;
        private String bgNewUrl;
        private String bgUrl;
        private String cardNo;
        private String cardType;
        private String countryCode;
        private String createTime;
        private String currency;
        private String cvv;
        private int defaultCard;
        private int defaultPayFlag;
        private String expiryMonth;
        private String expiryYear;
        private boolean isShow = false;
        private String memberId;
        private String orderId;
        private int reUseable;
        private String remark;
        private String token;

        public LinkBankCard() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getAccountId() {
            return this.accountId;
        }

        public int getAccountStatus() {
            return this.accountStatus;
        }

        public String getBankCardNoDesensitize() {
            return this.bankCardNoDesensitize;
        }

        public int getBankCardStatus() {
            return this.bankCardStatus;
        }

        public String getBankCardStatusDesc() {
            return this.bankCardStatusDesc;
        }

        public String getBankCode() {
            return this.bankCode;
        }

        public String getBankName() {
            return this.bankName;
        }

        public String getBankUrl() {
            return this.bankUrl;
        }

        public String getBgNewUrl() {
            return this.bgNewUrl;
        }

        public String getBgUrl() {
            return this.bgUrl;
        }

        public String getCardNo() {
            return this.cardNo;
        }

        public String getCardType() {
            return this.cardType;
        }

        public String getCountryCode() {
            return this.countryCode;
        }

        public String getCreateTime() {
            return this.createTime;
        }

        public String getCurrency() {
            return this.currency;
        }

        public String getCvv() {
            return this.cvv;
        }

        public int getDefaultCard() {
            return this.defaultCard;
        }

        public int getDefaultPayFlag() {
            return this.defaultPayFlag;
        }

        public String getExpiryMonth() {
            return this.expiryMonth;
        }

        public String getExpiryYear() {
            return this.expiryYear;
        }

        public String getMemberId() {
            return this.memberId;
        }

        public String getOrderId() {
            return this.orderId;
        }

        public int getReUseable() {
            return this.reUseable;
        }

        public String getRemark() {
            return this.remark;
        }

        public String getToken() {
            return this.token;
        }

        public boolean isDefaultPaymentCard() {
            return this.defaultPayFlag == 1;
        }

        public boolean isExpired() {
            if (!TextUtils.isEmpty(this.expiryMonth) && !TextUtils.isEmpty(this.expiryYear)) {
                try {
                    return TimeUtils.checkDateBeforeNow(Integer.parseInt(this.expiryYear), Integer.parseInt(this.expiryMonth));
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            return false;
        }

        public boolean isShow() {
            return this.isShow;
        }

        public boolean isVirtualCard() {
            return "VisaAccount".equals(this.cardType);
        }

        public void setAccountId(String accountId) {
            this.accountId = accountId;
        }

        public void setAccountStatus(int accountStatus) {
            this.accountStatus = accountStatus;
        }

        public void setBankCardNoDesensitize(String bankCardNoDesensitize) {
            this.bankCardNoDesensitize = bankCardNoDesensitize;
        }

        public void setBankCardStatus(int bankCardStatus) {
            this.bankCardStatus = bankCardStatus;
        }

        public void setBankCardStatusDesc(String bankCardStatusDesc) {
            this.bankCardStatusDesc = bankCardStatusDesc;
        }

        public void setBankCode(String bankCode) {
            this.bankCode = bankCode;
        }

        public void setBankName(String bankName) {
            this.bankName = bankName;
        }

        public void setBankUrl(String bankUrl) {
            this.bankUrl = bankUrl;
        }

        public void setBgNewUrl(String bgNewUrl) {
            this.bgNewUrl = bgNewUrl;
        }

        public void setBgUrl(String bgUrl) {
            this.bgUrl = bgUrl;
        }

        public void setCardNo(String cardNo) {
            this.cardNo = cardNo;
        }

        public void setCardType(String cardType) {
            this.cardType = cardType;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public void setCvv(String cvv) {
            this.cvv = cvv;
        }

        public void setDefaultCard(int defaultCard) {
            this.defaultCard = defaultCard;
        }

        public void setDefaultPayFlag(int defaultPayFlag) {
            this.defaultPayFlag = defaultPayFlag;
        }

        public void setExpiryMonth(String expiryMonth) {
            this.expiryMonth = expiryMonth;
        }

        public void setExpiryYear(String expiryYear) {
            this.expiryYear = expiryYear;
        }

        public void setMemberId(String memberId) {
            this.memberId = memberId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public void setReUseable(int reUseable) {
            this.reUseable = reUseable;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public void setShow(boolean show) {
            this.isShow = show;
        }

        public void setToken(String token) {
            this.token = token;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.accountId);
            dest.writeInt(this.accountStatus);
            dest.writeString(this.bankCode);
            dest.writeString(this.bankName);
            dest.writeString(this.bankUrl);
            dest.writeString(this.cardNo);
            dest.writeString(this.cardType);
            dest.writeString(this.countryCode);
            dest.writeString(this.createTime);
            dest.writeString(this.currency);
            dest.writeString(this.cvv);
            dest.writeInt(this.defaultCard);
            dest.writeInt(this.defaultPayFlag);
            dest.writeString(this.expiryMonth);
            dest.writeString(this.expiryYear);
            dest.writeString(this.memberId);
            dest.writeInt(this.reUseable);
            dest.writeString(this.remark);
            dest.writeString(this.token);
            dest.writeString(this.bgUrl);
            dest.writeString(this.bankCardStatusDesc);
        }

        public LinkBankCard(Parcel in) {
            this.accountId = in.readString();
            this.accountStatus = in.readInt();
            this.bankCode = in.readString();
            this.bankName = in.readString();
            this.bankUrl = in.readString();
            this.cardNo = in.readString();
            this.cardType = in.readString();
            this.countryCode = in.readString();
            this.createTime = in.readString();
            this.currency = in.readString();
            this.cvv = in.readString();
            this.defaultCard = in.readInt();
            this.defaultPayFlag = in.readInt();
            this.expiryMonth = in.readString();
            this.expiryYear = in.readString();
            this.memberId = in.readString();
            this.reUseable = in.readInt();
            this.remark = in.readString();
            this.token = in.readString();
            this.bgUrl = in.readString();
            this.bankCardStatusDesc = in.readString();
        }
    }
}
