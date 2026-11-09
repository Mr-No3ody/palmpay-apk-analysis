package p083fb;

import Pa.AbstractC0514k;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.camera.core.impl.utils.executor.g;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.logging.type.LogSeverity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.LocationRecord;
import com.transsnet.palmpay.core.bean.req.UploadDeviceInfoReq;
import com.transsnet.palmpay.core.config.d;
import com.transsnet.palmpay.credit.businessLoan.export.bean.req.c;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.DeviceUtils;
import com.transsnet.palmpay.util.NetworkUtils;
import com.transsnet.palmpay.util.PermissionUtils;
import com.transsnet.palmpay.util.PhoneUtils;
import com.transsnet.palmpay.util.SDCardUtils;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.r;
import kotlin.collections.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2126e;
import p355xf.u;
import p367ya.a;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    private final List<com.transsnet.palmpay.credit.businessLoan.export.bean.req.b> getAppList() {
        String str;
        String string;
        String str2;
        int i7 = BaseApplication.get().isOldAndroidDevice() ? 400 : LogSeverity.EMERGENCY_VALUE;
        try {
            PackageManager packageManager = BaseApplication.get().getPackageManager();
            c owner = new c();
            Intrinsics.e(packageManager);
            try {
                List<PackageInfo> installedPackagesCompat = getInstalledPackagesCompat(packageManager);
                installedPackagesCompat.size();
                installedPackagesCompat.isEmpty();
                ArrayList<d> snapshots = new ArrayList();
                for (PackageInfo packageInfo : installedPackagesCompat) {
                    ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                    if (applicationInfo != null) {
                        String packageName = applicationInfo.packageName;
                        if (packageName == null) {
                            packageName = packageInfo.packageName;
                            Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                        }
                        String str3 = packageInfo.versionName;
                        long j6 = packageInfo.firstInstallTime;
                        long j10 = packageInfo.lastUpdateTime;
                        int i10 = applicationInfo.flags;
                        if (packageName == null) {
                            str = "unknown";
                        } else {
                            if (StringsKt.F(packageName)) {
                                packageName = null;
                            }
                            if (packageName == null) {
                                str = "unknown";
                            } else {
                                str = packageName;
                            }
                        }
                        try {
                            CharSequence charSequenceLoadLabel = applicationInfo.loadLabel(packageManager);
                            if (charSequenceLoadLabel == null || (string = charSequenceLoadLabel.toString()) == null) {
                                string = str;
                            } else {
                                if (StringsKt.F(string)) {
                                    string = null;
                                }
                                if (string == null) {
                                    string = str;
                                }
                            }
                        } catch (Exception unused) {
                        }
                        if (str3 != null) {
                            if (StringsKt.F(str3)) {
                                str3 = null;
                            }
                            str2 = str3 == null ? "unknown" : str3;
                        }
                        snapshots.add(new d(string, str2, str, j6, j10, (i10 & 1) == 0 ? 0 : 1));
                    }
                    if (snapshots.size() >= i7) {
                        break;
                    }
                }
                snapshots.size();
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(snapshots, "snapshots");
                ArrayList arrayList = new ArrayList(r.l(snapshots, 10));
                for (d snapshot : snapshots) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    Intrinsics.checkNotNullParameter(snapshot, "snapshot");
                    arrayList.add(new com.transsnet.palmpay.credit.businessLoan.export.bean.req.b(owner, snapshot.f36437a, snapshot.f36438b, snapshot.f36439c, snapshot.f36440d, snapshot.f36441e, snapshot.f36442f));
                }
                return arrayList;
            } catch (Exception e10) {
                e = e10;
                Log.e("DeviceInfoUtils", "收集应用列表时发生错误", e);
                e.printStackTrace();
                return z.f38935a;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    private final List<PackageInfo> getInstalledPackagesCompat(PackageManager packageManager) {
        List<PackageInfo> installedPackages = Build.VERSION.SDK_INT >= 33 ? packageManager.getInstalledPackages(PackageManager.PackageInfoFlags.of(0L)) : packageManager.getInstalledPackages(0);
        Intrinsics.e(installedPackages);
        return installedPackages;
    }

    public static /* synthetic */ UploadDeviceInfoReq.DeviceInfoBean getOcDeviceInfo$default(b bVar, String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        if ((i7 & 4) != 0) {
            str3 = null;
        }
        return bVar.getOcDeviceInfo(str, str2, str3);
    }

    public static /* synthetic */ c getOcDeviceInfoWithAppList$default(b bVar, String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        if ((i7 & 4) != 0) {
            str3 = null;
        }
        return bVar.getOcDeviceInfoWithAppList(str, str2, str3);
    }

    public static /* synthetic */ UploadDeviceInfoReq.DeviceInfoBean getOcDeviceInfoWithoutAppList$default(b bVar, String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        if ((i7 & 4) != 0) {
            str3 = null;
        }
        return bVar.getOcDeviceInfoWithoutAppList(str, str2, str3);
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
        String iPAddress;
        UploadDeviceInfoReq.DeviceInfoBean deviceInfoBean = new UploadDeviceInfoReq.DeviceInfoBean();
        try {
            deviceInfoBean.applyId = str;
            deviceInfoBean.upload_node = str2;
            deviceInfoBean.uploadNode = str2;
            deviceInfoBean.upload_node_detail = str3;
            deviceInfoBean.uploadNodeDetail = str3;
            deviceInfoBean.deviceId1 = androidx.work.impl.model.b.e();
            deviceInfoBean.advertising_id = a.d().c();
            deviceInfoBean.android_id = DeviceUtils.getAndroidID();
            deviceInfoBean.base_band = Build.getRadioVersion();
            deviceInfoBean.base_station_no = g.i();
            deviceInfoBean.base_station_signal_strenth = PhoneUtils.getCellSignalStrength() + "dB";
            deviceInfoBean.camera_parameters = null;
            deviceInfoBean.cpu_cur_frequency = DeviceUtils.getCurCpuFreq();
            deviceInfoBean.cpu_max_frequency = DeviceUtils.getMaxCpuFreq();
            deviceInfoBean.data_type = "credit";
            deviceInfoBean.device_language = BaseApplication.get().getResources().getConfiguration().locale.getDisplayLanguage();
            deviceInfoBean.device_root = DeviceUtils.isDeviceRooted() ? 1 : 0;
            b bVar = c.f36436a;
            BaseApplication baseApplication = BaseApplication.get();
            Intrinsics.checkNotNullExpressionValue(baseApplication, "get(...)");
            deviceInfoBean.device_sim = bVar.hasSimCard(baseApplication) ? 1 : 0;
            try {
                iPAddress = NetworkUtils.getIPAddress(false);
            } catch (Exception unused) {
                iPAddress = null;
            }
            deviceInfoBean.external_ip = iPAddress;
            deviceInfoBean.gps_err_msg = "";
            deviceInfoBean.hours_since_last_launch = SystemClock.elapsedRealtime() / 3600000;
            deviceInfoBean.imei = androidx.work.impl.model.b.e();
            try {
                deviceInfoBean.is_gps_permission_opened = PermissionUtils.isGranted(d.j(), "android.permission.ACCESS_COARSE_LOCATION") ? 1 : 0;
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
            LocationRecord locationRecordF = a.d().f();
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
            u uVarV = g.v();
            if (uVarV != null) {
                Object obj = uVarV.f43987c;
                deviceInfoBean.wifi = (String) uVarV.f43985a;
                deviceInfoBean.wifi_level = (Integer) uVarV.f43986b;
                deviceInfoBean.mac = (TextUtils.isEmpty((CharSequence) obj) || "02:00:00:00:00:00".equals(obj)) ? g.t() : (String) obj;
            } else {
                deviceInfoBean.mac = g.t();
            }
            deviceInfoBean.camera_parameters = null;
            deviceInfoBean.base_station = g.i();
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
            a.d().f44149a.i("key_default_language", "NG");
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
            Log.e("DeviceInfoUtils", "getOcDeviceInfo 主要逻辑发生异常", e11);
            Log.e("DeviceInfoUtils", "异常详细信息: " + e11.getMessage());
            Log.e("DeviceInfoUtils", "异常堆栈: " + C2126e.b(e11));
            e11.printStackTrace();
        }
        return deviceInfoBean;
    }

    @SuppressLint({"MissingPermission"})
    @NotNull
    public final c getOcDeviceInfoWithAppList(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        c cVar = new c();
        try {
            List<com.transsnet.palmpay.credit.businessLoan.export.bean.req.b> appList = getAppList();
            appList.size();
            cVar.appInfo = appList;
            if (!appList.isEmpty()) {
                String str4 = appList.get(0).app_name;
            }
            List<com.transsnet.palmpay.credit.businessLoan.export.bean.req.b> list = cVar.appInfo;
            if (list != null) {
                list.size();
            }
            return cVar;
        } catch (Exception e10) {
            Log.e("DeviceInfoUtils", "getOcDeviceInfoWithAppList发生异常", e10);
            cVar.appInfo = new ArrayList();
            return cVar;
        }
    }

    @SuppressLint({"MissingPermission"})
    @NotNull
    public final UploadDeviceInfoReq.DeviceInfoBean getOcDeviceInfoWithoutAppList(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        String iPAddress;
        UploadDeviceInfoReq.DeviceInfoBean deviceInfoBean = new UploadDeviceInfoReq.DeviceInfoBean();
        try {
            deviceInfoBean.applyId = str;
            deviceInfoBean.upload_node = str2;
            deviceInfoBean.uploadNodeDetail = str3;
            deviceInfoBean.deviceId1 = DeviceUtils.getAndroidID();
            deviceInfoBean.deviceID = DeviceUtils.getAndroidID();
            deviceInfoBean.imei = androidx.work.impl.model.b.e();
            deviceInfoBean.phone_brand = DeviceUtils.getManufacturer();
            deviceInfoBean.phone_model = DeviceUtils.getModel();
            deviceInfoBean.app_version = Integer.valueOf(AppUtils.getAppVersionCode());
            deviceInfoBean.os_version = "Android" + DeviceUtils.getSDKVersionName();
            LocationRecord locationRecordF = a.d().f();
            deviceInfoBean.latitude = locationRecordF != null ? Double.valueOf(locationRecordF.getLatitude()) : Double.valueOf(0.0d);
            deviceInfoBean.longitude = locationRecordF != null ? Double.valueOf(locationRecordF.getLongitude()) : Double.valueOf(0.0d);
            deviceInfoBean.device_root = DeviceUtils.isDeviceRooted() ? 1 : 0;
            deviceInfoBean.wifi_conneted = NetworkUtils.isWifiConnected() ? 1 : 0;
            try {
                iPAddress = NetworkUtils.getIPAddress(false);
            } catch (Exception unused) {
                iPAddress = null;
            }
            deviceInfoBean.external_ip = iPAddress;
            deviceInfoBean.is_equipment_breakout = NetworkUtils.isConnected();
            u uVarV = g.v();
            if (uVarV != null) {
                Object obj = uVarV.f43987c;
                deviceInfoBean.wifi = (String) uVarV.f43985a;
                deviceInfoBean.mac = (TextUtils.isEmpty((CharSequence) obj) || "02:00:00:00:00:00".equals(obj)) ? g.t() : (String) obj;
            } else {
                deviceInfoBean.wifi = "";
                deviceInfoBean.mac = g.t();
            }
        } catch (Exception e10) {
            Log.e("DeviceInfoUtils", "getOcDeviceInfoWithoutAppList 主要逻辑发生异常", e10);
            e10.printStackTrace();
        }
        return deviceInfoBean;
    }

    private b() {
    }
}
