package com.airbnb.lottie.model.animatable;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface AnimatableValue<K, A> {
    com.airbnb.lottie.animation.keyframe.d createAnimation();

    List<p243q1.a> getKeyframes();

    boolean isStatic();
}
