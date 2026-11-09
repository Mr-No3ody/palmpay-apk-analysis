package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1oSDK extends AFe1kSDK {
    public AFe1oSDK(@NonNull Map<String, Object> map, @Nullable PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NonNull AFd1zSDK aFd1zSDK) {
        super(AFe1nSDK.ARS_VALIDATE, new AFe1nSDK[]{AFe1nSDK.RC_CDN, AFe1nSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, map, purchaseValidationCallback);
        this.getCurrencyIso4217Code.add(AFe1nSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1sSDK
    public final boolean AFAdRevenueData() {
        ResponseNetwork responseNetwork = this.areAllFieldsValid;
        if (responseNetwork == null || responseNetwork.getStatusCode() != 424) {
            return super.AFAdRevenueData();
        }
        return true;
    }

    @Override // com.appsflyer.internal.AFe1iSDK
    @Nullable
    public final AFd1hSDK<String> getRevenue(@NonNull Map<String, Object> map, @NonNull String str, @Nullable String str2) {
        return ((AFe1eSDK) this).component1.AFAdRevenueData(map, str, str2);
    }
}
