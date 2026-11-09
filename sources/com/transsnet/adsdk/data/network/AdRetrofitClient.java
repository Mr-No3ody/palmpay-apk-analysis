package com.transsnet.adsdk.data.network;

import Dg.c;
import Og.b;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.transsnet.adsdk.AdManager;
import com.transsnet.adsdk.BuildConfig;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.AbstractC1956y;
import okhttp3.C1948p;
import okhttp3.Dns;
import okhttp3.S;
import okhttp3.U;
import retrofit2.C1988f;
import retrofit2.M;
import retrofit2.N;
import retrofit2.converter.gson.a;

/* JADX INFO: loaded from: classes3.dex */
public class AdRetrofitClient {
    private static final String TAG = "adsdk";
    private static volatile AdRetrofitClient sInstance;
    private final U mOkHttpClient;
    private final N mRetrofit;

    private AdRetrofitClient() {
        U okHttpClient = AdManager.get().getOkHttpClient();
        U uInitOkHttpClient = initOkHttpClient(okHttpClient);
        this.mOkHttpClient = uInitOkHttpClient;
        if (okHttpClient == null) {
            uInitOkHttpClient.f40653a.g(5);
            uInitOkHttpClient.f40653a.f(10);
        }
        String baseUrl = AdManager.getBaseUrl();
        M m7 = new M();
        Objects.requireNonNull(uInitOkHttpClient, "client == null");
        m7.f41879a = uInitOkHttpClient;
        m7.b(TextUtils.isEmpty(baseUrl) ? BuildConfig.adReleaseUrl : baseUrl);
        m7.f41882d.add(new C1988f(1));
        m7.a(new a(new Gson(), 0));
        this.mRetrofit = m7.c();
    }

    public static AdRetrofitClient get() {
        if (sInstance == null) {
            synchronized (AdRetrofitClient.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new AdRetrofitClient();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    private U initOkHttpClient(U injected) {
        S sA = injected != null ? injected.a() : new S();
        sA.a(new HeaderInterceptor());
        if (AdManager.isDebug()) {
            b log = setLog();
            Og.a level = Og.a.f6847d;
            log.getClass();
            Intrinsics.checkNotNullParameter(level, "level");
            log.f6851c = level;
            sA.a(log);
        }
        if (injected == null) {
            TimeUnit timeUnit = TimeUnit.MINUTES;
            C1948p connectionPool = new C1948p(2, 2L);
            Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
            sA.f40616b = connectionPool;
        }
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        sA.b(15L, timeUnit2);
        sA.e(15L, timeUnit2);
        sA.f(15L, timeUnit2);
        AbstractC1956y eventListener = AdManager.get().getConfig().getListener();
        if (eventListener != null) {
            Intrinsics.checkNotNullParameter(eventListener, "eventListener");
            byte[] bArr = c.f1879a;
            Intrinsics.checkNotNullParameter(eventListener, "<this>");
            sA.f40619e = new Dg.a(eventListener, 0);
        }
        Dns httpDns = AdManager.get().getHttpDns();
        if (httpDns != null) {
            sA.c(httpDns);
        }
        return new U(sA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setLog$0(String str) {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(Thread.currentThread().getId());
        sb2.append(") ");
    }

    private b setLog() {
        return new b(new p184m8.b(0));
    }

    public <T> T create(@NonNull Class<T> cls) {
        return (T) this.mRetrofit.b(cls);
    }

    public U getOkHttpClient() {
        return this.mOkHttpClient;
    }
}
