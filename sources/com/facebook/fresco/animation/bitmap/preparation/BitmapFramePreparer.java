package com.facebook.fresco.animation.bitmap.preparation;

import com.facebook.fresco.animation.backend.AnimationBackend;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache;
import com.facebook.infer.annotation.Nullsafe;
import p245q3.a;

/* JADX INFO: loaded from: classes.dex */
@Nullsafe(a.f41451a)
public interface BitmapFramePreparer {
    boolean prepareFrame(BitmapFrameCache bitmapFrameCache, AnimationBackend animationBackend, int frameNumber);
}
