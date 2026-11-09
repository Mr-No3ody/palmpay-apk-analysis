package com.transsnet.palmpay.core.bean.payment;

import Pa.C0525w;
import com.appsflyer.AppsFlyerLib;
import com.google.gson.Gson;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.BankCardExtInfo;
import com.transsnet.palmpay.core.bean.DeviceInformation;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class PayByOrderReq implements Serializable {
    public long amount;
    public BankCardExtInfo bankCardExtInfo;
    public String bankName;
    public String bankUrl;
    public Long businessDiscountAmount;
    public int buyEarlyRefundByTime;
    public String cacheKey;
    public Long couponId;
    public String currency;
    private String deviceInformation;
    public long fee;
    public String flexiLoanTrialInfo;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public String f27368id;
    public String installmentId;
    public String marketExtInfo;
    private String metaInfo;
    public String orderNo;
    public String orderType;
    public int payType;
    public String payerAccountId;
    public String payerBankAccountNo;
    public String payerBankCode;
    public String payerBankName;
    public String payerCardCvv;
    public String payerCardExpiryMon;
    public String payerCardExpiryYear;
    public String payerCardNo;
    public String payerCardPin;
    public String payerMessage;
    public int reUseable;
    public String receiveAccountId;
    public String receiveType;
    public String transType;
    public String walletChannel;
    public String walletPhone;

    public PayByOrderReq() {
        C0525w c0525wF = C0525w.f();
        this.deviceInformation = ((Gson) c0525wF.f7166b).toJson(new DeviceInformation());
        this.metaInfo = "1";
        try {
            MarketExtInfoBean marketExtInfoBean = new MarketExtInfoBean();
            marketExtInfoBean.appsflyerID = AppsFlyerLib.getInstance().getAppsFlyerUID(BaseApplication.get());
            this.marketExtInfo = ((Gson) C0525w.f().f7166b).toJson(marketExtInfoBean);
        } catch (Exception unused) {
        }
    }
}
