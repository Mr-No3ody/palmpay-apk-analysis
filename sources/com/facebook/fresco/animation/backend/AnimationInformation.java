package com.facebook.fresco.animation.backend;

/* JADX INFO: loaded from: classes.dex */
public interface AnimationInformation {
    int getFrameCount();

    int getFrameDurationMs(int frameNumber);

    int getLoopCount();
}
