package com.transsnet.palmpay.send_money.bean;

/* JADX INFO: loaded from: classes4.dex */
public class AddRecipientReq {
    private long amount;
    private String label;
    private String recipientBankAccount;
    private String recipientBankCode;
    private String recipientBankName;
    private String recipientImageUrl;
    private String recipientMobileNo;
    private String recipientName;
    private int recipientType;
    private int scheduleType = 1;
    private int scheduleValue;

    public long getAmount() {
        return this.amount;
    }

    public String getLabel() {
        return this.label;
    }

    public String getRecipientBankAccount() {
        return this.recipientBankAccount;
    }

    public String getRecipientBankCode() {
        return this.recipientBankCode;
    }

    public String getRecipientBankName() {
        return this.recipientBankName;
    }

    public String getRecipientImageUrl() {
        return this.recipientImageUrl;
    }

    public String getRecipientMobileNo() {
        return this.recipientMobileNo;
    }

    public String getRecipientName() {
        return this.recipientName;
    }

    public int getRecipientType() {
        return this.recipientType;
    }

    public int getScheduleType() {
        return this.scheduleType;
    }

    public int getScheduleValue() {
        return this.scheduleValue;
    }

    public void setAmount(long j6) {
        this.amount = j6;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setRecipientBankAccount(String str) {
        this.recipientBankAccount = str;
    }

    public void setRecipientBankCode(String str) {
        this.recipientBankCode = str;
    }

    public void setRecipientBankName(String str) {
        this.recipientBankName = str;
    }

    public void setRecipientImageUrl(String str) {
        this.recipientImageUrl = str;
    }

    public void setRecipientMobileNo(String str) {
        this.recipientMobileNo = str;
    }

    public void setRecipientName(String str) {
        this.recipientName = str;
    }

    public void setRecipientType(int i7) {
        this.recipientType = i7;
    }

    public void setScheduleType(int i7) {
        this.scheduleType = i7;
    }

    public void setScheduleValue(int i7) {
        this.scheduleValue = i7;
    }
}
