package com.transsnet.palmpay.main.export.bean.req;

/* JADX INFO: loaded from: classes4.dex */
public class MerchantOrderPreviewReq {
    private String countryCode;
    private String currency;
    private boolean isRedeemPoint;
    private String orderNo;
    private String payerAccountType;

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public String getPayerAccountType() {
        return this.payerAccountType;
    }

    public boolean isIsRedeemPoint() {
        return this.isRedeemPoint;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public void setCurrency(String str) {
        this.currency = str;
    }

    public void setIsRedeemPoint(boolean z3) {
        this.isRedeemPoint = z3;
    }

    public void setOrderNo(String str) {
        this.orderNo = str;
    }

    public void setPayerAccountType(String str) {
        this.payerAccountType = str;
    }
}
