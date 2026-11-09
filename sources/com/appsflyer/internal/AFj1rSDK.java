package com.appsflyer.internal;

import Pa.RunnableC0527y;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1rSDK {
    public final CopyOnWriteArrayList<AFj1tSDK> AFAdRevenueData = new CopyOnWriteArrayList<>();
    public final AFd1zSDK getCurrencyIso4217Code;

    public AFj1rSDK(AFd1zSDK aFd1zSDK) {
        this.getCurrencyIso4217Code = aFd1zSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFAdRevenueData(Context context, Runnable runnable, AFd1zSDK aFd1zSDK) {
        List<ResolveInfo> listQueryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
        if (listQueryIntentContentProviders == null || listQueryIntentContentProviders.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ResolveInfo> it = listQueryIntentContentProviders.iterator();
        while (it.hasNext()) {
            ProviderInfo providerInfo = it.next().providerInfo;
            if (providerInfo != null) {
                arrayList.add(new AFj1vSDK(providerInfo, runnable, aFd1zSDK));
            } else {
                AFLogger.INSTANCE.w(AFg1cSDK.PREINSTALL, "com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.AFAdRevenueData.addAll(arrayList);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.PREINSTALL;
        StringBuilder sb2 = new StringBuilder("Detected ");
        sb2.append(arrayList.size());
        sb2.append(" valid preinstall provider(s)");
        aFLogger.d(aFg1cSDK, sb2.toString());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AFj1tSDK) it2.next()).getMediationNetwork(aFd1zSDK.AFInAppEventParameterName().getRevenue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component1(Runnable runnable) {
        AFj1ySDK aFj1ySDK = new AFj1ySDK(this.getCurrencyIso4217Code.getMonetizationNetwork(), this.getCurrencyIso4217Code.AFAdRevenueData(), AFj1zSDK.INSTAGRAM, runnable, new m(this, runnable, 0));
        this.AFAdRevenueData.add(aFj1ySDK);
        aFj1ySDK.getMediationNetwork(this.getCurrencyIso4217Code.AFInAppEventParameterName().getRevenue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getCurrencyIso4217Code() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getRevenue(Runnable runnable) {
        AFj1ySDK aFj1ySDK = new AFj1ySDK(this.getCurrencyIso4217Code.getMonetizationNetwork(), this.getCurrencyIso4217Code.AFAdRevenueData(), AFj1zSDK.FACEBOOK_LITE, runnable, new RunnableC0527y(2));
        this.AFAdRevenueData.add(aFj1ySDK);
        aFj1ySDK.getMediationNetwork(this.getCurrencyIso4217Code.AFInAppEventParameterName().getRevenue);
    }

    @VisibleForTesting
    public final void getMediationNetwork(Context context, Runnable runnable, AFd1zSDK aFd1zSDK) {
        if (aFd1zSDK.getMonetizationNetwork().AFAdRevenueData.getMonetizationNetwork("appsFlyerCount", 0) > 0) {
            AFLogger.INSTANCE.d(AFg1cSDK.PREINSTALL, "Preinstall referrer will not load, the counter >= 1, ");
        } else {
            aFd1zSDK.AFAdRevenueData().execute(new Da.g(this, context, runnable, aFd1zSDK, 12));
        }
    }

    @VisibleForTesting
    public final void getMonetizationNetwork(Runnable runnable) {
        this.AFAdRevenueData.add(new AFj1ySDK(this.getCurrencyIso4217Code.getMonetizationNetwork(), this.getCurrencyIso4217Code.AFAdRevenueData(), AFj1zSDK.FACEBOOK, runnable, new m(this, runnable, 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getCurrencyIso4217Code(Runnable runnable) {
        try {
            if (AFAdRevenueData(new AFh1rSDK())) {
                runnable.run();
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }

    public final AFi1aSDK getMediationNetwork(Runnable runnable) {
        return new AFi1aSDK(new m(this, runnable, 1), this.getCurrencyIso4217Code.AFAdRevenueData(), this.getCurrencyIso4217Code.getMonetizationNetwork());
    }

    @VisibleForTesting
    public final boolean getMonetizationNetwork() {
        return this.getCurrencyIso4217Code.getMonetizationNetwork().getMediationNetwork("AF_PREINSTALL_DISABLED");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getCurrencyIso4217Code(AFi1aSDK aFi1aSDK, Runnable runnable) {
        AFc1qSDK revenue = this.getCurrencyIso4217Code.getRevenue();
        int monetizationNetwork = this.getCurrencyIso4217Code.getMonetizationNetwork().AFAdRevenueData.getMonetizationNetwork("appsFlyerCount", 0);
        boolean monetizationNetwork2 = revenue.getMonetizationNetwork(AppsFlyerProperties.NEW_REFERRER_SENT);
        boolean z3 = aFi1aSDK.component1 == AFj1tSDK.AFa1uSDK.NOT_STARTED;
        if (monetizationNetwork == 1) {
            if (z3 || monetizationNetwork2) {
                runnable.run();
            }
        }
    }

    public final Runnable getMediationNetwork(AFi1aSDK aFi1aSDK, Runnable runnable) {
        return new androidx.emoji2.text.j(this, 7, aFi1aSDK, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFAdRevenueData(Runnable runnable) {
        this.getCurrencyIso4217Code.AFAdRevenueData().execute(new m(this, runnable, 2));
    }

    public final boolean AFAdRevenueData(AFh1qSDK aFh1qSDK) {
        int monetizationNetwork = this.getCurrencyIso4217Code.getMonetizationNetwork().AFAdRevenueData.getMonetizationNetwork("appsFlyerCount", 0);
        return (!this.getCurrencyIso4217Code.getRevenue().getMonetizationNetwork(AppsFlyerProperties.NEW_REFERRER_SENT) && monetizationNetwork == 1) || (monetizationNetwork == 1 && !(aFh1qSDK instanceof AFh1rSDK));
    }

    public final boolean AFAdRevenueData() {
        Iterator<AFj1tSDK> it = this.AFAdRevenueData.iterator();
        while (it.hasNext()) {
            if (it.next().component1 == AFj1tSDK.AFa1uSDK.STARTED) {
                return false;
            }
        }
        return true;
    }
}
