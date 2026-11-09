package p061e3;

import Ab.r;
import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.cache.ImageCacheStatsTracker;
import com.facebook.imagepipeline.core.DiskCachesStore;
import com.facebook.imagepipeline.core.ExecutorSupplier;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p045d3.j;
import p136j2.b;
import p137j3.w;
import p355xf.C2131j;
import p355xf.EnumC2132k;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f36017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f36018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorSupplier f36019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageCacheStatsTracker f36020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f36021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f36022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f36023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f36024h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f36025i;

    public h(r fileCacheFactory, o config) {
        Intrinsics.checkNotNullParameter(fileCacheFactory, "fileCacheFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(fileCacheFactory, "fileCacheFactory");
        w poolFactory = config.f36075s;
        Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
        d executorSupplier = config.f36066j;
        Intrinsics.checkNotNullParameter(executorSupplier, "executorSupplier");
        j imageCacheStatsTracker = config.f36067k;
        Intrinsics.checkNotNullParameter(imageCacheStatsTracker, "imageCacheStatsTracker");
        b mainDiskCacheConfig = config.f36071o;
        Intrinsics.checkNotNullParameter(mainDiskCacheConfig, "mainDiskCacheConfig");
        b smallImageDiskCacheConfig = config.f36080y;
        Intrinsics.checkNotNullParameter(smallImageDiskCacheConfig, "smallImageDiskCacheConfig");
        this.f36017a = fileCacheFactory;
        this.f36018b = poolFactory;
        this.f36019c = executorSupplier;
        this.f36020d = imageCacheStatsTracker;
        this.f36021e = config.f36073q;
        this.f36022f = mainDiskCacheConfig;
        this.f36023g = smallImageDiskCacheConfig;
        this.f36024h = null;
        this.f36025i = C2131j.a(EnumC2132k.f43969a, new e(this, 0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.facebook.common.internal.Supplier
    public final Object get() {
        return (DiskCachesStore) this.f36025i.getValue();
    }
}
