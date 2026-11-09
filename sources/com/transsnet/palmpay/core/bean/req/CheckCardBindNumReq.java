package com.transsnet.palmpay.core.bean.req;

/* JADX INFO: loaded from: classes3.dex */
public class CheckCardBindNumReq {
    private String bankAccountNo;
    private String bankCode;
    private String cardNo;

    public String getBankAccountNo() {
        return this.bankAccountNo;
    }

    public String getBankCode() {
        return this.bankCode;
    }

    public String getCardNo() {
        return this.cardNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
}
