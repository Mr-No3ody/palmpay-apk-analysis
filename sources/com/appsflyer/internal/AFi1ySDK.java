package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1ySDK {

    @NonNull
    public final String AFAdRevenueData;

    @Nullable
    public final String areAllFieldsValid;

    @Nullable
    public final Throwable component1;

    @Nullable
    public final AFi1uSDK component3;
    public final int getCurrencyIso4217Code;
    public final long getMediationNetwork;
    public final long getMonetizationNetwork;

    @Nullable
    public final String getRevenue;

    public AFi1ySDK(@Nullable String str, @NonNull String str2, long j6, long j10, int i7, @Nullable AFi1uSDK aFi1uSDK, @Nullable String str3, Throwable th) {
        this.getRevenue = str;
        this.AFAdRevenueData = str2;
        this.getMonetizationNetwork = j6;
        this.getMediationNetwork = j10;
        this.getCurrencyIso4217Code = i7;
        this.component3 = aFi1uSDK;
        this.areAllFieldsValid = str3;
        this.component1 = th;
    }
}
