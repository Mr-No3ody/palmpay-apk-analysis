package com.bumptech.glide.request;

import com.bumptech.glide.load.a;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.u;

/* JADX INFO: loaded from: classes.dex */
public interface ResourceCallback {
    Object getLock();

    void onLoadFailed(u uVar);

    void onResourceReady(Resource<?> resource, a aVar, boolean z3);
}
