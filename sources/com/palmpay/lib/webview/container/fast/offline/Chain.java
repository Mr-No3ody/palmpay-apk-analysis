package com.palmpay.lib.webview.container.fast.offline;

import com.palmpay.lib.webview.container.fast.WebResource;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class Chain {
    private int mIndex = -1;
    private final List<ResourceInterceptor> mInterceptors;
    private CacheRequest mRequest;

    public Chain(List<ResourceInterceptor> list) {
        this.mInterceptors = list;
    }

    public CacheRequest getRequest() {
        return this.mRequest;
    }

    public WebResource process(CacheRequest cacheRequest) {
        int i7 = this.mIndex + 1;
        this.mIndex = i7;
        if (i7 >= this.mInterceptors.size()) {
            return null;
        }
        this.mRequest = cacheRequest;
        return this.mInterceptors.get(this.mIndex).load(this);
    }
}
