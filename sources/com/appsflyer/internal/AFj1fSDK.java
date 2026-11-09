package com.appsflyer.internal;

import com.adjust.sdk.Constants;
import com.appsflyer.AFLogger;
import com.transsnet.palmpay.core.bean.bill.TransType;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/appsflyer/internal/AFj1fSDK;", "", "<init>", "()V", "", "", "p0", "getMediationNetwork", "(Ljava/util/Map;)Ljava/util/Map;", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/lang/Runnable;", "p1", "", TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW, "Ljava/util/concurrent/TimeUnit;", "p3", "", "getRevenue", "(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFj1fSDK {

    @NotNull
    public static final AFj1fSDK INSTANCE = new AFj1fSDK();

    private AFj1fSDK() {
    }

    @JvmStatic
    @NotNull
    public static final Map<String, Object> getMediationNetwork(@NotNull Map<String, Object> p3) {
        Intrinsics.checkNotNullParameter(p3, "");
        Object obj = p3.get(Constants.REFERRER_API_META);
        Map<String, Object> map = K.f(obj) ? (Map) obj : null;
        if (map != null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        p3.put(Constants.REFERRER_API_META, linkedHashMap);
        return linkedHashMap;
    }

    @JvmStatic
    public static final void getRevenue(@NotNull ScheduledExecutorService p3, @NotNull Runnable p10, long p11, @NotNull TimeUnit p12) {
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p10, "");
        Intrinsics.checkNotNullParameter(p12, "");
        try {
            p3.schedule(p10, p11, p12);
        } catch (RejectedExecutionException e10) {
            AFLogger.afErrorLog("scheduleJob failed with RejectedExecutionException Exception", e10);
        } catch (Throwable th) {
            AFLogger.afErrorLog("scheduleJob failed with Exception", th);
        }
    }
}
