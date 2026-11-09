package p061e3;

import He.a;
import android.net.Uri;
import android.os.StrictMode;
import androidx.work.impl.model.b;
import com.facebook.cache.common.CacheKey;
import com.facebook.callercontext.CallerContextVerifier;
import com.facebook.common.internal.Supplier;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.core.DiskCachesStore;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.producers.E;
import com.facebook.imagepipeline.producers.Producer;
import com.facebook.imagepipeline.producers.i0;
import com.facebook.imagepipeline.request.e;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import p122i3.c;
import p122i3.d;
import p355xf.l;
import p360y2.g;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final CancellationException f36030l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final CancellationException f36031m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f36032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Supplier f36033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Supplier f36034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f36035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f36036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f36037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f36038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CacheKeyFactory f36039h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicLong f36040i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CallerContextVerifier f36041j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o f36042k;

    static {
        new j(null);
        f36030l = new CancellationException("Prefetching is not enabled");
        new CancellationException("ImageRequest is null");
        f36031m = new CancellationException("Modified URL is null");
    }

    public k(x producerSequenceFactory, Set requestListeners, Set requestListener2s, Supplier isPrefetchEnabledSupplier, b bitmapMemoryCache, b encodedMemoryCache, Supplier diskCachesStoreSupplier, CacheKeyFactory cacheKeyFactory, a threadHandoffProducerQueue, Q2.a suppressBitmapPrefetchingSupplier, Q2.a lazyDataSource, CallerContextVerifier callerContextVerifier, o config) {
        Intrinsics.checkNotNullParameter(producerSequenceFactory, "producerSequenceFactory");
        Intrinsics.checkNotNullParameter(requestListeners, "requestListeners");
        Intrinsics.checkNotNullParameter(requestListener2s, "requestListener2s");
        Intrinsics.checkNotNullParameter(isPrefetchEnabledSupplier, "isPrefetchEnabledSupplier");
        Intrinsics.checkNotNullParameter(bitmapMemoryCache, "bitmapMemoryCache");
        Intrinsics.checkNotNullParameter(encodedMemoryCache, "encodedMemoryCache");
        Intrinsics.checkNotNullParameter(diskCachesStoreSupplier, "diskCachesStoreSupplier");
        Intrinsics.checkNotNullParameter(cacheKeyFactory, "cacheKeyFactory");
        Intrinsics.checkNotNullParameter(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        Intrinsics.checkNotNullParameter(suppressBitmapPrefetchingSupplier, "suppressBitmapPrefetchingSupplier");
        Intrinsics.checkNotNullParameter(lazyDataSource, "lazyDataSource");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f36032a = producerSequenceFactory;
        this.f36033b = isPrefetchEnabledSupplier;
        this.f36034c = diskCachesStoreSupplier;
        this.f36035d = new d(requestListeners);
        this.f36036e = new c(requestListener2s);
        this.f36040i = new AtomicLong();
        this.f36037f = bitmapMemoryCache;
        this.f36038g = encodedMemoryCache;
        this.f36039h = cacheKeyFactory;
        this.f36041j = callerContextVerifier;
        this.f36042k = config;
    }

    public final p360y2.b a(com.facebook.imagepipeline.request.d dVar, Object obj) {
        return b(dVar, obj, null, null, null);
    }

    public final p360y2.b b(com.facebook.imagepipeline.request.d imageRequest, Object obj, com.facebook.imagepipeline.request.c cVar, RequestListener requestListener, String str) {
        if (imageRequest == null) {
            g gVarZ = com.palmpay.lib.apm.launchcounter.util.d.z(new NullPointerException());
            Intrinsics.checkNotNullExpressionValue(gVarZ, "immediateFailedDataSource(...)");
            return gVarZ;
        }
        try {
            x xVar = this.f36032a;
            xVar.getClass();
            Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
            p181m3.a.a();
            Producer producerC = xVar.c(imageRequest);
            if (imageRequest.getPostprocessor() != null) {
                producerC = xVar.f(producerC);
            }
            Producer producer = producerC;
            if (cVar == null) {
                cVar = com.facebook.imagepipeline.request.c.FULL_FETCH;
            }
            return f(producer, imageRequest, cVar, obj, requestListener, str);
        } catch (Exception e10) {
            return com.palmpay.lib.apm.launchcounter.util.d.z(e10);
        }
    }

    public final d c(com.facebook.imagepipeline.request.d dVar, RequestListener requestListener) {
        if (dVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        d dVar2 = this.f36035d;
        if (requestListener == null) {
            return dVar.getRequestListener() == null ? dVar2 : new d(dVar2, dVar.getRequestListener());
        }
        return dVar.getRequestListener() == null ? new d(dVar2, requestListener) : new d(dVar2, requestListener, dVar.getRequestListener());
    }

    public final boolean d(Uri uri, com.facebook.imagepipeline.request.b bVar) {
        boolean zC;
        e eVarD = e.d(uri);
        eVarD.f21670g = bVar;
        com.facebook.imagepipeline.request.d imageRequest = eVarD.a();
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        Object obj = this.f36034c.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        DiskCachesStore diskCachesStore = (DiskCachesStore) obj;
        CacheKey encodedCacheKey = this.f36039h.getEncodedCacheKey(imageRequest, null);
        com.facebook.imagepipeline.request.b cacheChoice = imageRequest.getCacheChoice();
        Intrinsics.checkNotNullExpressionValue(cacheChoice, "getCacheChoice(...)");
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            int iOrdinal = cacheChoice.ordinal();
            if (iOrdinal == 0) {
                p045d3.d smallImageBufferedDiskCache = diskCachesStore.getSmallImageBufferedDiskCache();
                Intrinsics.e(encodedCacheKey);
                zC = smallImageBufferedDiskCache.c(encodedCacheKey);
            } else if (iOrdinal == 1) {
                p045d3.d mainBufferedDiskCache = diskCachesStore.getMainBufferedDiskCache();
                Intrinsics.e(encodedCacheKey);
                zC = mainBufferedDiskCache.c(encodedCacheKey);
            } else {
                if (iOrdinal != 2) {
                    throw new l();
                }
                zC = e(imageRequest);
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return zC;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e(com.facebook.imagepipeline.request.d dVar) {
        Object obj = this.f36034c.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        DiskCachesStore diskCachesStore = (DiskCachesStore) obj;
        CacheKey encodedCacheKey = this.f36039h.getEncodedCacheKey(dVar, null);
        String diskCacheId = dVar.getDiskCacheId();
        if (diskCacheId != null) {
            p045d3.d dVar2 = (p045d3.d) diskCachesStore.getDynamicBufferedDiskCaches().get(diskCacheId);
            if (dVar2 == null) {
                return false;
            }
            Intrinsics.e(encodedCacheKey);
            return dVar2.c(encodedCacheKey);
        }
        Iterator it = diskCachesStore.getDynamicBufferedDiskCaches().entrySet().iterator();
        while (it.hasNext()) {
            p045d3.d dVar3 = (p045d3.d) ((Map.Entry) it.next()).getValue();
            Intrinsics.e(encodedCacheKey);
            if (dVar3.c(encodedCacheKey)) {
                return true;
            }
        }
        return false;
    }

    public final p360y2.b f(Producer producer, com.facebook.imagepipeline.request.d dVar, com.facebook.imagepipeline.request.c cVar, Object obj, RequestListener requestListener, String str) {
        p181m3.a.a();
        E e10 = new E(c(dVar, requestListener), this.f36036e);
        CallerContextVerifier callerContextVerifier = this.f36041j;
        if (callerContextVerifier != null) {
            callerContextVerifier.verifyCallerContext(obj, false);
        }
        try {
            com.facebook.imagepipeline.request.c lowestPermittedRequestLevel = dVar.getLowestPermittedRequestLevel();
            com.facebook.imagepipeline.request.c cVar2 = lowestPermittedRequestLevel.f21663a > cVar.f21663a ? lowestPermittedRequestLevel : cVar;
            Intrinsics.checkNotNullExpressionValue(cVar2, "getMax(...)");
            i0 i0Var = new i0(dVar, String.valueOf(this.f36040i.getAndIncrement()), str, e10, obj, cVar2, false, dVar.getProgressiveRenderingEnabled() || !p333w2.a.c(dVar.getSourceUri()), dVar.getPriority(), this.f36042k);
            p181m3.a.a();
            p076f3.b bVar = new p076f3.b(producer, i0Var, e10);
            p181m3.a.a();
            return bVar;
        } catch (Exception e11) {
            return com.palmpay.lib.apm.launchcounter.util.d.z(e11);
        }
    }

    public final DataSource g(Producer producer, com.facebook.imagepipeline.request.d dVar, Object obj) {
        com.facebook.imagepipeline.request.c cVar = com.facebook.imagepipeline.request.c.FULL_FETCH;
        com.facebook.imagepipeline.common.e eVar = com.facebook.imagepipeline.common.e.f21429c;
        E e10 = new E(c(dVar, null), this.f36036e);
        CallerContextVerifier callerContextVerifier = this.f36041j;
        if (callerContextVerifier != null) {
            callerContextVerifier.verifyCallerContext(obj, true);
        }
        Uri uri = dVar.getSourceUri();
        Intrinsics.checkNotNullExpressionValue(uri, "getSourceUri(...)");
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (uri == null) {
            g gVarZ = com.palmpay.lib.apm.launchcounter.util.d.z(f36031m);
            Intrinsics.checkNotNullExpressionValue(gVarZ, "immediateFailedDataSource(...)");
            return gVarZ;
        }
        if (!uri.equals(uri)) {
            e eVarB = e.b(dVar);
            eVarB.f21664a = uri;
            dVar = eVarB.a();
        }
        com.facebook.imagepipeline.request.d dVar2 = dVar;
        try {
            com.facebook.imagepipeline.request.c lowestPermittedRequestLevel = dVar2.getLowestPermittedRequestLevel();
            com.facebook.imagepipeline.request.c cVar2 = lowestPermittedRequestLevel.f21663a > 1 ? lowestPermittedRequestLevel : cVar;
            Intrinsics.checkNotNullExpressionValue(cVar2, "getMax(...)");
            String strValueOf = String.valueOf(this.f36040i.getAndIncrement());
            this.f36042k.getClass();
            return p076f3.d.f36380j.create(producer, new i0(dVar2, strValueOf, null, e10, obj, cVar2, true, false, eVar, this.f36042k), e10);
        } catch (Exception e11) {
            return com.palmpay.lib.apm.launchcounter.util.d.z(e11);
        }
    }
}
