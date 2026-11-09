package com.appsflyer.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1tSDK.AnonymousClass5;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1fSDK extends AFe1sSDK<Boolean> {
    private static volatile boolean component4 = false;
    private final AFd1zSDK areAllFieldsValid;
    private Boolean component1;
    private final AFe1tSDK component2;
    private final AFc1uSDK component3;

    public AFe1fSDK(@NonNull AFd1zSDK aFd1zSDK) {
        super(AFe1nSDK.LOAD_CACHE, new AFe1nSDK[0], "LoadCachedRequests");
        this.component3 = aFd1zSDK.AFLogger();
        this.component2 = aFd1zSDK.copydefault();
        this.areAllFieldsValid = aFd1zSDK;
    }

    public static boolean component2() {
        return component4;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    @NonNull
    public final AFe1qSDK getCurrencyIso4217Code() throws Exception {
        for (AFc1vSDK aFc1vSDK : this.component3.getCurrencyIso4217Code()) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
            StringBuilder sb2 = new StringBuilder("resending request: ");
            sb2.append(aFc1vSDK.getRevenue);
            aFLogger.i(aFg1cSDK, sb2.toString());
            try {
                AFh1kSDK aFh1kSDK = new AFh1kSDK(AFAdRevenueData(aFc1vSDK), aFc1vSDK.getMediationNetwork(), aFc1vSDK.AFAdRevenueData, aFc1vSDK.getCurrencyIso4217Code, aFc1vSDK.getMediationNetwork);
                AFe1tSDK aFe1tSDK = this.component2;
                aFe1tSDK.getRevenue.execute(aFe1tSDK.new AnonymousClass5(new AFf1ySDK(aFh1kSDK, this.areAllFieldsValid)));
            } catch (Exception e10) {
                AFLogger.INSTANCE.e(AFg1cSDK.QUEUE, "Failed to resend cached request", e10);
            }
        }
        this.component1 = Boolean.TRUE;
        component4 = true;
        return AFe1qSDK.SUCCESS;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final long getRevenue() {
        return 30000L;
    }

    private static String AFAdRevenueData(AFc1vSDK aFc1vSDK) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j6 = Long.parseLong(aFc1vSDK.AFAdRevenueData, 10);
        String str = aFc1vSDK.getRevenue;
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("isCachedRequest", "true").appendQueryParameter("timeincache", String.valueOf((jCurrentTimeMillis - j6) / 1000)).toString();
        } catch (Exception e10) {
            AFLogger.afErrorLogForExcManagerOnly("Couldn't parse the uri", e10);
            return str;
        }
    }
}
