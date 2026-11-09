package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1nSDK extends AFe1sSDK<Void> {

    @Nullable
    private final AFe1wSDK<String> component1;
    private final AFc1qSDK component2;

    @Nullable
    private final Throwable component3;

    public AFg1nSDK(AFf1uSDK aFf1uSDK, AFc1qSDK aFc1qSDK) {
        super(AFe1nSDK.GCDSDK, new AFe1nSDK[]{AFe1nSDK.RC_CDN}, "GCD-CHECK");
        this.component3 = aFf1uSDK.component4();
        this.component1 = aFf1uSDK.areAllFieldsValid;
        this.component2 = aFc1qSDK;
    }

    @Nullable
    private Map<String, Object> component3() {
        String currencyIso4217Code = this.component2.getCurrencyIso4217Code("attributionId", (String) null);
        if (currencyIso4217Code == null) {
            return null;
        }
        try {
            new AFd1jSDK();
            return AFd1jSDK.getRevenue(currencyIso4217Code);
        } catch (JSONException e10) {
            StringBuilder sb2 = new StringBuilder("[GCD] Failed to parse GCD response: ");
            sb2.append(e10.getMessage());
            AFLogger.afErrorLog(sb2.toString(), e10);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    @NonNull
    public final AFe1qSDK getCurrencyIso4217Code() throws Exception {
        AFLogger.afDebugLog("[GCD-A01] Loading conversion data. Counter: ".concat(String.valueOf(this.component2.getMonetizationNetwork("appsFlyerCount", 0))));
        long revenue = this.component2.getRevenue("appsflyerConversionDataCacheExpiration", 0L);
        if (revenue != 0 && System.currentTimeMillis() - revenue > 5184000000L) {
            AFLogger.afDebugLog("[GCD-E02] Cached conversion data expired");
            this.component2.AFAdRevenueData("sixtyDayConversionData", true);
            this.component2.getMonetizationNetwork("attributionId", (String) null);
            this.component2.getMonetizationNetwork("appsflyerConversionDataCacheExpiration", 0L);
        }
        Map<String, Object> mapComponent3 = component3();
        if (mapComponent3 != null) {
            try {
                if (!mapComponent3.containsKey("is_first_launch")) {
                    mapComponent3.put("is_first_launch", Boolean.FALSE);
                }
                AFg1qSDK.getCurrencyIso4217Code(mapComponent3);
            } catch (Exception e10) {
                StringBuilder sb2 = new StringBuilder("[GCD] Error executing conversion data callback: ");
                sb2.append(e10.getLocalizedMessage());
                AFLogger.afErrorLog(sb2.toString(), e10);
            }
            return AFe1qSDK.SUCCESS;
        }
        try {
            if (this.component3 != null) {
                StringBuilder sb3 = new StringBuilder("Launch exception: ");
                sb3.append(this.component3.getMessage());
                AFg1qSDK.getRevenue(sb3.toString());
                return AFe1qSDK.SUCCESS;
            }
            AFe1wSDK<String> aFe1wSDK = this.component1;
            if (aFe1wSDK != null && !aFe1wSDK.isSuccessful()) {
                StringBuilder sb4 = new StringBuilder("Launch status code: ");
                sb4.append(this.component1.getStatusCode());
                AFg1qSDK.getRevenue(sb4.toString());
                return AFe1qSDK.SUCCESS;
            }
            return AFe1qSDK.FAILURE;
        } catch (Exception e11) {
            StringBuilder sb5 = new StringBuilder("[GCD] Error executing conversion data callback: ");
            sb5.append(e11.getLocalizedMessage());
            AFLogger.afErrorLog(sb5.toString(), e11);
        }
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final long getRevenue() {
        return 1000L;
    }
}
