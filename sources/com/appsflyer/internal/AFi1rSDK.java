package com.appsflyer.internal;

import android.app.Activity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface AFi1rSDK {
    void AFAdRevenueData(@NotNull Activity activity);

    @Nullable
    String getMediationNetwork(@Nullable Activity activity);

    @NotNull
    String getRevenue(@Nullable Activity activity);
}
