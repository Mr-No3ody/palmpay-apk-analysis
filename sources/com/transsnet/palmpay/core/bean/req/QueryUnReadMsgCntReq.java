package com.transsnet.palmpay.core.bean.req;

import p367ya.a;

/* JADX INFO: loaded from: classes3.dex */
public class QueryUnReadMsgCntReq {
    public Long msgId;
    public Long paymentId;

    public QueryUnReadMsgCntReq() {
        a.d().getClass();
        this.paymentId = Long.valueOf(a.h(0));
        this.msgId = Long.valueOf(a.h(1));
    }
}
