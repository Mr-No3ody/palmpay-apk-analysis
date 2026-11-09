package com.transsnet.palmpay.core.bean;

/* JADX INFO: loaded from: classes3.dex */
public class QueryBankcardUserNameRsp extends CommonResult {
    private DataBean data;

    public static class DataBean {
        private String accountName;
        private String channel;

        public String getAccountName() {
            return this.accountName;
        }

        public String getChannel() {
            return this.channel;
        }

        public void setAccountName(String accountName) {
            this.accountName = accountName;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }
    }

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }
}
