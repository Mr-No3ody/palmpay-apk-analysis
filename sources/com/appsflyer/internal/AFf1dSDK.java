package com.appsflyer.internal;

import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerProperties;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.F;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1dSDK implements AFf1eSDK {

    @NotNull
    private final AFf1fSDK getCurrencyIso4217Code;

    @NotNull
    private final AppsFlyerProperties getMediationNetwork;

    @NotNull
    private final AFc1fSDK getMonetizationNetwork;

    public AFf1dSDK(@NotNull AFf1fSDK aFf1fSDK, @NotNull AFc1fSDK aFc1fSDK, @NotNull AppsFlyerProperties appsFlyerProperties) {
        Intrinsics.checkNotNullParameter(aFf1fSDK, "");
        Intrinsics.checkNotNullParameter(aFc1fSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        this.getCurrencyIso4217Code = aFf1fSDK;
        this.getMonetizationNetwork = aFc1fSDK;
        this.getMediationNetwork = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFf1eSDK
    public final void getMediationNetwork(@NotNull Map<String, Object> map, @NotNull AFe1nSDK aFe1nSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFe1nSDK, "");
        AFf1cSDK monetizationNetwork = this.getCurrencyIso4217Code.getMonetizationNetwork();
        AppsFlyerConsent appsFlyerConsent = this.getMonetizationNetwork.component2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (appsFlyerConsent != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Boolean boolIsUserSubjectToGDPR = appsFlyerConsent.isUserSubjectToGDPR();
            if (boolIsUserSubjectToGDPR != null) {
                linkedHashMap2.put("gdpr_applies", boolIsUserSubjectToGDPR);
            }
            Boolean hasConsentForDataUsage = appsFlyerConsent.getHasConsentForDataUsage();
            if (hasConsentForDataUsage != null) {
                linkedHashMap2.put("ad_user_data_enabled", hasConsentForDataUsage);
            }
            Boolean hasConsentForAdsPersonalization = appsFlyerConsent.getHasConsentForAdsPersonalization();
            if (hasConsentForAdsPersonalization != null) {
                linkedHashMap2.put("ad_personalization_enabled", hasConsentForAdsPersonalization);
            }
            Boolean hasConsentForAdStorage = appsFlyerConsent.getHasConsentForAdStorage();
            if (hasConsentForAdStorage != null) {
                linkedHashMap2.put("ad_storage_enabled", hasConsentForAdStorage);
            }
            linkedHashMap.put("manual", linkedHashMap2);
        }
        if (monetizationNetwork != null) {
            boolean z3 = appsFlyerConsent != null;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("policy_version", Integer.valueOf(monetizationNetwork.getRevenue));
            linkedHashMap3.put("cmp_sdk_id", Integer.valueOf(monetizationNetwork.getCurrencyIso4217Code));
            linkedHashMap3.put("cmp_sdk_version", Integer.valueOf(monetizationNetwork.getMonetizationNetwork));
            if (z3) {
                linkedHashMap3.put("gdpr_applies", -1);
                linkedHashMap3.put("tcstring", "");
            } else {
                linkedHashMap3.put("gdpr_applies", Integer.valueOf(monetizationNetwork.getMediationNetwork));
                linkedHashMap3.put("tcstring", monetizationNetwork.AFAdRevenueData);
            }
            linkedHashMap.put("tcf", linkedHashMap3);
        }
        if (!linkedHashMap.isEmpty()) {
            map.put("consent_data", linkedHashMap);
        }
        if (aFe1nSDK != AFe1nSDK.CONVERSION || this.getMediationNetwork.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION) == null) {
            return;
        }
        Map<String, Object> monetizationNetwork2 = AFa1uSDK.getMonetizationNetwork(map);
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork2, "");
        monetizationNetwork2.put("api", F.b(new Pair(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, this.getMediationNetwork.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))));
    }
}
