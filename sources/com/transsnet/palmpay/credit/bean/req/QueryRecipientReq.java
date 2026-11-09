package com.transsnet.palmpay.credit.bean.req;

/* JADX INFO: loaded from: classes4.dex */
public class QueryRecipientReq {
    public static final int SOURCE_TYPE_ALL = 0;
    public static final int SOURCE_TYPE_RECEIVED = 1;
    public static final int SOURCE_TYPE_SEND = 2;
    public boolean alphabet;
    private boolean favorite;
    private int num;
    private int pageNum;
    private int pageSize;
    private int recipientType;
    private int source;

    public int getNum() {
        return this.num;
    }

    public int getPageNum() {
        return this.pageNum;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public int getRecipientType() {
        return this.recipientType;
    }

    public int getSource() {
        return this.source;
    }

    public boolean isFavorite() {
        return this.favorite;
    }

    public void setFavorite(boolean z3) {
        this.favorite = z3;
    }

    public void setNum(int i7) {
        this.num = i7;
    }

    public void setPageNum(int i7) {
        this.pageNum = i7;
    }

    public void setPageSize(int i7) {
        this.pageSize = i7;
    }

    public void setRecipientType(int i7) {
        this.recipientType = i7;
    }

    public void setSource(int i7) {
        this.source = i7;
    }
}
