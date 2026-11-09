package com.transsnet.palmpay.account.bean;

import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes3.dex */
public class SmsActionRsp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        private int effectiveSeconds;
        private String smsToken;

        public int getEffectiveSeconds() {
            return this.effectiveSeconds;
        }

        public String getSmsToken() {
            return this.smsToken;
        }

        public void setEffectiveSeconds(int i7) {
            this.effectiveSeconds = i7;
        }

        public void setSmsToken(String str) {
            this.smsToken = str;
        }
    }
}
