package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Paint;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC1332d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f20919b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(Key.f20507a);

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1332d
    public final Bitmap a(BitmapPool bitmapPool, Bitmap bitmap, int i7, int i10) {
        Paint paint = B.f20891a;
        return (bitmap.getWidth() > i7 || bitmap.getHeight() > i10) ? B.b(bitmapPool, bitmap, i7, i10) : bitmap;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        return obj instanceof h;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return -670243078;
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f20919b);
    }
}
