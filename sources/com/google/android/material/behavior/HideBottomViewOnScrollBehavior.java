package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private static final int DEFAULT_ENTER_ANIMATION_DURATION_MS = 225;
    private static final int DEFAULT_EXIT_ANIMATION_DURATION_MS = 175;
    public static final int STATE_SCROLLED_DOWN = 1;
    public static final int STATE_SCROLLED_UP = 2;
    private AccessibilityManager accessibilityManager;
    private int additionalHiddenOffsetY;

    @Nullable
    private ViewPropertyAnimator currentAnimator;
    private int currentState;
    private boolean disableOnTouchExploration;
    private int enterAnimDuration;
    private TimeInterpolator enterAnimInterpolator;
    private int exitAnimDuration;
    private TimeInterpolator exitAnimInterpolator;
    private int height;

    @NonNull
    private final LinkedHashSet<OnScrollStateChangedListener> onScrollStateChangedListeners;
    private AccessibilityManager.TouchExplorationStateChangeListener touchExplorationListener;
    private static final int ENTER_ANIM_DURATION_ATTR = R.attr.motionDurationLong2;
    private static final int EXIT_ANIM_DURATION_ATTR = R.attr.motionDurationMedium4;
    private static final int ENTER_EXIT_ANIM_EASING_ATTR = R.attr.motionEasingEmphasizedInterpolator;

    public interface OnScrollStateChangedListener {
        void onStateChanged(@NonNull View view, int i7);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({c.f39801b})
    public @interface ScrollState {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.onScrollStateChangedListeners = new LinkedHashSet<>();
        this.height = 0;
        this.disableOnTouchExploration = true;
        this.currentState = 2;
        this.additionalHiddenOffsetY = 0;
    }

    private void animateChildTo(@NonNull V v3, int i7, long j6, TimeInterpolator timeInterpolator) {
        this.currentAnimator = v3.animate().translationY(i7).setInterpolator(timeInterpolator).setDuration(j6).setListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.behavior.HideBottomViewOnScrollBehavior.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                HideBottomViewOnScrollBehavior.this.currentAnimator = null;
            }
        });
    }

    private void disableIfTouchExplorationEnabled(V v3) {
        if (this.accessibilityManager == null) {
            this.accessibilityManager = (AccessibilityManager) v3.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager == null || this.touchExplorationListener != null) {
            return;
        }
        a aVar = new a(this, v3, 0);
        this.touchExplorationListener = aVar;
        accessibilityManager.addTouchExplorationStateChangeListener(aVar);
        v3.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.behavior.HideBottomViewOnScrollBehavior.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NonNull View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NonNull View view) {
                if (HideBottomViewOnScrollBehavior.this.touchExplorationListener == null || HideBottomViewOnScrollBehavior.this.accessibilityManager == null) {
                    return;
                }
                HideBottomViewOnScrollBehavior.this.accessibilityManager.removeTouchExplorationStateChangeListener(HideBottomViewOnScrollBehavior.this.touchExplorationListener);
                HideBottomViewOnScrollBehavior.this.touchExplorationListener = null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$disableIfTouchExplorationEnabled$0(View view, boolean z3) {
        if (z3 && isScrolledDown()) {
            slideUp(view);
        }
    }

    private void updateCurrentState(@NonNull V v3, int i7) {
        this.currentState = i7;
        Iterator<OnScrollStateChangedListener> it = this.onScrollStateChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onStateChanged(v3, this.currentState);
        }
    }

    public void addOnScrollStateChangedListener(@NonNull OnScrollStateChangedListener onScrollStateChangedListener) {
        this.onScrollStateChangedListeners.add(onScrollStateChangedListener);
    }

    public void clearOnScrollStateChangedListeners() {
        this.onScrollStateChangedListeners.clear();
    }

    public void disableOnTouchExploration(boolean z3) {
        this.disableOnTouchExploration = z3;
    }

    public boolean isDisabledOnTouchExploration() {
        return this.disableOnTouchExploration;
    }

    public boolean isScrolledDown() {
        return this.currentState == 1;
    }

    public boolean isScrolledUp() {
        return this.currentState == 2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, int i7) {
        this.height = v3.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v3.getLayoutParams()).bottomMargin;
        this.enterAnimDuration = MotionUtils.resolveThemeDuration(v3.getContext(), ENTER_ANIM_DURATION_ATTR, 225);
        this.exitAnimDuration = MotionUtils.resolveThemeDuration(v3.getContext(), EXIT_ANIM_DURATION_ATTR, DEFAULT_EXIT_ANIMATION_DURATION_MS);
        Context context = v3.getContext();
        int i10 = ENTER_EXIT_ANIM_EASING_ATTR;
        this.enterAnimInterpolator = MotionUtils.resolveThemeInterpolator(context, i10, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        this.exitAnimInterpolator = MotionUtils.resolveThemeInterpolator(v3.getContext(), i10, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        disableIfTouchExplorationEnabled(v3);
        return super.onLayoutChild(coordinatorLayout, v3, i7);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, int i7, int i10, int i11, int i12, int i13, @NonNull int[] iArr) {
        if (i10 > 0) {
            slideDown(v3);
        } else if (i10 < 0) {
            slideUp(v3);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, @NonNull View view2, int i7, int i10) {
        return i7 == 2;
    }

    public void removeOnScrollStateChangedListener(@NonNull OnScrollStateChangedListener onScrollStateChangedListener) {
        this.onScrollStateChangedListeners.remove(onScrollStateChangedListener);
    }

    public void setAdditionalHiddenOffsetY(@NonNull V v3, @Dimension int i7) {
        this.additionalHiddenOffsetY = i7;
        if (this.currentState == 1) {
            v3.setTranslationY(this.height + i7);
        }
    }

    public void slideDown(@NonNull V v3) {
        slideDown(v3, true);
    }

    public void slideUp(@NonNull V v3) {
        slideUp(v3, true);
    }

    public void slideDown(@NonNull V v3, boolean z3) {
        AccessibilityManager accessibilityManager;
        if (isScrolledDown()) {
            return;
        }
        if (this.disableOnTouchExploration && (accessibilityManager = this.accessibilityManager) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v3.clearAnimation();
        }
        updateCurrentState(v3, 1);
        int i7 = this.height + this.additionalHiddenOffsetY;
        if (z3) {
            animateChildTo(v3, i7, this.exitAnimDuration, this.exitAnimInterpolator);
        } else {
            v3.setTranslationY(i7);
        }
    }

    public void slideUp(@NonNull V v3, boolean z3) {
        if (isScrolledUp()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v3.clearAnimation();
        }
        updateCurrentState(v3, 2);
        if (z3) {
            animateChildTo(v3, 0, this.enterAnimDuration, this.enterAnimInterpolator);
        } else {
            v3.setTranslationY(0);
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.onScrollStateChangedListeners = new LinkedHashSet<>();
        this.height = 0;
        this.disableOnTouchExploration = true;
        this.currentState = 2;
        this.additionalHiddenOffsetY = 0;
    }
}
