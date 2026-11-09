package com.palmpay.lib.webview.container.fast.offline;

import android.webkit.WebResourceResponse;

/* JADX INFO: loaded from: classes3.dex */
public interface OfflineServer {
    void addResourceInterceptor(ResourceInterceptor resourceInterceptor);

    void destroy();

    WebResourceResponse get(CacheRequest cacheRequest);
}
