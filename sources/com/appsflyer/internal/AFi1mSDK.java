package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1mSDK implements AFi1rSDK {

    @Nullable
    private String getCurrencyIso4217Code;

    private static String getMonetizationNetwork(Activity activity) {
        Uri uriK_ = AFb1rSDK.k_(activity != null ? activity.getIntent() : null);
        String string = uriK_ != null ? uriK_.toString() : null;
        if (string == null) {
            string = "";
        }
        if (AFAdRevenueData(string)) {
            return null;
        }
        return string;
    }

    @Override // com.appsflyer.internal.AFi1rSDK
    public final void AFAdRevenueData(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        String str = this.getCurrencyIso4217Code;
        if (str == null || str.length() == 0) {
            this.getCurrencyIso4217Code = getMonetizationNetwork(activity);
        }
    }

    @Override // com.appsflyer.internal.AFi1rSDK
    @Nullable
    public final String getMediationNetwork(@Nullable Activity activity) {
        String str = this.getCurrencyIso4217Code;
        this.getCurrencyIso4217Code = null;
        return (str == null || str.length() == 0) ? getMonetizationNetwork(activity) : str;
    }

    @Override // com.appsflyer.internal.AFi1rSDK
    @NotNull
    public final String getRevenue(@Nullable Activity activity) {
        Uri referrer = (activity == null || activity.getIntent() == null) ? null : activity.getReferrer();
        String string = referrer != null ? referrer.toString() : null;
        return string == null ? "" : string;
    }

    private static boolean AFAdRevenueData(String str) {
        return y.m(str, "android-app://", false);
    }
}
