package com.appsflyer.internal;

import androidx.annotation.Nullable;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFh1qSDK {

    @Nullable
    public AppsFlyerRequestListener AFAdRevenueData;
    public int areAllFieldsValid;
    public String component1;
    public String component2;
    public String component3;
    public String component4;
    private final boolean copydefault;

    @Nullable
    public String equals;

    @Nullable
    public Map<String, Object> getCurrencyIso4217Code;
    public Map<String, Object> getMediationNetwork;
    public final Map<String, String> getMonetizationNetwork;

    @Nullable
    public String getRevenue;
    private byte[] hashCode;

    public AFh1qSDK() {
        this(null, null, null);
    }

    public boolean AFAdRevenueData() {
        return true;
    }

    public boolean areAllFieldsValid() {
        return false;
    }

    public boolean component3() {
        return true;
    }

    public boolean component4() {
        return true;
    }

    public abstract AFe1nSDK getCurrencyIso4217Code();

    public final AFh1qSDK getCurrencyIso4217Code(Map<String, ?> map) {
        synchronized (map) {
            this.getMediationNetwork.putAll(map);
        }
        return this;
    }

    public final AFh1qSDK getMediationNetwork(String str, Object obj) {
        synchronized (this.getMediationNetwork) {
            this.getMediationNetwork.put(str, obj);
        }
        return this;
    }

    public final boolean getMonetizationNetwork() {
        return this.component1 == null && this.component3 == null;
    }

    public final byte[] getRevenue() {
        return this.hashCode;
    }

    public AFh1qSDK(@Nullable String str, @Nullable String str2, @Nullable Boolean bool) {
        this.getMediationNetwork = new HashMap();
        this.getMonetizationNetwork = new HashMap();
        this.component1 = str;
        this.component4 = str2;
        this.copydefault = bool != null ? bool.booleanValue() : true;
    }

    public final AFh1qSDK getCurrencyIso4217Code(int i7) {
        this.areAllFieldsValid = i7;
        synchronized (this.getMediationNetwork) {
            try {
                if (this.getMediationNetwork.containsKey("counter")) {
                    this.getMediationNetwork.put("counter", Integer.toString(i7));
                }
                if (this.getMediationNetwork.containsKey("launch_counter")) {
                    this.getMediationNetwork.put("launch_counter", Integer.toString(i7));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public final boolean getMediationNetwork() {
        return this.copydefault;
    }

    public static boolean getMediationNetwork(double d2) {
        if (d2 < 0.0d || d2 >= 1.0d) {
            return false;
        }
        if (d2 == 0.0d) {
            return true;
        }
        int i7 = (int) (1.0d / d2);
        if (i7 + 1 > 0) {
            return ((int) ((Math.random() * ((double) i7)) + 1.0d)) != i7;
        }
        throw new IllegalArgumentException("Unsupported max value");
    }

    public final AFh1qSDK getCurrencyIso4217Code(byte[] bArr) {
        this.hashCode = bArr;
        return this;
    }
}
