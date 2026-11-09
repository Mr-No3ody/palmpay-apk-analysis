package com.transsnet.palmpay.core.bean;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class AccountFlowBean extends CommonResult {
    private DataBean data;

    public static class DataBean {
        private int curPage;
        private Object dataMap;
        private ExtDataBean extData;
        private List<ListBean> list;
        private int pageSize;
        private int total;
        private int totalPage;

        public static class ExtDataBean {
            private long inComeAmount;
            private long payOutAmount;

            public long getInComeAmount() {
                return this.inComeAmount;
            }

            public long getPayOutAmount() {
                return this.payOutAmount;
            }

            public void setInComeAmount(int inComeAmount) {
                this.inComeAmount = inComeAmount;
            }

            public void setPayOutAmount(int payOutAmount) {
                this.payOutAmount = payOutAmount;
            }
        }

        public static class ListBean {
            private String accountId;
            private String accountType;
            private long amount;
            private long balanceAmount;
            private String businessDesc;
            private long createTime;
            private String merchantNo;
            private String orderNo;
            private String payId;
            public String redirect;
            private String remark;
            private String transType;

            public String getAccountId() {
                return this.accountId;
            }

            public String getAccountType() {
                return this.accountType;
            }

            public long getAmount() {
                return this.amount;
            }

            public long getBalanceAmount() {
                return this.balanceAmount;
            }

            public String getBusinessDesc() {
                return this.businessDesc;
            }

            public long getCreateTime() {
                return this.createTime;
            }

            public String getMerchantNo() {
                return this.merchantNo;
            }

            public String getOrderNo() {
                return this.orderNo;
            }

            public String getPayId() {
                return this.payId;
            }

            public String getRemark() {
                return this.remark;
            }

            public String getTransType() {
                return this.transType;
            }

            public void setAccountId(String accountId) {
                this.accountId = accountId;
            }

            public void setAccountType(String accountType) {
                this.accountType = accountType;
            }

            public void setAmount(long amount) {
                this.amount = amount;
            }

            public void setBalanceAmount(long balanceAmount) {
                this.balanceAmount = balanceAmount;
            }

            public void setBusinessDesc(String businessDesc) {
                this.businessDesc = businessDesc;
            }

            public void setCreateTime(long createTime) {
                this.createTime = createTime;
            }

            public void setMerchantNo(String merchantNo) {
                this.merchantNo = merchantNo;
            }

            public void setOrderNo(String orderNo) {
                this.orderNo = orderNo;
            }

            public void setPayId(String payId) {
                this.payId = payId;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public void setTransType(String transType) {
                this.transType = transType;
            }
        }

        public int getCurPage() {
            return this.curPage;
        }

        public Object getDataMap() {
            return this.dataMap;
        }

        public ExtDataBean getExtData() {
            return this.extData;
        }

        public List<ListBean> getList() {
            return this.list;
        }

        public int getPageSize() {
            return this.pageSize;
        }

        public int getTotal() {
            return this.total;
        }

        public int getTotalPage() {
            return this.totalPage;
        }

        public void setCurPage(int curPage) {
            this.curPage = curPage;
        }

        public void setDataMap(Object dataMap) {
            this.dataMap = dataMap;
        }

        public void setExtData(ExtDataBean extData) {
            this.extData = extData;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public void setTotalPage(int totalPage) {
            this.totalPage = totalPage;
        }
    }

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }
}
