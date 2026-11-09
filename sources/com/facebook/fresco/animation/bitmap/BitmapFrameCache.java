package com.facebook.fresco.animation.bitmap;

import com.facebook.common.references.CloseableReference;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;
import p245q3.a;

/* JADX INFO: loaded from: classes.dex */
@Nullsafe(a.f41452b)
public interface BitmapFrameCache {

    public interface FrameCacheListener {
        void onFrameCached(BitmapFrameCache bitmapFrameCache, int frameNumber);

        void onFrameEvicted(BitmapFrameCache bitmapFrameCache, int frameNumber);
    }

    void clear();

    boolean contains(int frameNumber);

    @Nullable
    CloseableReference getBitmapToReuseForFrame(int frameNumber, int width, int height);

    @Nullable
    CloseableReference getCachedFrame(int frameNumber);

    @Nullable
    CloseableReference getFallbackFrame(int frameNumber);

    int getSizeInBytes();

    void onFramePrepared(int frameNumber, CloseableReference bitmapReference, int frameType);

    void onFrameRendered(int frameNumber, CloseableReference bitmapReference, int frameType);

    void setFrameCacheListener(FrameCacheListener frameCacheListener);
}
