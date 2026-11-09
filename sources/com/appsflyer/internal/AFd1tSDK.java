package com.appsflyer.internal;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1tSDK {
    public static boolean AFAdRevenueData(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int mediationNetwork = AFk1xSDK.getMediationNetwork(str);
        int mediationNetwork2 = AFk1xSDK.getMediationNetwork(str2);
        Pair<Integer, Integer> monetizationNetwork = AFd1rSDK.getMonetizationNetwork(str2);
        Pair<Integer, Integer> currencyIso4217Code = AFd1rSDK.getCurrencyIso4217Code(str2);
        if (mediationNetwork2 != -1 && monetizationNetwork == null) {
            return mediationNetwork2 == mediationNetwork;
        }
        if (currencyIso4217Code != null) {
            return ((Number) currencyIso4217Code.f38891a).intValue() <= mediationNetwork && mediationNetwork <= ((Number) currencyIso4217Code.f38892b).intValue();
        }
        return monetizationNetwork != null && ((Number) monetizationNetwork.f38891a).intValue() <= mediationNetwork && mediationNetwork <= ((Number) monetizationNetwork.f38892b).intValue();
    }
}
