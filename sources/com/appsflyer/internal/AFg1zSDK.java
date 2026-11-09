package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.RequiresApi;
import com.appsflyer.AFLogger;
import com.transsnet.palmpay.core.config.BillBusinessType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1zSDK {

    @Nullable
    private final PackageManager AFAdRevenueData;

    @NotNull
    private final String getMediationNetwork;

    @NotNull
    private final Map<String, Object> getMonetizationNetwork;

    public AFg1zSDK(@NotNull AFc1eSDK aFc1eSDK, @NotNull AFc1pSDK aFc1pSDK) {
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        this.getMonetizationNetwork = new LinkedHashMap();
        Context context = aFc1eSDK.getRevenue;
        this.AFAdRevenueData = context != null ? context.getPackageManager() : null;
        String packageName = aFc1pSDK.getCurrencyIso4217Code.getRevenue.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        this.getMediationNetwork = packageName;
    }

    @RequiresApi(BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS)
    private final Map<String, Object> getMediationNetwork() {
        InstallSourceInfo installSourceInfo;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            String str = this.getMediationNetwork;
            PackageManager packageManager = this.AFAdRevenueData;
            if (packageManager != null && (installSourceInfo = packageManager.getInstallSourceInfo(str)) != null) {
                Intrinsics.checkNotNullExpressionValue(installSourceInfo, "");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                String initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                if (initiatingPackageName != null) {
                    linkedHashMap2.put("initiating_package", initiatingPackageName);
                }
                String installingPackageName = installSourceInfo.getInstallingPackageName();
                if (installingPackageName != null) {
                    linkedHashMap2.put("installing_package", installingPackageName);
                }
                String originatingPackageName = installSourceInfo.getOriginatingPackageName();
                if (originatingPackageName != null) {
                    linkedHashMap2.put("originating_package", originatingPackageName);
                }
                return linkedHashMap2;
            }
        } catch (Throwable th) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.DEVICE_DATA, "Failed to get the app install source info", th, true, false, true, true, 16, null);
        }
        return linkedHashMap;
    }

    @NotNull
    public final Map<String, Object> getRevenue() {
        String installerPackageName;
        if (this.getMonetizationNetwork.isEmpty()) {
            try {
                PackageManager packageManager = this.AFAdRevenueData;
                if (packageManager != null && (installerPackageName = packageManager.getInstallerPackageName(this.getMediationNetwork)) != null) {
                    this.getMonetizationNetwork.put("installer_package", installerPackageName);
                }
            } catch (Exception e10) {
                AFLogger.afErrorLog("Exception while getting the app's installer package. ", e10);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                this.getMonetizationNetwork.put("install_source_info", getMediationNetwork());
            }
        }
        return this.getMonetizationNetwork;
    }
}
