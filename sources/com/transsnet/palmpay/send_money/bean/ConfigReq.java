package com.transsnet.palmpay.send_money.bean;

/* JADX INFO: loaded from: classes4.dex */
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

    public void setPayeeAccountType(int i7) {
        this.payeeAccountType = i7;
    }

    public void setPhone(String str) {
        this.phone = str;
    }

    public void setRecipientMemberId(String str) {
        this.recipientMemberId = str;
    }
}
