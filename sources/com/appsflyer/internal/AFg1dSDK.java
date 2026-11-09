package com.appsflyer.internal;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.adjust.sdk.Constants;
import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1dSDK {
    public static String getCurrencyIso4217Code(String str) {
        if (str.length() <= 20) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.substring(0, 10));
        sb2.append("...");
        return sb2.toString();
    }

    @VisibleForTesting
    private static String getMediationNetwork(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < str.length(); i7++) {
            if (i7 == 0 || i7 == str.length() - 1) {
                sb2.append(str.charAt(i7));
            } else {
                sb2.append("*");
            }
        }
        return sb2.toString();
    }

    public static void getMediationNetwork(String str, @Nullable JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("appsflyerKey")) {
                    jSONObject.put("appsflyerKey", getMediationNetwork(jSONObject.getString("appsflyerKey")));
                }
                if (jSONObject.has("tcstring")) {
                    jSONObject.put("tcstring", getCurrencyIso4217Code("tcstring"));
                }
                if (jSONObject.has(Constants.REFERRER)) {
                    jSONObject.put(Constants.REFERRER, getCurrencyIso4217Code(Constants.REFERRER));
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(jSONObject);
                aFLogger.i(aFg1cSDK, sb2.toString());
            } catch (JSONException e10) {
                AFLogger.INSTANCE.e(AFg1cSDK.OTHER, "Not able to log the payload", e10);
            }
        }
    }
}
