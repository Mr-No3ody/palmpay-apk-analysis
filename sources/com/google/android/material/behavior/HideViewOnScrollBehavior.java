package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.F;
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
public class HideViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private static final int DEFAULT_ENTER_ANIMATION_DURATION_MS = 225;
    private static final int DEFAULT_EXIT_ANIMATION_DURATION_MS = 175;
    public static final int EDGE_BOTTOM = 1;
    public static final int EDGE_LEFT = 2;
    public static final int EDGE_RIGHT = 0;
    public static final int STATE_SCROLLED_IN = 2;
    public static final int STATE_SCROLLED_OUT = 1;
    private AccessibilityManager accessibilityManager;
    private int additionalHiddenOffset;

    @Nullable
    private ViewPropertyAnimator currentAnimator;
    private int currentState;
    private boolean disableOnTouchExploration;
    private int enterAnimDuration;

    @Nullable
    private TimeInterpolator enterAnimInterpolator;
    private int exitAnimDuration;

    @Nullable
    private TimeInterpolator exitAnimInterpolator;
    private HideViewOnScrollDelegate hideOnScrollViewDelegate;

    @NonNull
    private final LinkedHashSet<OnScrollStateChangedListener> onScrollStateChangedListeners;
    private int size;
    private AccessibilityManager.TouchExplorationStateChangeListener touchExplorationListener;
    private boolean viewEdgeOverride;
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

    public HideViewOnScrollBehavior(int i7) {
        this();
        setViewEdge(i7);
    }

    private void animateChildTo(@NonNull V v3, int i7, long j6, @NonNull TimeInterpolator timeInterpolator) {
        this.currentAnimator = this.hideOnScrollViewDelegate.getViewTranslationAnimator(v3, i7).setInterpolator(timeInterpolator).setDuration(j6).setListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.behavior.HideViewOnScrollBehavior.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                HideViewOnScrollBehavior.this.currentAnimator = null;
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
        a aVar = new a(this, v3, 1);
        this.touchExplorationListener = aVar;
        accessibilityManager.addTouchExplorationStateChangeListener(aVar);
        v3.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.behavior.HideViewOnScrollBehavior.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NonNull View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NonNull View view) {
                if (HideViewOnScrollBehavior.this.touchExplorationListener == null || HideViewOnScrollBehavior.this.accessibilityManager == null) {
                    return;
                }
                HideViewOnScrollBehavior.this.accessibilityManager.removeTouchExplorationStateChangeListener(HideViewOnScrollBehavior.this.touchExplorationListener);
                HideViewOnScrollBehavior.this.touchExplorationListener = null;
            }
        });
    }

    @NonNull
    public static <V extends View> HideViewOnScrollBehavior<V> from(@NonNull V v3) {
        ViewGroup.LayoutParams layoutParams = v3.getLayoutParams();
        if (!(layoutParams instanceof androidx.coordinatorlayout.widget.c)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.c) layoutParams).f15872a;
        if (behavior instanceof HideViewOnScrollBehavior) {
            return (HideViewOnScrollBehavior) behavior;
        }
        throw new IllegalArgumentException("The view is not associated with HideViewOnScrollBehavior");
    }

    private boolean isGravityBottom(int i7) {
        return i7 == 80 || i7 == 81;
    }

    private boolean isGravityLeft(int i7) {
        return i7 == 3 || i7 == 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$disableIfTouchExplorationEnabled$0(View view, boolean z3) {
        if (this.disableOnTouchExploration && z3 && isScrolledOut()) {
            slideIn(view);
        }
    }

    private void setViewEdge(@NonNull V v3, int i7) {
        if (this.viewEdgeOverride) {
            return;
        }
        int i10 = ((androidx.coordinatorlayout.widget.c) v3.getLayoutParams()).f15874c;
        if (isGravityBottom(i10)) {
            setViewEdgeInternal(1);
        } else {
            setViewEdgeInternal(isGravityLeft(Gravity.getAbsoluteGravity(i10, i7)) ? 2 : 0);
        }
    }

    private void setViewEdgeInternal(int i7) {
        HideViewOnScrollDelegate hideViewOnScrollDelegate = this.hideOnScrollViewDelegate;
        if (hideViewOnScrollDelegate == null || hideViewOnScrollDelegate.getViewEdge() != i7) {
            if (i7 == 0) {
                this.hideOnScrollViewDelegate = new HideRightViewOnScrollDelegate();
            } else if (i7 == 1) {
                this.hideOnScrollViewDelegate = new HideBottomViewOnScrollDelegate();
            } else {
                if (i7 != 2) {
                    throw new IllegalArgumentException(F.c(i7, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
                }
                this.hideOnScrollViewDelegate = new HideLeftViewOnScrollDelegate();
            }
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

    public boolean isScrolledIn() {
        return this.currentState == 2;
    }

    public boolean isScrolledOut() {
        return this.currentState == 1;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, int i7) {
        disableIfTouchExplorationEnabled(v3);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v3.getLayoutParams();
        setViewEdge(v3, i7);
        this.size = this.hideOnScrollViewDelegate.getSize(v3, marginLayoutParams);
        this.enterAnimDuration = MotionUtils.resolveThemeDuration(v3.getContext(), ENTER_ANIM_DURATION_ATTR, 225);
        this.exitAnimDuration = MotionUtils.resolveThemeDuration(v3.getContext(), EXIT_ANIM_DURATION_ATTR, DEFAULT_EXIT_ANIMATION_DURATION_MS);
        Context context = v3.getContext();
        int i10 = ENTER_EXIT_ANIM_EASING_ATTR;
        this.enterAnimInterpolator = MotionUtils.resolveThemeInterpolator(context, i10, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        this.exitAnimInterpolator = MotionUtils.resolveThemeInterpolator(v3.getContext(), i10, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        return super.onLayoutChild(coordinatorLayout, v3, i7);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, int i7, int i10, int i11, int i12, int i13, @NonNull int[] iArr) {
        if (i10 > 0) {
            slideOut(v3);
        } else if (i10 < 0) {
            slideIn(v3);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, @NonNull View view2, int i7, int i10) {
        return i7 == 2;
    }

    public void removeOnScrollStateChangedListener(@NonNull OnScrollStateChangedListener onScrollStateChangedListener) {
        this.onScrollStateChangedListeners.remove(onScrollStateChangedListener);
    }

    public void setAdditionalHiddenOffset(@NonNull V v3, @Dimension int i7) {
        this.additionalHiddenOffset = i7;
        if (this.currentState == 1) {
            this.hideOnScrollViewDelegate.setAdditionalHiddenOffset(v3, this.size, i7);
        }
    }

    public void slideIn(@NonNull V v3) {
        slideIn(v3, true);
    }

    public void slideOut(@NonNull V v3) {
        slideOut(v3, true);
    }

    public void slideIn(@NonNull V v3, boolean z3) {
        if (isScrolledIn()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v3.clearAnimation();
        }
        updateCurrentState(v3, 2);
        int targetTranslation = this.hideOnScrollViewDelegate.getTargetTranslation();
        if (z3) {
            animateChildTo(v3, targetTranslation, this.enterAnimDuration, this.enterAnimInterpolator);
        } else {
            this.hideOnScrollViewDelegate.setViewTranslation(v3, targetTranslation);
        }
    }

    public void slideOut(@NonNull V v3, boolean z3) {
        AccessibilityManager accessibilityManager;
        if (isScrolledOut()) {
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
        int i7 = this.size + this.additionalHiddenOffset;
        if (z3) {
            animateChildTo(v3, i7, this.exitAnimDuration, this.exitAnimInterpolator);
        } else {
            this.hideOnScrollViewDelegate.setViewTranslation(v3, i7);
        }
    }

    public HideViewOnScrollBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.disableOnTouchExploration = true;
        this.onScrollStateChangedListeners = new LinkedHashSet<>();
        this.size = 0;
        this.currentState = 2;
        this.additionalHiddenOffset = 0;
        this.viewEdgeOverride = false;
    }

    public void setViewEdge(int i7) {
        this.viewEdgeOverride = true;
        setViewEdgeInternal(i7);
    }

    public HideViewOnScrollBehavior() {
        this.disableOnTouchExploration = true;
        this.onScrollStateChangedListeners = new LinkedHashSet<>();
        this.size = 0;
        this.currentState = 2;
        this.additionalHiddenOffset = 0;
        this.viewEdgeOverride = false;
    }
}
