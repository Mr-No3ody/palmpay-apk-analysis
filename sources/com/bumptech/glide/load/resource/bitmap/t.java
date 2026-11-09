package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class t extends AbstractC1332d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f20947b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(Key.f20507a);

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1332d
    public final Bitmap a(BitmapPool bitmapPool, Bitmap bitmap, int i7, int i10) {
        return B.b(bitmapPool, bitmap, i7, i10);
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        return obj instanceof t;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return 1572326941;
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f20947b);
    }
}
