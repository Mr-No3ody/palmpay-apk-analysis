package com.facebook.imagepipeline.animated.base;

import X2.b;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.facebook.common.references.CloseableReference;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;
import p245q3.a;

/* JADX INFO: loaded from: classes.dex */
@Nullsafe(a.f41452b)
public interface AnimatedDrawableBackend {
    void dropCaches();

    AnimatedDrawableBackend forNewBounds(@Nullable Rect bounds);

    b getAnimatedImageResult();

    int getDurationMs();

    int getDurationMsForFrame(int frameNumber);

    int getFrameCount();

    int getFrameForPreview();

    int getFrameForTimestampMs(int timestampMs);

    X2.a getFrameInfo(int frameNumber);

    int getHeight();

    int getLoopCount();

    int getMemoryUsage();

    @Nullable
    CloseableReference getPreDecodedFrame(int frameNumber);

    int getRenderedHeight();

    int getRenderedWidth();

    int getTimestampMsForFrame(int frameNumber);

    int getWidth();

    boolean hasPreDecodedFrame(int frameNumber);

    void renderFrame(int frameNumber, Canvas canvas);
}
