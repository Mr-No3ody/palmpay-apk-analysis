package com.transsnet.palmpay.core.bean.rsp;

/* JADX INFO: loaded from: classes3.dex */
public class UnReadMsgCntRsp {
    public int actCount;
    public int annCount;
    public int msgCount;
    public int paymentCount;

    public int getMsgCount() {
        return Math.max(this.annCount, 0) + Math.max(this.actCount, 0) + this.msgCount;
    }

    public int getTotal() {
        return Math.max(this.annCount, 0) + Math.max(this.actCount, 0) + this.msgCount + this.paymentCount;
    }
}
