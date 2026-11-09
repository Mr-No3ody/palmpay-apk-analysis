package com.transsnet.palmpay.send_money.bean;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class RequestMoneyReq implements Serializable {
    private long amount;
    private String countryCode;
    private String currency;
    private String receiveAvatar;
    private String receiveNickname;
    private String receivePhone;
    private String remark;
    private int transferPurpose;

    public long getAmount() {
        return this.amount;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getReceiveAvatar() {
        return this.receiveAvatar;
    }

    public String getReceiveNickname() {
        return this.receiveNickname;
    }

    public String getReceivePhone() {
        return this.receivePhone;
    }

    public String getRemark() {
        return this.remark;
    }

    public int getTransferPurpose() {
        return this.transferPurpose;
    }

    public void setAmount(long j6) {
        this.amount = j6;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public void setCurrency(String str) {
        this.currency = str;
    }

    public void setReceiveAvatar(String str) {
        this.receiveAvatar = str;
    }

    public void setReceiveNickname(String str) {
        this.receiveNickname = str;
    }

    public void setReceivePhone(String str) {
        this.receivePhone = str;
    }

    public void setRemark(String str) {
        this.remark = str;
    }

    public void setTransferPurpose(int i7) {
        this.transferPurpose = i7;
    }
}
