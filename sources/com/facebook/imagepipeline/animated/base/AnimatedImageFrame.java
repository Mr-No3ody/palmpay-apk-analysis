package com.facebook.imagepipeline.animated.base;

import android.graphics.Bitmap;
import com.facebook.infer.annotation.Nullsafe;
import p245q3.a;

/* JADX INFO: loaded from: classes.dex */
@Nullsafe(a.f41451a)
public interface AnimatedImageFrame {
    void dispose();

    int getDurationMs();

    int getHeight();

    int getWidth();

    int getXOffset();

    int getYOffset();

    void renderFrame(int width, int height, Bitmap bitmap);
}
