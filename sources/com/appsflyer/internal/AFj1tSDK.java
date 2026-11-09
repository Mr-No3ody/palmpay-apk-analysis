package com.appsflyer.internal;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFj1tSDK extends Observable {
    public final Map<String, Object> AFAdRevenueData = new HashMap();
    public AFa1uSDK component1 = AFa1uSDK.NOT_STARTED;
    long component2;
    public final String component4;
    final Runnable getCurrencyIso4217Code;
    public final String getMediationNetwork;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1tSDK$3, reason: invalid class name */
    public class AnonymousClass3 implements Observer {
        public AnonymousClass3() {
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            AFj1tSDK.this.getCurrencyIso4217Code.run();
        }
    }

    public enum AFa1uSDK {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public AFj1tSDK(String str, String str2, Runnable runnable) {
        this.getCurrencyIso4217Code = runnable;
        this.getMediationNetwork = str2;
        this.component4 = str;
    }

    public void getCurrencyIso4217Code() {
        this.AFAdRevenueData.put("latency", Long.valueOf(System.currentTimeMillis() - this.component2));
    }

    public abstract void getMediationNetwork(Context context);

    public final void getMonetizationNetwork() {
        this.AFAdRevenueData.put("source", this.getMediationNetwork);
        this.AFAdRevenueData.put("type", this.component4);
        getCurrencyIso4217Code();
        this.component1 = AFa1uSDK.FINISHED;
        setChanged();
        notifyObservers();
    }
}
