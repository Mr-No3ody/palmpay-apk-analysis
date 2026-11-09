package com.appsflyer;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.adjust.sdk.Constants;
import com.appsflyer.internal.AFc1qSDK;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AppsFlyerProperties {
    public static final String ADDITIONAL_CUSTOM_DATA = "additionalCustomData";
    public static final String AF_STORE_FROM_API = "api_store_value";
    public static final String AF_WAITFOR_CUSTOMERID = "waitForCustomerId";
    public static final String APP_ID = "appid";
    public static final String APP_USER_ID = "AppUserId";
    public static final String CHANNEL = "channel";
    public static final String COLLECT_ANDROID_ID = "collectAndroidId";
    public static final String COLLECT_ANDROID_ID_FORCE_BY_USER = "collectAndroidIdForceByUser";
    public static final String COLLECT_FACEBOOK_ATTR_ID = "collectFacebookAttrId";
    public static final String COLLECT_IMEI = "collectIMEI";
    public static final String COLLECT_IMEI_FORCE_BY_USER = "collectIMEIForceByUser";
    public static final String COLLECT_OAID = "collectOAID";
    public static final String CURRENCY_CODE = "currencyCode";
    public static final String DEVICE_TRACKING_DISABLED = "deviceTrackingDisabled";
    public static final String DISABLE_KEYSTORE = "keyPropDisableAFKeystore";
    public static final String DISABLE_LOGS_COMPLETELY = "disableLogs";
    public static final String DISABLE_NETWORK_DATA = "disableCollectNetworkData";
    public static final String DISABLE_OTHER_SDK = "disableOtherSdk";
    public static final String DPM = "disableProxy";
    public static final String EMAIL_CRYPT_TYPE = "userEmailsCryptType";
    public static final String ENABLE_GPS_FALLBACK = "enableGpsFallback";
    public static final String ENABLE_TCF_DATA_COLLECTION = "enableTCFDataCollection";
    public static final String EXTENSION = "sdkExtension";
    public static final String HTTP_CACHE = "http_cache";
    public static final String IS_UPDATE = "IS_UPDATE";
    public static final String LAUNCH_PROTECT_ENABLED = "launchProtectEnabled";
    public static final String NEW_REFERRER_SENT = "newGPReferrerSent";
    public static final String ONELINK_DOMAIN = "onelinkDomain";
    public static final String ONELINK_ID = "oneLinkSlug";
    public static final String ONELINK_SCHEME = "onelinkScheme";
    public static final String ONELINK_VERSION = "onelinkVersion";
    public static final String USER_EMAILS = "userEmails";

    @VisibleForTesting
    public static AppsFlyerProperties instance;
    public String getMonetizationNetwork;
    public boolean getRevenue;
    private final Map<String, Object> getMediationNetwork = new HashMap();
    private boolean getCurrencyIso4217Code = false;

    public enum EmailsCryptType {
        NONE(0),
        SHA256(3);

        private final int getRevenue;

        EmailsCryptType(int i7) {
            this.getRevenue = i7;
        }

        public final int getValue() {
            return this.getRevenue;
        }
    }

    @VisibleForTesting
    public AppsFlyerProperties() {
    }

    public static AppsFlyerProperties getInstance() {
        if (instance == null) {
            instance = new AppsFlyerProperties();
        }
        return instance;
    }

    private boolean getMediationNetwork() {
        return this.getCurrencyIso4217Code;
    }

    public boolean getBoolean(String str, boolean z3) {
        String string = getString(str);
        return string == null ? z3 : Boolean.parseBoolean(string);
    }

    public final boolean getCurrencyIso4217Code() {
        return this.getRevenue;
    }

    public int getInt(String str, int i7) {
        String string = getString(str);
        return string == null ? i7 : Integer.parseInt(string);
    }

    public int getLogLevel() {
        return getInt("logLevel", AFLogger.LogLevel.NONE.getLevel());
    }

    public long getLong(String str, long j6) {
        String string = getString(str);
        return string == null ? j6 : Long.parseLong(string);
    }

    public String getReferrer(AFc1qSDK aFc1qSDK) {
        String str = this.getMonetizationNetwork;
        if (str != null) {
            return str;
        }
        return getString("AF_REFERRER") != null ? getString("AF_REFERRER") : aFc1qSDK.getCurrencyIso4217Code(Constants.REFERRER, (String) null);
    }

    @Nullable
    public synchronized String getString(String str) {
        return (String) this.getMediationNetwork.get(str);
    }

    public boolean isEnableLog() {
        return getLogLevel() > AFLogger.LogLevel.NONE.getLevel();
    }

    public boolean isLogsDisabledCompletely() {
        return getBoolean(DISABLE_LOGS_COMPLETELY, false);
    }

    public boolean isOtherSdkStringDisabled() {
        return getBoolean(DISABLE_OTHER_SDK, false);
    }

    public synchronized void loadProperties(AFc1qSDK aFc1qSDK) {
        try {
            if (getMediationNetwork()) {
                return;
            }
            String currencyIso4217Code = aFc1qSDK.getCurrencyIso4217Code("savedProperties", (String) null);
            if (currencyIso4217Code != null) {
                AFLogger.afDebugLog("Loading properties..");
                try {
                    JSONObject jSONObject = new JSONObject(currencyIso4217Code);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (this.getMediationNetwork.get(next) == null) {
                            this.getMediationNetwork.put(next, jSONObject.getString(next));
                        }
                    }
                    String[] strArr = {"AppsFlyerKey", "custom_host", "custom_host_prefix", "advertiserIdEnabled", "advertiserId"};
                    for (int i7 = 0; i7 < 5; i7++) {
                        this.getMediationNetwork.remove(strArr[i7]);
                    }
                    saveProperties(aFc1qSDK);
                    this.getCurrencyIso4217Code = true;
                } catch (JSONException e10) {
                    AFLogger.afErrorLog("Failed loading properties", e10);
                }
                StringBuilder sb2 = new StringBuilder("Done loading properties: ");
                sb2.append(this.getCurrencyIso4217Code);
                AFLogger.afDebugLog(sb2.toString());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void remove(String str) {
        this.getMediationNetwork.remove(str);
    }

    public synchronized void saveProperties(AFc1qSDK aFc1qSDK) {
        this.getMediationNetwork.remove("AppsFlyerKey");
        aFc1qSDK.getMonetizationNetwork("savedProperties", new JSONObject(this.getMediationNetwork).toString());
    }

    public synchronized void set(String str, String str2) {
        this.getMediationNetwork.put(str, str2);
    }

    public synchronized void setCustomData(String str) {
        this.getMediationNetwork.put(ADDITIONAL_CUSTOM_DATA, str);
    }

    public synchronized void setUserEmails(String str) {
        this.getMediationNetwork.put(USER_EMAILS, str);
    }

    public synchronized void set(String str, String[] strArr) {
        this.getMediationNetwork.put(str, strArr);
    }

    public synchronized void set(String str, int i7) {
        this.getMediationNetwork.put(str, Integer.toString(i7));
    }

    public synchronized void set(String str, long j6) {
        this.getMediationNetwork.put(str, Long.toString(j6));
    }

    public synchronized void set(String str, boolean z3) {
        this.getMediationNetwork.put(str, Boolean.toString(z3));
    }
}
