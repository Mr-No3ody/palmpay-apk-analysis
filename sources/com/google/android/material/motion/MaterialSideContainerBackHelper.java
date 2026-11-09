package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0812c;
import androidx.annotation.GravityInt;
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
public class MaterialSideContainerBackHelper extends MaterialBackAnimationHelper<View> {
    private final float maxScaleXDistanceGrow;
    private final float maxScaleXDistanceShrink;
    private final float maxScaleYDistance;

    public MaterialSideContainerBackHelper(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.maxScaleXDistanceShrink = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.maxScaleXDistanceGrow = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.maxScaleYDistance = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    private boolean checkAbsoluteGravity(@GravityInt int i7, @GravityInt int i10) {
        return (Gravity.getAbsoluteGravity(i7, this.view.getLayoutDirection()) & i10) == i10;
    }

    private int getEdgeMargin(boolean z3) {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }

    public void cancelBackProgress() {
        if (super.onCancelBackProgress() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v3 = this.view;
        if (v3 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v3;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i7), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.cancelDuration);
        animatorSet.start();
    }

    public void finishBackProgress(@NonNull C0812c c0812c, @GravityInt final int i7, @Nullable Animator.AnimatorListener animatorListener, @Nullable ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        final boolean z3 = c0812c.f12023d == 0;
        boolean zCheckAbsoluteGravity = checkAbsoluteGravity(i7, 3);
        float scaleX = (this.view.getScaleX() * this.view.getWidth()) + getEdgeMargin(zCheckAbsoluteGravity);
        V v3 = this.view;
        Property property = View.TRANSLATION_X;
        if (zCheckAbsoluteGravity) {
            scaleX = -scaleX;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(v3, (Property<V, Float>) property, scaleX);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new b());
        objectAnimatorOfFloat.setDuration(AnimationUtils.lerp(this.hideDurationMax, this.hideDurationMin, c0812c.f12022c));
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialSideContainerBackHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MaterialSideContainerBackHelper.this.view.setTranslationX(0.0f);
                MaterialSideContainerBackHelper.this.updateBackProgress(0.0f, z3, i7);
            }
        });
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public void startBackProgress(@NonNull C0812c c0812c) {
        super.onStartBackProgress(c0812c);
    }

    public void updateBackProgress(@NonNull C0812c c0812c, @GravityInt int i7) {
        if (super.onUpdateBackProgress(c0812c) == null) {
            return;
        }
        updateBackProgress(c0812c.f12022c, c0812c.f12023d == 0, i7);
    }

    @VisibleForTesting
    public void updateBackProgress(float f10, boolean z3, @GravityInt int i7) {
        float width;
        float fInterpolateProgress = interpolateProgress(f10);
        boolean zCheckAbsoluteGravity = checkAbsoluteGravity(i7, 3);
        boolean z8 = z3 == zCheckAbsoluteGravity;
        int width2 = this.view.getWidth();
        int height = this.view.getHeight();
        float f11 = width2;
        if (f11 > 0.0f) {
            float f12 = height;
            if (f12 <= 0.0f) {
                return;
            }
            float f13 = this.maxScaleXDistanceShrink / f11;
            float f14 = this.maxScaleXDistanceGrow / f11;
            float f15 = this.maxScaleYDistance / f12;
            V v3 = this.view;
            if (zCheckAbsoluteGravity) {
                f11 = 0.0f;
            }
            v3.setPivotX(f11);
            if (!z8) {
                f14 = -f13;
            }
            float fLerp = AnimationUtils.lerp(0.0f, f14, fInterpolateProgress);
            float f16 = fLerp + 1.0f;
            float fLerp2 = 1.0f - AnimationUtils.lerp(0.0f, f15, fInterpolateProgress);
            if (Float.isNaN(f16) || Float.isNaN(fLerp2)) {
                return;
            }
            this.view.setScaleX(f16);
            this.view.setScaleY(fLerp2);
            V v4 = this.view;
            if (v4 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v4;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (zCheckAbsoluteGravity) {
                        width = childAt.getWidth() + (width2 - childAt.getRight());
                    } else {
                        width = -childAt.getLeft();
                    }
                    childAt.setPivotX(width);
                    childAt.setPivotY(-childAt.getTop());
                    float f17 = z8 ? 1.0f - fLerp : 1.0f;
                    float f18 = fLerp2 != 0.0f ? (f16 / fLerp2) * f17 : 1.0f;
                    if (!Float.isNaN(f17) && !Float.isNaN(f18)) {
                        childAt.setScaleX(f17);
                        childAt.setScaleY(f18);
                    }
                }
            }
        }
    }
}
