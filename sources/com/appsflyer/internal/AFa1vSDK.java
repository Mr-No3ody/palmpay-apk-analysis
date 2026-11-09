package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.F;
import com.adjust.sdk.Constants;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFe1tSDK.AnonymousClass5;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFa1vSDK implements Runnable {
    private final WeakReference<Context> AFAdRevenueData;
    private final String areAllFieldsValid;
    private final String component3;
    private final Map<String, String> component4;
    private final String getCurrencyIso4217Code;
    final String getMediationNetwork;
    final String getMonetizationNetwork;
    final String getRevenue;

    public AFa1vSDK(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.AFAdRevenueData = new WeakReference<>(context);
        this.getCurrencyIso4217Code = str;
        this.areAllFieldsValid = str2;
        this.getRevenue = str4;
        this.getMonetizationNetwork = str5;
        this.getMediationNetwork = str6;
        this.component4 = map;
        this.component3 = str3;
    }

    private static AFf1rSDK getRevenue(Context context, @NonNull AFh1iSDK aFh1iSDK) {
        ((AFa1uSDK) AFa1uSDK.getRevenue(new Object[0], 1795555804, -1795555788, (int) System.currentTimeMillis())).getMediationNetwork(context);
        AFd1zSDK revenue = ((AFa1uSDK) AFa1uSDK.getRevenue(new Object[0], 1795555804, -1795555788, (int) System.currentTimeMillis())).getRevenue();
        aFh1iSDK.getCurrencyIso4217Code(revenue.getMonetizationNetwork().AFAdRevenueData.getMonetizationNetwork("appsFlyerCount", 0));
        AFf1rSDK aFf1rSDK = new AFf1rSDK(aFh1iSDK, revenue);
        AFe1tSDK aFe1tSDKCopydefault = revenue.copydefault();
        aFe1tSDKCopydefault.getRevenue.execute(aFe1tSDKCopydefault.new AnonymousClass5(aFf1rSDK));
        return aFf1rSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.getCurrencyIso4217Code;
        if (str == null || str.length() == 0 || AppsFlyerLib.getInstance().isStopped()) {
            return;
        }
        try {
            Context context = this.AFAdRevenueData.get();
            if (context == null) {
                return;
            }
            HashMap map = new HashMap();
            map.put("public-key", this.areAllFieldsValid);
            map.put("sig-data", this.getRevenue);
            map.put("signature", this.component3);
            Object map2 = new HashMap(map);
            Object obj = this.component4;
            String currencyIso4217Code = ((AFa1uSDK) AFa1uSDK.getRevenue(new Object[0], 1795555804, -1795555788, (int) System.currentTimeMillis())).getRevenue().getRevenue().getCurrencyIso4217Code(Constants.REFERRER, "");
            AFh1hSDK aFh1hSDK = new AFh1hSDK();
            aFh1hSDK.component2 = currencyIso4217Code;
            AFa1uSDK aFa1uSDK = (AFa1uSDK) AFa1uSDK.getRevenue(new Object[0], 1795555804, -1795555788, (int) System.currentTimeMillis());
            Map<String, Object> mapAFAdRevenueData = aFa1uSDK.AFAdRevenueData(aFh1hSDK);
            mapAFAdRevenueData.put(FirebaseAnalytics.Param.PRICE, this.getMonetizationNetwork);
            mapAFAdRevenueData.put(FirebaseAnalytics.Param.CURRENCY, this.getMediationNetwork);
            mapAFAdRevenueData.put("receipt_data", map2);
            if (obj != null) {
                mapAFAdRevenueData.put("extra_prms", obj);
            }
            AFf1jSDK aFf1jSDKAFInAppEventType = aFa1uSDK.getRevenue().AFInAppEventType();
            mapAFAdRevenueData.putAll((Map) AFf1jSDK.getCurrencyIso4217Code(new Object[]{aFf1jSDKAFInAppEventType}, -1942462603, 1942462605, System.identityHashCode(aFf1jSDKAFInAppEventType)));
            aFh1hSDK.getCurrencyIso4217Code((Map<String, ?>) mapAFAdRevenueData);
            getRevenue(context, aFh1hSDK);
            map.put("dev_key", this.getCurrencyIso4217Code);
            map.put("app_id", context.getPackageName());
            map.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
            AFh1sSDK aFh1sSDK = ((AFa1uSDK) AFa1uSDK.getRevenue(new Object[0], 1795555804, -1795555788, (int) System.currentTimeMillis())).getRevenue().getMonetizationNetwork().getRevenue.areAllFieldsValid;
            AFb1lSDK aFb1lSDK = aFh1sSDK != null ? new AFb1lSDK(aFh1sSDK.getMonetizationNetwork, aFh1sSDK.component3) : null;
            String str2 = aFb1lSDK != null ? aFb1lSDK.getRevenue : null;
            if (str2 != null) {
                map.put("advertiserId", str2);
            }
            AFh1gSDK aFh1gSDK = (AFh1gSDK) new AFh1gSDK().getCurrencyIso4217Code(map);
            final AFf1rSDK revenue = getRevenue(context, aFh1gSDK);
            aFh1gSDK.AFAdRevenueData = new AppsFlyerRequestListener() { // from class: com.appsflyer.internal.AFa1vSDK.1
                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onError(int i7, @NonNull String str3) {
                    ResponseNetwork responseNetwork;
                    if (i7 == 50 && (responseNetwork = revenue.areAllFieldsValid) != null) {
                        str3 = responseNetwork.toString();
                    }
                    AFa1vSDK aFa1vSDK = AFa1vSDK.this;
                    AFa1vSDK.getRevenue(false, aFa1vSDK.getRevenue, aFa1vSDK.getMonetizationNetwork, aFa1vSDK.getMediationNetwork, str3);
                }

                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onSuccess() {
                    try {
                        JSONObject jSONObject = new JSONObject((String) revenue.areAllFieldsValid.getBody());
                        AFLogger.afInfoLog("Validate response ok: ".concat(String.valueOf(jSONObject)));
                        boolean zOptBoolean = jSONObject.optBoolean("result");
                        AFa1vSDK aFa1vSDK = AFa1vSDK.this;
                        AFa1vSDK.getRevenue(zOptBoolean, aFa1vSDK.getRevenue, aFa1vSDK.getMonetizationNetwork, aFa1vSDK.getMediationNetwork, jSONObject.toString());
                    } catch (Exception e10) {
                        AFLogger.afErrorLog("Failed Validate request: ".concat(String.valueOf(e10)), e10);
                        AFa1vSDK aFa1vSDK2 = AFa1vSDK.this;
                        AFa1vSDK.getRevenue(false, aFa1vSDK2.getRevenue, aFa1vSDK2.getMonetizationNetwork, aFa1vSDK2.getMediationNetwork, e10.getMessage());
                    }
                }
            };
        } catch (Throwable th) {
            if (AFa1uSDK.getRevenue != null) {
                AFLogger.afErrorLog("Failed Validate request + ex", th);
                getRevenue(false, this.getRevenue, this.getMonetizationNetwork, this.getMediationNetwork, th.getMessage());
            }
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }

    public static void getRevenue(boolean z3, String str, String str2, String str3, String str4) {
        if (AFa1uSDK.getRevenue != null) {
            StringBuilder sbF = F.f("Validate callback parameters: ", str, " ", str2, " ");
            sbF.append(str3);
            AFLogger.afDebugLog(sbF.toString());
            if (z3) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AFa1uSDK.getRevenue.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFa1uSDK.getRevenue;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }
}
