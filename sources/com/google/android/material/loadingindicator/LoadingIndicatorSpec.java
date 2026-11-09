package com.google.android.material.loadingindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StyleRes;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import p241q.a;

/* JADX INFO: loaded from: classes2.dex */
public final class LoadingIndicatorSpec {

    @ColorInt
    int containerColor;

    @Px
    int containerHeight;

    @Px
    int containerWidth;

    @NonNull
    int[] indicatorColors;

    @Px
    int indicatorSize;
    boolean scaleToFit;

    public LoadingIndicatorSpec(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.loadingIndicatorStyle);
    }

    private void loadIndicatorColors(@NonNull Context context, @NonNull TypedArray typedArray) {
        if (!typedArray.hasValue(R.styleable.LoadingIndicator_indicatorColor)) {
            this.indicatorColors = new int[]{MaterialColors.getColor(context, a.colorPrimary, -1)};
            return;
        }
        if (typedArray.peekValue(R.styleable.LoadingIndicator_indicatorColor).type != 1) {
            this.indicatorColors = new int[]{typedArray.getColor(R.styleable.LoadingIndicator_indicatorColor, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(R.styleable.LoadingIndicator_indicatorColor, -1));
        this.indicatorColors = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    public void setScaleToFit(boolean z3) {
        this.scaleToFit = z3;
    }

    public LoadingIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i7) {
        this(context, attributeSet, i7, LoadingIndicator.DEF_STYLE_RES);
    }

    public LoadingIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i7, @StyleRes int i10) {
        this.scaleToFit = false;
        this.indicatorColors = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.m3_loading_indicator_shape_size);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.m3_loading_indicator_container_size);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.LoadingIndicator, i7, i10, new int[0]);
        this.indicatorSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.LoadingIndicator_indicatorSize, dimensionPixelSize);
        this.containerWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.LoadingIndicator_containerWidth, dimensionPixelSize2);
        this.containerHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.LoadingIndicator_containerHeight, dimensionPixelSize2);
        loadIndicatorColors(context, typedArrayObtainStyledAttributes);
        this.containerColor = typedArrayObtainStyledAttributes.getColor(R.styleable.LoadingIndicator_containerColor, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
