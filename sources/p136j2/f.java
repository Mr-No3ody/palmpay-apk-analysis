package p136j2;

import com.facebook.cache.common.CacheEvent;
import com.facebook.cache.common.CacheKey;
import java.io.IOException;
import p121i2.b;

/* JADX INFO: loaded from: classes.dex */
public final class f implements CacheEvent {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f38198i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static f f38199j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f38200k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CacheKey f38201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f38202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f38203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f38204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f38205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public IOException f38206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f38207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f38208h;

    public static f a() {
        synchronized (f38198i) {
            try {
                f fVar = f38199j;
                if (fVar == null) {
                    return new f();
                }
                f38199j = fVar.f38208h;
                fVar.f38208h = null;
                f38200k--;
                return fVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (f38198i) {
            try {
                int i7 = f38200k;
                if (i7 < 5) {
                    this.f38201a = null;
                    this.f38202b = null;
                    this.f38203c = 0L;
                    this.f38204d = 0L;
                    this.f38205e = 0L;
                    this.f38206f = null;
                    this.f38207g = null;
                    f38200k = i7 + 1;
                    f fVar = f38199j;
                    if (fVar != null) {
                        this.f38208h = fVar;
                    }
                    f38199j = this;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.facebook.cache.common.CacheEvent
    public final CacheKey getCacheKey() {
        return this.f38201a;
    }

    @Override // com.facebook.cache.common.CacheEvent
    public final long getCacheLimit() {
        return this.f38204d;
    }

    @Override // com.facebook.cache.common.CacheEvent
    public final long getCacheSize() {
        return this.f38205e;
    }

    @Override // com.facebook.cache.common.CacheEvent
    public final b getEvictionReason() {
        return this.f38207g;
    }

    @Override // com.facebook.cache.common.CacheEvent
    public final IOException getException() {
        return this.f38206f;
    }

    @Override // com.facebook.cache.common.CacheEvent
    public final long getItemSize() {
        return this.f38203c;
    }

    @Override // com.facebook.cache.common.CacheEvent
    public final String getResourceId() {
        return this.f38202b;
    }
}
