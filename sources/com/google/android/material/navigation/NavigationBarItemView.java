package com.google.android.material.navigation;

import Ie.k;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.m;
import com.facebook.imagepipeline.nativecode.b;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.internal.BaselineLayout;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public abstract class NavigationBarItemView extends FrameLayout implements NavigationBarMenuItemView {
    private static final ActiveIndicatorTransform ACTIVE_INDICATOR_LABELED_TRANSFORM;
    private static final ActiveIndicatorTransform ACTIVE_INDICATOR_UNLABELED_TRANSFORM;
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int INVALID_ITEM_POSITION = -1;
    private ValueAnimator activeIndicatorAnimator;
    private int activeIndicatorDesiredHeight;
    private int activeIndicatorDesiredWidth;
    private boolean activeIndicatorEnabled;
    private int activeIndicatorExpandedDesiredHeight;
    private int activeIndicatorExpandedDesiredWidth;
    private int activeIndicatorExpandedMarginHorizontal;
    private int activeIndicatorLabelPadding;
    private int activeIndicatorMarginHorizontal;
    private float activeIndicatorProgress;
    private boolean activeIndicatorResizeable;
    private ActiveIndicatorTransform activeIndicatorTransform;

    @NonNull
    private final View activeIndicatorView;

    @Nullable
    private BadgeDrawable badgeDrawable;
    private int badgeFixedEdge;
    private boolean boldText;

    @NonNull
    private final LinearLayout contentContainer;
    private BaselineLayout currentLabelGroup;
    private boolean expanded;
    private BaselineLayout expandedLabelGroup;
    private float expandedLabelScaleDownFactor;
    private float expandedLabelScaleUpFactor;
    private float expandedLabelShiftAmountY;
    private TextView expandedLargeLabel;
    private TextView expandedSmallLabel;

    @StyleRes
    private int horizontalTextAppearanceActive;

    @StyleRes
    private int horizontalTextAppearanceInactive;
    private final ImageView icon;

    @NonNull
    private final FrameLayout iconContainer;
    private int iconLabelHorizontalSpacing;

    @Nullable
    private ColorStateList iconTint;
    private boolean initialized;

    @NonNull
    private final LinearLayout innerContentContainer;
    private boolean isShifting;
    private Rect itemActiveIndicatorExpandedPadding;

    @Nullable
    Drawable itemBackground;

    @Nullable
    private m itemData;
    private int itemGravity;
    private int itemIconGravity;
    private int itemPaddingBottom;
    private int itemPaddingTop;
    private int itemPosition;
    private ColorStateList itemRippleColor;
    private final BaselineLayout labelGroup;
    private int labelVisibilityMode;
    private final TextView largeLabel;
    private boolean measurePaddingFromBaseline;
    private boolean onlyShowWhenExpanded;

    @Nullable
    private Drawable originalIconDrawable;
    private float scaleDownFactor;
    private boolean scaleLabelSizeWithFont;
    private float scaleUpFactor;
    private float shiftAmountY;
    private final TextView smallLabel;

    @StyleRes
    private int textAppearanceActive;

    @StyleRes
    private int textAppearanceInactive;

    @Nullable
    private ColorStateList textColor;

    @Nullable
    private Drawable wrappedIconDrawable;

    public static class ActiveIndicatorTransform {
        private static final float ALPHA_FRACTION = 0.2f;
        private static final float SCALE_X_HIDDEN = 0.4f;
        private static final float SCALE_X_SHOWN = 1.0f;

        private ActiveIndicatorTransform() {
        }

        public float calculateAlpha(@FloatRange(from = 0.0d, to = 1.0d) float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11) {
            return AnimationUtils.lerp(0.0f, 1.0f, f11 == 0.0f ? 0.8f : 0.0f, f11 == 0.0f ? 1.0f : ALPHA_FRACTION, f10);
        }

        public float calculateScaleX(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
            return AnimationUtils.lerp(SCALE_X_HIDDEN, 1.0f, f10);
        }

        public float calculateScaleY(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
            return 1.0f;
        }

        public void updateForProgress(@FloatRange(from = 0.0d, to = 1.0d) float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11, @NonNull View view) {
            view.setScaleX(calculateScaleX(f10));
            view.setScaleY(calculateScaleY(f10));
            view.setAlpha(calculateAlpha(f10, f11));
        }
    }

    public static class ActiveIndicatorUnlabeledTransform extends ActiveIndicatorTransform {
        private ActiveIndicatorUnlabeledTransform() {
            super();
        }

        @Override // com.google.android.material.navigation.NavigationBarItemView.ActiveIndicatorTransform
        public float calculateScaleY(float f10) {
            return calculateScaleX(f10);
        }
    }

    static {
        ACTIVE_INDICATOR_LABELED_TRANSFORM = new ActiveIndicatorTransform();
        ACTIVE_INDICATOR_UNLABELED_TRANSFORM = new ActiveIndicatorUnlabeledTransform();
    }

    public NavigationBarItemView(@NonNull Context context) {
        super(context);
        this.initialized = false;
        this.itemPosition = -1;
        this.textAppearanceActive = 0;
        this.textAppearanceInactive = 0;
        this.horizontalTextAppearanceActive = 0;
        this.horizontalTextAppearanceInactive = 0;
        this.boldText = false;
        this.activeIndicatorTransform = ACTIVE_INDICATOR_LABELED_TRANSFORM;
        this.activeIndicatorProgress = 0.0f;
        this.activeIndicatorEnabled = false;
        this.activeIndicatorDesiredWidth = 0;
        this.activeIndicatorDesiredHeight = 0;
        this.activeIndicatorExpandedDesiredWidth = -2;
        this.activeIndicatorExpandedDesiredHeight = 0;
        this.activeIndicatorResizeable = false;
        this.activeIndicatorMarginHorizontal = 0;
        this.activeIndicatorExpandedMarginHorizontal = 0;
        this.badgeFixedEdge = 0;
        this.itemGravity = 49;
        this.expanded = false;
        this.onlyShowWhenExpanded = false;
        this.measurePaddingFromBaseline = false;
        this.scaleLabelSizeWithFont = false;
        this.itemActiveIndicatorExpandedPadding = new Rect();
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.contentContainer = (LinearLayout) findViewById(com.google.android.material.R.id.navigation_bar_item_content_container);
        LinearLayout linearLayout = (LinearLayout) findViewById(com.google.android.material.R.id.navigation_bar_item_inner_content_container);
        this.innerContentContainer = linearLayout;
        this.activeIndicatorView = findViewById(com.google.android.material.R.id.navigation_bar_item_active_indicator_view);
        this.iconContainer = (FrameLayout) findViewById(com.google.android.material.R.id.navigation_bar_item_icon_container);
        this.icon = (ImageView) findViewById(com.google.android.material.R.id.navigation_bar_item_icon_view);
        BaselineLayout baselineLayout = (BaselineLayout) findViewById(com.google.android.material.R.id.navigation_bar_item_labels_group);
        this.labelGroup = baselineLayout;
        TextView textView = (TextView) findViewById(com.google.android.material.R.id.navigation_bar_item_small_label_view);
        this.smallLabel = textView;
        TextView textView2 = (TextView) findViewById(com.google.android.material.R.id.navigation_bar_item_large_label_view);
        this.largeLabel = textView2;
        initializeDefaultExpandedLabelGroupViews();
        this.currentLabelGroup = baselineLayout;
        setBackgroundResource(getItemBackgroundResId());
        this.itemPaddingTop = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.itemPaddingBottom = baselineLayout.getPaddingBottom();
        this.activeIndicatorLabelPadding = 0;
        this.iconLabelHorizontalSpacing = 0;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        this.expandedSmallLabel.setImportantForAccessibility(2);
        this.expandedLargeLabel.setImportantForAccessibility(2);
        setFocusable(true);
        calculateTextScaleFactors();
        this.activeIndicatorExpandedDesiredHeight = getResources().getDimensionPixelSize(com.google.android.material.R.dimen.m3_navigation_item_expanded_active_indicator_height_default);
        linearLayout.addOnLayoutChangeListener(new k(this, 2));
    }

    private void addDefaultExpandedLabelGroupViews() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.innerContentContainer.addView(this.expandedLabelGroup, layoutParams);
        setExpandedLabelGroupMargins();
    }

    private void calculateTextScaleFactors() {
        float textSize = this.smallLabel.getTextSize();
        float textSize2 = this.largeLabel.getTextSize();
        this.shiftAmountY = textSize - textSize2;
        this.scaleUpFactor = (textSize2 * 1.0f) / textSize;
        this.scaleDownFactor = (textSize * 1.0f) / textSize2;
        float textSize3 = this.expandedSmallLabel.getTextSize();
        float textSize4 = this.expandedLargeLabel.getTextSize();
        this.expandedLabelShiftAmountY = textSize3 - textSize4;
        this.expandedLabelScaleUpFactor = (textSize4 * 1.0f) / textSize3;
        this.expandedLabelScaleDownFactor = (textSize3 * 1.0f) / textSize4;
    }

    private static Drawable createItemBackgroundCompat(@NonNull ColorStateList colorStateList) {
        return new RippleDrawable(RippleUtils.convertToRippleDrawableColor(colorStateList), null, null);
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i7 = 0;
        for (int i10 = 0; i10 < iIndexOfChild; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i7++;
            }
        }
        return i7;
    }

    private int getSuggestedIconWidth() {
        BadgeDrawable badgeDrawable = this.badgeDrawable;
        int minimumWidth = badgeDrawable == null ? 0 : badgeDrawable.getMinimumWidth() - this.badgeDrawable.getHorizontalOffset();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.iconContainer.getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.icon.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    private boolean hasBadge() {
        return this.badgeDrawable != null;
    }

    private void initializeDefaultExpandedLabelGroupViews() {
        float dimension = getResources().getDimension(com.google.android.material.R.dimen.default_navigation_text_size);
        float dimension2 = getResources().getDimension(com.google.android.material.R.dimen.default_navigation_active_text_size);
        BaselineLayout baselineLayout = new BaselineLayout(getContext());
        this.expandedLabelGroup = baselineLayout;
        baselineLayout.setVisibility(8);
        this.expandedLabelGroup.setDuplicateParentStateEnabled(true);
        this.expandedLabelGroup.setMeasurePaddingFromBaseline(this.measurePaddingFromBaseline);
        TextView textView = new TextView(getContext());
        this.expandedSmallLabel = textView;
        textView.setMaxLines(1);
        TextView textView2 = this.expandedSmallLabel;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        this.expandedSmallLabel.setDuplicateParentStateEnabled(true);
        this.expandedSmallLabel.setIncludeFontPadding(false);
        this.expandedSmallLabel.setGravity(16);
        this.expandedSmallLabel.setTextSize(dimension);
        TextView textView3 = new TextView(getContext());
        this.expandedLargeLabel = textView3;
        textView3.setMaxLines(1);
        this.expandedLargeLabel.setEllipsize(truncateAt);
        this.expandedLargeLabel.setDuplicateParentStateEnabled(true);
        this.expandedLargeLabel.setVisibility(4);
        this.expandedLargeLabel.setIncludeFontPadding(false);
        this.expandedLargeLabel.setGravity(16);
        this.expandedLargeLabel.setTextSize(dimension2);
        this.expandedLabelGroup.addView(this.expandedSmallLabel);
        this.expandedLabelGroup.addView(this.expandedLargeLabel);
    }

    private boolean isActiveIndicatorResizeableAndUnlabeled() {
        return this.activeIndicatorResizeable && this.labelVisibilityMode == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean z3;
        if (this.icon.getVisibility() == 0) {
            tryUpdateBadgeBounds(this.icon);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.innerContentContainer.getLayoutParams();
        int i17 = (i11 - i7) + layoutParams.rightMargin + layoutParams.leftMargin;
        int i18 = (i12 - i10) + layoutParams.topMargin + layoutParams.bottomMargin;
        boolean z8 = true;
        if (this.itemIconGravity == 1 && this.activeIndicatorExpandedDesiredWidth == -2) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.activeIndicatorView.getLayoutParams();
            if (this.activeIndicatorExpandedDesiredWidth != -2 || this.activeIndicatorView.getMeasuredWidth() == i17) {
                z3 = false;
            } else {
                layoutParams2.width = Math.max(i17, Math.min(this.activeIndicatorDesiredWidth, getMeasuredWidth() - (this.activeIndicatorMarginHorizontal * 2)));
                z3 = true;
            }
            if (this.activeIndicatorView.getMeasuredHeight() < i18) {
                layoutParams2.height = i18;
            } else {
                z8 = z3;
            }
            if (z8) {
                this.activeIndicatorView.setLayoutParams(layoutParams2);
            }
        }
    }

    private void maybeAnimateActiveIndicatorToProgress(@FloatRange(from = 0.0d, to = 1.0d) final float f10) {
        if (!this.activeIndicatorEnabled || !this.initialized || !isAttachedToWindow()) {
            setActiveIndicatorProgress(f10, f10);
            return;
        }
        ValueAnimator valueAnimator = this.activeIndicatorAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.activeIndicatorAnimator = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.activeIndicatorProgress, f10);
        this.activeIndicatorAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.navigation.NavigationBarItemView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                NavigationBarItemView.this.setActiveIndicatorProgress(((Float) valueAnimator2.getAnimatedValue()).floatValue(), f10);
            }
        });
        this.activeIndicatorAnimator.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), com.google.android.material.R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        this.activeIndicatorAnimator.setDuration(MotionUtils.resolveThemeDuration(getContext(), com.google.android.material.R.attr.motionDurationLong2, getResources().getInteger(com.google.android.material.R.integer.material_motion_duration_long_1)));
        this.activeIndicatorAnimator.start();
    }

    private void refreshChecked() {
        m mVar = this.itemData;
        if (mVar != null) {
            setChecked(mVar.isChecked());
        }
    }

    private void refreshItemBackground() {
        Drawable drawableCreateItemBackgroundCompat = this.itemBackground;
        RippleDrawable rippleDrawable = null;
        boolean z3 = true;
        if (this.itemRippleColor != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.activeIndicatorEnabled && getActiveIndicatorDrawable() != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(this.itemRippleColor), null, activeIndicatorDrawable);
                z3 = false;
            } else if (drawableCreateItemBackgroundCompat == null) {
                drawableCreateItemBackgroundCompat = createItemBackgroundCompat(this.itemRippleColor);
            }
        }
        this.iconContainer.setPadding(0, 0, 0, 0);
        this.iconContainer.setForeground(rippleDrawable);
        setBackground(drawableCreateItemBackgroundCompat);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActiveIndicatorProgress(@FloatRange(from = 0.0d, to = 1.0d) float f10, float f11) {
        this.activeIndicatorTransform.updateForProgress(f10, f11, this.activeIndicatorView);
        this.activeIndicatorProgress = f10;
    }

    private void setExpandedLabelGroupMargins() {
        int i7 = this.icon.getLayoutParams().width > 0 ? this.iconLabelHorizontalSpacing : 0;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.expandedLabelGroup.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.rightMargin = getLayoutDirection() == 1 ? i7 : 0;
            layoutParams.leftMargin = getLayoutDirection() != 1 ? i7 : 0;
        }
    }

    private void setLabelPivots(TextView textView) {
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
    }

    private void setLayoutConfigurationIconAndLabel(View view, View view2, float f10, float f11) {
        setViewMarginAndGravity(this.contentContainer, this.itemIconGravity == 0 ? (int) (this.itemPaddingTop + f11) : 0, 0, this.itemGravity);
        LinearLayout linearLayout = this.innerContentContainer;
        int i7 = this.itemIconGravity;
        setViewMarginAndGravity(linearLayout, i7 == 0 ? 0 : this.itemActiveIndicatorExpandedPadding.top, i7 == 0 ? 0 : this.itemActiveIndicatorExpandedPadding.bottom, i7 == 0 ? 17 : NavigationBarView.ITEM_GRAVITY_START_CENTER);
        updateViewPaddingBottom(this.labelGroup, this.itemPaddingBottom);
        this.currentLabelGroup.setVisibility(0);
        setViewScaleValues(view, 1.0f, 1.0f, 0);
        setViewScaleValues(view2, f10, f10, 4);
    }

    private void setLayoutConfigurationIconOnly() {
        LinearLayout linearLayout = this.contentContainer;
        int i7 = this.itemPaddingTop;
        setViewMarginAndGravity(linearLayout, i7, i7, this.itemIconGravity == 0 ? 17 : this.itemGravity);
        setViewMarginAndGravity(this.innerContentContainer, 0, 0, 17);
        updateViewPaddingBottom(this.labelGroup, 0);
        this.currentLabelGroup.setVisibility(8);
    }

    private void setTextAppearanceForLabel(TextView textView, int i7) {
        if (this.scaleLabelSizeWithFont) {
            textView.setTextAppearance(i7);
        } else {
            setTextAppearanceWithoutFontScaling(textView, i7);
        }
    }

    private static void setTextAppearanceWithoutFontScaling(TextView textView, @StyleRes int i7) {
        textView.setTextAppearance(i7);
        int unscaledTextSize = MaterialResources.getUnscaledTextSize(textView.getContext(), i7, 0);
        if (unscaledTextSize != 0) {
            textView.setTextSize(0, unscaledTextSize);
        }
    }

    private static void setViewMarginAndGravity(@NonNull View view, int i7, int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i7;
        layoutParams.bottomMargin = i10;
        layoutParams.gravity = i11;
        view.setLayoutParams(layoutParams);
    }

    private static void setViewScaleValues(@NonNull View view, float f10, float f11, int i7) {
        view.setScaleX(f10);
        view.setScaleY(f11);
        view.setVisibility(i7);
    }

    private void tryAttachBadgeToAnchor(@Nullable View view) {
        if (hasBadge() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            BadgeUtils.attachBadgeDrawable(this.badgeDrawable, view);
        }
    }

    private void tryRemoveBadgeFromAnchor(@Nullable View view) {
        if (hasBadge()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                BadgeUtils.detachBadgeDrawable(this.badgeDrawable, view);
            }
            this.badgeDrawable = null;
        }
    }

    private void tryUpdateBadgeBounds(View view) {
        if (hasBadge()) {
            BadgeUtils.setBadgeDrawableBounds(this.badgeDrawable, view, null);
        }
    }

    private void updateActiveIndicatorTransform() {
        if (isActiveIndicatorResizeableAndUnlabeled()) {
            this.activeIndicatorTransform = ACTIVE_INDICATOR_UNLABELED_TRANSFORM;
        } else {
            this.activeIndicatorTransform = ACTIVE_INDICATOR_LABELED_TRANSFORM;
        }
    }

    private void updateActiveLabelBoldness() {
        TextView textView = this.largeLabel;
        textView.setTypeface(textView.getTypeface(), this.boldText ? 1 : 0);
        TextView textView2 = this.expandedLargeLabel;
        textView2.setTypeface(textView2.getTypeface(), this.boldText ? 1 : 0);
    }

    private void updateActiveLabelTextAppearance(@Nullable TextView textView, @StyleRes int i7) {
        if (textView == null) {
            return;
        }
        setTextAppearanceForLabel(textView, i7);
        calculateTextScaleFactors();
        textView.setMinimumHeight(MaterialResources.getUnscaledLineHeight(textView.getContext(), i7, 0));
        ColorStateList colorStateList = this.textColor;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        updateActiveLabelBoldness();
    }

    private void updateInactiveLabelTextAppearance(@Nullable TextView textView, @StyleRes int i7) {
        if (textView == null) {
            return;
        }
        setTextAppearanceForLabel(textView, i7);
        calculateTextScaleFactors();
        textView.setMinimumHeight(MaterialResources.getUnscaledLineHeight(textView.getContext(), i7, 0));
        ColorStateList colorStateList = this.textColor;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    private void updateItemIconGravity() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        this.badgeFixedEdge = 0;
        this.currentLabelGroup = this.labelGroup;
        int i15 = 8;
        if (this.itemIconGravity == 1) {
            if (this.expandedLabelGroup.getParent() == null) {
                addDefaultExpandedLabelGroupViews();
            }
            Rect rect = this.itemActiveIndicatorExpandedPadding;
            int i16 = rect.left;
            int i17 = rect.right;
            int i18 = rect.top;
            i7 = rect.bottom;
            this.badgeFixedEdge = 1;
            int i19 = this.activeIndicatorExpandedMarginHorizontal;
            this.currentLabelGroup = this.expandedLabelGroup;
            i13 = i18;
            i12 = i17;
            i11 = i16;
            i10 = i19;
            i14 = 0;
        } else {
            i7 = 0;
            i10 = 0;
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 8;
            i15 = 0;
        }
        this.labelGroup.setVisibility(i15);
        this.expandedLabelGroup.setVisibility(i14);
        ((FrameLayout.LayoutParams) this.contentContainer.getLayoutParams()).gravity = this.itemGravity;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.innerContentContainer.getLayoutParams();
        layoutParams.leftMargin = i11;
        layoutParams.rightMargin = i12;
        layoutParams.topMargin = i13;
        layoutParams.bottomMargin = i7;
        setPadding(i10, 0, i10, 0);
        updateActiveIndicatorLayoutParams(getWidth());
    }

    private static void updateViewPaddingBottom(@NonNull View view, int i7) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i7);
    }

    private void updateVisibility() {
        m mVar = this.itemData;
        if (mVar != null) {
            setVisibility((!mVar.isVisible() || (!this.expanded && this.onlyShowWhenExpanded)) ? 8 : 0);
        }
    }

    public void clear() {
        removeBadge();
        this.itemData = null;
        this.activeIndicatorProgress = 0.0f;
        this.initialized = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.activeIndicatorEnabled) {
            this.iconContainer.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public Drawable getActiveIndicatorDrawable() {
        return this.activeIndicatorView.getBackground();
    }

    @Nullable
    public BadgeDrawable getBadge() {
        return this.badgeDrawable;
    }

    @NonNull
    public BaselineLayout getExpandedLabelGroup() {
        return this.expandedLabelGroup;
    }

    @DrawableRes
    public int getItemBackgroundResId() {
        return com.google.android.material.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    @Nullable
    public m getItemData() {
        return this.itemData;
    }

    @DimenRes
    public int getItemDefaultMarginResId() {
        return com.google.android.material.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    @LayoutRes
    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.itemPosition;
    }

    @NonNull
    public BaselineLayout getLabelGroup() {
        return this.labelGroup;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.contentContainer.getLayoutParams();
        return this.contentContainer.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        if (this.itemIconGravity == 1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.innerContentContainer.getLayoutParams();
            return this.innerContentContainer.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.labelGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), this.labelGroup.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(@NonNull m mVar, int i7) {
        this.itemData = mVar;
        setCheckable(mVar.isCheckable());
        setChecked(mVar.isChecked());
        setEnabled(mVar.isEnabled());
        setIcon(mVar.getIcon());
        setTitle(mVar.f12446e);
        setId(mVar.f12442a);
        if (!TextUtils.isEmpty(mVar.f12458q)) {
            setContentDescription(mVar.f12458q);
        }
        b.S(this, !TextUtils.isEmpty(mVar.f12459r) ? mVar.f12459r : mVar.f12446e);
        updateVisibility();
        this.initialized = true;
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public boolean isExpanded() {
        return this.expanded;
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public boolean isOnlyVisibleWhenExpanded() {
        return this.onlyShowWhenExpanded;
    }

    @Override // android.view.ViewGroup, android.view.View
    @NonNull
    public int[] onCreateDrawableState(int i7) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + 1);
        m mVar = this.itemData;
        if (mVar != null && mVar.isCheckable() && this.itemData.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.badgeDrawable;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            m mVar = this.itemData;
            CharSequence charSequence = mVar.f12446e;
            if (!TextUtils.isEmpty(mVar.f12458q)) {
                charSequence = this.itemData.f12458q;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.badgeDrawable.getContentDescription()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) p045d3.k.h(0, 1, getItemVisiblePosition(), 1, false, isSelected()).f35518b);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) p074f0.c.f36345g.f36355a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.google.android.material.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public void onSizeChanged(final int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        post(new Runnable() { // from class: com.google.android.material.navigation.NavigationBarItemView.1
            @Override // java.lang.Runnable
            public void run() {
                NavigationBarItemView.this.updateActiveIndicatorLayoutParams(i7);
            }
        });
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void removeBadge() {
        tryRemoveBadgeFromAnchor(this.icon);
    }

    public void setActiveIndicatorDrawable(@Nullable Drawable drawable) {
        this.activeIndicatorView.setBackground(drawable);
        refreshItemBackground();
    }

    public void setActiveIndicatorEnabled(boolean z3) {
        this.activeIndicatorEnabled = z3;
        refreshItemBackground();
        this.activeIndicatorView.setVisibility(z3 ? 0 : 8);
        requestLayout();
    }

    public void setActiveIndicatorExpandedHeight(int i7) {
        this.activeIndicatorExpandedDesiredHeight = i7;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setActiveIndicatorExpandedMarginHorizontal(@Px int i7) {
        this.activeIndicatorExpandedMarginHorizontal = i7;
        if (this.itemIconGravity == 1) {
            setPadding(i7, 0, i7, 0);
        }
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setActiveIndicatorExpandedPadding(@NonNull Rect rect) {
        this.itemActiveIndicatorExpandedPadding = rect;
    }

    public void setActiveIndicatorExpandedWidth(int i7) {
        this.activeIndicatorExpandedDesiredWidth = i7;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setActiveIndicatorHeight(int i7) {
        this.activeIndicatorDesiredHeight = i7;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i7) {
        if (this.activeIndicatorLabelPadding != i7) {
            this.activeIndicatorLabelPadding = i7;
            ((LinearLayout.LayoutParams) this.labelGroup.getLayoutParams()).topMargin = i7;
            if (this.expandedLabelGroup.getLayoutParams() != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.expandedLabelGroup.getLayoutParams();
                layoutParams.rightMargin = getLayoutDirection() == 1 ? i7 : 0;
                if (getLayoutDirection() == 1) {
                    i7 = 0;
                }
                layoutParams.leftMargin = i7;
                requestLayout();
            }
        }
    }

    public void setActiveIndicatorMarginHorizontal(@Px int i7) {
        this.activeIndicatorMarginHorizontal = i7;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z3) {
        this.activeIndicatorResizeable = z3;
    }

    public void setActiveIndicatorWidth(int i7) {
        this.activeIndicatorDesiredWidth = i7;
        updateActiveIndicatorLayoutParams(getWidth());
    }

    public void setBadge(@NonNull BadgeDrawable badgeDrawable) {
        ImageView imageView;
        if (this.badgeDrawable == badgeDrawable) {
            return;
        }
        if (hasBadge() && (imageView = this.icon) != null) {
            tryRemoveBadgeFromAnchor(imageView);
        }
        this.badgeDrawable = badgeDrawable;
        badgeDrawable.setBadgeFixedEdge(this.badgeFixedEdge);
        ImageView imageView2 = this.icon;
        if (imageView2 != null) {
            tryAttachBadgeToAnchor(imageView2);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean z3) {
        refreshDrawableState();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean z3) {
        setLabelPivots(this.largeLabel);
        setLabelPivots(this.smallLabel);
        setLabelPivots(this.expandedLargeLabel);
        setLabelPivots(this.expandedSmallLabel);
        maybeAnimateActiveIndicatorToProgress(z3 ? 1.0f : 0.0f);
        TextView textView = this.largeLabel;
        TextView textView2 = this.smallLabel;
        float f10 = this.shiftAmountY;
        float f11 = this.scaleUpFactor;
        float f12 = this.scaleDownFactor;
        if (this.itemIconGravity == 1) {
            textView = this.expandedLargeLabel;
            textView2 = this.expandedSmallLabel;
            f10 = this.expandedLabelShiftAmountY;
            f11 = this.expandedLabelScaleUpFactor;
            f12 = this.expandedLabelScaleDownFactor;
        }
        int i7 = this.labelVisibilityMode;
        if (i7 != -1) {
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        setLayoutConfigurationIconOnly();
                    }
                } else if (z3) {
                    setLayoutConfigurationIconAndLabel(textView, textView2, f11, f10);
                } else {
                    setLayoutConfigurationIconAndLabel(textView2, textView, f12, 0.0f);
                }
            } else if (z3) {
                setLayoutConfigurationIconAndLabel(textView, textView2, f11, 0.0f);
            } else {
                setLayoutConfigurationIconOnly();
            }
        } else if (this.isShifting) {
            if (z3) {
                setLayoutConfigurationIconAndLabel(textView, textView2, f11, 0.0f);
            } else {
                setLayoutConfigurationIconOnly();
            }
        } else if (z3) {
            setLayoutConfigurationIconAndLabel(textView, textView2, f11, f10);
        } else {
            setLayoutConfigurationIconAndLabel(textView2, textView, f12, 0.0f);
        }
        refreshDrawableState();
        setSelected(z3);
    }

    @Override // android.view.View, androidx.appcompat.view.menu.MenuView.ItemView
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        this.smallLabel.setEnabled(z3);
        this.largeLabel.setEnabled(z3);
        this.expandedSmallLabel.setEnabled(z3);
        this.expandedLargeLabel.setEnabled(z3);
        this.icon.setEnabled(z3);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public void setExpanded(boolean z3) {
        this.expanded = z3;
        updateVisibility();
    }

    public void setHorizontalTextAppearanceActive(@StyleRes int i7) {
        this.horizontalTextAppearanceActive = i7;
        TextView textView = this.expandedLargeLabel;
        if (i7 == 0) {
            i7 = this.textAppearanceActive;
        }
        updateActiveLabelTextAppearance(textView, i7);
    }

    public void setHorizontalTextAppearanceInactive(@StyleRes int i7) {
        this.horizontalTextAppearanceInactive = i7;
        TextView textView = this.expandedSmallLabel;
        if (i7 == 0) {
            i7 = this.textAppearanceInactive;
        }
        updateInactiveLabelTextAppearance(textView, i7);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(@Nullable Drawable drawable) {
        if (drawable == this.originalIconDrawable) {
            return;
        }
        this.originalIconDrawable = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.wrappedIconDrawable = drawable;
            ColorStateList colorStateList = this.iconTint;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.icon.setImageDrawable(drawable);
    }

    public void setIconLabelHorizontalSpacing(int i7) {
        if (this.iconLabelHorizontalSpacing != i7) {
            this.iconLabelHorizontalSpacing = i7;
            setExpandedLabelGroupMargins();
            requestLayout();
        }
    }

    public void setIconSize(int i7) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.icon.getLayoutParams();
        layoutParams.width = i7;
        layoutParams.height = i7;
        this.icon.setLayoutParams(layoutParams);
        setExpandedLabelGroupMargins();
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList) {
        Drawable drawable;
        this.iconTint = colorStateList;
        if (this.itemData == null || (drawable = this.wrappedIconDrawable) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.wrappedIconDrawable.invalidateSelf();
    }

    public void setItemBackground(int i7) {
        setItemBackground(i7 == 0 ? null : getContext().getDrawable(i7));
    }

    public void setItemGravity(int i7) {
        this.itemGravity = i7;
        requestLayout();
    }

    public void setItemIconGravity(int i7) {
        if (this.itemIconGravity != i7) {
            this.itemIconGravity = i7;
            updateItemIconGravity();
            refreshItemBackground();
        }
    }

    public void setItemPaddingBottom(int i7) {
        if (this.itemPaddingBottom != i7) {
            this.itemPaddingBottom = i7;
            refreshChecked();
        }
    }

    public void setItemPaddingTop(int i7) {
        if (this.itemPaddingTop != i7) {
            this.itemPaddingTop = i7;
            refreshChecked();
        }
    }

    public void setItemPosition(int i7) {
        this.itemPosition = i7;
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.itemRippleColor = colorStateList;
        refreshItemBackground();
    }

    public void setLabelFontScalingEnabled(boolean z3) {
        this.scaleLabelSizeWithFont = z3;
        setTextAppearanceActive(this.textAppearanceActive);
        setTextAppearanceInactive(this.textAppearanceInactive);
        setHorizontalTextAppearanceActive(this.horizontalTextAppearanceActive);
        setHorizontalTextAppearanceInactive(this.horizontalTextAppearanceInactive);
    }

    public void setLabelMaxLines(int i7) {
        this.smallLabel.setMaxLines(i7);
        this.largeLabel.setMaxLines(i7);
        this.expandedSmallLabel.setMaxLines(i7);
        this.expandedLargeLabel.setMaxLines(i7);
        if (Build.VERSION.SDK_INT > 34) {
            this.smallLabel.setGravity(17);
            this.largeLabel.setGravity(17);
        } else if (i7 > 1) {
            this.smallLabel.setEllipsize(null);
            this.largeLabel.setEllipsize(null);
            this.smallLabel.setGravity(17);
            this.largeLabel.setGravity(17);
        } else {
            this.smallLabel.setGravity(16);
            this.largeLabel.setGravity(16);
        }
        requestLayout();
    }

    public void setLabelVisibilityMode(int i7) {
        if (this.labelVisibilityMode != i7) {
            this.labelVisibilityMode = i7;
            updateActiveIndicatorTransform();
            updateActiveIndicatorLayoutParams(getWidth());
            refreshChecked();
        }
    }

    public void setMeasureBottomPaddingFromLabelBaseline(boolean z3) {
        this.measurePaddingFromBaseline = z3;
        this.labelGroup.setMeasurePaddingFromBaseline(z3);
        this.smallLabel.setIncludeFontPadding(z3);
        this.largeLabel.setIncludeFontPadding(z3);
        this.expandedLabelGroup.setMeasurePaddingFromBaseline(z3);
        this.expandedSmallLabel.setIncludeFontPadding(z3);
        this.expandedLargeLabel.setIncludeFontPadding(z3);
        requestLayout();
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuItemView
    public void setOnlyShowWhenExpanded(boolean z3) {
        this.onlyShowWhenExpanded = z3;
        updateVisibility();
    }

    public void setShifting(boolean z3) {
        if (this.isShifting != z3) {
            this.isShifting = z3;
            refreshChecked();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean z3, char c6) {
    }

    public void setTextAppearanceActive(@StyleRes int i7) {
        this.textAppearanceActive = i7;
        updateActiveLabelTextAppearance(this.largeLabel, i7);
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z3) {
        this.boldText = z3;
        setTextAppearanceActive(this.textAppearanceActive);
        setHorizontalTextAppearanceActive(this.horizontalTextAppearanceActive);
        updateActiveLabelBoldness();
    }

    public void setTextAppearanceInactive(@StyleRes int i7) {
        this.textAppearanceInactive = i7;
        updateInactiveLabelTextAppearance(this.smallLabel, i7);
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        this.textColor = colorStateList;
        if (colorStateList != null) {
            this.smallLabel.setTextColor(colorStateList);
            this.largeLabel.setTextColor(colorStateList);
            this.expandedSmallLabel.setTextColor(colorStateList);
            this.expandedLargeLabel.setTextColor(colorStateList);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(@Nullable CharSequence charSequence) {
        this.smallLabel.setText(charSequence);
        this.largeLabel.setText(charSequence);
        this.expandedSmallLabel.setText(charSequence);
        this.expandedLargeLabel.setText(charSequence);
        m mVar = this.itemData;
        if (mVar == null || TextUtils.isEmpty(mVar.f12458q)) {
            setContentDescription(charSequence);
        }
        m mVar2 = this.itemData;
        if (mVar2 != null && !TextUtils.isEmpty(mVar2.f12459r)) {
            charSequence = this.itemData.f12459r;
        }
        b.S(this, charSequence);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
        return true;
    }

    public void updateActiveIndicatorLayoutParams(int i7) {
        if (i7 > 0 || getVisibility() != 0) {
            int iMin = Math.min(this.activeIndicatorDesiredWidth, i7 - (this.activeIndicatorMarginHorizontal * 2));
            int iMax = this.activeIndicatorDesiredHeight;
            if (this.itemIconGravity == 1) {
                int measuredWidth = i7 - (this.activeIndicatorExpandedMarginHorizontal * 2);
                int i10 = this.activeIndicatorExpandedDesiredWidth;
                if (i10 != -1) {
                    measuredWidth = i10 == -2 ? this.contentContainer.getMeasuredWidth() : Math.min(i10, measuredWidth);
                }
                iMin = measuredWidth;
                iMax = Math.max(this.activeIndicatorExpandedDesiredHeight, this.innerContentContainer.getMeasuredHeight());
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.activeIndicatorView.getLayoutParams();
            if (isActiveIndicatorResizeableAndUnlabeled()) {
                iMax = iMin;
            }
            layoutParams.height = iMax;
            layoutParams.width = Math.max(0, iMin);
            this.activeIndicatorView.setLayoutParams(layoutParams);
        }
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.itemBackground = drawable;
        refreshItemBackground();
    }
}
