package com.transsnet.mtn.sdk.http.resp;

/* JADX INFO: loaded from: classes3.dex */
public class CommonResult {
    public static final String CODE_SUCCESS = "00000000";
    private String respCode = "00000000";
    private String respMsg;

    public String getRespCode() {
        return this.respCode;
    }

    public String getRespMsg() {
        return this.respMsg;
    }

    public boolean isSuccess() {
        return "00000000".equals(getRespCode());
    }

    public void setRespCode(String str) {
        this.respCode = str;
    }

    public void setRespMsg(String str) {
        this.respMsg = str;
    }

    public String toString() {
        return "respCode: " + this.respCode + " respMsg " + this.respMsg;
    }
}
