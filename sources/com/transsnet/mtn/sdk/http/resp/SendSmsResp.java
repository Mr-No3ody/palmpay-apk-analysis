package com.transsnet.mtn.sdk.http.resp;

/* JADX INFO: loaded from: classes3.dex */
public class SendSmsResp extends CommonResult {
    public static final String STATUS_LOGIN_ID_INVALID = "00100007";
    public static final String STATUS_SEND_SUCCESS = "00000000";
    public DataBean data;

    public static class DataBean {
        public String statusCode;
        public String statusMessage;
    }

    public boolean isLoginInvalid() {
        DataBean dataBean = this.data;
        if (dataBean == null) {
            return false;
        }
        return STATUS_LOGIN_ID_INVALID.equals(dataBean.statusCode);
    }

    public boolean isSendOK() {
        DataBean dataBean = this.data;
        if (dataBean == null) {
            return false;
        }
        return "00000000".equals(dataBean.statusCode);
    }
}
