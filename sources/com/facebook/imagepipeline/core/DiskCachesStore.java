package com.facebook.imagepipeline.core;

import com.facebook.cache.disk.FileCache;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p213o2.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\bR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/facebook/imagepipeline/core/DiskCachesStore;", "", "Lcom/facebook/cache/disk/FileCache;", "getMainFileCache", "()Lcom/facebook/cache/disk/FileCache;", "mainFileCache", "Ld3/d;", "getMainBufferedDiskCache", "()Ld3/d;", "mainBufferedDiskCache", "getSmallImageFileCache", "smallImageFileCache", "getSmallImageBufferedDiskCache", "smallImageBufferedDiskCache", "", "", "getDynamicFileCaches", "()Ljava/util/Map;", "dynamicFileCaches", "Lo2/d;", "getDynamicBufferedDiskCaches", "()Lo2/d;", "dynamicBufferedDiskCaches", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DiskCachesStore {
    @NotNull
    d getDynamicBufferedDiskCaches();

    @NotNull
    Map<String, FileCache> getDynamicFileCaches();

    @NotNull
    p045d3.d getMainBufferedDiskCache();

    @NotNull
    FileCache getMainFileCache();

    @NotNull
    p045d3.d getSmallImageBufferedDiskCache();

    @NotNull
    FileCache getSmallImageFileCache();
}
