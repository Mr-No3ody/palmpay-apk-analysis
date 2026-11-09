package com.palmpay.lib.webview.container.fast.loader;

import com.palmpay.lib.webview.container.fast.offline.CacheRequest;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class SourceRequest {
    private boolean cacheable;
    private Map<String, String> headers;
    private String url;
    private String userAgent;
    private int webViewCache;

    public SourceRequest(CacheRequest cacheRequest, boolean z3) {
        this.cacheable = z3;
        this.url = cacheRequest.getUrl();
        this.headers = cacheRequest.getHeaders();
        this.userAgent = cacheRequest.getUserAgent();
        this.webViewCache = cacheRequest.getWebViewCacheMode();
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUserAgent() {
        return this.userAgent;
    }

    public int getWebViewCache() {
        return this.webViewCache;
    }

    public boolean isCacheable() {
        return this.cacheable;
    }

    public void setCacheable(boolean z3) {
        this.cacheable = z3;
    }

    public void setHeaders(Map<String, String> map) {
        this.headers = map;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setUserAgent(String str) {
        this.userAgent = str;
    }

    public void setWebViewCache(int i7) {
        this.webViewCache = i7;
    }
}
