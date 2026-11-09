package com.transsnet.palmpay.send_money.bean;

/* JADX INFO: loaded from: classes4.dex */
public class EditRecipientReq {
    private long amount;
    private String label;
    private String recipientId;
    private int recipientType;
    private boolean request;
    private int scheduleType = 1;
    private int scheduleValue;

    public long getAmount() {
        return this.amount;
    }

    public String getLabel() {
        return this.label;
    }

    public String getRecipientId() {
        return this.recipientId;
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

    public boolean isRequest() {
        return this.request;
    }

    public void setAmount(long j6) {
        this.amount = j6;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setRecipientId(String str) {
        this.recipientId = str;
    }

    public void setRecipientType(int i7) {
        this.recipientType = i7;
    }

    public void setRequest(boolean z3) {
        this.request = z3;
    }

    public void setScheduleType(int i7) {
        this.scheduleType = i7;
    }

    public void setScheduleValue(int i7) {
        this.scheduleValue = i7;
    }
}
