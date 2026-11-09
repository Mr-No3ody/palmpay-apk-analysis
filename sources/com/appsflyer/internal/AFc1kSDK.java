package com.appsflyer.internal;

import com.didiglobal.booster.instrument.ShadowExecutors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes.dex */
@JvmName(name = "AFExecutors")
public final class AFc1kSDK {

    @NotNull
    private static final Lazy getRevenue = C2131j.b(AnonymousClass5.AFAdRevenueData);

    /* JADX INFO: renamed from: com.appsflyer.internal.AFc1kSDK$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "AFAdRevenueData", "()Ljava/util/concurrent/ExecutorService;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass5 extends o implements Function0<ExecutorService> {
        public static final AnonymousClass5 AFAdRevenueData = new AnonymousClass5();

        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return ShadowExecutors.newOptimizedSingleThreadExecutor("\u200bcom.appsflyer.internal.AFc1kSDK$5");
        }
    }

    @NotNull
    public static final ScheduledExecutorService AFAdRevenueData() {
        ScheduledExecutorService scheduledExecutorServiceNewOptimizedSingleThreadScheduledExecutor = ShadowExecutors.newOptimizedSingleThreadScheduledExecutor("\u200bcom.appsflyer.internal.AFc1kSDK");
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewOptimizedSingleThreadScheduledExecutor, "");
        return scheduledExecutorServiceNewOptimizedSingleThreadScheduledExecutor;
    }

    @NotNull
    public static final ExecutorService getCurrencyIso4217Code() {
        Object value = getRevenue.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (ExecutorService) value;
    }

    @NotNull
    public static final ExecutorService getMediationNetwork() {
        AFc1oSDK aFc1oSDK = new AFc1oSDK(1, 4, 30L, TimeUnit.SECONDS, new SynchronousQueue(), null, 32, null);
        aFc1oSDK.allowCoreThreadTimeOut(true);
        return aFc1oSDK;
    }

    @NotNull
    public static final ScheduledExecutorService getMonetizationNetwork() {
        ScheduledExecutorService scheduledExecutorServiceNewOptimizedScheduledThreadPool = ShadowExecutors.newOptimizedScheduledThreadPool(1, "\u200bcom.appsflyer.internal.AFc1kSDK");
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewOptimizedScheduledThreadPool, "");
        return scheduledExecutorServiceNewOptimizedScheduledThreadPool;
    }
}
