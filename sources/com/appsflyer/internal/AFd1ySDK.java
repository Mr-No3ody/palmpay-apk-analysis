package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface AFd1ySDK {

    public interface AFa1vSDK {
        void onConfigurationChanged(boolean z3);
    }

    void AFAdRevenueData(@NonNull Throwable th, @NonNull String str);

    void getCurrencyIso4217Code();

    void getMediationNetwork(@Nullable AFa1vSDK aFa1vSDK);

    void getMonetizationNetwork();
}
