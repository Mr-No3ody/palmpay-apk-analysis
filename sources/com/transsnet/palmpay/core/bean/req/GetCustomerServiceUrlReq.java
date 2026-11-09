package com.transsnet.palmpay.core.bean.req;

/* JADX INFO: loaded from: classes3.dex */
public class GetCustomerServiceUrlReq {
    public static final String ENTER_TYPE_AIRTIME_GROUP_PURCHASE = "orderresult";
    public static final String ENTER_TYPE_CASHBOX = "cashbox";
    public static final String ENTER_TYPE_DEFAULT = "default";
    public static final String ENTER_TYPE_FLEXI = "flexihome";
    public static final String ENTER_TYPE_FLEXI_ORDER = "flexiorder";
    public static final String ENTER_TYPE_HOME = "home";
    public static final String ENTER_TYPE_HOME_ME = "me";
    public static final String ENTER_TYPE_LOGIN = "login";
    public static final String ENTER_TYPE_MY_STORE = "mystorehome";
    public static final String ENTER_TYPE_ORDER_DETAIL = "order";
    public static final String ENTER_TYPE_PALM_ZONE = "palmzone";
    public static final String ENTER_TYPE_PAY_SHOP = "payshop";
    public static final String ENTER_TYPE_QRCODE = "qrcode";
    public static final String ENTER_TYPE_SAVING = "saving";
    public static final String ENTER_TYPE_SAVING_V2 = "fixedsavings";
    public static final String ENTER_TYPE_SIGNUP = "register";
    public long amount;
    public String entryType;
    public String orderNumber;
    public String orderStatusDesc;
    public long time;
    public String transType;
    public String transTypeDesc;
}
