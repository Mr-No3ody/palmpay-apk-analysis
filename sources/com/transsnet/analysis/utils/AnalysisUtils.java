package com.transsnet.analysis.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.RequiresPermission;
import com.transsnet.analysis.AnalysisManager;
import com.transsnet.analysis.data.bean.req.AnalysisReq;
import com.transsnet.analysis.data.local.database.EventsDatabase;
import com.transsnet.analysis.data.local.entity.EventsEntity;

/* JADX INFO: loaded from: classes3.dex */
public class AnalysisUtils {
    private static String appVersion;
    private static int appVersionCode;

    public static int getAppVersionCode(final String packageName) {
        return getAppVersionCode(AnalysisManager.getContext(), packageName);
    }

    public static String getAppVersionName(final String packageName) {
        return getAppVersionName(AnalysisManager.getContext(), packageName);
    }

    public static String getSimOperatorName(Context context) {
        try {
            return getTelephonyManager(context).getSimOperatorName();
        } catch (Throwable unused) {
            return "";
        }
    }

    private static TelephonyManager getTelephonyManager(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    public static boolean isConnected(Context context) {
        ConnectivityManager connectivityManager;
        NetworkCapabilities networkCapabilities;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(4) || networkCapabilities.hasTransport(3);
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    public static boolean isWifiConnected() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) AnalysisManager.getContext().getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() != 1) ? false : true;
    }

    public static String json2QueryString(AnalysisReq data) {
        String str = data.bizInfo;
        int length = (str != null ? str.length() : 4) + 39;
        String str2 = data.nonceStr;
        int length2 = length + (str2 != null ? str2.length() : 4) + 14;
        String str3 = data.version;
        StringBuilder sb2 = new StringBuilder(length2 + (str3 != null ? str3.length() : 4));
        sb2.append("bizInfo=");
        sb2.append(data.bizInfo);
        sb2.append("&nonceStr=");
        sb2.append(data.nonceStr);
        sb2.append("&requestTime=");
        sb2.append(data.requestTime);
        sb2.append("&version=");
        sb2.append(data.version);
        return sb2.toString();
    }

    public static void saveEventToDB(Object object, int eventType) {
        try {
            String json = GsonUtil.get().toJson(object);
            EventsEntity eventsEntity = new EventsEntity();
            eventsEntity.data = json;
            eventsEntity.create_time = System.currentTimeMillis();
            eventsEntity.type = eventType;
            EventsDatabase.getInstance(AnalysisManager.getContext()).eventsDao().insert(eventsEntity);
        } catch (Exception unused) {
        }
    }

    public static int getAppVersionCode(Context context, final String packageName) {
        if (!TextUtils.isEmpty(packageName) && context != null) {
            int i7 = appVersionCode;
            if (i7 > 0) {
                return i7;
            }
            try {
                PackageInfo packageInfo = AnalysisManager.getContext().getPackageManager().getPackageInfo(packageName, 0);
                int i10 = packageInfo == null ? -1 : packageInfo.versionCode;
                appVersionCode = i10;
                return i10;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return -1;
    }

    public static String getAppVersionName(Context context, final String packageName) {
        if (!TextUtils.isEmpty(packageName) && context != null) {
            if (!TextUtils.isEmpty(appVersion)) {
                return appVersion;
            }
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
                String str = packageInfo == null ? "" : packageInfo.versionName;
                appVersion = str;
                return str;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return "";
    }
}
