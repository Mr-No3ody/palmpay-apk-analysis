package com.facebook.imagepipeline.animated.impl;

import X2.b;
import android.graphics.Rect;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;
import p245q3.a;

/* JADX INFO: loaded from: classes.dex */
@Nullsafe(a.f41451a)
public interface AnimatedDrawableBackendProvider {
    AnimatedDrawableBackend get(b animatedImageResult, @Nullable Rect bounds);
}
