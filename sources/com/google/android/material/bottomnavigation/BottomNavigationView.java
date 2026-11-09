package com.google.android.material.bottomnavigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.Z0;
import androidx.core.view.q0;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
public class BottomNavigationView extends NavigationBarView {
    private static final int MAX_ITEM_COUNT = 6;

    @Deprecated
    public interface OnNavigationItemReselectedListener extends NavigationBarView.OnItemReselectedListener {
    }

    @Deprecated
    public interface OnNavigationItemSelectedListener extends NavigationBarView.OnItemSelectedListener {
    }

    public BottomNavigationView(@NonNull Context context) {
        this(context, null);
    }

    private void applyWindowInsets() {
        ViewUtils.doOnApplyWindowInsets(this, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomnavigation.BottomNavigationView.1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            @NonNull
            public q0 onApplyWindowInsets(View view, @NonNull q0 q0Var, @NonNull ViewUtils.RelativePadding relativePadding) {
                relativePadding.bottom = q0Var.a() + relativePadding.bottom;
                boolean z3 = view.getLayoutDirection() == 1;
                int iB = q0Var.b();
                int iC = q0Var.c();
                relativePadding.start += z3 ? iC : iB;
                int i7 = relativePadding.end;
                if (!z3) {
                    iB = iC;
                }
                relativePadding.end = i7 + iB;
                relativePadding.applyToView(view);
                return q0Var;
            }
        });
    }

    private int makeMinHeightSpec(int i7) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i7) == 1073741824 || suggestedMinimumHeight <= 0) {
            return i7;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i7), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), Integer.MIN_VALUE);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    @NonNull
    @RestrictTo({c.f39801b})
    public NavigationBarMenuView createNavigationBarMenuView(@NonNull Context context) {
        return new BottomNavigationMenuView(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 6;
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return ((BottomNavigationMenuView) getMenuView()).isItemHorizontalTranslationEnabled();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, makeMinHeightSpec(i10));
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            setMeasuredDimension(getMeasuredWidth(), Math.max(getMeasuredHeight(), getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight()));
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setItemHorizontalTranslationEnabled(boolean z3) {
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) getMenuView();
        if (bottomNavigationMenuView.isItemHorizontalTranslationEnabled() != z3) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z3);
            getPresenter().updateMenuView(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(@Nullable OnNavigationItemReselectedListener onNavigationItemReselectedListener) {
        setOnItemReselectedListener(onNavigationItemReselectedListener);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(@Nullable OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        setOnItemSelectedListener(onNavigationItemSelectedListener);
    }

    public BottomNavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomNavigationStyle);
    }

    public BottomNavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, R.style.Widget_Design_BottomNavigationView);
    }

    public BottomNavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7, int i10) {
        super(context, attributeSet, i7, i10);
        Z0 z0ObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(getContext(), attributeSet, R.styleable.BottomNavigationView, i7, i10, new int[0]);
        setItemHorizontalTranslationEnabled(z0ObtainTintedStyledAttributes.f12863b.getBoolean(R.styleable.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        int i11 = R.styleable.BottomNavigationView_android_minHeight;
        TypedArray typedArray = z0ObtainTintedStyledAttributes.f12863b;
        if (typedArray.hasValue(i11)) {
            setMinimumHeight(typedArray.getDimensionPixelSize(R.styleable.BottomNavigationView_android_minHeight, 0));
        }
        z0ObtainTintedStyledAttributes.g();
        applyWindowInsets();
    }
}
