package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import android.util.DisplayMetrics;
import java.io.File;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class h implements MemorySizeCalculator$ScreenDimensions, DiskLruCacheFactory$CacheDirectoryGetter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20634b;

    public /* synthetic */ h(Object obj, int i7) {
        this.f20633a = i7;
        this.f20634b = obj;
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskLruCacheFactory$CacheDirectoryGetter
    public File getCacheDirectory() {
        switch (this.f20633a) {
            case 2:
                return new File((String) this.f20634b);
            default:
                File cacheDir = ((Context) this.f20634b).getCacheDir();
                if (cacheDir == null) {
                    return null;
                }
                return new File(cacheDir, "image_manager_disk_cache");
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.MemorySizeCalculator$ScreenDimensions
    public int getHeightPixels() {
        return ((DisplayMetrics) this.f20634b).heightPixels;
    }

    @Override // com.bumptech.glide.load.engine.cache.MemorySizeCalculator$ScreenDimensions
    public int getWidthPixels() {
        return ((DisplayMetrics) this.f20634b).widthPixels;
    }

    public h() {
        this.f20633a = 1;
        this.f20634b = new ArrayDeque();
    }
}
