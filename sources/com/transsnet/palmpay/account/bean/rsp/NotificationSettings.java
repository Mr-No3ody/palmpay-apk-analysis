package com.transsnet.palmpay.account.bean.rsp;

/* JADX INFO: loaded from: classes3.dex */
public class NotificationSettings {
    public int message_alert;
    public int payments_alert;
    public Integer sceneCode;

    public boolean isNotificationAllEnabled() {
        return this.message_alert == 1 && this.payments_alert == 1;
    }
}
