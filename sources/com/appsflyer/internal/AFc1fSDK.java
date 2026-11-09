package com.appsflyer.internal;

import com.appsflyer.AppsFlyerConsent;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1fSDK {

    @Nullable
    public String AFAdRevenueData;

    @Nullable
    public AFh1sSDK areAllFieldsValid;
    public boolean component1;

    @Nullable
    public AppsFlyerConsent component2;
    public boolean component3;

    @Nullable
    public AFd1bSDK component4;

    @Nullable
    public String copy;

    @Nullable
    public AFb1tSDK getCurrencyIso4217Code;

    @Nullable
    public String getMediationNetwork;

    @Nullable
    public AFb1uSDK getMonetizationNetwork;

    @Nullable
    public String getRevenue;

    @Nullable
    public AFb1hSDK toString;

    public final boolean getCurrencyIso4217Code() {
        return this.component3;
    }

    public final boolean getMonetizationNetwork() {
        return this.component1;
    }

    public final synchronized void getRevenue(@Nullable AFd1bSDK aFd1bSDK) {
        this.component4 = aFd1bSDK;
    }
}
