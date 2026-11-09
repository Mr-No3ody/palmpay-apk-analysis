package p061e3;

import Ab.r;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import com.adjust.sdk.Constants;
import com.facebook.callercontext.CallerContextVerifier;
import com.facebook.common.executors.SerialExecutorService;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.imagepipeline.cache.BitmapMemoryCacheFactory;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.CountingMemoryCache;
import com.facebook.imagepipeline.cache.ImageCacheStatsTracker;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.cache.c;
import com.facebook.imagepipeline.cache.g;
import com.facebook.imagepipeline.core.ExecutorSupplier;
import com.facebook.imagepipeline.core.ImagePipelineConfigInterface;
import com.facebook.imagepipeline.debug.CloseableReferenceLeakTracker;
import com.facebook.imagepipeline.debug.a;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.decoder.ProgressiveJpegConfig;
import com.facebook.imagepipeline.producers.D;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.imagepipeline.transcoder.ImageTranscoderFactory;
import java.util.Map;
import java.util.Set;
import kotlin.collections.B;
import kotlin.jvm.internal.Intrinsics;
import org.sufficientlysecure.htmltextview.l;
import p045d3.f;
import p045d3.h;
import p045d3.j;
import p136j2.b;
import p137j3.v;
import p137j3.w;
import p137j3.x;
import p213o2.e;

/* JADX INFO: loaded from: classes.dex */
public final class o implements ImagePipelineConfigInterface {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final m f36052D = new m(null);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static n f36053E = new n();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f36054A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final a f36055B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final c f36056C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap.Config f36057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f36058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.facebook.imagepipeline.cache.a f36059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f36060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p045d3.g f36061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f36062f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f36063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f36064h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h f36065i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f36066j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j f36067k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageTranscoderFactory f36068l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Q2.a f36069m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Q2.a f36070n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f36071o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p262r2.c f36072p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f36073q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final NetworkFetcher f36074r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w f36075s;
    public final l t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Set f36076u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final B f36077v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final B f36078w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f36079x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b f36080y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final r f36081z;

    public o(l lVar) {
        p045d3.g gVar;
        j jVar;
        p181m3.a.a();
        p pVar = lVar.f36049g;
        pVar.getClass();
        r rVar = new r(pVar);
        this.f36081z = rVar;
        Object systemService = lVar.f36043a.getSystemService("activity");
        if (systemService == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f36058b = new f((ActivityManager) systemService);
        this.f36059c = new com.facebook.imagepipeline.cache.a();
        this.f36060d = new g();
        this.f36057a = Bitmap.Config.ARGB_8888;
        synchronized (p045d3.g.class) {
            try {
                if (p045d3.g.f35507b == null) {
                    p045d3.g.f35507b = new p045d3.g(0);
                }
                gVar = p045d3.g.f35507b;
            } catch (Throwable th) {
                throw th;
            }
        }
        Intrinsics.checkNotNullExpressionValue(gVar, "getInstance(...)");
        this.f36061e = gVar;
        Context context = lVar.f36043a;
        if (context == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f36062f = context;
        this.f36063g = lVar.f36044b;
        this.f36065i = new h();
        synchronized (j.class) {
            try {
                if (j.f35515b == null) {
                    j.f35515b = new j(0);
                }
                jVar = j.f35515b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Intrinsics.checkNotNullExpressionValue(jVar, "getInstance(...)");
        this.f36067k = jVar;
        Q2.a BOOLEAN_FALSE = e.f40019b;
        Intrinsics.checkNotNullExpressionValue(BOOLEAN_FALSE, "BOOLEAN_FALSE");
        this.f36069m = BOOLEAN_FALSE;
        m mVar = f36052D;
        this.f36068l = mVar.getImageTranscoderFactory(lVar);
        Q2.a BOOLEAN_TRUE = e.f40018a;
        Intrinsics.checkNotNullExpressionValue(BOOLEAN_TRUE, "BOOLEAN_TRUE");
        this.f36070n = BOOLEAN_TRUE;
        b defaultMainDiskCacheConfig = mVar.getDefaultMainDiskCacheConfig(lVar.f36043a);
        this.f36071o = defaultMainDiskCacheConfig;
        p262r2.c cVarA = p262r2.c.a();
        Intrinsics.checkNotNullExpressionValue(cVarA, "getInstance(...)");
        this.f36072p = cVarA;
        this.f36073q = mVar.getMemoryChunkType(lVar, rVar);
        int i7 = lVar.f36048f;
        i7 = i7 < 0 ? Constants.CONNECTION_TIMEOUT_VERIFY : i7;
        p181m3.a.a();
        NetworkFetcher networkFetcher = lVar.f36045c;
        this.f36074r = networkFetcher == null ? new D(i7) : networkFetcher;
        v vVar = new v(new org.sufficientlysecure.htmltextview.o(9));
        this.f36075s = new w(vVar);
        this.t = new l(9);
        Set set = lVar.f36046d;
        this.f36076u = set == null ? B.f38895a : set;
        B b7 = B.f38895a;
        this.f36077v = b7;
        this.f36078w = b7;
        this.f36079x = lVar.f36047e;
        this.f36080y = defaultMainDiskCacheConfig;
        this.f36066j = new d(((x) vVar.f38262e).f38280d);
        this.f36054A = lVar.f36050h;
        this.f36055B = lVar.f36051i;
        this.f36056C = new c();
        p166l2.a aVar = new p166l2.a(9);
        r rVar2 = new r(17, false);
        rVar2.f139b = aVar;
        this.f36064h = new h(rVar2, this);
        p181m3.a.a();
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final MemoryCache getBitmapCacheOverride() {
        return null;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final Bitmap.Config getBitmapConfig() {
        return this.f36057a;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final CountingMemoryCache.EntryStateObserver getBitmapMemoryCacheEntryStateObserver() {
        return null;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final BitmapMemoryCacheFactory getBitmapMemoryCacheFactory() {
        return this.f36056C;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final Supplier getBitmapMemoryCacheParamsSupplier() {
        return this.f36058b;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final MemoryCache.CacheTrimStrategy getBitmapMemoryCacheTrimStrategy() {
        return this.f36059c;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final CacheKeyFactory getCacheKeyFactory() {
        return this.f36061e;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final CallerContextVerifier getCallerContextVerifier() {
        return null;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final CloseableReferenceLeakTracker getCloseableReferenceLeakTracker() {
        return this.f36055B;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final Context getContext() {
        return this.f36062f;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final Set getCustomProducerSequenceFactories() {
        return this.f36078w;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final Supplier getDiskCachesStoreSupplier() {
        return this.f36064h;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final i getDownsampleMode() {
        return this.f36063g;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final Map getDynamicDiskCacheConfigMap() {
        return null;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final Supplier getEnableEncodedImageColorSpaceUsage() {
        return this.f36069m;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final MemoryCache getEncodedMemoryCacheOverride() {
        return null;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final Supplier getEncodedMemoryCacheParamsSupplier() {
        return this.f36065i;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final MemoryCache.CacheTrimStrategy getEncodedMemoryCacheTrimStrategy() {
        return this.f36060d;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final SerialExecutorService getExecutorServiceForAnimatedImages() {
        return null;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final ExecutorSupplier getExecutorSupplier() {
        return this.f36066j;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final r getExperiments() {
        return this.f36081z;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final ImageCacheStatsTracker getImageCacheStatsTracker() {
        return this.f36067k;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final ImageDecoder getImageDecoder() {
        return null;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final g3.b getImageDecoderConfig() {
        return null;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final ImageTranscoderFactory getImageTranscoderFactory() {
        return this.f36068l;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final Integer getImageTranscoderType() {
        return null;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final b getMainDiskCacheConfig() {
        return this.f36071o;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final int getMemoryChunkType() {
        return this.f36073q;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final MemoryTrimmableRegistry getMemoryTrimmableRegistry() {
        return this.f36072p;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final NetworkFetcher getNetworkFetcher() {
        return this.f36074r;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final p032c3.b getPlatformBitmapFactory() {
        return null;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final w getPoolFactory() {
        return this.f36075s;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final ProgressiveJpegConfig getProgressiveJpegConfig() {
        return this.t;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final Set getRequestListener2s() {
        return this.f36077v;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final Set getRequestListeners() {
        return this.f36076u;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final b getSmallImageDiskCacheConfig() {
        return this.f36080y;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final boolean isDiskCacheEnabled() {
        return this.f36054A;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final Supplier isPrefetchEnabledSupplier() {
        return this.f36070n;
    }

    @Override // com.facebook.imagepipeline.core.ImagePipelineConfigInterface
    public final boolean isResizeAndRotateEnabledForNetwork() {
        return this.f36079x;
    }
}
