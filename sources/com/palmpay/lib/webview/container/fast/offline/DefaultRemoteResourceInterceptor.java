package com.palmpay.lib.webview.container.fast.offline;

import com.palmpay.lib.webview.container.fast.WebResource;
import com.palmpay.lib.webview.container.fast.loader.OkHttpResourceLoader;
import com.palmpay.lib.webview.container.fast.loader.ResourceLoader;
import com.palmpay.lib.webview.container.fast.loader.SourceRequest;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultRemoteResourceInterceptor implements ResourceInterceptor {
    private ResourceLoader mResourceLoader = new OkHttpResourceLoader();

    @Override // com.palmpay.lib.webview.container.fast.offline.ResourceInterceptor
    public WebResource load(Chain chain) {
        CacheRequest request = chain.getRequest();
        WebResource resource = this.mResourceLoader.getResource(new SourceRequest(request, true));
        return resource != null ? resource : chain.process(request);
    }

    @Override // com.palmpay.lib.webview.container.fast.offline.ResourceInterceptor
    public void prepare(String str, boolean z3) {
    }
}
