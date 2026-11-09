package com.transsnet.palmpay.core.bean.req;

/* JADX INFO: loaded from: classes3.dex */
public class AddFamilyAccontReq {
    public static final String BILLER_CATEGORY_ID_AIRTIME = "3";
    public static final String BILLER_CATEGORY_ID_BUNDLE = "6";
    public String accountId;
    public String billerId;
    public String billerName;
    public String categoryId;
    public String customerId;
    public String institutionLogo;
    public String itemId;
    public String itemName;
    public String phone;
    public int remindHour;
    public String remindPeriod;
    public String remindTime;
    public int reminder;
    public String tag;

    public AddFamilyAccontReq() {
    }

    public AddFamilyAccontReq(String phone, String tag, String categoryId) {
        this.phone = phone;
        this.tag = tag;
        this.categoryId = categoryId;
    }

    public AddFamilyAccontReq(String accountId, String phone, String tag, String categoryId) {
        this.phone = phone;
        this.tag = tag;
        this.categoryId = categoryId;
        this.accountId = accountId;
    }
}
