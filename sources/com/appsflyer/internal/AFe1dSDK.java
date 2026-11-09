package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.transsnet.palmpay.core.bean.bill.TransType;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00112\u0006\u0010\u0004\u001a\u00020\u0002H\u0015¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0012\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u0012\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001dR\u0014\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001fR\u0014\u0010\"\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0015\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'"}, d2 = {"Lcom/appsflyer/internal/AFe1dSDK;", "Lcom/appsflyer/internal/AFe1eSDK;", "", "Lcom/appsflyer/internal/AFi1nSDK;", "p0", "Lcom/appsflyer/internal/AFc1pSDK;", "p1", "Lcom/appsflyer/internal/AFd1zSDK;", TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW, "Lcom/appsflyer/internal/AFg1vSDK;", "p3", "Lcom/appsflyer/internal/AFc1eSDK;", TransType.TRANS_TYPE_SPLIT_BILL, "Lcom/appsflyer/internal/AFh1eSDK;", TransType.TRANS_TYPE_BILLER_ONLINE_SHOPPING, "<init>", "(Lcom/appsflyer/internal/AFi1nSDK;Lcom/appsflyer/internal/AFc1pSDK;Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFg1vSDK;Lcom/appsflyer/internal/AFc1eSDK;Lcom/appsflyer/internal/AFh1eSDK;)V", "Lcom/appsflyer/internal/AFd1hSDK;", "AFAdRevenueData", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1hSDK;", "", "getRevenue", "()J", "Lcom/appsflyer/attribution/AppsFlyerRequestListener;", "copydefault", "()Lcom/appsflyer/attribution/AppsFlyerRequestListener;", "", "component3", "()Z", "Lcom/appsflyer/internal/AFc1eSDK;", "getCurrencyIso4217Code", "Lcom/appsflyer/internal/AFh1eSDK;", "equals", "Lcom/appsflyer/internal/AFg1vSDK;", "getMonetizationNetwork", "copy", "Lcom/appsflyer/internal/AFc1pSDK;", "getMediationNetwork", "toString", "Lcom/appsflyer/internal/AFi1nSDK;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFe1dSDK extends AFe1eSDK<String> {

    /* JADX INFO: renamed from: component3, reason: from kotlin metadata */
    @NotNull
    public AFh1eSDK AFAdRevenueData;

    /* JADX INFO: renamed from: copy, reason: from kotlin metadata */
    @NotNull
    private final AFc1pSDK getMediationNetwork;

    /* JADX INFO: renamed from: copydefault, reason: from kotlin metadata */
    @NotNull
    private final AFc1eSDK getCurrencyIso4217Code;

    /* JADX INFO: renamed from: equals, reason: from kotlin metadata */
    @NotNull
    private final AFg1vSDK getMonetizationNetwork;

    /* JADX INFO: renamed from: toString, reason: from kotlin metadata */
    @NotNull
    private final AFi1nSDK getRevenue;

    public /* synthetic */ AFe1dSDK(AFi1nSDK aFi1nSDK, AFc1pSDK aFc1pSDK, AFd1zSDK aFd1zSDK, AFg1vSDK aFg1vSDK, AFc1eSDK aFc1eSDK, AFh1eSDK aFh1eSDK, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFi1nSDK, aFc1pSDK, aFd1zSDK, aFg1vSDK, aFc1eSDK, (i7 & 32) != 0 ? new AFh1eSDK() : aFh1eSDK);
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1sSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean component3() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    @Nullable
    public final AppsFlyerRequestListener copydefault() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1sSDK
    public final long getRevenue() {
        return TimeUnit.MINUTES.toMillis(1L);
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    @Nullable
    public final AFd1hSDK<String> AFAdRevenueData(@NotNull String p3) throws JSONException {
        LinkedHashMap linkedHashMap;
        AFd1aSDK aFd1aSDK;
        String str;
        Intrinsics.checkNotNullParameter(p3, "");
        AFh1eSDK aFh1eSDK = this.AFAdRevenueData;
        Map<String, Object> map = aFh1eSDK.getMediationNetwork;
        Intrinsics.checkNotNullExpressionValue(map, "");
        map.put("app_id", this.getMediationNetwork.getCurrencyIso4217Code.getRevenue.getPackageName());
        map.put("sdk_version", AFc1pSDK.getRevenue());
        map.put("app_version_name", this.getMediationNetwork.n_().versionName);
        this.getMonetizationNetwork.getCurrencyIso4217Code(map);
        if (AFi1hSDK.getRevenue(this.getCurrencyIso4217Code.getRevenue)) {
            try {
                AFi1oSDK monetizationNetwork = this.getRevenue.getMonetizationNetwork();
                if (monetizationNetwork != null) {
                    linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("pia_timestamp", Long.valueOf(monetizationNetwork.getRevenue));
                    linkedHashMap2.put("ttr_millis", Long.valueOf(monetizationNetwork.getCurrencyIso4217Code));
                    String str2 = monetizationNetwork.AFAdRevenueData;
                    if (str2 != null) {
                        linkedHashMap2.put("pia_token", str2);
                    }
                    String str3 = monetizationNetwork.getMonetizationNetwork;
                    if (str3 != null) {
                        linkedHashMap2.put("error_code", str3);
                    }
                    linkedHashMap.put("pia", linkedHashMap2);
                } else {
                    linkedHashMap = null;
                }
                if (linkedHashMap != null) {
                    aFh1eSDK.getCurrencyIso4217Code(linkedHashMap);
                }
            } catch (Throwable th) {
                AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PLAY_INTEGRITY_API, "Error while adding PIA data to payload", th, true, false, false, false, 96, null);
            }
        } else {
            Map<String, Object> map2 = aFh1eSDK.getMediationNetwork;
            Intrinsics.checkNotNullExpressionValue(map2, "");
            AFj1fSDK.getMediationNetwork(map2).put("pia_disabled", Boolean.TRUE);
        }
        AFd1hSDK<String> currencyIso4217Code = ((AFe1eSDK) this).component1.getCurrencyIso4217Code(this.AFAdRevenueData, ((AFe1eSDK) this).component2.getRevenue(), this.getCurrencyIso4217Code);
        Map<String, Object> map3 = this.AFAdRevenueData.getMediationNetwork;
        Intrinsics.checkNotNullExpressionValue(map3, "");
        if (currencyIso4217Code != null && (aFd1aSDK = currencyIso4217Code.getMediationNetwork) != null && (str = aFd1aSDK.AFAdRevenueData) != null) {
            JSONObject jSONObject = new JSONObject(map3);
            if (jSONObject.has("pia")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("pia");
                if (jSONObject2.has("pia_token")) {
                    jSONObject2.put("pia_token", AFg1dSDK.getCurrencyIso4217Code(jSONObject2.getString("pia_token")));
                }
            }
            AFg1dSDK.getMediationNetwork(toString() + ": preparing data: ", jSONObject);
            AFd1oSDK aFd1oSDK = ((AFe1eSDK) this).component4;
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            aFd1oSDK.getMonetizationNetwork(str, string);
        }
        return currencyIso4217Code;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    private AFe1dSDK(@NotNull AFi1nSDK aFi1nSDK, @NotNull AFc1pSDK aFc1pSDK, @NotNull AFd1zSDK aFd1zSDK, @NotNull AFg1vSDK aFg1vSDK, @NotNull AFc1eSDK aFc1eSDK, @NotNull AFh1eSDK aFh1eSDK) {
        Intrinsics.checkNotNullParameter(aFi1nSDK, "");
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(aFg1vSDK, "");
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        Intrinsics.checkNotNullParameter(aFh1eSDK, "");
        AFe1nSDK aFe1nSDK = AFe1nSDK.PLAY_INTEGRITY_API;
        AFe1nSDK aFe1nSDK2 = AFe1nSDK.CONVERSION;
        super(aFe1nSDK, new AFe1nSDK[]{aFe1nSDK2}, aFd1zSDK, "PIA");
        this.getRevenue = aFi1nSDK;
        this.getMediationNetwork = aFc1pSDK;
        this.getMonetizationNetwork = aFg1vSDK;
        this.getCurrencyIso4217Code = aFc1eSDK;
        this.AFAdRevenueData = aFh1eSDK;
        this.AFAdRevenueData.add(aFe1nSDK2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AFe1dSDK(@NotNull AFi1nSDK aFi1nSDK, @NotNull AFc1pSDK aFc1pSDK, @NotNull AFd1zSDK aFd1zSDK, @NotNull AFg1vSDK aFg1vSDK, @NotNull AFc1eSDK aFc1eSDK) {
        this(aFi1nSDK, aFc1pSDK, aFd1zSDK, aFg1vSDK, aFc1eSDK, null, 32, null);
        Intrinsics.checkNotNullParameter(aFi1nSDK, "");
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(aFg1vSDK, "");
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
    }
}
