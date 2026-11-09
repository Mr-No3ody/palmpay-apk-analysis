package com.palmpay.lib.webview.cache.util;

import C0.G;
import android.util.Log;
import androidx.annotation.Keep;
import com.palmpay.lib.webview.cache.WebCacheLogger;
import com.palmpay.lib.webview.cache.WebCacheParamsProvider;
import com.palmpay.lib.webview.cache.WebCacheSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0010\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0016J\u001c\u0010\u0016\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0016J\u001c\u0010\u0016\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0016\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u0017\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0016J\u001c\u0010\u0017\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0016J\u001c\u0010\u0017\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0017\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/palmpay/lib/webview/cache/util/WebCacheLog;", "Lcom/palmpay/lib/webview/cache/WebCacheLogger;", "<init>", "()V", "LOG_HYBRID", "", "myLogger", "getMyLogger", "()Lcom/palmpay/lib/webview/cache/WebCacheLogger;", "setMyLogger", "(Lcom/palmpay/lib/webview/cache/WebCacheLogger;)V", "value", "", "canLog", "getCanLog", "()Z", "d", "", "msg", "tag", "t", "", "w", "e", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWebCacheLog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebCacheLog.kt\ncom/palmpay/lib/webview/cache/util/WebCacheLog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n1#2:109\n*E\n"})
public final class WebCacheLog implements WebCacheLogger {

    @NotNull
    public static final WebCacheLog INSTANCE = new WebCacheLog();

    @NotNull
    private static final String LOG_HYBRID = "WebCache";
    private static boolean canLog;

    @Nullable
    private static WebCacheLogger myLogger;

    private WebCacheLog() {
    }

    @Override // com.palmpay.lib.webview.cache.WebCacheLogger
    public void d(@Nullable String msg) {
        WebCacheLogger webCacheLogger;
        if (msg == null || (webCacheLogger = myLogger) == null) {
            return;
        }
        webCacheLogger.d(msg);
    }

    @Override // com.palmpay.lib.webview.cache.WebCacheLogger
    public void e(@Nullable String msg) {
        if (msg != null) {
            WebCacheLogger webCacheLogger = myLogger;
            if (webCacheLogger != null) {
                webCacheLogger.e(msg);
            } else {
                Log.e(LOG_HYBRID, msg);
            }
        }
    }

    public final boolean getCanLog() {
        WebCacheParamsProvider paramsProvider;
        WebCacheSetting webCacheSetting = WebCacheSetting.INSTANCE;
        return webCacheSetting.getDebug() || ((paramsProvider = webCacheSetting.getParamsProvider()) != null && paramsProvider.showLog());
    }

    @Nullable
    public final WebCacheLogger getMyLogger() {
        return myLogger;
    }

    public final void setMyLogger(@Nullable WebCacheLogger webCacheLogger) {
        myLogger = webCacheLogger;
    }

    @Override // com.palmpay.lib.webview.cache.WebCacheLogger
    public void w(@Nullable String msg) {
        WebCacheLogger webCacheLogger;
        if (msg == null || (webCacheLogger = myLogger) == null) {
            return;
        }
        webCacheLogger.w(msg);
    }

    @Override // com.palmpay.lib.webview.cache.WebCacheLogger
    public void d(@Nullable String tag, @Nullable String msg) {
        WebCacheLogger webCacheLogger;
        if (msg == null || (webCacheLogger = myLogger) == null) {
            return;
        }
        webCacheLogger.d(tag, msg);
    }

    @Override // com.palmpay.lib.webview.cache.WebCacheLogger
    public void e(@Nullable String tag, @Nullable String msg) {
        if (msg != null) {
            WebCacheLogger webCacheLogger = myLogger;
            if (webCacheLogger != null) {
                webCacheLogger.e(tag, msg);
                return;
            }
            Log.e("WebCache-" + tag, msg);
        }
    }

    @Override // com.palmpay.lib.webview.cache.WebCacheLogger
    public void w(@Nullable String tag, @Nullable String msg) {
        WebCacheLogger webCacheLogger;
        if (msg == null || (webCacheLogger = myLogger) == null) {
            return;
        }
        webCacheLogger.w(tag, msg);
    }

    @Override // com.palmpay.lib.webview.cache.WebCacheLogger
    public void d(@Nullable String tag, @Nullable Throwable t) {
        if (t != null) {
            WebCacheLogger webCacheLogger = myLogger;
            if (webCacheLogger != null) {
                webCacheLogger.d(tag, t);
            } else {
                t.getMessage();
            }
        }
    }

    @Override // com.palmpay.lib.webview.cache.WebCacheLogger
    public void e(@Nullable String tag, @Nullable Throwable t) {
        if (t != null) {
            WebCacheLogger webCacheLogger = myLogger;
            if (webCacheLogger != null) {
                webCacheLogger.e(tag, t);
            } else {
                Log.e(G.o("WebCache-", tag), t.getMessage(), t);
            }
        }
    }

    @Override // com.palmpay.lib.webview.cache.WebCacheLogger
    public void w(@Nullable String tag, @Nullable Throwable t) {
        WebCacheLogger webCacheLogger = myLogger;
        if (webCacheLogger != null) {
            webCacheLogger.w(tag, t);
        }
    }

    @Override // com.palmpay.lib.webview.cache.WebCacheLogger
    public void d(@Nullable String tag, @Nullable String msg, @Nullable Throwable t) {
        WebCacheLogger webCacheLogger = myLogger;
        if (webCacheLogger != null) {
            webCacheLogger.d(tag, msg, t);
        }
    }

    @Override // com.palmpay.lib.webview.cache.WebCacheLogger
    public void w(@Nullable String tag, @Nullable String msg, @Nullable Throwable t) {
        WebCacheLogger webCacheLogger = myLogger;
        if (webCacheLogger != null) {
            webCacheLogger.w(tag, msg, t);
        }
    }

    @Override // com.palmpay.lib.webview.cache.WebCacheLogger
    public void e(@Nullable String tag, @Nullable String msg, @Nullable Throwable t) {
        WebCacheLogger webCacheLogger = myLogger;
        if (webCacheLogger != null) {
            webCacheLogger.e(tag, msg, t);
            return;
        }
        Log.e("WebCache-" + tag, msg, t);
    }
}
