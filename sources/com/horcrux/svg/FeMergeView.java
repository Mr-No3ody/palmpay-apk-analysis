package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.bridge.ReadableArray;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
class FeMergeView extends FilterPrimitiveView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ReadableArray f23289c;

    @Override // com.horcrux.svg.FilterPrimitiveView
    public final Bitmap b(HashMap map, Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int size = this.f23289c.size();
        for (int i7 = 0; i7 < size; i7++) {
            String string = this.f23289c.getString(i7);
            Bitmap bitmap2 = string.isEmpty() ? bitmap : (Bitmap) map.get(string);
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, new Paint());
            }
        }
        return bitmapCreateBitmap;
    }
}
