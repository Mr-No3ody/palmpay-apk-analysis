package p083fb;

import android.content.pm.Signature;
import android.net.wifi.WifiInfo;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.transsnet.palmpay.credit.businessLoan.export.bean.req.b;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.DeviceUtils;
import com.transsnet.palmpay.util.NetworkUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.collections.r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import p053db.c;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static c a(com.transsnet.palmpay.credit.businessLoan.export.bean.req.c cVar) {
        String string;
        String iPAddress;
        String iPAddress2;
        String strK;
        String str;
        String ssid;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String androidID = DeviceUtils.getAndroidID();
        String str2 = androidID == null ? "" : androidID;
        String androidID2 = DeviceUtils.getAndroidID();
        if (androidID2 == null) {
            androidID2 = System.currentTimeMillis() + "-" + UUID.randomUUID();
        }
        String str3 = androidID2;
        String androidID3 = DeviceUtils.getAndroidID();
        String str4 = androidID3 == null ? "" : androidID3;
        String manufacturer = DeviceUtils.getManufacturer();
        String str5 = manufacturer == null ? "" : manufacturer;
        String model = DeviceUtils.getModel();
        String str6 = model == null ? "" : model;
        String sDKVersionName = DeviceUtils.getSDKVersionName();
        if (sDKVersionName == null) {
            sDKVersionName = "";
        }
        String strConcat = "Android".concat(sDKVersionName);
        String strValueOf = String.valueOf(AppUtils.getAppVersionCode());
        if (strValueOf == null) {
            strValueOf = "1";
        }
        String str7 = strValueOf;
        String appVersionName = AppUtils.getAppVersionName();
        String str8 = appVersionName == null ? str7 : appVersionName;
        String appPackageName = AppUtils.getAppPackageName();
        if (appPackageName == null) {
            appPackageName = "com.transsnet.palmpay";
        }
        String str9 = appPackageName;
        ArrayList arrayList = null;
        try {
            Signature[] appSignature = AppUtils.getAppSignature();
            string = (appSignature == null || appSignature.length == 0) ? null : appSignature[0].toString();
        } catch (Exception unused) {
            string = null;
        }
        try {
            iPAddress = NetworkUtils.getIPAddress(true);
        } catch (Exception unused2) {
            iPAddress = null;
        }
        try {
            iPAddress2 = NetworkUtils.getIPAddress(false);
        } catch (Exception unused3) {
            iPAddress2 = null;
        }
        try {
            WifiInfo connectWifiInfo = NetworkUtils.getConnectWifiInfo();
            strK = (connectWifiInfo == null || (ssid = connectWifiInfo.getSSID()) == null) ? null : y.k(ssid, "\"", "");
        } catch (Exception unused4) {
            strK = null;
        }
        try {
            String macAddress = DeviceUtils.getMacAddress();
            if (macAddress == null || macAddress.length() == 0 || macAddress.equals("02:00:00:00:00:00")) {
                macAddress = null;
            }
            str = macAddress;
        } catch (Exception unused5) {
            str = null;
        }
        List<b> list = cVar.appInfo;
        if (list != null) {
            List<b> list2 = list;
            arrayList = new ArrayList(r.l(list2, 10));
            for (b bVar : list2) {
                String str10 = bVar.app_name;
                String str11 = bVar.app_version;
                String str12 = str11 == null ? "" : str11;
                String str13 = bVar.app_package_name;
                arrayList.add(new p053db.b(str10, str12, str13 == null ? "" : str13, bVar.app_create_time, bVar.app_update_time, bVar.app_type));
                str2 = str2;
                str3 = str3;
            }
        }
        return new c(str2, str3, str4, str5, str6, str8, str7, str9, strConcat, IdManager.DEFAULT_VERSION_NAME, IdManager.DEFAULT_VERSION_NAME, 2, string, iPAddress, iPAddress2, Integer.valueOf(DeviceUtils.isDeviceRooted() ? 1 : 0), strK, str, arrayList);
    }
}
