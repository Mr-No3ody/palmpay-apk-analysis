package com.appsflyer.internal;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1qSDK {
    public long getCurrencyIso4217Code;
    public long getMediationNetwork;
    public final AFc1qSDK getRevenue;

    @Nullable
    public AFi1zSDK AFAdRevenueData = null;
    public AFi1zSDK getMonetizationNetwork = AFAdRevenueData();

    public AFf1qSDK(AFc1qSDK aFc1qSDK) {
        this.getRevenue = aFc1qSDK;
        this.getCurrencyIso4217Code = aFc1qSDK.getRevenue("af_rc_timestamp", 0L);
        this.getMediationNetwork = aFc1qSDK.getRevenue("af_rc_max_age", 0L);
    }

    @Nullable
    private AFi1zSDK AFAdRevenueData() {
        String currencyIso4217Code = this.getRevenue.getCurrencyIso4217Code("af_remote_config", (String) null);
        if (currencyIso4217Code == null) {
            AFLogger.INSTANCE.d(AFg1cSDK.REMOTE_CONTROL, "No configuration found in cache");
            return null;
        }
        try {
            return new AFi1zSDK(new String(Base64.decode(currencyIso4217Code, 2), Charset.defaultCharset()));
        } catch (Exception e10) {
            AFLogger.INSTANCE.e(AFg1cSDK.REMOTE_CONTROL, "Error reading malformed configuration from cache, requires fetching from remote again", e10, true);
            return null;
        }
    }
}
