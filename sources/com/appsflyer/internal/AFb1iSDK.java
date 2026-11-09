package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.oaid.OaidClient;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1iSDK {

    @Nullable
    public static Boolean AFAdRevenueData;
    public static String getRevenue;

    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    @Nullable
    public static AFb1lSDK getCurrencyIso4217Code(Context context) {
        Boolean lat;
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        String str = getRevenue;
        boolean z3 = str != null;
        if (z3) {
            lat = null;
        } else {
            Boolean bool = AFAdRevenueData;
            if ((bool == null || !bool.booleanValue()) && !(AFAdRevenueData == null && appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_OAID, true))) {
                lat = null;
                str = null;
            } else {
                try {
                    OaidClient oaidClient = new OaidClient(context);
                    oaidClient.setLogging(appsFlyerProperties.isEnableLog());
                    OaidClient.Info infoFetch = oaidClient.fetch();
                    if (infoFetch != null) {
                        String id2 = infoFetch.getId();
                        try {
                            lat = infoFetch.getLat();
                            str = id2;
                        } catch (Throwable unused) {
                            str = id2;
                            AFLogger.afDebugLog("No OAID library");
                            lat = null;
                        }
                    } else {
                        lat = null;
                        str = null;
                    }
                } catch (Throwable unused2) {
                    str = null;
                }
            }
        }
        if (str == null) {
            return null;
        }
        AFb1lSDK aFb1lSDK = new AFb1lSDK(str, lat);
        aFb1lSDK.getCurrencyIso4217Code = Boolean.valueOf(z3);
        return aFb1lSDK;
    }

    private static boolean getMediationNetwork() {
        Boolean bool = AFAdRevenueData;
        return bool == null || bool.booleanValue();
    }

    @Nullable
    public static AFb1lSDK l_(ContentResolver contentResolver) {
        String string;
        if (!getMediationNetwork() || contentResolver == null || AppsFlyerProperties.getInstance().getString("amazon_aid") != null || !"Amazon".equals(Build.MANUFACTURER)) {
            return null;
        }
        int i7 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
        if (i7 == 0) {
            return new AFb1lSDK(Settings.Secure.getString(contentResolver, "advertising_id"), Boolean.FALSE);
        }
        if (i7 == 2) {
            return null;
        }
        try {
            string = Settings.Secure.getString(contentResolver, "advertising_id");
        } catch (Throwable th) {
            AFLogger.afErrorLog("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th);
            string = "";
        }
        return new AFb1lSDK(string, Boolean.TRUE);
    }
}
