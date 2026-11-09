package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1pSDK {
    private static String getMonetizationNetwork = "383";
    public final AFc1qSDK AFAdRevenueData;
    private final Executor areAllFieldsValid;
    private PackageInfo component1;
    public final AFc1eSDK getCurrencyIso4217Code;
    public final AFc1fSDK getRevenue;
    private Bundle component4 = null;
    public String getMediationNetwork = "";

    public AFc1pSDK(AFc1eSDK aFc1eSDK, AFc1qSDK aFc1qSDK, AFc1fSDK aFc1fSDK, Executor executor) {
        this.getCurrencyIso4217Code = aFc1eSDK;
        this.AFAdRevenueData = aFc1qSDK;
        this.getRevenue = aFc1fSDK;
        this.areAllFieldsValid = executor;
    }

    public static String component4() {
        StringBuilder sb2 = new StringBuilder("version: 6.18.1 (build ");
        sb2.append(getMonetizationNetwork);
        sb2.append(")");
        return sb2.toString();
    }

    public static String getCurrencyIso4217Code() {
        return AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
    }

    @NonNull
    public static String getRevenue() {
        return "6.18.1";
    }

    @Nullable
    public final String component2() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.CHANNEL);
        if (string == null) {
            string = getMonetizationNetwork("CHANNEL");
        }
        if (string == null || !string.equals("")) {
            return string;
        }
        return null;
    }

    public final boolean getMediationNetwork(String str) {
        String monetizationNetwork = getMonetizationNetwork(str);
        if (monetizationNetwork != null) {
            return Boolean.parseBoolean(monetizationNetwork);
        }
        return false;
    }

    public final boolean getMonetizationNetwork() {
        return !this.getRevenue.getCurrencyIso4217Code();
    }

    @NonNull
    public final PackageInfo n_() {
        if (this.component1 == null) {
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    this.component1 = this.getCurrencyIso4217Code.getRevenue.getPackageManager().getPackageInfo(this.getCurrencyIso4217Code.getRevenue.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
                } else {
                    this.component1 = this.getCurrencyIso4217Code.getRevenue.getPackageManager().getPackageInfo(this.getCurrencyIso4217Code.getRevenue.getPackageName(), 0);
                }
            } catch (PackageManager.NameNotFoundException e10) {
                AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception while trying fo get PackageInfo", e10, false, false, true, false);
            }
        }
        return this.component1;
    }

    @Nullable
    @SuppressLint({"DiscouragedApi"})
    public final String getCurrencyIso4217Code(String str) {
        try {
            int identifier = this.getCurrencyIso4217Code.getRevenue.getResources().getIdentifier(str, "string", this.getCurrencyIso4217Code.getRevenue.getPackageName());
            if (identifier != 0) {
                return this.getCurrencyIso4217Code.getRevenue.getString(identifier);
            }
            return null;
        } catch (Resources.NotFoundException e10) {
            StringBuilder sb2 = new StringBuilder("Could not load string resource!");
            sb2.append(e10.getMessage());
            AFLogger.afErrorLog(sb2.toString(), e10);
            return null;
        }
    }

    @Nullable
    public final String getMonetizationNetwork(String str) {
        Object obj;
        try {
            if (this.component4 == null) {
                this.component4 = ((PackageItemInfo) this.getCurrencyIso4217Code.getRevenue.getPackageManager().getApplicationInfo(this.getCurrencyIso4217Code.getRevenue.getPackageName(), 128)).metaData;
            }
            Bundle bundle = this.component4;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("Could not load manifest metadata!");
            sb2.append(th.getMessage());
            AFLogger.afErrorLog(sb2.toString(), th);
            return null;
        }
    }

    @Nullable
    public final String getMediationNetwork() {
        AFh1sSDK aFh1sSDK = this.getRevenue.areAllFieldsValid;
        AFb1lSDK aFb1lSDK = aFh1sSDK != null ? new AFb1lSDK(aFh1sSDK.getMonetizationNetwork, aFh1sSDK.component3) : null;
        if (aFb1lSDK != null) {
            return aFb1lSDK.getRevenue;
        }
        return null;
    }

    public final boolean getCurrencyIso4217Code(Context context) {
        try {
            return (this.getCurrencyIso4217Code.getRevenue.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0;
        } catch (PackageManager.NameNotFoundException e10) {
            AFLogger.INSTANCE.e(AFg1cSDK.PUBLIC_API, "Could not check if app is pre installed", e10);
        }
    }

    public final String getMonetizationNetwork(Context context) {
        try {
            return new AFb1jSDK(context, this.areAllFieldsValid).AFAdRevenueData();
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.PUBLIC_API, "Exception while collecting facebook's attribution ID. ", th, true, false, false);
            return null;
        }
    }
}
