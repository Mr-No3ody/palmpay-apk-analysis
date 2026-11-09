package com.transsnet.palmpay.core.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes3.dex */
public class SmsActionRsp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        private String smsToken;

        public String getSmsToken() {
            return this.smsToken;
        }

        public void setSmsToken(String smsToken) {
            this.smsToken = smsToken;
        }
    }
}
