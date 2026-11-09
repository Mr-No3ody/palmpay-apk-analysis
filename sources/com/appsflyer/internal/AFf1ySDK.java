package com.appsflyer.internal;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1ySDK extends AFe1eSDK<String> {
    private final AFh1kSDK component3;

    public AFf1ySDK(@NonNull AFh1kSDK aFh1kSDK, @NonNull AFd1zSDK aFd1zSDK) {
        AFe1nSDK aFe1nSDK = aFh1kSDK.copydefault;
        AFe1nSDK aFe1nSDK2 = aFe1nSDK == null ? AFe1nSDK.CACHED_EVENT : aFe1nSDK;
        AFe1nSDK[] aFe1nSDKArr = {AFe1nSDK.RC_CDN};
        StringBuilder sb2 = new StringBuilder();
        sb2.append(aFh1kSDK.component3);
        sb2.append("-");
        sb2.append(getMediationNetwork(aFh1kSDK));
        super(aFe1nSDK2, aFe1nSDKArr, aFd1zSDK, sb2.toString(), aFh1kSDK.component3);
        this.component3 = aFh1kSDK;
    }

    private boolean copy() {
        ResponseNetwork responseNetwork;
        AFe1nSDK aFe1nSDK = this.component3.copydefault;
        if (aFe1nSDK == null) {
            aFe1nSDK = AFe1nSDK.CACHED_EVENT;
        }
        return aFe1nSDK == AFe1nSDK.ARS_VALIDATE && (responseNetwork = this.areAllFieldsValid) != null && responseNetwork.getStatusCode() == 424;
    }

    private boolean equals() {
        ResponseNetwork responseNetwork = this.areAllFieldsValid;
        boolean z3 = this.getMonetizationNetwork == AFe1qSDK.FAILURE && responseNetwork != null && responseNetwork.getStatusCode() / 500 == 1;
        AFe1nSDK aFe1nSDK = this.getMediationNetwork;
        return z3 && (aFe1nSDK == AFe1nSDK.CONVERSION || aFe1nSDK == AFe1nSDK.ATTR);
    }

    private static String getMediationNetwork(AFh1kSDK aFh1kSDK) {
        try {
            return new URL(aFh1kSDK.component4).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final AFd1hSDK<String> AFAdRevenueData(@NonNull String str) {
        String strEncodeToString = Base64.encodeToString(this.component3.getRevenue(), 2);
        AFLogger.afInfoLog("cached data: ".concat(String.valueOf(strEncodeToString)));
        ((AFe1eSDK) this).component4.getMonetizationNetwork(this.component3.component4, strEncodeToString);
        return ((AFe1eSDK) this).component1.AFAdRevenueData(this.component3);
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean component3() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    @Nullable
    public final AppsFlyerRequestListener copydefault() {
        return this.component3.AFAdRevenueData;
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1sSDK
    public final boolean AFAdRevenueData() {
        return super.AFAdRevenueData() || copy() || equals();
    }
}
