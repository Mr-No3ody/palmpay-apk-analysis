package com.appsflyer.internal;

import android.content.pm.PackageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface AFd1oSDK {
    boolean AFAdRevenueData();

    boolean component4();

    void getCurrencyIso4217Code();

    void getCurrencyIso4217Code(@NotNull Throwable th);

    void getMediationNetwork();

    void getMediationNetwork(@NotNull String str, int i7, @NotNull String str2);

    void getMonetizationNetwork();

    void getMonetizationNetwork(@Nullable String str, @NotNull String str2);

    void getMonetizationNetwork(@NotNull String str, @NotNull String... strArr);

    void getRevenue();

    void getRevenue(@NotNull String str, @NotNull String str2);

    void q_(@Nullable String str, @Nullable PackageManager packageManager);
}
