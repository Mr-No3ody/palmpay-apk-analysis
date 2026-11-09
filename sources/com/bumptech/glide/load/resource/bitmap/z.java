package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes.dex */
public final class z extends AbstractC1332d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f20971c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(Key.f20507a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20972b;

    public z(int i7) {
        J1.g.a(i7 > 0, "roundingRadius must be greater than 0.");
        this.f20972b = i7;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1332d
    public final Bitmap a(BitmapPool bitmapPool, Bitmap bitmap, int i7, int i10) {
        Paint paint = B.f20891a;
        int i11 = this.f20972b;
        J1.g.a(i11 > 0, "roundingRadius must be greater than 0.");
        Bitmap.Config configD = B.d(bitmap);
        Bitmap bitmapC = B.c(bitmapPool, bitmap);
        Bitmap bitmap2 = bitmapPool.get(bitmapC.getWidth(), bitmapC.getHeight(), configD);
        bitmap2.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapC, tileMode, tileMode);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap2.getWidth(), bitmap2.getHeight());
        Lock lock = B.f20894d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f10 = i11;
            canvas.drawRoundRect(rectF, f10, f10, paint2);
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
        return (obj instanceof z) && this.f20972b == ((z) obj).f20972b;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return J1.o.g(-569625254, J1.o.g(this.f20972b, 17));
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f20971c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f20972b).array());
    }
}
