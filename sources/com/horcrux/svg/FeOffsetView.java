package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
class FeOffsetView extends FilterPrimitiveView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f23290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1420q f23291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C1420q f23292e;

    @Override // com.horcrux.svg.FilterPrimitiveView
    public final Bitmap b(HashMap map, Bitmap bitmap) {
        Bitmap bitmapC = FilterPrimitiveView.c(map, bitmap, this.f23290c);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        C1420q c1420q = this.f23291d;
        float fRelativeOnWidth = c1420q != null ? (float) relativeOnWidth(c1420q) : 0.0f;
        C1420q c1420q2 = this.f23292e;
        RectF rectF = new RectF(0.0f, 0.0f, fRelativeOnWidth, c1420q2 != null ? (float) relativeOnHeight(c1420q2) : 0.0f);
        getSvgView().getCtm().mapRect(rectF);
        float fWidth = rectF.left;
        if (fWidth >= 0.0f) {
            fWidth = rectF.width();
        }
        float fHeight = rectF.top;
        if (fHeight >= 0.0f) {
            fHeight = rectF.height();
        }
        canvas.drawBitmap(bitmapC, fWidth, fHeight, (Paint) null);
        return bitmapCreateBitmap;
    }
}
