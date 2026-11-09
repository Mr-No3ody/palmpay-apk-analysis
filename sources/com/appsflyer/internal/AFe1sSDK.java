package com.appsflyer.internal;

import C0.G;
import android.net.TrafficStats;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFe1sSDK<Result> implements Comparable<AFe1sSDK<?>>, Callable<AFe1qSDK> {
    private static final AtomicInteger areAllFieldsValid = new AtomicInteger();

    @NonNull
    public final Set<AFe1nSDK> AFAdRevenueData;
    private final int component1;
    private final String component2;
    private long component3;

    @Nullable
    private Throwable component4;

    @NonNull
    public final Set<AFe1nSDK> getCurrencyIso4217Code;

    @NonNull
    public final AFe1nSDK getMediationNetwork;

    @Nullable
    public AFe1qSDK getMonetizationNetwork;
    public volatile int getRevenue;
    private boolean toString;

    public AFe1sSDK(@NonNull AFe1nSDK aFe1nSDK, @NonNull AFe1nSDK[] aFe1nSDKArr, @Nullable String str) {
        HashSet hashSet = new HashSet();
        this.AFAdRevenueData = hashSet;
        this.getCurrencyIso4217Code = new HashSet();
        int iIncrementAndGet = areAllFieldsValid.incrementAndGet();
        this.component1 = iIncrementAndGet;
        this.toString = false;
        this.getRevenue = 0;
        this.getMediationNetwork = aFe1nSDK;
        Collections.addAll(hashSet, aFe1nSDKArr);
        if (str != null) {
            this.component2 = str;
        } else {
            this.component2 = String.valueOf(iIncrementAndGet);
        }
    }

    @WorkerThread
    public abstract boolean AFAdRevenueData();

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: areAllFieldsValid, reason: merged with bridge method [inline-methods] */
    public final AFe1qSDK call() throws Exception {
        TrafficStats.setThreadStatsTag(82339054);
        this.getMonetizationNetwork = null;
        this.component4 = null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.getRevenue++;
        try {
            AFe1qSDK currencyIso4217Code = getCurrencyIso4217Code();
            this.getMonetizationNetwork = currencyIso4217Code;
            this.component3 = System.currentTimeMillis() - jCurrentTimeMillis;
            getMediationNetwork();
            return currencyIso4217Code;
        } catch (Throwable th) {
            try {
                this.component4 = th;
                this.getMonetizationNetwork = AFe1qSDK.FAILURE;
                getRevenue(th);
                throw th;
            } catch (Throwable th2) {
                this.component3 = System.currentTimeMillis() - jCurrentTimeMillis;
                getMediationNetwork();
                throw th2;
            }
        }
    }

    public final boolean component1() {
        return this.toString;
    }

    @Nullable
    public final Throwable component4() {
        return this.component4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFe1sSDK aFe1sSDK = (AFe1sSDK) obj;
        if (this.getMediationNetwork != aFe1sSDK.getMediationNetwork) {
            return false;
        }
        return this.component2.equals(aFe1sSDK.component2);
    }

    @NonNull
    @WorkerThread
    public abstract AFe1qSDK getCurrencyIso4217Code() throws Exception;

    @WorkerThread
    public void getMediationNetwork() {
    }

    @CallSuper
    @WorkerThread
    public void getMonetizationNetwork() {
        this.toString = true;
    }

    public abstract long getRevenue();

    @WorkerThread
    public void getRevenue(Throwable th) {
    }

    public final int hashCode() {
        return this.component2.hashCode() + (this.getMediationNetwork.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.getMediationNetwork);
        sb2.append("-");
        sb2.append(this.component2);
        String string = sb2.toString();
        if (String.valueOf(this.component1).equals(this.component2)) {
            return string;
        }
        StringBuilder sbT = G.t(string, "-");
        sbT.append(this.component1);
        return sbT.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AFe1sSDK<?> aFe1sSDK) {
        int i7 = this.getMediationNetwork.f20390i - aFe1sSDK.getMediationNetwork.f20390i;
        if (i7 != 0) {
            return i7;
        }
        if (this.component2.equals(aFe1sSDK.component2)) {
            return 0;
        }
        return this.component1 - aFe1sSDK.component1;
    }
}
