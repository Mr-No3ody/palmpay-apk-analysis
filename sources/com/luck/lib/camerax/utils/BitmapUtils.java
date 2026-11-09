package com.luck.lib.camerax.utils;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes3.dex */
public class BitmapUtils {
    public static int computeSize(int i7, int i10) {
        if (i7 % 2 == 1) {
            i7++;
        }
        if (i10 % 2 == 1) {
            i10++;
        }
        int iMax = Math.max(i7, i10);
        float fMin = Math.min(i7, i10) / iMax;
        if (fMin > 1.0f || fMin <= 0.5625d) {
            double d2 = fMin;
            if (d2 > 0.5625d || d2 <= 0.5d) {
                return (int) Math.ceil(((double) iMax) / (1280.0d / d2));
            }
            int i11 = iMax / 1280;
            if (i11 == 0) {
                return 1;
            }
            return i11;
        }
        if (iMax < 1664) {
            return 1;
        }
        if (iMax < 4990) {
            return 2;
        }
        if (iMax <= 4990 || iMax >= 10240) {
            return iMax / 1280;
        }
        return 4;
    }

    public static Bitmap toHorizontalMirror(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(-1.0f, 1.0f);
        matrix.postRotate(width > height ? 90.0f : 0.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }
}
