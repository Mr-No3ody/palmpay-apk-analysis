package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1wSDK {
    public final AFc1qSDK AFAdRevenueData;
    public long copydefault;
    public final AFc1pSDK getRevenue;
    public final Map<String, Object> getCurrencyIso4217Code = new ConcurrentHashMap();
    public final Map<String, Object> getMediationNetwork = new ConcurrentHashMap();
    public final Map<String, Object> getMonetizationNetwork = new ConcurrentHashMap();
    public long component2 = 0;
    public long areAllFieldsValid = 0;
    public final long[] component3 = new long[2];
    public final long[] component1 = new long[2];
    public final long[] component4 = new long[2];
    public long toString = 0;
    public long hashCode = 0;

    public AFh1wSDK(AFc1qSDK aFc1qSDK, AFc1pSDK aFc1pSDK) {
        this.AFAdRevenueData = aFc1qSDK;
        this.getRevenue = aFc1pSDK;
    }

    public final void AFAdRevenueData() {
        this.areAllFieldsValid = System.currentTimeMillis();
        if (getCurrencyIso4217Code()) {
            long j6 = this.component2;
            if (j6 == 0) {
                AFLogger.afInfoLog("Metrics: init ts is missing");
                return;
            }
            this.getCurrencyIso4217Code.put("init_to_fg", Long.valueOf(this.areAllFieldsValid - j6));
            this.AFAdRevenueData.getMonetizationNetwork("first_launch", new JSONObject(this.getCurrencyIso4217Code).toString());
        }
    }

    public final boolean getCurrencyIso4217Code() {
        return this.getRevenue.AFAdRevenueData.getMonetizationNetwork("appsFlyerCount", 0) == 0;
    }

    public final Map<String, Object> getMediationNetwork(String str) {
        Map<String, Object> map = Collections.EMPTY_MAP;
        String currencyIso4217Code = this.AFAdRevenueData.getCurrencyIso4217Code(str, (String) null);
        if (currencyIso4217Code != null) {
            try {
                return AFg1mSDK.getMonetizationNetwork(new JSONObject(currencyIso4217Code));
            } catch (Exception e10) {
                AFLogger.afErrorLog("Error while parsing cached json data", e10, true);
            }
        }
        return map;
    }

    public final void getRevenue(AFg1bSDK aFg1bSDK) {
        if (getCurrencyIso4217Code()) {
            this.getCurrencyIso4217Code.put("start_with", aFg1bSDK.toString());
            this.AFAdRevenueData.getMonetizationNetwork("first_launch", new JSONObject(this.getCurrencyIso4217Code).toString());
        }
    }

    public final void getRevenue(DeepLinkResult deepLinkResult, long j6) {
        this.getMediationNetwork.put("status", deepLinkResult.getStatus().toString());
        this.getMediationNetwork.put("timeout_value", Long.valueOf(j6));
    }

    public final void getRevenue(int i7) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j6 = this.hashCode;
        if (j6 != 0) {
            this.getMonetizationNetwork.put("net", Long.valueOf(jCurrentTimeMillis - j6));
        } else {
            AFLogger.afInfoLog("Metrics: gcdStart ts is missing");
        }
        this.getMonetizationNetwork.put("retries", Integer.valueOf(i7));
        this.AFAdRevenueData.getMonetizationNetwork("gcd", new JSONObject(this.getMonetizationNetwork).toString());
    }

    public final boolean getRevenue() {
        return this.getRevenue.AFAdRevenueData.getMonetizationNetwork("appsFlyerCount", 0) == 1;
    }
}
