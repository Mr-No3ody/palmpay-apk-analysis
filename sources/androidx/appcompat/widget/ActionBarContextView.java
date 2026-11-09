package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({p192n.c.f39802c})
public class ActionBarContextView extends AbsActionBarView {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public TextView f12530A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public TextView f12531B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f12532C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f12533H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f12534L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final int f12535M;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f12536j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f12537o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f12538p;
    public View t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View f12539v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LinearLayout f12540w;

    public ActionBarContextView(@NonNull Context context) {
        this(context, null);
    }

    public final void e(p343x.a aVar) {
        View view = this.f12538p;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f12535M, (ViewGroup) this, false);
            this.f12538p = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f12538p);
        }
        View viewFindViewById = this.f12538p.findViewById(p241q.f.action_mode_close_button);
        this.t = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC0850c(aVar, 0));
        androidx.appcompat.view.menu.k kVarC = aVar.c();
        C0868l c0868l = this.f12515d;
        if (c0868l != null) {
            c0868l.b();
            C0854e c0854e = c0868l.f12948Q;
            if (c0854e != null) {
                c0854e.dismiss();
            }
        }
        C0868l c0868l2 = new C0868l(getContext());
        this.f12515d = c0868l2;
        c0868l2.f12955v = true;
        c0868l2.f12956w = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        kVarC.addMenuPresenter(this.f12515d, this.f12513b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f12515d.getMenuView(this);
        this.f12514c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f12514c, layoutParams);
    }

    public final void f() {
        if (this.f12540w == null) {
            LayoutInflater.from(getContext()).inflate(p241q.g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f12540w = linearLayout;
            this.f12530A = (TextView) linearLayout.findViewById(p241q.f.action_bar_title);
            this.f12531B = (TextView) this.f12540w.findViewById(p241q.f.action_bar_subtitle);
            int i7 = this.f12532C;
            if (i7 != 0) {
                this.f12530A.setTextAppearance(getContext(), i7);
            }
            int i10 = this.f12533H;
            if (i10 != 0) {
                this.f12531B.setTextAppearance(getContext(), i10);
            }
        }
        this.f12530A.setText(this.f12536j);
        this.f12531B.setText(this.f12537o);
        boolean zIsEmpty = TextUtils.isEmpty(this.f12536j);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f12537o);
        this.f12531B.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f12540w.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f12540w.getParent() == null) {
            addView(this.f12540w);
        }
    }

    public final void g() {
        removeAllViews();
        this.f12539v = null;
        this.f12514c = null;
        this.f12515d = null;
        View view = this.t;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f12517f != null ? this.f12512a.f12866b : getVisibility();
    }

    public int getContentHeight() {
        return this.f12516e;
    }

    public CharSequence getSubtitle() {
        return this.f12537o;
    }

    public CharSequence getTitle() {
        return this.f12536j;
    }

    public final androidx.core.view.U h(int i7, long j6) {
        androidx.core.view.U u6 = this.f12517f;
        if (u6 != null) {
            u6.b();
        }
        C0846a c0846a = this.f12512a;
        if (i7 != 0) {
            androidx.core.view.U uA = androidx.core.view.N.a(this);
            uA.a(0.0f);
            uA.c(j6);
            c0846a.f12867c.f12517f = uA;
            c0846a.f12866b = i7;
            uA.d(c0846a);
            return uA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        androidx.core.view.U uA2 = androidx.core.view.N.a(this);
        uA2.a(1.0f);
        uA2.c(j6);
        c0846a.f12867c.f12517f = uA2;
        c0846a.f12866b = i7;
        uA2.d(c0846a);
        return uA2;
    }

    public final void i() {
        C0868l c0868l = this.f12515d;
        if (c0868l != null) {
            c0868l.d();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0868l c0868l = this.f12515d;
        if (c0868l != null) {
            c0868l.b();
            C0854e c0854e = this.f12515d.f12948Q;
            if (c0854e != null) {
                c0854e.dismiss();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        boolean z8 = p1.f12995a;
        boolean z10 = getLayoutDirection() == 1;
        int paddingRight = z10 ? (i11 - i7) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
        View view = this.f12538p;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f12538p.getLayoutParams();
            int i13 = z10 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i14 = z10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i15 = z10 ? paddingRight - i13 : paddingRight + i13;
            int iD = i15 + AbsActionBarView.d(this.f12538p, z10, i15, paddingTop, paddingTop2);
            paddingRight = z10 ? iD - i14 : iD + i14;
        }
        LinearLayout linearLayout = this.f12540w;
        if (linearLayout != null && this.f12539v == null && linearLayout.getVisibility() != 8) {
            paddingRight += AbsActionBarView.d(this.f12540w, z10, paddingRight, paddingTop, paddingTop2);
        }
        View view2 = this.f12539v;
        if (view2 != null) {
            AbsActionBarView.d(view2, z10, paddingRight, paddingTop, paddingTop2);
        }
        int paddingLeft = z10 ? getPaddingLeft() : (i11 - i7) - getPaddingRight();
        ActionMenuView actionMenuView = this.f12514c;
        if (actionMenuView != null) {
            AbsActionBarView.d(actionMenuView, !z10, paddingLeft, paddingTop, paddingTop2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        if (View.MeasureSpec.getMode(i7) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i10) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i7);
        int size2 = this.f12516e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i10);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f12538p;
        if (view != null) {
            int iC = AbsActionBarView.c(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f12538p.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f12514c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = AbsActionBarView.c(this.f12514c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f12540w;
        if (linearLayout != null && this.f12539v == null) {
            if (this.f12534L) {
                this.f12540w.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f12540w.getMeasuredWidth();
                boolean z3 = measuredWidth <= paddingLeft;
                if (z3) {
                    paddingLeft -= measuredWidth;
                }
                this.f12540w.setVisibility(z3 ? 0 : 8);
            } else {
                paddingLeft = AbsActionBarView.c(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f12539v;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = i11 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i11 >= 0) {
                paddingLeft = Math.min(i11, paddingLeft);
            }
            int i13 = layoutParams.height;
            int i14 = i13 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i13 >= 0) {
                iMin = Math.min(i13, iMin);
            }
            this.f12539v.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i12), View.MeasureSpec.makeMeasureSpec(iMin, i14));
        }
        if (this.f12516e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            int measuredHeight = getChildAt(i16).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i15) {
                i15 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i15);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public void setContentHeight(int i7) {
        this.f12516e = i7;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f12539v;
        if (view2 != null) {
            removeView(view2);
        }
        this.f12539v = view;
        if (view != null && (linearLayout = this.f12540w) != null) {
            removeView(linearLayout);
            this.f12540w = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f12537o = charSequence;
        f();
    }

    public void setTitle(CharSequence charSequence) {
        this.f12536j = charSequence;
        f();
        androidx.core.view.N.r(this, charSequence);
    }

    public void setTitleOptional(boolean z3) {
        if (z3 != this.f12534L) {
            requestLayout();
        }
        this.f12534L = z3;
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i7) {
        super.setVisibility(i7);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p241q.a.actionModeStyle);
    }

    public ActionBarContextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        Drawable drawable;
        int resourceId;
        super(context, attributeSet, i7);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p241q.j.ActionMode, i7, 0);
        int i10 = p241q.j.ActionMode_background;
        if (typedArrayObtainStyledAttributes.hasValue(i10) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i10, 0)) != 0) {
            drawable = p264r5.a.q(resourceId, context);
        } else {
            drawable = typedArrayObtainStyledAttributes.getDrawable(i10);
        }
        setBackground(drawable);
        this.f12532C = typedArrayObtainStyledAttributes.getResourceId(p241q.j.ActionMode_titleTextStyle, 0);
        this.f12533H = typedArrayObtainStyledAttributes.getResourceId(p241q.j.ActionMode_subtitleTextStyle, 0);
        this.f12516e = typedArrayObtainStyledAttributes.getLayoutDimension(p241q.j.ActionMode_height, 0);
        this.f12535M = typedArrayObtainStyledAttributes.getResourceId(p241q.j.ActionMode_closeItemLayout, p241q.g.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }
}
