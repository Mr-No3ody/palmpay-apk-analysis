package com.facebook.imagepipeline.animated.impl;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface AnimatedImageCompositor$Callback {
    @Nullable
    CloseableReference getCachedBitmap(int frameNumber);

    void onIntermediateResult(int frameNumber, Bitmap bitmap);
}
