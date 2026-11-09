package com.transsnet.palmpay.core.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.CouponItem;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class QueryUserCouponsRsp extends CommonResult {
    private DataBean data;

    public static class DataBean {
        private int curPage;
        private List<CouponItem> list;
        private int pageSize;
        private int total;
        private int totalPage;

        public int getCurPage() {
            return this.curPage;
        }

        public List<CouponItem> getList() {
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

        public void setList(List<CouponItem> list) {
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
