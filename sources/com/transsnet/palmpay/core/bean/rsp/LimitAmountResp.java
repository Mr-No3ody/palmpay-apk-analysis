package com.transsnet.palmpay.core.bean.rsp;

/* JADX INFO: loaded from: classes3.dex */
public class LimitAmountResp {
    private long maxAmount;
    private long minAmount;

    public long getMaxAmount() {
        return this.maxAmount;
    }

    public long getMinAmount() {
        return this.minAmount;
    }

    public void setMaxAmount(long maxAmount) {
        this.maxAmount = maxAmount;
    }

    public void setMinAmount(long minAmount) {
        this.minAmount = minAmount;
    }
}
