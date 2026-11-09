package com.palmpay.lib.webview.container.fast.offline;

import android.text.TextUtils;
import com.palmpay.lib.webview.container.fast.WebResource;
import com.palmpay.lib.webview.container.fast.config.CacheConfig;
import com.palmpay.lib.webview.container.fast.config.MimeTypeFilter;
import com.palmpay.lib.webview.container.fast.loader.OkHttpResourceLoader;
import com.palmpay.lib.webview.container.fast.loader.ResourceLoader;
import com.palmpay.lib.webview.container.fast.loader.SourceRequest;

/* JADX INFO: loaded from: classes3.dex */
public class ForceRemoteResourceInterceptor implements Destroyable, ResourceInterceptor {
    private final MimeTypeFilter mMimeTypeFilter;
    private final ResourceLoader mResourceLoader = new OkHttpResourceLoader();

    public ForceRemoteResourceInterceptor(CacheConfig cacheConfig) {
        this.mMimeTypeFilter = cacheConfig != null ? cacheConfig.getFilter() : null;
    }

    private boolean isFilterHtml() {
        return this.mMimeTypeFilter.isFilter("text/html");
    }

    @Override // com.palmpay.lib.webview.container.fast.offline.Destroyable
    public void destroy() {
        MimeTypeFilter mimeTypeFilter = this.mMimeTypeFilter;
        if (mimeTypeFilter != null) {
            mimeTypeFilter.clear();
        }
    }

    @Override // com.palmpay.lib.webview.container.fast.offline.ResourceInterceptor
    public WebResource load(Chain chain) {
        CacheRequest request = chain.getRequest();
        String mime = request.getMime();
        WebResource resource = this.mResourceLoader.getResource(new SourceRequest(request, TextUtils.isEmpty(mime) ? isFilterHtml() : this.mMimeTypeFilter.isFilter(mime)));
        return resource != null ? resource : chain.process(request);
    }

    @Override // com.palmpay.lib.webview.container.fast.offline.ResourceInterceptor
    public void prepare(String str, boolean z3) {
    }
}
