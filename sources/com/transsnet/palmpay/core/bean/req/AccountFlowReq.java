package com.transsnet.palmpay.core.bean.req;

/* JADX INFO: loaded from: classes3.dex */
public class AccountFlowReq {
    private String accountId;
    private long beginTime;
    private String dcType;
    private long endTime;
    private int pageNum;
    private int pageSize;
    private int totalFlag;

    public String getAccountId() {
        return this.accountId;
    }

    public long getBeginTime() {
        return this.beginTime;
    }

    public String getDcType() {
        return this.dcType;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public int getPageNum() {
        return this.pageNum;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public int getTotalFlag() {
        return this.totalFlag;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public void setBeginTime(long beginTime) {
        this.beginTime = beginTime;
    }

    public void setDcType(String dcType) {
        this.dcType = dcType;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setTotalFlag(int totalFlag) {
        this.totalFlag = totalFlag;
    }
}
