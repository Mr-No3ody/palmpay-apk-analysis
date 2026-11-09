package com.appsflyer.internal;

import android.os.Build;
import androidx.annotation.CallSuper;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFe1iSDK extends AFe1eSDK<String> {

    @NotNull
    private final AFe1nSDK component3;

    @NotNull
    private final AFc1qSDK copy;

    @NotNull
    private final AFf1eSDK copydefault;

    @NotNull
    private final Map<String, Object> equals;

    @NotNull
    private final AFg1vSDK hashCode;

    @NotNull
    private final AFc1pSDK toString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1iSDK(@NotNull AFe1nSDK aFe1nSDK, @NotNull AFe1nSDK[] aFe1nSDKArr, @NotNull AFd1zSDK aFd1zSDK, @Nullable String str, @NotNull Map<String, ? extends Object> map) {
        super(aFe1nSDK, aFe1nSDKArr, aFd1zSDK, null);
        Intrinsics.checkNotNullParameter(aFe1nSDK, "");
        Intrinsics.checkNotNullParameter(aFe1nSDKArr, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.component3 = aFe1nSDK;
        this.equals = map;
        AFc1pSDK monetizationNetwork = aFd1zSDK.getMonetizationNetwork();
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        this.toString = monetizationNetwork;
        AFc1qSDK revenue = aFd1zSDK.getRevenue();
        Intrinsics.checkNotNullExpressionValue(revenue, "");
        this.copy = revenue;
        AFg1vSDK aFg1vSDKComponent3 = aFd1zSDK.component3();
        Intrinsics.checkNotNullExpressionValue(aFg1vSDKComponent3, "");
        this.hashCode = aFg1vSDKComponent3;
        AFf1eSDK aFf1eSDKAfDebugLog = aFd1zSDK.afDebugLog();
        Intrinsics.checkNotNullExpressionValue(aFf1eSDKAfDebugLog, "");
        this.copydefault = aFf1eSDKAfDebugLog;
    }

    @Nullable
    public String AFAdRevenueData(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    public boolean component2() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    @Nullable
    public final AppsFlyerRequestListener copydefault() {
        return null;
    }

    @Nullable
    public abstract AFd1hSDK<String> getRevenue(@NotNull Map<String, Object> map, @NotNull String str, @Nullable String str2);

    @Nullable
    public String getRevenue(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    @Nullable
    public final AFd1hSDK<String> AFAdRevenueData(@NotNull String str) {
        AFd1aSDK aFd1aSDK;
        Intrinsics.checkNotNullParameter(str, "");
        Map<String, Object> mapL = G.l(this.equals);
        String revenue = getRevenue(mapL);
        String strAFAdRevenueData = AFAdRevenueData(mapL);
        Map<String, Object> mapL2 = G.l(mapL);
        getRevenue(mapL2, revenue);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String mediationNetwork = this.toString.getMediationNetwork();
        if (mediationNetwork != null && !StringsKt.F(mediationNetwork)) {
            linkedHashMap.put("advertising_id", mediationNetwork);
        }
        AFb1lSDK currencyIso4217Code = AFb1iSDK.getCurrencyIso4217Code(this.toString.getCurrencyIso4217Code.getRevenue);
        String str2 = null;
        String str3 = currencyIso4217Code != null ? currencyIso4217Code.getRevenue : null;
        if (str3 != null && !StringsKt.F(str3)) {
            linkedHashMap.put("oaid", str3);
        }
        AFb1lSDK aFb1lSDKL_ = AFb1iSDK.l_(this.toString.getCurrencyIso4217Code.getRevenue.getContentResolver());
        String str4 = aFb1lSDKL_ != null ? aFb1lSDKL_.getRevenue : null;
        if (str4 != null && !StringsKt.F(str4)) {
            linkedHashMap.put("amazon_aid", str4);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            mapL2.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        } else {
            String strAFAdRevenueData2 = ((AFe1eSDK) this).component2.AFAdRevenueData(this.copy);
            if (strAFAdRevenueData2 != null && !StringsKt.F(strAFAdRevenueData2)) {
                linkedHashMap.put("imei", strAFAdRevenueData2);
            }
        }
        String monetizationNetwork = AFb1mSDK.getMonetizationNetwork(this.toString.AFAdRevenueData);
        if (monetizationNetwork == null) {
            monetizationNetwork = "";
        }
        linkedHashMap.put("appsflyer_id", monetizationNetwork);
        linkedHashMap.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap.put("sdk_version", "6.18.1");
        if (strAFAdRevenueData != null && !StringsKt.F(strAFAdRevenueData)) {
            linkedHashMap.put("sdk_connector_version", strAFAdRevenueData);
        }
        this.hashCode.getRevenue(linkedHashMap, this.component3);
        mapL2.put("device_data", linkedHashMap);
        this.copydefault.getMediationNetwork(mapL2, this.component3);
        AFd1hSDK<String> revenue2 = getRevenue(mapL2, str, revenue);
        if (revenue2 != null && (aFd1aSDK = revenue2.getMediationNetwork) != null) {
            str2 = aFd1aSDK.AFAdRevenueData;
        }
        if (str2 != null) {
            JSONObject jSONObject = new JSONObject(mapL2);
            AFg1dSDK.getMediationNetwork(toString() + ": preparing data: ", jSONObject);
            AFd1oSDK aFd1oSDK = ((AFe1eSDK) this).component4;
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            aFd1oSDK.getMonetizationNetwork(str2, string);
        }
        return revenue2;
    }

    @CallSuper
    public void getRevenue(@NotNull Map<String, Object> map, @Nullable String str) {
        Intrinsics.checkNotNullParameter(map, "");
        map.put("app_id", this.toString.getCurrencyIso4217Code.getRevenue.getPackageName());
        String currencyIso4217Code = AFc1pSDK.getCurrencyIso4217Code();
        if (currencyIso4217Code != null) {
            map.put("cuid", currencyIso4217Code);
        }
        map.put("app_version_name", this.toString.n_().versionName);
        if (component2()) {
            map.put("event_timestamp", Long.valueOf(this.hashCode.getCurrencyIso4217Code()));
        }
        if (str != null) {
            map.put("billing_lib_version", str);
        }
    }
}
