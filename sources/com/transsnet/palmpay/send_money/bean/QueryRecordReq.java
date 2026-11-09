package com.transsnet.palmpay.send_money.bean;

/* JADX INFO: loaded from: classes4.dex */
public class QueryRecordReq {
    private int pageNum;
    private int pageSize;

    public QueryRecordReq(int i7, int i10) {
        this.pageNum = i7;
        this.pageSize = i10;
    }

    public int getPageNum() {
        return this.pageNum;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageNum(int i7) {
        this.pageNum = i7;
    }

    public void setPageSize(int i7) {
        this.pageSize = i7;
    }
}
