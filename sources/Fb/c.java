package Fb;

import Pa.AbstractC0514k;
import Wf.AbstractC0780y;
import Wf.V;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.location.LocationManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.LocationRecord;
import com.transsnet.palmpay.core.bean.cashier.FlexiOneClickOpenReq;
import com.transsnet.palmpay.core.bean.req.UploadDeviceInfoReq;
import com.transsnet.palmpay.credit.bean.req.OcUploadDeviceInfo;
import com.transsnet.palmpay.credit.bean.req.OcUploadDeviceInfo.AppInfo;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.DeviceUtils;
import com.transsnet.palmpay.util.NetworkUtils;
import com.transsnet.palmpay.util.PermissionUtils;
import com.transsnet.palmpay.util.PhoneUtils;
import com.transsnet.palmpay.util.SDCardUtils;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.u;

/* JADX INFO: loaded from: classes4.dex */
public final class c {
    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String convertBoolean(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue() ? "1" : "0";
        }
        return FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<OcUploadDeviceInfo.AppInfo> getAppList() {
        ArrayList arrayList = new ArrayList();
        int i7 = BaseApplication.get().isOldAndroidDevice() ? 400 : 1500;
        try {
            PackageManager packageManager = BaseApplication.get().getPackageManager();
            for (PackageInfo packageInfo : packageManager.getInstalledPackages(0)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if (applicationInfo != null) {
                    arrayList.add(new OcUploadDeviceInfo().new AppInfo(applicationInfo.loadLabel(packageManager).toString(), packageInfo.versionName));
                }
                if (arrayList.size() > i7) {
                    break;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return arrayList;
    }

    public static /* synthetic */ UploadDeviceInfoReq.DeviceInfoBean getOcDeviceInfo$default(c cVar, String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        if ((i7 & 4) != 0) {
            str3 = null;
        }
        return cVar.getOcDeviceInfo(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTotalPhotos() {
        int count = 0;
        try {
            Cursor cursorQuery = BaseApplication.get().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, null, null, null);
            if (cursorQuery == null) {
                return 0;
            }
            count = cursorQuery.getCount();
            cursorQuery.close();
            return count;
        } catch (Exception e10) {
            e10.printStackTrace();
            return count;
        }
    }

    private final boolean hasSimCard(Context context) {
        try {
            Object systemService = context.getSystemService("phone");
            Intrinsics.f(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            int simState = ((TelephonyManager) systemService).getSimState();
            return (simState == 0 || simState == 1) ? false : true;
        } catch (Exception unused) {
        }
    }

    @SuppressLint({"MissingPermission"})
    @NotNull
    public final UploadDeviceInfoReq.DeviceInfoBean getOcDeviceInfo(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        UploadDeviceInfoReq.DeviceInfoBean deviceInfoBean = new UploadDeviceInfoReq.DeviceInfoBean();
        try {
            deviceInfoBean.applyId = str;
            deviceInfoBean.upload_node = str2;
            deviceInfoBean.uploadNode = str2;
            deviceInfoBean.upload_node_detail = str3;
            deviceInfoBean.uploadNodeDetail = str3;
            deviceInfoBean.deviceId1 = androidx.work.impl.model.b.e();
            deviceInfoBean.advertising_id = p367ya.a.d().c();
            deviceInfoBean.android_id = DeviceUtils.getAndroidID();
            deviceInfoBean.base_band = Build.getRadioVersion();
            deviceInfoBean.base_station_no = p264r5.a.m();
            deviceInfoBean.base_station_signal_strenth = PhoneUtils.getCellSignalStrength() + "dB";
            deviceInfoBean.camera_parameters = null;
            deviceInfoBean.cpu_cur_frequency = DeviceUtils.getCurCpuFreq();
            deviceInfoBean.cpu_max_frequency = DeviceUtils.getMaxCpuFreq();
            deviceInfoBean.data_type = "credit";
            deviceInfoBean.device_language = BaseApplication.get().getResources().getConfiguration().locale.getDisplayLanguage();
            deviceInfoBean.device_root = DeviceUtils.isDeviceRooted() ? 1 : 0;
            c cVar = d.f2639a;
            BaseApplication baseApplication = BaseApplication.get();
            Intrinsics.checkNotNullExpressionValue(baseApplication, "get(...)");
            deviceInfoBean.device_sim = cVar.hasSimCard(baseApplication) ? 1 : 0;
            deviceInfoBean.external_ip = null;
            deviceInfoBean.gps_err_msg = "";
            deviceInfoBean.hours_since_last_launch = SystemClock.elapsedRealtime() / 3600000;
            deviceInfoBean.imei = androidx.work.impl.model.b.e();
            try {
                deviceInfoBean.is_gps_permission_opened = PermissionUtils.isGranted(com.transsnet.palmpay.core.config.d.j(), "android.permission.ACCESS_COARSE_LOCATION") ? 1 : 0;
                Object systemService = BaseApplication.get().getSystemService(FirebaseAnalytics.Param.LOCATION);
                Intrinsics.f(systemService, "null cannot be cast to non-null type android.location.LocationManager");
                deviceInfoBean.is_gps_switch_opened = ((LocationManager) systemService).isProviderEnabled("gps") ? 1 : 0;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            Intent intentRegisterReceiver = BaseApplication.get().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if ((intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("status", -1) : -1) != 2) {
            }
            int i7 = Build.VERSION.SDK_INT;
            Object systemService2 = BaseApplication.get().getSystemService("batterymanager");
            Intrinsics.f(systemService2, "null cannot be cast to non-null type android.os.BatteryManager");
            deviceInfoBean.is_phone_charge = ((BatteryManager) systemService2).isCharging() ? 1 : 0;
            LocationRecord locationRecordF = p367ya.a.d().f();
            if (locationRecordF != null) {
                deviceInfoBean.latitude = Double.valueOf(locationRecordF.getLatitude());
                deviceInfoBean.longitude = Double.valueOf(locationRecordF.getLongitude());
            } else {
                deviceInfoBean.latitude = Double.valueOf(9999.0d);
                deviceInfoBean.longitude = Double.valueOf(9999.0d);
            }
            deviceInfoBean.mac = DeviceUtils.getMacAddress();
            deviceInfoBean.meid = i7 > 28 ? "" : PhoneUtils.getMEID();
            deviceInfoBean.new_imei = i7 > 28 ? "" : PhoneUtils.getIMEI2();
            deviceInfoBean.os_version = "Android" + DeviceUtils.getSDKVersionName();
            deviceInfoBean.phone_brand = DeviceUtils.getManufacturer();
            Object systemService3 = BaseApplication.get().getSystemService("batterymanager");
            Intrinsics.f(systemService3, "null cannot be cast to non-null type android.os.BatteryManager");
            deviceInfoBean.phone_electric_quantity = String.valueOf(((BatteryManager) systemService3).getIntProperty(4));
            deviceInfoBean.phone_model = DeviceUtils.getModel();
            deviceInfoBean.screen_density = String.valueOf(ScreenUtils.getScreenDensityDpi());
            deviceInfoBean.screen_resolution = ScreenUtils.getScreenWidth() + "x" + ScreenUtils.getScreenHeight();
            long sDTotalSize = SDCardUtils.getSDTotalSize();
            deviceInfoBean.sdcard_total_capacity = sDTotalSize;
            deviceInfoBean.sdcard_used_capacity = sDTotalSize - SDCardUtils.getSDFreeSize();
            deviceInfoBean.sim_card_status = PhoneUtils.getSimState();
            deviceInfoBean.sim_code = i7 > 28 ? "" : PhoneUtils.getIMSI();
            deviceInfoBean.sn = Build.SERIAL;
            ActivityManager activityManager = (ActivityManager) BaseApplication.get().getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                long j6 = memoryInfo.totalMem;
                long j10 = 1024;
                deviceInfoBean.total_memory = (j6 / j10) / j10;
                deviceInfoBean.used_memory = ((j6 - memoryInfo.availMem) / j10) / j10;
            }
            deviceInfoBean.total_storage = SDCardUtils.getSDTotalSize();
            deviceInfoBean.wifi_conneted = NetworkUtils.isWifiConnected() ? 1 : 0;
            u uVarX = p264r5.a.x();
            if (uVarX != null) {
                Object obj = uVarX.f43987c;
                deviceInfoBean.wifi = (String) uVarX.f43985a;
                deviceInfoBean.wifi_level = (Integer) uVarX.f43986b;
                deviceInfoBean.mac = (TextUtils.isEmpty((CharSequence) obj) || "02:00:00:00:00:00".equals(obj)) ? p264r5.a.u() : (String) obj;
            } else {
                deviceInfoBean.mac = p264r5.a.u();
            }
            deviceInfoBean.camera_parameters = null;
            deviceInfoBean.base_station = p264r5.a.m();
            deviceInfoBean.app_version = Integer.valueOf(AppUtils.getAppVersionCode());
            deviceInfoBean.build_board = Build.BOARD;
            deviceInfoBean.build_brand = Build.BRAND;
            deviceInfoBean.build_host = Build.HOST;
            deviceInfoBean.build_id = Build.ID;
            deviceInfoBean.build_tags = Build.TAGS;
            deviceInfoBean.build_type = Build.TYPE;
            deviceInfoBean.build_user = Build.USER;
            deviceInfoBean.carrier_mobile_country_code = PhoneUtils.getSimOperatorCode();
            deviceInfoBean.carrier_operator = PhoneUtils.getSimOperatorName();
            deviceInfoBean.cpu_architecture = Build.HARDWARE;
            deviceInfoBean.cpu_hardware = DeviceUtils.getCpuModel();
            deviceInfoBean.cpu_min_freq = DeviceUtils.getMinCpuFreq();
            deviceInfoBean.cpu_serial = DeviceUtils.getCpuSerial();
            deviceInfoBean.cpu_speed = DeviceUtils.getCurCpuFreq();
            deviceInfoBean.create_time = Long.valueOf(System.currentTimeMillis());
            deviceInfoBean.deviceID = DeviceUtils.getAndroidID();
            deviceInfoBean.firebaseInstanceId = null;
            AbstractC0514k.f7097a.getClass();
            p367ya.a.d().f44149a.i("key_default_language", "NG");
            deviceInfoBean.geophysics = "NG";
            deviceInfoBean.gps_city = null;
            deviceInfoBean.gps_country = null;
            deviceInfoBean.gps_district = null;
            deviceInfoBean.gps_other = null;
            deviceInfoBean.gps_state = null;
            deviceInfoBean.imei2 = PhoneUtils.getIMEI2();
            deviceInfoBean.imsi = PhoneUtils.getIMSI();
            deviceInfoBean.login_time = null;
            deviceInfoBean.media_uuid = null;
            deviceInfoBean.phone_number = PhoneUtils.getSimMSISDN();
            deviceInfoBean.phone_type = Integer.valueOf(PhoneUtils.getSimType());
            deviceInfoBean.sim1_phone_no = PhoneUtils.getSimMSISDN();
            deviceInfoBean.sim2_phone_no = "";
            deviceInfoBean.sim_country_iso = PhoneUtils.getSimCountry();
            deviceInfoBean.sim_lac = PhoneUtils.getLac();
            deviceInfoBean.sim_mcc = PhoneUtils.getSimMcc();
            deviceInfoBean.sim_mnc = PhoneUtils.getSimMnc();
            deviceInfoBean.sim_serial = PhoneUtils.getSimSerialNumber();
            deviceInfoBean.sim_cnt = String.valueOf(SubscriptionManager.from(BaseApplication.get()).getActiveSubscriptionInfoCount());
            deviceInfoBean.slot_count = Integer.valueOf(SubscriptionManager.from(BaseApplication.get()).getActiveSubscriptionInfoCountMax());
            deviceInfoBean.screen_brightness = String.valueOf(ScreenUtils.getScreenBrightness());
            deviceInfoBean.disk_free_total_space = String.valueOf(SDCardUtils.getSDFreeSize());
            deviceInfoBean.is_equipment_breakout = NetworkUtils.isConnected();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return deviceInfoBean;
    }

    @SuppressLint({"MissingPermission"})
    public final void uploadDeviceInfo() {
        if (SPUtils.getInstance().getLong("key_last_upload_oc_device_info", System.currentTimeMillis()) + 3600000 < System.currentTimeMillis()) {
            return;
        }
        AbstractC0780y.m(V.f10828a, null, null, new b(2, null), 3);
    }

    private c() {
    }
}
