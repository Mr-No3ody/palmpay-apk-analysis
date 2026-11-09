package com.facebook.fresco.animation.drawable;

import P2.a;
import com.facebook.fresco.animation.frame.FrameScheduler;

/* JADX INFO: loaded from: classes.dex */
public interface AnimatedDrawable2$DrawListener {
    void onDraw(a animatedDrawable, FrameScheduler frameScheduler, int frameNumberToDraw, boolean frameDrawn, boolean isAnimationRunning, long animationStartTimeMs, long animationTimeMs, long lastFrameAnimationTimeMs, long actualRenderTimeStartMs, long actualRenderTimeEndMs, long startRenderTimeForNextFrameMs, long scheduledRenderTimeForNextFrameMs);
}
