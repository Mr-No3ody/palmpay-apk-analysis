package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.google.common.net.HttpHeaders;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1hSDK extends AFe1eSDK<String> {

    @NonNull
    private final String component3;
    private final AFc1pSDK equals;

    @Nullable
    private final AFj1aSDK toString;

    public AFe1hSDK(@NonNull AFd1zSDK aFd1zSDK, @NonNull String str, @Nullable AFj1aSDK aFj1aSDK) {
        super(AFe1nSDK.IMPRESSIONS, new AFe1nSDK[]{AFe1nSDK.RC_CDN, AFe1nSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, str);
        this.component3 = str;
        this.toString = aFj1aSDK;
        this.equals = aFd1zSDK.getMonetizationNetwork();
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1sSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean component3() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    @Nullable
    public final AppsFlyerRequestListener copydefault() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1sSDK
    public final void getMediationNetwork() {
        super.getMediationNetwork();
        AFe1wSDK<Result> aFe1wSDK = this.areAllFieldsValid;
        if (aFe1wSDK != 0) {
            int statusCode = aFe1wSDK.getStatusCode();
            if (statusCode == 200) {
                StringBuilder sb2 = new StringBuilder("Cross promotion impressions success: ");
                sb2.append(this.component3);
                AFLogger.afInfoLog(sb2.toString(), false);
                return;
            }
            if (statusCode != 301 && statusCode != 302) {
                StringBuilder sb3 = new StringBuilder("call to ");
                sb3.append(this.component3);
                sb3.append(" failed: ");
                sb3.append(statusCode);
                AFLogger.afInfoLog(sb3.toString());
                return;
            }
            StringBuilder sb4 = new StringBuilder("Cross promotion redirection success: ");
            sb4.append(this.component3);
            AFLogger.afInfoLog(sb4.toString(), false);
            String monetizationNetwork = aFe1wSDK.getMonetizationNetwork(HttpHeaders.LOCATION);
            AFj1aSDK aFj1aSDK = this.toString;
            if (aFj1aSDK == null || monetizationNetwork == null) {
                return;
            }
            aFj1aSDK.getMonetizationNetwork = monetizationNetwork;
            Context context = aFj1aSDK.getCurrencyIso4217Code.get();
            if (context != null) {
                try {
                    if (aFj1aSDK.getMonetizationNetwork != null) {
                        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aFj1aSDK.getMonetizationNetwork)).setFlags(268435456));
                    }
                } catch (Exception e10) {
                    AFLogger.afErrorLog("Failed to open cross promotion url, does OS have browser installed?".concat(String.valueOf(e10)), e10);
                }
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final AFd1hSDK<String> AFAdRevenueData(@NonNull String str) {
        AFd1kSDK aFd1kSDK = ((AFe1eSDK) this).component1;
        String mediationNetwork = this.equals.getMediationNetwork();
        return aFd1kSDK.getMonetizationNetwork(AFk1ySDK.getMediationNetwork(mediationNetwork) ? this.component3 : Uri.parse(this.component3).buildUpon().appendQueryParameter("advertising_id", mediationNetwork).build().toString());
    }
}
