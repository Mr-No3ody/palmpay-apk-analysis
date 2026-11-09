package com.transsnet.palmpay.core.bean.req;

import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.bill.TransType;

/* JADX INFO: loaded from: classes3.dex */
public class PreviewPayInfoV2Req {
    public String biller;
    public String businessPhone;
    public String calculationExtInfo;
    public Long cid;
    public long coins;
    public long couponAmount;
    public Long couponId;
    public String createReceiptUrl;
    public String customerId;
    public String institutionId;
    public boolean isRedeemPoint;
    public boolean isUseCoupon;
    public String ltem;
    public String merchantNo;
    public long orderAmount;
    public String orderId;
    public String orderNo;
    public String orderType;
    public String payeeAccountType;
    public String payeeMemberId;
    public String payerAccountType;
    public String payerMemberId;
    public Long productId;
    public String subTransTypeCode;
    public String transType;
    public boolean useBonus;
    public boolean useDiscount;
    public boolean usePayDiscount;
    public boolean useReturnPoint;
    private String version = TransType.TRANS_TYPE_SPEND_SAVE_WITHDRAW;
    private String countryCode = BaseApplication.getCountryLocale();
    private String currency = BaseApplication.getCurrency();
}
