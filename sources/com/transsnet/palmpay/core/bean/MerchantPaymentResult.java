package com.transsnet.palmpay.core.bean;

/* JADX INFO: loaded from: classes3.dex */
public class MerchantPaymentResult {
    private int extVerifyMethod;
    private String orderDesc;
    private String orderNo;
    private Integer orderStatus;
    private String payId;
    private Integer payStatus;
    private String payerWalletChannel;
    private String subPayId;
    private String url;
    private String verifyCode;
    private Integer verifyMethod;

    public int getExtVerifyMethod() {
        return this.extVerifyMethod;
    }

    public String getOrderDesc() {
        return this.orderDesc;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public Integer getOrderStatus() {
        return this.orderStatus;
    }

    public String getPayId() {
        return this.payId;
    }

    public Integer getPayStatus() {
        return this.payStatus;
    }

    public String getPayerWalletChannel() {
        return this.payerWalletChannel;
    }

    public String getSubPayId() {
        return this.subPayId;
    }

    public String getUrl() {
        return this.url;
    }

    public String getVerifyCode() {
        return this.verifyCode;
    }

    public Integer getVerifyMethod() {
        return this.verifyMethod;
    }

    public void setExtVerifyMethod(int extVerifyMethod) {
        this.extVerifyMethod = extVerifyMethod;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public void setPayerWalletChannel(String payerWalletChannel) {
        this.payerWalletChannel = payerWalletChannel;
    }

    public void setSubPayId(String subPayId) {
        this.subPayId = subPayId;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public void setVerifyMethod(Integer verifyMethod) {
        this.verifyMethod = verifyMethod;
    }
}
