package com.transsnet.palmpay.core.bean.req;

/* JADX INFO: loaded from: classes3.dex */
public class QueryCouponByConditionReq {
    private String businessPhone;
    private String customerId;
    private Long feePlusVat;
    private String institutionId;
    private Long orderAmt;
    private String orderId;
    private Long productId;
    private String transType;
    private String useAccountType;

    public String getBusinessPhone() {
        return this.businessPhone;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public long getFeePlusVat() {
        return this.feePlusVat.longValue();
    }

    public String getInstitutionId() {
        return this.institutionId;
    }

    public long getOrderAmt() {
        return this.orderAmt.longValue();
    }

    public String getOrderId() {
        return this.orderId;
    }

    public Long getProductId() {
        return this.productId;
    }

    public String getTransType() {
        return this.transType;
    }

    public String getUseAccountType() {
        return this.useAccountType;
    }

    public void setBusinessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setFeePlusVat(long feePlusVat) {
        this.feePlusVat = Long.valueOf(feePlusVat);
    }

    public void setInstitutionId(String institutionId) {
        this.institutionId = institutionId;
    }

    public void setOrderAmt(long orderAmt) {
        this.orderAmt = Long.valueOf(orderAmt);
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public void setUseAccountType(String useAccountType) {
        this.useAccountType = useAccountType;
    }
}
