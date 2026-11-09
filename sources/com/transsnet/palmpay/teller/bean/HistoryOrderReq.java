package com.transsnet.palmpay.teller.bean;

/* JADX INFO: loaded from: classes4.dex */
public class HistoryOrderReq {
    public String categoryId;
    public int pageNum;
    public int pageSize;

    public HistoryOrderReq() {
    }

    public HistoryOrderReq(int i7, int i10) {
        this.pageNum = i7;
        this.pageSize = i10;
    }

    public HistoryOrderReq(String str, int i7, int i10) {
        this.categoryId = str;
        this.pageNum = i7;
        this.pageSize = i10;
    }
}
