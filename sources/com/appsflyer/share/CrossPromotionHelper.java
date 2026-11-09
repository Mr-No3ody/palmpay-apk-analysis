package com.appsflyer.share;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1uSDK;
import com.appsflyer.internal.AFd1zSDK;
import com.appsflyer.internal.AFe1hSDK;
import com.appsflyer.internal.AFe1tSDK;
import com.appsflyer.internal.AFe1tSDK.AnonymousClass5;
import com.appsflyer.internal.AFg1cSDK;
import com.appsflyer.internal.AFj1aSDK;
import com.appsflyer.internal.AFk1zSDK;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class CrossPromotionHelper {
    private static String getMonetizationNetwork = "https://%simpression.%s";

    @NonNull
    private static LinkGenerator AFAdRevenueData(@NonNull Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.getMonetizationNetwork = str3;
        linkGenerator.getCurrencyIso4217Code = str;
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        return linkGenerator;
    }

    private static void getCurrencyIso4217Code(@NonNull String str, @NonNull Context context, @Nullable AFj1aSDK aFj1aSDK) {
        AFa1uSDK aFa1uSDK = (AFa1uSDK) AFa1uSDK.getRevenue(new Object[0], 1795555804, -1795555788, (int) System.currentTimeMillis());
        aFa1uSDK.getMediationNetwork(context);
        AFd1zSDK revenue = aFa1uSDK.getRevenue();
        AFe1hSDK aFe1hSDK = new AFe1hSDK(revenue, str, aFj1aSDK);
        AFe1tSDK aFe1tSDKCopydefault = revenue.copydefault();
        aFe1tSDKCopydefault.getRevenue.execute(aFe1tSDKCopydefault.new AnonymousClass5(aFe1hSDK));
    }

    public static void logAndOpenStore(@NonNull Context context, String str, String str2) {
        logAndOpenStore(context, str, str2, null);
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String str, String str2) {
        logCrossPromoteImpression(context, str, str2, null);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    public static void setUrl(Map<String, String> map) {
        byte b7;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            int iHashCode = key.hashCode();
            if (iHashCode != 96801) {
                if (iHashCode == 120623625 && key.equals("impression")) {
                    b7 = 1;
                } else {
                    b7 = -1;
                }
            } else if (key.equals("app")) {
                b7 = 0;
            } else {
                b7 = -1;
            }
            if (b7 == 0) {
                AFk1zSDK.getCurrencyIso4217Code = value;
            } else if (b7 == 1) {
                getMonetizationNetwork = value;
            }
        }
    }

    public static void logAndOpenStore(@NonNull Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator linkGeneratorAFAdRevenueData = AFAdRevenueData(context, str, str2, map, String.format(AFk1zSDK.getCurrencyIso4217Code, AppsFlyerLib.getInstance().getHostPrefix(), ((AFa1uSDK) AFa1uSDK.getRevenue(new Object[0], 1795555804, -1795555788, (int) System.currentTimeMillis())).getHostName()));
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.INSTANCE.i(AFg1cSDK.CROSS_PROMOTION, "CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.INSTANCE.i(AFg1cSDK.CROSS_PROMOTION, "SDK is stopped, track And Open Store is disabled", true);
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("af_campaign", str2);
        AppsFlyerLib.getInstance().logEvent(context, "af_cross_promotion", map);
        getCurrencyIso4217Code(linkGeneratorAFAdRevenueData.generateLink(), context, new AFj1aSDK(context));
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String str, String str2, Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.INSTANCE.i(AFg1cSDK.CROSS_PROMOTION, "CustomerUserId not set, Promote Impression is disabled", true);
        } else if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.INSTANCE.i(AFg1cSDK.CROSS_PROMOTION, "SDK is stopped, Promote Impression is disabled", true);
        } else {
            getCurrencyIso4217Code(AFAdRevenueData(context, str, str2, map, String.format(getMonetizationNetwork, AppsFlyerLib.getInstance().getHostPrefix(), ((AFa1uSDK) AFa1uSDK.getRevenue(new Object[0], 1795555804, -1795555788, (int) System.currentTimeMillis())).getHostName())).generateLink(), context, null);
        }
    }
}
