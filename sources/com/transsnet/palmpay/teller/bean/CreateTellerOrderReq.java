package com.transsnet.palmpay.teller.bean;

import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.SingleLiveData$Params;

/* JADX INFO: loaded from: classes4.dex */
public class CreateTellerOrderReq implements SingleLiveData$Params {
    public String address;
    public String billerId;
    public String billerName;
    public long businessAmount;
    public int businessType;
    public String categoryId;
    public String currency = BaseApplication.getCurrency();
    public String customerDisplayName;
    public String customerId;
    public String dataBundleItemName;
    public long debtAmount;
    public String discountPackageId;
    public boolean familyAccountCheck;
    public String fullName;
    public String icon;
    public long loyaltyAmount;
    public long loyaltyPoint;
    public String network;
    public String outSourceId;
    public long payAmount;
    public long payFee;
    public long payeeAmount;
    public String paymentItemId;
    public String paymentItemName;
    public String referenceId;
    public boolean renewal;
    public long returnPoint;
    public String sourceCategoryId;
    public long totalAmount;
    public String transType;
    public String validity;
    public boolean verifyNetwork;
}
