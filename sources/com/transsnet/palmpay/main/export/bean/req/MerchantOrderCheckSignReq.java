package com.transsnet.palmpay.main.export.bean.req;

/* JADX INFO: loaded from: classes4.dex */
public class MerchantOrderCheckSignReq {
    private String appId;
    private String nonceStr;
    private String openId;
    private String orderNo;
    private String requestTime;
    private String sign;
    private String signType;

    public String getAppId() {
        return this.appId;
    }

    public String getNonceStr() {
        return this.nonceStr;
    }

    public String getOpenId() {
        return this.openId;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public String getRequestTime() {
        return this.requestTime;
    }

    public String getSign() {
        return this.sign;
    }

    public String getSignType() {
        return this.signType;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setNonceStr(String str) {
        this.nonceStr = str;
    }

    public void setOpenId(String str) {
        this.openId = str;
    }

    public void setOrderNo(String str) {
        this.orderNo = str;
    }

    public void setRequestTime(String str) {
        this.requestTime = str;
    }

    public void setSign(String str) {
        this.sign = str;
    }

    public void setSignType(String str) {
        this.signType = str;
    }
}
