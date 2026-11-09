package com.transsnet.palmpay.teller.bean;

/* JADX INFO: loaded from: classes4.dex */
public class QueryLastBillerReq {
    public String billerId;
    public String categoryId;
    public String itemId;

    public QueryLastBillerReq(String str) {
        this.categoryId = str;
    }

    public void setBillerId(String str) {
        this.billerId = str;
    }

    public void setCategoryId(String str) {
        this.categoryId = str;
    }

    public void setItemId(String str) {
        this.itemId = str;
    }

    public QueryLastBillerReq(String str, String str2) {
        this.categoryId = str;
        this.billerId = str2;
    }
}
