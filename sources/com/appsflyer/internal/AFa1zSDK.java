package com.appsflyer.internal;

import com.appsflyer.internal.AFe1tSDK.AnonymousClass5;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFa1zSDK implements Runnable {

    @NotNull
    private final AFd1zSDK AFAdRevenueData;

    @Nullable
    private final Map<String, Object> getMediationNetwork;

    @NotNull
    private final AFh1qSDK getMonetizationNetwork;

    public AFa1zSDK(@NotNull AFd1zSDK aFd1zSDK, @NotNull AFh1qSDK aFh1qSDK, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(aFh1qSDK, "");
        this.AFAdRevenueData = aFd1zSDK;
        this.getMonetizationNetwork = aFh1qSDK;
        this.getMediationNetwork = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFe1sSDK aFf1xSDK;
        if (this.getMonetizationNetwork.getMonetizationNetwork()) {
            AFf1uSDK aFf1uSDK = new AFf1uSDK(this.getMonetizationNetwork, this.AFAdRevenueData);
            aFf1uSDK.equals = this.getMediationNetwork;
            aFf1xSDK = aFf1uSDK;
        } else {
            aFf1xSDK = this.getMonetizationNetwork instanceof AFh1oSDK ? new AFf1xSDK((AFh1oSDK) this.getMonetizationNetwork, this.AFAdRevenueData) : new AFf1rSDK(this.getMonetizationNetwork, this.AFAdRevenueData);
        }
        AFe1tSDK aFe1tSDKCopydefault = this.AFAdRevenueData.copydefault();
        aFe1tSDKCopydefault.getRevenue.execute(aFe1tSDKCopydefault.new AnonymousClass5(aFf1xSDK));
    }
}
