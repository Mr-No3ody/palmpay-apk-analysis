package com.transsnet.palmpay.core.bean.req;

/* JADX INFO: loaded from: classes3.dex */
public class QueryLimitAmountV2Req {
    public static final String TRANS_TYPE_AIRTIME = "04";
    public static final String TRANS_TYPE_ELECTRICITY = "16";
    public static final String TRANS_TYPE_FUND = "01";
    public static final String TRANS_TYPE_INTERNET = "29";
    public static final String TRANS_TYPE_LUCKY_MONEY = "46";
    public static final String TRANS_TYPE_TRANSFER = "03";
    public static final String TRANS_TYPE_TV = "17";
    public static final String TRANS_TYPE_WATER = "15";
    public static final String TRANS_TYPE_WITHDRAW = "02";
    public String countryCode;
    public String currency;
    public String payeeAccountType;
    public String payerAccountType;
    public String transType;
}
