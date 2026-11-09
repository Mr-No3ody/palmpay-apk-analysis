package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1pSDK {

    @Nullable
    public final String getMediationNetwork;

    @Nullable
    public final Intent getMonetizationNetwork;

    @NotNull
    public final String getRevenue;

    public AFh1pSDK(@NotNull Activity activity, @NotNull AFi1rSDK aFi1rSDK) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(aFi1rSDK, "");
        this.getMonetizationNetwork = activity.getIntent();
        this.getRevenue = aFi1rSDK.getRevenue(activity);
        this.getMediationNetwork = aFi1rSDK.getMediationNetwork(activity);
    }
}
