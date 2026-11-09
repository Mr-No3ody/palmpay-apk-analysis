package com.airbnb.lottie.animation.content;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$AnimationListener;

/* JADX INFO: loaded from: classes.dex */
public interface ShapeModifierContent extends Content {
    void addUpdateListener(BaseKeyframeAnimation$AnimationListener baseKeyframeAnimation$AnimationListener);

    com.airbnb.lottie.model.content.j modifyShape(com.airbnb.lottie.model.content.j jVar);
}
