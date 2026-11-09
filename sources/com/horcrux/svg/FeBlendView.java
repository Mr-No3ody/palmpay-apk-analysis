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
class FeBlendView extends FilterPrimitiveView {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f23269f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f23270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f23271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EnumC1407d f23272e;

    @Override // com.horcrux.svg.FilterPrimitiveView
    public final Bitmap b(HashMap map, Bitmap bitmap) {
        Bitmap bitmapC = FilterPrimitiveView.c(map, bitmap, this.f23270c);
        Bitmap bitmapC2 = FilterPrimitiveView.c(map, bitmap, this.f23271d);
        if (this.f23272e == EnumC1407d.MULTIPLY) {
            return CustomFilter.apply(bitmapC, bitmapC2, new C1405b());
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapC.getWidth(), bitmapC.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        canvas.drawBitmap(bitmapC, 0.0f, 0.0f, paint);
        int iOrdinal = this.f23272e.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        } else if (iOrdinal == 3) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
        } else if (iOrdinal == 4) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DARKEN));
        } else if (iOrdinal == 5) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
        }
        canvas.drawBitmap(bitmapC2, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }
}
