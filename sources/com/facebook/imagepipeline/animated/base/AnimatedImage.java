package com.facebook.imagepipeline.animated.base;

import android.graphics.Bitmap;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;
import p245q3.a;

/* JADX INFO: loaded from: classes.dex */
@Nullsafe(a.f41451a)
public interface AnimatedImage {
    void dispose();

    boolean doesRenderSupportScaling();

    @Nullable
    Bitmap.Config getAnimatedBitmapConfig();

    int getDuration();

    AnimatedImageFrame getFrame(int frameNumber);

    int getFrameCount();

    int[] getFrameDurations();

    X2.a getFrameInfo(int frameNumber);

    int getHeight();

    int getLoopCount();

    int getSizeInBytes();

    int getWidth();
}
