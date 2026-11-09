package com.transsnet.analysis.data.network;

import Og.a;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.transsnet.analysis.AnalysisManager;
import com.transsnet.analysis.BuildConfig;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.S;
import okhttp3.U;
import p307u8.b;
import retrofit2.M;
import retrofit2.N;

/* JADX INFO: loaded from: classes3.dex */
public class AnalysisRetrofitClient {
    private static final String TAG = "AnalysisRetrofitClient";
    private final N mRetrofit;

    public /* synthetic */ AnalysisRetrofitClient(int i7) {
        this();
    }

    public static AnalysisRetrofitClient getInstance() {
        return b.f42714a;
    }

    private U getOkHttpClient() {
        U injectedOkHttpClient = AnalysisManager.getInjectedOkHttpClient();
        S sA = injectedOkHttpClient != null ? injectedOkHttpClient.a() : new S();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        sA.b(15L, timeUnit);
        sA.e(15L, timeUnit);
        sA.f(15L, timeUnit);
        if (AnalysisManager.isDebug()) {
            Og.b log = setLog();
            a level = a.f6847d;
            log.getClass();
            Intrinsics.checkNotNullParameter(level, "level");
            log.f6851c = level;
            sA.a(log);
        }
        return new U(sA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setLog$0(String str) {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(Thread.currentThread().getId());
        sb2.append(") ");
    }

    private Og.b setLog() {
        return new Og.b(new p184m8.b(14));
    }

    public <T> T create(@NonNull Class<T> cls) {
        return (T) this.mRetrofit.b(cls);
    }

    private AnalysisRetrofitClient() {
        M m7 = new M();
        U okHttpClient = getOkHttpClient();
        Objects.requireNonNull(okHttpClient, "client == null");
        m7.f41879a = okHttpClient;
        m7.b(TextUtils.isEmpty(AnalysisManager.getBaseUrl()) ? BuildConfig.analyReleaseUrl : AnalysisManager.getBaseUrl());
        m7.a(new retrofit2.converter.gson.a(new Gson(), 0));
        this.mRetrofit = m7.c();
    }
}
