package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.google.firebase.messaging.FirebaseMessagingService;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1ySDK {
    public final AFc1qSDK getRevenue;

    public AFg1ySDK(@NonNull Context context) {
        this.getRevenue = ((AFa1uSDK) AFa1uSDK.getRevenue(new Object[0], 1795555804, -1795555788, (int) System.currentTimeMillis())).getCurrencyIso4217Code(context);
    }

    public static boolean getRevenue(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            String str = FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT;
            return AFj1gSDK.L_(context, new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class));
        } catch (ClassNotFoundException unused) {
            return false;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.UNINSTALL, "An error occurred while trying to verify manifest declarations: ", th);
            return false;
        }
    }

    @Nullable
    public final AFf1aSDK getMonetizationNetwork() {
        String string;
        String string2;
        String currencyIso4217Code = this.getRevenue.getCurrencyIso4217Code("afUninstallToken", (String) null);
        long revenue = this.getRevenue.getRevenue("afUninstallToken_received_time", 0L);
        boolean monetizationNetwork = this.getRevenue.getMonetizationNetwork("afUninstallToken_queued");
        this.getRevenue.AFAdRevenueData("afUninstallToken_queued", false);
        if (currencyIso4217Code == null && (string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] strArrSplit = string2.split(",");
            currencyIso4217Code = strArrSplit[strArrSplit.length - 1];
        }
        if (revenue == 0 && (string = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] strArrSplit2 = string.split(",");
            if (strArrSplit2.length >= 2) {
                try {
                    revenue = Long.parseLong(strArrSplit2[strArrSplit2.length - 2]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (currencyIso4217Code != null) {
            return new AFf1aSDK(currencyIso4217Code, revenue, monetizationNetwork);
        }
        return null;
    }

    public static boolean getRevenue(@NonNull AFc1qSDK aFc1qSDK) {
        return aFc1qSDK.getMonetizationNetwork("sentRegisterRequestToAF");
    }
}
