package com.transsnet.palmpay.teller.bean;

/* JADX INFO: loaded from: classes4.dex */
public class QtQuotaCheckReq {
    private Long businessAmount;
    private String customerId;
    private Integer payerAccountType;
    private String snNo;
    private String transType;

    public Long getBusinessAmount() {
        return this.businessAmount;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public Integer getPayerAccountType() {
        return this.payerAccountType;
    }

    public String getSnNo() {
        return this.snNo;
    }

    public String getTransType() {
        return this.transType;
    }

    public void setBusinessAmount(Long l5) {
        this.businessAmount = l5;
    }

    public void setCustomerId(String str) {
        this.customerId = str;
    }

    public void setPayerAccountType(Integer num) {
        this.payerAccountType = num;
    }

    public void setSnNo(String str) {
        this.snNo = str;
    }

    public void setTransType(String str) {
        this.transType = str;
    }
}
