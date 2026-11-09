package com.facebook.imagepipeline.image;

import android.graphics.Bitmap;
import com.facebook.infer.annotation.Nullsafe;
import p245q3.a;

/* JADX INFO: loaded from: classes.dex */
@Nullsafe(a.f41451a)
public interface CloseableBitmap extends CloseableImage {
    Bitmap getUnderlyingBitmap();
}
