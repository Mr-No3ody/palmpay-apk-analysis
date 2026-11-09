package com.appsflyer.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1uSDK implements AFg1wSDK {

    @NotNull
    private Map<String, String> AFAdRevenueData = new LinkedHashMap();

    @Override // com.appsflyer.internal.AFg1wSDK
    @NotNull
    public final Map<String, String> getMediationNetwork(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (this.AFAdRevenueData.isEmpty()) {
            Resources resources = context.getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            int i7 = resources.getConfiguration().screenLayout & 15;
            this.AFAdRevenueData.put("xdp", String.valueOf(displayMetrics.xdpi));
            this.AFAdRevenueData.put("ydp", String.valueOf(displayMetrics.ydpi));
            this.AFAdRevenueData.put("x_px", String.valueOf(displayMetrics.widthPixels));
            this.AFAdRevenueData.put("y_px", String.valueOf(displayMetrics.heightPixels));
            this.AFAdRevenueData.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
            this.AFAdRevenueData.put("size", String.valueOf(i7));
        }
        return this.AFAdRevenueData;
    }
}
