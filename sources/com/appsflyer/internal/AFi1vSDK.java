package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1vSDK {

    @NotNull
    public final String AFAdRevenueData;
    private final boolean getMediationNetwork;

    @Nullable
    public final String getMonetizationNetwork;

    @Nullable
    public final String getRevenue;

    public AFi1vSDK(@NotNull String str, @Nullable String str2, @Nullable String str3, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AFAdRevenueData = str;
        this.getMonetizationNetwork = str2;
        this.getRevenue = str3;
        this.getMediationNetwork = z3;
    }

    public final boolean getMediationNetwork() {
        return this.getMediationNetwork;
    }
}
