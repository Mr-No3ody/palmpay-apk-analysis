package com.transsnet.palmpay.core.bean.bill;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BillReqNew {
    private long beginTime;
    public List<String> conditions;
    private long endTime;
    public int inOutFlag;
    private int pageNum;
    private int pageSize;
    public int status;
    private int totalFlag;
    private String transScene;
    private String transType;

    public long getBeginTime() {
        return this.beginTime;
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

    public String getTransScene() {
        return this.transScene;
    }

    public String getTransType() {
        return this.transType;
    }

    public void setBeginTime(long beginTime) {
        this.beginTime = beginTime;
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

    public void setTransScene(String transScene) {
        this.transScene = transScene;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }
}
