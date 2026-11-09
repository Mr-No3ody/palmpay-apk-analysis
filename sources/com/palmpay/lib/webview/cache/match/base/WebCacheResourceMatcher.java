package com.palmpay.lib.webview.cache.match.base;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.CallSuper;
import androidx.annotation.Keep;
import androidx.annotation.WorkerThread;
import androidx.lifecycle.EnumC1203m;
import com.palmpay.lib.webview.cache.WebCacheLoader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\u0014\u0010\u0003JA\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0016\u0010\u0018\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJA\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0016\u0010\u0018\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00172\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001a\u0010\u001eJ\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001a\u0010 R$\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010)\u001a\u00020(8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/palmpay/lib/webview/cache/match/base/WebCacheResourceMatcher;", "", "<init>", "()V", "Landroidx/lifecycle/m;", "event", "", "onLifecycleStateChanged", "(Landroidx/lifecycle/m;)V", "", "url", "prepare", "(Ljava/lang/String;)V", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceResponse;", "match", "(Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "destroy", "clearDataSource", "onDestroy", "mimeType", "encoding", "", "header", "filePath", "createResponse", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;", "Ljava/io/InputStream;", "inputStream", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/io/InputStream;)Landroid/webkit/WebResourceResponse;", "response", "(Landroid/webkit/WebResourceResponse;)Landroid/webkit/WebResourceResponse;", "Lcom/palmpay/lib/webview/cache/WebCacheLoader;", "loader", "Lcom/palmpay/lib/webview/cache/WebCacheLoader;", "getLoader", "()Lcom/palmpay/lib/webview/cache/WebCacheLoader;", "setLoader", "(Lcom/palmpay/lib/webview/cache/WebCacheLoader;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "destroyed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getDestroyed", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "getName", "()Ljava/lang/String;", "name", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class WebCacheResourceMatcher {

    @NotNull
    private final AtomicBoolean destroyed = new AtomicBoolean(false);

    @Nullable
    private WebCacheLoader loader;

    public void clearDataSource() {
    }

    @NotNull
    public WebResourceResponse createResponse(@NotNull String mimeType, @Nullable String encoding, @Nullable Map<String, String> header, @NotNull String filePath) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return createResponse(mimeType, encoding, header, new FileInputStream(filePath));
    }

    public final void destroy() {
        if (this.destroyed.compareAndSet(false, true)) {
            onDestroy();
        }
    }

    @NotNull
    public final AtomicBoolean getDestroyed() {
        return this.destroyed;
    }

    @Nullable
    public final WebCacheLoader getLoader() {
        return this.loader;
    }

    @NotNull
    public abstract String getName();

    @WorkerThread
    @Nullable
    public abstract WebResourceResponse match(@NotNull WebResourceRequest request);

    @CallSuper
    public void onDestroy() {
        this.loader = null;
    }

    public void onLifecycleStateChanged(@NotNull EnumC1203m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == EnumC1203m.ON_DESTROY) {
            destroy();
        }
    }

    public void prepare(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
    }

    public final void setLoader(@Nullable WebCacheLoader webCacheLoader) {
        this.loader = webCacheLoader;
    }

    @NotNull
    public WebResourceResponse createResponse(@NotNull String mimeType, @Nullable String encoding, @Nullable Map<String, String> header, @NotNull InputStream inputStream) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        return createResponse(new WebResourceResponse(mimeType, encoding, inputStream));
    }

    @NotNull
    public WebResourceResponse createResponse(@NotNull WebResourceResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Map<String, String> responseHeaders = response.getResponseHeaders();
        if (responseHeaders == null) {
            responseHeaders = new HashMap<>(1);
        }
        response.setResponseHeaders(responseHeaders);
        Map<String, String> responseHeaders2 = response.getResponseHeaders();
        Intrinsics.checkNotNullExpressionValue(responseHeaders2, "getResponseHeaders(...)");
        responseHeaders2.put("WebCache", getName());
        return response;
    }
}
