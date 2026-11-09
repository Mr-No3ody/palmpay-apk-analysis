package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.C0812c;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.FadeThroughUpdateListener;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.RectEvaluator;
import com.google.android.material.internal.ReversableAnimatedValueInterpolator;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
class SearchViewAnimationHelper {
    private static final float CONTENT_FROM_SCALE = 0.95f;
    private static final long HIDE_CLEAR_BUTTON_ALPHA_DURATION_MS = 42;
    private static final long HIDE_CLEAR_BUTTON_ALPHA_START_DELAY_MS = 0;
    private static final long HIDE_CONTENT_ALPHA_DURATION_MS = 83;
    private static final long HIDE_CONTENT_ALPHA_START_DELAY_MS = 0;
    private static final long HIDE_CONTENT_SCALE_DURATION_MS = 250;
    private static final long HIDE_DURATION_MS = 250;
    private static final long HIDE_TRANSLATE_DURATION_MS = 300;
    private static final long SHOW_CLEAR_BUTTON_ALPHA_DURATION_MS = 50;
    private static final long SHOW_CLEAR_BUTTON_ALPHA_START_DELAY_MS = 250;
    private static final long SHOW_CONTENT_ALPHA_DURATION_MS = 150;
    private static final long SHOW_CONTENT_ALPHA_START_DELAY_MS = 75;
    private static final long SHOW_CONTENT_SCALE_DURATION_MS = 300;
    private static final long SHOW_DURATION_MS = 300;
    private static final long SHOW_SCRIM_ALPHA_DURATION_MS = 100;
    private static final long SHOW_TRANSLATE_DURATION_MS = 350;
    private static final long SHOW_TRANSLATE_KEYBOARD_START_DELAY_MS = 150;
    private final MaterialMainContainerBackHelper backHelper;

    @Nullable
    private AnimatorSet backProgressAnimatorSet;
    private final ImageButton clearButton;
    private final TouchObserverFrameLayout contentContainer;
    private final View divider;
    private final Toolbar dummyToolbar;
    private final EditText editText;
    private final FrameLayout headerContainer;
    private final ClippableRoundedCornerLayout rootView;
    private final View scrim;
    private SearchBar searchBar;
    private final TextView searchPrefix;
    private final SearchView searchView;
    private final LinearLayout textContainer;
    private final Toolbar toolbar;
    private final FrameLayout toolbarContainer;

    public SearchViewAnimationHelper(SearchView searchView) {
        this.searchView = searchView;
        this.scrim = searchView.scrim;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.rootView;
        this.rootView = clippableRoundedCornerLayout;
        this.headerContainer = searchView.headerContainer;
        this.toolbarContainer = searchView.toolbarContainer;
        this.toolbar = searchView.toolbar;
        this.dummyToolbar = searchView.dummyToolbar;
        this.searchPrefix = searchView.searchPrefix;
        this.editText = searchView.editText;
        this.clearButton = searchView.clearButton;
        this.divider = searchView.divider;
        this.contentContainer = searchView.contentContainer;
        this.textContainer = searchView.textContainer;
        this.backHelper = new MaterialMainContainerBackHelper(clippableRoundedCornerLayout);
    }

    private void addActionMenuViewAnimatorIfNeeded(AnimatorSet animatorSet) {
        ActionMenuView actionMenuView = ToolbarUtils.getActionMenuView(this.toolbar);
        if (actionMenuView == null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getTranslationXBetweenViews(ToolbarUtils.getActionMenuView(this.searchBar), actionMenuView), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.translationXListener(actionMenuView));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(getFromTranslationY(), 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(MultiViewUpdateListener.translationYListener(actionMenuView));
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
    }

    private void addBackButtonAnimatorIfNeeded(AnimatorSet animatorSet, ImageButton imageButton) {
        SearchBar searchBar = this.searchBar;
        if (searchBar == null || searchBar.getNavigationIcon() != null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(imageButton, 4));
        animatorSet.playTogether(valueAnimatorOfFloat);
    }

    private void addBackButtonProgressAnimatorIfNeeded(AnimatorSet animatorSet) {
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this.toolbar);
        if (navigationIconButton == null) {
            return;
        }
        Drawable drawableP0 = org.chromium.support_lib_boundary.util.b.p0(navigationIconButton.getDrawable());
        if (!this.searchView.isAnimatedNavigationIcon()) {
            setFullDrawableProgressIfNeeded(drawableP0);
            return;
        }
        addDrawerArrowDrawableAnimatorIfNeeded(animatorSet, drawableP0);
        addFadeThroughDrawableAnimatorIfNeeded(animatorSet, drawableP0);
        addBackButtonAnimatorIfNeeded(animatorSet, navigationIconButton);
    }

    private void addBackButtonTranslationAnimatorIfNeeded(AnimatorSet animatorSet) {
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this.toolbar);
        if (navigationIconButton == null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getTranslationXBetweenViews(ToolbarUtils.getNavigationIconButton(this.searchBar), navigationIconButton), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.translationXListener(navigationIconButton));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(getFromTranslationY(), 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(MultiViewUpdateListener.translationYListener(navigationIconButton));
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
    }

    private void addDrawerArrowDrawableAnimatorIfNeeded(AnimatorSet animatorSet, Drawable drawable) {
        int i7 = 1;
        if (drawable instanceof p300u.b) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new a((p300u.b) drawable, i7));
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
    }

    private void addEditTextClipAnimator(AnimatorSet animatorSet) {
        int i7 = 1;
        if (this.searchBar == null || !TextUtils.equals(this.editText.getText(), this.searchBar.getText())) {
            return;
        }
        Rect rect = new Rect(0, 0, this.editText.getWidth(), this.editText.getHeight());
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.searchBar.getTextView().getWidth(), this.editText.getWidth());
        valueAnimatorOfInt.addUpdateListener(new e(i7, this, rect));
        animatorSet.playTogether(valueAnimatorOfInt);
    }

    private void addFadeThroughDrawableAnimatorIfNeeded(AnimatorSet animatorSet, Drawable drawable) {
        int i7 = 2;
        if (drawable instanceof FadeThroughDrawable) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new a((FadeThroughDrawable) drawable, i7));
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
    }

    private void addTextFadeAnimatorIfNeeded(AnimatorSet animatorSet) {
        if (this.searchBar == null || TextUtils.equals(this.editText.getText(), this.searchBar.getText())) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(this, 3));
        animatorSet.playTogether(valueAnimatorOfFloat);
    }

    private Animator getActionMenuViewsAlphaAnimator(boolean z3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z3 ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z3, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        if (this.searchView.isMenuItemsAnimated()) {
            valueAnimatorOfFloat.addUpdateListener(new FadeThroughUpdateListener(ToolbarUtils.getActionMenuView(this.dummyToolbar), ToolbarUtils.getActionMenuView(this.toolbar)));
        }
        return valueAnimatorOfFloat;
    }

    private AnimatorSet getButtonsProgressAnimator(boolean z3) {
        AnimatorSet animatorSet = new AnimatorSet();
        addBackButtonProgressAnimatorIfNeeded(animatorSet);
        animatorSet.setDuration(z3 ? 300L : 250L);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(z3, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    private AnimatorSet getButtonsTranslationAnimator(boolean z3) {
        AnimatorSet animatorSet = new AnimatorSet();
        addBackButtonTranslationAnimatorIfNeeded(animatorSet);
        addActionMenuViewAnimatorIfNeeded(animatorSet);
        animatorSet.setDuration(z3 ? 300L : 250L);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(z3, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    private Animator getClearButtonAnimator(boolean z3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z3 ? SHOW_CLEAR_BUTTON_ALPHA_DURATION_MS : HIDE_CLEAR_BUTTON_ALPHA_DURATION_MS);
        valueAnimatorOfFloat.setStartDelay(z3 ? 250L : 0L);
        valueAnimatorOfFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z3, AnimationUtils.LINEAR_INTERPOLATOR));
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(this.clearButton));
        return valueAnimatorOfFloat;
    }

    private Animator getContentAlphaAnimator(boolean z3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z3 ? 150L : HIDE_CONTENT_ALPHA_DURATION_MS);
        valueAnimatorOfFloat.setStartDelay(z3 ? 75L : 0L);
        valueAnimatorOfFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z3, AnimationUtils.LINEAR_INTERPOLATOR));
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(this.divider, this.contentContainer));
        return valueAnimatorOfFloat;
    }

    private Animator getContentAnimator(boolean z3) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(getContentAlphaAnimator(z3), getDividerAnimator(z3), getContentScaleAnimator(z3));
        return animatorSet;
    }

    private Animator getContentScaleAnimator(boolean z3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(CONTENT_FROM_SCALE, 1.0f);
        valueAnimatorOfFloat.setDuration(z3 ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z3, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.scaleListener(this.contentContainer));
        return valueAnimatorOfFloat;
    }

    private Animator getDividerAnimator(boolean z3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat((this.contentContainer.getHeight() * 0.050000012f) / 2.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(z3 ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z3, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.translationYListener(this.divider));
        return valueAnimatorOfFloat;
    }

    private Animator getDummyToolbarAnimator(boolean z3) {
        Toolbar toolbar = this.dummyToolbar;
        return getTranslationAnimator(z3, toolbar, getFromTranslationXEnd(toolbar), getFromTranslationY());
    }

    private Animator getEditTextAnimator(boolean z3) {
        return getTranslationAnimatorForText(z3, this.editText);
    }

    private AnimatorSet getExpandCollapseAnimatorSet(final boolean z3) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.backProgressAnimatorSet == null) {
            animatorSet.playTogether(getButtonsProgressAnimator(z3), getButtonsTranslationAnimator(z3));
        }
        animatorSet.playTogether(getScrimAlphaAnimator(z3), getRootViewAnimator(z3), getClearButtonAnimator(z3), getContentAnimator(z3), getHeaderContainerAnimator(z3), getDummyToolbarAnimator(z3), getActionMenuViewsAlphaAnimator(z3), getEditTextAnimator(z3), getSearchPrefixAnimator(z3), getTextAnimator(z3));
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SearchViewAnimationHelper.this.setContentViewsAlpha(z3 ? 1.0f : 0.0f);
                SearchViewAnimationHelper.this.editText.setAlpha(1.0f);
                if (SearchViewAnimationHelper.this.searchBar != null) {
                    SearchViewAnimationHelper.this.searchBar.getTextView().setAlpha(1.0f);
                }
                SearchViewAnimationHelper.this.editText.setClipBounds(null);
                SearchViewAnimationHelper.this.rootView.resetClipBoundsAndCornerRadii();
                if (z3) {
                    return;
                }
                SearchViewAnimationHelper.this.backHelper.clearExpandedCornerRadii();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                SearchViewAnimationHelper.this.setContentViewsAlpha(z3 ? 0.0f : 1.0f);
            }
        });
        return animatorSet;
    }

    private int getFromTranslationXEnd(View view) {
        int marginEnd = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginEnd();
        int viewLeftFromSearchViewParent = getViewLeftFromSearchViewParent(this.searchBar);
        return ViewUtils.isLayoutRtl(this.searchBar) ? viewLeftFromSearchViewParent - marginEnd : ((this.searchBar.getWidth() + viewLeftFromSearchViewParent) + marginEnd) - this.searchView.getWidth();
    }

    private int getFromTranslationY() {
        return ((this.searchBar.getHeight() / 2) + getViewTopFromSearchViewParent(this.searchBar)) - ((this.toolbarContainer.getHeight() / 2) + this.toolbarContainer.getTop());
    }

    private Animator getHeaderContainerAnimator(boolean z3) {
        FrameLayout frameLayout = this.headerContainer;
        return getTranslationAnimator(z3, frameLayout, getFromTranslationXEnd(frameLayout), getFromTranslationY());
    }

    private Animator getRootViewAnimator(boolean z3) {
        Rect initialHideToClipBounds = this.backHelper.getInitialHideToClipBounds();
        Rect initialHideFromClipBounds = this.backHelper.getInitialHideFromClipBounds();
        if (initialHideToClipBounds == null) {
            initialHideToClipBounds = ViewUtils.calculateRectFromBounds(this.searchView);
        }
        if (initialHideFromClipBounds == null) {
            initialHideFromClipBounds = ViewUtils.calculateOffsetRectFromBounds(this.rootView, this.searchBar);
        }
        final Rect rect = new Rect(initialHideFromClipBounds);
        final float cornerSize = this.searchBar.getCornerSize();
        final float[] fArrMaxCornerRadii = maxCornerRadii(this.rootView.getCornerRadii(), this.backHelper.getExpandedCornerRadii());
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new RectEvaluator(rect), initialHideFromClipBounds, initialHideToClipBounds);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f22563a.lambda$getRootViewAnimator$2(cornerSize, fArrMaxCornerRadii, rect, valueAnimator);
            }
        });
        valueAnimatorOfObject.setDuration(z3 ? 300L : 250L);
        valueAnimatorOfObject.setInterpolator(ReversableAnimatedValueInterpolator.of(z3, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return valueAnimatorOfObject;
    }

    private Animator getScrimAlphaAnimator(boolean z3) {
        TimeInterpolator timeInterpolator = z3 ? AnimationUtils.LINEAR_INTERPOLATOR : AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z3 ? 300L : 250L);
        valueAnimatorOfFloat.setStartDelay(z3 ? SHOW_SCRIM_ALPHA_DURATION_MS : 0L);
        valueAnimatorOfFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z3, timeInterpolator));
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(this.scrim));
        return valueAnimatorOfFloat;
    }

    private Animator getSearchPrefixAnimator(boolean z3) {
        return getTranslationAnimatorForText(z3, this.searchPrefix);
    }

    private AnimatorSet getTextAnimator(boolean z3) {
        AnimatorSet animatorSet = new AnimatorSet();
        addTextFadeAnimatorIfNeeded(animatorSet);
        addEditTextClipAnimator(animatorSet);
        animatorSet.setDuration(z3 ? 300L : 250L);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(z3, AnimationUtils.LINEAR_INTERPOLATOR));
        return animatorSet;
    }

    private AnimatorSet getTranslateAnimatorSet(boolean z3) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(getTranslationYAnimator());
        addBackButtonProgressAnimatorIfNeeded(animatorSet);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(z3, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        animatorSet.setDuration(z3 ? SHOW_TRANSLATE_DURATION_MS : 300L);
        return animatorSet;
    }

    private Animator getTranslationAnimator(boolean z3, View view, int i7, int i10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i7, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.translationXListener(view));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(i10, 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(MultiViewUpdateListener.translationYListener(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.setDuration(z3 ? 300L : 250L);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(z3, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    private Animator getTranslationAnimatorForText(boolean z3, View view) {
        TextView placeholderTextView = this.searchBar.getPlaceholderTextView();
        if (TextUtils.isEmpty(placeholderTextView.getText()) || z3) {
            placeholderTextView = this.searchBar.getTextView();
        }
        return getTranslationAnimator(z3, view, getViewLeftFromSearchViewParent(placeholderTextView) - (this.textContainer.getLeft() + view.getLeft()), getFromTranslationY());
    }

    private int getTranslationXBetweenViews(@Nullable View view, @NonNull View view2) {
        if (view != null) {
            return getViewLeftFromSearchViewParent(view) - getViewLeftFromSearchViewParent(view2);
        }
        int marginStart = ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).getMarginStart();
        int paddingStart = this.searchBar.getPaddingStart();
        int viewLeftFromSearchViewParent = getViewLeftFromSearchViewParent(this.searchBar);
        return ViewUtils.isLayoutRtl(this.searchBar) ? (((this.searchBar.getWidth() + viewLeftFromSearchViewParent) + marginStart) - paddingStart) - this.searchView.getRight() : (viewLeftFromSearchViewParent - marginStart) + paddingStart;
    }

    private Animator getTranslationYAnimator() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.rootView.getHeight(), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.translationYListener(this.rootView));
        return valueAnimatorOfFloat;
    }

    private int getViewLeftFromSearchViewParent(@NonNull View view) {
        int left = view.getLeft();
        for (ViewParent parent = view.getParent(); (parent instanceof View) && parent != this.searchView.getParent(); parent = parent.getParent()) {
            left += ((View) parent).getLeft();
        }
        return left;
    }

    private int getViewTopFromSearchViewParent(@NonNull View view) {
        int top2 = view.getTop();
        for (ViewParent parent = view.getParent(); (parent instanceof View) && parent != this.searchView.getParent(); parent = parent.getParent()) {
            top2 += ((View) parent).getTop();
        }
        return top2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addBackButtonAnimatorIfNeeded$3(ImageButton imageButton, ValueAnimator valueAnimator) {
        imageButton.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addDrawerArrowDrawableAnimatorIfNeeded$4(p300u.b bVar, ValueAnimator valueAnimator) {
        bVar.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addEditTextClipAnimator$6(Rect rect, ValueAnimator valueAnimator) {
        rect.right = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.editText.setClipBounds(rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addFadeThroughDrawableAnimatorIfNeeded$5(FadeThroughDrawable fadeThroughDrawable, ValueAnimator valueAnimator) {
        fadeThroughDrawable.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addTextFadeAnimatorIfNeeded$7(ValueAnimator valueAnimator) {
        this.editText.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.searchBar.getTextView().setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getRootViewAnimator$2(float f10, float[] fArr, Rect rect, ValueAnimator valueAnimator) {
        this.rootView.updateClipBoundsAndCornerRadii(rect, lerpCornerRadii(f10, fArr, valueAnimator.getAnimatedFraction()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startShowAnimationExpand$0() {
        AnimatorSet expandCollapseAnimatorSet = getExpandCollapseAnimatorSet(true);
        expandCollapseAnimatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (!SearchViewAnimationHelper.this.searchView.isAdjustNothingSoftInputMode()) {
                    SearchViewAnimationHelper.this.searchView.requestFocusAndShowKeyboardIfNeeded();
                }
                SearchViewAnimationHelper.this.searchView.setTransitionState(SearchView.TransitionState.SHOWN);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                SearchViewAnimationHelper.this.rootView.setVisibility(0);
                SearchViewAnimationHelper.this.searchBar.stopOnLoadAnimation();
            }
        });
        expandCollapseAnimatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startShowAnimationTranslate$1() {
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.rootView;
        clippableRoundedCornerLayout.setTranslationY(clippableRoundedCornerLayout.getHeight());
        AnimatorSet translateAnimatorSet = getTranslateAnimatorSet(true);
        translateAnimatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (!SearchViewAnimationHelper.this.searchView.isAdjustNothingSoftInputMode()) {
                    SearchViewAnimationHelper.this.searchView.requestFocusAndShowKeyboardIfNeeded();
                }
                SearchViewAnimationHelper.this.searchView.setTransitionState(SearchView.TransitionState.SHOWN);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                SearchViewAnimationHelper.this.rootView.setVisibility(0);
                SearchViewAnimationHelper.this.searchView.setTransitionState(SearchView.TransitionState.SHOWING);
            }
        });
        translateAnimatorSet.start();
    }

    private static float[] lerpCornerRadii(float f10, float[] fArr, float f11) {
        return new float[]{AnimationUtils.lerp(f10, fArr[0], f11), AnimationUtils.lerp(f10, fArr[1], f11), AnimationUtils.lerp(f10, fArr[2], f11), AnimationUtils.lerp(f10, fArr[3], f11), AnimationUtils.lerp(f10, fArr[4], f11), AnimationUtils.lerp(f10, fArr[5], f11), AnimationUtils.lerp(f10, fArr[6], f11), AnimationUtils.lerp(f10, fArr[7], f11)};
    }

    private static float[] maxCornerRadii(float[] fArr, float[] fArr2) {
        return new float[]{Math.max(fArr[0], fArr2[0]), Math.max(fArr[1], fArr2[1]), Math.max(fArr[2], fArr2[2]), Math.max(fArr[3], fArr2[3]), Math.max(fArr[4], fArr2[4]), Math.max(fArr[5], fArr2[5]), Math.max(fArr[6], fArr2[6]), Math.max(fArr[7], fArr2[7])};
    }

    private void setActionMenuViewAlphaIfNeeded(float f10) {
        ActionMenuView actionMenuView;
        if (!this.searchView.isMenuItemsAnimated() || (actionMenuView = ToolbarUtils.getActionMenuView(this.toolbar)) == null) {
            return;
        }
        actionMenuView.setAlpha(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentViewsAlpha(float f10) {
        this.clearButton.setAlpha(f10);
        this.divider.setAlpha(f10);
        this.contentContainer.setAlpha(f10);
        setActionMenuViewAlphaIfNeeded(f10);
    }

    private void setFullDrawableProgressIfNeeded(Drawable drawable) {
        if (drawable instanceof p300u.b) {
            ((p300u.b) drawable).setProgress(1.0f);
        }
        if (drawable instanceof FadeThroughDrawable) {
            ((FadeThroughDrawable) drawable).setProgress(1.0f);
        }
    }

    private void setMenuItemsNotClickable(Toolbar toolbar) {
        ActionMenuView actionMenuView = ToolbarUtils.getActionMenuView(toolbar);
        if (actionMenuView != null) {
            for (int i7 = 0; i7 < actionMenuView.getChildCount(); i7++) {
                View childAt = actionMenuView.getChildAt(i7);
                childAt.setClickable(false);
                childAt.setFocusable(false);
                childAt.setFocusableInTouchMode(false);
            }
        }
    }

    private void setUpDummyToolbarIfNeeded() {
        Menu menu = this.dummyToolbar.getMenu();
        if (menu != null) {
            menu.clear();
        }
        if (this.searchBar.getMenuResId() == -1 || !this.searchView.isMenuItemsAnimated()) {
            this.dummyToolbar.setVisibility(8);
            return;
        }
        this.dummyToolbar.inflateMenu(this.searchBar.getMenuResId());
        setMenuItemsNotClickable(this.dummyToolbar);
        this.dummyToolbar.setVisibility(0);
    }

    private AnimatorSet startHideAnimationCollapse() {
        if (this.searchView.isAdjustNothingSoftInputMode()) {
            this.searchView.clearFocusAndHideKeyboard();
        }
        AnimatorSet expandCollapseAnimatorSet = getExpandCollapseAnimatorSet(false);
        expandCollapseAnimatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SearchViewAnimationHelper.this.rootView.setVisibility(8);
                if (!SearchViewAnimationHelper.this.searchView.isAdjustNothingSoftInputMode()) {
                    SearchViewAnimationHelper.this.searchView.clearFocusAndHideKeyboard();
                }
                SearchViewAnimationHelper.this.searchView.setTransitionState(SearchView.TransitionState.HIDDEN);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                SearchViewAnimationHelper.this.searchView.setTransitionState(SearchView.TransitionState.HIDING);
            }
        });
        expandCollapseAnimatorSet.start();
        return expandCollapseAnimatorSet;
    }

    private AnimatorSet startHideAnimationTranslate() {
        if (this.searchView.isAdjustNothingSoftInputMode()) {
            this.searchView.clearFocusAndHideKeyboard();
        }
        AnimatorSet translateAnimatorSet = getTranslateAnimatorSet(false);
        translateAnimatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SearchViewAnimationHelper.this.rootView.setVisibility(8);
                if (!SearchViewAnimationHelper.this.searchView.isAdjustNothingSoftInputMode()) {
                    SearchViewAnimationHelper.this.searchView.clearFocusAndHideKeyboard();
                }
                SearchViewAnimationHelper.this.searchView.setTransitionState(SearchView.TransitionState.HIDDEN);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                SearchViewAnimationHelper.this.searchView.setTransitionState(SearchView.TransitionState.HIDING);
            }
        });
        translateAnimatorSet.start();
        return translateAnimatorSet;
    }

    private void startShowAnimationExpand() {
        if (this.searchView.isAdjustNothingSoftInputMode()) {
            this.searchView.requestFocusAndShowKeyboardIfNeeded();
        }
        this.searchView.setTransitionState(SearchView.TransitionState.SHOWING);
        setUpDummyToolbarIfNeeded();
        this.editText.setText(this.searchBar.getText());
        EditText editText = this.editText;
        editText.setSelection(editText.getText().length());
        this.rootView.setVisibility(4);
        this.rootView.post(new h(this, 1));
    }

    private void startShowAnimationTranslate() {
        if (this.searchView.isAdjustNothingSoftInputMode()) {
            SearchView searchView = this.searchView;
            Objects.requireNonNull(searchView);
            searchView.postDelayed(new g(searchView, 3), 150L);
        }
        this.rootView.setVisibility(4);
        this.rootView.post(new h(this, 2));
    }

    @RequiresApi(34)
    public void cancelBackProgress() {
        this.backHelper.cancelBackProgress(this.searchBar);
        AnimatorSet animatorSet = this.backProgressAnimatorSet;
        if (animatorSet != null) {
            animatorSet.reverse();
        }
        this.backProgressAnimatorSet = null;
    }

    @RequiresApi(34)
    public void finishBackProgress() {
        this.backHelper.finishBackProgress(hide().getTotalDuration(), this.searchBar);
        if (this.backProgressAnimatorSet != null) {
            getButtonsTranslationAnimator(false).start();
            this.backProgressAnimatorSet.resume();
        }
        this.backProgressAnimatorSet = null;
    }

    public MaterialMainContainerBackHelper getBackHelper() {
        return this.backHelper;
    }

    @CanIgnoreReturnValue
    public AnimatorSet hide() {
        return this.searchBar != null ? startHideAnimationCollapse() : startHideAnimationTranslate();
    }

    @Nullable
    public C0812c onHandleBackInvoked() {
        return this.backHelper.onHandleBackInvoked();
    }

    public void setSearchBar(SearchBar searchBar) {
        this.searchBar = searchBar;
    }

    public void show() {
        if (this.searchBar != null) {
            startShowAnimationExpand();
        } else {
            startShowAnimationTranslate();
        }
    }

    public void startBackProgress(@NonNull C0812c c0812c) {
        this.backHelper.startBackProgress(c0812c, this.searchBar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @RequiresApi(34)
    public void updateBackProgress(@NonNull C0812c c0812c) {
        if (c0812c.f12022c <= 0.0f) {
            return;
        }
        MaterialMainContainerBackHelper materialMainContainerBackHelper = this.backHelper;
        SearchBar searchBar = this.searchBar;
        materialMainContainerBackHelper.updateBackProgress(c0812c, searchBar, searchBar.getCornerSize());
        AnimatorSet animatorSet = this.backProgressAnimatorSet;
        if (animatorSet != null) {
            animatorSet.setCurrentPlayTime((long) (c0812c.f12022c * animatorSet.getDuration()));
            return;
        }
        if (this.searchView.isAdjustNothingSoftInputMode()) {
            this.searchView.clearFocusAndHideKeyboard();
        }
        if (this.searchView.isAnimatedNavigationIcon()) {
            AnimatorSet buttonsProgressAnimator = getButtonsProgressAnimator(false);
            this.backProgressAnimatorSet = buttonsProgressAnimator;
            buttonsProgressAnimator.start();
            this.backProgressAnimatorSet.pause();
        }
    }
}
