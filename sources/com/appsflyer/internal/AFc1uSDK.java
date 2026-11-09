package com.appsflyer.internal;

import androidx.annotation.WorkerThread;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface AFc1uSDK {
    @WorkerThread
    void AFAdRevenueData();

    @WorkerThread
    @Nullable
    String getCurrencyIso4217Code(@NotNull AFc1vSDK aFc1vSDK);

    @WorkerThread
    @NotNull
    List<AFc1vSDK> getCurrencyIso4217Code();

    void getMediationNetwork();

    @WorkerThread
    boolean getMediationNetwork(@Nullable String str);
}
