package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1zSDK implements AFh1ySDK {

    @Nullable
    private AFg1aSDK AFAdRevenueData;

    @Nullable
    private AFg1fSDK getMediationNetwork;

    @NotNull
    private final AFd1zSDK getMonetizationNetwork;

    @Nullable
    private AFg1hSDK getRevenue;

    public AFh1zSDK(@NotNull AFd1zSDK aFd1zSDK) {
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.getMonetizationNetwork = aFd1zSDK;
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void AFAdRevenueData() {
        AFg1fSDK aFg1fSDK = this.getMediationNetwork;
        if (aFg1fSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1gSDK.v$default(aFLogger, AFg1cSDK.EXCEPTION_MANAGER, "Releasing Exception Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1fSDK);
            this.getMediationNetwork = null;
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void component2() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        if (this.getRevenue == null) {
            this.getRevenue = new AFg1hSDK();
        }
        AFg1hSDK aFg1hSDK = this.getRevenue;
        Intrinsics.e(aFg1hSDK);
        aFLogger.registerClient(aFg1hSDK);
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void getCurrencyIso4217Code() {
        AFg1aSDK aFg1aSDK = this.AFAdRevenueData;
        if (aFg1aSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1gSDK.v$default(aFLogger, AFg1cSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1aSDK);
            this.AFAdRevenueData = null;
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void getMediationNetwork() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        if (this.AFAdRevenueData == null) {
            this.AFAdRevenueData = new AFg1aSDK(this.getMonetizationNetwork);
        }
        AFg1aSDK aFg1aSDK = this.AFAdRevenueData;
        Intrinsics.e(aFg1aSDK);
        aFLogger.registerClient(aFg1aSDK);
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void getMonetizationNetwork() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        if (this.getMediationNetwork == null) {
            this.getMediationNetwork = new AFg1fSDK(this.getMonetizationNetwork);
        }
        AFg1fSDK aFg1fSDK = this.getMediationNetwork;
        Intrinsics.e(aFg1fSDK);
        aFLogger.registerClient(aFg1fSDK);
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void getRevenue() {
        AFg1hSDK aFg1hSDK = this.getRevenue;
        if (aFg1hSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1gSDK.v$default(aFLogger, AFg1cSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1hSDK);
            this.getRevenue = null;
        }
    }
}
