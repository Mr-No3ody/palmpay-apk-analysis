package Z2;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import p213o2.e;

/* JADX INFO: loaded from: classes.dex */
public final class c implements CacheKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M2.a f11503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11504b;

    public c(M2.a aVar, int i7) {
        this.f11503a = aVar;
        this.f11504b = i7;
    }

    @Override // com.facebook.cache.common.CacheKey
    public final boolean containsUri(Uri uri) {
        return this.f11503a.containsUri(uri);
    }

    @Override // com.facebook.cache.common.CacheKey
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f11504b == cVar.f11504b && this.f11503a.equals(cVar.f11503a);
    }

    @Override // com.facebook.cache.common.CacheKey
    public final String getUriString() {
        return null;
    }

    @Override // com.facebook.cache.common.CacheKey
    public final int hashCode() {
        return (this.f11503a.hashCode() * 1013) + this.f11504b;
    }

    @Override // com.facebook.cache.common.CacheKey
    public final boolean isResourceIdForDebugging() {
        return false;
    }

    @Override // com.facebook.cache.common.CacheKey
    public final String toString() {
        androidx.camera.video.internal.c cVarM = e.m(this);
        cVarM.c(this.f11503a, "imageCacheKey");
        cVarM.a(this.f11504b, "frameIndex");
        return cVarM.toString();
    }
}
