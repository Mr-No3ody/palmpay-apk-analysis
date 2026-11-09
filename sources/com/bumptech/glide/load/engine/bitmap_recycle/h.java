package com.bumptech.glide.load.engine.bitmap_recycle;

import J1.o;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class h implements BitmapPool {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Bitmap.Config f20590g = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f20591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f20592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f20594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f20595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f20596f;

    public h(long j6) {
        k kVar = new k();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i7 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i7 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f20593c = j6;
        this.f20595e = j6;
        this.f20591a = kVar;
        this.f20592b = setUnmodifiableSet;
        this.f20594d = new g();
    }

    public final synchronized Bitmap a(int i7, int i10, Bitmap.Config config) {
        Bitmap bitmap;
        try {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmap = this.f20591a.get(i7, i10, config != null ? config : f20590g);
            if (bitmap != null) {
                long j6 = this.f20596f;
                this.f20591a.getClass();
                this.f20596f = j6 - ((long) o.c(bitmap));
                this.f20594d.getClass();
                bitmap.setHasAlpha(true);
                bitmap.setPremultiplied(true);
            } else if (Log.isLoggable("LruBitmapPool", 3)) {
                this.f20591a.logBitmap(i7, i10, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f20591a.logBitmap(i7, i10, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.f20591a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmap;
    }

    public final synchronized void b(long j6) {
        while (this.f20596f > j6) {
            Bitmap bitmapRemoveLast = this.f20591a.removeLast();
            if (bitmapRemoveLast == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Objects.toString(this.f20591a);
                }
                this.f20596f = 0L;
                return;
            }
            this.f20594d.getClass();
            long j10 = this.f20596f;
            this.f20591a.getClass();
            this.f20596f = j10 - ((long) o.c(bitmapRemoveLast));
            if (Log.isLoggable("LruBitmapPool", 3)) {
                this.f20591a.logBitmap(bitmapRemoveLast);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.f20591a);
            }
            bitmapRemoveLast.recycle();
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final void clearMemory() {
        b(0L);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final Bitmap get(int i7, int i10, Bitmap.Config config) {
        Bitmap bitmapA = a(i7, i10, config);
        if (bitmapA != null) {
            bitmapA.eraseColor(0);
            return bitmapA;
        }
        if (config == null) {
            config = f20590g;
        }
        return Bitmap.createBitmap(i7, i10, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final Bitmap getDirty(int i7, int i10, Bitmap.Config config) {
        Bitmap bitmapA = a(i7, i10, config);
        if (bitmapA != null) {
            return bitmapA;
        }
        if (config == null) {
            config = f20590g;
        }
        return Bitmap.createBitmap(i7, i10, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final long getMaxSize() {
        return this.f20595e;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final synchronized void put(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f20591a.getClass();
                if (o.c(bitmap) <= this.f20595e && this.f20592b.contains(bitmap.getConfig())) {
                    this.f20591a.getClass();
                    int iC = o.c(bitmap);
                    this.f20591a.put(bitmap);
                    this.f20594d.getClass();
                    this.f20596f += (long) iC;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        this.f20591a.logBitmap(bitmap);
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Objects.toString(this.f20591a);
                    }
                    b(this.f20595e);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f20591a.logBitmap(bitmap);
                bitmap.isMutable();
                this.f20592b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final synchronized void setSizeMultiplier(float f10) {
        long jRound = Math.round(this.f20593c * f10);
        this.f20595e = jRound;
        b(jRound);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public final void trimMemory(int i7) {
        if (i7 >= 40 || i7 >= 20) {
            clearMemory();
        } else if (i7 >= 20 || i7 == 15) {
            b(this.f20595e / 2);
        }
    }
}
