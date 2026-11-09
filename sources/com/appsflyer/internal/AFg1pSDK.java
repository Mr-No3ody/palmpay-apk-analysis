package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1pSDK extends AFe1eSDK<Map<String, Object>> {
    private static final List<String> component3 = Arrays.asList("googleplay", "playstore", "googleplaystore");

    @Nullable
    private String AFKeystoreWrapper;
    private final AFh1wSDK copy;
    private final AFd1kSDK copydefault;
    private final AFc1qSDK equals;
    private final AFc1pSDK hashCode;

    @Nullable
    private Map<String, Object> toString;

    public AFg1pSDK(@NonNull AFd1zSDK aFd1zSDK) {
        super(AFe1nSDK.GCDSDK, new AFe1nSDK[]{AFe1nSDK.RC_CDN}, aFd1zSDK, "GCD-FETCH");
        this.copydefault = aFd1zSDK.getCurrencyIso4217Code();
        this.equals = aFd1zSDK.getRevenue();
        this.copy = aFd1zSDK.component2();
        this.hashCode = aFd1zSDK.getMonetizationNetwork();
        this.getCurrencyIso4217Code.add(AFe1nSDK.CONVERSION);
        this.getCurrencyIso4217Code.add(AFe1nSDK.LAUNCH);
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1sSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean component3() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    @Nullable
    public final AppsFlyerRequestListener copydefault() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1sSDK
    @NonNull
    public final AFe1qSDK getCurrencyIso4217Code() throws Exception {
        AFe1qSDK currencyIso4217Code;
        AFe1qSDK aFe1qSDK;
        if (((AFe1eSDK) this).component2.getMediationNetwork()) {
            AFLogger.afDebugLog("[GCD-E03] 'isStopTracking' enabled");
            this.AFKeystoreWrapper = "'isStopTracking' enabled";
            throw new AFe1pSDK();
        }
        AFe1qSDK aFe1qSDK2 = AFe1qSDK.FAILURE;
        int i7 = 0;
        while (i7 <= 2) {
            boolean z3 = true;
            boolean z8 = i7 >= 2;
            this.copy.hashCode = System.currentTimeMillis();
            try {
                try {
                    currencyIso4217Code = super.getCurrencyIso4217Code();
                    ResponseNetwork responseNetwork = this.areAllFieldsValid;
                    if (responseNetwork != null) {
                        int statusCode = responseNetwork.getStatusCode();
                        if (statusCode != 403 && statusCode < 500) {
                            z3 = false;
                        }
                        if (responseNetwork.isSuccessful() || statusCode == 404) {
                            Map<String, Object> map = (Map) responseNetwork.getBody();
                            int statusCode2 = responseNetwork.getStatusCode();
                            Boolean bool = (Boolean) map.get("iscache");
                            if (statusCode2 == 404) {
                                map.remove("error_reason");
                                map.remove("status_code");
                                map.put("af_status", "Organic");
                                map.put("af_message", "organic install");
                            }
                            if (bool != null && !bool.booleanValue()) {
                                this.equals.getMonetizationNetwork("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                            }
                            if (map.containsKey("af_siteid")) {
                                if (map.containsKey(AFInAppEventParameterName.AF_CHANNEL)) {
                                    StringBuilder sb2 = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                                    sb2.append(map.get(AFInAppEventParameterName.AF_CHANNEL));
                                    AFLogger.afDebugLog(sb2.toString());
                                } else {
                                    AFLogger.afDebugLog(String.format("[CrossPromotion] App was installed via %s's Cross Promotion", map.get("af_siteid")));
                                }
                            }
                            map.put("is_first_launch", Boolean.FALSE);
                            this.equals.getMonetizationNetwork("attributionId", new JSONObject(map).toString());
                            if (!this.equals.getMonetizationNetwork("sixtyDayConversionData")) {
                                map.put("is_first_launch", Boolean.TRUE);
                            }
                            this.toString = map;
                            aFe1qSDK = AFe1qSDK.SUCCESS;
                        } else {
                            if (!z8) {
                                if (!z3) {
                                }
                            }
                            this.AFKeystoreWrapper = "Error connection to server: ".concat(String.valueOf(statusCode));
                            aFe1qSDK = AFe1qSDK.FAILURE;
                        }
                        this.copy.getRevenue(i7);
                        AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
                        return aFe1qSDK;
                    }
                } catch (AFe1lSDK e10) {
                    AFLogger.afDebugLog("[GCD-E05] AppsFlyer dev key is missing");
                    this.AFKeystoreWrapper = "AppsFlyer dev key is missing";
                    throw e10;
                } catch (Exception e11) {
                    StringBuilder sb3 = new StringBuilder("[GCD] Error: ");
                    sb3.append(e11.getMessage());
                    AFLogger.afErrorLog(sb3.toString(), e11, false, false);
                    currencyIso4217Code = AFe1qSDK.FAILURE;
                    if (z8) {
                        this.AFKeystoreWrapper = e11.getMessage();
                        throw e11;
                    }
                }
                this.copy.getRevenue(i7);
                AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
                aFe1qSDK2 = currencyIso4217Code;
                i7++;
            } catch (Throwable th) {
                this.copy.getRevenue(i7);
                AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
                throw th;
            }
        }
        return aFe1qSDK2;
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1sSDK
    public final void getMediationNetwork() {
        super.getMediationNetwork();
        Map<String, Object> map = this.toString;
        String str = this.AFKeystoreWrapper;
        if (map != null) {
            AFg1qSDK.getCurrencyIso4217Code(map);
        } else if (str == null || str.isEmpty()) {
            AFg1qSDK.getRevenue("Unknown error");
        } else {
            AFg1qSDK.getRevenue(str);
        }
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final AFd1hSDK<Map<String, Object>> AFAdRevenueData(@NonNull String str) {
        String strConcat;
        String strAFAdRevenueData = AFa1uSDK.AFAdRevenueData(this.equals, this.hashCode.component2());
        if (strAFAdRevenueData == null || strAFAdRevenueData.trim().isEmpty()) {
            strConcat = "";
        } else if (component3.contains(strAFAdRevenueData.toLowerCase(Locale.getDefault()))) {
            AFLogger.afWarnLog("[GCD] AF detected using redundant Google-Play channel for attribution - " + strAFAdRevenueData + ". Using without channel postfix.");
            strConcat = "";
        } else {
            strConcat = "-".concat(strAFAdRevenueData);
        }
        AFd1hSDK<Map<String, Object>> aFd1hSDKAFAdRevenueData = this.copydefault.AFAdRevenueData(strConcat, str);
        StringBuilder sb2 = new StringBuilder("[GCD-B01] URL: ");
        sb2.append(aFd1hSDKAFAdRevenueData.getMediationNetwork.AFAdRevenueData);
        AFLogger.afInfoLog(sb2.toString());
        return aFd1hSDKAFAdRevenueData;
    }
}
