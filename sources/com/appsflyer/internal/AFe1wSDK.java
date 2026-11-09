package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AFe1wSDK<Body> implements ResponseNetwork<Body> {

    @NonNull
    final Map<String, List<String>> AFAdRevenueData;
    final boolean getCurrencyIso4217Code;

    @NonNull
    private final Body getMediationNetwork;
    final int getMonetizationNetwork;

    @NonNull
    public final AFd1bSDK getRevenue;

    public AFe1wSDK(@NonNull Body body, int i7, boolean z3, Map<String, List<String>> map, @NonNull AFd1bSDK aFd1bSDK) {
        this.getMediationNetwork = body;
        this.getMonetizationNetwork = i7;
        this.getCurrencyIso4217Code = z3;
        this.AFAdRevenueData = new HashMap(map);
        this.getRevenue = aFd1bSDK;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFe1wSDK aFe1wSDK = (AFe1wSDK) obj;
        if (this.getMonetizationNetwork == aFe1wSDK.getMonetizationNetwork && this.getCurrencyIso4217Code == aFe1wSDK.getCurrencyIso4217Code && this.getMediationNetwork.equals(aFe1wSDK.getMediationNetwork) && this.AFAdRevenueData.equals(aFe1wSDK.AFAdRevenueData)) {
            return this.getRevenue.equals(aFe1wSDK.getRevenue);
        }
        return false;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    @NonNull
    public Body getBody() {
        return this.getMediationNetwork;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    @Nullable
    public List<String> getHeaderField(@NonNull String str) {
        for (String str2 : this.AFAdRevenueData.keySet()) {
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return this.AFAdRevenueData.get(str2);
            }
        }
        return null;
    }

    @Nullable
    public final String getMonetizationNetwork(@NonNull String str) {
        List<String> headerField = getHeaderField(str);
        if (headerField == null || headerField.isEmpty()) {
            return null;
        }
        Iterator<String> it = headerField.iterator();
        StringBuilder sb2 = new StringBuilder(it.next());
        while (it.hasNext()) {
            sb2.append(", ");
            sb2.append(it.next());
        }
        return sb2.toString();
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public int getStatusCode() {
        return this.getMonetizationNetwork;
    }

    public int hashCode() {
        return this.getRevenue.hashCode() + ((this.AFAdRevenueData.hashCode() + (((((this.getMediationNetwork.hashCode() * 31) + this.getMonetizationNetwork) * 31) + (this.getCurrencyIso4217Code ? 1 : 0)) * 31)) * 31);
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public boolean isSuccessful() {
        return this.getCurrencyIso4217Code;
    }
}
