package com.palmpay.lib.webview.container.fast.loader;

import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.palmpay.lib.webview.cache.WebCache;
import com.palmpay.lib.webview.container.fast.WebResource;
import com.palmpay.lib.webview.container.fast.WebViewCache;
import com.palmpay.lib.webview.container.fast.okhttp.OkHttpClientProvider;
import com.palmpay.lib.webview.container.fast.utils.HeaderUtils;
import com.palmpay.lib.webview.container.fast.utils.LogUtils;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C1943k;
import okhttp3.U;
import okhttp3.X;
import okhttp3.Y;
import okhttp3.e0;
import okhttp3.h0;

/* JADX INFO: loaded from: classes3.dex */
public class OkHttpResourceLoader implements ResourceLoader {
    private static final String DEFAULT_USER_AGENT = "PPWebViewVERSION_NAME";
    private static final String HEADER_USER_AGENT = "User-Agent";

    private C1943k createNoStoreCacheControl() {
        return new C1943k(false, true, -1, -1, false, false, false, -1, -1, false, false, false, null);
    }

    private C1943k getCacheControl(int i7, boolean z3) {
        if (i7 != 1) {
            if (i7 == 2) {
                return C1943k.f40924o;
            }
            if (i7 != 3) {
                return z3 ? new C1943k(false, false, -1, -1, false, false, false, -1, -1, false, false, false, null) : createNoStoreCacheControl();
            }
            return C1943k.f40925p;
        }
        if (!z3) {
            return createNoStoreCacheControl();
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long seconds = timeUnit.toSeconds(Integer.MAX_VALUE);
        return new C1943k(false, false, -1, -1, false, false, false, seconds <= 2147483647L ? (int) seconds : Integer.MAX_VALUE, -1, false, false, false, null);
    }

    private boolean isInterceptorThisRequest(e0 e0Var) {
        int i7 = e0Var.f40731d;
        if (i7 < 100 || i7 > 599) {
            return false;
        }
        return i7 <= 299 || i7 >= 400;
    }

    private boolean isNeedStripHeader(String str) {
        return str.equalsIgnoreCase(HttpHeaders.IF_MATCH) || str.equalsIgnoreCase(HttpHeaders.IF_NONE_MATCH) || str.equalsIgnoreCase(HttpHeaders.IF_MODIFIED_SINCE) || str.equalsIgnoreCase(HttpHeaders.IF_UNMODIFIED_SINCE) || str.equalsIgnoreCase(HttpHeaders.LAST_MODIFIED) || str.equalsIgnoreCase(HttpHeaders.EXPIRES) || str.equalsIgnoreCase(HttpHeaders.CACHE_CONTROL);
    }

    private String parseResponseCacheSource(e0 e0Var) {
        boolean z3 = e0Var.f40736j != null;
        boolean z8 = e0Var.f40735i != null;
        if (z3 && z8) {
            return WebViewCache.SOURCE_OKHTTP_REVALIDATION;
        }
        if (z3) {
            return WebViewCache.SOURCE_OKHTTP_CACHE;
        }
        return z8 ? WebViewCache.SOURCE_OKHTTP_NETWORK : WebViewCache.SOURCE_UNKNOW;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0142  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [okhttp3.e0] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // com.palmpay.lib.webview.container.fast.loader.ResourceLoader
    public WebResource getResource(SourceRequest sourceRequest) throws Throwable {
        ?? r3;
        Throwable th;
        e0 e0VarExecute;
        String url = sourceRequest.getUrl();
        LogUtils.d("load url: " + url);
        boolean zIsCacheable = sourceRequest.isCacheable();
        U u6 = OkHttpClientProvider.get();
        C1943k cacheControl = getCacheControl(sourceRequest.getWebViewCache(), zIsCacheable);
        String userAgent = sourceRequest.getUserAgent();
        if (TextUtils.isEmpty(userAgent)) {
            userAgent = DEFAULT_USER_AGENT;
        }
        String languageTag = Locale.getDefault().toLanguageTag();
        if (!languageTag.equalsIgnoreCase("en-US")) {
            languageTag = languageTag.concat(",en-US;q=0.9");
        }
        X x3 = new X();
        x3.i("User-Agent");
        x3.a("User-Agent", userAgent);
        x3.a(HttpHeaders.UPGRADE_INSECURE_REQUESTS, "1");
        x3.a(HttpHeaders.X_REQUESTED_WITH, WebCache.INSTANCE.getContext().getPackageName());
        x3.a(HttpHeaders.ACCEPT, "*/*");
        x3.a(HttpHeaders.ACCEPT_LANGUAGE, languageTag);
        Map<String, String> headers = sourceRequest.getHeaders();
        if (headers != null && !headers.isEmpty()) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                String key = entry.getKey();
                if (!isNeedStripHeader(key)) {
                    x3.i(key);
                    x3.a(key, entry.getValue());
                }
            }
        }
        try {
            try {
                x3.k(url);
                x3.c(cacheControl);
                x3.d();
                Y yB = x3.b();
                WebResource webResource = new WebResource();
                e0VarExecute = FirebasePerfOkHttpClient.execute(u6.newCall(yB));
                try {
                    if (isInterceptorThisRequest(e0VarExecute)) {
                        webResource.setResponseCode(e0VarExecute.f40731d);
                        webResource.setReasonPhrase(e0VarExecute.f40730c);
                        webResource.setModified(e0VarExecute.f40731d != 304);
                        h0 h0Var = e0VarExecute.f40734g;
                        if (h0Var != null) {
                            webResource.setOriginBytes(h0Var.bytes());
                        }
                        String responseCacheSource = parseResponseCacheSource(e0VarExecute);
                        webResource.setResponseHeaders(HeaderUtils.generateHeadersMap(e0VarExecute.f40733f, responseCacheSource));
                        webResource.setCacheByOurselves(!zIsCacheable);
                        if (e0VarExecute.f40736j != null) {
                            LogUtils.d(url + " read from http cache " + responseCacheSource);
                            webResource.setCacheMode(3);
                        }
                        e0VarExecute.close();
                        return webResource;
                    }
                    if (e0VarExecute != null) {
                        e0VarExecute.close();
                        return null;
                    }
                } catch (Exception e10) {
                    e = e10;
                    e.printStackTrace();
                    if (e0VarExecute != null) {
                        e0VarExecute.close();
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r3 = u6;
                if (r3 != 0) {
                    r3.close();
                }
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            e0VarExecute = null;
        } catch (Throwable th3) {
            r3 = 0;
            th = th3;
            if (r3 != 0) {
                r3.close();
            }
            throw th;
        }
        return null;
    }
}
