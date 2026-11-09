package com.airbnb.lottie.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Matrix f20269a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Hg.c f20270b = new Hg.c(5);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Hg.c f20271c = new Hg.c(6);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Hg.c f20272d = new Hg.c(7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Hg.c f20273e = new Hg.c(8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f20274f = (float) (Math.sqrt(2.0d) / 2.0d);

    public static void a(Path path, float f10, float f11, float f12) {
        PathMeasure pathMeasure = (PathMeasure) f20270b.get();
        Path path2 = (Path) f20271c.get();
        Path path3 = (Path) f20272d.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (!(f10 == 1.0f && f11 == 0.0f) && length >= 1.0f && Math.abs((f11 - f10) - 1.0f) >= 0.01d) {
            float f13 = f10 * length;
            float f14 = f11 * length;
            float f15 = f12 * length;
            float fMin = Math.min(f13, f14) + f15;
            float fMax = Math.max(f13, f14) + f15;
            if (fMin >= length && fMax >= length) {
                fMin = g.d(fMin, length);
                fMax = g.d(fMax, length);
            }
            if (fMin < 0.0f) {
                fMin = g.d(fMin, length);
            }
            if (fMax < 0.0f) {
                fMax = g.d(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                return;
            }
            if (fMin >= fMax) {
                fMin -= length;
            }
            path2.reset();
            pathMeasure.getSegment(fMin, fMax, path2, true);
            if (fMax > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, fMax % length, path3, true);
                path2.addPath(path3);
            } else if (fMin < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(fMin + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
        }
    }

    public static void b(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static float c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static Bitmap d(Bitmap bitmap, int i7, int i10) {
        if (bitmap.getWidth() == i7 && bitmap.getHeight() == i10) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i7, i10, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }
}
