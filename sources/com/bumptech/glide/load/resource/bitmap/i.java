package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractC1332d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f20920b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(Key.f20507a);

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1332d
    public final Bitmap a(BitmapPool bitmapPool, Bitmap bitmap, int i7, int i10) {
        Paint paint = B.f20891a;
        int iMin = Math.min(i7, i10);
        float f10 = iMin;
        float f11 = f10 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f10 / width, f10 / height);
        float f12 = width * fMax;
        float f13 = fMax * height;
        float f14 = (f10 - f12) / 2.0f;
        float f15 = (f10 - f13) / 2.0f;
        RectF rectF = new RectF(f14, f15, f12 + f14, f13 + f15);
        Bitmap bitmapC = B.c(bitmapPool, bitmap);
        Bitmap bitmap2 = bitmapPool.get(iMin, iMin, B.d(bitmap));
        bitmap2.setHasAlpha(true);
        Lock lock = B.f20894d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawCircle(f11, f11, f11, B.f20892b);
            canvas.drawBitmap(bitmapC, (Rect) null, rectF, B.f20893c);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapC.equals(bitmap)) {
                bitmapPool.put(bitmapC);
            }
            return bitmap2;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        return obj instanceof i;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return 1101716364;
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f20920b);
    }
}
