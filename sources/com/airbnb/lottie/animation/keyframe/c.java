package com.airbnb.lottie.animation.keyframe;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements BaseKeyframeAnimation$KeyframesWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p243q1.a f19787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f19788b = -1.0f;

    public c(List list) {
        this.f19787a = (p243q1.a) list.get(0);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$KeyframesWrapper
    public final p243q1.a getCurrentKeyframe() {
        return this.f19787a;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$KeyframesWrapper
    public final float getEndProgress() {
        return this.f19787a.a();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$KeyframesWrapper
    public final float getStartDelayProgress() {
        return this.f19787a.b();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$KeyframesWrapper
    public final boolean isCachedValueEnabled(float f10) {
        if (this.f19788b == f10) {
            return true;
        }
        this.f19788b = f10;
        return false;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$KeyframesWrapper
    public final boolean isEmpty() {
        return false;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$KeyframesWrapper
    public final boolean isValueChanged(float f10) {
        return !this.f19787a.c();
    }
}
