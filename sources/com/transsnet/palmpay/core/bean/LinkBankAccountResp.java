package com.transsnet.palmpay.core.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class LinkBankAccountResp extends CommonResult {
    private List<LinkBankAccount> data;

    public static class LinkBankAccount implements Parcelable {
        public static final Parcelable.Creator<LinkBankAccount> CREATOR = new Parcelable.Creator<LinkBankAccount>() { // from class: com.transsnet.palmpay.core.bean.LinkBankAccountResp.LinkBankAccount.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LinkBankAccount createFromParcel(Parcel source) {
                return new LinkBankAccount(source);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LinkBankAccount[] newArray(int size) {
                return new LinkBankAccount[size];
            }
        };
        private int authFlag;
        private String bankAccountNo;
        private String bankCode;
        private String bankName;
        private String bankUrl;
        private String bgUrl;
        private String createTime;
        private int defaultPayFlag;
        private String memberId;
        private int payeeAccountType;
        private String phone;
        private String remark;
        private int supportType;
        private String updateTime;
        private String userName;
        private int verifyFlag;

        public LinkBankAccount() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public int getAuthFlag() {
            return this.authFlag;
        }

        public String getBankAccountNo() {
            return this.bankAccountNo;
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

        public String getBgUrl() {
            return this.bgUrl;
        }

        public String getCreateTime() {
            return this.createTime;
        }

        public int getDefaultPayFlag() {
            return this.defaultPayFlag;
        }

        public String getMemberId() {
            return this.memberId;
        }

        public int getPayeeAccountType() {
            return this.payeeAccountType;
        }

        public String getPhone() {
            return this.phone;
        }

        public String getRemark() {
            return this.remark;
        }

        public int getSupportType() {
            return this.supportType;
        }

        public String getUpdateTime() {
            return this.updateTime;
        }

        public String getUserName() {
            return this.userName;
        }

        public int getVerifyFlag() {
            return this.verifyFlag;
        }

        public boolean isDefaultPaymentCard() {
            return this.defaultPayFlag == 1;
        }

        public void setAuthFlag(int authFlag) {
            this.authFlag = authFlag;
        }

        public void setBankAccountNo(String bankAccountNo) {
            this.bankAccountNo = bankAccountNo;
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

        public void setBgUrl(String bgUrl) {
            this.bgUrl = bgUrl;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public void setDefaultPayFlag(int defaultPayFlag) {
            this.defaultPayFlag = defaultPayFlag;
        }

        public void setMemberId(String memberId) {
            this.memberId = memberId;
        }

        public void setPayeeAccountType(int payeeAccountType) {
            this.payeeAccountType = payeeAccountType;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public void setSupportType(int supportType) {
            this.supportType = supportType;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public void setVerifyFlag(int verifyFlag) {
            this.verifyFlag = verifyFlag;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.bankAccountNo);
            dest.writeString(this.bankCode);
            dest.writeString(this.bankName);
            dest.writeString(this.bankUrl);
            dest.writeString(this.createTime);
            dest.writeString(this.memberId);
            dest.writeInt(this.payeeAccountType);
            dest.writeString(this.phone);
            dest.writeString(this.remark);
            dest.writeString(this.updateTime);
            dest.writeString(this.userName);
            dest.writeString(this.bgUrl);
            dest.writeInt(this.defaultPayFlag);
            dest.writeInt(this.authFlag);
            dest.writeInt(this.verifyFlag);
            dest.writeInt(this.supportType);
        }

        public LinkBankAccount(Parcel in) {
            this.bankAccountNo = in.readString();
            this.bankCode = in.readString();
            this.bankName = in.readString();
            this.bankUrl = in.readString();
            this.createTime = in.readString();
            this.memberId = in.readString();
            this.payeeAccountType = in.readInt();
            this.phone = in.readString();
            this.remark = in.readString();
            this.updateTime = in.readString();
            this.userName = in.readString();
            this.bgUrl = in.readString();
            this.defaultPayFlag = in.readInt();
            this.authFlag = in.readInt();
            this.verifyFlag = in.readInt();
            this.supportType = in.readInt();
        }
    }

    public List<LinkBankAccount> getData() {
        return this.data;
    }

    public void setData(List<LinkBankAccount> data) {
        this.data = data;
    }
}
