package com.transsnet.palmpay.core.bean.req;

/* JADX INFO: loaded from: classes3.dex */
public class QueryFamilyAccountReq {
    public String billerId;
    public String categoryId;
    public int pageNum;
    public int pageSize;

    public QueryFamilyAccountReq(String categoryId, int pageNum, int pageSize) {
        this(categoryId, null, pageNum, pageSize);
    }

    public QueryFamilyAccountReq(String categoryId, String billerId, int pageNum, int pageSize) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.categoryId = categoryId;
        this.billerId = billerId;
    }
}
