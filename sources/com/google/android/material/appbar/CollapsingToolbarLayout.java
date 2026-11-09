package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.E;
import androidx.core.view.N;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.q0;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;
import java.util.WeakHashMap;
import p192n.c;
import p241q.i;

/* JADX INFO: loaded from: classes2.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    private static final int COLLAPSED_TITLE_GRAVITY_AVAILABLE_SPACE = 1;
    private static final int COLLAPSED_TITLE_GRAVITY_ENTIRE_SPACE = 0;
    private static final int DEFAULT_SCRIM_ANIMATION_DURATION = 600;
    private static final int DEF_STYLE_RES = R.style.Widget_Design_CollapsingToolbar;
    public static final int TITLE_COLLAPSE_MODE_FADE = 1;
    public static final int TITLE_COLLAPSE_MODE_SCALE = 0;
    private final int collapsedTitleGravityMode;

    @NonNull
    final CollapsingTextHelper collapsingSubtitleHelper;
    private boolean collapsingTitleEnabled;

    @NonNull
    final CollapsingTextHelper collapsingTitleHelper;

    @Nullable
    private Drawable contentScrim;
    int currentOffset;
    private boolean drawCollapsingTitle;
    private View dummyView;

    @NonNull
    final ElevationOverlayProvider elevationOverlayProvider;
    private int expandedMarginBottom;
    private int expandedMarginEnd;
    private int expandedMarginStart;
    private int expandedMarginTop;
    private int expandedTitleSpacing;
    private int extraHeightForTitles;
    private boolean extraMultilineHeightEnabled;
    private int extraMultilineSubtitleHeight;
    private int extraMultilineTitleHeight;
    private boolean forceApplySystemWindowInsetTop;

    @Nullable
    q0 lastInsets;
    private AppBarLayout.OnOffsetChangedListener onOffsetChangedListener;
    private boolean refreshToolbar;
    private int screenOrientation;
    private int scrimAlpha;
    private long scrimAnimationDuration;
    private final TimeInterpolator scrimAnimationFadeInInterpolator;
    private final TimeInterpolator scrimAnimationFadeOutInterpolator;
    private ValueAnimator scrimAnimator;
    private int scrimVisibleHeightTrigger;
    private boolean scrimsAreShown;

    @Nullable
    Drawable statusBarScrim;
    private int titleCollapseMode;
    private final Rect tmpRect;

    @Nullable
    private ViewGroup toolbar;

    @Nullable
    private View toolbarDirectChild;
    private int toolbarId;
    private int topInsetApplied;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({c.f39801b})
    public @interface CollapsedTitleGravityMode {
    }

    public class OffsetUpdateListener implements AppBarLayout.OnOffsetChangedListener {
        public OffsetUpdateListener() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i7) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.currentOffset = i7;
            q0 q0Var = collapsingToolbarLayout.lastInsets;
            int iD = q0Var != null ? q0Var.d() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i10);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                ViewOffsetHelper viewOffsetHelper = CollapsingToolbarLayout.getViewOffsetHelper(childAt);
                int i11 = layoutParams.collapseMode;
                if (i11 == 1) {
                    viewOffsetHelper.setTopAndBottomOffset(p118hf.a.m(-i7, 0, CollapsingToolbarLayout.this.getMaxOffsetForPinChild(childAt)));
                } else if (i11 == 2) {
                    viewOffsetHelper.setTopAndBottomOffset(Math.round((-i7) * layoutParams.parallaxMult));
                }
            }
            CollapsingToolbarLayout.this.updateScrimVisibility();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.statusBarScrim != null && iD > 0) {
                collapsingToolbarLayout2.postInvalidateOnAnimation();
            }
            int height = CollapsingToolbarLayout.this.getHeight();
            int minimumHeight = (height - CollapsingToolbarLayout.this.getMinimumHeight()) - iD;
            int scrimVisibleHeightTrigger = height - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger();
            int i12 = CollapsingToolbarLayout.this.currentOffset + minimumHeight;
            float f10 = minimumHeight;
            float fAbs = Math.abs(i7) / f10;
            float f11 = scrimVisibleHeightTrigger / f10;
            CollapsingToolbarLayout.this.collapsingTitleHelper.setFadeModeStartFraction(Math.min(1.0f, f11));
            CollapsingToolbarLayout.this.collapsingTitleHelper.setCurrentOffsetY(i12);
            CollapsingToolbarLayout.this.collapsingTitleHelper.setExpansionFraction(fAbs);
            CollapsingToolbarLayout.this.collapsingSubtitleHelper.setFadeModeStartFraction(Math.min(1.0f, f11));
            CollapsingToolbarLayout.this.collapsingSubtitleHelper.setCurrentOffsetY(i12);
            CollapsingToolbarLayout.this.collapsingSubtitleHelper.setExpansionFraction(fAbs);
        }
    }

    @RequiresApi(23)
    @RestrictTo({c.f39801b})
    public interface StaticLayoutBuilderConfigurer extends com.google.android.material.internal.StaticLayoutBuilderConfigurer {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({c.f39801b})
    public @interface TitleCollapseMode {
    }

    public CollapsingToolbarLayout(@NonNull Context context) {
        this(context, null);
    }

    private void animateScrim(int i7) {
        ensureToolbar();
        ValueAnimator valueAnimator = this.scrimAnimator;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.scrimAnimator = valueAnimator2;
            valueAnimator2.setInterpolator(i7 > this.scrimAlpha ? this.scrimAnimationFadeInInterpolator : this.scrimAnimationFadeOutInterpolator);
            this.scrimAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.CollapsingToolbarLayout.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator3) {
                    CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator3.getAnimatedValue()).intValue());
                }
            });
        } else if (valueAnimator.isRunning()) {
            this.scrimAnimator.cancel();
        }
        this.scrimAnimator.setDuration(this.scrimAnimationDuration);
        this.scrimAnimator.setIntValues(this.scrimAlpha, i7);
        this.scrimAnimator.start();
    }

    private TextUtils.TruncateAt convertEllipsizeToTruncateAt(int i7) {
        if (i7 == 0) {
            return TextUtils.TruncateAt.START;
        }
        if (i7 != 1) {
            return i7 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE;
        }
        return TextUtils.TruncateAt.MIDDLE;
    }

    private void disableLiftOnScrollIfNeeded(AppBarLayout appBarLayout) {
        if (isTitleCollapseFadeMode()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    private void ensureToolbar() {
        if (this.refreshToolbar) {
            ViewGroup viewGroup = null;
            this.toolbar = null;
            this.toolbarDirectChild = null;
            int i7 = this.toolbarId;
            if (i7 != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i7);
                this.toolbar = viewGroup2;
                if (viewGroup2 != null) {
                    this.toolbarDirectChild = findDirectChild(viewGroup2);
                }
            }
            if (this.toolbar == null) {
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = getChildAt(i10);
                    if (isToolbar(childAt)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.toolbar = viewGroup;
            }
            updateDummyView();
            this.refreshToolbar = false;
        }
    }

    @NonNull
    private View findDirectChild(@NonNull View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = parent;
            }
        }
        return view;
    }

    @ColorInt
    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        ColorStateList colorStateListOrNull = MaterialColors.getColorStateListOrNull(getContext(), R.attr.colorSurfaceContainer);
        if (colorStateListOrNull != null) {
            return colorStateListOrNull.getDefaultColor();
        }
        return this.elevationOverlayProvider.compositeOverlayWithThemeSurfaceColorIfNeeded(getResources().getDimension(R.dimen.design_appbar_elevation));
    }

    private static int getHeightWithMargins(@NonNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Nullable
    private static CharSequence getToolbarSubtitle(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getSubtitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getSubtitle();
        }
        return null;
    }

    @Nullable
    private static CharSequence getToolbarTitle(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    @NonNull
    public static ViewOffsetHelper getViewOffsetHelper(@NonNull View view) {
        ViewOffsetHelper viewOffsetHelper = (ViewOffsetHelper) view.getTag(R.id.view_offset_helper);
        if (viewOffsetHelper != null) {
            return viewOffsetHelper;
        }
        ViewOffsetHelper viewOffsetHelper2 = new ViewOffsetHelper(view);
        view.setTag(R.id.view_offset_helper, viewOffsetHelper2);
        return viewOffsetHelper2;
    }

    private boolean isTitleCollapseFadeMode() {
        return this.titleCollapseMode == 1;
    }

    private static boolean isToolbar(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    private boolean isToolbarChild(View view) {
        View view2 = this.toolbarDirectChild;
        if (view2 == null || view2 == this) {
            return view == this.toolbar;
        }
        return view == view2;
    }

    private void updateCollapsedBounds(boolean z3) {
        int titleMarginStart;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        View view = this.toolbarDirectChild;
        if (view == null) {
            view = this.toolbar;
        }
        int maxOffsetForPinChild = getMaxOffsetForPinChild(view);
        DescendantOffsetUtils.getDescendantRect(this, this.dummyView, this.tmpRect);
        ViewGroup viewGroup = this.toolbar;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            titleMarginStart = toolbar.getTitleMarginStart();
            titleMarginEnd = toolbar.getTitleMarginEnd();
            titleMarginTop = toolbar.getTitleMarginTop();
            titleMarginBottom = toolbar.getTitleMarginBottom();
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            titleMarginStart = toolbar2.getTitleMarginStart();
            titleMarginEnd = toolbar2.getTitleMarginEnd();
            titleMarginTop = toolbar2.getTitleMarginTop();
            titleMarginBottom = toolbar2.getTitleMarginBottom();
        } else {
            titleMarginStart = 0;
            titleMarginBottom = 0;
            titleMarginEnd = 0;
            titleMarginTop = 0;
        }
        Rect rect = this.tmpRect;
        int i7 = rect.left + (z3 ? titleMarginEnd : titleMarginStart);
        int i10 = rect.right - (z3 ? titleMarginStart : titleMarginEnd);
        int i11 = rect.top + maxOffsetForPinChild + titleMarginTop;
        int i12 = (rect.bottom + maxOffsetForPinChild) - titleMarginBottom;
        int collapsedFullSingleLineHeight = (int) (i12 - this.collapsingSubtitleHelper.getCollapsedFullSingleLineHeight());
        int collapsedFullSingleLineHeight2 = (int) (this.collapsingTitleHelper.getCollapsedFullSingleLineHeight() + i11);
        if (TextUtils.isEmpty(this.collapsingSubtitleHelper.getText())) {
            this.collapsingTitleHelper.setCollapsedBounds(i7, i11, i10, i12);
        } else {
            this.collapsingTitleHelper.setCollapsedBounds(i7, i11, i10, collapsedFullSingleLineHeight);
            this.collapsingSubtitleHelper.setCollapsedBounds(i7, collapsedFullSingleLineHeight2, i10, i12);
        }
        if (this.collapsedTitleGravityMode == 0) {
            DescendantOffsetUtils.getDescendantRect(this, this, this.tmpRect);
            Rect rect2 = this.tmpRect;
            int i13 = rect2.left + (z3 ? titleMarginEnd : titleMarginStart);
            int i14 = rect2.right;
            if (!z3) {
                titleMarginStart = titleMarginEnd;
            }
            int i15 = i14 - titleMarginStart;
            if (TextUtils.isEmpty(this.collapsingSubtitleHelper.getText())) {
                this.collapsingTitleHelper.setCollapsedBoundsForOffsets(i13, i11, i15, i12);
            } else {
                this.collapsingTitleHelper.setCollapsedBoundsForOffsets(i13, i11, i15, collapsedFullSingleLineHeight);
                this.collapsingSubtitleHelper.setCollapsedBoundsForOffsets(i13, collapsedFullSingleLineHeight2, i15, i12);
            }
        }
    }

    private void updateContentDescriptionFromTitle() {
        setContentDescription(getTitle());
    }

    private void updateContentScrimBounds(@NonNull Drawable drawable, int i7, int i10) {
        updateContentScrimBounds(drawable, this.toolbar, i7, i10);
    }

    private void updateDummyView() {
        View view;
        if (!this.collapsingTitleEnabled && (view = this.dummyView) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.dummyView);
            }
        }
        if (!this.collapsingTitleEnabled || this.toolbar == null) {
            return;
        }
        if (this.dummyView == null) {
            this.dummyView = new View(getContext());
        }
        if (this.dummyView.getParent() == null) {
            this.toolbar.addView(this.dummyView, -1, -1);
        }
    }

    private void updateTextBounds(int i7, int i10, int i11, int i12, boolean z3) {
        View view;
        if (!this.collapsingTitleEnabled || (view = this.dummyView) == null) {
            return;
        }
        boolean z8 = view.isAttachedToWindow() && this.dummyView.getVisibility() == 0;
        this.drawCollapsingTitle = z8;
        if (z8 || z3) {
            boolean z10 = getLayoutDirection() == 1;
            updateCollapsedBounds(z10);
            int i13 = z10 ? this.expandedMarginEnd : this.expandedMarginStart;
            int i14 = this.tmpRect.top + this.expandedMarginTop;
            int i15 = (i11 - i7) - (z10 ? this.expandedMarginStart : this.expandedMarginEnd);
            int i16 = (i12 - i10) - this.expandedMarginBottom;
            if (TextUtils.isEmpty(this.collapsingSubtitleHelper.getText())) {
                this.collapsingTitleHelper.setExpandedBounds(i13, i14, i15, i16);
                this.collapsingTitleHelper.recalculate(z3);
            } else {
                this.collapsingTitleHelper.setExpandedBounds(i13, i14, i15, (int) ((i16 - (this.collapsingSubtitleHelper.getExpandedTextFullSingleLineHeight() + this.extraMultilineSubtitleHeight)) - this.expandedTitleSpacing), false);
                this.collapsingSubtitleHelper.setExpandedBounds(i13, (int) (this.collapsingTitleHelper.getExpandedTextFullSingleLineHeight() + this.extraMultilineTitleHeight + i14 + this.expandedTitleSpacing), i15, i16, false);
                this.collapsingTitleHelper.recalculate(z3);
                this.collapsingSubtitleHelper.recalculate(z3);
            }
        }
    }

    private void updateTitleFromToolbarIfNeeded() {
        ViewGroup viewGroup = this.toolbar;
        if (viewGroup == null || !this.collapsingTitleEnabled) {
            return;
        }
        CharSequence toolbarTitle = getToolbarTitle(viewGroup);
        if (TextUtils.isEmpty(this.collapsingTitleHelper.getText()) && !TextUtils.isEmpty(toolbarTitle)) {
            setTitle(toolbarTitle);
        }
        CharSequence toolbarSubtitle = getToolbarSubtitle(this.toolbar);
        if (!TextUtils.isEmpty(this.collapsingSubtitleHelper.getText()) || TextUtils.isEmpty(toolbarSubtitle)) {
            return;
        }
        setSubtitle(toolbarSubtitle);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        ensureToolbar();
        if (this.toolbar == null && (drawable = this.contentScrim) != null && this.scrimAlpha > 0) {
            drawable.mutate().setAlpha(this.scrimAlpha);
            this.contentScrim.draw(canvas);
        }
        if (this.collapsingTitleEnabled && this.drawCollapsingTitle) {
            if (this.toolbar == null || this.contentScrim == null || this.scrimAlpha <= 0 || !isTitleCollapseFadeMode() || this.collapsingTitleHelper.getExpansionFraction() >= this.collapsingTitleHelper.getFadeModeThresholdFraction()) {
                this.collapsingTitleHelper.draw(canvas);
                this.collapsingSubtitleHelper.draw(canvas);
            } else {
                int iSave = canvas.save();
                canvas.clipRect(this.contentScrim.getBounds(), Region.Op.DIFFERENCE);
                this.collapsingTitleHelper.draw(canvas);
                this.collapsingSubtitleHelper.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        if (this.statusBarScrim == null || this.scrimAlpha <= 0) {
            return;
        }
        q0 q0Var = this.lastInsets;
        int iD = q0Var != null ? q0Var.d() : 0;
        if (iD > 0) {
            this.statusBarScrim.setBounds(0, -this.currentOffset, getWidth(), iD - this.currentOffset);
            this.statusBarScrim.mutate().setAlpha(this.scrimAlpha);
            this.statusBarScrim.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j6) {
        boolean z3;
        if (this.contentScrim == null || this.scrimAlpha <= 0 || !isToolbarChild(view)) {
            z3 = false;
        } else {
            updateContentScrimBounds(this.contentScrim, view, getWidth(), getHeight());
            this.contentScrim.mutate().setAlpha(this.scrimAlpha);
            this.contentScrim.draw(canvas);
            z3 = true;
        }
        return super.drawChild(canvas, view, j6) || z3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.statusBarScrim;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.contentScrim;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        CollapsingTextHelper collapsingTextHelper = this.collapsingTitleHelper;
        if (collapsingTextHelper != null) {
            state |= collapsingTextHelper.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public float getCollapsedSubtitleTextSize() {
        return this.collapsingSubtitleHelper.getCollapsedTextSize();
    }

    @NonNull
    public Typeface getCollapsedSubtitleTypeface() {
        return this.collapsingSubtitleHelper.getCollapsedTypeface();
    }

    public int getCollapsedTitleGravity() {
        return this.collapsingTitleHelper.getCollapsedTextGravity();
    }

    public float getCollapsedTitleTextSize() {
        return this.collapsingTitleHelper.getCollapsedTextSize();
    }

    @NonNull
    public Typeface getCollapsedTitleTypeface() {
        return this.collapsingTitleHelper.getCollapsedTypeface();
    }

    @Nullable
    public Drawable getContentScrim() {
        return this.contentScrim;
    }

    public float getExpandedSubtitleTextSize() {
        return this.collapsingSubtitleHelper.getExpandedTextSize();
    }

    @NonNull
    public Typeface getExpandedSubtitleTypeface() {
        return this.collapsingSubtitleHelper.getExpandedTypeface();
    }

    public int getExpandedTitleGravity() {
        return this.collapsingTitleHelper.getExpandedTextGravity();
    }

    public int getExpandedTitleMarginBottom() {
        return this.expandedMarginBottom;
    }

    public int getExpandedTitleMarginEnd() {
        return this.expandedMarginEnd;
    }

    public int getExpandedTitleMarginStart() {
        return this.expandedMarginStart;
    }

    public int getExpandedTitleMarginTop() {
        return this.expandedMarginTop;
    }

    public int getExpandedTitleSpacing() {
        return this.expandedTitleSpacing;
    }

    public float getExpandedTitleTextSize() {
        return this.collapsingTitleHelper.getExpandedTextSize();
    }

    @NonNull
    public Typeface getExpandedTitleTypeface() {
        return this.collapsingTitleHelper.getExpandedTypeface();
    }

    @RequiresApi(23)
    @RestrictTo({c.f39801b})
    public int getHyphenationFrequency() {
        return this.collapsingTitleHelper.getHyphenationFrequency();
    }

    @RestrictTo({c.f39801b})
    public int getLineCount() {
        return this.collapsingTitleHelper.getLineCount();
    }

    @RequiresApi(23)
    @RestrictTo({c.f39801b})
    public float getLineSpacingAdd() {
        return this.collapsingTitleHelper.getLineSpacingAdd();
    }

    @RequiresApi(23)
    @RestrictTo({c.f39801b})
    public float getLineSpacingMultiplier() {
        return this.collapsingTitleHelper.getLineSpacingMultiplier();
    }

    @RestrictTo({c.f39801b})
    public int getMaxLines() {
        return this.collapsingTitleHelper.getExpandedMaxLines();
    }

    public final int getMaxOffsetForPinChild(@NonNull View view) {
        return ((getHeight() - getViewOffsetHelper(view).getLayoutTop()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    public int getScrimAlpha() {
        return this.scrimAlpha;
    }

    public long getScrimAnimationDuration() {
        return this.scrimAnimationDuration;
    }

    public int getScrimVisibleHeightTrigger() {
        int i7 = this.scrimVisibleHeightTrigger;
        if (i7 >= 0) {
            return i7 + this.topInsetApplied + this.extraMultilineTitleHeight + this.extraMultilineSubtitleHeight + this.extraHeightForTitles;
        }
        q0 q0Var = this.lastInsets;
        int iD = q0Var != null ? q0Var.d() : 0;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + iD, getHeight()) : getHeight() / 3;
    }

    @Nullable
    public Drawable getStatusBarScrim() {
        return this.statusBarScrim;
    }

    @Nullable
    public CharSequence getSubtitle() {
        if (this.collapsingTitleEnabled) {
            return this.collapsingSubtitleHelper.getText();
        }
        return null;
    }

    @Nullable
    public CharSequence getTitle() {
        if (this.collapsingTitleEnabled) {
            return this.collapsingTitleHelper.getText();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.titleCollapseMode;
    }

    @Nullable
    public TimeInterpolator getTitlePositionInterpolator() {
        return this.collapsingTitleHelper.getPositionInterpolator();
    }

    @NonNull
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.collapsingTitleHelper.getTitleTextEllipsize();
    }

    @RestrictTo({c.f39801b})
    public boolean isExtraMultilineHeightEnabled() {
        return this.extraMultilineHeightEnabled;
    }

    @RestrictTo({c.f39801b})
    public boolean isForceApplySystemWindowInsetTop() {
        return this.forceApplySystemWindowInsetTop;
    }

    @RestrictTo({c.f39801b})
    public boolean isRtlTextDirectionHeuristicsEnabled() {
        return this.collapsingTitleHelper.isRtlTextDirectionHeuristicsEnabled();
    }

    public boolean isTitleEnabled() {
        return this.collapsingTitleEnabled;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            disableLiftOnScrollIfNeeded(appBarLayout);
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            if (this.onOffsetChangedListener == null) {
                this.onOffsetChangedListener = new OffsetUpdateListener();
            }
            appBarLayout.addOnOffsetChangedListener(this.onOffsetChangedListener);
            requestApplyInsets();
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.collapsingTitleHelper.maybeUpdateFontWeightAdjustment(configuration);
        if (this.screenOrientation != configuration.orientation && this.extraMultilineHeightEnabled && this.collapsingTitleHelper.getExpansionFraction() == 1.0f) {
            ViewParent parent = getParent();
            if (parent instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) parent;
                if (appBarLayout.getPendingAction() == 0) {
                    appBarLayout.setPendingAction(2);
                }
            }
        }
        this.screenOrientation = configuration.orientation;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.OnOffsetChangedListener onOffsetChangedListener = this.onOffsetChangedListener;
        if (onOffsetChangedListener != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).removeOnOffsetChangedListener(onOffsetChangedListener);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        super.onLayout(z3, i7, i10, i11, i12);
        q0 q0Var = this.lastInsets;
        if (q0Var != null) {
            int iD = q0Var.d();
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < iD) {
                    WeakHashMap weakHashMap = N.f16168a;
                    childAt.offsetTopAndBottom(iD);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            getViewOffsetHelper(getChildAt(i14)).onViewLayout();
        }
        updateTextBounds(i7, i10, i11, i12, false);
        updateTitleFromToolbarIfNeeded();
        updateScrimVisibility();
        int childCount3 = getChildCount();
        for (int i15 = 0; i15 < childCount3; i15++) {
            getViewOffsetHelper(getChildAt(i15)).applyOffsets();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        CollapsingToolbarLayout collapsingToolbarLayout;
        ensureToolbar();
        super.onMeasure(i7, i10);
        int mode = View.MeasureSpec.getMode(i10);
        q0 q0Var = this.lastInsets;
        int iD = q0Var != null ? q0Var.d() : 0;
        if ((mode == 0 || this.forceApplySystemWindowInsetTop) && iD > 0) {
            this.topInsetApplied = iD;
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iD, 1073741824));
        }
        updateTitleFromToolbarIfNeeded();
        if (!this.collapsingTitleEnabled || TextUtils.isEmpty(this.collapsingTitleHelper.getText())) {
            collapsingToolbarLayout = this;
        } else {
            int measuredHeight = getMeasuredHeight();
            collapsingToolbarLayout = this;
            collapsingToolbarLayout.updateTextBounds(0, 0, getMeasuredWidth(), measuredHeight, true);
            int expandedTextFullSingleLineHeight = (int) (collapsingToolbarLayout.collapsingTitleHelper.getExpandedTextFullSingleLineHeight() + collapsingToolbarLayout.topInsetApplied + collapsingToolbarLayout.expandedMarginTop + (TextUtils.isEmpty(collapsingToolbarLayout.collapsingSubtitleHelper.getText()) ? 0.0f : collapsingToolbarLayout.expandedTitleSpacing + collapsingToolbarLayout.collapsingSubtitleHelper.getExpandedTextFullSingleLineHeight()) + collapsingToolbarLayout.expandedMarginBottom);
            if (expandedTextFullSingleLineHeight > measuredHeight) {
                collapsingToolbarLayout.extraHeightForTitles = expandedTextFullSingleLineHeight - measuredHeight;
            } else {
                collapsingToolbarLayout.extraHeightForTitles = 0;
            }
            if (collapsingToolbarLayout.extraMultilineHeightEnabled) {
                if (collapsingToolbarLayout.collapsingTitleHelper.getExpandedMaxLines() > 1) {
                    int expandedLineCount = collapsingToolbarLayout.collapsingTitleHelper.getExpandedLineCount();
                    if (expandedLineCount > 1) {
                        collapsingToolbarLayout.extraMultilineTitleHeight = (expandedLineCount - 1) * Math.round(collapsingToolbarLayout.collapsingTitleHelper.getExpandedTextFullSingleLineHeight());
                    } else {
                        collapsingToolbarLayout.extraMultilineTitleHeight = 0;
                    }
                }
                if (collapsingToolbarLayout.collapsingSubtitleHelper.getExpandedMaxLines() > 1) {
                    int expandedLineCount2 = collapsingToolbarLayout.collapsingSubtitleHelper.getExpandedLineCount();
                    if (expandedLineCount2 > 1) {
                        collapsingToolbarLayout.extraMultilineSubtitleHeight = (expandedLineCount2 - 1) * Math.round(collapsingToolbarLayout.collapsingSubtitleHelper.getExpandedTextFullSingleLineHeight());
                    } else {
                        collapsingToolbarLayout.extraMultilineSubtitleHeight = 0;
                    }
                }
            }
            int i11 = collapsingToolbarLayout.extraHeightForTitles;
            int i12 = collapsingToolbarLayout.extraMultilineTitleHeight;
            int i13 = collapsingToolbarLayout.extraMultilineSubtitleHeight;
            if (i11 + i12 + i13 > 0) {
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(measuredHeight + i11 + i12 + i13, 1073741824));
            }
        }
        ViewGroup viewGroup = collapsingToolbarLayout.toolbar;
        if (viewGroup != null) {
            View view = collapsingToolbarLayout.toolbarDirectChild;
            if (view == null || view == collapsingToolbarLayout) {
                setMinimumHeight(getHeightWithMargins(viewGroup));
            } else {
                setMinimumHeight(getHeightWithMargins(view));
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        Drawable drawable = this.contentScrim;
        if (drawable != null) {
            updateContentScrimBounds(drawable, i7, i10);
        }
    }

    public q0 onWindowInsetChanged(@NonNull q0 q0Var) {
        q0 q0Var2 = getFitsSystemWindows() ? q0Var : null;
        if (!Objects.equals(this.lastInsets, q0Var2)) {
            this.lastInsets = q0Var2;
            requestLayout();
        }
        return q0Var.f16277a.c();
    }

    public void setCollapsedSubtitleTextAppearance(@StyleRes int i7) {
        this.collapsingSubtitleHelper.setCollapsedTextAppearance(i7);
    }

    public void setCollapsedSubtitleTextColor(@ColorInt int i7) {
        setCollapsedSubtitleTextColor(ColorStateList.valueOf(i7));
    }

    public void setCollapsedSubtitleTextSize(float f10) {
        this.collapsingSubtitleHelper.setCollapsedTextSize(f10);
    }

    public void setCollapsedSubtitleTypeface(@Nullable Typeface typeface) {
        this.collapsingSubtitleHelper.setCollapsedTypeface(typeface);
    }

    public void setCollapsedTitleGravity(int i7) {
        this.collapsingTitleHelper.setCollapsedTextGravity(i7);
        this.collapsingSubtitleHelper.setCollapsedTextGravity(i7);
    }

    public void setCollapsedTitleTextAppearance(@StyleRes int i7) {
        this.collapsingTitleHelper.setCollapsedTextAppearance(i7);
    }

    public void setCollapsedTitleTextColor(@ColorInt int i7) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i7));
    }

    public void setCollapsedTitleTextSize(float f10) {
        this.collapsingTitleHelper.setCollapsedTextSize(f10);
    }

    public void setCollapsedTitleTypeface(@Nullable Typeface typeface) {
        this.collapsingTitleHelper.setCollapsedTypeface(typeface);
    }

    public void setContentScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.contentScrim;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.contentScrim = drawableMutate;
            if (drawableMutate != null) {
                updateContentScrimBounds(drawableMutate, getWidth(), getHeight());
                this.contentScrim.setCallback(this);
                this.contentScrim.setAlpha(this.scrimAlpha);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(@ColorInt int i7) {
        setContentScrim(new ColorDrawable(i7));
    }

    public void setContentScrimResource(@DrawableRes int i7) {
        setContentScrim(getContext().getDrawable(i7));
    }

    public void setExpandedSubtitleColor(@ColorInt int i7) {
        setExpandedSubtitleTextColor(ColorStateList.valueOf(i7));
    }

    public void setExpandedSubtitleTextAppearance(@StyleRes int i7) {
        this.collapsingSubtitleHelper.setExpandedTextAppearance(i7);
    }

    public void setExpandedSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.collapsingSubtitleHelper.setExpandedTextColor(colorStateList);
    }

    public void setExpandedSubtitleTextSize(float f10) {
        this.collapsingSubtitleHelper.setExpandedTextSize(f10);
    }

    public void setExpandedSubtitleTypeface(@Nullable Typeface typeface) {
        this.collapsingSubtitleHelper.setExpandedTypeface(typeface);
    }

    public void setExpandedTitleColor(@ColorInt int i7) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i7));
    }

    public void setExpandedTitleGravity(int i7) {
        this.collapsingTitleHelper.setExpandedTextGravity(i7);
        this.collapsingSubtitleHelper.setExpandedTextGravity(i7);
    }

    public void setExpandedTitleMargin(int i7, int i10, int i11, int i12) {
        this.expandedMarginStart = i7;
        this.expandedMarginTop = i10;
        this.expandedMarginEnd = i11;
        this.expandedMarginBottom = i12;
        requestLayout();
    }

    public void setExpandedTitleMarginBottom(int i7) {
        this.expandedMarginBottom = i7;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i7) {
        this.expandedMarginEnd = i7;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i7) {
        this.expandedMarginStart = i7;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i7) {
        this.expandedMarginTop = i7;
        requestLayout();
    }

    public void setExpandedTitleSpacing(int i7) {
        this.expandedTitleSpacing = i7;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@StyleRes int i7) {
        this.collapsingTitleHelper.setExpandedTextAppearance(i7);
    }

    public void setExpandedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.collapsingTitleHelper.setExpandedTextColor(colorStateList);
    }

    public void setExpandedTitleTextSize(float f10) {
        this.collapsingTitleHelper.setExpandedTextSize(f10);
    }

    public void setExpandedTitleTypeface(@Nullable Typeface typeface) {
        this.collapsingTitleHelper.setExpandedTypeface(typeface);
    }

    @RestrictTo({c.f39801b})
    public void setExtraMultilineHeightEnabled(boolean z3) {
        this.extraMultilineHeightEnabled = z3;
    }

    @RestrictTo({c.f39801b})
    public void setForceApplySystemWindowInsetTop(boolean z3) {
        this.forceApplySystemWindowInsetTop = z3;
    }

    @RequiresApi(23)
    @RestrictTo({c.f39801b})
    public void setHyphenationFrequency(int i7) {
        this.collapsingTitleHelper.setHyphenationFrequency(i7);
    }

    @RequiresApi(23)
    @RestrictTo({c.f39801b})
    public void setLineSpacingAdd(float f10) {
        this.collapsingTitleHelper.setLineSpacingAdd(f10);
    }

    @RequiresApi(23)
    @RestrictTo({c.f39801b})
    public void setLineSpacingMultiplier(@FloatRange(from = 0.0d) float f10) {
        this.collapsingTitleHelper.setLineSpacingMultiplier(f10);
    }

    @RestrictTo({c.f39801b})
    public void setMaxLines(int i7) {
        this.collapsingTitleHelper.setExpandedMaxLines(i7);
        this.collapsingSubtitleHelper.setExpandedMaxLines(i7);
    }

    @RestrictTo({c.f39801b})
    public void setRtlTextDirectionHeuristicsEnabled(boolean z3) {
        this.collapsingTitleHelper.setRtlTextDirectionHeuristicsEnabled(z3);
    }

    public void setScrimAlpha(int i7) {
        ViewGroup viewGroup;
        if (i7 != this.scrimAlpha) {
            if (this.contentScrim != null && (viewGroup = this.toolbar) != null) {
                viewGroup.postInvalidateOnAnimation();
            }
            this.scrimAlpha = i7;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(@IntRange(from = 0) long j6) {
        this.scrimAnimationDuration = j6;
    }

    public void setScrimVisibleHeightTrigger(@IntRange(from = 0) int i7) {
        if (this.scrimVisibleHeightTrigger != i7) {
            this.scrimVisibleHeightTrigger = i7;
            updateScrimVisibility();
        }
    }

    public void setScrimsShown(boolean z3) {
        setScrimsShown(z3, isLaidOut() && !isInEditMode());
    }

    @RequiresApi(23)
    @RestrictTo({c.f39801b})
    public void setStaticLayoutBuilderConfigurer(@Nullable StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        this.collapsingTitleHelper.setStaticLayoutBuilderConfigurer(staticLayoutBuilderConfigurer);
    }

    public void setStatusBarScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.statusBarScrim;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.statusBarScrim = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.statusBarScrim.setState(getDrawableState());
                }
                this.statusBarScrim.setLayoutDirection(getLayoutDirection());
                this.statusBarScrim.setVisible(getVisibility() == 0, false);
                this.statusBarScrim.setCallback(this);
                this.statusBarScrim.setAlpha(this.scrimAlpha);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(@ColorInt int i7) {
        setStatusBarScrim(new ColorDrawable(i7));
    }

    public void setStatusBarScrimResource(@DrawableRes int i7) {
        setStatusBarScrim(getContext().getDrawable(i7));
    }

    public void setSubtitle(@Nullable CharSequence charSequence) {
        this.collapsingSubtitleHelper.setText(charSequence);
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        this.collapsingTitleHelper.setText(charSequence);
        updateContentDescriptionFromTitle();
    }

    public void setTitleCollapseMode(int i7) {
        this.titleCollapseMode = i7;
        boolean zIsTitleCollapseFadeMode = isTitleCollapseFadeMode();
        this.collapsingTitleHelper.setFadeModeEnabled(zIsTitleCollapseFadeMode);
        this.collapsingSubtitleHelper.setFadeModeEnabled(zIsTitleCollapseFadeMode);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            disableLiftOnScrollIfNeeded((AppBarLayout) parent);
        }
        if (zIsTitleCollapseFadeMode && this.contentScrim == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(@NonNull TextUtils.TruncateAt truncateAt) {
        this.collapsingTitleHelper.setTitleTextEllipsize(truncateAt);
    }

    public void setTitleEnabled(boolean z3) {
        if (z3 != this.collapsingTitleEnabled) {
            this.collapsingTitleEnabled = z3;
            updateContentDescriptionFromTitle();
            updateDummyView();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        this.collapsingTitleHelper.setPositionInterpolator(timeInterpolator);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z3 = i7 == 0;
        Drawable drawable = this.statusBarScrim;
        if (drawable != null && drawable.isVisible() != z3) {
            this.statusBarScrim.setVisible(z3, false);
        }
        Drawable drawable2 = this.contentScrim;
        if (drawable2 == null || drawable2.isVisible() == z3) {
            return;
        }
        this.contentScrim.setVisible(z3, false);
    }

    public final void updateScrimVisibility() {
        if (this.contentScrim == null && this.statusBarScrim == null) {
            return;
        }
        setScrimsShown(getHeight() + this.currentOffset < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.contentScrim || drawable == this.statusBarScrim;
    }

    public CollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.collapsingToolbarLayoutStyle);
    }

    private void updateContentScrimBounds(@NonNull Drawable drawable, @Nullable View view, int i7, int i10) {
        if (isTitleCollapseFadeMode() && view != null && this.collapsingTitleEnabled) {
            i10 = view.getBottom();
        }
        drawable.setBounds(0, 0, i7, i10);
    }

    public void setCollapsedSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.collapsingSubtitleHelper.setCollapsedTextColor(colorStateList);
    }

    public void setCollapsedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.collapsingTitleHelper.setCollapsedTextColor(colorStateList);
    }

    public void setScrimsShown(boolean z3, boolean z8) {
        if (this.scrimsAreShown != z3) {
            if (z8) {
                animateScrim(z3 ? 255 : 0);
            } else {
                setScrimAlpha(z3 ? 255 : 0);
            }
            this.scrimsAreShown = z3;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        int i10 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i7, i10), attributeSet, i7);
        this.refreshToolbar = true;
        this.tmpRect = new Rect();
        this.scrimVisibleHeightTrigger = -1;
        this.topInsetApplied = 0;
        this.extraMultilineTitleHeight = 0;
        this.extraMultilineSubtitleHeight = 0;
        this.extraHeightForTitles = 0;
        Context context2 = getContext();
        this.screenOrientation = getResources().getConfiguration().orientation;
        CollapsingTextHelper collapsingTextHelper = new CollapsingTextHelper(this);
        this.collapsingTitleHelper = collapsingTextHelper;
        TimeInterpolator timeInterpolator = AnimationUtils.DECELERATE_INTERPOLATOR;
        collapsingTextHelper.setTextSizeInterpolator(timeInterpolator);
        collapsingTextHelper.setRtlTextDirectionHeuristicsEnabled(false);
        this.elevationOverlayProvider = new ElevationOverlayProvider(context2);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.CollapsingToolbarLayout, i7, i10, new int[0]);
        int i11 = typedArrayObtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_expandedTitleGravity, 8388691);
        int i12 = typedArrayObtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_collapsedTitleGravity, NavigationBarView.ITEM_GRAVITY_START_CENTER);
        this.collapsedTitleGravityMode = typedArrayObtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_collapsedTitleGravityMode, 1);
        collapsingTextHelper.setExpandedTextGravity(i11);
        collapsingTextHelper.setCollapsedTextGravity(i12);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.expandedMarginBottom = dimensionPixelSize;
        this.expandedMarginEnd = dimensionPixelSize;
        this.expandedMarginTop = dimensionPixelSize;
        this.expandedMarginStart = dimensionPixelSize;
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.expandedMarginStart = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.expandedMarginEnd = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.expandedMarginTop = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.expandedMarginBottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CollapsingToolbarLayout_expandedTitleSpacing)) {
            this.expandedTitleSpacing = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CollapsingToolbarLayout_expandedTitleSpacing, 0);
        }
        this.collapsingTitleEnabled = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(typedArrayObtainStyledAttributes.getText(R.styleable.CollapsingToolbarLayout_title));
        collapsingTextHelper.setExpandedTextAppearance(R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        collapsingTextHelper.setCollapsedTextAppearance(i.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            collapsingTextHelper.setExpandedTextAppearance(typedArrayObtainStyledAttributes.getResourceId(R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            collapsingTextHelper.setCollapsedTextAppearance(typedArrayObtainStyledAttributes.getResourceId(R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CollapsingToolbarLayout_titleTextEllipsize)) {
            setTitleEllipsize(convertEllipsizeToTruncateAt(typedArrayObtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_titleTextEllipsize, -1)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CollapsingToolbarLayout_expandedTitleTextColor)) {
            collapsingTextHelper.setExpandedTextColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.CollapsingToolbarLayout_expandedTitleTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CollapsingToolbarLayout_collapsedTitleTextColor)) {
            collapsingTextHelper.setCollapsedTextColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.CollapsingToolbarLayout_collapsedTitleTextColor));
        }
        this.scrimVisibleHeightTrigger = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CollapsingToolbarLayout_titleMaxLines)) {
            collapsingTextHelper.setExpandedMaxLines(typedArrayObtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_titleMaxLines, 1));
        } else if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CollapsingToolbarLayout_maxLines)) {
            collapsingTextHelper.setExpandedMaxLines(typedArrayObtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_maxLines, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CollapsingToolbarLayout_titlePositionInterpolator)) {
            collapsingTextHelper.setPositionInterpolator(android.view.animation.AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(R.styleable.CollapsingToolbarLayout_titlePositionInterpolator, 0)));
        }
        CollapsingTextHelper collapsingTextHelper2 = new CollapsingTextHelper(this);
        this.collapsingSubtitleHelper = collapsingTextHelper2;
        collapsingTextHelper2.setTextSizeInterpolator(timeInterpolator);
        collapsingTextHelper2.setRtlTextDirectionHeuristicsEnabled(false);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CollapsingToolbarLayout_subtitle)) {
            setSubtitle(typedArrayObtainStyledAttributes.getText(R.styleable.CollapsingToolbarLayout_subtitle));
        }
        collapsingTextHelper2.setExpandedTextGravity(i11);
        collapsingTextHelper2.setCollapsedTextGravity(i12);
        collapsingTextHelper2.setExpandedTextAppearance(i.TextAppearance_AppCompat_Headline);
        collapsingTextHelper2.setCollapsedTextAppearance(i.TextAppearance_AppCompat_Widget_ActionBar_Subtitle);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CollapsingToolbarLayout_expandedSubtitleTextAppearance)) {
            collapsingTextHelper2.setExpandedTextAppearance(typedArrayObtainStyledAttributes.getResourceId(R.styleable.CollapsingToolbarLayout_expandedSubtitleTextAppearance, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CollapsingToolbarLayout_collapsedSubtitleTextAppearance)) {
            collapsingTextHelper2.setCollapsedTextAppearance(typedArrayObtainStyledAttributes.getResourceId(R.styleable.CollapsingToolbarLayout_collapsedSubtitleTextAppearance, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CollapsingToolbarLayout_expandedSubtitleTextColor)) {
            collapsingTextHelper2.setExpandedTextColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.CollapsingToolbarLayout_expandedSubtitleTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CollapsingToolbarLayout_collapsedSubtitleTextColor)) {
            collapsingTextHelper2.setCollapsedTextColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.CollapsingToolbarLayout_collapsedSubtitleTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CollapsingToolbarLayout_subtitleMaxLines)) {
            collapsingTextHelper2.setExpandedMaxLines(typedArrayObtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_subtitleMaxLines, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CollapsingToolbarLayout_titlePositionInterpolator)) {
            collapsingTextHelper2.setPositionInterpolator(android.view.animation.AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(R.styleable.CollapsingToolbarLayout_titlePositionInterpolator, 0)));
        }
        this.scrimAnimationDuration = typedArrayObtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        this.scrimAnimationFadeInInterpolator = MotionUtils.resolveThemeInterpolator(context2, R.attr.motionEasingStandardInterpolator, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        this.scrimAnimationFadeOutInterpolator = MotionUtils.resolveThemeInterpolator(context2, R.attr.motionEasingStandardInterpolator, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        setContentScrim(typedArrayObtainStyledAttributes.getDrawable(R.styleable.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(typedArrayObtainStyledAttributes.getDrawable(R.styleable.CollapsingToolbarLayout_statusBarScrim));
        setTitleCollapseMode(typedArrayObtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_titleCollapseMode, 0));
        this.toolbarId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.CollapsingToolbarLayout_toolbarId, -1);
        this.forceApplySystemWindowInsetTop = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CollapsingToolbarLayout_forceApplySystemWindowInsetTop, false);
        this.extraMultilineHeightEnabled = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CollapsingToolbarLayout_extraMultilineHeightEnabled, false);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
        OnApplyWindowInsetsListener onApplyWindowInsetsListener = new OnApplyWindowInsetsListener() { // from class: com.google.android.material.appbar.CollapsingToolbarLayout.1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public q0 onApplyWindowInsets(View view, @NonNull q0 q0Var) {
                return CollapsingToolbarLayout.this.onWindowInsetChanged(q0Var);
            }
        };
        WeakHashMap weakHashMap = N.f16168a;
        E.n(this, onApplyWindowInsetsListener);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {
        public static final int COLLAPSE_MODE_OFF = 0;
        public static final int COLLAPSE_MODE_PARALLAX = 2;
        public static final int COLLAPSE_MODE_PIN = 1;
        private static final float DEFAULT_PARALLAX_MULTIPLIER = 0.5f;
        int collapseMode;
        float parallaxMult;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.collapseMode = 0;
            this.parallaxMult = DEFAULT_PARALLAX_MULTIPLIER;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CollapsingToolbarLayout_Layout);
            this.collapseMode = typedArrayObtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            setParallaxMultiplier(typedArrayObtainStyledAttributes.getFloat(R.styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, DEFAULT_PARALLAX_MULTIPLIER));
            typedArrayObtainStyledAttributes.recycle();
        }

        public int getCollapseMode() {
            return this.collapseMode;
        }

        public float getParallaxMultiplier() {
            return this.parallaxMult;
        }

        public void setCollapseMode(int i7) {
            this.collapseMode = i7;
        }

        public void setParallaxMultiplier(float f10) {
            this.parallaxMult = f10;
        }

        public LayoutParams(int i7, int i10) {
            super(i7, i10);
            this.collapseMode = 0;
            this.parallaxMult = DEFAULT_PARALLAX_MULTIPLIER;
        }

        public LayoutParams(int i7, int i10, int i11) {
            super(i7, i10, i11);
            this.collapseMode = 0;
            this.parallaxMult = DEFAULT_PARALLAX_MULTIPLIER;
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.collapseMode = 0;
            this.parallaxMult = DEFAULT_PARALLAX_MULTIPLIER;
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.collapseMode = 0;
            this.parallaxMult = DEFAULT_PARALLAX_MULTIPLIER;
        }

        public LayoutParams(@NonNull FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.collapseMode = 0;
            this.parallaxMult = DEFAULT_PARALLAX_MULTIPLIER;
        }

        public LayoutParams(@NonNull LayoutParams layoutParams) {
            super((FrameLayout.LayoutParams) layoutParams);
            this.collapseMode = 0;
            this.parallaxMult = DEFAULT_PARALLAX_MULTIPLIER;
            this.collapseMode = layoutParams.collapseMode;
            this.parallaxMult = layoutParams.parallaxMult;
        }
    }
}
