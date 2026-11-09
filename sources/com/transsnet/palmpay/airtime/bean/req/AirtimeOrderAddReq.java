package com.transsnet.palmpay.airtime.bean.req;

import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.SingleLiveData$Params;
import com.transsnet.palmpay.util.PhoneUtils;

/* JADX INFO: loaded from: classes3.dex */
public class AirtimeOrderAddReq implements SingleLiveData$Params {
    public long amount;
    public int appointment;
    public String billerId;
    public String billerName;
    public String couponCode;
    public String icon;
    public String itemId;
    public String network;
    public String outSourceId;
    public String phone;
    public long productId;
    public String sourceCategoryId;
    public String transType;
    public boolean verifyNetwork;
    private String currency = BaseApplication.getCurrency();
    private String imei = PhoneUtils.getUniqueId();
    public String orderType = "01";
}
