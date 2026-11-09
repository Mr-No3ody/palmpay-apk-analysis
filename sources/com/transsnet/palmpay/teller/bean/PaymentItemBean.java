package com.transsnet.palmpay.teller.bean;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class PaymentItemBean implements Serializable {
    public long amount;
    public String billerId;
    public String billerName;
    public String categoryId;
    public String categoryName;
    public String couponCode;
    public String customerField1;
    public String description;
    public String discountPackageId;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public int f34134id;
    public String institutionLogo;
    public int isAmountFixed;
    public ArrayList<PaymentAmountItemBean> itemPrices;
    public long maxAmount;
    public long minAmount;
    public boolean myFavorite;
    public String paymentItemId;
    public String paymentItemName;
    public String paymentItemType;
    public String promptText;
    public String remark;
    public boolean select;
    public String validity;
}
