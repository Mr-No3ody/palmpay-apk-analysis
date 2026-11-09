package com.palmpay.lib.webview.container.fast.offline;

import android.content.Context;
import android.webkit.WebResourceResponse;
import com.palmpay.lib.webview.container.fast.WebResource;
import com.palmpay.lib.webview.container.fast.config.CacheConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class OfflineServerImpl implements OfflineServer {
    private List<ResourceInterceptor> mBaseInterceptorList;
    private CacheConfig mCacheConfig;
    private Context mContext;
    private List<ResourceInterceptor> mDefaultModeChainList;
    private List<ResourceInterceptor> mForceModeChainList;
    private WebResourceResponseGenerator mResourceResponseGenerator = new DefaultWebResponseGenerator();

    public OfflineServerImpl(Context context, CacheConfig cacheConfig) {
        this.mContext = context.getApplicationContext();
        this.mCacheConfig = cacheConfig;
    }

    private List<ResourceInterceptor> buildDefaultModeChain(Context context) {
        if (this.mDefaultModeChainList == null) {
            ArrayList arrayList = new ArrayList(getBaseInterceptorsCount() + 1);
            List<ResourceInterceptor> list = this.mBaseInterceptorList;
            if (list != null && !list.isEmpty()) {
                arrayList.addAll(this.mBaseInterceptorList);
            }
            arrayList.add(new DefaultRemoteResourceInterceptor());
            this.mDefaultModeChainList = arrayList;
        }
        return this.mDefaultModeChainList;
    }

    private List<ResourceInterceptor> buildForceModeChain(Context context, CacheConfig cacheConfig) {
        if (this.mForceModeChainList == null) {
            ArrayList arrayList = new ArrayList(getBaseInterceptorsCount() + 3);
            List<ResourceInterceptor> list = this.mBaseInterceptorList;
            if (list != null && !list.isEmpty()) {
                arrayList.addAll(this.mBaseInterceptorList);
            }
            arrayList.add(MemResourceInterceptor.getInstance(cacheConfig));
            arrayList.add(new DiskResourceInterceptor(cacheConfig));
            arrayList.add(new ForceRemoteResourceInterceptor(cacheConfig));
            this.mForceModeChainList = arrayList;
        }
        return this.mForceModeChainList;
    }

    private WebResource callChain(List<ResourceInterceptor> list, CacheRequest cacheRequest) {
        return new Chain(list).process(cacheRequest);
    }

    private void destroyAll(List<ResourceInterceptor> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (ResourceInterceptor resourceInterceptor : list) {
            if (resourceInterceptor instanceof Destroyable) {
                ((Destroyable) resourceInterceptor).destroy();
            }
        }
    }

    private int getBaseInterceptorsCount() {
        List<ResourceInterceptor> list = this.mBaseInterceptorList;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.palmpay.lib.webview.container.fast.offline.OfflineServer
    public synchronized void addResourceInterceptor(ResourceInterceptor resourceInterceptor) {
        try {
            if (this.mBaseInterceptorList == null) {
                this.mBaseInterceptorList = new ArrayList();
            }
            this.mBaseInterceptorList.add(resourceInterceptor);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.palmpay.lib.webview.container.fast.offline.OfflineServer
    public synchronized void destroy() {
        destroyAll(this.mDefaultModeChainList);
        destroyAll(this.mForceModeChainList);
    }

    @Override // com.palmpay.lib.webview.container.fast.offline.OfflineServer
    public WebResourceResponse get(CacheRequest cacheRequest) {
        boolean zIsForceMode = cacheRequest.isForceMode();
        Context context = this.mContext;
        return this.mResourceResponseGenerator.generate(callChain(zIsForceMode ? buildForceModeChain(context, this.mCacheConfig) : buildDefaultModeChain(context), cacheRequest), cacheRequest.getMime());
    }
}
