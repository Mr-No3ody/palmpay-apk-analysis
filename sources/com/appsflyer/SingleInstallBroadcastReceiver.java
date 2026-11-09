package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.adjust.sdk.Constants;
import com.appsflyer.internal.AFa1uSDK;

/* JADX INFO: loaded from: classes.dex */
public class SingleInstallBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra;
        if (intent == null) {
            return;
        }
        try {
            stringExtra = intent.getStringExtra(Constants.REFERRER);
        } catch (Throwable th) {
            AFLogger.afErrorLog("error in BroadcastReceiver ", th);
            stringExtra = null;
        }
        if (stringExtra != null && AFa1uSDK.d_(context).getString(Constants.REFERRER, null) != null) {
            ((AFa1uSDK) AFa1uSDK.getRevenue(new Object[0], 1795555804, -1795555788, (int) System.currentTimeMillis())).getMonetizationNetwork(context, stringExtra);
            return;
        }
        String string = AppsFlyerProperties.getInstance().getString("referrer_timestamp");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (string == null || jCurrentTimeMillis - Long.parseLong(string) >= 2000) {
            AFLogger.afInfoLog("SingleInstallBroadcastReceiver called");
            ((AFa1uSDK) AFa1uSDK.getRevenue(new Object[0], 1795555804, -1795555788, (int) System.currentTimeMillis())).b_(context, intent);
            AppsFlyerProperties.getInstance().set("referrer_timestamp", String.valueOf(System.currentTimeMillis()));
        }
    }
}
