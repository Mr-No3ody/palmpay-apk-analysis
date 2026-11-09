package com.transsnet.palmpay.core.bean.bill;

import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BillRsp extends CommonResult {
    private DataBean data;

    public static class DataBean {
        private int curPage;
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
            private int accountType;
            private long amount;
            private String businessDesc;
            public String companyIconUrl;
            private long createTime;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            private int f27365id;
            private String loanId;
            private String memberId;
            private String orderNo;
            private String payId;
            private long payTime;
            private String remark;
            private String transScene;
            private String transType;
            private long updateTime;

            public String getAccountId() {
                return this.accountId;
            }

            public int getAccountType() {
                return this.accountType;
            }

            public long getAmount() {
                return this.amount;
            }

            public String getBusinessDesc() {
                return this.businessDesc;
            }

            public long getCreateTime() {
                return this.createTime;
            }

            public int getId() {
                return this.f27365id;
            }

            public String getLoanId() {
                return this.loanId;
            }

            public String getMemberId() {
                return this.memberId;
            }

            public String getOrderNo() {
                return this.orderNo;
            }

            public String getPayId() {
                return this.payId;
            }

            public long getPayTime() {
                return this.payTime;
            }

            public String getRemark() {
                return this.remark;
            }

            public String getTransScene() {
                return this.transScene;
            }

            public String getTransType() {
                return this.transType;
            }

            public long getUpdateTime() {
                return this.updateTime;
            }

            public void setAccountId(String accountId) {
                this.accountId = accountId;
            }

            public void setAccountType(int accountType) {
                this.accountType = accountType;
            }

            public void setAmount(long amount) {
                this.amount = amount;
            }

            public void setBusinessDesc(String businessDesc) {
                this.businessDesc = businessDesc;
            }

            public void setCreateTime(long createTime) {
                this.createTime = createTime;
            }

            public void setId(int id2) {
                this.f27365id = id2;
            }

            public void setLoanId(String loanId) {
                this.loanId = loanId;
            }

            public void setMemberId(String memberId) {
                this.memberId = memberId;
            }

            public void setOrderNo(String orderNo) {
                this.orderNo = orderNo;
            }

            public void setPayId(String payId) {
                this.payId = payId;
            }

            public void setPayTime(long payTime) {
                this.payTime = payTime;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public void setTransScene(String transScene) {
                this.transScene = transScene;
            }

            public void setTransType(String transType) {
                this.transType = transType;
            }

            public void setUpdateTime(long updateTime) {
                this.updateTime = updateTime;
            }
        }

        public int getCurPage() {
            return this.curPage;
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
