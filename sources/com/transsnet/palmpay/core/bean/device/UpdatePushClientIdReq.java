package com.transsnet.palmpay.core.bean.device;

import androidx.core.app.M;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.util.DeviceUtils;
import com.transsnet.palmpay.util.PhoneUtils;

/* JADX INFO: loaded from: classes3.dex */
public class UpdatePushClientIdReq {
    public String appInstanceId;
    public String appsflyerID;
    public String faceGuardToken;
    public String fcmToken;
    public String gaId;
    public boolean notificationEnable;
    public String rnVer;
    public String appVersion = BaseApplication.get().getVersionName();
    public String brand = DeviceUtils.getManufacturer();
    public String deviceInfo = DeviceUtils.getAndroidID();
    public String deviceModel = DeviceUtils.getModel();
    public String deviceVersion = "Android" + DeviceUtils.getSDKVersionName();
    public String imei = PhoneUtils.getUniqueId();

    public UpdatePushClientIdReq() {
        if (BaseApplication.getContext() != null) {
            this.notificationEnable = new M(BaseApplication.getContext()).f15943b.areNotificationsEnabled();
        }
    }
}
