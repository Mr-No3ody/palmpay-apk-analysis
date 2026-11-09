package com.transsnet.palmpay.main.export.bean.req;

/* JADX INFO: loaded from: classes4.dex */
public class MerchantOrderCompleteReq {
    private long loyaltyAmount;
    private long loyaltyPoint;
    private String mobileNo;
    private String orderNo;
    private long payAmount;
    private long payeeAmount;
    private long payeeFee;
    private long payeeVat;
    private long payerFee;
    private long payerVat;
    private long returnPoint;
    private long totalAmount;

    public long getLoyaltyAmount() {
        return this.loyaltyAmount;
    }

    public long getLoyaltyPoint() {
        return this.loyaltyPoint;
    }

    public String getMobileNo() {
        return this.mobileNo;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public long getPayAmount() {
        return this.payAmount;
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

    public long getPayerFee() {
        return this.payerFee;
    }

    public long getPayerVat() {
        return this.payerVat;
    }

    public long getReturnPoint() {
        return this.returnPoint;
    }

    public long getTotalAmount() {
        return this.totalAmount;
    }

    public void setLoyaltyAmount(long j6) {
        this.loyaltyAmount = j6;
    }

    public void setLoyaltyPoint(long j6) {
        this.loyaltyPoint = j6;
    }

    public void setMobileNo(String str) {
        this.mobileNo = str;
    }

    public void setOrderNo(String str) {
        this.orderNo = str;
    }

    public void setPayAmount(long j6) {
        this.payAmount = j6;
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

    public void setPayerFee(long j6) {
        this.payerFee = j6;
    }

    public void setPayerVat(long j6) {
        this.payerVat = j6;
    }

    public void setReturnPoint(long j6) {
        this.returnPoint = j6;
    }

    public void setTotalAmount(long j6) {
        this.totalAmount = j6;
    }
}
