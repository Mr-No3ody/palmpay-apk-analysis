package com.transsnet.palmpay.core.bean.device;

import F6.d;
import com.transsnet.palmpay.util.PhoneUtils;

/* JADX INFO: loaded from: classes3.dex */
public class SetDeviceNotificationReq {
    private String imei;
    private int receiveNotificationsFlag;

    public SetDeviceNotificationReq(boolean z3) {
        try {
            this.imei = PhoneUtils.getUniqueId();
        } catch (SecurityException e10) {
            d.c("DeviceNotification", "SetDeviceNotificationReq: ", e10);
        }
        this.receiveNotificationsFlag = !z3 ? 1 : 0;
    }

    public String getImei() {
        return this.imei;
    }

    public int getReceiveNotificationsFlag() {
        return this.receiveNotificationsFlag;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public void setReceiveNotificationsFlag(int receiveNotificationsFlag) {
        this.receiveNotificationsFlag = receiveNotificationsFlag;
    }
}
