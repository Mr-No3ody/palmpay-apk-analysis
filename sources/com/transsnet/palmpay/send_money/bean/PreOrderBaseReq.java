package com.transsnet.palmpay.send_money.bean;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class PreOrderBaseReq implements Serializable {
    private String accountNo;
    private long amount;
    private int businessType;
    private String countryCode;
    private String currency;
    private long deductAmount;
    private long deductPoint;
    private String partnerAccountNo;
    private long payAmount;
    private long payFee;
    private long payeeAmount;
    private long payeeFee;
    private long payeeVat;
    private long platformFee;
    private long platformVat;
    private long redeemPoint;
    private String remark;
    private String seqId;
    private long vat;

    public String getAccountNo() {
        return this.accountNo;
    }

    public long getAmount() {
        return this.amount;
    }

    public int getBusinessTypeTemp() {
        return this.businessType;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getCurrency() {
        return this.currency;
    }

    public long getDeductAmount() {
        return this.deductAmount;
    }

    public long getDeductPoint() {
        return this.deductPoint;
    }

    public String getPartnerAccountNo() {
        return this.partnerAccountNo;
    }

    public long getPayAmount() {
        return this.payAmount;
    }

    public long getPayFee() {
        return this.payFee;
    }

    public long getPayeeAmount() {
        return this.payeeAmount;
    }

    public long getPayeeFee() {
        return this.payeeFee;
    }

    public long getPayeeVat() {
        return this.payeeVat;
    }

    public long getPlatformFee() {
        return this.platformFee;
    }

    public long getPlatformVat() {
        return this.platformVat;
    }

    public long getRedeemPoint() {
        return this.redeemPoint;
    }

    public String getRemark() {
        return this.remark;
    }

    public String getSeqId() {
        return this.seqId;
    }

    public long getVat() {
        return this.vat;
    }

    public void setAccountNo(String str) {
        this.accountNo = str;
    }

    public void setAmount(long j6) {
        this.amount = j6;
    }

    public void setBusinessTypeTemp(int i7) {
        this.businessType = i7;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public void setCurrency(String str) {
        this.currency = str;
    }

    public void setDeductAmount(long j6) {
        this.deductAmount = j6;
    }

    public void setDeductPoint(long j6) {
        this.deductPoint = j6;
    }

    public void setPartnerAccountNo(String str) {
        this.partnerAccountNo = str;
    }

    public void setPayAmount(long j6) {
        this.payAmount = j6;
    }

    public void setPayFee(long j6) {
        this.payFee = j6;
    }

    public void setPayeeAmount(long j6) {
        this.payeeAmount = j6;
    }

    public void setPayeeFee(long j6) {
        this.payeeFee = j6;
    }

    public void setPayeeVat(long j6) {
        this.payeeVat = j6;
    }

    public void setPlatformFee(long j6) {
        this.platformFee = j6;
    }

    public void setPlatformVat(long j6) {
        this.platformVat = j6;
    }

    public void setRedeemPoint(long j6) {
        this.redeemPoint = j6;
    }

    public void setRemark(String str) {
        this.remark = str;
    }

    public void setSeqId(String str) {
        this.seqId = str;
    }

    public void setVat(long j6) {
        this.vat = j6;
    }
}
