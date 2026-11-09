package com.transsnet.palmpay.send_money.bean;

import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes4.dex */
public class VerifyPaymentInfoRsp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        public String accountName;
        public String accountNo;
        public long amount;
        public boolean amountLimitPopUp;
        public String amountLimitPopUpContent;
        public String amountLimitPopUpDarkPic;
        public String amountLimitPopUpJumpUrl;
        public String amountLimitPopUpPic;
        public int businessType;
        public FinanceGuidanceBean financialGuidePopUp;
        public Boolean firstTransfer;
        public String payeeBankName;
        public String payeeMemberId;
        public String recipientPhone;
        public Boolean repeatedTransfer;
        public int status;
        public String statusDesc;
    }
}
