package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFe1kSDK extends AFe1iSDK {

    @Nullable
    private final PurchaseHandler.PurchaseValidationCallback component3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1kSDK(@NotNull AFe1nSDK aFe1nSDK, @NotNull AFe1nSDK[] aFe1nSDKArr, @NotNull AFd1zSDK aFd1zSDK, @NotNull Map<String, ? extends Object> map, @Nullable PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        super(aFe1nSDK, aFe1nSDKArr, aFd1zSDK, null, map);
        Intrinsics.checkNotNullParameter(aFe1nSDK, "");
        Intrinsics.checkNotNullParameter(aFe1nSDKArr, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.component3 = purchaseValidationCallback;
    }

    @Override // com.appsflyer.internal.AFe1iSDK
    @Nullable
    public final String AFAdRevenueData(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        if (map.containsKey("connector_version")) {
            Object objRemove = map.remove("connector_version");
            if (objRemove instanceof String) {
                return (String) objRemove;
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFe1iSDK
    public final boolean component2() {
        return true;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean component3() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1sSDK
    public final void getMediationNetwork() {
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback;
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback2;
        super.getMediationNetwork();
        Throwable thComponent4 = component4();
        if (thComponent4 != null && (purchaseValidationCallback2 = this.component3) != null) {
            purchaseValidationCallback2.onFailure(thComponent4);
        }
        ResponseNetwork<String> responseNetwork = this.areAllFieldsValid;
        if (responseNetwork == null || (purchaseValidationCallback = this.component3) == null) {
            return;
        }
        purchaseValidationCallback.onResponse(responseNetwork);
    }

    @Override // com.appsflyer.internal.AFe1iSDK
    @Nullable
    public final String getRevenue(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        if (map.containsKey("billing_library_version")) {
            Object objRemove = map.remove("billing_library_version");
            if (objRemove instanceof String) {
                return (String) objRemove;
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1sSDK
    public boolean AFAdRevenueData() {
        ResponseNetwork responseNetwork = this.areAllFieldsValid;
        if (responseNetwork != null) {
            Intrinsics.e(responseNetwork);
            if (responseNetwork.getStatusCode() == 503) {
                return true;
            }
        }
        return super.AFAdRevenueData();
    }
}
