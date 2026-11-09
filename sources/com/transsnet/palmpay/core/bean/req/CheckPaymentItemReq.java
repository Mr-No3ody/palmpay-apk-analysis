package com.transsnet.palmpay.core.bean.req;

/* JADX INFO: loaded from: classes3.dex */
public class CheckPaymentItemReq {
    public String businessType;
    public String categoryId;
    public String itemId;

    public CheckPaymentItemReq(String businessType, String categoryId, String itemId) {
        this.businessType = businessType;
        this.categoryId = categoryId;
        this.itemId = itemId;
    }
}
