package com.transsnet.palmpay.core.bean.req;

/* JADX INFO: loaded from: classes3.dex */
public class QueryBankListReq {
    public static final int BANK_ALL = 0;
    public static final int BANK_LIST_PAY_BY_BANK_CARD = 1;
    public static final int BANK_LIST_PAY_MMO = 5;
    public static final int BANK_LIST_PAY_WITH_BANK_ACCOUNT = 4;
    public static final int BANK_LIST_PAY_WITH_USSD = 9;
    public static final int BANK_LIST_PAY_WITH_USSD_OUT_FUND = 7;
    public static final int BANK_LIST_TRANSFER_MONEY = 3;
    public static final int BANK_LIST_WITHDRAW = 2;
    public int businessType;
    public int queryCommonBankFlag;

    public QueryBankListReq(int businessType) {
        this.queryCommonBankFlag = 0;
        this.businessType = businessType;
    }

    public QueryBankListReq(int businessType, int queryCommonBankFlag) {
        this.businessType = businessType;
        this.queryCommonBankFlag = queryCommonBankFlag;
    }
}
