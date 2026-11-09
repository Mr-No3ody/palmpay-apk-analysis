package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
public class LinearProgressIndicator extends BaseProgressIndicator<LinearProgressIndicatorSpec> {
    public static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_LinearProgressIndicator;
    public static final int INDETERMINATE_ANIMATION_TYPE_CONTIGUOUS = 0;
    public static final int INDETERMINATE_ANIMATION_TYPE_DISJOINT = 1;
    public static final int INDICATOR_DIRECTION_END_TO_START = 3;
    public static final int INDICATOR_DIRECTION_LEFT_TO_RIGHT = 0;
    public static final int INDICATOR_DIRECTION_RIGHT_TO_LEFT = 1;
    public static final int INDICATOR_DIRECTION_START_TO_END = 2;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({c.f39801b})
    public @interface IndeterminateAnimationType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({c.f39801b})
    public @interface IndicatorDirection {
    }

    public LinearProgressIndicator(@NonNull Context context) {
        this(context, null);
    }

    private void initializeDrawables() {
        LinearDrawingDelegate linearDrawingDelegate = new LinearDrawingDelegate((LinearProgressIndicatorSpec) this.spec);
        setIndeterminateDrawable(IndeterminateDrawable.createLinearDrawable(getContext(), (LinearProgressIndicatorSpec) this.spec, linearDrawingDelegate));
        setProgressDrawable(DeterminateDrawable.createLinearDrawable(getContext(), (LinearProgressIndicatorSpec) this.spec, linearDrawingDelegate));
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec) this.spec).indeterminateAnimationType;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec) this.spec).indicatorDirection;
    }

    @Px
    public int getTrackInnerCornerRadius() {
        return ((LinearProgressIndicatorSpec) this.spec).trackInnerCornerRadius;
    }

    @Nullable
    public Integer getTrackStopIndicatorPadding() {
        return ((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorPadding;
    }

    @Px
    public int getTrackStopIndicatorSize() {
        return ((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorSize;
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator, android.view.View
    public void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        super.onLayout(z3, i7, i10, i11, i12);
        S s3 = this.spec;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s3;
        boolean z8 = true;
        if (((LinearProgressIndicatorSpec) s3).indicatorDirection != 1 && ((getLayoutDirection() != 1 || ((LinearProgressIndicatorSpec) this.spec).indicatorDirection != 2) && (getLayoutDirection() != 0 || ((LinearProgressIndicatorSpec) this.spec).indicatorDirection != 3))) {
            z8 = false;
        }
        linearProgressIndicatorSpec.drawHorizontallyInverse = z8;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        int paddingRight = i7 - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i10 - (getPaddingBottom() + getPaddingTop());
        IndeterminateDrawable<LinearProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        DeterminateDrawable<LinearProgressIndicatorSpec> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i7) {
        if (((LinearProgressIndicatorSpec) this.spec).indeterminateAnimationType == i7) {
            return;
        }
        if (visibleToUser() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        S s3 = this.spec;
        ((LinearProgressIndicatorSpec) s3).indeterminateAnimationType = i7;
        ((LinearProgressIndicatorSpec) s3).validateSpec();
        if (i7 == 0) {
            getIndeterminateDrawable().setAnimatorDelegate(new LinearIndeterminateContiguousAnimatorDelegate((LinearProgressIndicatorSpec) this.spec));
        } else {
            getIndeterminateDrawable().setAnimatorDelegate(new LinearIndeterminateDisjointAnimatorDelegate(getContext(), (LinearProgressIndicatorSpec) this.spec));
        }
        registerSwitchIndeterminateModeCallback();
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setIndicatorColor(@NonNull int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.spec).validateSpec();
    }

    public void setIndicatorDirection(int i7) {
        S s3 = this.spec;
        ((LinearProgressIndicatorSpec) s3).indicatorDirection = i7;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s3;
        boolean z3 = true;
        if (i7 != 1 && ((getLayoutDirection() != 1 || ((LinearProgressIndicatorSpec) this.spec).indicatorDirection != 2) && (getLayoutDirection() != 0 || i7 != 3))) {
            z3 = false;
        }
        linearProgressIndicatorSpec.drawHorizontallyInverse = z3;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setProgressCompat(int i7, boolean z3) {
        S s3 = this.spec;
        if (s3 != 0 && ((LinearProgressIndicatorSpec) s3).indeterminateAnimationType == 0 && isIndeterminate()) {
            return;
        }
        super.setProgressCompat(i7, z3);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackCornerRadius(int i7) {
        super.setTrackCornerRadius(i7);
        ((LinearProgressIndicatorSpec) this.spec).validateSpec();
        invalidate();
    }

    public void setTrackInnerCornerRadius(@Px int i7) {
        S s3 = this.spec;
        if (((LinearProgressIndicatorSpec) s3).trackInnerCornerRadius != i7) {
            ((LinearProgressIndicatorSpec) s3).trackInnerCornerRadius = Math.round(Math.min(i7, ((LinearProgressIndicatorSpec) s3).trackThickness / 2.0f));
            S s8 = this.spec;
            ((LinearProgressIndicatorSpec) s8).useRelativeTrackInnerCornerRadius = false;
            ((LinearProgressIndicatorSpec) s8).hasInnerCornerRadius = true;
            ((LinearProgressIndicatorSpec) s8).validateSpec();
            invalidate();
        }
    }

    public void setTrackInnerCornerRadiusFraction(float f10) {
        S s3 = this.spec;
        if (((LinearProgressIndicatorSpec) s3).trackInnerCornerRadiusFraction != f10) {
            ((LinearProgressIndicatorSpec) s3).trackInnerCornerRadiusFraction = Math.min(f10, 0.5f);
            S s8 = this.spec;
            ((LinearProgressIndicatorSpec) s8).useRelativeTrackInnerCornerRadius = true;
            ((LinearProgressIndicatorSpec) s8).hasInnerCornerRadius = true;
            ((LinearProgressIndicatorSpec) s8).validateSpec();
            invalidate();
        }
    }

    public void setTrackStopIndicatorPadding(@Nullable Integer num) {
        if (Objects.equals(((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorPadding, num)) {
            return;
        }
        ((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorPadding = num;
        invalidate();
    }

    public void setTrackStopIndicatorSize(@Px int i7) {
        S s3 = this.spec;
        if (((LinearProgressIndicatorSpec) s3).trackStopIndicatorSize != i7) {
            ((LinearProgressIndicatorSpec) s3).trackStopIndicatorSize = Math.min(i7, ((LinearProgressIndicatorSpec) s3).trackThickness);
            ((LinearProgressIndicatorSpec) this.spec).validateSpec();
            invalidate();
        }
    }

    public LinearProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public LinearProgressIndicatorSpec createSpec(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    public LinearProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i7) {
        super(context, attributeSet, i7, DEF_STYLE_RES);
        initializeDrawables();
        this.initialized = true;
    }
}
