package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1335g extends AbstractC1332d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f20918b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(Key.f20507a);

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1332d
    public final Bitmap a(BitmapPool bitmapPool, Bitmap bitmap, int i7, int i10) {
        float width;
        float height;
        Paint paint = B.f20891a;
        if (bitmap.getWidth() == i7 && bitmap.getHeight() == i10) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i10 > bitmap.getHeight() * i7) {
            width = i10 / bitmap.getHeight();
            width2 = (i7 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i7 / bitmap.getWidth();
            height = (i10 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmap2 = bitmapPool.get(i7, i10, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmap2.setHasAlpha(bitmap.hasAlpha());
        B.a(bitmap, bitmap2, matrix);
        return bitmap2;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        return obj instanceof C1335g;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return -599754482;
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f20918b);
    }
}
