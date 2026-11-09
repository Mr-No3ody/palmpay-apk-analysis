package com.palmpay.lib.webview.container.fast;

import com.palmpay.lib.webview.container.fast.config.CacheConfig;
import com.palmpay.lib.webview.container.fast.config.FastCacheMode;
import com.palmpay.lib.webview.container.fast.offline.ResourceInterceptor;

/* JADX INFO: loaded from: classes3.dex */
public interface FastOpenApi {
    void addResourceInterceptor(ResourceInterceptor resourceInterceptor);

    void setCacheMode(FastCacheMode fastCacheMode, CacheConfig cacheConfig);
}
