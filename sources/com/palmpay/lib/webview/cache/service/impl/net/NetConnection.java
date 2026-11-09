package com.palmpay.lib.webview.cache.service.impl.net;

import C0.G;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.palmpay.lib.webview.cache.service.base.NetState;
import com.palmpay.lib.webview.cache.service.base.WebCacheNetDelegate;
import com.palmpay.lib.webview.cache.util.WebCacheLog;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jp\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0016\u0010\r\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016Jr\u0010\u0014\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\n\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0016\u0010\r\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016JZ\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\n\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0016\u0010\r\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/impl/net/NetConnection;", "Lcom/palmpay/lib/webview/cache/service/base/WebCacheNetDelegate;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "requestFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/palmpay/lib/webview/cache/service/base/NetState;", "url", FirebaseAnalytics.Param.METHOD, "header", "", "userAgent", "cookie", "body", "followRedirect", "", "connectFlow", "Ljava/io/InputStream;", "downloadFlow", "Ljava/io/File;", "savePath", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNetConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetConnection.kt\ncom/palmpay/lib/webview/cache/service/impl/net/NetConnection\n+ 2 WebCacheLog.kt\ncom/palmpay/lib/webview/cache/util/WebCacheLogKt\n*L\n1#1,124:1\n9#2,4:125\n9#2,4:129\n9#2,4:133\n9#2,4:137\n*S KotlinDebug\n*F\n+ 1 NetConnection.kt\ncom/palmpay/lib/webview/cache/service/impl/net/NetConnection\n*L\n33#1:125,4\n61#1:129,4\n112#1:133,4\n116#1:137,4\n*E\n"})
public class NetConnection extends WebCacheNetDelegate {

    @NotNull
    private final String name = "NetConnection";

    @Override // com.palmpay.lib.webview.cache.service.base.WebCacheNetDelegate
    @Nullable
    public Flow<NetState<InputStream>> connectFlow(@NotNull final String url, @NotNull String method, @Nullable Map<String, String> header, @Nullable String userAgent, @Nullable String cookie, @Nullable Map<String, String> body, boolean followRedirect) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        if (url.length() == 0) {
            WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
            if (!webCacheLog.getCanLog()) {
                return null;
            }
            webCacheLog.e(getName(), "Cannot start network connection, because url is empty.");
            return null;
        }
        BaseRequest<InputStream> baseRequest = new BaseRequest<InputStream>(url) { // from class: com.palmpay.lib.webview.cache.service.impl.net.NetConnection$connectFlow$request$1
            @Override // com.palmpay.lib.webview.cache.service.impl.net.BaseRequest
            public String getTAG() {
                return "InputStreamRequest";
            }

            @Override // com.palmpay.lib.webview.cache.service.impl.net.BaseRequest
            public Object parseData(int i7, Map<String, ? extends List<String>> map, long j6, InputStream inputStream, Continuation<? super NetState<InputStream>> continuation) {
                if (i7 == 200) {
                    return new NetState.Complete(i7, map, j6, inputStream != null ? new CallbackInputStream(inputStream, new CallbackInputStream.StreamCallback() { // from class: com.palmpay.lib.webview.cache.service.impl.net.NetConnection$connectFlow$request$1$parseData$callbackStream$1$1
                        @Override // com.palmpay.lib.webview.cache.service.impl.net.CallbackInputStream.StreamCallback
                        public void onClose() {
                            disconnect();
                        }
                    }) : null);
                }
                return new NetState.Error(i7, new Exception(G.m(i7, "Net Error code = ")));
            }
        };
        baseRequest.setMethod(method);
        baseRequest.setHeader(header);
        baseRequest.setUserAgent(userAgent);
        baseRequest.setCookies(cookie);
        baseRequest.setBody(body);
        baseRequest.setAllowRedirect(followRedirect);
        return baseRequest.connectFlow();
    }

    @Override // com.palmpay.lib.webview.cache.service.base.WebCacheNetDelegate
    @Nullable
    public Flow<NetState<File>> downloadFlow(@NotNull String url, @NotNull String savePath, @NotNull String method, @Nullable Map<String, String> header, @Nullable String userAgent, @Nullable String cookie) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(savePath, "savePath");
        Intrinsics.checkNotNullParameter(method, "method");
        if (url.length() == 0) {
            WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
            if (webCacheLog.getCanLog()) {
                webCacheLog.e(getName(), "Cannot download file, because url is empty.");
            }
            return null;
        }
        if (savePath.length() != 0) {
            FileRequest fileRequest = new FileRequest(url, savePath);
            fileRequest.setMethod(method);
            return fileRequest.connectFlow();
        }
        WebCacheLog webCacheLog2 = WebCacheLog.INSTANCE;
        if (webCacheLog2.getCanLog()) {
            webCacheLog2.e(getName(), "Cannot download file[" + url + "], because savePath is empty.");
        }
        return null;
    }

    @Override // com.palmpay.lib.webview.cache.service.base.AbstractDelegate
    @NotNull
    public String getName() {
        return this.name;
    }

    @Override // com.palmpay.lib.webview.cache.service.base.WebCacheNetDelegate
    @Nullable
    public Flow<NetState<String>> requestFlow(@NotNull String url, @NotNull String method, @Nullable Map<String, String> header, @Nullable String userAgent, @Nullable String cookie, @Nullable Map<String, String> body, boolean followRedirect) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        if (url.length() == 0) {
            WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
            if (!webCacheLog.getCanLog()) {
                return null;
            }
            webCacheLog.e(getName(), "Cannot start network request, because url is empty.");
            return null;
        }
        HttpRequest httpRequest = new HttpRequest(url);
        httpRequest.setMethod(method);
        httpRequest.setHeader(header);
        httpRequest.setUserAgent(userAgent);
        httpRequest.setCookies(cookie);
        httpRequest.setBody(body);
        httpRequest.setAllowRedirect(followRedirect);
        return httpRequest.connectFlow();
    }
}
