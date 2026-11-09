package com.appsflyer.internal;

import androidx.annotation.WorkerThread;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface AFc1cSDK {
    @WorkerThread
    void AFAdRevenueData(int i7, int i10);

    @WorkerThread
    boolean AFAdRevenueData();

    @WorkerThread
    @NotNull
    List<AFc1bSDK> getMediationNetwork();

    @WorkerThread
    boolean getMediationNetwork(@NotNull String... strArr);

    @WorkerThread
    int getMonetizationNetwork();

    @WorkerThread
    @Nullable
    String getRevenue(@NotNull Throwable th, @NotNull String str);
}
