package com.transsnet.palmpay.core.bean;

/* JADX INFO: loaded from: classes3.dex */
public class AnalysisPartnerInForCashOutReq {
    private long amount;
    private String createReceiptUrl;

    public AnalysisPartnerInForCashOutReq(long amount, String createReceiptUrl) {
        this.amount = amount;
        this.createReceiptUrl = createReceiptUrl;
    }

    public long getAmount() {
        return this.amount;
    }

    public String getCreateReceiptUrl() {
        return this.createReceiptUrl;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public void setCreateReceiptUrl(String createReceiptUrl) {
        this.createReceiptUrl = createReceiptUrl;
    }
}
