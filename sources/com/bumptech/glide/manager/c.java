package com.bumptech.glide.manager;

import android.app.Activity;
import android.content.Context;
import com.bumptech.glide.p;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c implements FrameWaiter, Lifecycle, RequestManagerTreeNode, RequestManagerRetriever$RequestManagerFactory {
    @Override // com.bumptech.glide.manager.Lifecycle
    public void addListener(LifecycleListener lifecycleListener) {
        lifecycleListener.onStart();
    }

    @Override // com.bumptech.glide.manager.RequestManagerRetriever$RequestManagerFactory
    public p build(com.bumptech.glide.b bVar, Lifecycle lifecycle, RequestManagerTreeNode requestManagerTreeNode, Context context) {
        return new p(bVar, lifecycle, requestManagerTreeNode, context);
    }

    @Override // com.bumptech.glide.manager.RequestManagerTreeNode
    public Set getDescendants() {
        return Collections.EMPTY_SET;
    }

    @Override // com.bumptech.glide.manager.FrameWaiter
    public void registerSelf(Activity activity) {
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public void removeListener(LifecycleListener lifecycleListener) {
    }
}
