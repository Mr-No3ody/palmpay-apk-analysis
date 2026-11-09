package Pa;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.LocationRecord;
import com.transsnet.palmpay.core.bean.req.UploadAppListV2Req;
import com.transsnet.palmpay.core.bean.req.UploadDeviceInfoV2Req;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.DeviceUtils;
import com.transsnet.palmpay.util.NetworkUtils;
import com.transsnet.palmpay.util.PhoneUtils;
import com.transsnet.palmpay.util.SDCardUtils;
import java.math.BigDecimal;
import java.util.ArrayList;

/* JADX INFO: renamed from: Pa.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0509f {
    public static ArrayList a(int i7) {
        ArrayList arrayList = new ArrayList();
        try {
            PackageManager packageManager = BaseApplication.get().getPackageManager();
            int i10 = 0;
            for (PackageInfo packageInfo : packageManager.getInstalledPackages(0)) {
                if (i7 > 0) {
                    i7--;
                } else {
                    ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                    if (applicationInfo != null) {
                        UploadAppListV2Req.AppListBean appListBean = new UploadAppListV2Req.AppListBean();
                        appListBean.appCreateTime = packageInfo.firstInstallTime;
                        appListBean.appUpdateTime = packageInfo.lastUpdateTime;
                        appListBean.appName = applicationInfo.loadLabel(packageManager).toString();
                        appListBean.appPackageName = applicationInfo.packageName;
                        int i11 = applicationInfo.flags;
                        int i12 = 1;
                        if (i11 != 1) {
                            i12 = 0;
                        }
                        appListBean.appType = i12;
                        arrayList.add(appListBean);
                        i10++;
                        if (i10 >= 50) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
        } catch (Exception unused) {
            F6.d.h("CollectDeviceInfoUtils", 3, "getAppList: ");
        }
        return arrayList;
    }

    public static UploadDeviceInfoV2Req b() {
        UploadDeviceInfoV2Req uploadDeviceInfoV2Req = new UploadDeviceInfoV2Req();
        Context context = BaseApplication.getContext();
        uploadDeviceInfoV2Req.appVersion = BaseApplication.get().getVersionName();
        uploadDeviceInfoV2Req.bssid = NetworkUtils.getConnectWifiSSID();
        uploadDeviceInfoV2Req.cpuid = DeviceUtils.getCpuSerial();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(AppUtils.getAppPackageName(), 0);
            uploadDeviceInfoV2Req.createTime = packageInfo.firstInstallTime;
            uploadDeviceInfoV2Req.updateTime = packageInfo.lastUpdateTime;
        } catch (Exception unused) {
        }
        uploadDeviceInfoV2Req.deviceId = PhoneUtils.getUniqueId();
        uploadDeviceInfoV2Req.gaid = p367ya.a.d().c();
        uploadDeviceInfoV2Req.imei = Build.VERSION.SDK_INT > 28 ? "" : PhoneUtils.getIMEI();
        LocationRecord locationRecordF = p367ya.a.d().f();
        if (locationRecordF != null) {
            uploadDeviceInfoV2Req.lat = BigDecimal.valueOf(locationRecordF.getLatitude()).floatValue();
            uploadDeviceInfoV2Req.lng = BigDecimal.valueOf(locationRecordF.getLongitude()).floatValue();
        } else {
            uploadDeviceInfoV2Req.lat = 9999.0f;
            uploadDeviceInfoV2Req.lng = 9999.0f;
        }
        uploadDeviceInfoV2Req.networkType = NetworkUtils.getNetworkType().name();
        uploadDeviceInfoV2Req.operatorName = PhoneUtils.getSimOperatorName();
        uploadDeviceInfoV2Req.phoneModels = DeviceUtils.getModel();
        uploadDeviceInfoV2Req.proxy = String.valueOf(NetworkUtils.isUsingProxy());
        uploadDeviceInfoV2Req.simStatus = String.valueOf(PhoneUtils.getSimState());
        uploadDeviceInfoV2Req.storage = String.valueOf(SDCardUtils.getSDTotalSize());
        uploadDeviceInfoV2Req.systemVersion = C0.G.o("Android", DeviceUtils.getSDKVersionName());
        uploadDeviceInfoV2Req.vpn = String.valueOf(NetworkUtils.isUsingVPN());
        return uploadDeviceInfoV2Req;
    }
}
