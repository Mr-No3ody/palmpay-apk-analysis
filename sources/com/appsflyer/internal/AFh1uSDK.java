package com.appsflyer.internal;

import android.content.Intent;
import androidx.annotation.WorkerThread;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface AFh1uSDK {
    void AFAdRevenueData();

    @WorkerThread
    void AFAdRevenueData(@NotNull AFf1uSDK aFf1uSDK, @NotNull Function0<Unit> function0);

    @WorkerThread
    void getCurrencyIso4217Code(@NotNull AFh1qSDK aFh1qSDK);

    boolean getCurrencyIso4217Code();

    @WorkerThread
    void getMonetizationNetwork(@NotNull AFh1qSDK aFh1qSDK);

    void getRevenue(@NotNull AFh1qSDK aFh1qSDK);

    boolean getRevenue();

    void u_(@NotNull Intent intent, @NotNull AFa1mSDK aFa1mSDK);
}
