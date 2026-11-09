package com.palmpay.lib.webview.cache;

import android.content.Context;
import com.palmpay.lib.webview.cache.util.WebCacheLog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\"\u001a\u00020#2\u000e\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00020!0 J\b\u0010&\u001a\u0004\u0018\u00010!R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020!0 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/palmpay/lib/webview/cache/WebCacheSetting;", "", "<init>", "()V", "appContext", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "setAppContext", "(Landroid/content/Context;)V", "debug", "", "getDebug", "()Z", "setDebug", "(Z)V", "enable", "getEnable", "setEnable", "userAgent", "", "getUserAgent", "()Ljava/lang/String;", "setUserAgent", "(Ljava/lang/String;)V", "webViewCache", "", "getWebViewCache", "()I", "setWebViewCache", "(I)V", "paramsProviderClass", "Ljava/lang/Class;", "Lcom/palmpay/lib/webview/cache/WebCacheParamsProvider;", "setGlobalParamsClass", "", "clazz", "paramsProvider", "getParamsProvider", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WebCacheSetting {

    @Nullable
    private static Context appContext;
    private static boolean debug;
    private static boolean enable;

    @Nullable
    private static WebCacheParamsProvider paramsProvider;

    @Nullable
    private static String userAgent;

    @NotNull
    public static final WebCacheSetting INSTANCE = new WebCacheSetting();
    private static int webViewCache = -1;

    @NotNull
    private static Class<? extends WebCacheParamsProvider> paramsProviderClass = WebCacheParamsProvider.class;

    private WebCacheSetting() {
    }

    @Nullable
    public final Context getAppContext() {
        return appContext;
    }

    public final boolean getDebug() {
        return debug;
    }

    public final boolean getEnable() {
        return enable;
    }

    @Nullable
    public final WebCacheParamsProvider getParamsProvider() {
        if (paramsProvider == null) {
            synchronized (this) {
                try {
                    if (paramsProvider == null) {
                        try {
                            paramsProvider = paramsProviderClass.newInstance();
                        } catch (Throwable th) {
                            WebCacheLog.INSTANCE.e("WebCacheSetting", "Error in creating global params", th);
                        }
                    }
                    Unit unit = Unit.f38893a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return paramsProvider;
    }

    @Nullable
    public final String getUserAgent() {
        return userAgent;
    }

    public final int getWebViewCache() {
        return webViewCache;
    }

    public final void setAppContext(@Nullable Context context) {
        appContext = context;
    }

    public final void setDebug(boolean z3) {
        debug = z3;
    }

    public final void setEnable(boolean z3) {
        enable = z3;
    }

    public final void setGlobalParamsClass(@NotNull Class<? extends WebCacheParamsProvider> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        paramsProvider = null;
        paramsProviderClass = clazz;
    }

    public final void setUserAgent(@Nullable String str) {
        userAgent = str;
    }

    public final void setWebViewCache(int i7) {
        webViewCache = i7;
    }
}
