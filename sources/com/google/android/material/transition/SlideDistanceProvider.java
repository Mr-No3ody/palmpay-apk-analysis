package com.google.android.material.transition;

import C0.G;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
public final class SlideDistanceProvider implements VisibilityAnimatorProvider {
    private static final int DEFAULT_DISTANCE = -1;

    @Px
    private int slideDistance = -1;
    private int slideEdge;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({c.f39801b})
    public @interface GravityFlag {
    }

    public SlideDistanceProvider(int i7) {
        this.slideEdge = i7;
    }

    private static Animator createTranslationAppearAnimator(View view, View view2, int i7, @Px int i10) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i7 == 3) {
            return createTranslationXAnimator(view2, i10 + translationX, translationX, translationX);
        }
        if (i7 == 5) {
            return createTranslationXAnimator(view2, translationX - i10, translationX, translationX);
        }
        if (i7 == 48) {
            return createTranslationYAnimator(view2, translationY - i10, translationY, translationY);
        }
        if (i7 == 80) {
            return createTranslationYAnimator(view2, i10 + translationY, translationY, translationY);
        }
        if (i7 == 8388611) {
            return createTranslationXAnimator(view2, isRtl(view) ? i10 + translationX : translationX - i10, translationX, translationX);
        }
        if (i7 == 8388613) {
            return createTranslationXAnimator(view2, isRtl(view) ? translationX - i10 : i10 + translationX, translationX, translationX);
        }
        throw new IllegalArgumentException(G.m(i7, "Invalid slide direction: "));
    }

    private static Animator createTranslationDisappearAnimator(View view, View view2, int i7, @Px int i10) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i7 == 3) {
            return createTranslationXAnimator(view2, translationX, translationX - i10, translationX);
        }
        if (i7 == 5) {
            return createTranslationXAnimator(view2, translationX, i10 + translationX, translationX);
        }
        if (i7 == 48) {
            return createTranslationYAnimator(view2, translationY, i10 + translationY, translationY);
        }
        if (i7 == 80) {
            return createTranslationYAnimator(view2, translationY, translationY - i10, translationY);
        }
        if (i7 == 8388611) {
            return createTranslationXAnimator(view2, translationX, isRtl(view) ? translationX - i10 : i10 + translationX, translationX);
        }
        if (i7 == 8388613) {
            return createTranslationXAnimator(view2, translationX, isRtl(view) ? i10 + translationX : translationX - i10, translationX);
        }
        throw new IllegalArgumentException(G.m(i7, "Invalid slide direction: "));
    }

    private static Animator createTranslationXAnimator(final View view, float f10, float f11, final float f12) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f10, f11));
        objectAnimatorOfPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.SlideDistanceProvider.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setTranslationX(f12);
            }
        });
        return objectAnimatorOfPropertyValuesHolder;
    }

    private static Animator createTranslationYAnimator(final View view, float f10, float f11, final float f12) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f10, f11));
        objectAnimatorOfPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.SlideDistanceProvider.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setTranslationY(f12);
            }
        });
        return objectAnimatorOfPropertyValuesHolder;
    }

    private int getSlideDistanceOrDefault(Context context) {
        int i7 = this.slideDistance;
        return i7 != -1 ? i7 : context.getResources().getDimensionPixelSize(R.dimen.mtrl_transition_shared_axis_slide_distance);
    }

    private static boolean isRtl(View view) {
        return view.getLayoutDirection() == 1;
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return createTranslationAppearAnimator(viewGroup, view, this.slideEdge, getSlideDistanceOrDefault(view.getContext()));
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return createTranslationDisappearAnimator(viewGroup, view, this.slideEdge, getSlideDistanceOrDefault(view.getContext()));
    }

    @Px
    public int getSlideDistance() {
        return this.slideDistance;
    }

    public int getSlideEdge() {
        return this.slideEdge;
    }

    public void setSlideDistance(@Px int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
        }
        this.slideDistance = i7;
    }

    public void setSlideEdge(int i7) {
        this.slideEdge = i7;
    }
}
