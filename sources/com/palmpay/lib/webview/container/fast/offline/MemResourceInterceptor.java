package com.palmpay.lib.webview.container.fast.offline;

import android.text.TextUtils;
import android.util.LruCache;
import com.google.common.net.HttpHeaders;
import com.palmpay.lib.webview.container.fast.WebResource;
import com.palmpay.lib.webview.container.fast.config.CacheConfig;
import com.palmpay.lib.webview.container.fast.utils.HeaderUtils;
import com.palmpay.lib.webview.container.fast.utils.LogUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class MemResourceInterceptor extends CacheResourceInterceptor implements Destroyable {
    private static volatile MemResourceInterceptor sInstance;
    private final CacheConfig mCacheConfig;
    private LruCache<String, WebResource> mLruCache;

    public static class ResourceMemCache extends LruCache<String, WebResource> {
        public ResourceMemCache(int i7) {
            super(i7);
        }

        @Override // android.util.LruCache
        public int sizeOf(String str, WebResource webResource) {
            if (webResource == null || webResource.getOriginBytes() == null) {
                return 0;
            }
            return webResource.getOriginBytes().length;
        }
    }

    public MemResourceInterceptor(CacheConfig cacheConfig) {
        int memCacheSize = cacheConfig.getMemCacheSize();
        if (memCacheSize > 0) {
            this.mLruCache = new ResourceMemCache(memCacheSize);
        }
        this.mCacheConfig = cacheConfig;
    }

    private boolean checkResourceValid(WebResource webResource) {
        return (webResource == null || webResource.getOriginBytes() == null || webResource.getOriginBytes().length < 0 || webResource.getResponseHeaders() == null || webResource.getResponseHeaders().isEmpty()) ? false : true;
    }

    public static MemResourceInterceptor getInstance(CacheConfig cacheConfig) {
        if (sInstance == null) {
            synchronized (MemResourceInterceptor.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new MemResourceInterceptor(cacheConfig);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    private boolean isRealMimeTypeCacheable(WebResource webResource) {
        String str;
        if (webResource == null) {
            return false;
        }
        Map<String, String> responseHeaders = webResource.getResponseHeaders();
        if (responseHeaders != null) {
            String str2 = responseHeaders.containsKey(HttpHeaders.CONTENT_TYPE) ? responseHeaders.get(HttpHeaders.CONTENT_TYPE) : responseHeaders.get(HttpHeaders.CONTENT_TYPE.toLowerCase());
            if (TextUtils.isEmpty(str2)) {
                str = null;
            } else {
                String[] strArrSplit = str2.split(";");
                if (strArrSplit.length >= 1) {
                    str = strArrSplit[0];
                } else {
                    str = null;
                }
            }
        } else {
            str = null;
        }
        return (str == null || this.mCacheConfig.getFilter().isFilter(str)) ? false : true;
    }

    @Override // com.palmpay.lib.webview.container.fast.offline.Destroyable
    public void destroy() {
        LruCache<String, WebResource> lruCache = this.mLruCache;
        if (lruCache != null) {
            lruCache.evictAll();
        }
    }

    @Override // com.palmpay.lib.webview.container.fast.offline.ResourceInterceptor
    public WebResource load(Chain chain) {
        CacheRequest request = chain.getRequest();
        LruCache<String, WebResource> lruCache = this.mLruCache;
        if (lruCache != null) {
            WebResource webResource = lruCache.get(request.getKey());
            if (checkResourceValid(webResource)) {
                webResource.getResponseHeaders().put(HeaderUtils.HEADER_CACHE_SOURCE, "file");
                LogUtils.d("mem cache hit: " + request.getUrl());
                webResource.setCacheMode(1);
                return webResource;
            }
        }
        WebResource webResourceProcess = chain.process(request);
        if (this.mLruCache != null && checkResourceValid(webResourceProcess) && webResourceProcess.isCacheable() && isRealMimeTypeCacheable(webResourceProcess)) {
            this.mLruCache.put(request.getKey(), webResourceProcess);
        }
        return webResourceProcess;
    }

    @Override // com.palmpay.lib.webview.container.fast.offline.ResourceInterceptor
    public void prepare(String str, boolean z3) {
        if (!z3 || this.mLruCache == null) {
            return;
        }
        LogUtils.d("mem cache remove: " + str);
        this.mLruCache.remove(CacheRequest.generateKey(str));
    }
}
