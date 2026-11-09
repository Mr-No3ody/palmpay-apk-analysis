package com.google.android.material.floatingtoolbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.Z0;
import androidx.core.graphics.e;
import androidx.core.view.E;
import androidx.core.view.N;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.q0;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class FloatingToolbarLayout extends FrameLayout {
    private static final int DEF_STYLE_RES = R.style.Widget_Material3_FloatingToolbar;
    private static final String TAG = "FloatingToolbarLayout";
    private int bottomMarginWindowInset;
    private int leftMarginWindowInset;
    private boolean marginBottomSystemWindowInsets;
    private boolean marginLeftSystemWindowInsets;
    private boolean marginRightSystemWindowInsets;
    private boolean marginTopSystemWindowInsets;
    private Rect originalMargins;
    private int rightMarginWindowInset;
    private int topMarginWindowInset;

    public FloatingToolbarLayout(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateMargins() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Rect rect = this.originalMargins;
        if (rect == null) {
            return;
        }
        int i7 = rect.left + (this.marginLeftSystemWindowInsets ? this.leftMarginWindowInset : 0);
        int i10 = rect.right + (this.marginRightSystemWindowInsets ? this.rightMarginWindowInset : 0);
        int i11 = rect.top + (this.marginTopSystemWindowInsets ? this.topMarginWindowInset : 0);
        int i12 = rect.bottom + (this.marginBottomSystemWindowInsets ? this.bottomMarginWindowInset : 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams.bottomMargin == i12 && marginLayoutParams.leftMargin == i7 && marginLayoutParams.rightMargin == i10 && marginLayoutParams.topMargin == i11) {
            return;
        }
        marginLayoutParams.bottomMargin = i12;
        marginLayoutParams.leftMargin = i7;
        marginLayoutParams.rightMargin = i10;
        marginLayoutParams.topMargin = i11;
        requestLayout();
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            this.originalMargins = null;
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.originalMargins = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        updateMargins();
    }

    public FloatingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingToolbarStyle);
    }

    public FloatingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i7) {
        this(context, attributeSet, i7, DEF_STYLE_RES);
    }

    public FloatingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i7, @StyleRes int i10) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i7, i10), attributeSet, i7);
        Context context2 = getContext();
        Z0 z0ObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, R.styleable.FloatingToolbar, i7, i10, new int[0]);
        boolean zHasValue = z0ObtainTintedStyledAttributes.f12863b.hasValue(R.styleable.FloatingToolbar_backgroundTint);
        TypedArray typedArray = z0ObtainTintedStyledAttributes.f12863b;
        if (zHasValue) {
            int color = typedArray.getColor(R.styleable.FloatingToolbar_backgroundTint, 0);
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context2, attributeSet, i7, i10).build());
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(color));
            setBackground(materialShapeDrawable);
        }
        this.marginLeftSystemWindowInsets = typedArray.getBoolean(R.styleable.FloatingToolbar_marginLeftSystemWindowInsets, true);
        this.marginTopSystemWindowInsets = typedArray.getBoolean(R.styleable.FloatingToolbar_marginTopSystemWindowInsets, false);
        this.marginRightSystemWindowInsets = typedArray.getBoolean(R.styleable.FloatingToolbar_marginRightSystemWindowInsets, true);
        this.marginBottomSystemWindowInsets = typedArray.getBoolean(R.styleable.FloatingToolbar_marginBottomSystemWindowInsets, true);
        OnApplyWindowInsetsListener onApplyWindowInsetsListener = new OnApplyWindowInsetsListener() { // from class: com.google.android.material.floatingtoolbar.FloatingToolbarLayout.1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            @NonNull
            public q0 onApplyWindowInsets(@NonNull View view, @NonNull q0 q0Var) {
                if (!FloatingToolbarLayout.this.marginLeftSystemWindowInsets && !FloatingToolbarLayout.this.marginRightSystemWindowInsets && !FloatingToolbarLayout.this.marginTopSystemWindowInsets && !FloatingToolbarLayout.this.marginBottomSystemWindowInsets) {
                    return q0Var;
                }
                e eVarG = q0Var.f16277a.g(143);
                FloatingToolbarLayout.this.bottomMarginWindowInset = eVarG.f16061d;
                FloatingToolbarLayout.this.topMarginWindowInset = eVarG.f16059b;
                FloatingToolbarLayout.this.rightMarginWindowInset = eVarG.f16060c;
                FloatingToolbarLayout.this.leftMarginWindowInset = eVarG.f16058a;
                FloatingToolbarLayout.this.updateMargins();
                return q0Var;
            }
        };
        WeakHashMap weakHashMap = N.f16168a;
        E.n(this, onApplyWindowInsetsListener);
        z0ObtainTintedStyledAttributes.g();
    }
}
