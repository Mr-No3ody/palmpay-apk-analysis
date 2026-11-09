package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Paint f20891a = new Paint(6);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Paint f20892b = new Paint(7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Paint f20893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Lock f20894d;

    static {
        f20894d = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079")).contains(Build.MODEL) ? new ReentrantLock() : new A();
        Paint paint = new Paint(7);
        f20893c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static void a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f20894d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f20891a);
            canvas.setBitmap(null);
        } finally {
            lock.unlock();
        }
    }

    public static Bitmap b(BitmapPool bitmapPool, Bitmap bitmap, int i7, int i10) {
        if (bitmap.getWidth() != i7 || bitmap.getHeight() != i10) {
            float fMin = Math.min(i7 / bitmap.getWidth(), i10 / bitmap.getHeight());
            int iRound = Math.round(bitmap.getWidth() * fMin);
            int iRound2 = Math.round(bitmap.getHeight() * fMin);
            if (bitmap.getWidth() != iRound || bitmap.getHeight() != iRound2) {
                Bitmap bitmap2 = bitmapPool.get((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
                bitmap2.setHasAlpha(bitmap.hasAlpha());
                if (Log.isLoggable("TransformationUtils", 2)) {
                    bitmap.getWidth();
                    bitmap.getHeight();
                    bitmap2.getWidth();
                    bitmap2.getHeight();
                }
                Matrix matrix = new Matrix();
                matrix.setScale(fMin, fMin);
                a(bitmap, bitmap2, matrix);
                return bitmap2;
            }
        }
        return bitmap;
    }

    public static Bitmap c(BitmapPool bitmapPool, Bitmap bitmap) {
        Bitmap.Config configD = d(bitmap);
        if (configD.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmap2 = bitmapPool.get(bitmap.getWidth(), bitmap.getHeight(), configD);
        new Canvas(bitmap2).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmap2;
    }

    public static Bitmap.Config d(Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
    }
}
