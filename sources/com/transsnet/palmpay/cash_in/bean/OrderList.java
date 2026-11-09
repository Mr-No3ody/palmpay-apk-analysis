package com.transsnet.palmpay.cash_in.bean;

import Pa.r0;
import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class OrderList extends CommonResult {
    public OrderListData data;

    public static class OrderData {
        public String bankAccNo;
        public String bankCode;
        public String bankUrl;
        public long businessAmount;
        public long createTime;
        public String currency;
        public String modifyTime;
        public String orderNo;
        public int orderStatus;
        public String orderTitle;
        public long payFee;
        public String payeeBankAccNo;
        public String payeeBankCode;
        public String payeeName;
        public String payerAccountId;
        public String processingTime;
        public String remark;
        public String successTime;
        public long totalAmount;
        public String tradeName;
        public String transType;

        public double getTotalAmount() {
            return r0.h(this.totalAmount);
        }
    }

    public static class OrderListData {
        public int curPage;
        public List<OrderData> list;
        public int pageSize;
        public int total;
        public int totalPage;
    }
}
