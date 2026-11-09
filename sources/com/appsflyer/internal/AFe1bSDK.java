package com.appsflyer.internal;

import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AFPurchaseType;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.core.bean.bill.TransType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.collections.G;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p355xf.o;
import p355xf.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0001,BK\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0015JC\u0010\u0014\u001a\u000e\u0012\b\u0012\u0006*\u00020\t0\t\u0018\u00010\u00162\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\u0014\u0010\u0017J%\u0010\u0014\u001a\u00020\t2\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0015¢\u0006\u0004\b\u0014\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001a\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u001a\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u0004\u0018\u00010\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010(R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*"}, d2 = {"Lcom/appsflyer/internal/AFe1bSDK;", "Lcom/appsflyer/internal/AFe1iSDK;", "Lcom/appsflyer/internal/AFd1zSDK;", "p0", "Lcom/appsflyer/AppsFlyerProperties;", "p1", "Lcom/appsflyer/AFPurchaseDetails;", TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW, "", "", "p3", "Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;", TransType.TRANS_TYPE_SPLIT_BILL, "Lcom/appsflyer/internal/AFj1hSDK;", TransType.TRANS_TYPE_BILLER_ONLINE_SHOPPING, "<init>", "(Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/AppsFlyerProperties;Lcom/appsflyer/AFPurchaseDetails;Ljava/util/Map;Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;Lcom/appsflyer/internal/AFj1hSDK;)V", "", "", "", "getRevenue", "(Ljava/util/Map;Ljava/lang/String;)V", "Lcom/appsflyer/internal/AFd1hSDK;", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1hSDK;", "(Ljava/util/Map;)Ljava/lang/String;", "", "getMediationNetwork", "(Ljava/lang/String;I)V", "()V", "", "component3", "()Z", "copy", "Ljava/util/Map;", "getCurrencyIso4217Code", "hashCode", "Lcom/appsflyer/internal/AFj1hSDK;", "toString", "Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;", "getMonetizationNetwork", "Lcom/appsflyer/AppsFlyerProperties;", "equals", "Lcom/appsflyer/AFPurchaseDetails;", "AFAdRevenueData", "AFa1uSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nManualValidationTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManualValidationTask.kt\ncom/appsflyer/internal/components/queue/tasks/ManualValidationTask\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,158:1\n1747#2,3:159\n*S KotlinDebug\n*F\n+ 1 ManualValidationTask.kt\ncom/appsflyer/internal/components/queue/tasks/ManualValidationTask\n*L\n100#1:159,3\n*E\n"})
public final class AFe1bSDK extends AFe1iSDK {

    /* JADX INFO: renamed from: component3, reason: from kotlin metadata */
    @NotNull
    private final AppsFlyerProperties getMediationNetwork;

    /* JADX INFO: renamed from: copy, reason: from kotlin metadata */
    @Nullable
    private final Map<String, String> getCurrencyIso4217Code;

    /* JADX INFO: renamed from: equals, reason: from kotlin metadata */
    @NotNull
    private final AFPurchaseDetails AFAdRevenueData;

    /* JADX INFO: renamed from: hashCode, reason: from kotlin metadata */
    @NotNull
    private final AFj1hSDK getRevenue;

    /* JADX INFO: renamed from: toString, reason: from kotlin metadata */
    @Nullable
    private final AppsFlyerInAppPurchaseValidationCallback getMonetizationNetwork;

    public static final class AFa1uSDK extends RuntimeException {
    }

    public /* synthetic */ class AFa1zSDK {
        public static final /* synthetic */ int[] AFAdRevenueData;

        static {
            int[] iArr = new int[AFPurchaseType.values().length];
            try {
                iArr[AFPurchaseType.SUBSCRIPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFPurchaseType.ONE_TIME_PURCHASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AFAdRevenueData = iArr;
        }
    }

    public /* synthetic */ AFe1bSDK(AFd1zSDK aFd1zSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1hSDK aFj1hSDK, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1zSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, (i7 & 32) != 0 ? new AFj1jSDK() : aFj1hSDK);
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean component3() {
        return true;
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1sSDK
    public final void getMediationNetwork() {
        Object objF;
        super.getMediationNetwork();
        Throwable thComponent4 = component4();
        if (thComponent4 != null && !(thComponent4 instanceof AFe1pSDK)) {
            if (thComponent4 instanceof AFe1lSDK) {
                getMediationNetwork("No dev key", -1);
            } else if (thComponent4 instanceof AFa1uSDK) {
                getMediationNetwork("One or more of provided arguments is empty", -1);
            } else {
                getMediationNetwork("Error while sending request to server", -1);
            }
        }
        ResponseNetwork responseNetwork = this.areAllFieldsValid;
        if (responseNetwork != null) {
            if (responseNetwork.getStatusCode() != 200) {
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.getMonetizationNetwork;
                if (appsFlyerInAppPurchaseValidationCallback != null) {
                    appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(G.g(new Pair("error_code", Integer.valueOf(responseNetwork.getStatusCode())), new Pair("error_message", responseNetwork.getBody())));
                    return;
                }
                return;
            }
            try {
                o oVar = q.f43977a;
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback2 = this.getMonetizationNetwork;
                if (appsFlyerInAppPurchaseValidationCallback2 != null) {
                    appsFlyerInAppPurchaseValidationCallback2.onInAppPurchaseValidationFinished(AFj1eSDK.getRevenue(new JSONObject((String) responseNetwork.getBody())));
                    objF = Unit.f38893a;
                } else {
                    objF = null;
                }
            } catch (Throwable th) {
                o oVar2 = q.f43977a;
                objF = androidx.camera.core.impl.utils.executor.g.f(th);
            }
            if (q.a(objF) != null) {
                getMediationNetwork("Error while trying to parse JSON response", responseNetwork.getStatusCode());
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1iSDK
    public final void getRevenue(@NotNull Map<String, Object> p3, @Nullable String p10) {
        Intrinsics.checkNotNullParameter(p3, "");
        super.getRevenue(p3, p10);
        List listH = C1850q.h(this.AFAdRevenueData.getPurchaseToken(), this.AFAdRevenueData.getProductId());
        if (!(listH instanceof Collection) || !listH.isEmpty()) {
            Iterator it = listH.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).length() == 0) {
                    throw new AFa1uSDK();
                }
            }
        }
        p3.put("purchase_token", this.AFAdRevenueData.getPurchaseToken());
        p3.put(FirebaseAnalytics.Param.PRODUCT_ID, this.AFAdRevenueData.getProductId());
        p3.put("purchase_type", this.AFAdRevenueData.getPurchaseType().getValue());
        Map<String, String> map = this.getCurrencyIso4217Code;
        if (map != null && !map.isEmpty()) {
            p3.put("purchase_additional_details", this.getCurrencyIso4217Code);
        }
        String string = this.getMediationNetwork.getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        p3.put("custom_data", (string == null || string.length() == 0) ? G.c() : AFj1eSDK.getRevenue(new JSONObject(string)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    private AFe1bSDK(@NotNull AFd1zSDK aFd1zSDK, @NotNull AppsFlyerProperties appsFlyerProperties, @NotNull AFPurchaseDetails aFPurchaseDetails, @Nullable Map<String, String> map, @Nullable AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, @NotNull AFj1hSDK aFj1hSDK) {
        super(AFe1nSDK.MANUAL_PURCHASE_VALIDATION, new AFe1nSDK[]{AFe1nSDK.RC_CDN, AFe1nSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, null, G.c());
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, "");
        Intrinsics.checkNotNullParameter(aFj1hSDK, "");
        this.getMediationNetwork = appsFlyerProperties;
        this.AFAdRevenueData = aFPurchaseDetails;
        this.getCurrencyIso4217Code = map;
        this.getMonetizationNetwork = appsFlyerInAppPurchaseValidationCallback;
        this.getRevenue = aFj1hSDK;
        this.getCurrencyIso4217Code.add(AFe1nSDK.CONVERSION);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AFe1bSDK(@NotNull AFd1zSDK aFd1zSDK, @NotNull AppsFlyerProperties appsFlyerProperties, @NotNull AFPurchaseDetails aFPurchaseDetails, @Nullable Map<String, String> map, @Nullable AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        this(aFd1zSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, null, 32, null);
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, "");
    }

    @Override // com.appsflyer.internal.AFe1iSDK
    @NotNull
    public final String getRevenue(@NotNull Map<String, Object> p3) {
        Intrinsics.checkNotNullParameter(p3, "");
        return this.getRevenue.getMediationNetwork();
    }

    @Override // com.appsflyer.internal.AFe1iSDK
    @Nullable
    public final AFd1hSDK<String> getRevenue(@NotNull Map<String, Object> p3, @NotNull String p10, @Nullable String p11) {
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p10, "");
        int i7 = AFa1zSDK.AFAdRevenueData[this.AFAdRevenueData.getPurchaseType().ordinal()];
        if (i7 == 1) {
            return ((AFe1eSDK) this).component1.getMonetizationNetwork(p3, p10);
        }
        if (i7 == 2) {
            return ((AFe1eSDK) this).component1.getCurrencyIso4217Code(p3, p10);
        }
        throw new p355xf.l();
    }

    private final void getMediationNetwork(String p3, int p10) {
        AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.getMonetizationNetwork;
        if (appsFlyerInAppPurchaseValidationCallback != null) {
            appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(G.g(new Pair("error_code", Integer.valueOf(p10)), new Pair("error_message", p3)));
        }
    }
}
