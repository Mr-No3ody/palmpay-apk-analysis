package com.transsnet.palmpay.core.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes3.dex */
public class QueryLimitAmountResp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        private long maxAmount;
        private long minAmount;

        public long getMaxAmount() {
            return this.maxAmount;
        }

        public long getMinAmount() {
            return this.minAmount;
        }

        public void setMaxAmount(int maxAmount) {
            this.maxAmount = maxAmount;
        }

        public void setMinAmount(int minAmount) {
            this.minAmount = minAmount;
        }
    }

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }
}
