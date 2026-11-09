package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.o;
import p355xf.q;

/* JADX INFO: loaded from: classes.dex */
final class AFb1kSDK implements Application.ActivityLifecycleCallbacks {
    private volatile boolean AFAdRevenueData;

    @NotNull
    private final Runnable component3;

    @Nullable
    private ScheduledFuture<?> component4;

    @NotNull
    private final ScheduledExecutorService getCurrencyIso4217Code;

    @NotNull
    private final AFi1rSDK getMediationNetwork;

    @NotNull
    private final AFa1mSDK getMonetizationNetwork;

    @NotNull
    final AFb1aSDK.AFa1uSDK getRevenue;

    public AFb1kSDK(@NotNull ScheduledExecutorService scheduledExecutorService, @NotNull AFa1mSDK aFa1mSDK, @NotNull AFi1rSDK aFi1rSDK, @NotNull AFb1aSDK.AFa1uSDK aFa1uSDK) {
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFa1mSDK, "");
        Intrinsics.checkNotNullParameter(aFi1rSDK, "");
        Intrinsics.checkNotNullParameter(aFa1uSDK, "");
        this.getCurrencyIso4217Code = scheduledExecutorService;
        this.getMonetizationNetwork = aFa1mSDK;
        this.getMediationNetwork = aFi1rSDK;
        this.getRevenue = aFa1uSDK;
        this.component3 = new g(this, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFb1kSDK aFb1kSDK, AFh1pSDK aFh1pSDK) {
        Object objF;
        Intrinsics.checkNotNullParameter(aFb1kSDK, "");
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        try {
            o oVar = q.f43977a;
            aFb1kSDK.getRevenue.getMediationNetwork(aFh1pSDK);
            objF = Unit.f38893a;
        } catch (Throwable th) {
            o oVar2 = q.f43977a;
            objF = androidx.camera.core.impl.utils.executor.g.f(th);
        }
        Throwable thA = q.a(objF);
        if (thA != null) {
            AFLogger.afErrorLog("Listener thrown an exception: ", thA, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFb1kSDK aFb1kSDK) {
        Object objF;
        Intrinsics.checkNotNullParameter(aFb1kSDK, "");
        aFb1kSDK.AFAdRevenueData = false;
        try {
            o oVar = q.f43977a;
            aFb1kSDK.getRevenue.getMonetizationNetwork();
            objF = Unit.f38893a;
        } catch (Throwable th) {
            o oVar2 = q.f43977a;
            objF = androidx.camera.core.impl.utils.executor.g.f(th);
        }
        Throwable thA = q.a(objF);
        if (thA != null) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", thA);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        AFa1mSDK aFa1mSDK = this.getMonetizationNetwork;
        Intent intent = activity.getIntent();
        if (((intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData()) != null && intent != aFa1mSDK.AFAdRevenueData) {
            aFa1mSDK.AFAdRevenueData = intent;
        }
        this.getMediationNetwork.AFAdRevenueData(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (this.AFAdRevenueData) {
            ScheduledExecutorService scheduledExecutorService = this.getCurrencyIso4217Code;
            Runnable runnable = this.component3;
            AFb1aSDK.Companion aFa1vSDK = AFb1aSDK.INSTANCE;
            this.component4 = scheduledExecutorService.schedule(runnable, AFb1aSDK.Companion.getMonetizationNetwork(), TimeUnit.MILLISECONDS);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (!this.AFAdRevenueData) {
            this.AFAdRevenueData = true;
            this.getCurrencyIso4217Code.execute(new f(0, this, new AFh1pSDK(activity, this.getMediationNetwork)));
        } else {
            ScheduledFuture<?> scheduledFuture = this.component4;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }
}
