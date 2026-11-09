package com.appsflyer.internal;

import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFa1oSDK {
    @Nullable
    public static JSONObject getRevenue(String str) {
        JSONObject monetizationNetwork = AFg1mSDK.getMonetizationNetwork(str);
        if (monetizationNetwork != null) {
            try {
                if (monetizationNetwork.has("ol_id")) {
                    String strOptString = monetizationNetwork.optString("ol_scheme", null);
                    String strOptString2 = monetizationNetwork.optString("ol_domain", null);
                    String strOptString3 = monetizationNetwork.optString("ol_ver", null);
                    if (strOptString != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_SCHEME, strOptString);
                    }
                    if (strOptString2 != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_DOMAIN, strOptString2);
                    }
                    if (strOptString3 != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_VERSION, strOptString3);
                        return monetizationNetwork;
                    }
                }
            } catch (Throwable th) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
                StringBuilder sb2 = new StringBuilder("Error in handleResponse: ");
                sb2.append(th.getMessage());
                aFLogger.e(aFg1cSDK, sb2.toString(), th, false, false, true);
                ((AFa1uSDK) AFa1uSDK.getRevenue(new Object[0], 1795555804, -1795555788, (int) System.currentTimeMillis())).getRevenue().copy().getMonetizationNetwork();
                ((AFa1uSDK) AFa1uSDK.getRevenue(new Object[0], 1795555804, -1795555788, (int) System.currentTimeMillis())).getRevenue().copy().getCurrencyIso4217Code();
            }
        }
        return monetizationNetwork;
    }
}
