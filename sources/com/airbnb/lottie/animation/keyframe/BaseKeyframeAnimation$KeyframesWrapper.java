package com.airbnb.lottie.animation.keyframe;

import androidx.annotation.FloatRange;

/* JADX INFO: loaded from: classes.dex */
interface BaseKeyframeAnimation$KeyframesWrapper<T> {
    p243q1.a getCurrentKeyframe();

    @FloatRange(from = 0.0d, to = 1.0d)
    float getEndProgress();

    @FloatRange(from = 0.0d, to = 1.0d)
    float getStartDelayProgress();

    boolean isCachedValueEnabled(float f10);

    boolean isEmpty();

    boolean isValueChanged(float f10);
}
