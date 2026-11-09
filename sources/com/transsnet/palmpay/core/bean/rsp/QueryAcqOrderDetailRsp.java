package com.transsnet.palmpay.core.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes3.dex */
public class QueryAcqOrderDetailRsp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        public int appSource;
        public String blackBox;
        public String cashierMemberId;
        public long couponAmount;
        public String couponId;
        public long createTime;
        public String currency;
        public int deductionOkFlag;
        public long discountAmount;
        public long loyaltyAmount;
        public int loyaltyPoint;
        public String merchantId;
        public String merchantName;
        public long orderAmount;
        public String orderDesc;
        public long orderExpire;
        public long orderExpireTime;
        public String orderNo;
        public int orderStatus;
        public String orderTitle;
        public String orderType;
        public long payAmount;
        public long payFee;
        public String payId;
        public int payStatus;
        public int payType;
        public String payeeAccountId;
        public int payeeAccountType;
        public long payeeAmount;
        public long payeeFee;
        public long payeeVat;
        public String payerAccountId;
        public int payerAccountType;
        public String payerBankCode;
        public String payerBankName;
        public String payerBankUrl;
        public String payerCardExpiryMon;
        public String payerCardExpiryYear;
        public String payerCardNo;
        public long payerFee;
        public String payerHeadPortrait;
        public String payerMemberId;
        public String payerMobileNo;
        public long payerVat;
        public long refundOrderAmount;
        public String refundOrderId;
        public String remark;
        public int returnPoint;
        public String shopId;
        public String shopName;
        public String subPayId;
        public String systemType;
        public long taxFee;
        public long totalAmount;
        public String transType;
        public int transactionStatus;
        public long updateTime;
    }
}
