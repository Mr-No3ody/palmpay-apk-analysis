package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0812c;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import p192n.c;
import p331w0.b;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public class MaterialBottomContainerBackHelper extends MaterialBackAnimationHelper<View> {
    private final float maxScaleXDistance;
    private final float maxScaleYDistance;

    public MaterialBottomContainerBackHelper(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.maxScaleXDistance = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.maxScaleYDistance = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    private Animator createResetScaleAnimator() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v3 = this.view;
        if (v3 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v3;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i7), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new b());
        return animatorSet;
    }

    public void cancelBackProgress() {
        if (super.onCancelBackProgress() == null) {
            return;
        }
        Animator animatorCreateResetScaleAnimator = createResetScaleAnimator();
        animatorCreateResetScaleAnimator.setDuration(this.cancelDuration);
        animatorCreateResetScaleAnimator.start();
    }

    public void finishBackProgressNotPersistent(@NonNull C0812c c0812c, @Nullable Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.TRANSLATION_Y, this.view.getScaleY() * this.view.getHeight());
        objectAnimatorOfFloat.setInterpolator(new b());
        objectAnimatorOfFloat.setDuration(AnimationUtils.lerp(this.hideDurationMax, this.hideDurationMin, c0812c.f12022c));
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialBottomContainerBackHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MaterialBottomContainerBackHelper.this.view.setTranslationY(0.0f);
                MaterialBottomContainerBackHelper.this.updateBackProgress(0.0f);
            }
        });
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public void finishBackProgressPersistent(@NonNull C0812c c0812c, @Nullable Animator.AnimatorListener animatorListener) {
        Animator animatorCreateResetScaleAnimator = createResetScaleAnimator();
        animatorCreateResetScaleAnimator.setDuration(AnimationUtils.lerp(this.hideDurationMax, this.hideDurationMin, c0812c.f12022c));
        if (animatorListener != null) {
            animatorCreateResetScaleAnimator.addListener(animatorListener);
        }
        animatorCreateResetScaleAnimator.start();
    }

    public void startBackProgress(@NonNull C0812c c0812c) {
        super.onStartBackProgress(c0812c);
    }

    public void updateBackProgress(@NonNull C0812c c0812c) {
        if (super.onUpdateBackProgress(c0812c) == null) {
            return;
        }
        updateBackProgress(c0812c.f12022c);
    }

    @VisibleForTesting
    public void updateBackProgress(float f10) {
        float fInterpolateProgress = interpolateProgress(f10);
        float width = this.view.getWidth();
        float height = this.view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f11 = this.maxScaleXDistance / width;
        float f12 = this.maxScaleYDistance / height;
        float fLerp = 1.0f - AnimationUtils.lerp(0.0f, f11, fInterpolateProgress);
        float fLerp2 = 1.0f - AnimationUtils.lerp(0.0f, f12, fInterpolateProgress);
        if (Float.isNaN(fLerp) || Float.isNaN(fLerp2)) {
            return;
        }
        this.view.setScaleX(fLerp);
        this.view.setPivotY(height);
        this.view.setScaleY(fLerp2);
        V v3 = this.view;
        if (v3 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v3;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                View childAt = viewGroup.getChildAt(i7);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(fLerp2 != 0.0f ? fLerp / fLerp2 : 1.0f);
            }
        }
    }
}
