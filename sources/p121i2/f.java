package p121i2;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;

/* JADX INFO: loaded from: classes.dex */
public final class f implements CacheKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37418a;

    public f(String str) {
        str.getClass();
        this.f37418a = str;
    }

    @Override // com.facebook.cache.common.CacheKey
    public final boolean containsUri(Uri uri) {
        return this.f37418a.contains(uri.toString());
    }

    @Override // com.facebook.cache.common.CacheKey
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return this.f37418a.equals(((f) obj).f37418a);
        }
        return false;
    }

    @Override // com.facebook.cache.common.CacheKey
    public final String getUriString() {
        return this.f37418a;
    }

    @Override // com.facebook.cache.common.CacheKey
    public final int hashCode() {
        return this.f37418a.hashCode();
    }

    @Override // com.facebook.cache.common.CacheKey
    public final boolean isResourceIdForDebugging() {
        return false;
    }

    @Override // com.facebook.cache.common.CacheKey
    public final String toString() {
        return this.f37418a;
    }
}
