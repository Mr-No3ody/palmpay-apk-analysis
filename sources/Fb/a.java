package Fb;

import C0.G;
import android.app.ActivityManager;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.os.SystemClock;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.credit.bean.req.OcUploadDeviceInfo;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import com.transsnet.palmpay.util.DeviceUtils;
import com.transsnet.palmpay.util.NetworkUtils;
import com.transsnet.palmpay.util.PhoneUtils;
import com.transsnet.palmpay.util.SDCardUtils;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.List;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2637a;

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(2, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        String strConvertBoolean;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f2637a;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                OcUploadDeviceInfo ocUploadDeviceInfo = new OcUploadDeviceInfo();
                ocUploadDeviceInfo.cpu_architecture = DeviceUtils.getCpuModel();
                try {
                    ocUploadDeviceInfo.cpu_max_freq = Integer.parseInt(DeviceUtils.getMaxCpuFreq());
                    ocUploadDeviceInfo.cpu_min_freq = Integer.parseInt(DeviceUtils.getMinCpuFreq());
                } catch (Exception unused) {
                }
                ocUploadDeviceInfo.cpu_serial = DeviceUtils.getCpuSerial();
                ocUploadDeviceInfo.disk_total_space = SDCardUtils.getSDTotalSize();
                ocUploadDeviceInfo.disk_free_space = SDCardUtils.getSDFreeSize();
                ActivityManager activityManager = (ActivityManager) BaseApplication.get().getSystemService("activity");
                if (activityManager != null) {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    ocUploadDeviceInfo.memory_total = String.valueOf(memoryInfo.totalMem / ((long) 1024));
                }
                ocUploadDeviceInfo.heap_size = String.valueOf(DeviceUtils.getVmHeepSize());
                ocUploadDeviceInfo.sim_state = PhoneUtils.getSimState();
                ocUploadDeviceInfo.imsi = PhoneUtils.getIMSI();
                ocUploadDeviceInfo.sim_serial = PhoneUtils.getSimSerialNumber();
                ocUploadDeviceInfo.phone_number = PhoneUtils.getSimMSISDN();
                ocUploadDeviceInfo.phone_type = PhoneUtils.getPhoneType();
                ocUploadDeviceInfo.carrier_mobile_country_code = PhoneUtils.getSimOperator();
                try {
                    ocUploadDeviceInfo.sim_lac = Integer.parseInt(PhoneUtils.getLac());
                } catch (Exception unused2) {
                }
                try {
                    ocUploadDeviceInfo.sim_cid = Integer.parseInt(p264r5.a.m());
                } catch (Exception unused3) {
                }
                ocUploadDeviceInfo.sim_strength = PhoneUtils.getCellSignalStrength();
                ocUploadDeviceInfo.incremental = Build.getRadioVersion();
                ocUploadDeviceInfo.radio_version = Build.getRadioVersion();
                ocUploadDeviceInfo.sim_timezone = TimeZone.getDefault().getDisplayName();
                ocUploadDeviceInfo.internet_type = NetworkUtils.getNetworkType().name();
                c cVar = d.f2639a;
                ocUploadDeviceInfo.has_cellular = cVar.convertBoolean(Boolean.valueOf(PhoneUtils.getPhoneType() == 0));
                ocUploadDeviceInfo.has_telephony = cVar.convertBoolean(Boolean.valueOf(PhoneUtils.getPhoneType() == 0));
                PackageManager packageManager = BaseApplication.get().getPackageManager();
                ocUploadDeviceInfo.has_wifi = cVar.convertBoolean(Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.wifi")));
                ocUploadDeviceInfo.has_gps = cVar.convertBoolean(Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.location.gps")));
                ocUploadDeviceInfo.has_nfc = cVar.convertBoolean(Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.nfc")));
                ocUploadDeviceInfo.has_nfc_host = cVar.convertBoolean(Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.nfc.hce")));
                ocUploadDeviceInfo.has_bluetooth = cVar.convertBoolean(Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.bluetooth")));
                ocUploadDeviceInfo.has_wi_fi_direct = cVar.convertBoolean(Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.wifi.direct")));
                ocUploadDeviceInfo.has_otg = cVar.convertBoolean(Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.usb.host")));
                ocUploadDeviceInfo.has_aoa = cVar.convertBoolean(Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.usb.accessory")));
                Intent intentRegisterReceiver = BaseApplication.get().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                int i10 = -1;
                ocUploadDeviceInfo.battery_charge_status = String.valueOf(intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("status", -1) : -1);
                ocUploadDeviceInfo.battery_charge_plug = String.valueOf(intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("plugged", -1) : -1);
                ocUploadDeviceInfo.battery_level = String.valueOf(intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1) : -1);
                ocUploadDeviceInfo.os_version_int = Build.VERSION.SDK_INT;
                ocUploadDeviceInfo.boot_times = SystemClock.elapsedRealtime();
                ocUploadDeviceInfo.is_emulator = cVar.convertBoolean(Boolean.valueOf(DeviceUtils.isEmulator()));
                ocUploadDeviceInfo.is_root = cVar.convertBoolean(Boolean.valueOf(DeviceUtils.isDeviceRooted()));
                ocUploadDeviceInfo.user = Build.USER;
                ocUploadDeviceInfo.code_name = Build.VERSION.CODENAME;
                try {
                    Object systemService = BaseApplication.get().getSystemService(FirebaseAnalytics.Param.LOCATION);
                    Intrinsics.f(systemService, "null cannot be cast to non-null type android.location.LocationManager");
                    strConvertBoolean = cVar.convertBoolean(Boolean.valueOf(((LocationManager) systemService).isProviderEnabled("gps")));
                } catch (Exception unused4) {
                    strConvertBoolean = d.f2639a.convertBoolean(Boolean.FALSE);
                }
                ocUploadDeviceInfo.is_open_gps = strConvertBoolean;
                ocUploadDeviceInfo.screen_brightness = String.valueOf(ScreenUtils.getScreenBrightness());
                ocUploadDeviceInfo.screen_manual_mode = String.valueOf(ScreenUtils.getScreenManualMode());
                c cVar2 = d.f2639a;
                ocUploadDeviceInfo.total_photos = String.valueOf(cVar2.getTotalPhotos());
                ocUploadDeviceInfo.is_conn_vpn = cVar2.convertBoolean(Boolean.valueOf(DeviceUtils.isInVPN()));
                ocUploadDeviceInfo.mobile_dbm = PhoneUtils.getCellSignalStrength();
                ocUploadDeviceInfo.eth_ip = NetworkUtils.getIPAddress(true);
                Object systemService2 = BaseApplication.get().getSystemService("sensor");
                Intrinsics.f(systemService2, "null cannot be cast to non-null type android.hardware.SensorManager");
                SensorManager sensorManager = (SensorManager) systemService2;
                List<Sensor> sensorList = sensorManager.getSensorList(4);
                Intrinsics.checkNotNullExpressionValue(sensorList, "getSensorList(...)");
                ocUploadDeviceInfo.gyro_scope_sensor_list = cVar2.convertBoolean(Boolean.valueOf(!sensorList.isEmpty()));
                List<Sensor> sensorList2 = sensorManager.getSensorList(1);
                Intrinsics.checkNotNullExpressionValue(sensorList2, "getSensorList(...)");
                ocUploadDeviceInfo.accelerometer_sensor_list = cVar2.convertBoolean(Boolean.valueOf(!sensorList2.isEmpty()));
                List<Sensor> sensorList3 = sensorManager.getSensorList(9);
                Intrinsics.checkNotNullExpressionValue(sensorList3, "getSensorList(...)");
                ocUploadDeviceInfo.gravity_sensor_list = cVar2.convertBoolean(Boolean.valueOf(!sensorList3.isEmpty()));
                List<Sensor> sensorList4 = sensorManager.getSensorList(2);
                Intrinsics.checkNotNullExpressionValue(sensorList4, "getSensorList(...)");
                ocUploadDeviceInfo.magnetic_sensor_list = cVar2.convertBoolean(Boolean.valueOf(!sensorList4.isEmpty()));
                List<Sensor> sensorList5 = sensorManager.getSensorList(5);
                Intrinsics.checkNotNullExpressionValue(sensorList5, "getSensorList(...)");
                ocUploadDeviceInfo.light_sensor_list = cVar2.convertBoolean(Boolean.valueOf(!sensorList5.isEmpty()));
                List<Sensor> sensorList6 = sensorManager.getSensorList(8);
                Intrinsics.checkNotNullExpressionValue(sensorList6, "getSensorList(...)");
                ocUploadDeviceInfo.proximity_sensor_list = cVar2.convertBoolean(Boolean.valueOf(!sensorList6.isEmpty()));
                List<Sensor> sensorList7 = sensorManager.getSensorList(3);
                Intrinsics.checkNotNullExpressionValue(sensorList7, "getSensorList(...)");
                ocUploadDeviceInfo.orientation_sensor_list = cVar2.convertBoolean(Boolean.valueOf(!sensorList7.isEmpty()));
                List<Sensor> sensorList8 = sensorManager.getSensorList(10);
                Intrinsics.checkNotNullExpressionValue(sensorList8, "getSensorList(...)");
                ocUploadDeviceInfo.linear_acceleration_sensor_list = cVar2.convertBoolean(Boolean.valueOf(!sensorList8.isEmpty()));
                List<Sensor> sensorList9 = sensorManager.getSensorList(6);
                Intrinsics.checkNotNullExpressionValue(sensorList9, "getSensorList(...)");
                ocUploadDeviceInfo.pressure_sensor_list = cVar2.convertBoolean(Boolean.valueOf(!sensorList9.isEmpty()));
                ocUploadDeviceInfo.is_current_wifi = NetworkUtils.isWifiConnected() ? 1 : 0;
                WifiInfo connectWifiInfo = NetworkUtils.getConnectWifiInfo();
                if (connectWifiInfo != null) {
                    ocUploadDeviceInfo.wifi_frequency = connectWifiInfo.getFrequency();
                    ocUploadDeviceInfo.wifi_bssid = connectWifiInfo.getBSSID();
                    ocUploadDeviceInfo.wifi_level = connectWifiInfo.getRssi();
                    ocUploadDeviceInfo.wifi_ssid = connectWifiInfo.getSSID();
                    ocUploadDeviceInfo.wifi_capabilities = NetworkUtils.getConnectWifCapabilities();
                }
                ocUploadDeviceInfo.bond_state = NetworkUtils.getBluetoothState();
                try {
                    i10 = !BluetoothAdapter.getDefaultAdapter().getBondedDevices().isEmpty() ? 1 : 0;
                } catch (Throwable unused5) {
                }
                ocUploadDeviceInfo.is_bounded = i10;
                ocUploadDeviceInfo.blue_tooth_address = NetworkUtils.getBluetoothAddress();
                ocUploadDeviceInfo.blue_tooth_name = NetworkUtils.getBluetoothName();
                ocUploadDeviceInfo.blue_tooth_type = NetworkUtils.getBluetoothType();
                ocUploadDeviceInfo.appInfo = d.f2639a.getAppList();
                p221ob.c.f40268a.getInstance().getClass();
                IApiCreditService iApiCreditServiceA = p221ob.c.a();
                this.f2637a = 1;
                obj = iApiCreditServiceA.uploadDeviceInfo(ocUploadDeviceInfo, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            CommonResult commonResult = (CommonResult) obj;
            if (commonResult.isSuccess()) {
                SPUtils.getInstance().put("key_last_upload_oc_device_info", System.currentTimeMillis());
            }
            F6.d.h("DeviceInfoUtils", 3, G.o("uploadDeviceInfo: ", commonResult.getRespMsg()));
            return Unit.f38893a;
        } catch (Exception unused6) {
            return Unit.f38893a;
        }
    }
}
