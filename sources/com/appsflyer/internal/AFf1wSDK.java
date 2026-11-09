package com.appsflyer.internal;

import N8.q0;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1wSDK extends AFe1sSDK<Map<String, Object>> {
    private static final int component3 = (int) TimeUnit.SECONDS.toMillis(2);
    private Map<String, Object> areAllFieldsValid;
    private final Uri component1;
    private final AFa1mSDK component2;
    private final AFa1gSDK component4;
    private final List<String> equals;

    public AFf1wSDK(AFa1mSDK aFa1mSDK, @NonNull AFa1gSDK aFa1gSDK, @NonNull Uri uri, @NonNull List<String> list) {
        super(AFe1nSDK.RESOLVE_ESP, new AFe1nSDK[]{AFe1nSDK.RC_CDN}, "ResolveEsp");
        this.component2 = aFa1mSDK;
        this.component4 = aFa1gSDK;
        this.component1 = uri;
        this.equals = list;
    }

    private boolean getMediationNetwork(String str) {
        if (str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder sbQ = q0.q("Validate if link ", str, " belongs to ESP domains: ");
        sbQ.append(this.equals);
        AFLogger.afRDLog(sbQ.toString());
        try {
            return this.equals.contains(new URL(str).getHost());
        } catch (MalformedURLException e10) {
            AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", e10);
            return false;
        }
    }

    private static Map<String, Object> r_(Uri uri) {
        HashMap map = new HashMap();
        try {
            StringBuilder sb2 = new StringBuilder("ESP deeplink resolving is started: ");
            sb2.append(uri.toString());
            AFLogger.afDebugLog(sb2.toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri.toString()).openConnection()));
            httpURLConnection.setInstanceFollowRedirects(false);
            int i7 = component3;
            httpURLConnection.setReadTimeout(i7);
            httpURLConnection.setConnectTimeout(i7);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "6.18.1");
            int responseCode = httpURLConnection.getResponseCode();
            map.put("status", Integer.valueOf(responseCode));
            if (300 <= responseCode && responseCode <= 305) {
                map.put("res", httpURLConnection.getHeaderField(HttpHeaders.LOCATION));
            }
            httpURLConnection.disconnect();
            AFLogger.afDebugLog("ESP deeplink resolving is finished");
            return map;
        } catch (Throwable th) {
            map.put("error", th.getLocalizedMessage());
            AFLogger.afErrorLog(th.getMessage(), th);
            return map;
        }
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    @NonNull
    public final AFe1qSDK getCurrencyIso4217Code() throws Exception {
        Integer num = null;
        if (!getMediationNetwork(this.component1.toString())) {
            this.component2.j_(this.component4, this.component1, null);
            return AFe1qSDK.SUCCESS;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string = this.component1.toString();
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        String str = null;
        while (i7 < 5) {
            Map<String, Object> mapR_ = r_(Uri.parse(string));
            String str2 = (String) mapR_.get("res");
            Integer num2 = (Integer) mapR_.get("status");
            String str3 = (String) mapR_.get("error");
            if (str2 == null || !getMediationNetwork(str2)) {
                str = str3;
                string = str2;
                num = num2;
                break;
            }
            if (i7 < 4) {
                arrayList.add(str2);
            }
            i7++;
            str = str3;
            string = str2;
            num = num2;
        }
        HashMap map = new HashMap();
        map.put("res", string != null ? string : "");
        map.put("status", Integer.valueOf(num != null ? num.intValue() : -1));
        if (str != null) {
            map.put("error", str);
        }
        if (!arrayList.isEmpty()) {
            map.put("redirects", arrayList);
        }
        map.put("latency", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        synchronized (this.component4) {
            this.component4.AFAdRevenueData("af_deeplink_r", map);
            this.component4.AFAdRevenueData("af_deeplink", this.component1.toString());
        }
        this.component2.j_(this.component4, string != null ? Uri.parse(string) : this.component1, this.component1);
        this.areAllFieldsValid = map;
        return AFe1qSDK.SUCCESS;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final long getRevenue() {
        return 60000L;
    }
}
