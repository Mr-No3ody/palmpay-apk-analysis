package com.transsnet.palmpay.teller.bean;

import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes4.dex */
public class AgentOrderDetailRsp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        public String bankName;
        public long businessAmount;
        public String businessTransType;
        public String businessTransTypeName;
        public long completeTime;
        public String errorMessage;
        public String faqLink;
        public String feedbackLink;
        public String icon;
        public String orderNo;
        public int orderStatus;
        public String orderStatusDesc;
        public String payId;
        public long payTime;
        public int payeeAccountType;
        public String payerCardNo;
        public long settlementDate;
        public long totalAmount;
        public String transType;
        public long withholdingTax;

        public boolean isPending() {
            int i7 = this.orderStatus;
            return i7 == 0 || i7 == 3 || i7 == 4;
        }
    }
}
