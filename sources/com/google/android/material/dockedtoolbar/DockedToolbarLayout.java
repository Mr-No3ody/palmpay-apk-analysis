package com.google.android.material.dockedtoolbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.Z0;
import androidx.coordinatorlayout.widget.c;
import androidx.core.graphics.e;
import androidx.core.view.q0;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes2.dex */
public class DockedToolbarLayout extends FrameLayout {
    private static final int DEF_STYLE_RES = R.style.Widget_Material3_DockedToolbar;
    private static final String TAG = "DockedToolbarLayout";
    private Boolean paddingBottomSystemWindowInsets;
    private Boolean paddingTopSystemWindowInsets;

    public DockedToolbarLayout(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasGravity(ViewGroup.LayoutParams layoutParams, int i7) {
        if (layoutParams instanceof c) {
            return (((c) layoutParams).f15874c & i7) == i7;
        }
        return (layoutParams instanceof FrameLayout.LayoutParams) && (((FrameLayout.LayoutParams) layoutParams).gravity & i7) == i7;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            int childCount = getChildCount();
            int iMax = Math.max(getMeasuredHeight(), getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight());
            for (int i11 = 0; i11 < childCount; i11++) {
                measureChild(getChildAt(i11), i7, View.MeasureSpec.makeMeasureSpec(iMax, 1073741824));
            }
            setMeasuredDimension(getMeasuredWidth(), iMax);
        }
    }

    public DockedToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.dockedToolbarStyle);
    }

    public DockedToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i7) {
        this(context, attributeSet, i7, DEF_STYLE_RES);
    }

    public DockedToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i7, @StyleRes int i10) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i7, i10), attributeSet, i7);
        Context context2 = getContext();
        Z0 z0ObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, R.styleable.DockedToolbar, i7, i10, new int[0]);
        boolean zHasValue = z0ObtainTintedStyledAttributes.f12863b.hasValue(R.styleable.DockedToolbar_backgroundTint);
        TypedArray typedArray = z0ObtainTintedStyledAttributes.f12863b;
        if (zHasValue) {
            int color = typedArray.getColor(R.styleable.DockedToolbar_backgroundTint, 0);
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context2, attributeSet, i7, i10).build());
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(color));
            setBackground(materialShapeDrawable);
        }
        if (typedArray.hasValue(R.styleable.DockedToolbar_paddingTopSystemWindowInsets)) {
            this.paddingTopSystemWindowInsets = Boolean.valueOf(typedArray.getBoolean(R.styleable.DockedToolbar_paddingTopSystemWindowInsets, true));
        }
        if (typedArray.hasValue(R.styleable.DockedToolbar_paddingBottomSystemWindowInsets)) {
            this.paddingBottomSystemWindowInsets = Boolean.valueOf(typedArray.getBoolean(R.styleable.DockedToolbar_paddingBottomSystemWindowInsets, true));
        }
        ViewUtils.doOnApplyWindowInsets(this, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.dockedtoolbar.DockedToolbarLayout.1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            @NonNull
            public q0 onApplyWindowInsets(View view, @NonNull q0 q0Var, @NonNull ViewUtils.RelativePadding relativePadding) {
                if (DockedToolbarLayout.this.paddingTopSystemWindowInsets != null && DockedToolbarLayout.this.paddingBottomSystemWindowInsets != null && !DockedToolbarLayout.this.paddingTopSystemWindowInsets.booleanValue() && !DockedToolbarLayout.this.paddingBottomSystemWindowInsets.booleanValue()) {
                    return q0Var;
                }
                e eVarG = q0Var.f16277a.g(143);
                int i11 = eVarG.f16061d;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                boolean zHasGravity = DockedToolbarLayout.this.hasGravity(layoutParams, 48);
                int i12 = eVarG.f16059b;
                int i13 = (zHasGravity && DockedToolbarLayout.this.paddingTopSystemWindowInsets == null && DockedToolbarLayout.this.getFitsSystemWindows()) ? i12 : 0;
                int i14 = (DockedToolbarLayout.this.hasGravity(layoutParams, 80) && DockedToolbarLayout.this.paddingBottomSystemWindowInsets == null && DockedToolbarLayout.this.getFitsSystemWindows()) ? i11 : 0;
                if (DockedToolbarLayout.this.paddingBottomSystemWindowInsets != null) {
                    if (!DockedToolbarLayout.this.paddingBottomSystemWindowInsets.booleanValue()) {
                        i11 = 0;
                    }
                    i14 = i11;
                }
                if (DockedToolbarLayout.this.paddingTopSystemWindowInsets != null) {
                    i13 = DockedToolbarLayout.this.paddingTopSystemWindowInsets.booleanValue() ? i12 : 0;
                }
                relativePadding.f22536top += i13;
                relativePadding.bottom += i14;
                relativePadding.applyToView(view);
                return q0Var;
            }
        });
        setImportantForAccessibility(1);
        z0ObtainTintedStyledAttributes.g();
    }
}
