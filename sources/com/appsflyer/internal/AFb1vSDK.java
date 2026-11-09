package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFb1vSDK<T> {
    public final Executor AFAdRevenueData;
    private final String[] getCurrencyIso4217Code;
    public final FutureTask<T> getMediationNetwork = new FutureTask<>(new Callable<T>() { // from class: com.appsflyer.internal.AFb1vSDK.3
        @Override // java.util.concurrent.Callable
        public final T call() {
            if (AFb1vSDK.this.getRevenue()) {
                return (T) AFb1vSDK.this.getMediationNetwork();
            }
            return null;
        }
    });
    public final Context getMonetizationNetwork;
    public final String getRevenue;

    public AFb1vSDK(Context context, Executor executor, String str, String... strArr) {
        this.getMonetizationNetwork = context;
        this.getRevenue = str;
        this.getCurrencyIso4217Code = strArr;
        this.AFAdRevenueData = executor;
    }

    @Nullable
    public T getCurrencyIso4217Code() {
        try {
            return this.getMediationNetwork.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            AFLogger.afErrorLog(e.getMessage(), e, false, true);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            AFLogger.afErrorLog(e.getMessage(), e, false, true);
            return null;
        } catch (TimeoutException e12) {
            AFLogger.afErrorLog(e12.getMessage(), e12, false, false);
            return null;
        }
    }

    public abstract T getMediationNetwork();

    public final boolean getRevenue() {
        try {
            ProviderInfo providerInfoResolveContentProvider = this.getMonetizationNetwork.getPackageManager().resolveContentProvider(this.getRevenue, 128);
            return providerInfoResolveContentProvider != null && Arrays.asList(this.getCurrencyIso4217Code).contains(AFj1gSDK.N_(this.getMonetizationNetwork.getPackageManager(), ((PackageItemInfo) providerInfoResolveContentProvider).packageName));
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e10) {
            AFLogger.afErrorLog(e10.getMessage(), e10, false, true);
            return false;
        }
    }
}
