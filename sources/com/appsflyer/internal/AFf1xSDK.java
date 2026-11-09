package com.appsflyer.internal;

import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AdRevenueScheme;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSendAdRevenueTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SendAdRevenueTask.kt\ncom/appsflyer/internal/components/queue/tasks/SendAdRevenueTask\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,77:1\n215#2,2:78\n*S KotlinDebug\n*F\n+ 1 SendAdRevenueTask.kt\ncom/appsflyer/internal/components/queue/tasks/SendAdRevenueTask\n*L\n66#1:78,2\n*E\n"})
public final class AFf1xSDK extends AFf1rSDK {

    @NotNull
    private final AFh1oSDK equals;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1xSDK(@NotNull AFh1oSDK aFh1oSDK, @NotNull AFd1zSDK aFd1zSDK) {
        super(aFh1oSDK, aFd1zSDK);
        Intrinsics.checkNotNullParameter(aFh1oSDK, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.equals = aFh1oSDK;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final void AFAdRevenueData(@NotNull AFh1qSDK aFh1qSDK) {
        Intrinsics.checkNotNullParameter(aFh1qSDK, "");
        super.AFAdRevenueData(aFh1qSDK);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        AFAdRevenueData aFAdRevenueData = this.equals.hashCode;
        Intrinsics.checkNotNullExpressionValue(aFAdRevenueData, "");
        linkedHashMap.put("monetization_network", aFAdRevenueData.getMonetizationNetwork());
        linkedHashMap.put("event_revenue_currency", aFAdRevenueData.getCurrencyIso4217Code());
        linkedHashMap.put("mediation_network", aFAdRevenueData.getMediationNetwork().getValue());
        linkedHashMap.put("event_revenue", Double.valueOf(aFAdRevenueData.getRevenue()));
        Map<String, Object> map = this.equals.copydefault;
        if (map != null && !map.isEmpty()) {
            List listH = C1850q.h(AdRevenueScheme.AD_TYPE, AdRevenueScheme.AD_UNIT, AdRevenueScheme.COUNTRY, AdRevenueScheme.PLACEMENT);
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (listH.contains(key)) {
                    linkedHashMap.put(key, value);
                } else {
                    linkedHashMap2.put(key, value);
                }
            }
            linkedHashMap.put("custom_parameters", linkedHashMap2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("name", "adrevenue_sdk");
        linkedHashMap3.put("payload", linkedHashMap);
        Map<String, Object> map2 = aFh1qSDK.getMediationNetwork;
        Intrinsics.checkNotNullExpressionValue(map2, "");
        map2.put("ad_network", linkedHashMap3);
    }
}
