package com.transsnet.palmpay.account.bean;

import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import com.google.gson.annotations.Expose;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.util.DeviceUtils;
import com.transsnet.palmpay.util.PhoneUtils;
import com.transsnet.palmpay.util.ScreenUtils;
import p059e1.a;

/* JADX INFO: loaded from: classes3.dex */
public class SignUpInReq {
    public String addressLine1;
    public String annualIncome;
    public String areaCode;
    public String areaName;
    public String birthday;
    public String certificatesId;
    public String certificatesType;
    public String countryCode;
    public boolean currentPolitically;
    public String faceToken;
    public String fcmToken;
    public String firstName;
    public String gaid;
    public String gender;
    public String industry;
    public String lastName;
    public String lgaCode;
    public String lgaName;
    public String middleName;
    public String mobileNo;

    @Expose(deserialize = true, serialize = false)
    public transient String mtnAuthCode;
    public String nationality;
    public String pin;
    public boolean politicallyExposedPerson;
    public String positionHeld;
    public String profession;
    public String smsToken;
    public String sourceOfFunds;
    public String stateCode;
    public String stateName;
    public String street;
    public boolean supplement;
    public String verifyToken;
    public String verifyTokenNumber;
    public String appVersion = BaseApplication.get().getVersionName();
    public String appId = "P260617092568177297851";
    public String brand = DeviceUtils.getManufacturer();
    public String deviceInfo = DeviceUtils.getAndroidID();
    public String deviceModel = DeviceUtils.getModel();
    public String deviceVersion = "Android" + DeviceUtils.getSDKVersionName();
    public String imei = PhoneUtils.getUniqueId();
    public String resolution = ScreenUtils.getScreenHeight() + "X" + ScreenUtils.getScreenWidth() + "_" + ScreenUtils.getScreenDensityDpi();
    private final String rnVer = BaseApplication.get().getCodePushData();
    private String appsflyerID = AppsFlyerLib.getInstance().getAppsFlyerUID(BaseApplication.get());
    private String appInstanceId = a.H("firebase_sp_firebase_analytics_instance_id");

    public boolean isVerifyTokenValid(boolean z3) {
        if (z3) {
            return true;
        }
        return (TextUtils.isEmpty(this.verifyToken) || TextUtils.isEmpty(this.verifyTokenNumber) || !this.verifyTokenNumber.equals(this.mobileNo)) ? false : true;
    }
}
