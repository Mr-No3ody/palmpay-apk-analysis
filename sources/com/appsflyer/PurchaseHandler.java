package com.appsflyer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.internal.AFc1pSDK;
import com.appsflyer.internal.AFd1zSDK;
import com.appsflyer.internal.AFe1tSDK;
import com.appsflyer.internal.AFj1dSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class PurchaseHandler {

    @NonNull
    public final AFd1zSDK AFAdRevenueData;

    @NonNull
    private final AFc1pSDK getMediationNetwork;

    @NonNull
    public final AFe1tSDK getMonetizationNetwork;

    public interface PurchaseValidationCallback {
        void onFailure(@NonNull Throwable th);

        void onResponse(@NonNull ResponseNetwork<String> responseNetwork);
    }

    public PurchaseHandler(@NonNull AFd1zSDK aFd1zSDK) {
        this.AFAdRevenueData = aFd1zSDK;
        this.getMediationNetwork = aFd1zSDK.getMonetizationNetwork();
        this.getMonetizationNetwork = aFd1zSDK.copydefault();
    }

    public final boolean getCurrencyIso4217Code(Map<String, Object> map, @Nullable PurchaseValidationCallback purchaseValidationCallback, String... strArr) {
        boolean currencyIso4217Code = AFj1dSDK.getCurrencyIso4217Code(map, strArr, this.getMediationNetwork);
        if (!currencyIso4217Code && purchaseValidationCallback != null) {
            purchaseValidationCallback.onFailure(new IllegalArgumentException("Invalid Request Data"));
        }
        return currencyIso4217Code;
    }
}
