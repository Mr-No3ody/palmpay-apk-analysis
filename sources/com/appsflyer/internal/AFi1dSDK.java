package com.appsflyer.internal;

import com.appsflyer.AFLogger;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFi1dSDK extends AFj1tSDK {
    private AFc1pSDK getRevenue;

    public AFi1dSDK(String str, String str2, AFc1pSDK aFc1pSDK, Runnable runnable) {
        super(str, str2, runnable);
        this.getRevenue = aFc1pSDK;
    }

    public final boolean AFAdRevenueData() {
        if (this.getRevenue.AFAdRevenueData.getMonetizationNetwork("appsFlyerCount", 0) <= 0) {
            return true;
        }
        AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Install referrer will not load, the counter >= 1, ");
        return false;
    }
}
