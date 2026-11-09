package com.facebook.fresco.animation.bitmap;

import L2.a;

/* JADX INFO: loaded from: classes.dex */
public interface BitmapAnimationBackend$FrameListener {
    void onDrawFrameStart(a backend, int frameNumber);

    void onFrameDrawn(a backend, int frameNumber, int frameType);

    void onFrameDropped(a backend, int frameNumber);
}
