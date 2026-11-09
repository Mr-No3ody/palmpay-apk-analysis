package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFa1lSDK implements AFa1hSDK {

    @NotNull
    private final AFc1qSDK getRevenue;

    public AFa1lSDK(@NotNull AFc1qSDK aFc1qSDK) {
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        this.getRevenue = aFc1qSDK;
    }

    @Override // com.appsflyer.internal.AFa1hSDK
    @NotNull
    public final Map<String, Object> getMediationNetwork() {
        if (this.getRevenue.AFAdRevenueData("deeplink_data")) {
            try {
                String currencyIso4217Code = this.getRevenue.getCurrencyIso4217Code("deeplink_data", (String) null);
                return currencyIso4217Code == null ? G.c() : AFj1eSDK.getRevenue(new JSONObject(currencyIso4217Code));
            } catch (Throwable th) {
                AFLogger.afErrorLog("Exception while parsing stored deeplink data", th, true, false);
            }
        }
        return G.c();
    }

    @Override // com.appsflyer.internal.AFa1hSDK
    public final void getRevenue() {
        this.getRevenue.getMediationNetwork("deeplink_data");
    }

    @Override // com.appsflyer.internal.AFa1hSDK
    public final void getRevenue(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.getRevenue.getMonetizationNetwork("deeplink_data", new JSONObject(map).toString());
    }
}
