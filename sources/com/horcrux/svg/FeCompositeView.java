package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
class FeCompositeView extends FilterPrimitiveView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f23276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f23277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f23278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f23279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f23280g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f23281i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public EnumC1409f f23282j;

    @Override // com.horcrux.svg.FilterPrimitiveView
    public final Bitmap b(HashMap map, Bitmap bitmap) {
        Bitmap bitmapC = FilterPrimitiveView.c(map, bitmap, this.f23276c);
        Bitmap bitmapC2 = FilterPrimitiveView.c(map, bitmap, this.f23277d);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapC.getWidth(), bitmapC.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        canvas.drawBitmap(bitmapC, 0.0f, 0.0f, paint);
        int iOrdinal = this.f23282j.ordinal();
        if (iOrdinal == 0) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        } else if (iOrdinal == 1) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        } else if (iOrdinal == 2) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else if (iOrdinal == 3) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
        } else if (iOrdinal == 4) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
        } else if (iOrdinal == 5) {
            int height = bitmapCreateBitmap.getHeight() * bitmapCreateBitmap.getWidth();
            int[] iArr = new int[height];
            bitmapCreateBitmap.getPixels(iArr, 0, bitmapCreateBitmap.getWidth(), 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
            int width = bitmapCreateBitmap.getWidth();
            int width2 = bitmapCreateBitmap.getWidth();
            int height2 = bitmapCreateBitmap.getHeight();
            int[] iArr2 = new int[height];
            bitmapC2.getPixels(iArr2, 0, width, 0, 0, width2, height2);
            int i7 = 0;
            while (i7 < height) {
                int i10 = iArr[i7];
                int i11 = iArr2[i7];
                int i12 = height;
                int[] iArr3 = iArr2;
                float f10 = this.f23278e;
                float f11 = (i10 >> 16) & 255;
                float f12 = (i11 >> 16) & 255;
                float f13 = f10 * f11 * f12;
                float f14 = this.f23279f;
                float f15 = (f11 * f14) + f13;
                float f16 = this.f23280g;
                float f17 = (f12 * f16) + f15;
                float f18 = this.f23281i;
                int i13 = (int) (f17 + f18);
                float f19 = (i10 >> 8) & 255;
                float f20 = (i11 >> 8) & 255;
                int i14 = (int) ((f20 * f16) + (f19 * f14) + (f10 * f19 * f20) + f18);
                float f21 = i10 & 255;
                float f22 = i11 & 255;
                int i15 = (int) ((f22 * f16) + (f21 * f14) + (f10 * f21 * f22) + f18);
                float f23 = i10 >>> 24;
                float f24 = i11 >>> 24;
                int i16 = (int) ((f16 * f24) + (f23 * f14) + (f10 * f23 * f24) + f18);
                iArr[i7] = (Math.min(255, Math.max(0, i13)) << 16) | (Math.min(255, Math.max(0, i16)) << 24) | (Math.min(255, Math.max(0, i14)) << 8) | Math.min(255, Math.max(0, i15));
                i7++;
                height = i12;
                iArr2 = iArr3;
            }
            int width3 = bitmapCreateBitmap.getWidth();
            int width4 = bitmapCreateBitmap.getWidth();
            bitmapCreateBitmap = bitmapCreateBitmap;
            bitmapCreateBitmap.setPixels(iArr, 0, width3, 0, 0, width4, bitmapCreateBitmap.getHeight());
        }
        if (this.f23282j != EnumC1409f.ARITHMETIC) {
            canvas.drawBitmap(bitmapC2, 0.0f, 0.0f, paint);
        }
        return bitmapCreateBitmap;
    }
}
