package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@JvmName(name = "PlayIntegrityPredicates")
public final class AFi1hSDK {
    public static final boolean getMediationNetwork(@NotNull AFc1pSDK aFc1pSDK, @NotNull AFf1jSDK aFf1jSDK) {
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFf1jSDK, "");
        return aFc1pSDK.AFAdRevenueData.getMonetizationNetwork("appsFlyerCount", 0) == 0 && !aFf1jSDK.getMediationNetwork();
    }

    public static final boolean getMonetizationNetwork(@Nullable Context context) {
        return AFj1gSDK.AFAdRevenueData(context) && AFj1gSDK.getMonetizationNetwork(context);
    }

    public static final boolean getRevenue(@Nullable Context context) {
        return AFj1gSDK.getMonetizationNetwork(context);
    }
}
