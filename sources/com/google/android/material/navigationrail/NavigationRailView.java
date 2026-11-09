package com.google.android.material.navigationrail;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.Z0;
import androidx.core.graphics.e;
import androidx.core.view.q0;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import androidx.transition.X;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.navigation.NavigationBarDividerView;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.resources.MaterialResources;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
public class NavigationRailView extends NavigationBarView {
    static final int COLLAPSED_MAX_ITEM_COUNT = 7;
    private static final TimeInterpolator CUBIC_BEZIER_INTERPOLATOR = new PathInterpolator(0.38f, 1.21f, 0.22f, 1.0f);
    private static final int DEFAULT_HEADER_GRAVITY = 49;
    static final int DEFAULT_MENU_GRAVITY = 49;
    private static final int EXPAND_DURATION = 500;
    private static final int FADE_DURATION = 100;
    static final int NO_ITEM_MINIMUM_HEIGHT = -1;
    private int collapsedIconGravity;
    private int collapsedItemGravity;
    private int collapsedItemMinHeight;
    private int collapsedItemSpacing;
    private NavigationRailFrameLayout contentContainer;
    private final int contentMarginTop;
    private boolean expanded;
    private int expandedIconGravity;
    private int expandedItemGravity;
    private int expandedItemMinHeight;
    private int expandedItemSpacing;
    private final int headerMarginBottom;

    @Nullable
    private View headerView;
    private final int maxExpandedWidth;
    private final int minExpandedWidth;

    @Nullable
    private Boolean paddingBottomSystemWindowInsets;

    @Nullable
    private Boolean paddingStartSystemWindowInsets;

    @Nullable
    private Boolean paddingTopSystemWindowInsets;
    private final boolean scrollingEnabled;
    private boolean submenuDividersEnabled;

    public NavigationRailView(@NonNull Context context) {
        this(context, null);
    }

    private void addContentContainer() {
        View view = (View) getMenuView();
        NavigationRailFrameLayout navigationRailFrameLayout = new NavigationRailFrameLayout(getContext());
        this.contentContainer = navigationRailFrameLayout;
        navigationRailFrameLayout.setPaddingTop(this.contentMarginTop);
        this.contentContainer.setScrollingEnabled(this.scrollingEnabled);
        this.contentContainer.setClipChildren(false);
        this.contentContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.contentContainer.addView(view);
        if (!this.scrollingEnabled) {
            addView(this.contentContainer);
            return;
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.addView(this.contentContainer);
        scrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(scrollView);
    }

    private void applyWindowInsets() {
        ViewUtils.doOnApplyWindowInsets(this, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.navigationrail.NavigationRailView.1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            @NonNull
            public q0 onApplyWindowInsets(View view, @NonNull q0 q0Var, @NonNull ViewUtils.RelativePadding relativePadding) {
                e eVarG = q0Var.f16277a.g(7);
                e eVarG2 = q0Var.f16277a.g(128);
                NavigationRailView navigationRailView = NavigationRailView.this;
                if (navigationRailView.shouldApplyWindowInsetPadding(navigationRailView.paddingTopSystemWindowInsets)) {
                    relativePadding.f22536top += eVarG.f16059b;
                }
                NavigationRailView navigationRailView2 = NavigationRailView.this;
                if (navigationRailView2.shouldApplyWindowInsetPadding(navigationRailView2.paddingBottomSystemWindowInsets)) {
                    relativePadding.bottom += eVarG.f16061d;
                }
                NavigationRailView navigationRailView3 = NavigationRailView.this;
                if (navigationRailView3.shouldApplyWindowInsetPadding(navigationRailView3.paddingStartSystemWindowInsets)) {
                    if (ViewUtils.isLayoutRtl(view)) {
                        relativePadding.start = Math.max(eVarG.f16060c, eVarG2.f16060c) + relativePadding.start;
                    } else {
                        relativePadding.start = Math.max(eVarG.f16058a, eVarG2.f16058a) + relativePadding.start;
                    }
                }
                relativePadding.applyToView(view);
                return q0Var;
            }
        });
    }

    private int getMaxChildWidth() {
        int childCount = getNavigationRailMenuView().getChildCount();
        int iMax = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getNavigationRailMenuView().getChildAt(i7);
            if (childAt.getVisibility() != 8 && !(childAt instanceof NavigationBarDividerView)) {
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
            }
        }
        return iMax;
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        return (NavigationRailMenuView) getMenuView();
    }

    private int makeExpandedWidthMeasureSpec(int i7, int i10) {
        int iMin = Math.min(this.minExpandedWidth, View.MeasureSpec.getSize(i7));
        if (View.MeasureSpec.getMode(i7) == 1073741824) {
            return i7;
        }
        int iMax = Math.max(i10, iMin);
        View view = this.headerView;
        if (view != null) {
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(getSuggestedMinimumWidth(), Math.min(iMax, this.maxExpandedWidth)), 1073741824);
    }

    private int makeMinWidthSpec(int i7) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i7) == 1073741824 || suggestedMinimumWidth <= 0) {
            return i7;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i7), getPaddingRight() + getPaddingLeft() + suggestedMinimumWidth), 1073741824);
    }

    private void setExpanded(boolean z3) {
        if (this.expanded == z3) {
            return;
        }
        startTransitionAnimation();
        this.expanded = z3;
        int i7 = this.collapsedIconGravity;
        int i10 = this.collapsedItemSpacing;
        int i11 = this.collapsedItemMinHeight;
        int i12 = this.collapsedItemGravity;
        if (z3) {
            i7 = this.expandedIconGravity;
            i10 = this.expandedItemSpacing;
            i11 = this.expandedItemMinHeight;
            i12 = this.expandedItemGravity;
        }
        getNavigationRailMenuView().setItemGravity(i12);
        super.setItemIconGravity(i7);
        getNavigationRailMenuView().setItemSpacing(i10);
        getNavigationRailMenuView().setItemMinimumHeight(i11);
        getNavigationRailMenuView().setExpanded(z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldApplyWindowInsetPadding(Boolean bool) {
        return bool != null ? bool.booleanValue() : getFitsSystemWindows();
    }

    private void startTransitionAnimation() {
        if (isLaidOut()) {
            Transition interpolator = new ChangeBounds().setDuration(500L).setInterpolator(CUBIC_BEZIER_INTERPOLATOR);
            Transition duration = new Fade().setDuration(100L);
            Transition duration2 = new Fade().setDuration(100L);
            LabelMoveTransition labelMoveTransition = new LabelMoveTransition();
            Transition duration3 = new Fade().setDuration(100L);
            int childCount = getNavigationRailMenuView().getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getNavigationRailMenuView().getChildAt(i7);
                if (childAt instanceof NavigationBarItemView) {
                    NavigationBarItemView navigationBarItemView = (NavigationBarItemView) childAt;
                    interpolator.excludeTarget((View) navigationBarItemView.getLabelGroup(), true);
                    interpolator.excludeTarget((View) navigationBarItemView.getExpandedLabelGroup(), true);
                    if (this.expanded) {
                        duration2.addTarget(navigationBarItemView.getExpandedLabelGroup());
                        duration.addTarget(navigationBarItemView.getLabelGroup());
                    } else {
                        duration2.addTarget(navigationBarItemView.getLabelGroup());
                        duration.addTarget(navigationBarItemView.getExpandedLabelGroup());
                    }
                    labelMoveTransition.addTarget(navigationBarItemView.getExpandedLabelGroup());
                }
                duration3.addTarget(childAt);
            }
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.k(0);
            transitionSet.f(interpolator);
            transitionSet.f(duration);
            transitionSet.f(labelMoveTransition);
            if (!this.expanded) {
                transitionSet.f(duration3);
            }
            TransitionSet transitionSet2 = new TransitionSet();
            transitionSet2.k(0);
            transitionSet2.f(duration2);
            if (this.expanded) {
                transitionSet2.f(duration3);
            }
            TransitionSet transitionSet3 = new TransitionSet();
            transitionSet3.k(1);
            transitionSet3.f(transitionSet2);
            transitionSet3.f(transitionSet);
            X.a((ViewGroup) getParent(), transitionSet3);
        }
    }

    public void addHeaderView(@LayoutRes int i7) {
        addHeaderView(LayoutInflater.from(getContext()).inflate(i7, (ViewGroup) this, false));
    }

    public void collapse() {
        if (this.expanded) {
            setExpanded(false);
            announceForAccessibility(getResources().getString(R.string.nav_rail_collapsed_a11y_label));
        }
    }

    public void expand() {
        if (this.expanded) {
            return;
        }
        setExpanded(true);
        announceForAccessibility(getResources().getString(R.string.nav_rail_expanded_a11y_label));
    }

    public int getCollapsedItemMinimumHeight() {
        return this.collapsedItemMinHeight;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    @RestrictTo({c.f39801b})
    public int getCollapsedMaxItemCount() {
        return 7;
    }

    public int getExpandedItemMinimumHeight() {
        return this.expandedItemMinHeight;
    }

    @Nullable
    public View getHeaderView() {
        return this.headerView;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getItemGravity() {
        return getNavigationRailMenuView().getItemGravity();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getItemIconGravity() {
        return getNavigationRailMenuView().getItemIconGravity();
    }

    public int getItemMinimumHeight() {
        return getNavigationRailMenuView().getItemMinimumHeight();
    }

    public int getItemSpacing() {
        return getNavigationRailMenuView().getItemSpacing();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return Integer.MAX_VALUE;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    public boolean getSubmenuDividersEnabled() {
        return this.submenuDividersEnabled;
    }

    public boolean isExpanded() {
        return this.expanded;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public boolean isSubMenuSupported() {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        int iMakeMinWidthSpec = makeMinWidthSpec(i7);
        if (this.expanded) {
            measureChild(getNavigationRailMenuView(), i7, i10);
            View view = this.headerView;
            if (view != null) {
                measureChild(view, i7, i10);
            }
            iMakeMinWidthSpec = makeExpandedWidthMeasureSpec(i7, getMaxChildWidth());
            if (getItemActiveIndicatorExpandedWidth() == -1) {
                getNavigationRailMenuView().updateActiveIndicator(View.MeasureSpec.getSize(iMakeMinWidthSpec));
            }
        }
        super.onMeasure(iMakeMinWidthSpec, i10);
        if (this.contentContainer.getMeasuredHeight() < getMeasuredHeight()) {
            measureChild(this.contentContainer, iMakeMinWidthSpec, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void removeHeaderView() {
        View view = this.headerView;
        if (view != null) {
            this.contentContainer.removeView(view);
            this.headerView = null;
        }
    }

    public void setCollapsedItemMinimumHeight(@Px int i7) {
        this.collapsedItemMinHeight = i7;
        if (this.expanded) {
            return;
        }
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i7);
    }

    public void setCollapsedItemSpacing(@Px int i7) {
        this.collapsedItemSpacing = i7;
        if (this.expanded) {
            return;
        }
        getNavigationRailMenuView().setItemSpacing(i7);
    }

    public void setExpandedItemMinimumHeight(@Px int i7) {
        this.expandedItemMinHeight = i7;
        if (this.expanded) {
            ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i7);
        }
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public void setItemGravity(int i7) {
        this.collapsedItemGravity = i7;
        this.expandedItemGravity = i7;
        super.setItemGravity(i7);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public void setItemIconGravity(int i7) {
        this.collapsedIconGravity = i7;
        this.expandedIconGravity = i7;
        super.setItemIconGravity(i7);
    }

    public void setItemMinimumHeight(@Px int i7) {
        this.collapsedItemMinHeight = i7;
        this.expandedItemMinHeight = i7;
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i7);
    }

    public void setItemSpacing(@Px int i7) {
        this.collapsedItemSpacing = i7;
        this.expandedItemSpacing = i7;
        getNavigationRailMenuView().setItemSpacing(i7);
    }

    public void setMenuGravity(int i7) {
        getNavigationRailMenuView().setMenuGravity(i7);
    }

    public void setSubmenuDividersEnabled(boolean z3) {
        if (this.submenuDividersEnabled == z3) {
            return;
        }
        this.submenuDividersEnabled = z3;
        getNavigationRailMenuView().setSubmenuDividersEnabled(z3);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    @RestrictTo({c.f39801b})
    public boolean shouldAddMenuView() {
        return true;
    }

    public NavigationRailView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.navigationRailStyle);
    }

    public void addHeaderView(@NonNull View view) {
        removeHeaderView();
        this.headerView = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.bottomMargin = this.headerMarginBottom;
        this.contentContainer.addView(view, 0, layoutParams);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    @NonNull
    @RestrictTo({c.f39801b})
    public NavigationRailMenuView createNavigationBarMenuView(@NonNull Context context) {
        return new NavigationRailMenuView(context);
    }

    public NavigationRailView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, R.style.Widget_MaterialComponents_NavigationRailView);
    }

    public NavigationRailView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7, int i10) {
        super(context, attributeSet, i7, i10);
        this.paddingTopSystemWindowInsets = null;
        this.paddingBottomSystemWindowInsets = null;
        this.paddingStartSystemWindowInsets = null;
        this.expanded = false;
        this.collapsedItemMinHeight = -1;
        this.collapsedIconGravity = 0;
        this.collapsedItemGravity = 49;
        Context context2 = getContext();
        this.expandedItemSpacing = getContext().getResources().getDimensionPixelSize(R.dimen.m3_navigation_rail_expanded_item_spacing);
        this.expandedItemGravity = NavigationBarView.ITEM_GRAVITY_START_CENTER;
        this.expandedIconGravity = 1;
        Z0 z0ObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, R.styleable.NavigationRailView, i7, i10, new int[0]);
        this.contentMarginTop = z0ObtainTintedStyledAttributes.f12863b.getDimensionPixelSize(R.styleable.NavigationRailView_contentMarginTop, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_rail_margin));
        int i11 = R.styleable.NavigationRailView_headerMarginBottom;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_rail_margin);
        TypedArray typedArray = z0ObtainTintedStyledAttributes.f12863b;
        this.headerMarginBottom = typedArray.getDimensionPixelSize(i11, dimensionPixelSize);
        this.scrollingEnabled = typedArray.getBoolean(R.styleable.NavigationRailView_scrollingEnabled, false);
        setSubmenuDividersEnabled(typedArray.getBoolean(R.styleable.NavigationRailView_submenuDividersEnabled, false));
        addContentContainer();
        int resourceId = typedArray.getResourceId(R.styleable.NavigationRailView_headerLayout, 0);
        if (resourceId != 0) {
            addHeaderView(resourceId);
        }
        setMenuGravity(typedArray.getInt(R.styleable.NavigationRailView_menuGravity, 49));
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(R.styleable.NavigationRailView_itemMinHeight, -1);
        int dimensionPixelSize3 = typedArray.getDimensionPixelSize(R.styleable.NavigationRailView_itemMinHeight, -1);
        dimensionPixelSize2 = typedArray.hasValue(R.styleable.NavigationRailView_collapsedItemMinHeight) ? typedArray.getDimensionPixelSize(R.styleable.NavigationRailView_collapsedItemMinHeight, -1) : dimensionPixelSize2;
        dimensionPixelSize3 = typedArray.hasValue(R.styleable.NavigationRailView_expandedItemMinHeight) ? typedArray.getDimensionPixelSize(R.styleable.NavigationRailView_expandedItemMinHeight, -1) : dimensionPixelSize3;
        setCollapsedItemMinimumHeight(dimensionPixelSize2);
        setExpandedItemMinimumHeight(dimensionPixelSize3);
        this.minExpandedWidth = typedArray.getDimensionPixelSize(R.styleable.NavigationRailView_expandedMinWidth, context2.getResources().getDimensionPixelSize(R.dimen.m3_navigation_rail_min_expanded_width));
        this.maxExpandedWidth = typedArray.getDimensionPixelSize(R.styleable.NavigationRailView_expandedMaxWidth, context2.getResources().getDimensionPixelSize(R.dimen.m3_navigation_rail_max_expanded_width));
        if (typedArray.hasValue(R.styleable.NavigationRailView_paddingTopSystemWindowInsets)) {
            this.paddingTopSystemWindowInsets = Boolean.valueOf(typedArray.getBoolean(R.styleable.NavigationRailView_paddingTopSystemWindowInsets, false));
        }
        if (typedArray.hasValue(R.styleable.NavigationRailView_paddingBottomSystemWindowInsets)) {
            this.paddingBottomSystemWindowInsets = Boolean.valueOf(typedArray.getBoolean(R.styleable.NavigationRailView_paddingBottomSystemWindowInsets, false));
        }
        if (typedArray.hasValue(R.styleable.NavigationRailView_paddingStartSystemWindowInsets)) {
            this.paddingStartSystemWindowInsets = Boolean.valueOf(typedArray.getBoolean(R.styleable.NavigationRailView_paddingStartSystemWindowInsets, false));
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_navigation_rail_item_padding_top_with_large_font);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.m3_navigation_rail_item_padding_bottom_with_large_font);
        float fLerp = AnimationUtils.lerp(0.0f, 1.0f, 0.3f, 1.0f, MaterialResources.getFontScale(context2) - 1.0f);
        float fLerp2 = AnimationUtils.lerp(getItemPaddingTop(), dimensionPixelOffset, fLerp);
        float fLerp3 = AnimationUtils.lerp(getItemPaddingBottom(), dimensionPixelOffset2, fLerp);
        setItemPaddingTop(Math.round(fLerp2));
        setItemPaddingBottom(Math.round(fLerp3));
        setCollapsedItemSpacing(typedArray.getDimensionPixelSize(R.styleable.NavigationRailView_itemSpacing, 0));
        setExpanded(typedArray.getBoolean(R.styleable.NavigationRailView_expanded, false));
        z0ObtainTintedStyledAttributes.g();
        applyWindowInsets();
    }
}
