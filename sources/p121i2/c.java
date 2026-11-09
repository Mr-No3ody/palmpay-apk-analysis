package p121i2;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c implements CacheKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f37412a;

    public c(ArrayList arrayList) {
        this.f37412a = arrayList;
    }

    @Override // com.facebook.cache.common.CacheKey
    public final boolean containsUri(Uri uri) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f37412a;
            if (i7 >= arrayList.size()) {
                return false;
            }
            if (((CacheKey) arrayList.get(i7)).containsUri(uri)) {
                return true;
            }
            i7++;
        }
    }

    @Override // com.facebook.cache.common.CacheKey
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return this.f37412a.equals(((c) obj).f37412a);
        }
        return false;
    }

    @Override // com.facebook.cache.common.CacheKey
    public final String getUriString() {
        return ((CacheKey) this.f37412a.get(0)).getUriString();
    }

    @Override // com.facebook.cache.common.CacheKey
    public final int hashCode() {
        return this.f37412a.hashCode();
    }

    @Override // com.facebook.cache.common.CacheKey
    public final boolean isResourceIdForDebugging() {
        return false;
    }

    @Override // com.facebook.cache.common.CacheKey
    public final String toString() {
        return "MultiCacheKey:" + this.f37412a.toString();
    }
}
