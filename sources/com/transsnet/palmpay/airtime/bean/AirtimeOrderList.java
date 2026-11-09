package com.transsnet.palmpay.airtime.bean;

import Pa.r0;
import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class AirtimeOrderList extends CommonResult {
    public OrderListData data;

    public static class OrderData {
        public long amount;
        public long createTime;
        public String icon;
        public String orderNo;
        public int orderStatus;
        public String orderType;
        public long payAmount;
        public long totalAmount;
        public String transType;
        public String transTypeName;

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
