package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1332d implements Transformation {
    public abstract Bitmap a(BitmapPool bitmapPool, Bitmap bitmap, int i7, int i10);

    @Override // com.bumptech.glide.load.Transformation
    public final Resource transform(Context context, Resource resource, int i7, int i10) {
        if (!J1.o.i(i7, i10)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i7 + " or height: " + i10 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        BitmapPool bitmapPool = com.bumptech.glide.b.b(context).f20434b;
        Bitmap bitmap = (Bitmap) resource.get();
        if (i7 == Integer.MIN_VALUE) {
            i7 = bitmap.getWidth();
        }
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getHeight();
        }
        Bitmap bitmapA = a(bitmapPool, bitmap, i7, i10);
        return bitmap.equals(bitmapA) ? resource : C1331c.a(bitmapPool, bitmapA);
    }
}
