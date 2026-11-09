package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.c;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.palmpay.lib.webview.container.PPWebActivity;
import p331w0.b;

/* JADX INFO: loaded from: classes2.dex */
final class CircularIndeterminateAdvanceAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {
    private static final Property<CircularIndeterminateAdvanceAnimatorDelegate, Float> ANIMATION_FRACTION;
    private static final Property<CircularIndeterminateAdvanceAnimatorDelegate, Float> COMPLETE_END_FRACTION;
    private static final int CONSTANT_ROTATION_DEGREES = 1520;
    private static final int DURATION_TO_COLLAPSE_IN_MS = 667;
    private static final int DURATION_TO_COMPLETE_END_IN_MS = 333;
    private static final int DURATION_TO_EXPAND_IN_MS = 667;
    private static final int DURATION_TO_FADE_IN_MS = 333;
    private static final int EXTRA_DEGREES_PER_CYCLE = 250;
    private static final int TAIL_DEGREES_OFFSET = -20;
    private static final int TOTAL_CYCLES = 4;
    private static final int TOTAL_DURATION_IN_MS = 5400;
    private float animationFraction;
    private ObjectAnimator animator;
    c animatorCompleteCallback;
    private final BaseProgressIndicatorSpec baseSpec;
    private ObjectAnimator completeEndAnimator;
    private float completeEndFraction;
    private int indicatorColorIndexOffset;
    private final b interpolator;
    private static final int[] DELAY_TO_EXPAND_IN_MS = {0, 1350, 2700, 4050};
    private static final int[] DELAY_TO_COLLAPSE_IN_MS = {667, 2017, 3367, 4717};
    private static final int[] DELAY_TO_FADE_IN_MS = {1000, 2350, 3700, 5050};

    static {
        Class<Float> cls = Float.class;
        ANIMATION_FRACTION = new Property<CircularIndeterminateAdvanceAnimatorDelegate, Float>(cls, "animationFraction") { // from class: com.google.android.material.progressindicator.CircularIndeterminateAdvanceAnimatorDelegate.3
            @Override // android.util.Property
            public Float get(CircularIndeterminateAdvanceAnimatorDelegate circularIndeterminateAdvanceAnimatorDelegate) {
                return Float.valueOf(circularIndeterminateAdvanceAnimatorDelegate.getAnimationFraction());
            }

            @Override // android.util.Property
            public void set(CircularIndeterminateAdvanceAnimatorDelegate circularIndeterminateAdvanceAnimatorDelegate, Float f10) {
                circularIndeterminateAdvanceAnimatorDelegate.setAnimationFraction(f10.floatValue());
            }
        };
        COMPLETE_END_FRACTION = new Property<CircularIndeterminateAdvanceAnimatorDelegate, Float>(cls, "completeEndFraction") { // from class: com.google.android.material.progressindicator.CircularIndeterminateAdvanceAnimatorDelegate.4
            @Override // android.util.Property
            public Float get(CircularIndeterminateAdvanceAnimatorDelegate circularIndeterminateAdvanceAnimatorDelegate) {
                return Float.valueOf(circularIndeterminateAdvanceAnimatorDelegate.getCompleteEndFraction());
            }

            @Override // android.util.Property
            public void set(CircularIndeterminateAdvanceAnimatorDelegate circularIndeterminateAdvanceAnimatorDelegate, Float f10) {
                circularIndeterminateAdvanceAnimatorDelegate.setCompleteEndFraction(f10.floatValue());
            }
        };
    }

    public CircularIndeterminateAdvanceAnimatorDelegate(@NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.indicatorColorIndexOffset = 0;
        this.animatorCompleteCallback = null;
        this.baseSpec = circularProgressIndicatorSpec;
        this.interpolator = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getAnimationFraction() {
        return this.animationFraction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getCompleteEndFraction() {
        return this.completeEndFraction;
    }

    private void maybeInitializeAnimators() {
        if (this.animator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, ANIMATION_FRACTION, 0.0f, 1.0f);
            this.animator = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.baseSpec.indeterminateAnimatorDurationScale * 5400.0f));
            this.animator.setInterpolator(null);
            this.animator.setRepeatCount(-1);
            this.animator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.CircularIndeterminateAdvanceAnimatorDelegate.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    CircularIndeterminateAdvanceAnimatorDelegate circularIndeterminateAdvanceAnimatorDelegate = CircularIndeterminateAdvanceAnimatorDelegate.this;
                    circularIndeterminateAdvanceAnimatorDelegate.indicatorColorIndexOffset = (circularIndeterminateAdvanceAnimatorDelegate.indicatorColorIndexOffset + 4) % CircularIndeterminateAdvanceAnimatorDelegate.this.baseSpec.indicatorColors.length;
                }
            });
        }
        if (this.completeEndAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, COMPLETE_END_FRACTION, 0.0f, 1.0f);
            this.completeEndAnimator = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.baseSpec.indeterminateAnimatorDurationScale * 333.0f));
            this.completeEndAnimator.setInterpolator(this.interpolator);
            this.completeEndAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.CircularIndeterminateAdvanceAnimatorDelegate.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    CircularIndeterminateAdvanceAnimatorDelegate.this.cancelAnimatorImmediately();
                    CircularIndeterminateAdvanceAnimatorDelegate circularIndeterminateAdvanceAnimatorDelegate = CircularIndeterminateAdvanceAnimatorDelegate.this;
                    c cVar = circularIndeterminateAdvanceAnimatorDelegate.animatorCompleteCallback;
                    if (cVar != null) {
                        cVar.onAnimationEnd(circularIndeterminateAdvanceAnimatorDelegate.drawable);
                    }
                }
            });
        }
    }

    private void maybeUpdateSegmentColors(int i7) {
        for (int i10 = 0; i10 < 4; i10++) {
            float fractionInRange = getFractionInRange(i7, DELAY_TO_FADE_IN_MS[i10], PPWebActivity.REQUEST_CODE_CUSTOMER);
            if (fractionInRange > 0.0f && fractionInRange < 1.0f) {
                int i11 = i10 + this.indicatorColorIndexOffset;
                int[] iArr = this.baseSpec.indicatorColors;
                int length = i11 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                int i12 = iArr[length];
                int i13 = iArr[length2];
                this.activeIndicators.get(0).color = ArgbEvaluatorCompat.getInstance().evaluate(this.interpolator.getInterpolation(fractionInRange), Integer.valueOf(i12), Integer.valueOf(i13)).intValue();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCompleteEndFraction(float f10) {
        this.completeEndFraction = f10;
    }

    private void updateAnimatorsDuration() {
        maybeInitializeAnimators();
        this.animator.setDuration((long) (this.baseSpec.indeterminateAnimatorDurationScale * 5400.0f));
        this.completeEndAnimator.setDuration((long) (this.baseSpec.indeterminateAnimatorDurationScale * 333.0f));
    }

    private void updateSegmentPositions(int i7) {
        DrawingDelegate.ActiveIndicator activeIndicator = this.activeIndicators.get(0);
        float f10 = this.animationFraction;
        activeIndicator.startFraction = (f10 * 1520.0f) - 20.0f;
        activeIndicator.endFraction = f10 * 1520.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            activeIndicator.endFraction = (this.interpolator.getInterpolation(getFractionInRange(i7, DELAY_TO_EXPAND_IN_MS[i10], 667)) * 250.0f) + activeIndicator.endFraction;
            activeIndicator.startFraction = (this.interpolator.getInterpolation(getFractionInRange(i7, DELAY_TO_COLLAPSE_IN_MS[i10], 667)) * 250.0f) + activeIndicator.startFraction;
        }
        float f11 = activeIndicator.startFraction;
        float f12 = activeIndicator.endFraction;
        activeIndicator.startFraction = (((f12 - f11) * this.completeEndFraction) + f11) / 360.0f;
        activeIndicator.endFraction = f12 / 360.0f;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void cancelAnimatorImmediately() {
        ObjectAnimator objectAnimator = this.animator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void invalidateSpecValues() {
        updateAnimatorsDuration();
        resetPropertiesForNewStart();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void registerAnimatorsCompleteCallback(@NonNull c cVar) {
        this.animatorCompleteCallback = cVar;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void requestCancelAnimatorAfterCurrentCycle() {
        ObjectAnimator objectAnimator = this.completeEndAnimator;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.drawable.isVisible()) {
            this.completeEndAnimator.start();
        } else {
            cancelAnimatorImmediately();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    @VisibleForTesting
    public void resetPropertiesForNewStart() {
        this.indicatorColorIndexOffset = 0;
        this.activeIndicators.get(0).color = this.baseSpec.indicatorColors[0];
        this.completeEndFraction = 0.0f;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    @VisibleForTesting
    public void setAnimationFraction(float f10) {
        this.animationFraction = f10;
        int i7 = (int) (f10 * 5400.0f);
        updateSegmentPositions(i7);
        maybeUpdateSegmentColors(i7);
        this.drawable.invalidateSelf();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void startAnimator() {
        maybeInitializeAnimators();
        resetPropertiesForNewStart();
        this.animator.start();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void unregisterAnimatorsCompleteCallback() {
        this.animatorCompleteCallback = null;
    }
}
