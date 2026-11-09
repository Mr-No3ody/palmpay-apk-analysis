package com.transsnet.palmpay.core.bean;

/* JADX INFO: loaded from: classes3.dex */
public class UnlinkBankCardReq {
    private String accountId;
    private String channel;
    private String remark;
    private String token;

    public String getAccountId() {
        return this.accountId;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getRemark() {
        return this.remark;
    }

    public String getToken() {
        return this.token;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
