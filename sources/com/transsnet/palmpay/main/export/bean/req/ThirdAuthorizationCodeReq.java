package com.transsnet.palmpay.main.export.bean.req;

/* JADX INFO: loaded from: classes4.dex */
public class ThirdAuthorizationCodeReq {
    public static final String SCOPE_TYPE_BASE = "snsapi_base";
    public static final String SCOPE_TYPE_SUPER = "snsapi_super";
    public static final String SCOPE_TYPE_USER_INFO = "snsapi_userinfo";
    private String appId;
    private String callbackID;
    private String env;
    private String merchantId;
    private String privateLevel;
    private String redirectUri;
    private String scope;

    public String getAppId() {
        return this.appId;
    }

    public String getCallbackID() {
        return this.callbackID;
    }

    public String getEnv() {
        return this.env;
    }

    public String getMerchantId() {
        return this.merchantId;
    }

    public String getPrivateLevel() {
        return this.privateLevel;
    }

    public String getRedirectUri() {
        return this.redirectUri;
    }

    public String getScope() {
        return this.scope;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setCallbackID(String str) {
        this.callbackID = str;
    }

    public void setEnv(String str) {
        this.env = str;
    }

    public void setMerchantId(String str) {
        this.merchantId = str;
    }

    public void setPrivateLevel(String str) {
        this.privateLevel = str;
    }

    public void setRedirectUri(String str) {
        this.redirectUri = str;
    }

    public void setScope(String str) {
        this.scope = str;
    }
}
