package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1wSDK implements AFj1bSDK {
    @Override // com.appsflyer.internal.AFj1bSDK
    @NotNull
    public final String AFAdRevenueData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = String.format(str, AppsFlyerLib.getInstance().getHostPrefix(), ((AFa1uSDK) AFa1uSDK.getRevenue(new Object[0], 1795555804, -1795555788, (int) System.currentTimeMillis())).getHostName());
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }
}
