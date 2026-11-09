package com.transsnet.palmpay.send_money.bean.event;

/* JADX INFO: loaded from: classes4.dex */
public class AddRecipientEvent {
    private int recipientType;

    public AddRecipientEvent(int i7) {
        this.recipientType = i7;
    }

    public int getRecipientType() {
        return this.recipientType;
    }

    public void setRecipientType(int i7) {
        this.recipientType = i7;
    }
}
