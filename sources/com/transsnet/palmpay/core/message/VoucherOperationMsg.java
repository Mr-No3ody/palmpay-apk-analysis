package com.transsnet.palmpay.core.message;

/* JADX INFO: loaded from: classes3.dex */
public class VoucherOperationMsg {
    private String orderId;
    private boolean success;

    public VoucherOperationMsg() {
    }

    public String getOrderId() {
        return this.orderId;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public VoucherOperationMsg(String orderId, boolean success) {
        this.orderId = orderId;
        this.success = success;
    }
}
