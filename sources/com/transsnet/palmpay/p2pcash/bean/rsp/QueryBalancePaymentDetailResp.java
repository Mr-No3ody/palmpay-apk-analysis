package com.transsnet.palmpay.p2pcash.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes4.dex */
public class QueryBalancePaymentDetailResp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        public long amount;
        public long bookingAmount;
        public String bookingOrderNo;
        public long depositMoney;
        public long finishTime;
        public String memberId;
        public String merchantId;
        public String networkName;
        public String orderNo;
        public Long payAmount;
        public String payId;
        public int payStatus;
        public String payeeAccountId;
        public int payeeAccountType;
        public String payeeMemberId;
        public String payerAccountId;
        public Integer payerAccountType;
        public String transType;
    }
}
