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
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
public class CircularProgressIndicator extends BaseProgressIndicator<CircularProgressIndicatorSpec> {
    public static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_CircularProgressIndicator;
    public static final int INDETERMINATE_ANIMATION_TYPE_ADVANCE = 0;
    public static final int INDETERMINATE_ANIMATION_TYPE_RETREAT = 1;
    public static final int INDICATOR_DIRECTION_CLOCKWISE = 0;
    public static final int INDICATOR_DIRECTION_COUNTERCLOCKWISE = 1;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({c.f39801b})
    public @interface IndeterminateAnimationType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({c.f39801b})
    public @interface IndicatorDirection {
    }

    public CircularProgressIndicator(@NonNull Context context) {
        this(context, null);
    }

    private void initializeDrawables() {
        CircularDrawingDelegate circularDrawingDelegate = new CircularDrawingDelegate((CircularProgressIndicatorSpec) this.spec);
        setIndeterminateDrawable(IndeterminateDrawable.createCircularDrawable(getContext(), (CircularProgressIndicatorSpec) this.spec, circularDrawingDelegate));
        setProgressDrawable(DeterminateDrawable.createCircularDrawable(getContext(), (CircularProgressIndicatorSpec) this.spec, circularDrawingDelegate));
    }

    public int getIndeterminateAnimationType() {
        return ((CircularProgressIndicatorSpec) this.spec).indeterminateAnimationType;
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec) this.spec).indicatorDirection;
    }

    @Px
    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec) this.spec).indicatorInset;
    }

    @Px
    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec) this.spec).indicatorSize;
    }

    public void setIndeterminateAnimationType(int i7) {
        if (((CircularProgressIndicatorSpec) this.spec).indeterminateAnimationType == i7) {
            return;
        }
        if (visibleToUser() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        S s3 = this.spec;
        ((CircularProgressIndicatorSpec) s3).indeterminateAnimationType = i7;
        ((CircularProgressIndicatorSpec) s3).validateSpec();
        getIndeterminateDrawable().setAnimatorDelegate(i7 == 1 ? new CircularIndeterminateRetreatAnimatorDelegate(getContext(), (CircularProgressIndicatorSpec) this.spec) : new CircularIndeterminateAdvanceAnimatorDelegate((CircularProgressIndicatorSpec) this.spec));
        registerSwitchIndeterminateModeCallback();
        invalidate();
    }

    public void setIndicatorDirection(int i7) {
        ((CircularProgressIndicatorSpec) this.spec).indicatorDirection = i7;
        invalidate();
    }

    public void setIndicatorInset(@Px int i7) {
        S s3 = this.spec;
        if (((CircularProgressIndicatorSpec) s3).indicatorInset != i7) {
            ((CircularProgressIndicatorSpec) s3).indicatorInset = i7;
            invalidate();
        }
    }

    public void setIndicatorSize(@Px int i7) {
        int iMax = Math.max(i7, getTrackThickness() * 2);
        S s3 = this.spec;
        if (((CircularProgressIndicatorSpec) s3).indicatorSize != iMax) {
            ((CircularProgressIndicatorSpec) s3).indicatorSize = iMax;
            ((CircularProgressIndicatorSpec) s3).validateSpec();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i7) {
        super.setTrackThickness(i7);
        ((CircularProgressIndicatorSpec) this.spec).validateSpec();
    }

    public CircularProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public CircularProgressIndicatorSpec createSpec(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public CircularProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i7) {
        super(context, attributeSet, i7, DEF_STYLE_RES);
        initializeDrawables();
        this.initialized = true;
    }
}
