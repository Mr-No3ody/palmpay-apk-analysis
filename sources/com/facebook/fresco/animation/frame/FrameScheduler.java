package com.facebook.fresco.animation.frame;

/* JADX INFO: loaded from: classes.dex */
public interface FrameScheduler {
    int getFrameNumberToRender(long animationTimeMs, long lastFrameTimeMs);

    long getLoopDurationMs();

    long getTargetRenderTimeForNextFrameMs(long animationTimeMs);

    long getTargetRenderTimeMs(int frameNumber);

    boolean isInfiniteAnimation();
}
