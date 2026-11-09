package com.transsnet.palmpay.credit.bean.resp;

import com.transsnet.palmpay.core.bean.BillProcessDetail;
import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes4.dex */
public class TopUpOrderDetailRsp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        public AmountInfoBean amountInfo;
        public String bankCard;
        public String bankLogo;
        public String bankName;
        public long createTime;
        public String errorMsg;
        public String extensionInfo;
        public String orderId;
        public String orderStatusDesc;
        public BillProcessDetail orderStatusInfo;
        public String payId;
        public int payType;
        public long payeeStampDuty;
        public String payeeStampDutyText;
        public long payerStampDuty;
        public String payerStampDutyText;
        public String repaymentCode;
        public String repaymentName;
        public String repaymentPhone;
        public long stampDuty;
        public String stampDutyText;
        public int status;
        public String statusDesc;
        public String transType;
        public long updateTime;

        public static class AmountInfoBean {
            public long amount;
            public long couponAmount;
            public String couponId;
            public long deductionPoint;
            public long deductionPointAmount;
            public long fee;
            public long rebateAmount;
            public long redeemPoint;
            public long returnAmount;
            public long transAmount;
            public long vat;
        }

        public static class ExtensionInfo {
            public String loanNo;
            public long managementFee;
            public int productSubId;
            public boolean whetherManagementFee;
        }
    }
}
