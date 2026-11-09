package com.transsnet.palmpay.core.bean.req;

/* JADX INFO: loaded from: classes3.dex */
public class QrcodeGenerateReq {
    public static final String QR_CODE_PAY = "1";
    public static final String QR_CODE_RECEIVE = "2";
    private long amount;
    private String payType;
    private String payerAccountId;
    private String payerBankCode;
    private String recipientRemark;
    private String type;

    public QrcodeGenerateReq(String type, String payType) {
        this.type = type;
        this.payType = payType;
    }

    public long getAmount() {
        return this.amount;
    }

    public String getPayType() {
        return this.payType;
    }

    public String getPayerAccountId() {
        return this.payerAccountId;
    }

    public String getPayerBankCode() {
        return this.payerBankCode;
    }

    public String getRecipientRemark() {
        return this.recipientRemark;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public void setPayerAccountId(String payerAccountId) {
        this.payerAccountId = payerAccountId;
    }

    public void setPayerBankCode(String payerBankCode) {
        this.payerBankCode = payerBankCode;
    }

    public void setRecipientRemark(String recipientRemark) {
        this.recipientRemark = recipientRemark;
    }
}
