package com.palmpay.lib.webview.cache.match.impl;

import N8.q0;
import Wf.AbstractC0780y;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.Keep;
import androidx.annotation.WorkerThread;
import com.palmpay.lib.webview.cache.WebCacheParamsProvider;
import com.palmpay.lib.webview.cache.WebCacheSetting;
import com.palmpay.lib.webview.cache.entity.WebCacheDataSource;
import com.palmpay.lib.webview.cache.entity.WebCacheLocalResp;
import com.palmpay.lib.webview.cache.entity.WebCacheLocalRespKt;
import com.palmpay.lib.webview.cache.match.base.WebCacheResourceMatcher;
import com.palmpay.lib.webview.cache.util.CancellableJob;
import com.palmpay.lib.webview.cache.util.CoroutineHelper;
import com.palmpay.lib.webview.cache.util.ICancellable;
import com.palmpay.lib.webview.cache.util.UrlHelper;
import com.palmpay.lib.webview.cache.util.WebCacheLog;
import com.palmpay.lib.webview.container.fast.offline.CacheRequest;
import com.palmpay.lib.webview.container.fast.utils.MimeTypeMapUtils;
import com.palmpay.lib.webview.offline.OfflineWebManager;
import java.io.File;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p059e1.a;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0017J\"\u0010\u001f\u001a\u0004\u0018\u00010\u001c2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0005J\u0010\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u0005H\u0002J\u0016\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0014J\b\u0010'\u001a\u00020\u001aH\u0016J\b\u0010(\u001a\u00020\u001aH\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR.\u0010\u0010\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u0011X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006)"}, d2 = {"Lcom/palmpay/lib/webview/cache/match/impl/MapResourceMatcher;", "Lcom/palmpay/lib/webview/cache/match/base/WebCacheResourceMatcher;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "readMapTask", "Lcom/palmpay/lib/webview/cache/util/ICancellable;", "dataSource", "Lcom/palmpay/lib/webview/cache/entity/WebCacheDataSource;", "getDataSource", "()Lcom/palmpay/lib/webview/cache/entity/WebCacheDataSource;", "setDataSource", "(Lcom/palmpay/lib/webview/cache/entity/WebCacheDataSource;)V", "waitingChannel", "Lkotlinx/coroutines/channels/Channel;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/palmpay/lib/webview/cache/entity/WebCacheLocalResp;", "getWaitingChannel", "()Lkotlinx/coroutines/channels/Channel;", "setWaitingChannel", "(Lkotlinx/coroutines/channels/Channel;)V", "url", "prepare", "", "match", "Landroid/webkit/WebResourceResponse;", "request", "Landroid/webkit/WebResourceRequest;", "getResource", "webResourceRequest", "cacheMode", "", "userAgent", "readResMapFromJsonFile", "filePath", "getLocalMap", "clearDataSource", "onDestroy", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated(message = "")
@SourceDebugExtension({"SMAP\nMapResourceMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapResourceMatcher.kt\ncom/palmpay/lib/webview/cache/match/impl/MapResourceMatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 WebCacheLog.kt\ncom/palmpay/lib/webview/cache/util/WebCacheLogKt\n*L\n1#1,164:1\n1#2:165\n9#3,4:166\n*S KotlinDebug\n*F\n+ 1 MapResourceMatcher.kt\ncom/palmpay/lib/webview/cache/match/impl/MapResourceMatcher\n*L\n90#1:166,4\n*E\n"})
public class MapResourceMatcher extends WebCacheResourceMatcher {

    @Nullable
    private WebCacheDataSource dataSource;

    @NotNull
    private final String name = "MapResourceMatcher";

    @Nullable
    private ICancellable readMapTask;

    @Nullable
    private Channel<ConcurrentHashMap<String, WebCacheLocalResp>> waitingChannel;

    private final void readResMapFromJsonFile(String filePath) {
        Job jobLaunchCoroutine$default = CoroutineHelper.launchCoroutine$default(CoroutineHelper.INSTANCE, this, null, new MapResourceMatcher$readResMapFromJsonFile$job$1(filePath, this, null), 1, null);
        this.waitingChannel = a.a(-1, null, 6);
        this.readMapTask = new CancellableJob(jobLaunchCoroutine$default);
    }

    @Override // com.palmpay.lib.webview.cache.match.base.WebCacheResourceMatcher
    public void clearDataSource() {
        ConcurrentHashMap<String, WebCacheLocalResp> localFileMap;
        WebCacheDataSource webCacheDataSource;
        ConcurrentHashMap<String, WebCacheLocalResp> localFileMap2;
        WebCacheDataSource webCacheDataSource2 = this.dataSource;
        if (webCacheDataSource2 != null && (localFileMap = webCacheDataSource2.getLocalFileMap()) != null && true == (!localFileMap.isEmpty()) && (webCacheDataSource = this.dataSource) != null && (localFileMap2 = webCacheDataSource.getLocalFileMap()) != null) {
            localFileMap2.clear();
        }
        WebCacheDataSource webCacheDataSource3 = this.dataSource;
        if (webCacheDataSource3 != null) {
            webCacheDataSource3.setLocalFileMap(null);
        }
        this.dataSource = null;
    }

    @Nullable
    public final WebCacheDataSource getDataSource() {
        return this.dataSource;
    }

    @Nullable
    public ConcurrentHashMap<String, WebCacheLocalResp> getLocalMap() {
        if (this.waitingChannel != null) {
            return (ConcurrentHashMap) AbstractC0780y.p(new MapResourceMatcher$getLocalMap$1$1(this, null));
        }
        return null;
    }

    @Override // com.palmpay.lib.webview.cache.match.base.WebCacheResourceMatcher
    @NotNull
    public String getName() {
        return this.name;
    }

    @Nullable
    public final WebResourceResponse getResource(@NotNull WebResourceRequest webResourceRequest, int cacheMode, @Nullable String userAgent) {
        Intrinsics.checkNotNullParameter(webResourceRequest, "webResourceRequest");
        String string = webResourceRequest.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String mimeTypeFromExtension = MimeTypeMapUtils.getMimeTypeFromExtension(MimeTypeMapUtils.getFileExtensionFromUrl(string));
        CacheRequest cacheRequest = new CacheRequest();
        cacheRequest.setUrl(string);
        cacheRequest.setMime(mimeTypeFromExtension);
        cacheRequest.setForceMode(false);
        cacheRequest.setUserAgent(userAgent);
        cacheRequest.setWebViewCacheMode(cacheMode);
        cacheRequest.setHeaders(webResourceRequest.getRequestHeaders());
        return null;
    }

    @Nullable
    public final Channel<ConcurrentHashMap<String, WebCacheLocalResp>> getWaitingChannel() {
        return this.waitingChannel;
    }

    @Override // com.palmpay.lib.webview.cache.match.base.WebCacheResourceMatcher
    @WorkerThread
    @Nullable
    public WebResourceResponse match(@NotNull WebResourceRequest request) {
        WebCacheLocalResp webCacheLocalResp;
        String str;
        Intrinsics.checkNotNullParameter(request, "request");
        WebCacheDataSource webCacheDataSource = this.dataSource;
        if (webCacheDataSource == null) {
            return null;
        }
        if (request.isForMainFrame()) {
            List<String> pathSegments = Uri.parse(request.getUrl().toString()).getPathSegments();
            if (pathSegments != null) {
                str = C1850q.g(pathSegments) >= 0 ? pathSegments.get(0) : null;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str) && !OfflineWebManager.getInstance().getSharedPreferences().getBoolean(str, true)) {
                clearDataSource();
                return null;
            }
        }
        if (webCacheDataSource.getLocalFileMap() == null) {
            webCacheDataSource.setLocalFileMap(getLocalMap());
            if (getDestroyed().get()) {
                return null;
            }
        }
        ConcurrentHashMap<String, WebCacheLocalResp> localFileMap = webCacheDataSource.getLocalFileMap();
        if (localFileMap != null) {
            UrlHelper urlHelper = UrlHelper.INSTANCE;
            Uri url = request.getUrl();
            Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
            webCacheLocalResp = localFileMap.get(urlHelper.urlToKey(url));
        } else {
            webCacheLocalResp = null;
        }
        if (webCacheLocalResp != null) {
            WebResourceResponse webResourceResponseCreateResponse = WebCacheLocalRespKt.createResponse(webCacheLocalResp, webCacheDataSource.getLocalFileDirDetail().getPath());
            if (webResourceResponseCreateResponse != null) {
                return createResponse(webResourceResponseCreateResponse);
            }
            return null;
        }
        WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
        if (webCacheLog.getCanLog()) {
            webCacheLog.d(getName(), "[Web-Match] " + getName() + " cannot find local file config for url[" + request.getUrl() + "], may search config in next matcher if exists.");
        }
        return null;
    }

    @Override // com.palmpay.lib.webview.cache.match.base.WebCacheResourceMatcher
    public void onDestroy() {
        super.onDestroy();
        Channel<ConcurrentHashMap<String, WebCacheLocalResp>> channel = this.waitingChannel;
        if (channel != null) {
            channel.cancel((CancellationException) null);
        }
        ICancellable iCancellable = this.readMapTask;
        if (iCancellable != null) {
            ICancellable.DefaultImpls.cancel$default(iCancellable, null, 1, null);
        }
    }

    @Override // com.palmpay.lib.webview.cache.match.base.WebCacheResourceMatcher
    public void prepare(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        WebCacheDataSource dataSource = getDataSource(url);
        this.dataSource = dataSource;
        if (dataSource != null && dataSource.getLocalFileMap() == null && dataSource.getLocalFileDirDetail().exists()) {
            readResMapFromJsonFile(q0.y(dataSource.getLocalFileDirDetail().getPath(), File.separator, "resource.json"));
        }
    }

    public final void setDataSource(@Nullable WebCacheDataSource webCacheDataSource) {
        this.dataSource = webCacheDataSource;
    }

    public final void setWaitingChannel(@Nullable Channel<ConcurrentHashMap<String, WebCacheLocalResp>> channel) {
        this.waitingChannel = channel;
    }

    @Nullable
    public WebCacheDataSource getDataSource(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        WebCacheParamsProvider paramsProvider = WebCacheSetting.INSTANCE.getParamsProvider();
        if (paramsProvider != null) {
            return paramsProvider.sourceWithUrl(url, getLoader());
        }
        return null;
    }
}
