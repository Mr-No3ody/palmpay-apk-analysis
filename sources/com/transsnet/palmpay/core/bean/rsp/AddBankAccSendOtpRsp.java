package com.transsnet.palmpay.core.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes3.dex */
public class AddBankAccSendOtpRsp extends CommonResult {
    private DataBean data;

    public static class DataBean {
        private String reference;

        public String getReference() {
            return this.reference;
        }

        public void setReference(String reference) {
            this.reference = reference;
        }
    }

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }
}
