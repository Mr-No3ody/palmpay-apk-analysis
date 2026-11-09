package com.palmpay.image.webp;

import android.graphics.drawable.Animatable;

/* JADX INFO: loaded from: classes3.dex */
public interface XAnimationListener {
    void onAnimationFrame(Animatable animatable, int i7, int i10);

    void onAnimationRepeat(Animatable animatable);

    void onAnimationReset(Animatable animatable);

    void onAnimationStart(Animatable animatable);

    void onAnimationStop(Animatable animatable);

    void onFinalImageSet(int i7, int i10, Animatable animatable);
}
