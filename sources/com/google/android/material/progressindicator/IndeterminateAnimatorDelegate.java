package com.google.android.material.progressindicator;

import android.animation.Animator;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.c;
import java.util.ArrayList;
import java.util.List;
import p118hf.a;

/* JADX INFO: loaded from: classes2.dex */
abstract class IndeterminateAnimatorDelegate<T extends Animator> {
    protected final List<DrawingDelegate.ActiveIndicator> activeIndicators = new ArrayList();
    protected IndeterminateDrawable drawable;

    public IndeterminateAnimatorDelegate(int i7) {
        for (int i10 = 0; i10 < i7; i10++) {
            this.activeIndicators.add(new DrawingDelegate.ActiveIndicator());
        }
    }

    public abstract void cancelAnimatorImmediately();

    public float getFractionInRange(int i7, int i10, int i11) {
        return a.l((i7 - i10) / i11, 0.0f, 1.0f);
    }

    public abstract void invalidateSpecValues();

    public abstract void registerAnimatorsCompleteCallback(@NonNull c cVar);

    public void registerDrawable(@NonNull IndeterminateDrawable indeterminateDrawable) {
        this.drawable = indeterminateDrawable;
    }

    public abstract void requestCancelAnimatorAfterCurrentCycle();

    @VisibleForTesting
    public abstract void resetPropertiesForNewStart();

    @VisibleForTesting
    public abstract void setAnimationFraction(float f10);

    public abstract void startAnimator();

    public abstract void unregisterAnimatorsCompleteCallback();
}
