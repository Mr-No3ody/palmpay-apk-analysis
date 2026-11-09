package com.transsnet.palmpay.core.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes3.dex */
public class AnalysisPartnerInRsp extends CommonResult {
    private DataBean data;

    public static class DataBean {
        public int amount;
        public String orderId;
    }

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }
}
