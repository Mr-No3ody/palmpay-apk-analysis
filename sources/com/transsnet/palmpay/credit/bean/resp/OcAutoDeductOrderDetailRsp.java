package com.transsnet.palmpay.credit.bean.resp;

import com.transsnet.palmpay.core.bean.BillProcessDetail;
import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes4.dex */
public class OcAutoDeductOrderDetailRsp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        public String bankCard;
        public String bankLogo;
        public String bankName;
        public long createTime;
        public String currency;
        public int loyaltyPoint;
        public String merchantName;
        public String merchantNo;
        public long orderAmount;
        public String orderNo;
        public int orderStatus;
        public String orderStatusDesc;
        public BillProcessDetail orderStatusInfo;
        public long payAmount;
        public String payId;
        public int payStatus;
        public int payeeAccountType;
        public int payerAccountType;
        public int returnPoint;
        public int totalAmount;
        public String transType;
        public long updateTime;
    }
}
