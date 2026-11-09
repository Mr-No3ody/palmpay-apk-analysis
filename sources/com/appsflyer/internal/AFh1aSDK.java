package com.appsflyer.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1aSDK {
    public final int AFAdRevenueData;
    public final long getMediationNetwork;
    public final int getMonetizationNetwork;
    public final String getRevenue;

    public AFh1aSDK(String str, int i7, int i10, long j6) {
        this.getRevenue = str;
        this.getMonetizationNetwork = i7;
        this.AFAdRevenueData = i10;
        this.getMediationNetwork = j6;
    }

    public final String AFAdRevenueData() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_ver", this.getRevenue);
            jSONObject.put("min", this.getMonetizationNetwork);
            jSONObject.put("expire", this.AFAdRevenueData);
            jSONObject.put("ttl", this.getMediationNetwork);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj != null && AFh1aSDK.class == obj.getClass()) {
            AFh1aSDK aFh1aSDK = (AFh1aSDK) obj;
            if (this.getMonetizationNetwork == aFh1aSDK.getMonetizationNetwork && this.AFAdRevenueData == aFh1aSDK.AFAdRevenueData && this.getMediationNetwork == aFh1aSDK.getMediationNetwork && (str = this.getRevenue) != null && str.equals(aFh1aSDK.getRevenue)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.getRevenue;
        return ((((((str != null ? str.hashCode() : 0) * 31) + this.getMonetizationNetwork) * 31) + this.AFAdRevenueData) * 31) + ((int) this.getMediationNetwork);
    }
}
