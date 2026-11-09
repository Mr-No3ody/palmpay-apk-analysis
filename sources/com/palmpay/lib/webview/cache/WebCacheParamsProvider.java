package com.palmpay.lib.webview.cache;

import android.text.TextUtils;
import android.webkit.CookieManager;
import androidx.annotation.Keep;
import com.palmpay.lib.webview.cache.entity.WebCacheDataSource;
import com.palmpay.lib.webview.cache.util.WebCacheLog;
import com.palmpay.lib.webview.offline.utils.OfflinePackageUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\"\u0010\r\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000fH\u0016J\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/palmpay/lib/webview/cache/WebCacheParamsProvider;", "", "<init>", "()V", "getUserAgent", "", "url", "cacheDir", "getCacheDir", "()Ljava/lang/String;", "showLog", "", "getCookie", "saveCookie", "cookies", "", "sourceWithUrl", "Lcom/palmpay/lib/webview/cache/entity/WebCacheDataSource;", "loader", "Lcom/palmpay/lib/webview/cache/WebCacheLoader;", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWebCacheParamsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebCacheParamsProvider.kt\ncom/palmpay/lib/webview/cache/WebCacheParamsProvider\n+ 2 WebCacheLog.kt\ncom/palmpay/lib/webview/cache/util/WebCacheLogKt\n*L\n1#1,70:1\n9#2,4:71\n*S KotlinDebug\n*F\n+ 1 WebCacheParamsProvider.kt\ncom/palmpay/lib/webview/cache/WebCacheParamsProvider\n*L\n41#1:71,4\n*E\n"})
public abstract class WebCacheParamsProvider {
    @Nullable
    public String getCacheDir() {
        return OfflinePackageUtil.getResDir();
    }

    @NotNull
    public String getCookie(@Nullable String url) {
        String cookie = CookieManager.getInstance().getCookie(url);
        return cookie == null ? "" : cookie;
    }

    @Nullable
    public abstract String getUserAgent(@Nullable String url);

    public boolean saveCookie(@Nullable String url, @NotNull List<String> cookies) {
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        CookieManager cookieManager = CookieManager.getInstance();
        if (!cookieManager.acceptCookie()) {
            return false;
        }
        for (String str : cookies) {
            if (!TextUtils.isEmpty(str)) {
                cookieManager.setCookie(url, str);
                WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
                if (webCacheLog.getCanLog()) {
                    webCacheLog.d("WebCacheParamsProvider", "set cookie: " + str);
                }
            }
        }
        CookieManager.getInstance().flush();
        return true;
    }

    public boolean showLog() {
        return false;
    }

    @Nullable
    public WebCacheDataSource sourceWithUrl(@NotNull String url, @Nullable WebCacheLoader loader) {
        Intrinsics.checkNotNullParameter(url, "url");
        return null;
    }
}
