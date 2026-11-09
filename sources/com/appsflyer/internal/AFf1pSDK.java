package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1tSDK.AnonymousClass5;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1pSDK implements AFe1uSDK {
    private final AFc1pSDK AFAdRevenueData;
    private final AFc1fSDK areAllFieldsValid;
    private final AFf1nSDK component1;
    private final AFd1kSDK component2;
    private final AFe1tSDK component3;

    @Nullable
    private AFi1ySDK component4;

    @Nullable
    private AFf1mSDK copy;
    private final AFf1jSDK getCurrencyIso4217Code;
    private final Object getMediationNetwork = new Object();
    public final AFf1qSDK getMonetizationNetwork;
    private final AFf1oSDK getRevenue;

    public AFf1pSDK(AFf1oSDK aFf1oSDK, AFc1pSDK aFc1pSDK, AFf1jSDK aFf1jSDK, AFf1qSDK aFf1qSDK, AFd1kSDK aFd1kSDK, AFf1nSDK aFf1nSDK, AFe1tSDK aFe1tSDK, AFc1fSDK aFc1fSDK) {
        this.getRevenue = aFf1oSDK;
        this.AFAdRevenueData = aFc1pSDK;
        this.getCurrencyIso4217Code = aFf1jSDK;
        this.getMonetizationNetwork = aFf1qSDK;
        this.component2 = aFd1kSDK;
        this.component1 = aFf1nSDK;
        this.component3 = aFe1tSDK;
        this.areAllFieldsValid = aFc1fSDK;
        aFe1tSDK.getMediationNetwork.add(this);
    }

    private void AFAdRevenueData(@NonNull AFf1mSDK aFf1mSDK, @Nullable AFf1tSDK aFf1tSDK) {
        synchronized (this.getMediationNetwork) {
            this.copy = aFf1mSDK;
        }
        if (aFf1tSDK != null) {
            aFf1tSDK.onRemoteConfigUpdateFinished(aFf1mSDK);
        }
    }

    @Override // com.appsflyer.internal.AFe1uSDK
    public final void getMediationNetwork(AFe1sSDK<?> aFe1sSDK) {
        if (aFe1sSDK instanceof AFf1sSDK) {
            AFf1sSDK aFf1sSDK = (AFf1sSDK) aFe1sSDK;
            synchronized (this.getMediationNetwork) {
                this.component4 = null;
            }
            AFAdRevenueData(AFf1mSDK.FAILURE, aFf1sSDK.component4);
        }
    }

    public final void getMonetizationNetwork(@Nullable AFf1tSDK aFf1tSDK) {
        AFf1sSDK aFf1sSDK = new AFf1sSDK(this.getRevenue, this.AFAdRevenueData, this.getCurrencyIso4217Code, this.getMonetizationNetwork, this.component2, this.component1, "v1", aFf1tSDK, this.areAllFieldsValid);
        AFe1tSDK aFe1tSDK = this.component3;
        aFe1tSDK.getRevenue.execute(aFe1tSDK.new AnonymousClass5(aFf1sSDK));
    }

    @Nullable
    public final AFi1ySDK getMonetizationNetwork() {
        AFi1ySDK aFi1ySDK;
        synchronized (this.getMediationNetwork) {
            aFi1ySDK = this.component4;
            this.component4 = null;
        }
        return aFi1ySDK;
    }

    @Override // com.appsflyer.internal.AFe1uSDK
    public final void getMonetizationNetwork(AFe1sSDK<?> aFe1sSDK, AFe1qSDK aFe1qSDK) {
        if (aFe1sSDK instanceof AFf1sSDK) {
            AFf1sSDK aFf1sSDK = (AFf1sSDK) aFe1sSDK;
            AFf1mSDK aFf1mSDK = aFf1sSDK.component1;
            if (aFf1mSDK == null) {
                AFLogger.INSTANCE.w(AFg1cSDK.REMOTE_CONTROL, "update RC returned null result, something went wrong!");
                aFf1mSDK = AFf1mSDK.FAILURE;
            }
            if (aFf1mSDK != AFf1mSDK.USE_CACHED) {
                AFi1ySDK aFi1ySDK = aFf1sSDK.areAllFieldsValid;
                synchronized (this.getMediationNetwork) {
                    this.component4 = aFi1ySDK;
                }
            }
            AFAdRevenueData(aFf1mSDK, aFf1sSDK.component4);
        }
    }
}
