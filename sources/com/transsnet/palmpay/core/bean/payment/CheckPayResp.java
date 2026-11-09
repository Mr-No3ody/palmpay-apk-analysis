package com.transsnet.palmpay.core.bean.payment;

import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes3.dex */
public class CheckPayResp extends CommonResult {
    private PayByOrderResp.DataBean data;

    public PayByOrderResp.DataBean getData() {
        return this.data;
    }

    public void setData(PayByOrderResp.DataBean data) {
        this.data = data;
    }
}
