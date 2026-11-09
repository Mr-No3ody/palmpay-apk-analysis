package com.transsnet.palmpay.core.bean;

/* JADX INFO: loaded from: classes3.dex */
public class BalanceAccountInfo extends CommonResult {
    private DataBean data;

    public static class DataBean {
        private String accountId;
        private long availableBalance;
        private String currency;
        public String frozenAmountAndroidLink;
        public String frozenAmountHighlightTips;
        public String frozenAmountTips;
        private long frozenBalance;
        private long reservedBalance;

        public String getAccountId() {
            return this.accountId;
        }

        public long getAvailableBalance() {
            return this.availableBalance;
        }

        public String getCurrency() {
            return this.currency;
        }

        public long getFrozenBalance() {
            return this.frozenBalance;
        }

        public long getReservedBalance() {
            return this.reservedBalance;
        }

        public void setAccountId(String accountId) {
            this.accountId = accountId;
        }

        public void setAvailableBalance(int availableBalance) {
            this.availableBalance = availableBalance;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public void setFrozenBalance(long frozenBalance) {
            this.frozenBalance = frozenBalance;
        }

        public void setReservedBalance(long reservedBalance) {
            this.reservedBalance = reservedBalance;
        }
    }

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }
}
