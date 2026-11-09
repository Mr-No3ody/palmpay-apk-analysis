package com.transsnet.palmpay.main.export.bean.rsp;

import com.transsnet.palmpay.core.bean.BillProcessDetail;

/* JADX INFO: loaded from: classes4.dex */
public class QueryRefundBillDetailRsp {
    private long amount;
    private long complateTime;
    private long createTime;
    private String jumpUrl;
    private String memberId;
    private String orderNo;
    private BillProcessDetail orderStatusInfo;
    private String paymentType;
    private String preOrderNo;
    private String preTransType;
    private String recieveMethod;
    private String remark;
    private String statusDesc;
    private String transScene;
    private String transType;

    public long getAmount() {
        return this.amount;
    }

    public long getComplateTime() {
        return this.complateTime;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public String getJumpUrl() {
        return this.jumpUrl;
    }

    public String getMemberId() {
        return this.memberId;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public BillProcessDetail getOrderStatusInfo() {
        return this.orderStatusInfo;
    }

    public String getPaymentType() {
        return this.paymentType;
    }

    public String getPreOrderNo() {
        return this.preOrderNo;
    }

    public String getPreTransType() {
        return this.preTransType;
    }

    public String getRecieveMethod() {
        return this.recieveMethod;
    }

    public String getRemark() {
        return this.remark;
    }

    public String getStatusDesc() {
        return this.statusDesc;
    }

    public String getTransScene() {
        return this.transScene;
    }

    public String getTransType() {
        return this.transType;
    }

    public void setAmount(long j6) {
        this.amount = j6;
    }

    public void setComplateTime(long j6) {
        this.complateTime = j6;
    }

    public void setCreateTime(long j6) {
        this.createTime = j6;
    }

    public void setJumpUrl(String str) {
        this.jumpUrl = str;
    }

    public void setMemberId(String str) {
        this.memberId = str;
    }

    public void setOrderNo(String str) {
        this.orderNo = str;
    }

    public void setOrderStatusInfo(BillProcessDetail billProcessDetail) {
        this.orderStatusInfo = billProcessDetail;
    }

    public void setPaymentType(String str) {
        this.paymentType = str;
    }

    public void setPreOrderNo(String str) {
        this.preOrderNo = str;
    }

    public void setPreTransType(String str) {
        this.preTransType = str;
    }

    public void setRecieveMethod(String str) {
        this.recieveMethod = str;
    }

    public void setRemark(String str) {
        this.remark = str;
    }

    public void setStatusDesc(String str) {
        this.statusDesc = str;
    }

    public void setTransScene(String str) {
        this.transScene = str;
    }

    public void setTransType(String str) {
        this.transType = str;
    }
}
