package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes.dex */
public interface AFe1uSDK {
    @WorkerThread
    void getMediationNetwork(@NonNull AFe1sSDK<?> aFe1sSDK);

    @WorkerThread
    void getMonetizationNetwork(@NonNull AFe1sSDK<?> aFe1sSDK, @NonNull AFe1qSDK aFe1qSDK);
}
