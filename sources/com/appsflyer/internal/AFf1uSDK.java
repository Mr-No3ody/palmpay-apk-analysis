package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.adjust.sdk.Constants;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1uSDK extends AFf1rSDK {

    @NonNull
    private final AFa1hSDK AFInAppEventParameterName;

    @NonNull
    private final AppsFlyerProperties AFInAppEventType;

    @Nullable
    private final AFh1uSDK AFKeystoreWrapper;

    @NonNull
    private final AFc1qSDK copy;

    @NonNull
    private final AFh1wSDK copydefault;
    public Map<String, Object> equals;

    @NonNull
    private final AFj1rSDK hashCode;

    @NonNull
    private final AFf1pSDK registerClient;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFf1uSDK$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] getMediationNetwork;

        static {
            int[] iArr = new int[AFj1tSDK.AFa1uSDK.values().length];
            getMediationNetwork = iArr;
            try {
                iArr[AFj1tSDK.AFa1uSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getMediationNetwork[AFj1tSDK.AFa1uSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AFf1uSDK(@NonNull AFh1qSDK aFh1qSDK, @NonNull AFd1zSDK aFd1zSDK) {
        super(aFh1qSDK, aFd1zSDK);
        this.hashCode = aFd1zSDK.equals();
        this.copy = aFd1zSDK.getRevenue();
        this.copydefault = aFd1zSDK.component2();
        this.registerClient = aFd1zSDK.component4();
        this.AFInAppEventType = AppsFlyerProperties.getInstance();
        this.AFInAppEventParameterName = aFd1zSDK.afInfoLog();
        this.AFKeystoreWrapper = aFd1zSDK.afErrorLogForExcManagerOnly();
        this.getCurrencyIso4217Code.add(AFe1nSDK.RESOLVE_ESP);
        this.getCurrencyIso4217Code.add(AFe1nSDK.DLSDK);
    }

    @VisibleForTesting
    private boolean copy() {
        ResponseNetwork responseNetwork = this.areAllFieldsValid;
        boolean z3 = this.getMonetizationNetwork == AFe1qSDK.FAILURE && responseNetwork != null && responseNetwork.getStatusCode() / 500 == 1;
        AFe1nSDK aFe1nSDK = this.getMediationNetwork;
        return z3 && (aFe1nSDK == AFe1nSDK.CONVERSION || aFe1nSDK == AFe1nSDK.ATTR);
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1sSDK
    public final boolean AFAdRevenueData() {
        return super.AFAdRevenueData() || copy();
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1sSDK
    public final void getMediationNetwork() {
        super.getMediationNetwork();
        AFh1wSDK aFh1wSDK = this.copydefault;
        if (aFh1wSDK.getRevenue()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j6 = aFh1wSDK.toString;
            if (j6 == 0) {
                AFLogger.afInfoLog("Metrics: launch start ts is missing");
                return;
            }
            aFh1wSDK.getCurrencyIso4217Code.put("net", Long.valueOf(jCurrentTimeMillis - j6));
            aFh1wSDK.AFAdRevenueData.getMonetizationNetwork("first_launch", new JSONObject(aFh1wSDK.getCurrencyIso4217Code).toString());
        }
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final void AFAdRevenueData(AFh1qSDK aFh1qSDK) {
        AFh1uSDK aFh1uSDK;
        AFh1uSDK aFh1uSDK2;
        super.AFAdRevenueData(aFh1qSDK);
        int i7 = aFh1qSDK.areAllFieldsValid;
        AFh1wSDK aFh1wSDK = this.copydefault;
        if (aFh1wSDK.getRevenue()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            aFh1wSDK.toString = jCurrentTimeMillis;
            long j6 = aFh1wSDK.areAllFieldsValid;
            if (j6 != 0) {
                aFh1wSDK.getCurrencyIso4217Code.put("from_fg", Long.valueOf(jCurrentTimeMillis - j6));
                aFh1wSDK.AFAdRevenueData.getMonetizationNetwork("first_launch", new JSONObject(aFh1wSDK.getCurrencyIso4217Code).toString());
            } else {
                AFLogger.afInfoLog("Metrics: fg ts is missing");
            }
        }
        Map map = (Map) aFh1qSDK.getMediationNetwork.get(Constants.REFERRER_API_META);
        if (map == null) {
            map = new HashMap();
            aFh1qSDK.getMediationNetwork.put(Constants.REFERRER_API_META, map);
        }
        if (!aFh1qSDK.getMediationNetwork.containsKey("af_deeplink")) {
            aFh1qSDK.getCurrencyIso4217Code(this.AFInAppEventParameterName.getMediationNetwork());
        }
        AFi1ySDK monetizationNetwork = this.registerClient.getMonetizationNetwork();
        if (monetizationNetwork != null) {
            HashMap map2 = new HashMap();
            map2.put("cdn_token", monetizationNetwork.AFAdRevenueData);
            String str = monetizationNetwork.getRevenue;
            if (str != null) {
                map2.put("c_ver", str);
            }
            long j10 = monetizationNetwork.getMonetizationNetwork;
            if (j10 > 0) {
                map2.put("latency", Long.valueOf(j10));
            }
            long j11 = monetizationNetwork.getMediationNetwork;
            if (j11 > 0) {
                map2.put("delay", Long.valueOf(j11));
            }
            int i10 = monetizationNetwork.getCurrencyIso4217Code;
            if (i10 > 0) {
                map2.put("res_code", Integer.valueOf(i10));
            }
            if (monetizationNetwork.component1 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(monetizationNetwork.component1.getClass().getSimpleName());
                sb2.append(": ");
                sb2.append(monetizationNetwork.component1.getMessage());
                map2.put("error", sb2.toString());
            }
            AFi1uSDK aFi1uSDK = monetizationNetwork.component3;
            if (aFi1uSDK != null) {
                map2.put("sig", aFi1uSDK.toString());
            }
            String str2 = monetizationNetwork.areAllFieldsValid;
            if (str2 != null) {
                map2.put("cdn_cache_status", str2);
            }
            map.put("rc", map2);
        }
        ((AFf1rSDK) this).toString.getMonetizationNetwork(aFh1qSDK.getMediationNetwork);
        if (i7 == 1) {
            if (this.AFInAppEventType.getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
                aFh1qSDK.getMediationNetwork.put("wait_cid", Boolean.toString(true));
            }
            AFh1wSDK aFh1wSDK2 = this.copydefault;
            HashMap map3 = new HashMap(aFh1wSDK2.getMediationNetwork);
            aFh1wSDK2.getMediationNetwork.clear();
            if (!map3.isEmpty()) {
                map.put("ddl", map3);
            }
            HashMap map4 = new HashMap(this.copydefault.getCurrencyIso4217Code);
            if (!map4.isEmpty()) {
                map.put("first_launch", map4);
            }
            AFh1uSDK aFh1uSDK3 = this.AFKeystoreWrapper;
            if (aFh1uSDK3 != null) {
                aFh1uSDK3.getRevenue(aFh1qSDK);
            }
        } else if (i7 == 2) {
            AFh1wSDK aFh1wSDK3 = this.copydefault;
            aFh1wSDK3.AFAdRevenueData.getMediationNetwork("first_launch");
            HashMap map5 = new HashMap(aFh1wSDK3.getCurrencyIso4217Code);
            if (!map5.isEmpty()) {
                map.put("first_launch", map5);
            }
            if ((aFh1qSDK instanceof AFh1rSDK) && (aFh1uSDK2 = this.AFKeystoreWrapper) != null && !aFh1uSDK2.getCurrencyIso4217Code()) {
                this.AFKeystoreWrapper.getCurrencyIso4217Code(aFh1qSDK);
            }
        }
        if (map.isEmpty()) {
            aFh1qSDK.getMediationNetwork.remove(Constants.REFERRER_API_META);
        }
        if (i7 <= 2) {
            ArrayList arrayList = new ArrayList();
            for (AFj1tSDK aFj1tSDK : (AFj1tSDK[]) this.hashCode.AFAdRevenueData.toArray(new AFj1tSDK[0])) {
                boolean z3 = aFj1tSDK instanceof AFi1aSDK;
                int i11 = AnonymousClass3.getMediationNetwork[aFj1tSDK.component1.ordinal()];
                if (i11 == 1) {
                    if (z3) {
                        aFh1qSDK.getMediationNetwork("rfr", ((AFi1aSDK) aFj1tSDK).getRevenue);
                        this.copy.AFAdRevenueData(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                    }
                    arrayList.add(aFj1tSDK.AFAdRevenueData);
                } else if (i11 == 2 && i7 == 2 && !z3) {
                    HashMap map6 = new HashMap();
                    map6.put("source", aFj1tSDK.getMediationNetwork);
                    map6.put("response", "TIMEOUT");
                    map6.put("type", aFj1tSDK.component4);
                    arrayList.add(map6);
                }
            }
            if (!arrayList.isEmpty()) {
                aFh1qSDK.getMediationNetwork("referrers", arrayList);
            }
            Object obj = this.equals;
            if (obj != null) {
                aFh1qSDK.getMediationNetwork("fb_ddl", obj);
            }
        }
        if (aFh1qSDK.getCurrencyIso4217Code() == AFe1nSDK.LAUNCH && (aFh1uSDK = this.AFKeystoreWrapper) != null && aFh1uSDK.getRevenue()) {
            this.AFKeystoreWrapper.getMonetizationNetwork(aFh1qSDK);
        }
        ((AFf1rSDK) this).toString.getMediationNetwork(aFh1qSDK);
    }
}
