package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFAdRevenueData;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1oSDK extends AFh1qSDK {

    @Nullable
    public final Map<String, Object> copydefault;

    @NonNull
    public final AFAdRevenueData hashCode;

    public AFh1oSDK(@NonNull AFAdRevenueData aFAdRevenueData, @Nullable Map<String, Object> map) {
        super("adrevenue_generic", null, Boolean.TRUE);
        this.hashCode = aFAdRevenueData;
        this.copydefault = map;
    }

    @Override // com.appsflyer.internal.AFh1qSDK
    public final AFe1nSDK getCurrencyIso4217Code() {
        return AFe1nSDK.ADREVENUE;
    }
}
