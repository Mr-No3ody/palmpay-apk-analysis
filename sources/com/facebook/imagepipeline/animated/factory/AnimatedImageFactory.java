package com.facebook.imagepipeline.animated.factory;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.common.c;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.infer.annotation.Nullsafe;
import p109h3.e;
import p245q3.a;

/* JADX INFO: loaded from: classes.dex */
@Nullsafe(a.f41451a)
public interface AnimatedImageFactory {
    CloseableImage decodeGif(final e encodedImage, final c options, final Bitmap.Config bitmapConfig);

    CloseableImage decodeWebP(final e encodedImage, final c options, final Bitmap.Config bitmapConfig);
}
