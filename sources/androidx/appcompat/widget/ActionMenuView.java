package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuBuilder$Callback;
import androidx.appcompat.view.menu.MenuBuilder$ItemInvoker;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements MenuBuilder$ItemInvoker, MenuView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.appcompat.view.menu.k f12573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f12574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0868l f12577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MenuPresenter.Callback f12578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public MenuBuilder$Callback f12579g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12580i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12581j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f12582o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f12583p;
    public OnMenuItemClickListener t;

    @RestrictTo({p192n.c.f39802c})
    public interface ActionMenuChildView {
        boolean needsDividerAfter();

        boolean needsDividerBefore();
    }

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f12584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f12585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f12586c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f12587d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f12588e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f12589f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(@NonNull Context context) {
        this(context, null);
    }

    public static LayoutParams a() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.f12584a = false;
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    public static LayoutParams b(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2;
        if (layoutParams == null) {
            return a();
        }
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams3 = (LayoutParams) layoutParams;
            layoutParams2 = new LayoutParams(layoutParams3);
            layoutParams2.f12584a = layoutParams3.f12584a;
        } else {
            layoutParams2 = new LayoutParams(layoutParams);
        }
        if (((LinearLayout.LayoutParams) layoutParams2).gravity <= 0) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 16;
        }
        return layoutParams2;
    }

    public final boolean c(int i7) {
        boolean zNeedsDividerAfter = false;
        if (i7 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i7 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i7);
        if (i7 < getChildCount() && (childAt instanceof ActionMenuChildView)) {
            zNeedsDividerAfter = ((ActionMenuChildView) childAt).needsDividerAfter();
        }
        return (i7 <= 0 || !(childAt2 instanceof ActionMenuChildView)) ? zNeedsDividerAfter : ((ActionMenuChildView) childAt2).needsDividerBefore() | zNeedsDividerAfter;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return a();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    public Menu getMenu() {
        if (this.f12573a == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.k kVar = new androidx.appcompat.view.menu.k(context);
            this.f12573a = kVar;
            kVar.setCallback(new C0872n(this));
            C0868l c0868l = new C0868l(context);
            this.f12577e = c0868l;
            c0868l.f12955v = true;
            c0868l.f12956w = true;
            MenuPresenter.Callback c0870m = this.f12578f;
            if (c0870m == null) {
                c0870m = new C0870m();
            }
            c0868l.f12382e = c0870m;
            this.f12573a.addMenuPresenter(c0868l, this.f12574b);
            C0868l c0868l2 = this.f12577e;
            c0868l2.f12385i = this;
            this.f12573a = c0868l2.f12380c;
        }
        return this.f12573a;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        getMenu();
        C0868l c0868l = this.f12577e;
        ActionMenuPresenter$OverflowMenuButton actionMenuPresenter$OverflowMenuButton = c0868l.f12953o;
        if (actionMenuPresenter$OverflowMenuButton != null) {
            return actionMenuPresenter$OverflowMenuButton.getDrawable();
        }
        if (c0868l.t) {
            return c0868l.f12954p;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f12575c;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    @RestrictTo({p192n.c.f39802c})
    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public final void initialize(androidx.appcompat.view.menu.k kVar) {
        this.f12573a = kVar;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder$ItemInvoker
    public final boolean invokeItem(androidx.appcompat.view.menu.m mVar) {
        return this.f12573a.performItemAction(mVar, 0);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0868l c0868l = this.f12577e;
        if (c0868l != null) {
            c0868l.updateMenuView(false);
            if (this.f12577e.c()) {
                this.f12577e.b();
                this.f12577e.d();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0868l c0868l = this.f12577e;
        if (c0868l != null) {
            c0868l.b();
            C0854e c0854e = c0868l.f12948Q;
            if (c0854e != null) {
                c0854e.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        int width;
        int paddingLeft;
        if (!this.f12580i) {
            super.onLayout(z3, i7, i10, i11, i12);
            return;
        }
        int childCount = getChildCount();
        int i13 = (i12 - i10) / 2;
        int dividerWidth = getDividerWidth();
        int i14 = i11 - i7;
        int paddingRight = (i14 - getPaddingRight()) - getPaddingLeft();
        boolean z8 = p1.f12995a;
        boolean z10 = getLayoutDirection() == 1;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f12584a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (c(i17)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z10) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i18 = i13 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i18, width, measuredHeight + i18);
                    paddingRight -= measuredWidth;
                    i15 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin) + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    c(i17);
                    i16++;
                }
            }
        }
        if (childCount == 1 && i15 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i19 = (i14 / 2) - (measuredWidth2 / 2);
            int i20 = i13 - (measuredHeight2 / 2);
            childAt2.layout(i19, i20, measuredWidth2 + i19, measuredHeight2 + i20);
            return;
        }
        int i21 = i16 - (i15 ^ 1);
        int iMax = Math.max(0, i21 > 0 ? paddingRight / i21 : 0);
        if (z10) {
            int width2 = getWidth() - getPaddingRight();
            for (int i22 = 0; i22 < childCount; i22++) {
                View childAt3 = getChildAt(i22);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f12584a) {
                    int i23 = width2 - ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i24 = i13 - (measuredHeight3 / 2);
                    childAt3.layout(i23 - measuredWidth3, i24, i23, measuredHeight3 + i24);
                    width2 = i23 - ((measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i25 = 0; i25 < childCount; i25++) {
            View childAt4 = getChildAt(i25);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.f12584a) {
                int i26 = paddingLeft2 + ((LinearLayout.LayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i27 = i13 - (measuredHeight4 / 2);
                childAt4.layout(i26, i27, i26 + measuredWidth4, measuredHeight4 + i27);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + iMax + i26;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v40 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        ?? r11;
        int i13;
        int i14;
        androidx.appcompat.view.menu.k kVar;
        boolean z3 = this.f12580i;
        boolean z8 = View.MeasureSpec.getMode(i7) == 1073741824;
        this.f12580i = z8;
        if (z3 != z8) {
            this.f12581j = 0;
        }
        int size = View.MeasureSpec.getSize(i7);
        if (this.f12580i && (kVar = this.f12573a) != null && size != this.f12581j) {
            this.f12581j = size;
            kVar.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (!this.f12580i || childCount <= 0) {
            for (int i15 = 0; i15 < childCount; i15++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i15).getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
            }
            super.onMeasure(i7, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i7);
        int size3 = View.MeasureSpec.getSize(i10);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingBottom, -2);
        int i16 = size2 - paddingRight;
        int i17 = this.f12582o;
        int i18 = i16 / i17;
        int i19 = i16 % i17;
        if (i18 == 0) {
            setMeasuredDimension(i16, 0);
            return;
        }
        int i20 = (i19 / i18) + i17;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i21 = 0;
        int iMax2 = 0;
        int i22 = 0;
        boolean z10 = false;
        int i23 = 0;
        long j6 = 0;
        while (true) {
            i11 = this.f12583p;
            if (i22 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i22);
            int i24 = size3;
            int i25 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i13 = i20;
            } else {
                boolean z11 = childAt instanceof ActionMenuItemView;
                i21++;
                if (z11) {
                    childAt.setPadding(i11, 0, i11, 0);
                }
                LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                layoutParams2.f12589f = false;
                layoutParams2.f12586c = 0;
                layoutParams2.f12585b = 0;
                layoutParams2.f12587d = false;
                ((LinearLayout.LayoutParams) layoutParams2).leftMargin = 0;
                ((LinearLayout.LayoutParams) layoutParams2).rightMargin = 0;
                layoutParams2.f12588e = z11 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i26 = layoutParams2.f12584a ? 1 : i18;
                LayoutParams layoutParams3 = (LayoutParams) childAt.getLayoutParams();
                int i27 = i18;
                i13 = i20;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i25, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z11 ? (ActionMenuItemView) childAt : null;
                boolean z12 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z13 = z12;
                if (i26 <= 0 || (z12 && i26 < 2)) {
                    i14 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i13 * i26, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i14 = measuredWidth / i13;
                    if (measuredWidth % i13 != 0) {
                        i14++;
                    }
                    if (z13 && i14 < 2) {
                        i14 = 2;
                    }
                }
                layoutParams3.f12587d = !layoutParams3.f12584a && z13;
                layoutParams3.f12585b = i14;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i13, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i14);
                if (layoutParams2.f12587d) {
                    i23++;
                }
                if (layoutParams2.f12584a) {
                    z10 = true;
                }
                i18 = i27 - i14;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i14 == 1) {
                    j6 |= (long) (1 << i22);
                }
            }
            i22++;
            size3 = i24;
            paddingBottom = i25;
            i20 = i13;
        }
        int i28 = size3;
        int i29 = i18;
        int i30 = i20;
        boolean z14 = z10 && i21 == 2;
        int i31 = i29;
        boolean z15 = false;
        while (true) {
            if (i23 <= 0 || i31 <= 0) {
                i12 = iMax;
                break;
            }
            int i32 = Integer.MAX_VALUE;
            long j10 = 0;
            int i33 = 0;
            int i34 = 0;
            while (i34 < childCount2) {
                boolean z16 = z14;
                LayoutParams layoutParams4 = (LayoutParams) getChildAt(i34).getLayoutParams();
                int i35 = iMax;
                if (layoutParams4.f12587d) {
                    int i36 = layoutParams4.f12585b;
                    if (i36 < i32) {
                        j10 = 1 << i34;
                        i32 = i36;
                        i33 = 1;
                    } else if (i36 == i32) {
                        j10 |= 1 << i34;
                        i33++;
                    }
                }
                i34++;
                iMax = i35;
                z14 = z16;
            }
            boolean z17 = z14;
            i12 = iMax;
            j6 |= j10;
            if (i33 > i31) {
                break;
            }
            int i37 = i32 + 1;
            int i38 = 0;
            while (i38 < childCount2) {
                View childAt2 = getChildAt(i38);
                LayoutParams layoutParams5 = (LayoutParams) childAt2.getLayoutParams();
                boolean z18 = z10;
                long j11 = 1 << i38;
                if ((j10 & j11) != 0) {
                    if (z17 && layoutParams5.f12588e) {
                        r11 = 1;
                        r11 = 1;
                        if (i31 == 1) {
                            childAt2.setPadding(i11 + i30, 0, i11, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    layoutParams5.f12585b += r11;
                    layoutParams5.f12589f = r11;
                    i31--;
                } else if (layoutParams5.f12585b == i37) {
                    j6 |= j11;
                }
                i38++;
                z10 = z18;
            }
            iMax = i12;
            z14 = z17;
            z15 = true;
        }
        boolean z19 = !z10 && i21 == 1;
        if (i31 > 0 && j6 != 0 && (i31 < i21 - 1 || z19 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j6);
            if (!z19) {
                if ((j6 & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).f12588e) {
                    fBitCount -= 0.5f;
                }
                int i39 = childCount2 - 1;
                if ((j6 & ((long) (1 << i39))) != 0 && !((LayoutParams) getChildAt(i39).getLayoutParams()).f12588e) {
                    fBitCount -= 0.5f;
                }
            }
            int i40 = fBitCount > 0.0f ? (int) ((i31 * i30) / fBitCount) : 0;
            boolean z20 = z15;
            for (int i41 = 0; i41 < childCount2; i41++) {
                if ((j6 & ((long) (1 << i41))) != 0) {
                    View childAt3 = getChildAt(i41);
                    LayoutParams layoutParams6 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams6.f12586c = i40;
                        layoutParams6.f12589f = true;
                        if (i41 == 0 && !layoutParams6.f12588e) {
                            ((LinearLayout.LayoutParams) layoutParams6).leftMargin = (-i40) / 2;
                        }
                        z20 = true;
                    } else if (layoutParams6.f12584a) {
                        layoutParams6.f12586c = i40;
                        layoutParams6.f12589f = true;
                        ((LinearLayout.LayoutParams) layoutParams6).rightMargin = (-i40) / 2;
                        z20 = true;
                    } else {
                        if (i41 != 0) {
                            ((LinearLayout.LayoutParams) layoutParams6).leftMargin = i40 / 2;
                        }
                        if (i41 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) layoutParams6).rightMargin = i40 / 2;
                        }
                    }
                }
            }
            z15 = z20;
        }
        if (z15) {
            for (int i42 = 0; i42 < childCount2; i42++) {
                View childAt4 = getChildAt(i42);
                LayoutParams layoutParams7 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams7.f12589f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams7.f12585b * i30) + layoutParams7.f12586c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i16, mode != 1073741824 ? i12 : i28);
    }

    @RestrictTo({p192n.c.f39802c})
    public void setExpandedActionViewsExclusive(boolean z3) {
        this.f12577e.f12945H = z3;
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.t = onMenuItemClickListener;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        getMenu();
        C0868l c0868l = this.f12577e;
        ActionMenuPresenter$OverflowMenuButton actionMenuPresenter$OverflowMenuButton = c0868l.f12953o;
        if (actionMenuPresenter$OverflowMenuButton != null) {
            actionMenuPresenter$OverflowMenuButton.setImageDrawable(drawable);
        } else {
            c0868l.t = true;
            c0868l.f12954p = drawable;
        }
    }

    @RestrictTo({p192n.c.f39802c})
    public void setOverflowReserved(boolean z3) {
        this.f12576d = z3;
    }

    public void setPopupTheme(@StyleRes int i7) {
        if (this.f12575c != i7) {
            this.f12575c = i7;
            if (i7 == 0) {
                this.f12574b = getContext();
            } else {
                this.f12574b = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    @RestrictTo({p192n.c.f39800a})
    public void setPresenter(C0868l c0868l) {
        this.f12577e = c0868l;
        c0868l.f12385i = this;
        this.f12573a = c0868l.f12380c;
    }

    public ActionMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f12582o = (int) (56.0f * f10);
        this.f12583p = (int) (f10 * 4.0f);
        this.f12574b = context;
        this.f12575c = 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayoutCompat.LayoutParams generateDefaultLayoutParams() {
        return a();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayoutCompat.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final LinearLayoutCompat.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
