package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.share.LinkGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1gSDK extends AFe1eSDK<String> {
    private final String component3;

    @NonNull
    private final LinkGenerator copy;

    @NonNull
    private final UUID copydefault;
    private final Map<String, String> equals;

    @Nullable
    private final LinkGenerator.ResponseListener hashCode;

    @Nullable
    private final String toString;

    public AFe1gSDK(@NonNull AFd1zSDK aFd1zSDK, @NonNull UUID uuid, @NonNull String str, @NonNull Map<String, String> map, @Nullable String str2, @Nullable LinkGenerator.ResponseListener responseListener, @NonNull LinkGenerator linkGenerator) {
        super(AFe1nSDK.ONELINK, new AFe1nSDK[]{AFe1nSDK.RC_CDN}, aFd1zSDK, uuid.toString());
        this.copydefault = uuid;
        this.component3 = str;
        this.equals = new HashMap(map);
        this.hashCode = responseListener;
        this.toString = str2;
        this.copy = linkGenerator;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final AFd1hSDK<String> AFAdRevenueData(@NonNull String str) {
        return ((AFe1eSDK) this).component1.AFAdRevenueData(this.component3, this.equals, this.toString, this.copydefault, str);
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean a_() {
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
        ResponseNetwork responseNetwork;
        super.getMediationNetwork();
        LinkGenerator.ResponseListener responseListener = this.hashCode;
        if (responseListener != null) {
            if (this.getMonetizationNetwork == AFe1qSDK.SUCCESS && (responseNetwork = this.areAllFieldsValid) != null) {
                responseListener.onResponse((String) responseNetwork.getBody());
                return;
            }
            Throwable thComponent4 = component4();
            if (!(thComponent4 instanceof ParsingException)) {
                responseListener.onResponse(this.copy.generateLink());
            } else if (((ParsingException) thComponent4).getRawResponse().isSuccessful()) {
                responseListener.onResponseError("Can't parse one link data");
            } else {
                responseListener.onResponse(this.copy.generateLink());
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1sSDK
    public final long getRevenue() {
        return 3000L;
    }
}
