package com.palmpay.lib.webview.container.fast.okhttp;

import C0.G;
import com.palmpay.lib.webview.cache.WebCache;
import com.palmpay.lib.webview.container.fast.cookie.FastCookieManager;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C1929i;
import okhttp3.CookieJar;
import okhttp3.S;
import okhttp3.U;

/* JADX INFO: loaded from: classes3.dex */
public class OkHttpClientProvider {
    private static final String CACHE_OKHTTP_DIR_NAME = "cached_webview_okhttp";
    private static final int OKHTTP_CACHE_SIZE = 209715200;
    private static volatile OkHttpClientProvider sInstance;
    private U mClient;

    private OkHttpClientProvider() {
        createOkHttpClient();
    }

    private void createOkHttpClient() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(WebCache.INSTANCE.getContext().getCacheDir());
        String strR = G.r(sb2, File.separator, CACHE_OKHTTP_DIR_NAME);
        S s3 = new S();
        CookieJar cookieJar = FastCookieManager.getInstance().getCookieJar();
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        s3.f40624j = cookieJar;
        s3.f40625k = new C1929i(new File(strR), 209715200L);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        s3.e(20L, timeUnit);
        s3.f(20L, timeUnit);
        s3.b(20L, timeUnit);
        s3.f40623i = true;
        s3.f40622h = true;
        this.mClient = new U(s3);
    }

    public static U get() {
        return getInstance().mClient;
    }

    private static OkHttpClientProvider getInstance() {
        if (sInstance == null) {
            synchronized (OkHttpClientProvider.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new OkHttpClientProvider();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }
}
