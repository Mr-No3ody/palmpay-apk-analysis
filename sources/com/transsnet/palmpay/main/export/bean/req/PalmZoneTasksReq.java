package com.transsnet.palmpay.main.export.bean.req;

/* JADX INFO: loaded from: classes4.dex */
public class PalmZoneTasksReq {
    private String memberId;
    private Integer pageNum = 1;
    private Integer pageSize = 10;
    public boolean todayDisplay = false;
    public boolean taskCenterCacheClearFlag = false;

    public String getMemberId() {
        return this.memberId;
    }

    public Integer getPageNum() {
        return this.pageNum;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setMemberId(String str) {
        this.memberId = str;
    }

    public void setPageNum(Integer num) {
        this.pageNum = num;
    }

    public void setPageSize(Integer num) {
        this.pageSize = num;
    }
}
