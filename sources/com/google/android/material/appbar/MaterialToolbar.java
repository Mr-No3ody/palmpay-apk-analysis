package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.R;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_Toolbar;
    private static final ImageView.ScaleType[] LOGO_SCALE_TYPE_ARRAY = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    @Nullable
    private Boolean logoAdjustViewBounds;

    @Nullable
    private ImageView.ScaleType logoScaleType;

    @Nullable
    private Integer navigationIconTint;
    private boolean subtitleCentered;
    private boolean titleCentered;

    public MaterialToolbar(@NonNull Context context) {
        this(context, null);
    }

    private Pair<Integer, Integer> calculateTitleBoundLimits(@Nullable TextView textView, @Nullable TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i7 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i7 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i7 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void initBackground(Context context) {
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : DrawableUtils.getColorStateListOrNull(background);
        if (colorStateListValueOf != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.setFillColor(colorStateListValueOf);
            materialShapeDrawable.initializeElevationOverlay(context);
            materialShapeDrawable.setElevation(getElevation());
            setBackground(materialShapeDrawable);
        }
    }

    private void layoutTitleCenteredHorizontally(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i7 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i10 = measuredWidth2 + i7;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i7, 0), Math.max(i10 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i7 += iMax;
            i10 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i10 - i7, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i7, view.getTop(), i10, view.getBottom());
    }

    private void maybeCenterTitleViews() {
        if (this.titleCentered || this.subtitleCentered) {
            TextView titleTextView = ToolbarUtils.getTitleTextView(this);
            TextView subtitleTextView = ToolbarUtils.getSubtitleTextView(this);
            if (titleTextView == null && subtitleTextView == null) {
                return;
            }
            Pair<Integer, Integer> pairCalculateTitleBoundLimits = calculateTitleBoundLimits(titleTextView, subtitleTextView);
            if (this.titleCentered && titleTextView != null) {
                layoutTitleCenteredHorizontally(titleTextView, pairCalculateTitleBoundLimits);
            }
            if (!this.subtitleCentered || subtitleTextView == null) {
                return;
            }
            layoutTitleCenteredHorizontally(subtitleTextView, pairCalculateTitleBoundLimits);
        }
    }

    @Nullable
    private Drawable maybeTintNavigationIcon(@Nullable Drawable drawable) {
        if (drawable == null || this.navigationIconTint == null) {
            return drawable;
        }
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTint(this.navigationIconTint.intValue());
        return drawableMutate;
    }

    private void updateLogoImageView() {
        ImageView logoImageView = ToolbarUtils.getLogoImageView(this);
        if (logoImageView != null) {
            Boolean bool = this.logoAdjustViewBounds;
            if (bool != null) {
                logoImageView.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.logoScaleType;
            if (scaleType != null) {
                logoImageView.setScaleType(scaleType);
            }
        }
    }

    public void clearNavigationIconTint() {
        this.navigationIconTint = null;
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.mutate().setTintList(null);
            setNavigationIcon(navigationIcon);
        }
    }

    @Nullable
    public ImageView.ScaleType getLogoScaleType() {
        return this.logoScaleType;
    }

    @Nullable
    @ColorInt
    public Integer getNavigationIconTint() {
        return this.navigationIconTint;
    }

    public boolean isLogoAdjustViewBounds() {
        Boolean bool = this.logoAdjustViewBounds;
        return bool != null && bool.booleanValue();
    }

    public boolean isSubtitleCentered() {
        return this.subtitleCentered;
    }

    public boolean isTitleCentered() {
        return this.titleCentered;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        super.onLayout(z3, i7, i10, i11, i12);
        maybeCenterTitleViews();
        updateLogoImageView();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        MaterialShapeUtils.setElevation(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z3) {
        Boolean bool = this.logoAdjustViewBounds;
        if (bool == null || bool.booleanValue() != z3) {
            this.logoAdjustViewBounds = Boolean.valueOf(z3);
            requestLayout();
        }
    }

    public void setLogoScaleType(@NonNull ImageView.ScaleType scaleType) {
        if (this.logoScaleType != scaleType) {
            this.logoScaleType = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        super.setNavigationIcon(maybeTintNavigationIcon(drawable));
    }

    public void setNavigationIconTint(@ColorInt int i7) {
        this.navigationIconTint = Integer.valueOf(i7);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z3) {
        if (this.subtitleCentered != z3) {
            this.subtitleCentered = z3;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z3) {
        if (this.titleCentered != z3) {
            this.titleCentered = z3;
            requestLayout();
        }
    }

    public MaterialToolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p241q.a.toolbarStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        int i10 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i7, i10), attributeSet, i7);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.MaterialToolbar, i7, i10, new int[0]);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.MaterialToolbar_navigationIconTint)) {
            setNavigationIconTint(typedArrayObtainStyledAttributes.getColor(R.styleable.MaterialToolbar_navigationIconTint, -1));
        }
        this.titleCentered = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialToolbar_titleCentered, false);
        this.subtitleCentered = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialToolbar_subtitleCentered, false);
        int i11 = typedArrayObtainStyledAttributes.getInt(R.styleable.MaterialToolbar_logoScaleType, -1);
        if (i11 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = LOGO_SCALE_TYPE_ARRAY;
            if (i11 < scaleTypeArr.length) {
                this.logoScaleType = scaleTypeArr[i11];
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.MaterialToolbar_logoAdjustViewBounds)) {
            this.logoAdjustViewBounds = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialToolbar_logoAdjustViewBounds, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        initBackground(context2);
    }
}
