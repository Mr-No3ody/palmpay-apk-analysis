package com.transsnet.palmpay.credit.bean.resp;

import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes4.dex */
public class SendMTNOTPResp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        public String code;
        public String statusCode;
        public String statusMessage;
    }

    public boolean isSendOK() {
        return "00000000".equals(this.data.statusCode);
    }
}
