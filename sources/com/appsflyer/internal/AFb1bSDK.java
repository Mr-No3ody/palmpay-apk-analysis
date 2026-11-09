package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1bSDK implements AFb1aSDK {

    @NotNull
    private final ScheduledExecutorService getCurrencyIso4217Code;

    @NotNull
    private final AFi1rSDK getMediationNetwork;

    @Nullable
    private AFb1kSDK getMonetizationNetwork;

    @NotNull
    private final AFa1mSDK getRevenue;

    public AFb1bSDK(@NotNull ScheduledExecutorService scheduledExecutorService, @NotNull AFa1mSDK aFa1mSDK, @NotNull AFi1rSDK aFi1rSDK) {
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFa1mSDK, "");
        Intrinsics.checkNotNullParameter(aFi1rSDK, "");
        this.getCurrencyIso4217Code = scheduledExecutorService;
        this.getRevenue = aFa1mSDK;
        this.getMediationNetwork = aFi1rSDK;
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final void AFAdRevenueData(@NotNull Context context, @NotNull AFb1aSDK.AFa1uSDK aFa1uSDK) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFa1uSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (this.getMonetizationNetwork != null) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.f(applicationContext, "");
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.getMonetizationNetwork);
        }
        this.getMonetizationNetwork = null;
        AFb1kSDK aFb1kSDK = new AFb1kSDK(this.getCurrencyIso4217Code, this.getRevenue, this.getMediationNetwork, aFa1uSDK);
        this.getMonetizationNetwork = aFb1kSDK;
        if (context instanceof Activity) {
            aFb1kSDK.onActivityResumed((Activity) context);
        }
        Application applicationO_ = AFj1gSDK.O_(context);
        if (applicationO_ != null) {
            applicationO_.registerActivityLifecycleCallbacks(this.getMonetizationNetwork);
        }
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final boolean getCurrencyIso4217Code() {
        return this.getMonetizationNetwork != null;
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final void AFAdRevenueData() {
        AFb1aSDK.AFa1uSDK aFa1uSDK;
        AFb1kSDK aFb1kSDK = this.getMonetizationNetwork;
        if (aFb1kSDK == null || (aFa1uSDK = aFb1kSDK.getRevenue) == null) {
            return;
        }
        aFa1uSDK.getMonetizationNetwork();
    }
}
