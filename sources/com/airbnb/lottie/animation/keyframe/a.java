package com.airbnb.lottie.animation.keyframe;

/* JADX INFO: loaded from: classes.dex */
public final class a implements BaseKeyframeAnimation$KeyframesWrapper {
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$KeyframesWrapper
    public final p243q1.a getCurrentKeyframe() {
        throw new IllegalStateException("not implemented");
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$KeyframesWrapper
    public final float getEndProgress() {
        return 1.0f;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$KeyframesWrapper
    public final float getStartDelayProgress() {
        return 0.0f;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$KeyframesWrapper
    public final boolean isCachedValueEnabled(float f10) {
        throw new IllegalStateException("not implemented");
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$KeyframesWrapper
    public final boolean isEmpty() {
        return true;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$KeyframesWrapper
    public final boolean isValueChanged(float f10) {
        return false;
    }
}
