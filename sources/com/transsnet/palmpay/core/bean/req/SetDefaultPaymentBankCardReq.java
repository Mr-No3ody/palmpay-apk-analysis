package com.transsnet.palmpay.core.bean.req;

/* JADX INFO: loaded from: classes3.dex */
public class SetDefaultPaymentBankCardReq {
    public String accountId;
    public int operation = 1;
    public int type;

    public SetDefaultPaymentBankCardReq(String accountId, int type) {
        this.accountId = accountId;
        this.type = type;
    }
}
