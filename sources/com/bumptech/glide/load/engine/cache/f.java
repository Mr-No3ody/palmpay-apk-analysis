package com.bumptech.glide.load.engine.cache;

import J1.k;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.Resource;

/* JADX INFO: loaded from: classes.dex */
public final class f extends k implements MemoryCache {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MemoryCache.ResourceRemovedListener f20627e;

    @Override // J1.k
    public final int b(Object obj) {
        Resource resource = (Resource) obj;
        if (resource == null) {
            return 1;
        }
        return resource.getSize();
    }

    @Override // J1.k
    public final void c(Object obj, Object obj2) {
        Resource<?> resource = (Resource) obj2;
        MemoryCache.ResourceRemovedListener resourceRemovedListener = this.f20627e;
        if (resourceRemovedListener == null || resource == null) {
            return;
        }
        resourceRemovedListener.onResourceRemoved(resource);
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    public final Resource remove(Key key) {
        Object obj;
        synchronized (this) {
            J1.j jVar = (J1.j) this.f4468a.remove(key);
            if (jVar == null) {
                obj = null;
            } else {
                this.f4471d -= (long) jVar.f4467b;
                obj = jVar.f4466a;
            }
        }
        return (Resource) obj;
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    public final void setResourceRemovedListener(MemoryCache.ResourceRemovedListener resourceRemovedListener) {
        this.f20627e = resourceRemovedListener;
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache
    public final void trimMemory(int i7) {
        if (i7 >= 40) {
            clearMemory();
        } else if (i7 >= 20 || i7 == 15) {
            e(getMaxSize() / 2);
        }
    }
}
