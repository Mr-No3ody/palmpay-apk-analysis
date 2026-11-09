package com.palmpay.lib.webview.cache.service;

import C0.G;
import android.net.Uri;
import com.palmpay.lib.webview.cache.WebCacheLoader;
import com.palmpay.lib.webview.cache.util.WebCacheLog;
import com.transsnet.palmpay.managemoney.ui.view.c;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u0006J\"\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0016J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u0006R'\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/WebCacheMaster;", "", "<init>", "()V", "loaderMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/palmpay/lib/webview/cache/WebCacheLoader;", "getLoaderMap", "()Ljava/util/concurrent/ConcurrentHashMap;", "loaderMap$delegate", "Lkotlin/Lazy;", "createDefaultLoader", "url", "addLoader", "", "loader", "getLoader", "loaderKey", "updateLoader", "bizName", "enable", "", "forceUpdate", "removeLoader", "Companion", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWebCacheMaster.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebCacheMaster.kt\ncom/palmpay/lib/webview/cache/service/WebCacheMaster\n+ 2 WebCacheLog.kt\ncom/palmpay/lib/webview/cache/util/WebCacheLogKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n9#2,4:93\n9#2,4:97\n9#2,4:102\n1#3:101\n*S KotlinDebug\n*F\n+ 1 WebCacheMaster.kt\ncom/palmpay/lib/webview/cache/service/WebCacheMaster\n*L\n49#1:93,4\n55#1:97,4\n87#1:102,4\n*E\n"})
public final class WebCacheMaster {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static volatile WebCacheMaster INSTANCE = null;

    @NotNull
    private static final String TAG = "WebCacheMaster";

    /* JADX INFO: renamed from: loaderMap$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy loaderMap;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/WebCacheMaster$Companion;", "", "<init>", "()V", "TAG", "", "INSTANCE", "Lcom/palmpay/lib/webview/cache/service/WebCacheMaster;", "getInstance", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nWebCacheMaster.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebCacheMaster.kt\ncom/palmpay/lib/webview/cache/service/WebCacheMaster$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n1#2:93\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WebCacheMaster getInstance() {
            WebCacheMaster webCacheMaster;
            WebCacheMaster webCacheMaster2 = WebCacheMaster.INSTANCE;
            if (webCacheMaster2 != null) {
                return webCacheMaster2;
            }
            synchronized (this) {
                webCacheMaster = WebCacheMaster.INSTANCE;
                if (webCacheMaster == null) {
                    webCacheMaster = new WebCacheMaster(null);
                    WebCacheMaster.INSTANCE = webCacheMaster;
                }
            }
            return webCacheMaster;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WebCacheMaster(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final ConcurrentHashMap<String, WebCacheLoader> getLoaderMap() {
        return (ConcurrentHashMap) this.loaderMap.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConcurrentHashMap loaderMap_delegate$lambda$0() {
        return new ConcurrentHashMap();
    }

    public static /* synthetic */ void updateLoader$default(WebCacheMaster webCacheMaster, String str, boolean z3, boolean z8, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z3 = false;
        }
        if ((i7 & 4) != 0) {
            z8 = false;
        }
        webCacheMaster.updateLoader(str, z3, z8);
    }

    public final void addLoader(@NotNull WebCacheLoader loader) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
        if (webCacheLog.getCanLog()) {
            webCacheLog.d(TAG, G.p("Add new loader(id:", loader.getKey(), ") for ", loader.getUrl()));
        }
        getLoaderMap().put(loader.getKey(), loader);
    }

    @NotNull
    public final WebCacheLoader createDefaultLoader(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        WebCacheLoader webCacheLoaderInit = new WebCacheLoader(url, url, false, 4, null).init();
        WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
        if (webCacheLog.getCanLog()) {
            webCacheLog.d(TAG, G.p("Create new loader(id:", webCacheLoaderInit.getKey(), ") for ", webCacheLoaderInit.getUrl()));
        }
        getLoaderMap().put(webCacheLoaderInit.getKey(), webCacheLoaderInit);
        return webCacheLoaderInit;
    }

    @Nullable
    public final WebCacheLoader getLoader(@NotNull String loaderKey) {
        Intrinsics.checkNotNullParameter(loaderKey, "loaderKey");
        return getLoaderMap().get(loaderKey);
    }

    @Nullable
    public final WebCacheLoader removeLoader(@NotNull String loaderKey) {
        Intrinsics.checkNotNullParameter(loaderKey, "loaderKey");
        WebCacheLoader webCacheLoaderRemove = getLoaderMap().remove(loaderKey);
        WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
        if (webCacheLog.getCanLog() && webCacheLoaderRemove != null) {
            webCacheLog.d(TAG, "Remove loader(id:" + webCacheLoaderRemove.getKey() + ")");
        }
        return webCacheLoaderRemove;
    }

    public final void updateLoader(@NotNull String bizName, boolean enable, boolean forceUpdate) {
        Intrinsics.checkNotNullParameter(bizName, "bizName");
        for (Map.Entry<String, WebCacheLoader> entry : getLoaderMap().entrySet()) {
            List<String> pathSegments = Uri.parse(entry.getKey()).getPathSegments();
            if (Intrinsics.c(bizName, pathSegments != null ? C1850q.g(pathSegments) >= 0 ? pathSegments.get(0) : null : null)) {
                WebCacheLoader value = entry.getValue();
                value.setEnable(enable);
                if (enable) {
                    value.prepare(Boolean.TRUE);
                } else {
                    value.clearDataSource();
                }
                if (forceUpdate) {
                    WebCacheLoader.sendMessageData$default(value, 1, null, 2, null);
                    return;
                }
                return;
            }
        }
    }

    private WebCacheMaster() {
        this.loaderMap = C2131j.b(new c(19));
    }
}
