package com.transsnet.palmpay.core.bean.req;

/* JADX INFO: loaded from: classes3.dex */
public class ConfigReq {
    private int payeeAccountType;
    private String phone;
    private String recipientMemberId;

    public int getPayeeAccountType() {
        return this.payeeAccountType;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getRecipientMemberId() {
        return this.recipientMemberId;
    }

    public void setPayeeAccountType(int payeeAccountType) {
        this.payeeAccountType = payeeAccountType;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setRecipientMemberId(String recipientMemberId) {
        this.recipientMemberId = recipientMemberId;
    }
}
