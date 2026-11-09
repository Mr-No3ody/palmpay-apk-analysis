package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialDivider extends View {
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_MaterialDivider;

    @ColorInt
    private int color;

    @NonNull
    private final MaterialShapeDrawable dividerDrawable;
    private int insetEnd;
    private int insetStart;
    private int thickness;

    public MaterialDivider(@NonNull Context context) {
        this(context, null);
    }

    public int getDividerColor() {
        return this.color;
    }

    @Px
    public int getDividerInsetEnd() {
        return this.insetEnd;
    }

    @Px
    public int getDividerInsetStart() {
        return this.insetStart;
    }

    public int getDividerThickness() {
        return this.thickness;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        int width;
        int i7;
        super.onDraw(canvas);
        boolean z3 = getLayoutDirection() == 1;
        int i10 = z3 ? this.insetEnd : this.insetStart;
        if (z3) {
            width = getWidth();
            i7 = this.insetStart;
        } else {
            width = getWidth();
            i7 = this.insetEnd;
        }
        this.dividerDrawable.setBounds(i10, 0, width - i7, getBottom() - getTop());
        this.dividerDrawable.draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int mode = View.MeasureSpec.getMode(i10);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i11 = this.thickness;
            if (i11 > 0 && measuredHeight != i11) {
                measuredHeight = i11;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(@ColorInt int i7) {
        if (this.color != i7) {
            this.color = i7;
            this.dividerDrawable.setFillColor(ColorStateList.valueOf(i7));
            invalidate();
        }
    }

    public void setDividerColorResource(@ColorRes int i7) {
        setDividerColor(getContext().getColor(i7));
    }

    public void setDividerInsetEnd(@Px int i7) {
        this.insetEnd = i7;
    }

    public void setDividerInsetEndResource(@DimenRes int i7) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i7));
    }

    public void setDividerInsetStart(@Px int i7) {
        this.insetStart = i7;
    }

    public void setDividerInsetStartResource(@DimenRes int i7) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i7));
    }

    public void setDividerThickness(@Px int i7) {
        if (this.thickness != i7) {
            this.thickness = i7;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(@DimenRes int i7) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i7));
    }

    public MaterialDivider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialDividerStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        int i10 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i7, i10), attributeSet, i7);
        Context context2 = getContext();
        this.dividerDrawable = new MaterialShapeDrawable();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.MaterialDivider, i7, i10, new int[0]);
        this.thickness = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MaterialDivider_dividerThickness, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.insetStart = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetStart, 0);
        this.insetEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetEnd, 0);
        setDividerColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.MaterialDivider_dividerColor).getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
