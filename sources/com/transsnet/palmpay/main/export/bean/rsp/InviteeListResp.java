package com.transsnet.palmpay.main.export.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class InviteeListResp extends CommonResult {
    private DataBean data;

    public static class DataBean {
        private int curPage;
        private List<Invitee> list;
        private int pageSize;
        private int total;
        private int totalPage;

        public static class Invitee {
            private String firstName;
            private String fullName;
            private long invitTime;
            private String lastName;
            private String memberId;
            private String phone;
            private long pointsAmount;

            public String getFirstName() {
                return this.firstName;
            }

            public String getFullName() {
                return this.fullName;
            }

            public long getInvitTime() {
                return this.invitTime;
            }

            public String getLastName() {
                return this.lastName;
            }

            public String getMemberId() {
                return this.memberId;
            }

            public String getPhone() {
                return this.phone;
            }

            public long getPointsAmount() {
                return this.pointsAmount;
            }

            public void setFirstName(String str) {
                this.firstName = str;
            }

            public void setFullName(String str) {
                this.fullName = str;
            }

            public void setInvitTime(long j6) {
                this.invitTime = j6;
            }

            public void setLastName(String str) {
                this.lastName = str;
            }

            public void setMemberId(String str) {
                this.memberId = str;
            }

            public void setPhone(String str) {
                this.phone = str;
            }

            public void setPointsAmount(long j6) {
                this.pointsAmount = j6;
            }
        }

        public int getCurPage() {
            return this.curPage;
        }

        public List<Invitee> getList() {
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

        public void setCurPage(int i7) {
            this.curPage = i7;
        }

        public void setList(List<Invitee> list) {
            this.list = list;
        }

        public void setPageSize(int i7) {
            this.pageSize = i7;
        }

        public void setTotal(int i7) {
            this.total = i7;
        }

        public void setTotalPage(int i7) {
            this.totalPage = i7;
        }
    }

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }
}
