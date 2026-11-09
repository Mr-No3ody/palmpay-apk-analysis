package com.transsnet.palmpay.core.bean.req;

/* JADX INFO: loaded from: classes3.dex */
public class QueryBankcardUserNameReq {
    private String bankAccount;
    private String bankCode;

    public QueryBankcardUserNameReq() {
    }

    public String getBankAccount() {
        return this.bankAccount;
    }

    public String getBankCode() {
        return this.bankCode;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public QueryBankcardUserNameReq(String bankAccount, String bankCode) {
        this.bankAccount = bankAccount;
        this.bankCode = bankCode;
    }
}
