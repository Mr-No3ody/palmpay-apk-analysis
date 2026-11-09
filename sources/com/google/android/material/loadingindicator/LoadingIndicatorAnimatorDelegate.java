package com.google.android.material.loadingindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.dynamicanimation.animation.h;
import androidx.dynamicanimation.animation.j;
import androidx.dynamicanimation.animation.k;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import p118hf.a;

/* JADX INFO: loaded from: classes2.dex */
class LoadingIndicatorAnimatorDelegate {
    private static final int CONSTANT_ROTATION_PER_SHAPE_DEGREES = 50;
    private static final int DURATION_PER_SHAPE_IN_MS = 650;
    private static final int EXTRA_ROTATION_PER_SHAPE_DEGREES = 90;
    private static final float SPRING_DAMPING_RATIO = 0.6f;
    private static final float SPRING_STIFFNESS = 200.0f;
    private float animationFraction;
    private ObjectAnimator animator;

    @Nullable
    LoadingIndicatorDrawable drawable;
    LoadingIndicatorDrawingDelegate.IndicatorState indicatorState = new LoadingIndicatorDrawingDelegate.IndicatorState();
    private float morphFactor;
    private int morphFactorTarget;

    @NonNull
    LoadingIndicatorSpec specs;
    private j springAnimation;
    private static final Property<LoadingIndicatorAnimatorDelegate, Float> ANIMATION_FRACTION = new Property<LoadingIndicatorAnimatorDelegate, Float>(Float.class, "animationFraction") { // from class: com.google.android.material.loadingindicator.LoadingIndicatorAnimatorDelegate.2
        @Override // android.util.Property
        public Float get(LoadingIndicatorAnimatorDelegate loadingIndicatorAnimatorDelegate) {
            return Float.valueOf(loadingIndicatorAnimatorDelegate.getAnimationFraction());
        }

        @Override // android.util.Property
        public void set(LoadingIndicatorAnimatorDelegate loadingIndicatorAnimatorDelegate, Float f10) {
            loadingIndicatorAnimatorDelegate.setAnimationFraction(f10.floatValue());
        }
    };
    private static final h MORPH_FACTOR = new h("morphFactor") { // from class: com.google.android.material.loadingindicator.LoadingIndicatorAnimatorDelegate.3
        @Override // androidx.dynamicanimation.animation.h
        public float getValue(LoadingIndicatorAnimatorDelegate loadingIndicatorAnimatorDelegate) {
            return loadingIndicatorAnimatorDelegate.getMorphFactor();
        }

        @Override // androidx.dynamicanimation.animation.h
        public void setValue(LoadingIndicatorAnimatorDelegate loadingIndicatorAnimatorDelegate, float f10) {
            loadingIndicatorAnimatorDelegate.setMorphFactor(f10);
        }
    };

    public LoadingIndicatorAnimatorDelegate(@NonNull LoadingIndicatorSpec loadingIndicatorSpec) {
        this.specs = loadingIndicatorSpec;
    }

    public static /* synthetic */ int access$004(LoadingIndicatorAnimatorDelegate loadingIndicatorAnimatorDelegate) {
        int i7 = loadingIndicatorAnimatorDelegate.morphFactorTarget + 1;
        loadingIndicatorAnimatorDelegate.morphFactorTarget = i7;
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getAnimationFraction() {
        return this.animationFraction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getMorphFactor() {
        return this.morphFactor;
    }

    private void maybeInitializeAnimators() {
        if (this.springAnimation == null) {
            j jVar = new j(this, MORPH_FACTOR);
            k kVar = new k();
            kVar.b(SPRING_STIFFNESS);
            kVar.a(SPRING_DAMPING_RATIO);
            jVar.f16867s = kVar;
            jVar.f16863j = 0.01f;
            this.springAnimation = jVar;
        }
        if (this.animator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, ANIMATION_FRACTION, 0.0f, 1.0f);
            this.animator = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(650L);
            this.animator.setInterpolator(null);
            this.animator.setRepeatCount(-1);
            this.animator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.loadingindicator.LoadingIndicatorAnimatorDelegate.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    LoadingIndicatorAnimatorDelegate.this.springAnimation.c(LoadingIndicatorAnimatorDelegate.access$004(LoadingIndicatorAnimatorDelegate.this));
                }
            });
        }
    }

    private void updateIndicatorRotation(int i7) {
        float f10 = this.morphFactorTarget - 1;
        float f11 = this.morphFactor - f10;
        float f12 = i7 / 650.0f;
        if (f12 == 1.0f) {
            f12 = 0.0f;
        }
        this.indicatorState.rotationDegree = ((f11 * 90.0f) + ((f12 * 50.0f) + (f10 * 140.0f))) % 360.0f;
    }

    private void updateIndicatorShapeAndColor() {
        LoadingIndicatorDrawingDelegate.IndicatorState indicatorState = this.indicatorState;
        indicatorState.morphFraction = this.morphFactor;
        int i7 = this.morphFactorTarget - 1;
        int[] iArr = this.specs.indicatorColors;
        int length = i7 % iArr.length;
        indicatorState.color = ArgbEvaluatorCompat.getInstance().evaluate(a.l(this.morphFactor - (this.morphFactorTarget - 1), 0.0f, 1.0f), Integer.valueOf(iArr[length]), Integer.valueOf(iArr[(length + 1) % iArr.length])).intValue();
    }

    public void cancelAnimatorImmediately() {
        ObjectAnimator objectAnimator = this.animator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        j jVar = this.springAnimation;
        if (jVar != null) {
            jVar.d();
        }
    }

    public void invalidateSpecValues() {
        resetPropertiesForNewStart();
    }

    public void registerDrawable(@NonNull LoadingIndicatorDrawable loadingIndicatorDrawable) {
        this.drawable = loadingIndicatorDrawable;
    }

    public void resetPropertiesForNewStart() {
        this.morphFactorTarget = 1;
        setMorphFactor(0.0f);
        this.indicatorState.color = this.specs.indicatorColors[0];
    }

    @VisibleForTesting
    public void setAnimationFraction(float f10) {
        this.animationFraction = f10;
        updateIndicatorRotation((int) (f10 * 650.0f));
        LoadingIndicatorDrawable loadingIndicatorDrawable = this.drawable;
        if (loadingIndicatorDrawable != null) {
            loadingIndicatorDrawable.invalidateSelf();
        }
    }

    @VisibleForTesting
    public void setMorphFactor(float f10) {
        this.morphFactor = f10;
        updateIndicatorShapeAndColor();
        LoadingIndicatorDrawable loadingIndicatorDrawable = this.drawable;
        if (loadingIndicatorDrawable != null) {
            loadingIndicatorDrawable.invalidateSelf();
        }
    }

    @VisibleForTesting
    public void setMorphFactorTarget(int i7) {
        this.morphFactorTarget = i7;
    }

    public void startAnimator() {
        maybeInitializeAnimators();
        resetPropertiesForNewStart();
        this.springAnimation.c(this.morphFactorTarget);
        this.animator.start();
    }
}
