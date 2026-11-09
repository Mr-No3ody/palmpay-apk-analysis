package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.transsnet.palmpay.core.bean.bill.TransType;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;
import p355xf.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\r8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u000fR\u001b\u0010\u000e\u001a\u00020\r8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016"}, d2 = {"Lcom/appsflyer/internal/AFf1nSDK;", "", "Lcom/appsflyer/internal/AFc1pSDK;", "p0", "Lcom/appsflyer/internal/AFf1qSDK;", "p1", "Lcom/appsflyer/internal/AFc1fSDK;", TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW, "<init>", "(Lcom/appsflyer/internal/AFc1pSDK;Lcom/appsflyer/internal/AFf1qSDK;Lcom/appsflyer/internal/AFc1fSDK;)V", "", "AFAdRevenueData", "()J", "", "getRevenue", "()Z", "getMediationNetwork", "Lcom/appsflyer/internal/AFc1pSDK;", "getCurrencyIso4217Code", "Lkotlin/Lazy;", "getMonetizationNetwork", "Lcom/appsflyer/internal/AFc1fSDK;", "Lcom/appsflyer/internal/AFf1qSDK;", "AFa1zSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFf1nSDK {
    private static final long component4 = TimeUnit.HOURS.toSeconds(24);

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @NotNull
    private final AFc1fSDK getCurrencyIso4217Code;

    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    @NotNull
    private final Lazy getMonetizationNetwork;

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
    @NotNull
    private final AFc1pSDK AFAdRevenueData;

    /* JADX INFO: renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    @NotNull
    private final Lazy getRevenue;

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
    @NotNull
    private final AFf1qSDK getMediationNetwork;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFf1nSDK$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "AFAdRevenueData", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass2 extends o implements Function0<Boolean> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFf1nSDK.this.AFAdRevenueData.getMonetizationNetwork("com.appsflyer.rc.staging")));
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFf1nSDK$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getCurrencyIso4217Code", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass4 extends o implements Function0<Boolean> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFf1nSDK.this.AFAdRevenueData.getMonetizationNetwork("com.appsflyer.rc.sandbox")));
        }
    }

    public AFf1nSDK(@NotNull AFc1pSDK aFc1pSDK, @NotNull AFf1qSDK aFf1qSDK, @NotNull AFc1fSDK aFc1fSDK) {
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFf1qSDK, "");
        Intrinsics.checkNotNullParameter(aFc1fSDK, "");
        this.AFAdRevenueData = aFc1pSDK;
        this.getMediationNetwork = aFf1qSDK;
        this.getCurrencyIso4217Code = aFc1fSDK;
        this.getMonetizationNetwork = C2131j.b(new AnonymousClass4());
        this.getRevenue = C2131j.b(new AnonymousClass2());
    }

    @JvmName(name = "getCurrencyIso4217Code")
    public final boolean getCurrencyIso4217Code() {
        return ((Boolean) this.getRevenue.getValue()).booleanValue();
    }

    @JvmName(name = "getMediationNetwork")
    public final boolean getMediationNetwork() {
        return ((Boolean) this.getMonetizationNetwork.getValue()).booleanValue();
    }

    public final boolean getRevenue() {
        AFh1dSDK aFh1dSDK;
        if (this.getCurrencyIso4217Code.copy == null) {
            AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.REMOTE_CONTROL, "Cold start - fetching config", false, 4, null);
            return true;
        }
        AFi1zSDK aFi1zSDK = this.getMediationNetwork.getMonetizationNetwork;
        if (aFi1zSDK == null) {
            AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.REMOTE_CONTROL, "active config is missing - fetching from CDN", false, 4, null);
            return true;
        }
        AFh1bSDK aFh1bSDK = aFi1zSDK.getMediationNetwork;
        boolean revenue = (aFh1bSDK == null || (aFh1dSDK = aFh1bSDK.getCurrencyIso4217Code) == null) ? false : aFh1dSDK.getRevenue();
        long jCurrentTimeMillis = System.currentTimeMillis();
        AFf1qSDK aFf1qSDK = this.getMediationNetwork;
        return revenue || jCurrentTimeMillis - aFf1qSDK.getCurrencyIso4217Code > TimeUnit.SECONDS.toMillis(aFf1qSDK.getMediationNetwork);
    }

    public final long AFAdRevenueData() {
        Object objF;
        String monetizationNetwork = this.AFAdRevenueData.getMonetizationNetwork("com.appsflyer.rc.cache.max-age-fallback");
        if (monetizationNetwork == null) {
            return component4;
        }
        try {
            p355xf.o oVar = q.f43977a;
            objF = Long.valueOf(Long.parseLong(monetizationNetwork));
        } catch (Throwable th) {
            p355xf.o oVar2 = q.f43977a;
            objF = androidx.camera.core.impl.utils.executor.g.f(th);
        }
        Throwable thA = q.a(objF);
        if (thA != null) {
            AFLogger.afErrorLog("Can't read maxAgeFallback from Manifest: " + thA.getMessage(), thA);
            objF = Long.valueOf(component4);
        }
        return ((Number) objF).longValue();
    }
}
