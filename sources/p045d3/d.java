package p045d3;

import androidx.work.impl.D;
import bolts.Task;
import com.facebook.binaryresource.BinaryResource;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.disk.FileCache;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.cache.ImageCacheStatsTracker;
import com.transsnet.adsdk.b;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import p109h3.e;
import p229p2.a;
import p262r2.g;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Class f35494h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileCache f35495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PooledByteBufferFactory f35496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f35497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f35498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f35499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageCacheStatsTracker f35500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f35501g;

    static {
        new c(null);
        f35494h = d.class;
    }

    public d(FileCache fileCache, PooledByteBufferFactory pooledByteBufferFactory, g pooledByteStreams, Executor readExecutor, Executor writeExecutor, ImageCacheStatsTracker imageCacheStatsTracker) {
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
        Intrinsics.checkNotNullParameter(pooledByteStreams, "pooledByteStreams");
        Intrinsics.checkNotNullParameter(readExecutor, "readExecutor");
        Intrinsics.checkNotNullParameter(writeExecutor, "writeExecutor");
        Intrinsics.checkNotNullParameter(imageCacheStatsTracker, "imageCacheStatsTracker");
        this.f35495a = fileCache;
        this.f35496b = pooledByteBufferFactory;
        this.f35497c = pooledByteStreams;
        this.f35498d = readExecutor;
        this.f35499e = writeExecutor;
        this.f35500f = imageCacheStatsTracker;
        k kVar = new k(0, (char) 0);
        kVar.f35518b = new HashMap();
        Intrinsics.checkNotNullExpressionValue(kVar, "getInstance(...)");
        this.f35501g = kVar;
    }

    public static void a(d this$0, CacheKey key, e eVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        try {
            this$0.f(key, eVar);
            Intrinsics.e(eVar);
            this$0.f35501g.m(key, eVar);
            eVar.close();
        } catch (Throwable th) {
            try {
                Intrinsics.checkNotNullParameter(th, "th");
                throw th;
            } catch (Throwable th2) {
                k kVar = this$0.f35501g;
                Intrinsics.e(eVar);
                kVar.m(key, eVar);
                eVar.close();
                throw th2;
            }
        }
    }

    public final void b() {
        this.f35501g.a();
        try {
            Task.call(new androidx.webkit.internal.e(this, 5), this.f35499e);
        } catch (Exception e10) {
            a.r(f35494h, e10, "Failed to schedule disk-cache clear", new Object[0]);
            Task.forError(e10);
        }
    }

    public final boolean c(CacheKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(key, "key");
        k kVar = this.f35501g;
        synchronized (kVar) {
            if (((HashMap) kVar.f35518b).containsKey(key)) {
                e eVar = (e) ((HashMap) kVar.f35518b).get(key);
                synchronized (eVar) {
                    if (e.j(eVar)) {
                        return true;
                    }
                    ((HashMap) kVar.f35518b).remove(key);
                    a.u(k.class, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(eVar)), key.getUriString(), Integer.valueOf(System.identityHashCode(key)));
                }
            }
            if (this.f35495a.hasKeySync(key)) {
                return true;
            }
            e eVarD = this.f35501g.d(key);
            ImageCacheStatsTracker imageCacheStatsTracker = this.f35500f;
            Class cls = f35494h;
            if (eVarD != null) {
                eVarD.close();
                a.o(cls, "Found image for %s in staging area", key.getUriString());
                imageCacheStatsTracker.onStagingAreaHit(key);
                return true;
            }
            a.o(cls, "Did not find image for %s in staging area", key.getUriString());
            imageCacheStatsTracker.onStagingAreaMiss(key);
            try {
                return this.f35495a.hasKey(key);
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public final PooledByteBuffer d(CacheKey cacheKey) throws IOException {
        Class cls = f35494h;
        ImageCacheStatsTracker imageCacheStatsTracker = this.f35500f;
        try {
            a.o(cls, "Disk cache read for %s", cacheKey.getUriString());
            BinaryResource resource = this.f35495a.getResource(cacheKey);
            if (resource == null) {
                a.o(cls, "Disk cache miss for %s", cacheKey.getUriString());
                imageCacheStatsTracker.onDiskCacheMiss(cacheKey);
                return null;
            }
            a.o(cls, "Found entry in disk cache for %s", cacheKey.getUriString());
            imageCacheStatsTracker.onDiskCacheHit(cacheKey);
            InputStream inputStreamOpenStream = resource.openStream();
            try {
                PooledByteBuffer pooledByteBufferNewByteBuffer = this.f35496b.newByteBuffer(inputStreamOpenStream, (int) resource.size());
                inputStreamOpenStream.close();
                a.o(cls, "Successful read from disk cache for %s", cacheKey.getUriString());
                return pooledByteBufferNewByteBuffer;
            } catch (Throwable th) {
                inputStreamOpenStream.close();
                throw th;
            }
        } catch (IOException e10) {
            a.r(cls, e10, "Exception reading from cache for %s", cacheKey.getUriString());
            imageCacheStatsTracker.onDiskCacheGetFail(cacheKey);
            throw e10;
        }
    }

    public final void e(CacheKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f35501g.l(key);
        try {
            Task.call(new D(5, this, key), this.f35499e);
        } catch (Exception e10) {
            a.r(f35494h, e10, "Failed to schedule disk-cache remove for %s", key.getUriString());
            Task.forError(e10);
        }
    }

    public final void f(CacheKey cacheKey, e eVar) {
        String uriString = cacheKey.getUriString();
        Class cls = f35494h;
        a.o(cls, "About to write to disk-cache for key %s", uriString);
        try {
            this.f35495a.insert(cacheKey, new b(7, eVar, this));
            this.f35500f.onDiskCachePut(cacheKey);
            a.o(cls, "Successful disk-cache write for key %s", cacheKey.getUriString());
        } catch (IOException e10) {
            a.r(cls, e10, "Failed to write to disk-cache for key %s", cacheKey.getUriString());
        }
    }
}
