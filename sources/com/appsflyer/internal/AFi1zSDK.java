package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1zSDK {

    @NonNull
    public final AFh1fSDK AFAdRevenueData;

    @NonNull
    public final String getCurrencyIso4217Code;

    @Nullable
    public final AFh1bSDK getMediationNetwork;
    private final boolean getMonetizationNetwork;

    @NonNull
    public final String getRevenue;

    public AFi1zSDK(@NonNull String str) throws JSONException {
        if (str == null) {
            throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("ver");
            this.getCurrencyIso4217Code = string;
            this.getMonetizationNetwork = jSONObject.optBoolean("test_mode");
            this.getRevenue = str;
            this.AFAdRevenueData = string.startsWith(GetCustomerServiceUrlReq.ENTER_TYPE_DEFAULT) ? AFh1fSDK.DEFAULT : AFh1fSDK.CUSTOM;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("features");
            this.getMediationNetwork = jSONObjectOptJSONObject != null ? new AFh1bSDK(jSONObjectOptJSONObject) : null;
        } catch (JSONException e10) {
            AFLogger.afErrorLogForExcManagerOnly("Error in RC config parsing", e10);
            throw new JSONException("Failed to parse remote configuration JSON");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AFi1zSDK.class != obj.getClass()) {
            return false;
        }
        AFi1zSDK aFi1zSDK = (AFi1zSDK) obj;
        if (this.getMonetizationNetwork == aFi1zSDK.getMonetizationNetwork && this.getCurrencyIso4217Code.equals(aFi1zSDK.getCurrencyIso4217Code)) {
            return this.getRevenue.equals(aFi1zSDK.getRevenue);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.getRevenue.hashCode() + ((this.getCurrencyIso4217Code.hashCode() + ((this.getMonetizationNetwork ? 1 : 0) * 31)) * 31);
        AFh1bSDK aFh1bSDK = this.getMediationNetwork;
        if (aFh1bSDK == null) {
            return iHashCode;
        }
        return aFh1bSDK.hashCode() + (iHashCode * 31);
    }
}
