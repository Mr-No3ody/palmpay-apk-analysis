package com.transsnet.palmpay.p2pcash.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes4.dex */
public class CreateBalancePaymentOrderResp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        public Long bookingAmount;
        public Long depositMoney;
        public String networkName;
        public String orderNo;
    }
}
