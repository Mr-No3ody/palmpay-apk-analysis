package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.PurchaseHandler;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1cSDK extends AFe1kSDK {
    public AFe1cSDK(@NonNull Map<String, Object> map, @Nullable PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NonNull AFd1zSDK aFd1zSDK) {
        super(AFe1nSDK.PURCHASE_VALIDATE, new AFe1nSDK[]{AFe1nSDK.RC_CDN, AFe1nSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, map, purchaseValidationCallback);
        this.getCurrencyIso4217Code.add(AFe1nSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFe1iSDK
    @Nullable
    public final AFd1hSDK<String> getRevenue(@NonNull Map<String, Object> map, @NonNull String str, @Nullable String str2) {
        return ((AFe1eSDK) this).component1.getMediationNetwork(map, str, str2);
    }
}
