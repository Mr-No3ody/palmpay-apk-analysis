package com.appsflyer.internal;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1bSDK extends AFh1qSDK {
    @SuppressLint({"VisibleForTests"})
    public AFf1bSDK() {
        super("Register", null, Boolean.FALSE);
    }

    @Override // com.appsflyer.internal.AFh1qSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFh1qSDK
    public final AFe1nSDK getCurrencyIso4217Code() {
        return AFe1nSDK.REGISTER;
    }
}
