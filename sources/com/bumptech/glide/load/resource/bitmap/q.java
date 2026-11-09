package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f20944a = new p();

    public static C1331c a(BitmapPool bitmapPool, Drawable drawable, int i7, int i10) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z3 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i7 != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i10 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i7 = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i10 = current.getIntrinsicHeight();
                    }
                    Lock lock = B.f20894d;
                    lock.lock();
                    Bitmap bitmap2 = bitmapPool.get(i7, i10, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmap2);
                        current.setBounds(0, 0, i7, i10);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = bitmap2;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    current.toString();
                }
                z3 = true;
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                current.toString();
            }
            bitmap = null;
            z3 = true;
        }
        if (!z3) {
            bitmapPool = f20944a;
        }
        return C1331c.a(bitmapPool, bitmap);
    }
}
