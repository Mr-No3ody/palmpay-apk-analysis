package com.palmpay.lib.webview.cache;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.lifecycle.LifecycleOwner;
import com.palmpay.lib.webview.cache.match.ResourceMatcherManager;
import com.palmpay.lib.webview.cache.match.base.WebCacheResourceMatcher;
import com.palmpay.lib.webview.cache.service.DelegateManager;
import com.palmpay.lib.webview.cache.service.WebCacheMaster;
import com.palmpay.lib.webview.cache.service.base.AbstractDelegate;
import com.palmpay.lib.webview.cache.util.WebCacheLog;
import com.palmpay.lib.webview.container.fast.offline.ResourceInterceptor;
import com.palmpay.lib.webview.container.fast.utils.LogUtils;
import com.palmpay.lib.webview.offline.OfflineConfig;
import com.palmpay.lib.webview.offline.OfflineTaskManager;
import com.palmpay.lib.webview.offline.OfflineWebManager;
import com.palmpay.lib.webview.offline.task.CheckAndUpdateTask;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\nJ\u0016\u0010\r\u001a\u00020\u00052\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000fJ\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\u0018\u0010\u0012\u001a\u00020\u00052\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u000fH\u0007J\u0018\u0010\u0015\u001a\u00020\u00052\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u000fH\u0007J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0017H\u0007J\u0018\u0010\u0018\u001a\u00020\u00052\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u000fH\u0007J'\u0010\u001b\u001a\u0004\u0018\u0001H\u001c\"\b\b\u0000\u0010\u001c*\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u000fH\u0007¢\u0006\u0002\u0010\u001eJ\u001e\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$J\u0016\u0010\u001f\u001a\u0004\u0018\u00010 *\u00020$2\b\u0010!\u001a\u0004\u0018\u00010\"J\u0012\u0010%\u001a\u0004\u0018\u00010 2\b\u0010&\u001a\u0004\u0018\u00010\"J\u001e\u0010'\u001a\u0004\u0018\u00010 2\b\u0010&\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$J\u0016\u0010'\u001a\u0004\u0018\u00010 *\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\"J&\u0010(\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010)\u001a\u00020\nJ \u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\"2\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010,\u001a\u00020\nJ\u000e\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020/J\u000e\u00100\u001a\u00020\u00052\u0006\u0010.\u001a\u00020/J\u0010\u00101\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010\"J\u0010\u00102\u001a\u00020\u00052\b\u00103\u001a\u0004\u0018\u000104¨\u00065"}, d2 = {"Lcom/palmpay/lib/webview/cache/WebCache;", "", "<init>", "()V", "initInternal", "", "context", "Landroid/content/Context;", "init", "debug", "", "getContext", "enable", "setGlobalParams", "paramsProviderClazz", "Ljava/lang/Class;", "Lcom/palmpay/lib/webview/cache/WebCacheParamsProvider;", "getGlobalParams", "registerDefaultResourceMatcher", "matcherClazz", "Lcom/palmpay/lib/webview/cache/match/base/WebCacheResourceMatcher;", "unregisterDefaultResourceMatcher", "createDefaultResourceMatcherList", "Ljava/util/LinkedList;", "registerService", "delegateClazz", "Lcom/palmpay/lib/webview/cache/service/base/AbstractDelegate;", "getService", "T", "delegateType", "(Ljava/lang/Class;)Lcom/palmpay/lib/webview/cache/service/base/AbstractDelegate;", "createDefaultLoader", "Lcom/palmpay/lib/webview/cache/WebCacheLoader;", "url", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLoader", "key", "getAndBindLoader", "startLoader", "checkUpdate", "updateLoader", "bizName", "forceUpdate", "addWebResourceInterceptor", "interceptor", "Lcom/palmpay/lib/webview/container/fast/offline/ResourceInterceptor;", "addWebResourceFallbackInterceptor", "removeLoader", "setLogger", "logger", "Lcom/palmpay/lib/webview/cache/WebCacheLogger;", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWebCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebCache.kt\ncom/palmpay/lib/webview/cache/WebCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,240:1\n1#2:241\n*E\n"})
public final class WebCache {

    @NotNull
    public static final WebCache INSTANCE = new WebCache();

    private WebCache() {
    }

    public static /* synthetic */ WebCacheLoader createDefaultLoader$default(WebCache webCache, String str, LifecycleOwner lifecycleOwner, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            lifecycleOwner = null;
        }
        return webCache.createDefaultLoader(str, lifecycleOwner);
    }

    public static /* synthetic */ WebCacheLoader getAndBindLoader$default(WebCache webCache, String str, LifecycleOwner lifecycleOwner, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            lifecycleOwner = null;
        }
        return webCache.getAndBindLoader(str, lifecycleOwner);
    }

    public static /* synthetic */ void init$default(WebCache webCache, Context context, boolean z3, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z3 = false;
        }
        webCache.init(context, z3);
    }

    private final void initInternal(Context context) {
        WebCacheSetting.INSTANCE.setAppContext(context);
        setGlobalParams(DefaultParamsProvider.class);
    }

    public static /* synthetic */ WebCacheLoader startLoader$default(WebCache webCache, String str, LifecycleOwner lifecycleOwner, boolean z3, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            lifecycleOwner = null;
        }
        if ((i7 & 4) != 0) {
            z3 = true;
        }
        return webCache.startLoader(str, lifecycleOwner, z3);
    }

    public static /* synthetic */ void updateLoader$default(WebCache webCache, String str, boolean z3, boolean z8, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            z8 = false;
        }
        webCache.updateLoader(str, z3, z8);
    }

    public final void addWebResourceFallbackInterceptor(@NotNull ResourceInterceptor interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        if (WebCacheSetting.INSTANCE.getEnable()) {
            ResourceMatcherManager.INSTANCE.addWebResourceFallbackInterceptor(interceptor);
        }
    }

    public final void addWebResourceInterceptor(@NotNull ResourceInterceptor interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        if (WebCacheSetting.INSTANCE.getEnable()) {
            ResourceMatcherManager.INSTANCE.addWebResourceInterceptor(interceptor);
        }
    }

    @Nullable
    public final WebCacheLoader createDefaultLoader(@Nullable String url, @Nullable LifecycleOwner lifecycleOwner) {
        if (!WebCacheSetting.INSTANCE.getEnable()) {
            return null;
        }
        WebCacheLoader webCacheLoaderCreateDefaultLoader = url != null ? WebCacheMaster.INSTANCE.getInstance().createDefaultLoader(url) : null;
        if (lifecycleOwner != null && webCacheLoaderCreateDefaultLoader != null) {
            webCacheLoaderCreateDefaultLoader.setLifecycleOwner(lifecycleOwner);
        }
        return webCacheLoaderCreateDefaultLoader;
    }

    @Deprecated(message = "")
    @NotNull
    public final LinkedList<WebCacheResourceMatcher> createDefaultResourceMatcherList() {
        return !WebCacheSetting.INSTANCE.getEnable() ? new LinkedList<>() : ResourceMatcherManager.INSTANCE.createDefaultMatcherList();
    }

    public final void enable(boolean enable) {
        WebCacheSetting.INSTANCE.setEnable(enable);
    }

    @Nullable
    public final WebCacheLoader getAndBindLoader(@Nullable String key, @Nullable LifecycleOwner lifecycleOwner) {
        if (!WebCacheSetting.INSTANCE.getEnable()) {
            return null;
        }
        WebCacheLoader loader = key != null ? WebCacheMaster.INSTANCE.getInstance().getLoader(key) : null;
        if (lifecycleOwner != null && loader != null) {
            loader.setLifecycleOwner(lifecycleOwner);
        }
        return loader;
    }

    @Nullable
    public final Context getContext() {
        return WebCacheSetting.INSTANCE.getAppContext();
    }

    @Nullable
    public final WebCacheParamsProvider getGlobalParams() {
        return WebCacheSetting.INSTANCE.getParamsProvider();
    }

    @Nullable
    public final WebCacheLoader getLoader(@Nullable String key) {
        if (WebCacheSetting.INSTANCE.getEnable() && key != null) {
            return WebCacheMaster.INSTANCE.getInstance().getLoader(key);
        }
        return null;
    }

    @Deprecated(message = "")
    @Nullable
    public final <T extends AbstractDelegate> T getService(@NotNull Class<T> delegateType) {
        Intrinsics.checkNotNullParameter(delegateType, "delegateType");
        if (WebCacheSetting.INSTANCE.getEnable()) {
            return (T) DelegateManager.INSTANCE.getDelegate(delegateType);
        }
        return null;
    }

    public final void init(@NotNull Context context, boolean debug) {
        Intrinsics.checkNotNullParameter(context, "context");
        WebCacheSetting.INSTANCE.setDebug(debug);
        initInternal(context);
        LogUtils.DEBUG = debug;
    }

    @Deprecated(message = "")
    public final void registerDefaultResourceMatcher(@NotNull Class<? extends WebCacheResourceMatcher> matcherClazz) {
        Intrinsics.checkNotNullParameter(matcherClazz, "matcherClazz");
        if (WebCacheSetting.INSTANCE.getEnable()) {
            ResourceMatcherManager.INSTANCE.registerMatcher(matcherClazz);
        }
    }

    @Deprecated(message = "")
    public final void registerService(@NotNull Class<? extends AbstractDelegate> delegateClazz) {
        Intrinsics.checkNotNullParameter(delegateClazz, "delegateClazz");
        if (WebCacheSetting.INSTANCE.getEnable()) {
            DelegateManager.INSTANCE.addDelegateClass(delegateClazz);
        }
    }

    public final void removeLoader(@Nullable String key) {
        WebCacheLoader loader;
        if (!WebCacheSetting.INSTANCE.getEnable() || key == null || (loader = WebCacheMaster.INSTANCE.getInstance().getLoader(key)) == null) {
            return;
        }
        loader.destroy();
    }

    public final void setGlobalParams(@NotNull Class<? extends WebCacheParamsProvider> paramsProviderClazz) {
        Intrinsics.checkNotNullParameter(paramsProviderClazz, "paramsProviderClazz");
        WebCacheSetting.INSTANCE.setGlobalParamsClass(paramsProviderClazz);
    }

    public final void setLogger(@Nullable WebCacheLogger logger) {
        WebCacheLog.INSTANCE.setMyLogger(logger);
    }

    @Nullable
    public final WebCacheLoader startLoader(@NotNull String url, @Nullable LifecycleOwner lifecycleOwner, boolean checkUpdate) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (!WebCacheSetting.INSTANCE.getEnable()) {
            return null;
        }
        WebCacheLoader andBindLoader = getAndBindLoader(url, lifecycleOwner);
        if (andBindLoader == null) {
            andBindLoader = createDefaultLoader(url, lifecycleOwner);
        }
        if (OfflineWebManager.getInstance().isInit() && checkUpdate) {
            List<String> pathSegments = Uri.parse(url).getPathSegments();
            String str = "";
            if (pathSegments != null) {
                String str2 = C1850q.g(pathSegments) >= 0 ? pathSegments.get(0) : "";
                if (str2 != null) {
                    str = str2;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                OfflineConfig offlineConfig = OfflineWebManager.getInstance().getOfflineConfig();
                HashSet<String> preDownloadList = offlineConfig != null ? offlineConfig.getPreDownloadList() : null;
                if (preDownloadList != null && preDownloadList.size() > 0 && preDownloadList.contains(str)) {
                    OfflineWebManager.getInstance().getExecutor().execute(new CheckAndUpdateTask(str, null));
                }
            }
            OfflineTaskManager.checkWebConfig();
        }
        return andBindLoader;
    }

    @Deprecated(message = "")
    public final void unregisterDefaultResourceMatcher(@NotNull Class<? extends WebCacheResourceMatcher> matcherClazz) {
        Intrinsics.checkNotNullParameter(matcherClazz, "matcherClazz");
        if (WebCacheSetting.INSTANCE.getEnable()) {
            ResourceMatcherManager.INSTANCE.unregisterMatcher(matcherClazz);
        }
    }

    public final void updateLoader(@NotNull String bizName, boolean enable, boolean forceUpdate) {
        Intrinsics.checkNotNullParameter(bizName, "bizName");
        if (WebCacheSetting.INSTANCE.getEnable()) {
            WebCacheMaster.INSTANCE.getInstance().updateLoader(bizName, enable, forceUpdate);
        }
    }

    @Nullable
    public final WebCacheLoader createDefaultLoader(@NotNull LifecycleOwner lifecycleOwner, @Nullable String str) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<this>");
        return createDefaultLoader(str, lifecycleOwner);
    }

    @Nullable
    public final WebCacheLoader getAndBindLoader(@NotNull LifecycleOwner lifecycleOwner, @Nullable String str) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<this>");
        return getAndBindLoader(str, lifecycleOwner);
    }
}
