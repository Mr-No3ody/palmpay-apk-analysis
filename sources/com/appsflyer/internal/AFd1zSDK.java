package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.appsflyer.PurchaseHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public interface AFd1zSDK {
    @NonNull
    ExecutorService AFAdRevenueData();

    @NonNull
    AFc1eSDK AFInAppEventParameterName();

    @NonNull
    AFf1jSDK AFInAppEventType();

    @NonNull
    AFe1vSDK AFKeystoreWrapper();

    @NonNull
    AFc1uSDK AFLogger();

    @NonNull
    AFf1eSDK afDebugLog();

    @NonNull
    AFh1ySDK afErrorLog();

    @Nullable
    AFh1uSDK afErrorLogForExcManagerOnly();

    @NonNull
    AFa1hSDK afInfoLog();

    @NonNull
    AFd1ySDK afLogForce();

    @NonNull
    AFb1gSDK afWarnLog();

    @NonNull
    PurchaseHandler areAllFieldsValid();

    @NonNull
    AFj1pSDK component1();

    @NonNull
    AFh1wSDK component2();

    @NonNull
    AFg1vSDK component3();

    @NonNull
    AFf1pSDK component4();

    @NonNull
    AFd1oSDK copy();

    @NonNull
    AFe1tSDK copydefault();

    @NonNull
    AFi1rSDK d();

    @NonNull
    AFa1mSDK e();

    @NonNull
    AFj1rSDK equals();

    @NonNull
    AFb1aSDK force();

    @NonNull
    AFd1kSDK getCurrencyIso4217Code();

    @NonNull
    ScheduledExecutorService getMediationNetwork();

    @NonNull
    AFc1pSDK getMonetizationNetwork();

    @NonNull
    AFc1qSDK getRevenue();

    @NonNull
    AFc1fSDK i();

    @NonNull
    AFi1lSDK registerClient();

    @NonNull
    AFa1bSDK unregisterClient();

    @Nullable
    @WorkerThread
    AFi1nSDK v();

    @NonNull
    AFi1wSDK w();
}
