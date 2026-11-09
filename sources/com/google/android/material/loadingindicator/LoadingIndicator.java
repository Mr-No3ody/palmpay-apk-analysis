package com.google.android.material.loadingindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.AnimatorDurationScaleProvider;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.Arrays;
import p192n.c;
import p241q.a;

/* JADX INFO: loaded from: classes2.dex */
public final class LoadingIndicator extends View implements Drawable.Callback {
    static final int DEF_STYLE_RES = R.style.Widget_Material3_LoadingIndicator;

    @NonNull
    private final LoadingIndicatorDrawable drawable;

    @NonNull
    private final LoadingIndicatorSpec specs;

    public LoadingIndicator(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return ProgressBar.class.getName();
    }

    @ColorInt
    public int getContainerColor() {
        return this.specs.containerColor;
    }

    @Px
    public int getContainerHeight() {
        return this.specs.containerHeight;
    }

    @Px
    public int getContainerWidth() {
        return this.specs.containerWidth;
    }

    @NonNull
    public LoadingIndicatorDrawable getDrawable() {
        return this.drawable;
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.specs.indicatorColors;
    }

    @Px
    public int getIndicatorSize() {
        return this.specs.indicatorSize;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        invalidate();
    }

    public boolean isEffectivelyVisible() {
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        int iSave = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingRight() + getPaddingLeft()), getHeight() - (getPaddingBottom() + getPaddingTop()));
        }
        this.drawable.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        int mode = View.MeasureSpec.getMode(i7);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        LoadingIndicatorDrawingDelegate drawingDelegate = this.drawable.getDrawingDelegate();
        int paddingRight = getPaddingRight() + getPaddingLeft() + drawingDelegate.getPreferredWidth();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + drawingDelegate.getPreferredHeight();
        if (mode == Integer.MIN_VALUE) {
            i7 = View.MeasureSpec.makeMeasureSpec(Math.min(size, paddingRight), 1073741824);
        } else if (mode == 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824);
        }
        if (mode2 == Integer.MIN_VALUE) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(size2, paddingBottom), 1073741824);
        } else if (mode2 == 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824);
        }
        super.onMeasure(i7, i10);
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.drawable.setBounds(0, 0, i7, i10);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i7) {
        super.onVisibilityChanged(view, i7);
        this.drawable.setVisible(visibleToUser(), false, i7 == 0);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
        this.drawable.setVisible(visibleToUser(), false, i7 == 0);
    }

    @RestrictTo({c.f39801b})
    @VisibleForTesting
    public void setAnimatorDurationScaleProvider(@NonNull AnimatorDurationScaleProvider animatorDurationScaleProvider) {
        this.drawable.animatorDurationScaleProvider = animatorDurationScaleProvider;
    }

    public void setContainerColor(@ColorInt int i7) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.specs;
        if (loadingIndicatorSpec.containerColor != i7) {
            loadingIndicatorSpec.containerColor = i7;
            invalidate();
        }
    }

    public void setContainerHeight(@Px int i7) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.specs;
        if (loadingIndicatorSpec.containerHeight != i7) {
            loadingIndicatorSpec.containerHeight = i7;
            requestLayout();
            invalidate();
        }
    }

    public void setContainerWidth(@Px int i7) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.specs;
        if (loadingIndicatorSpec.containerWidth != i7) {
            loadingIndicatorSpec.containerWidth = i7;
            requestLayout();
            invalidate();
        }
    }

    public void setIndicatorColor(@ColorInt int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{MaterialColors.getColor(getContext(), a.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.specs.indicatorColors = iArr;
        this.drawable.getAnimatorDelegate().invalidateSpecValues();
        invalidate();
    }

    public void setIndicatorSize(@Px int i7) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.specs;
        if (loadingIndicatorSpec.indicatorSize != i7) {
            loadingIndicatorSpec.indicatorSize = i7;
            requestLayout();
            invalidate();
        }
    }

    public boolean visibleToUser() {
        return isAttachedToWindow() && getWindowVisibility() == 0 && isEffectivelyVisible();
    }

    public LoadingIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.loadingIndicatorStyle);
    }

    public LoadingIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i7) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i7, DEF_STYLE_RES), attributeSet, i7);
        Context context2 = getContext();
        LoadingIndicatorDrawable loadingIndicatorDrawableCreate = LoadingIndicatorDrawable.create(context2, new LoadingIndicatorSpec(context2, attributeSet, i7));
        this.drawable = loadingIndicatorDrawableCreate;
        loadingIndicatorDrawableCreate.setCallback(this);
        this.specs = loadingIndicatorDrawableCreate.getDrawingDelegate().specs;
        setAnimatorDurationScaleProvider(new AnimatorDurationScaleProvider());
    }
}
