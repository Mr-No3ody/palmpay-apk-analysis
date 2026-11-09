package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.i;
import androidx.constraintlayout.widget.m;
import com.google.android.material.R;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RelativeCornerSize;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class RadialViewGroup extends ConstraintLayout {
    static final int LEVEL_1 = 1;
    static final int LEVEL_2 = 2;
    static final float LEVEL_RADIUS_RATIO = 0.66f;
    private static final String SKIP_TAG = "skip";
    private MaterialShapeDrawable background;
    private int radius;
    private final Runnable updateLayoutParametersRunnable;

    public RadialViewGroup(@NonNull Context context) {
        this(context, null);
    }

    private void addConstraints(List<View> list, m mVar, int i7) {
        Iterator<View> it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            int id2 = it.next().getId();
            int i10 = R.id.circle_center;
            i iVar = mVar.k(id2).f15747e;
            iVar.f15752A = i10;
            iVar.f15753B = i7;
            iVar.f15754C = size;
            size += 360.0f / list.size();
        }
    }

    private Drawable createBackground() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.background = materialShapeDrawable;
        materialShapeDrawable.setCornerSize(new RelativeCornerSize(0.5f));
        this.background.setFillColor(ColorStateList.valueOf(-1));
        return this.background;
    }

    private static boolean shouldSkipView(View view) {
        return SKIP_TAG.equals(view.getTag());
    }

    private void updateLayoutParamsAsync() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.updateLayoutParametersRunnable);
            handler.post(this.updateLayoutParametersRunnable);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        updateLayoutParamsAsync();
    }

    @Dimension
    public int getLeveledRadius(int i7) {
        return i7 == 2 ? Math.round(this.radius * LEVEL_RADIUS_RATIO) : this.radius;
    }

    @Dimension
    public int getRadius() {
        return this.radius;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        updateLayoutParams();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        updateLayoutParamsAsync();
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i7) {
        this.background.setFillColor(ColorStateList.valueOf(i7));
    }

    public void setRadius(@Dimension int i7) {
        this.radius = i7;
        updateLayoutParams();
    }

    public void updateLayoutParams() {
        m mVar = new m();
        mVar.e(this);
        HashMap map = new HashMap();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getId() != R.id.circle_center && !shouldSkipView(childAt)) {
                int i10 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i10 == null) {
                    i10 = 1;
                }
                if (!map.containsKey(i10)) {
                    map.put(i10, new ArrayList());
                }
                ((List) map.get(i10)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            addConstraints((List) entry.getValue(), mVar, getLeveledRadius(((Integer) entry.getKey()).intValue()));
        }
        mVar.b(this);
    }

    public RadialViewGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadialViewGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        setBackground(createBackground());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RadialViewGroup, i7, 0);
        this.radius = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.RadialViewGroup_materialCircleRadius, 0);
        this.updateLayoutParametersRunnable = new b(this, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
