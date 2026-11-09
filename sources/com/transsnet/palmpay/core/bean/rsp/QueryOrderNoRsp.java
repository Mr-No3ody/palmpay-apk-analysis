package com.transsnet.palmpay.core.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes3.dex */
public class QueryOrderNoRsp extends CommonResult {
    private DataBean data;

    public static class DataBean {
        private String orderNo;
        private String orderType;

        public String getOrderNo() {
            return this.orderNo;
        }

        public String getOrderType() {
            return this.orderType;
        }

        public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public void setOrderType(String orderType) {
            this.orderType = orderType;
        }
    }

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }
}
