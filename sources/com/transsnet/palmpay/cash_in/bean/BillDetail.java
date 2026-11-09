package com.transsnet.palmpay.cash_in.bean;

import Pa.r0;
import com.transsnet.palmpay.core.bean.BillProcessDetail;
import com.transsnet.palmpay.core.bean.payment.PaymentFeeDetail;
import com.transsnet.palmpay.core.bean.rsp.CashOrderExtendBean;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class BillDetail {
    public String bankAccNo;
    public String bankCode;
    public String bankName;
    public String bankReceiptsEmail;
    public String bankUrl;
    public String bizInfo;
    public long businessAmount;
    public ArrayList<TaxItem> cashInFeeList;
    public CashOrderExtendBean cashOrderExtendDTO;
    public String channelTransactionId;
    public long createTime;
    public String currency;
    public String errorCode;
    public String errorMessage;
    public String faqLink;
    public PaymentFeeDetail feeDetailList;
    public String fundMethodDesc;
    public long loyaltyAmount;
    public long loyaltyPoint;
    public String mobileNo;
    public long modifyTime;
    public String orderNo;
    public String orderStatus;
    public String orderStatusDesc;
    public BillProcessDetail orderStatusInfo;
    public long orderSuccessTime;
    public String orderTitle;
    public long payFee;
    public int payeeAccountType;
    public String payeeBankAccNo;
    public String payeeBankCode;
    public String payeeName;
    public String payerAccountId;
    public int payerAccountType;
    public String pendingCouponRemark;
    public long processingTime;
    public String rechargePIN;
    public Long rechargePINExpireTime;
    public long redeemPoint;
    public String remark;
    public long returnPoint;
    public long successTime;
    public long totalAmount;
    public String tradeName;
    public String transType;
    public String transactionTypeDesc;
    public long vat;

    public double getTotalAmount() {
        return r0.h(this.totalAmount);
    }
}
