package com.appsflyer.internal;

import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p355xf.o;
import p355xf.p;
import p355xf.q;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1bSDK {

    @Nullable
    public final AFh1aSDK AFAdRevenueData;

    @Nullable
    public AFh1dSDK getCurrencyIso4217Code;

    @Nullable
    public final AFh1cSDK getMonetizationNetwork;

    public AFh1bSDK(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.getCurrencyIso4217Code = getMediationNetwork(jSONObject);
        this.AFAdRevenueData = getCurrencyIso4217Code(jSONObject);
        this.getMonetizationNetwork = getRevenue(jSONObject);
    }

    private static JSONObject AFAdRevenueData(JSONObject jSONObject, String str) throws JSONException, NullPointerException {
        JSONObject jSONObjectOptJSONObject;
        if (!jSONObject.has(str) || (jSONObjectOptJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject("v1");
    }

    private static AFh1aSDK getCurrencyIso4217Code(JSONObject jSONObject) {
        Object objF;
        try {
            o oVar = q.f43977a;
            JSONObject jSONObjectAFAdRevenueData = AFAdRevenueData(jSONObject, "exc_mngr");
            objF = jSONObjectAFAdRevenueData != null ? new AFh1aSDK(jSONObjectAFAdRevenueData.getString("sdk_ver"), jSONObjectAFAdRevenueData.optInt("min", -1), jSONObjectAFAdRevenueData.optInt("expire", -1), jSONObjectAFAdRevenueData.optLong("ttl", -1L)) : null;
        } catch (Throwable th) {
            o oVar2 = q.f43977a;
            objF = androidx.camera.core.impl.utils.executor.g.f(th);
        }
        return (AFh1aSDK) (objF instanceof p ? null : objF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlin.collections.z] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    private static AFh1dSDK getMediationNetwork(JSONObject jSONObject) {
        Object objF;
        ?? arrayList;
        try {
            o oVar = q.f43977a;
            JSONObject jSONObjectAFAdRevenueData = AFAdRevenueData(jSONObject, "r_debugger");
            if (jSONObjectAFAdRevenueData != null) {
                long j6 = jSONObjectAFAdRevenueData.getLong("ttl");
                int i7 = jSONObjectAFAdRevenueData.getInt("counter");
                String strOptString = jSONObjectAFAdRevenueData.optString("app_ver", "");
                String strOptString2 = jSONObjectAFAdRevenueData.optString("sdk_ver", "");
                float fOptDouble = (float) jSONObjectAFAdRevenueData.optDouble("ratio", 1.0d);
                JSONArray jSONArrayOptJSONArray = jSONObjectAFAdRevenueData.optJSONArray("tags");
                if (jSONArrayOptJSONArray != null) {
                    Intrinsics.checkNotNullExpressionValue(jSONArrayOptJSONArray, "");
                    arrayList = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        String string = jSONArrayOptJSONArray.getString(i10);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        arrayList.add(string);
                    }
                } else {
                    arrayList = z.f38935a;
                }
                ?? r10 = arrayList;
                Intrinsics.checkNotNullExpressionValue(strOptString, "");
                Intrinsics.checkNotNullExpressionValue(strOptString2, "");
                objF = new AFh1dSDK(j6, fOptDouble, r10, i7, strOptString, strOptString2);
            } else {
                objF = null;
            }
        } catch (Throwable th) {
            o oVar2 = q.f43977a;
            objF = androidx.camera.core.impl.utils.executor.g.f(th);
        }
        o oVar3 = q.f43977a;
        return (AFh1dSDK) (objF instanceof p ? null : objF);
    }

    private static AFh1cSDK getRevenue(JSONObject jSONObject) {
        Object objF;
        try {
            o oVar = q.f43977a;
            JSONObject jSONObjectAFAdRevenueData = AFAdRevenueData(jSONObject, "meta_data");
            objF = jSONObjectAFAdRevenueData != null ? new AFh1cSDK(jSONObjectAFAdRevenueData.optDouble("send_rate", 1.0d)) : null;
        } catch (Throwable th) {
            o oVar2 = q.f43977a;
            objF = androidx.camera.core.impl.utils.executor.g.f(th);
        }
        return (AFh1cSDK) (objF instanceof p ? null : objF);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AFh1bSDK.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.f(obj, "");
        AFh1bSDK aFh1bSDK = (AFh1bSDK) obj;
        return Intrinsics.c(this.AFAdRevenueData, aFh1bSDK.AFAdRevenueData) && Intrinsics.c(this.getMonetizationNetwork, aFh1bSDK.getMonetizationNetwork) && Intrinsics.c(this.getCurrencyIso4217Code, aFh1bSDK.getCurrencyIso4217Code);
    }

    public final int hashCode() {
        AFh1aSDK aFh1aSDK = this.AFAdRevenueData;
        int iHashCode = (aFh1aSDK != null ? aFh1aSDK.hashCode() : 0) * 31;
        AFh1cSDK aFh1cSDK = this.getMonetizationNetwork;
        int iHashCode2 = (iHashCode + (aFh1cSDK != null ? aFh1cSDK.hashCode() : 0)) * 31;
        AFh1dSDK aFh1dSDK = this.getCurrencyIso4217Code;
        return iHashCode2 + (aFh1dSDK != null ? aFh1dSDK.hashCode() : 0);
    }
}
