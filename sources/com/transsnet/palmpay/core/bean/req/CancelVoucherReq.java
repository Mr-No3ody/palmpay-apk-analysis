package com.transsnet.palmpay.core.bean.req;

/* JADX INFO: loaded from: classes3.dex */
public class CancelVoucherReq {
    public static final int PAY_ROLE = 1;
    public static final int RECIP_ROLE = 2;
    private String orderId;
    private String remark;
    private int role;

    public String getOrderId() {
        return this.orderId;
    }

    public String getRemark() {
        return this.remark;
    }

    public int getRole() {
        return this.role;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
