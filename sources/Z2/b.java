package Z2;

import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.cache.CountingMemoryCache;

/* JADX INFO: loaded from: classes.dex */
public final class b implements CountingMemoryCache.EntryStateObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f11502a;

    public b(d dVar) {
        this.f11502a = dVar;
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache.EntryStateObserver
    public final void onExclusivityChanged(Object obj, boolean z3) {
        CacheKey cacheKey = (CacheKey) obj;
        d dVar = this.f11502a;
        synchronized (dVar) {
            try {
                if (z3) {
                    dVar.f11508d.add(cacheKey);
                } else {
                    dVar.f11508d.remove(cacheKey);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
