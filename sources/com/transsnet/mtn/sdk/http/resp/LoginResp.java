package com.transsnet.mtn.sdk.http.resp;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class LoginResp extends CommonResult {
    public static final String STATUS_CODE_AUTH_DEVICE = "00100001";
    public static final String STATUS_SUCCESS = "00000000";
    public DataBean data;

    public static class DataBean {
        public List<String> authorizationType;
        public String statusCode;
        public String statusMessage;
        public String transactionFlowUrl;
        public String userId;
    }

    public boolean isLoginOK() {
        DataBean dataBean = this.data;
        return dataBean != null && "00000000".equals(dataBean.statusCode);
    }

    public boolean isNeedActivateDevice() {
        return true;
    }

    public boolean isNeedAuthDevice() {
        DataBean dataBean = this.data;
        return dataBean != null && STATUS_CODE_AUTH_DEVICE.equals(dataBean.statusCode);
    }
}
