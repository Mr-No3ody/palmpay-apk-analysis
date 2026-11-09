package com.appsflyer.internal;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface AFg1vSDK {
    void AFAdRevenueData(@NotNull AFh1qSDK aFh1qSDK);

    void AFAdRevenueData(@NotNull Map<String, Object> map);

    long getCurrencyIso4217Code();

    void getCurrencyIso4217Code(@NotNull AFh1qSDK aFh1qSDK);

    void getCurrencyIso4217Code(@NotNull Map<String, Object> map);

    void getMediationNetwork(@NotNull AFh1qSDK aFh1qSDK);

    void getMediationNetwork(@NotNull Map<String, Object> map);

    void getMonetizationNetwork(@NotNull AFh1qSDK aFh1qSDK);

    void getMonetizationNetwork(@NotNull Map<String, Object> map);

    void getMonetizationNetwork(@NotNull Map<String, Object> map, int i7, int i10);

    void getRevenue(@NotNull AFh1qSDK aFh1qSDK);

    void getRevenue(@NotNull Map<String, Object> map, @NotNull AFe1nSDK aFe1nSDK);
}
