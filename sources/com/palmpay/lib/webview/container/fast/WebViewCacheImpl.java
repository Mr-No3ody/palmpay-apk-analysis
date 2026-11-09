package com.palmpay.lib.webview.container.fast;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.palmpay.lib.webview.container.fast.config.CacheConfig;
import com.palmpay.lib.webview.container.fast.config.FastCacheMode;
import com.palmpay.lib.webview.container.fast.offline.CacheRequest;
import com.palmpay.lib.webview.container.fast.offline.OfflineServer;
import com.palmpay.lib.webview.container.fast.offline.OfflineServerImpl;
import com.palmpay.lib.webview.container.fast.offline.ResourceInterceptor;
import com.palmpay.lib.webview.container.fast.utils.MimeTypeMapUtils;

/* JADX INFO: loaded from: classes3.dex */
public class WebViewCacheImpl implements WebViewCache {
    private CacheConfig mCacheConfig;
    private Context mContext;
    private FastCacheMode mFastCacheMode;
    private OfflineServer mOfflineServer;

    public WebViewCacheImpl(Context context) {
        this.mContext = context;
    }

    private CacheConfig generateDefaultCacheConfig() {
        return new CacheConfig.Builder(this.mContext).build();
    }

    private CacheConfig getCacheConfig() {
        CacheConfig cacheConfig = this.mCacheConfig;
        return cacheConfig != null ? cacheConfig : generateDefaultCacheConfig();
    }

    private synchronized OfflineServer getOfflineServer() {
        try {
            if (this.mOfflineServer == null) {
                this.mOfflineServer = new OfflineServerImpl(this.mContext, getCacheConfig());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.mOfflineServer;
    }

    @Override // com.palmpay.lib.webview.container.fast.FastOpenApi
    public void addResourceInterceptor(ResourceInterceptor resourceInterceptor) {
        getOfflineServer().addResourceInterceptor(resourceInterceptor);
    }

    @Override // com.palmpay.lib.webview.container.fast.offline.Destroyable
    public void destroy() {
        OfflineServer offlineServer = this.mOfflineServer;
        if (offlineServer != null) {
            offlineServer.destroy();
        }
        this.mCacheConfig = null;
        this.mOfflineServer = null;
        this.mContext = null;
    }

    @Override // com.palmpay.lib.webview.container.fast.WebViewCache
    public WebResourceResponse getResource(WebResourceRequest webResourceRequest, int i7, String str) {
        if (this.mFastCacheMode == FastCacheMode.DEFAULT) {
            throw new IllegalStateException("an error occurred.");
        }
        String string = webResourceRequest.getUrl().toString();
        String mimeTypeFromExtension = MimeTypeMapUtils.getMimeTypeFromExtension(MimeTypeMapUtils.getFileExtensionFromUrl(string));
        CacheRequest cacheRequest = new CacheRequest();
        cacheRequest.setUrl(string);
        cacheRequest.setMime(mimeTypeFromExtension);
        cacheRequest.setForceMode(this.mFastCacheMode == FastCacheMode.FORCE);
        cacheRequest.setUserAgent(str);
        cacheRequest.setWebViewCacheMode(i7);
        cacheRequest.setHeaders(webResourceRequest.getRequestHeaders());
        return getOfflineServer().get(cacheRequest);
    }

    @Override // com.palmpay.lib.webview.container.fast.FastOpenApi
    public void setCacheMode(FastCacheMode fastCacheMode, CacheConfig cacheConfig) {
        this.mFastCacheMode = fastCacheMode;
        this.mCacheConfig = cacheConfig;
    }
}
