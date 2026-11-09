package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AFd1aSDK {

    @NonNull
    public final String AFAdRevenueData;
    private final boolean areAllFieldsValid;
    public int component1;

    @Nullable
    private final byte[] component2;
    private final boolean component3;
    private boolean component4;

    @NonNull
    public final Map<String, String> getCurrencyIso4217Code;
    public boolean getMediationNetwork;

    @NonNull
    final String getMonetizationNetwork;
    public boolean getRevenue;

    public AFd1aSDK(@NonNull String str, @Nullable byte[] bArr, @NonNull String str2, @NonNull Map<String, String> map, boolean z3) {
        this(str, bArr, str2, map, z3, (byte) 0);
    }

    @Nullable
    public final byte[] AFAdRevenueData() {
        return this.component2;
    }

    public final boolean component3() {
        return this.getMediationNetwork;
    }

    public final boolean getCurrencyIso4217Code() {
        return this.areAllFieldsValid;
    }

    public final boolean getMediationNetwork() {
        return this.component3;
    }

    public final boolean getMonetizationNetwork() {
        return this.component4;
    }

    public final boolean getRevenue() {
        return this.getRevenue;
    }

    private AFd1aSDK(@NonNull String str, @Nullable byte[] bArr, @NonNull String str2, @NonNull Map<String, String> map, boolean z3, byte b7) {
        this.component4 = true;
        this.getRevenue = false;
        this.getMediationNetwork = true;
        this.component1 = -1;
        this.AFAdRevenueData = str;
        this.component2 = bArr;
        this.getMonetizationNetwork = str2;
        this.getCurrencyIso4217Code = map;
        this.areAllFieldsValid = z3;
        this.component3 = true;
    }

    public AFd1aSDK(@NonNull String str, @NonNull String str2) {
        this(str, null, str2, new HashMap(), false);
    }
}
