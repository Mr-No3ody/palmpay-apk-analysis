package p061e3;

import com.facebook.cache.disk.FileCache;
import com.facebook.imagepipeline.core.DiskCachesStore;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p213o2.d;
import p355xf.C2131j;
import p355xf.EnumC2132k;

/* JADX INFO: loaded from: classes.dex */
public final class g implements DiskCachesStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f36011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f36012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f36013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f36014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f36015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f36016f;

    public g(h hVar) {
        EnumC2132k enumC2132k = EnumC2132k.f43969a;
        this.f36011a = C2131j.a(enumC2132k, new e(hVar, 1));
        this.f36012b = C2131j.a(enumC2132k, new f(this, hVar, 0));
        this.f36013c = C2131j.a(enumC2132k, new e(hVar, 2));
        this.f36014d = C2131j.a(enumC2132k, new f(this, hVar, 1));
        this.f36015e = C2131j.a(enumC2132k, new f(hVar, this));
        this.f36016f = C2131j.a(enumC2132k, new f(this, hVar, 3));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.facebook.imagepipeline.core.DiskCachesStore
    public final d getDynamicBufferedDiskCaches() {
        Object value = this.f36016f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.facebook.imagepipeline.core.DiskCachesStore
    public final Map getDynamicFileCaches() {
        return (Map) this.f36015e.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.facebook.imagepipeline.core.DiskCachesStore
    public final p045d3.d getMainBufferedDiskCache() {
        return (p045d3.d) this.f36012b.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.facebook.imagepipeline.core.DiskCachesStore
    public final FileCache getMainFileCache() {
        return (FileCache) this.f36011a.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.facebook.imagepipeline.core.DiskCachesStore
    public final p045d3.d getSmallImageBufferedDiskCache() {
        return (p045d3.d) this.f36014d.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.facebook.imagepipeline.core.DiskCachesStore
    public final FileCache getSmallImageFileCache() {
        return (FileCache) this.f36013c.getValue();
    }
}
