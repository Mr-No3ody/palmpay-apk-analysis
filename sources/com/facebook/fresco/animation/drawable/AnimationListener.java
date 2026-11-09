package com.facebook.fresco.animation.drawable;

import com.facebook.infer.annotation.Nullsafe;
import p245q3.a;

/* JADX INFO: loaded from: classes.dex */
@Nullsafe(a.f41451a)
public interface AnimationListener {
    void onAnimationFrame(P2.a drawable, int frameNumber);

    void onAnimationRepeat(P2.a drawable);

    void onAnimationReset(P2.a drawable);

    void onAnimationStart(P2.a drawable);

    void onAnimationStop(P2.a drawable);
}
