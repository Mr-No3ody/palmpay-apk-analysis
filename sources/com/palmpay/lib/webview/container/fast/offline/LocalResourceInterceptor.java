package com.palmpay.lib.webview.container.fast.offline;

import C0.G;
import N8.q0;
import Wf.AbstractC0780y;
import android.text.TextUtils;
import androidx.camera.video.u;
import com.google.common.net.HttpHeaders;
import com.palmpay.lib.webview.cache.WebCacheLoader;
import com.palmpay.lib.webview.cache.WebCacheParamsProvider;
import com.palmpay.lib.webview.cache.WebCacheSetting;
import com.palmpay.lib.webview.cache.entity.WebCacheDataSource;
import com.palmpay.lib.webview.cache.entity.WebCacheFileDetail;
import com.palmpay.lib.webview.cache.entity.WebCacheLocalResp;
import com.palmpay.lib.webview.cache.entity.WebCacheLocalRespKt;
import com.palmpay.lib.webview.cache.util.CancellableJob;
import com.palmpay.lib.webview.cache.util.CoroutineHelper;
import com.palmpay.lib.webview.cache.util.ICancellable;
import com.palmpay.lib.webview.cache.util.UrlHelper;
import com.palmpay.lib.webview.cache.util.WebCacheLog;
import com.palmpay.lib.webview.container.fast.WebResource;
import com.palmpay.lib.webview.container.fast.config.CacheConfig;
import com.palmpay.lib.webview.container.fast.utils.HeaderUtils;
import com.palmpay.lib.webview.container.fast.utils.LogUtils;
import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p059e1.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\nH\u0002J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\u00182\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\nH\u0002J\u0016\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0002J\u0012\u0010%\u001a\u00020\u001a2\b\u0010&\u001a\u0004\u0018\u00010\u001cH\u0002J\b\u0010'\u001a\u00020\u0018H\u0002J\b\u0010(\u001a\u00020\u0018H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0011\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00140\u0013\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/palmpay/lib/webview/container/fast/offline/LocalResourceInterceptor;", "Lcom/palmpay/lib/webview/container/fast/offline/Destroyable;", "Lcom/palmpay/lib/webview/container/fast/offline/CacheResourceInterceptor;", "loader", "Lcom/palmpay/lib/webview/cache/WebCacheLoader;", "cacheConfig", "Lcom/palmpay/lib/webview/container/fast/config/CacheConfig;", "<init>", "(Lcom/palmpay/lib/webview/cache/WebCacheLoader;Lcom/palmpay/lib/webview/container/fast/config/CacheConfig;)V", "name", "", "getName", "()Ljava/lang/String;", "readMapTask", "Lcom/palmpay/lib/webview/cache/util/ICancellable;", "dataSource", "Lcom/palmpay/lib/webview/cache/entity/WebCacheDataSource;", "waitingChannel", "Lkotlinx/coroutines/channels/Channel;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/palmpay/lib/webview/cache/entity/WebCacheLocalResp;", "getDataSource", "url", "prepare", "", "refresh", "", "load", "Lcom/palmpay/lib/webview/container/fast/WebResource;", "chain", "Lcom/palmpay/lib/webview/container/fast/offline/Chain;", "checkRedirect", "request", "Lcom/palmpay/lib/webview/container/fast/offline/CacheRequest;", "readResMapFromJsonFile", "filePath", "getLocalMap", "isRealMimeTypeCacheable", "resource", "clearDataSource", "destroy", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLocalResourceInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalResourceInterceptor.kt\ncom/palmpay/lib/webview/container/fast/offline/LocalResourceInterceptor\n+ 2 WebCacheLog.kt\ncom/palmpay/lib/webview/cache/util/WebCacheLogKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,175:1\n9#2,4:176\n731#3,9:180\n37#4,2:189\n*S KotlinDebug\n*F\n+ 1 LocalResourceInterceptor.kt\ncom/palmpay/lib/webview/container/fast/offline/LocalResourceInterceptor\n*L\n78#1:176,4\n156#1:180,9\n156#1:189,2\n*E\n"})
public final class LocalResourceInterceptor extends CacheResourceInterceptor implements Destroyable {

    @NotNull
    private final CacheConfig cacheConfig;

    @Nullable
    private WebCacheDataSource dataSource;

    @NotNull
    private final WebCacheLoader loader;

    @NotNull
    private final String name;

    @Nullable
    private ICancellable readMapTask;

    @Nullable
    private Channel<ConcurrentHashMap<String, WebCacheLocalResp>> waitingChannel;

    public LocalResourceInterceptor(@NotNull WebCacheLoader loader, @NotNull CacheConfig cacheConfig) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        Intrinsics.checkNotNullParameter(cacheConfig, "cacheConfig");
        this.loader = loader;
        this.cacheConfig = cacheConfig;
        this.name = "LocalResInterceptor";
    }

    private final void checkRedirect(CacheRequest request) {
        if (request == null || true != request.isForFrame()) {
            return;
        }
        String str = String.format("url: %s, isForFrame: %s, isRedirect: %s", Arrays.copyOf(new Object[]{request.getUrl(), Boolean.valueOf(request.isForFrame()), Boolean.valueOf(request.isRedirect())}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        LogUtils.d(str);
        String url = request.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
        WebCacheDataSource dataSource = getDataSource(url);
        this.dataSource = dataSource;
        if (dataSource != null && dataSource.getLocalFileMap() == null && dataSource.getLocalFileDirDetail().exists()) {
            readResMapFromJsonFile(q0.y(dataSource.getLocalFileDirDetail().getPath(), File.separator, "resource.json"));
        }
    }

    private final void clearDataSource() {
        ConcurrentHashMap<String, WebCacheLocalResp> localFileMap;
        WebCacheDataSource webCacheDataSource;
        ConcurrentHashMap<String, WebCacheLocalResp> localFileMap2;
        WebCacheDataSource webCacheDataSource2 = this.dataSource;
        if (webCacheDataSource2 == null || (localFileMap = webCacheDataSource2.getLocalFileMap()) == null || true != (!localFileMap.isEmpty()) || (webCacheDataSource = this.dataSource) == null || (localFileMap2 = webCacheDataSource.getLocalFileMap()) == null) {
            return;
        }
        localFileMap2.clear();
    }

    private final WebCacheDataSource getDataSource(String url) {
        WebCacheParamsProvider paramsProvider = WebCacheSetting.INSTANCE.getParamsProvider();
        if (paramsProvider != null) {
            return paramsProvider.sourceWithUrl(url, this.loader);
        }
        return null;
    }

    private final ConcurrentHashMap<String, WebCacheLocalResp> getLocalMap() {
        if (this.waitingChannel != null) {
            return (ConcurrentHashMap) AbstractC0780y.p(new LocalResourceInterceptor$getLocalMap$1$1(this, null));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007e  */
    private final boolean isRealMimeTypeCacheable(WebResource resource) {
        String str;
        Collection collectionU;
        if (resource != null) {
            Map<String, String> responseHeaders = resource.getResponseHeaders();
            if (responseHeaders != null) {
                Locale locale = Locale.ENGLISH;
                String str2 = responseHeaders.containsKey(HttpHeaders.CONTENT_TYPE) ? responseHeaders.get(HttpHeaders.CONTENT_TYPE) : responseHeaders.get(u.q(locale, "ENGLISH", HttpHeaders.CONTENT_TYPE, locale, "this as java.lang.String).toLowerCase(locale)"));
                if (TextUtils.isEmpty(str2)) {
                    str = null;
                } else {
                    Intrinsics.e(str2);
                    List listC = new Regex(";").c(str2);
                    if (!listC.isEmpty()) {
                        ListIterator listIterator = listC.listIterator(listC.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                collectionU = z.f38935a;
                                break;
                            }
                            if (((String) listIterator.previous()).length() != 0) {
                                collectionU = CollectionsKt.U(listC, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                    } else {
                        collectionU = z.f38935a;
                        break;
                    }
                    String[] strArr = (String[]) collectionU.toArray(new String[0]);
                    if (strArr.length == 0) {
                        str = null;
                    } else {
                        str = strArr[0];
                    }
                }
            } else {
                str = null;
            }
            if (str != null) {
                return true;
            }
        }
        return false;
    }

    private final void readResMapFromJsonFile(String filePath) {
        Job jobLaunchCoroutine$default = CoroutineHelper.launchCoroutine$default(CoroutineHelper.INSTANCE, this, null, new LocalResourceInterceptor$readResMapFromJsonFile$job$1(filePath, this, null), 1, null);
        this.waitingChannel = a.a(-1, null, 6);
        this.readMapTask = new CancellableJob(jobLaunchCoroutine$default);
    }

    @Override // com.palmpay.lib.webview.container.fast.offline.Destroyable
    public void destroy() {
        Channel<ConcurrentHashMap<String, WebCacheLocalResp>> channel = this.waitingChannel;
        if (channel != null) {
            channel.cancel((CancellationException) null);
        }
        ICancellable iCancellable = this.readMapTask;
        if (iCancellable != null) {
            ICancellable.DefaultImpls.cancel$default(iCancellable, null, 1, null);
        }
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Override // com.palmpay.lib.webview.container.fast.offline.ResourceInterceptor
    @Nullable
    public WebResource load(@Nullable Chain chain) {
        WebCacheLocalResp webCacheLocalResp;
        Map<String, String> responseHeaders;
        WebCacheFileDetail localFileDirDetail;
        ConcurrentHashMap<String, WebCacheLocalResp> localFileMap;
        String url;
        CacheRequest request = chain != null ? chain.getRequest() : null;
        if (!isValid(request)) {
            clearDataSource();
            if (chain != null) {
                return chain.process(request);
            }
            return null;
        }
        if (this.dataSource == null) {
            checkRedirect(request);
            Unit unit = Unit.f38893a;
        }
        WebCacheDataSource webCacheDataSource = this.dataSource;
        if (webCacheDataSource == null) {
            if (chain != null) {
                return chain.process(request);
            }
            return null;
        }
        if ((webCacheDataSource != null ? webCacheDataSource.getLocalFileMap() : null) == null) {
            WebCacheDataSource webCacheDataSource2 = this.dataSource;
            if (webCacheDataSource2 != null) {
                webCacheDataSource2.setLocalFileMap(getLocalMap());
            }
            if (this.loader.isDestroy()) {
                return null;
            }
        }
        WebCacheDataSource webCacheDataSource3 = this.dataSource;
        if (webCacheDataSource3 == null || (localFileMap = webCacheDataSource3.getLocalFileMap()) == null) {
            webCacheLocalResp = null;
        } else {
            webCacheLocalResp = localFileMap.get((request == null || (url = request.getUrl()) == null) ? null : UrlHelper.INSTANCE.urlToKey(url));
        }
        if (webCacheLocalResp == null) {
            WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
            if (webCacheLog.getCanLog()) {
                String str = this.name;
                webCacheLog.w(str, G.q("[Web-Match] ", str, " cannot find local file config for url[", request != null ? request.getUrl() : null, "], may search config in next matcher if exists."));
            }
            if (chain != null) {
                return chain.process(request);
            }
            return null;
        }
        WebCacheDataSource webCacheDataSource4 = this.dataSource;
        WebResource webResourceCreateWebResponse = WebCacheLocalRespKt.createWebResponse(webCacheLocalResp, (webCacheDataSource4 == null || (localFileDirDetail = webCacheDataSource4.getLocalFileDirDetail()) == null) ? null : localFileDirDetail.getPath());
        if (!isRealMimeTypeCacheable(webResourceCreateWebResponse)) {
            String str2 = String.format("local cache not hit: %s", Arrays.copyOf(new Object[]{request != null ? request.getUrl() : null}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
            LogUtils.d(str2);
            if (chain != null) {
                return chain.process(request);
            }
            return null;
        }
        if (webResourceCreateWebResponse != null && (responseHeaders = webResourceCreateWebResponse.getResponseHeaders()) != null) {
            responseHeaders.put(HeaderUtils.HEADER_CACHE_SOURCE, "file");
        }
        if (webResourceCreateWebResponse != null) {
            webResourceCreateWebResponse.setCacheMode(2);
        }
        String str3 = String.format("local cache hit: %s", Arrays.copyOf(new Object[]{request != null ? request.getUrl() : null}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(format, *args)");
        LogUtils.d(str3);
        return webResourceCreateWebResponse;
    }

    @Override // com.palmpay.lib.webview.container.fast.offline.ResourceInterceptor
    public void prepare(@NotNull String url, boolean refresh) {
        Intrinsics.checkNotNullParameter(url, "url");
        WebCacheDataSource dataSource = getDataSource(url);
        this.dataSource = dataSource;
        if (dataSource != null && dataSource.getLocalFileMap() == null && dataSource.getLocalFileDirDetail().exists()) {
            readResMapFromJsonFile(q0.y(dataSource.getLocalFileDirDetail().getPath(), File.separator, "resource.json"));
        }
    }
}
