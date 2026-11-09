package com.appsflyer.internal;

import C0.G;
import android.os.Build;
import com.adjust.sdk.Constants;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.palmpay.lib.webview.offline.utils.OfflineConstant;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nResolveDdlTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResolveDdlTask.kt\ncom/appsflyer/internal/components/queue/tasks/ResolveDdlTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,278:1\n1#2:279\n1#2:290\n1603#3,9:280\n1855#3:289\n1856#3:291\n1612#3:292\n1855#3,2:296\n3792#4:293\n4307#4,2:294\n*S KotlinDebug\n*F\n+ 1 ResolveDdlTask.kt\ncom/appsflyer/internal/components/queue/tasks/ResolveDdlTask\n*L\n104#1:290\n104#1:280,9\n104#1:289\n104#1:291\n104#1:292\n202#1:296,2\n197#1:293\n197#1:294,2\n*E\n"})
public final class AFe1aSDK extends AFe1eSDK<AFa1pSDK> {
    private int AFInAppEventParameterName;

    @NotNull
    private final List<AFj1tSDK> AFInAppEventType;

    @NotNull
    private final CountDownLatch AFKeystoreWrapper;
    private int AFLogger;

    @NotNull
    private final AFa1qSDK component3;

    @NotNull
    private final AFc1fSDK copy;

    @NotNull
    private final AFc1pSDK copydefault;

    @NotNull
    private final AFj1rSDK equals;

    @NotNull
    private final AFa1mSDK hashCode;
    private int registerClient;

    @NotNull
    private final AFh1wSDK toString;

    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] AFAdRevenueData;
        public static final /* synthetic */ int[] getCurrencyIso4217Code;

        static {
            int[] iArr = new int[AFe1qSDK.values().length];
            try {
                iArr[AFe1qSDK.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1qSDK.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            getCurrencyIso4217Code = iArr;
            int[] iArr2 = new int[AFj1tSDK.AFa1uSDK.values().length];
            try {
                iArr2[AFj1tSDK.AFa1uSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AFj1tSDK.AFa1uSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            AFAdRevenueData = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1aSDK(@NotNull AFa1qSDK aFa1qSDK, @NotNull AFd1zSDK aFd1zSDK) {
        super(AFe1nSDK.DLSDK, new AFe1nSDK[]{AFe1nSDK.RC_CDN, AFe1nSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, "DdlSdk");
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.component3 = aFa1qSDK;
        this.AFKeystoreWrapper = new CountDownLatch(1);
        this.AFInAppEventType = new ArrayList();
        AFc1pSDK monetizationNetwork = aFd1zSDK.getMonetizationNetwork();
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        this.copydefault = monetizationNetwork;
        AFc1fSDK aFc1fSDKI = aFd1zSDK.i();
        Intrinsics.checkNotNullExpressionValue(aFc1fSDKI, "");
        this.copy = aFc1fSDKI;
        AFa1mSDK aFa1mSDKE = aFd1zSDK.e();
        Intrinsics.checkNotNullExpressionValue(aFa1mSDKE, "");
        this.hashCode = aFa1mSDKE;
        AFh1wSDK aFh1wSDKComponent2 = aFd1zSDK.component2();
        Intrinsics.checkNotNullExpressionValue(aFh1wSDKComponent2, "");
        this.toString = aFh1wSDKComponent2;
        AFj1rSDK aFj1rSDKEquals = aFd1zSDK.equals();
        Intrinsics.checkNotNullExpressionValue(aFj1rSDKEquals, "");
        this.equals = aFj1rSDKEquals;
        AFj1tSDK[] aFj1tSDKArr = (AFj1tSDK[]) aFj1rSDKEquals.AFAdRevenueData.toArray(new AFj1tSDK[0]);
        Intrinsics.checkNotNullExpressionValue(aFj1tSDKArr, "");
        ArrayList<AFj1tSDK> arrayList = new ArrayList();
        for (AFj1tSDK aFj1tSDK : aFj1tSDKArr) {
            if (aFj1tSDK != null && aFj1tSDK.component1 != AFj1tSDK.AFa1uSDK.NOT_STARTED) {
                arrayList.add(aFj1tSDK);
            }
        }
        this.registerClient = arrayList.size();
        for (final AFj1tSDK aFj1tSDK2 : arrayList) {
            AFj1tSDK.AFa1uSDK aFa1uSDK = aFj1tSDK2.component1;
            int i7 = aFa1uSDK == null ? -1 : AFa1uSDK.AFAdRevenueData[aFa1uSDK.ordinal()];
            if (i7 == 1) {
                AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, aFj1tSDK2.AFAdRevenueData.get("source") + " referrer collected earlier", false, 4, null);
                Intrinsics.checkNotNullExpressionValue(aFj1tSDK2, "");
                getCurrencyIso4217Code(aFj1tSDK2);
            } else if (i7 == 2) {
                aFj1tSDK2.addObserver(new Observer() { // from class: com.appsflyer.internal.j
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        AFe1aSDK.getMediationNetwork(aFj1tSDK2, this, observable, obj);
                    }
                });
            }
        }
    }

    private final boolean equals() {
        Object obj = this.component3.getMediationNetwork.get("referrers");
        List list = obj instanceof List ? (List) obj : null;
        return (list != null ? list.size() : 0) < this.registerClient && !this.component3.getMediationNetwork.containsKey("referrers");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFj1tSDK aFj1tSDK, AFe1aSDK aFe1aSDK, Observable observable, Object obj) {
        Intrinsics.checkNotNullParameter(aFe1aSDK, "");
        AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, aFj1tSDK.AFAdRevenueData.get("source") + " referrer collected via observer", false, 4, null);
        Intrinsics.f(observable, "");
        aFe1aSDK.getCurrencyIso4217Code((AFj1tSDK) observable);
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1sSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean component3() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final /* bridge */ /* synthetic */ AppsFlyerRequestListener copydefault() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1sSDK
    @NotNull
    public final AFe1qSDK getCurrencyIso4217Code() {
        AFe1qSDK aFe1qSDK = AFe1qSDK.FAILURE;
        try {
            AFe1qSDK currencyIso4217Code = super.getCurrencyIso4217Code();
            Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
            try {
                AFh1wSDK aFh1wSDK = this.toString;
                int i7 = this.AFLogger;
                if (i7 <= 0 || i7 > 2) {
                    AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - end", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i7))));
                } else {
                    int i10 = i7 - 1;
                    aFh1wSDK.component1[i10] = System.currentTimeMillis();
                    long j6 = aFh1wSDK.component3[i10];
                    if (j6 != 0) {
                        long[] jArr = aFh1wSDK.component4;
                        jArr[i10] = aFh1wSDK.component1[i10] - j6;
                        aFh1wSDK.getMediationNetwork.put("net", jArr);
                    } else {
                        StringBuilder sb2 = new StringBuilder("Metrics: ddlStart[");
                        sb2.append(i10);
                        sb2.append("] ts is missing");
                        AFLogger.afInfoLog(sb2.toString());
                    }
                }
                int i11 = AFa1uSDK.getCurrencyIso4217Code[currencyIso4217Code.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        return currencyIso4217Code;
                    }
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK = AFg1cSDK.DDL;
                    ResponseNetwork responseNetwork = this.areAllFieldsValid;
                    AFg1gSDK.d$default(aFLogger, aFg1cSDK, "Error occurred. Server response code = " + (responseNetwork != null ? Integer.valueOf(responseNetwork.getStatusCode()) : null), false, 4, null);
                    DeepLinkResult deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
                    this.toString.getRevenue(deepLinkResult, this.hashCode.component4);
                    this.hashCode.getMonetizationNetwork(deepLinkResult);
                    return currencyIso4217Code;
                }
                ResponseNetwork responseNetwork2 = this.areAllFieldsValid;
                Intrinsics.e(responseNetwork2);
                Object body = responseNetwork2.getBody();
                Intrinsics.checkNotNullExpressionValue(body, "");
                AFa1pSDK aFa1pSDK = (AFa1pSDK) body;
                DeepLink deepLink = aFa1pSDK.getCurrencyIso4217Code;
                if (deepLink != null) {
                    DeepLinkResult deepLinkResult2 = new DeepLinkResult(deepLink, null);
                    this.toString.getRevenue(deepLinkResult2, this.hashCode.component4);
                    this.hashCode.getMonetizationNetwork(deepLinkResult2);
                    return currencyIso4217Code;
                }
                if (this.AFLogger > 1 || !aFa1pSDK.getGetMonetizationNetwork() || !equals()) {
                    DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, null);
                    this.toString.getRevenue(deepLinkResult3, this.hashCode.component4);
                    this.hashCode.getMonetizationNetwork(deepLinkResult3);
                    return currencyIso4217Code;
                }
                AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Waiting for referrers...", false, 4, null);
                this.AFKeystoreWrapper.await();
                AFh1wSDK aFh1wSDK2 = this.toString;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j10 = aFh1wSDK2.component1[0];
                if (j10 != 0) {
                    aFh1wSDK2.getMediationNetwork.put("rfr_wait", Long.valueOf(jCurrentTimeMillis - j10));
                } else {
                    AFLogger.afInfoLog("Metrics: ddlEnd[0] ts is missing");
                }
                if (this.AFInAppEventParameterName != this.registerClient) {
                    return getCurrencyIso4217Code();
                }
                DeepLinkResult deepLinkResult4 = new DeepLinkResult(null, null);
                this.toString.getRevenue(deepLinkResult4, this.hashCode.component4);
                this.hashCode.getMonetizationNetwork(deepLinkResult4);
                return AFe1qSDK.SUCCESS;
            } catch (Exception e10) {
                e = e10;
                aFe1qSDK = currencyIso4217Code;
                Throwable cause = e.getCause();
                if (cause instanceof InterruptedException ? true : cause instanceof InterruptedIOException) {
                    AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", new TimeoutException());
                    AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Timeout, didn't manage to find deferred deeplink after " + this.AFLogger + " attempt(s) within " + this.hashCode.component4 + " milliseconds", false, 4, null);
                    DeepLinkResult deepLinkResult5 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
                    this.toString.getRevenue(deepLinkResult5, this.hashCode.component4);
                    this.hashCode.getMonetizationNetwork(deepLinkResult5);
                    return AFe1qSDK.TIMEOUT;
                }
                if (cause instanceof IOException) {
                    AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Http Exception: the request was not sent to the server", false, 4, null);
                    DeepLinkResult deepLinkResult6 = new DeepLinkResult(null, DeepLinkResult.Error.NETWORK);
                    this.toString.getRevenue(deepLinkResult6, this.hashCode.component4);
                    this.hashCode.getMonetizationNetwork(deepLinkResult6);
                    return aFe1qSDK;
                }
                AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Unexpected Exception: " + e, false, 4, null);
                DeepLinkResult deepLinkResult7 = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                this.toString.getRevenue(deepLinkResult7, this.hashCode.component4);
                this.hashCode.getMonetizationNetwork(deepLinkResult7);
                return aFe1qSDK;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1sSDK
    public final long getRevenue() {
        return this.hashCode.component4;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x014d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.appsflyer.internal.AFe1eSDK
    @NotNull
    public final AFd1hSDK<AFa1pSDK> AFAdRevenueData(@NotNull String str) {
        Map mapG;
        String[] strArr;
        Intrinsics.checkNotNullParameter(str, "");
        int i7 = this.AFLogger + 1;
        this.AFLogger = i7;
        AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, G.m(i7, "Preparing request "), false, 4, null);
        Map<String, Object> map = this.component3.getMediationNetwork;
        AFj1bSDK aFj1bSDK = null;
        Object[] objArr = 0;
        if (this.AFLogger == 1) {
            map.put("is_first", Boolean.valueOf(this.copydefault.AFAdRevenueData.getMonetizationNetwork("appsFlyerCount", 0) == 0));
            map.put("lang", Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry());
            map.put(OfflineConstant.PARAM_OS, Build.VERSION.RELEASE);
            map.put("type", Build.MODEL);
            map.put("request_id", AFb1mSDK.getMonetizationNetwork(this.copydefault.AFAdRevenueData));
            AFb1tSDK aFb1tSDK = this.copy.getCurrencyIso4217Code;
            if (aFb1tSDK != null && (strArr = aFb1tSDK.getCurrencyIso4217Code) != null) {
                Intrinsics.checkNotNullExpressionValue(strArr, "");
                map.put("sharing_filter", strArr);
            }
            AFh1sSDK aFh1sSDK = this.copydefault.getRevenue.areAllFieldsValid;
            Map<String, String> mapAFAdRevenueData = AFAdRevenueData(aFh1sSDK != null ? new AFb1lSDK(aFh1sSDK.getMonetizationNetwork, aFh1sSDK.component3) : null);
            if (mapAFAdRevenueData != null) {
                map.put("gaid", mapAFAdRevenueData);
            }
            Map<String, String> mapAFAdRevenueData2 = AFAdRevenueData(AFb1iSDK.getCurrencyIso4217Code(this.copydefault.getCurrencyIso4217Code.getRevenue));
            if (mapAFAdRevenueData2 != null) {
                map.put("oaid", mapAFAdRevenueData2);
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        map.put("timestamp", simpleDateFormat.format(new Date(jCurrentTimeMillis)));
        map.put("request_count", Integer.valueOf(this.AFLogger));
        List<AFj1tSDK> list = this.AFInAppEventType;
        ArrayList arrayList = new ArrayList();
        for (AFj1tSDK aFj1tSDK : list) {
            if (aFj1tSDK.component1 == AFj1tSDK.AFa1uSDK.FINISHED) {
                Object obj = aFj1tSDK.AFAdRevenueData.get(Constants.REFERRER);
                String str2 = obj instanceof String ? (String) obj : null;
                if (str2 != null) {
                    Object obj2 = aFj1tSDK.AFAdRevenueData.get("source");
                    Intrinsics.f(obj2, "");
                    mapG = kotlin.collections.G.g(new Pair("source", (String) obj2), new Pair("value", str2));
                } else {
                    mapG = null;
                }
            } else {
                mapG = null;
            }
            if (mapG != null) {
                arrayList.add(mapG);
            }
        }
        if (!arrayList.isEmpty()) {
            map.put("referrers", arrayList);
        }
        AFa1qSDK aFa1qSDK = this.component3;
        AFj1iSDK aFj1iSDK = new AFj1iSDK(this.copydefault, aFj1bSDK, 2, objArr == true ? 1 : 0);
        String revenue = ((AFe1eSDK) this).component2.getRevenue();
        Object obj3 = this.component3.getMediationNetwork.get("timestamp");
        Intrinsics.f(obj3, "");
        aFa1qSDK.component4 = aFj1iSDK.getMediationNetwork(revenue, (String) obj3);
        AFh1wSDK aFh1wSDK = this.toString;
        int i10 = this.AFLogger;
        if (i10 <= 0 || i10 > 2) {
            AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - start", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i10))));
        } else {
            int i11 = i10 - 1;
            aFh1wSDK.component3[i11] = System.currentTimeMillis();
            if (i11 == 0) {
                long j6 = aFh1wSDK.areAllFieldsValid;
                if (j6 != 0) {
                    aFh1wSDK.getMediationNetwork.put("from_fg", Long.valueOf(aFh1wSDK.component3[i11] - j6));
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
            }
        }
        AFd1hSDK<AFa1pSDK> revenue2 = ((AFe1eSDK) this).component1.getRevenue(this.component3);
        Intrinsics.checkNotNullExpressionValue(revenue2, "");
        return revenue2;
    }

    private static boolean getMediationNetwork(AFj1tSDK aFj1tSDK) {
        Object obj = aFj1tSDK.AFAdRevenueData.get("click_ts");
        Long l5 = obj instanceof Long ? (Long) obj : null;
        if (l5 != null) {
            if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l5.longValue()) < TimeUnit.DAYS.toMillis(1L)) {
                return true;
            }
        }
        return false;
    }

    private static Map<String, String> AFAdRevenueData(AFb1lSDK aFb1lSDK) {
        String str;
        if (aFb1lSDK == null || (str = aFb1lSDK.getRevenue) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(str, "");
        Boolean bool = aFb1lSDK.getMediationNetwork;
        if (bool == null || !bool.booleanValue()) {
            return kotlin.collections.G.g(new Pair("type", "unhashed"), new Pair("value", str));
        }
        return null;
    }

    private final void getCurrencyIso4217Code(AFj1tSDK aFj1tSDK) {
        if (getMediationNetwork(aFj1tSDK)) {
            this.AFInAppEventType.add(aFj1tSDK);
            this.AFKeystoreWrapper.countDown();
            AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Added non-organic ".concat(aFj1tSDK.getClass().getSimpleName()), false, 4, null);
        } else {
            int i7 = this.AFInAppEventParameterName + 1;
            this.AFInAppEventParameterName = i7;
            if (i7 == this.registerClient) {
                this.AFKeystoreWrapper.countDown();
            }
        }
    }
}
