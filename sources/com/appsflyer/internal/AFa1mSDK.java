package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFe1tSDK.AnonymousClass5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFa1mSDK {
    public Intent AFAdRevenueData;

    @Nullable
    public String[] component1;
    public final AFd1zSDK component2;
    public long component4;

    @Nullable
    public DeepLinkListener getCurrencyIso4217Code;
    public String getMonetizationNetwork;
    public Map<String, String> getRevenue;

    @NonNull
    public List<List<String>> getMediationNetwork = new ArrayList();

    @NonNull
    public final List<String> areAllFieldsValid = new ArrayList();

    public AFa1mSDK(@NonNull AFd1zSDK aFd1zSDK) {
        this.component2 = aFd1zSDK;
    }

    private static void AFAdRevenueData(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = ((AFa1uSDK) AFa1uSDK.getRevenue(new Object[0], 1795555804, -1795555788, (int) System.currentTimeMillis())).getCurrencyIso4217Code;
        if (appsFlyerConversionListener != null) {
            try {
                AFLogger.afDebugLog("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                appsFlyerConversionListener.onAttributionFailure(str);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    private boolean h_(Intent intent, AFa1gSDK aFa1gSDK) {
        String string;
        Uri uriI_;
        Uri uri = null;
        Uri data = (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData();
        Intent intent2 = this.AFAdRevenueData;
        Uri data2 = (intent2 == null || !"android.intent.action.VIEW".equals(intent2.getAction())) ? null : intent2.getData();
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (!this.getMediationNetwork.isEmpty() && extras != null) {
                for (List<String> list : this.getMediationNetwork) {
                    if (list == null) {
                        uriI_ = null;
                    } else {
                        Iterator<String> it = list.iterator();
                        if (it.hasNext() && (string = extras.getString(it.next())) != null) {
                            uriI_ = i_(string, it);
                        } else {
                            uriI_ = null;
                        }
                    }
                    if (uriI_ != null) {
                        StringBuilder sb2 = new StringBuilder("Found deeplink in push payload at ");
                        sb2.append(list.toString());
                        AFLogger.afDebugLog(sb2.toString());
                        List<List<String>> list2 = this.getMediationNetwork;
                        Intrinsics.checkNotNullParameter("payloadKey", "");
                        Map<String, Object> monetizationNetwork = AFa1uSDK.getMonetizationNetwork(aFa1gSDK.getCurrencyIso4217Code);
                        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                        monetizationNetwork.put("payloadKey", list2);
                        AFa1hSDK aFa1hSDK = aFa1gSDK.getRevenue;
                        if (aFa1hSDK != null) {
                            aFa1hSDK.getRevenue(aFa1gSDK.getCurrencyIso4217Code);
                        }
                        uri = uriI_;
                        break;
                    }
                }
            }
        } else {
            AFLogger.afDebugLog("Could not extract deeplink from null intent");
        }
        if (data != null) {
            AFj1lSDK aFj1lSDK = new AFj1lSDK(intent);
            if (!aFj1lSDK.AFAdRevenueData("af_consumed")) {
                aFj1lSDK.I_("af_consumed", System.currentTimeMillis());
                g_(aFa1gSDK, data);
                return true;
            }
            StringBuilder sb3 = new StringBuilder("skipping re-use of previously consumed deep link: ");
            sb3.append(data.toString());
            sb3.append(" w/af_consumed");
            AFLogger.afInfoLog(sb3.toString());
            return false;
        }
        if (data2 != null) {
            AFj1lSDK aFj1lSDK2 = new AFj1lSDK(this.AFAdRevenueData);
            if (!aFj1lSDK2.AFAdRevenueData("af_consumed")) {
                aFj1lSDK2.I_("af_consumed", System.currentTimeMillis());
                g_(aFa1gSDK, data2);
                return true;
            }
            StringBuilder sb4 = new StringBuilder("skipping re-use of previously consumed trampoline deep link: ");
            sb4.append(data2.toString());
            sb4.append(" w/af_consumed");
            AFLogger.afInfoLog(sb4.toString());
            return false;
        }
        if (uri == null) {
            AFLogger.afDebugLog("No deep link detected");
            return false;
        }
        AFj1lSDK aFj1lSDK3 = new AFj1lSDK(intent);
        if (!aFj1lSDK3.AFAdRevenueData("af_consumed")) {
            aFj1lSDK3.I_("af_consumed", System.currentTimeMillis());
            g_(aFa1gSDK, uri);
            return true;
        }
        StringBuilder sb5 = new StringBuilder("skipping re-use of previously consumed deep link from push: ");
        sb5.append(uri.toString());
        sb5.append(" w/af_consumed");
        AFLogger.afInfoLog(sb5.toString());
        return false;
    }

    @Nullable
    private Uri i_(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri uri = Uri.parse(obj.toString());
                if (uri == null || uri.getScheme() == null || uri.getHost() == null) {
                    return null;
                }
                return uri;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException e10) {
                AFLogger.afErrorLogForExcManagerOnly("recursiveSearch error", e10);
                return null;
            }
        }
        return null;
    }

    public final void f_(AFa1gSDK aFa1gSDK, Intent intent, Context context) {
        AFc1dSDK aFc1dSDK = (AFc1dSDK) this.component2;
        if (context != null) {
            aFc1dSDK.AFAdRevenueData.getRevenue = context.getApplicationContext();
        }
        if (!h_(intent, aFa1gSDK) && this.getCurrencyIso4217Code != null && this.component2.getMonetizationNetwork().AFAdRevenueData.getMonetizationNetwork("appsFlyerCount", 0) == 0 && !this.component2.getRevenue().getMonetizationNetwork("ddl_sent")) {
            AFa1qSDK aFa1qSDK = new AFa1qSDK();
            AFe1tSDK aFe1tSDKCopydefault = this.component2.copydefault();
            aFe1tSDKCopydefault.getRevenue.execute(aFe1tSDKCopydefault.new AnonymousClass5(new AFe1aSDK(aFa1qSDK, this.component2)));
        }
        this.component2.getRevenue().AFAdRevenueData("ddl_sent", true);
    }

    public final void g_(AFa1gSDK aFa1gSDK, Uri uri) {
        AFf1wSDK aFf1wSDK = new AFf1wSDK(this, aFa1gSDK, uri, this.areAllFieldsValid);
        AFe1tSDK aFe1tSDKCopydefault = this.component2.copydefault();
        aFe1tSDKCopydefault.getRevenue.execute(aFe1tSDKCopydefault.new AnonymousClass5(aFf1wSDK));
        this.AFAdRevenueData = null;
    }

    public final void getMonetizationNetwork(DeepLinkResult deepLinkResult) {
        if (this.getCurrencyIso4217Code == null) {
            AFLogger.INSTANCE.d(AFg1cSDK.DDL, "skipping, no callback registered");
            return;
        }
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.DDL;
        StringBuilder sb2 = new StringBuilder("Calling onDeepLinking with:\n");
        sb2.append(deepLinkResult.toString());
        aFLogger.d(aFg1cSDK, sb2.toString());
        try {
            this.getCurrencyIso4217Code.onDeepLinking(deepLinkResult);
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getLocalizedMessage(), th);
        }
    }

    public final void getRevenue(String str, DeepLinkResult.Error error) {
        if (this.getCurrencyIso4217Code == null) {
            AFAdRevenueData(str);
        } else {
            AFLogger.INSTANCE.d(AFg1cSDK.DDL, "Error occurred: ".concat(String.valueOf(str)));
            getMonetizationNetwork(new DeepLinkResult(null, error));
        }
    }

    public final void j_(AFa1gSDK aFa1gSDK, Uri uri, @Nullable Uri uri2) {
        if (!aFa1gSDK.getMonetizationNetwork("af_deeplink")) {
            String string = uri.toString();
            if (string == null) {
                string = null;
            } else if (string.matches("fb\\d*?://authorize.*") && string.contains("access_token")) {
                int iIndexOf = string.indexOf(63);
                String strSubstring = iIndexOf == -1 ? "" : string.substring(iIndexOf);
                if (strSubstring.length() != 0) {
                    ArrayList arrayList = new ArrayList();
                    if (strSubstring.contains("&")) {
                        arrayList = new ArrayList(Arrays.asList(strSubstring.split("&")));
                    } else {
                        arrayList.add(strSubstring);
                    }
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (str.contains("access_token")) {
                            it.remove();
                        } else {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            } else if (!str.startsWith("?")) {
                                sb2.append("?");
                            }
                            sb2.append(str);
                        }
                    }
                    string = string.replace(strSubstring, sb2.toString());
                }
            }
            String str2 = this.getMonetizationNetwork;
            if (str2 != null && this.getRevenue != null && string.contains(str2)) {
                Uri.Builder builderBuildUpon = Uri.parse(string).buildUpon();
                Uri.Builder builderBuildUpon2 = Uri.EMPTY.buildUpon();
                for (Map.Entry<String, String> entry : this.getRevenue.entrySet()) {
                    builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    builderBuildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                string = builderBuildUpon.build().toString();
                String encodedQuery = builderBuildUpon2.build().getEncodedQuery();
                Intrinsics.checkNotNullParameter("appended_query_params", "");
                aFa1gSDK.getCurrencyIso4217Code.put("appended_query_params", encodedQuery);
                AFa1hSDK aFa1hSDK = aFa1gSDK.getRevenue;
                if (aFa1hSDK != null) {
                    aFa1hSDK.getRevenue(aFa1gSDK.getCurrencyIso4217Code);
                }
            }
            Intrinsics.checkNotNullParameter("af_deeplink", "");
            aFa1gSDK.getCurrencyIso4217Code.put("af_deeplink", string);
            AFa1hSDK aFa1hSDK2 = aFa1gSDK.getRevenue;
            if (aFa1hSDK2 != null) {
                aFa1hSDK2.getRevenue(aFa1gSDK.getCurrencyIso4217Code);
            }
        }
        final HashMap map = new HashMap();
        map.put("link", uri.toString());
        if (uri2 != null) {
            map.put("original_link", uri2.toString());
        }
        AFj1gSDK.M_(this.component2.getMonetizationNetwork().n_(), map, uri);
        AFf1zSDK aFf1zSDK = new AFf1zSDK(this.component2, UUID.randomUUID(), uri);
        if (aFf1zSDK.copy()) {
            Boolean bool = Boolean.TRUE;
            Intrinsics.checkNotNullParameter("isBrandedDomain", "");
            aFa1gSDK.getCurrencyIso4217Code.put("isBrandedDomain", bool);
            AFa1hSDK aFa1hSDK3 = aFa1gSDK.getRevenue;
            if (aFa1hSDK3 != null) {
                aFa1hSDK3.getRevenue(aFa1gSDK.getCurrencyIso4217Code);
            }
        }
        if (!aFf1zSDK.equals()) {
            this.component2.e().getRevenue(map);
            return;
        }
        aFf1zSDK.component3 = new AFf1zSDK.AFa1uSDK() { // from class: com.appsflyer.internal.AFa1mSDK.1
            @Override // com.appsflyer.internal.AFf1zSDK.AFa1uSDK
            public final void getRevenue(String str3) {
                AFa1mSDK.this.getRevenue(str3, DeepLinkResult.Error.NETWORK);
            }

            @Override // com.appsflyer.internal.AFf1zSDK.AFa1uSDK
            public final void getRevenue(Map<String, String> map2) {
                for (String str3 : map2.keySet()) {
                    map.put(str3, map2.get(str3));
                }
                AFa1mSDK.this.getRevenue(map);
            }
        };
        AFe1tSDK aFe1tSDKCopydefault = this.component2.copydefault();
        aFe1tSDKCopydefault.getRevenue.execute(aFe1tSDKCopydefault.new AnonymousClass5(aFf1zSDK));
    }

    public final void getRevenue(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (this.getCurrencyIso4217Code != null) {
            try {
                try {
                    DeepLink mediationNetwork = DeepLink.getMediationNetwork(map);
                    mediationNetwork.getCurrencyIso4217Code.put("is_deferred", false);
                    deepLinkResult = new DeepLinkResult(mediationNetwork, null);
                } catch (JSONException e10) {
                    AFLogger.INSTANCE.e(AFg1cSDK.DDL, "Error occurred", e10, true);
                    deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                }
                getMonetizationNetwork(deepLinkResult);
                return;
            } catch (Throwable th) {
                getMonetizationNetwork(new DeepLinkResult(null, null));
                throw th;
            }
        }
        AppsFlyerConversionListener appsFlyerConversionListener = ((AFa1uSDK) AFa1uSDK.getRevenue(new Object[0], 1795555804, -1795555788, (int) System.currentTimeMillis())).getCurrencyIso4217Code;
        if (appsFlyerConversionListener != null) {
            try {
                StringBuilder sb2 = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb2.append(map.toString());
                AFLogger.afDebugLog(sb2.toString());
                appsFlyerConversionListener.onAppOpenAttribution(map);
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getLocalizedMessage(), th2);
            }
        }
    }
}
