package M2;

import C0.G;
import android.net.Uri;
import com.facebook.cache.common.CacheKey;

/* JADX INFO: loaded from: classes.dex */
public final class a implements CacheKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5739b;

    public a(int i7, boolean z3) {
        this.f5738a = G.m(i7, "anim://");
        this.f5739b = z3;
    }

    @Override // com.facebook.cache.common.CacheKey
    public final boolean containsUri(Uri uri) {
        return uri.toString().startsWith(this.f5738a);
    }

    @Override // com.facebook.cache.common.CacheKey
    public final boolean equals(Object obj) {
        if (!this.f5739b) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        return this.f5738a.equals(((a) obj).f5738a);
    }

    @Override // com.facebook.cache.common.CacheKey
    public final String getUriString() {
        return this.f5738a;
    }

    @Override // com.facebook.cache.common.CacheKey
    public final int hashCode() {
        return !this.f5739b ? super.hashCode() : this.f5738a.hashCode();
    }

    @Override // com.facebook.cache.common.CacheKey
    public final boolean isResourceIdForDebugging() {
        return false;
    }
}
