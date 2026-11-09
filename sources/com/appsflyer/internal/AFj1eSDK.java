package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C;
import kotlin.collections.r;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@JvmName(name = "JsonUtils")
@SourceDebugExtension({"SMAP\nJsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonUtils.kt\ncom/appsflyer/internal/util/JsonUtils\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n759#2,2:62\n775#2,4:64\n759#2,2:68\n775#2,4:70\n1549#3:74\n1620#3,3:75\n*S KotlinDebug\n*F\n+ 1 JsonUtils.kt\ncom/appsflyer/internal/util/JsonUtils\n*L\n16#1:62,2\n16#1:64,4\n28#1:68,2\n28#1:70,4\n44#1:74\n44#1:75,3\n*E\n"})
public final class AFj1eSDK {
    private static final Object getMediationNetwork(Object obj) {
        if (obj instanceof JSONArray) {
            return getRevenue((JSONArray) obj);
        }
        if (obj instanceof JSONObject) {
            return getRevenue((JSONObject) obj);
        }
        if (Intrinsics.c(obj, JSONObject.NULL)) {
            return null;
        }
        return obj;
    }

    @NotNull
    public static final Map<String, Object> getRevenue(@NotNull JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "");
        Sf.a aVarA = Sf.m.a(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : aVarA) {
            Object obj2 = jSONObject.get((String) obj);
            Intrinsics.checkNotNullExpressionValue(obj2, "");
            linkedHashMap.put(obj, getMediationNetwork(obj2));
        }
        return linkedHashMap;
    }

    private static final List<Object> getRevenue(JSONArray jSONArray) throws JSONException {
        IntRange intRangeF = kotlin.ranges.b.f(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(r.l(intRangeF, 10));
        Iterator it = intRangeF.iterator();
        while (it.hasNext()) {
            Object obj = jSONArray.get(((C) it).a());
            Intrinsics.checkNotNullExpressionValue(obj, "");
            arrayList.add(getMediationNetwork(obj));
        }
        return arrayList;
    }
}
