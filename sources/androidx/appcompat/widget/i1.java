package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import androidx.appcompat.view.menu.MenuBuilder$Callback;
import androidx.appcompat.view.menu.MenuPresenter;
import com.google.android.material.navigation.NavigationBarView;

/* JADX INFO: loaded from: classes.dex */
public final class i1 implements DecorToolbar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Toolbar f12920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ScrollingTabContainerView f12922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AppCompatSpinner f12923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f12924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f12925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f12926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f12927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f12929j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f12930k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f12931l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Window.Callback f12932m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f12933n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0868l f12934o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12935p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12936q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f12937r;

    public i1(Toolbar toolbar, boolean z3) {
        int i7;
        Drawable drawable;
        int i10 = p241q.h.abc_action_bar_up_description;
        this.f12935p = 0;
        this.f12936q = 0;
        this.f12920a = toolbar;
        this.f12929j = toolbar.getTitle();
        this.f12930k = toolbar.getSubtitle();
        this.f12928i = this.f12929j != null;
        this.f12927h = toolbar.getNavigationIcon();
        Z0 z0F = Z0.f(toolbar.getContext(), null, p241q.j.ActionBar, p241q.a.actionBarStyle, 0);
        this.f12937r = z0F.b(p241q.j.ActionBar_homeAsUpIndicator);
        if (z3) {
            int i11 = p241q.j.ActionBar_title;
            TypedArray typedArray = z0F.f12863b;
            CharSequence text = typedArray.getText(i11);
            if (!TextUtils.isEmpty(text)) {
                setTitle(text);
            }
            CharSequence text2 = typedArray.getText(p241q.j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(text2)) {
                setSubtitle(text2);
            }
            Drawable drawableB = z0F.b(p241q.j.ActionBar_logo);
            if (drawableB != null) {
                setLogo(drawableB);
            }
            Drawable drawableB2 = z0F.b(p241q.j.ActionBar_icon);
            if (drawableB2 != null) {
                setIcon(drawableB2);
            }
            if (this.f12927h == null && (drawable = this.f12937r) != null) {
                setNavigationIcon(drawable);
            }
            setDisplayOptions(typedArray.getInt(p241q.j.ActionBar_displayOptions, 0));
            int resourceId = typedArray.getResourceId(p241q.j.ActionBar_customNavigationLayout, 0);
            if (resourceId != 0) {
                setCustomView(LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false));
                setDisplayOptions(this.f12921b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(p241q.j.ActionBar_height, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(p241q.j.ActionBar_contentInsetStart, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(p241q.j.ActionBar_contentInsetEnd, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                toolbar.setContentInsetsRelative(Math.max(dimensionPixelOffset, 0), Math.max(dimensionPixelOffset2, 0));
            }
            int resourceId2 = typedArray.getResourceId(p241q.j.ActionBar_titleTextStyle, 0);
            if (resourceId2 != 0) {
                toolbar.setTitleTextAppearance(toolbar.getContext(), resourceId2);
            }
            int resourceId3 = typedArray.getResourceId(p241q.j.ActionBar_subtitleTextStyle, 0);
            if (resourceId3 != 0) {
                toolbar.setSubtitleTextAppearance(toolbar.getContext(), resourceId3);
            }
            int resourceId4 = typedArray.getResourceId(p241q.j.ActionBar_popupTheme, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f12937r = toolbar.getNavigationIcon();
                i7 = 15;
            } else {
                i7 = 11;
            }
            this.f12921b = i7;
        }
        z0F.g();
        setDefaultNavigationContentDescription(i10);
        this.f12931l = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new g1(this));
    }

    public final void a() {
        if (this.f12923d == null) {
            this.f12923d = new AppCompatSpinner(this.f12920a.getContext(), null, p241q.a.actionDropDownStyle);
            Toolbar.LayoutParams layoutParams = new Toolbar.LayoutParams(-2);
            layoutParams.f12829b = 0;
            layoutParams.f12075a = NavigationBarView.ITEM_GRAVITY_START_CENTER;
            this.f12923d.setLayoutParams(layoutParams);
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void animateToVisibility(int i7) {
        View view = (View) setupAnimatorToVisibility(i7, 200L).f16184a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public final void b() {
        if ((this.f12921b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f12931l);
            Toolbar toolbar = this.f12920a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f12936q);
            } else {
                toolbar.setNavigationContentDescription(this.f12931l);
            }
        }
    }

    public final void c() {
        int i7 = this.f12921b & 4;
        Toolbar toolbar = this.f12920a;
        if (i7 == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        Drawable drawable = this.f12927h;
        if (drawable == null) {
            drawable = this.f12937r;
        }
        toolbar.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final boolean canShowOverflowMenu() {
        return this.f12920a.canShowOverflowMenu();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void collapseActionView() {
        this.f12920a.collapseActionView();
    }

    public final void d() {
        Drawable drawable;
        int i7 = this.f12921b;
        if ((i7 & 2) == 0) {
            drawable = null;
        } else if ((i7 & 1) == 0 || (drawable = this.f12926g) == null) {
            drawable = this.f12925f;
        }
        this.f12920a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void dismissPopupMenus() {
        this.f12920a.dismissPopupMenus();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final Context getContext() {
        return this.f12920a.getContext();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final View getCustomView() {
        return this.f12924e;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final int getDisplayOptions() {
        return this.f12921b;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final int getDropdownItemCount() {
        AppCompatSpinner appCompatSpinner = this.f12923d;
        if (appCompatSpinner != null) {
            return appCompatSpinner.getCount();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final int getDropdownSelectedPosition() {
        AppCompatSpinner appCompatSpinner = this.f12923d;
        if (appCompatSpinner != null) {
            return appCompatSpinner.getSelectedItemPosition();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final int getHeight() {
        return this.f12920a.getHeight();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final Menu getMenu() {
        return this.f12920a.getMenu();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final int getNavigationMode() {
        return this.f12935p;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final CharSequence getSubtitle() {
        return this.f12920a.getSubtitle();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final CharSequence getTitle() {
        return this.f12920a.getTitle();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final ViewGroup getViewGroup() {
        return this.f12920a;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final int getVisibility() {
        return this.f12920a.getVisibility();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final boolean hasEmbeddedTabs() {
        return this.f12922c != null;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final boolean hasExpandedActionView() {
        return this.f12920a.hasExpandedActionView();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final boolean hasIcon() {
        return this.f12925f != null;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final boolean hasLogo() {
        return this.f12926g != null;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final boolean hideOverflowMenu() {
        return this.f12920a.hideOverflowMenu();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void initIndeterminateProgress() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void initProgress() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final boolean isOverflowMenuShowPending() {
        return this.f12920a.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final boolean isOverflowMenuShowing() {
        return this.f12920a.isOverflowMenuShowing();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final boolean isTitleTruncated() {
        return this.f12920a.isTitleTruncated();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void restoreHierarchyState(SparseArray sparseArray) {
        this.f12920a.restoreHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void saveHierarchyState(SparseArray sparseArray) {
        this.f12920a.saveHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setBackgroundDrawable(Drawable drawable) {
        this.f12920a.setBackground(drawable);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setCollapsible(boolean z3) {
        this.f12920a.setCollapsible(z3);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setCustomView(View view) {
        View view2 = this.f12924e;
        Toolbar toolbar = this.f12920a;
        if (view2 != null && (this.f12921b & 16) != 0) {
            toolbar.removeView(view2);
        }
        this.f12924e = view;
        if (view == null || (this.f12921b & 16) == 0) {
            return;
        }
        toolbar.addView(view);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setDefaultNavigationContentDescription(int i7) {
        if (i7 == this.f12936q) {
            return;
        }
        this.f12936q = i7;
        if (TextUtils.isEmpty(this.f12920a.getNavigationContentDescription())) {
            setNavigationContentDescription(this.f12936q);
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setDefaultNavigationIcon(Drawable drawable) {
        if (this.f12937r != drawable) {
            this.f12937r = drawable;
            c();
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setDisplayOptions(int i7) {
        View view;
        int i10 = this.f12921b ^ i7;
        this.f12921b = i7;
        if (i10 != 0) {
            if ((i10 & 4) != 0) {
                if ((i7 & 4) != 0) {
                    b();
                }
                c();
            }
            if ((i10 & 3) != 0) {
                d();
            }
            int i11 = i10 & 8;
            Toolbar toolbar = this.f12920a;
            if (i11 != 0) {
                if ((i7 & 8) != 0) {
                    toolbar.setTitle(this.f12929j);
                    toolbar.setSubtitle(this.f12930k);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i10 & 16) == 0 || (view = this.f12924e) == null) {
                return;
            }
            if ((i7 & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setDropdownParams(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        a();
        this.f12923d.setAdapter(spinnerAdapter);
        this.f12923d.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setDropdownSelectedPosition(int i7) {
        AppCompatSpinner appCompatSpinner = this.f12923d;
        if (appCompatSpinner == null) {
            throw new IllegalStateException("Can't set dropdown selected position without an adapter");
        }
        appCompatSpinner.setSelection(i7);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setEmbeddedTabView(ScrollingTabContainerView scrollingTabContainerView) {
        ScrollingTabContainerView scrollingTabContainerView2 = this.f12922c;
        Toolbar toolbar = this.f12920a;
        if (scrollingTabContainerView2 != null && scrollingTabContainerView2.getParent() == toolbar) {
            toolbar.removeView(this.f12922c);
        }
        this.f12922c = scrollingTabContainerView;
        if (scrollingTabContainerView == null || this.f12935p != 2) {
            return;
        }
        toolbar.addView(scrollingTabContainerView, 0);
        Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.f12922c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).width = -2;
        ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
        layoutParams.f12075a = 8388691;
        scrollingTabContainerView.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setHomeButtonEnabled(boolean z3) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setIcon(int i7) {
        setIcon(i7 != 0 ? p264r5.a.q(i7, this.f12920a.getContext()) : null);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setLogo(int i7) {
        setLogo(i7 != 0 ? p264r5.a.q(i7, this.f12920a.getContext()) : null);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setMenu(Menu menu, MenuPresenter.Callback callback) {
        C0868l c0868l = this.f12934o;
        Toolbar toolbar = this.f12920a;
        if (c0868l == null) {
            C0868l c0868l2 = new C0868l(toolbar.getContext());
            this.f12934o = c0868l2;
            c0868l2.f12386j = p241q.f.action_menu_presenter;
        }
        C0868l c0868l3 = this.f12934o;
        c0868l3.f12382e = callback;
        toolbar.setMenu((androidx.appcompat.view.menu.k) menu, c0868l3);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setMenuCallbacks(MenuPresenter.Callback callback, MenuBuilder$Callback menuBuilder$Callback) {
        this.f12920a.setMenuCallbacks(callback, menuBuilder$Callback);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setMenuPrepared() {
        this.f12933n = true;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setNavigationContentDescription(int i7) {
        setNavigationContentDescription(i7 == 0 ? null : this.f12920a.getContext().getString(i7));
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setNavigationIcon(int i7) {
        setNavigationIcon(i7 != 0 ? p264r5.a.q(i7, this.f12920a.getContext()) : null);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setNavigationMode(int i7) {
        ScrollingTabContainerView scrollingTabContainerView;
        int i10 = this.f12935p;
        if (i7 != i10) {
            Toolbar toolbar = this.f12920a;
            if (i10 == 1) {
                AppCompatSpinner appCompatSpinner = this.f12923d;
                if (appCompatSpinner != null && appCompatSpinner.getParent() == toolbar) {
                    toolbar.removeView(this.f12923d);
                }
            } else if (i10 == 2 && (scrollingTabContainerView = this.f12922c) != null && scrollingTabContainerView.getParent() == toolbar) {
                toolbar.removeView(this.f12922c);
            }
            this.f12935p = i7;
            if (i7 != 0) {
                if (i7 == 1) {
                    a();
                    toolbar.addView(this.f12923d, 0);
                } else {
                    if (i7 != 2) {
                        throw new IllegalArgumentException(C0.G.m(i7, "Invalid navigation mode "));
                    }
                    ScrollingTabContainerView scrollingTabContainerView2 = this.f12922c;
                    if (scrollingTabContainerView2 != null) {
                        toolbar.addView(scrollingTabContainerView2, 0);
                        Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.f12922c.getLayoutParams();
                        ((ViewGroup.MarginLayoutParams) layoutParams).width = -2;
                        ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
                        layoutParams.f12075a = 8388691;
                    }
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setSubtitle(CharSequence charSequence) {
        this.f12930k = charSequence;
        if ((this.f12921b & 8) != 0) {
            this.f12920a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setTitle(CharSequence charSequence) {
        this.f12928i = true;
        this.f12929j = charSequence;
        if ((this.f12921b & 8) != 0) {
            Toolbar toolbar = this.f12920a;
            toolbar.setTitle(charSequence);
            if (this.f12928i) {
                androidx.core.view.N.r(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setVisibility(int i7) {
        this.f12920a.setVisibility(i7);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setWindowCallback(Window.Callback callback) {
        this.f12932m = callback;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setWindowTitle(CharSequence charSequence) {
        if (this.f12928i) {
            return;
        }
        this.f12929j = charSequence;
        if ((this.f12921b & 8) != 0) {
            Toolbar toolbar = this.f12920a;
            toolbar.setTitle(charSequence);
            if (this.f12928i) {
                androidx.core.view.N.r(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final androidx.core.view.U setupAnimatorToVisibility(int i7, long j6) {
        androidx.core.view.U uA = androidx.core.view.N.a(this.f12920a);
        uA.a(i7 == 0 ? 1.0f : 0.0f);
        uA.c(j6);
        uA.d(new h1(this, i7));
        return uA;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final boolean showOverflowMenu() {
        return this.f12920a.showOverflowMenu();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setIcon(Drawable drawable) {
        this.f12925f = drawable;
        d();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setLogo(Drawable drawable) {
        this.f12926g = drawable;
        d();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setNavigationContentDescription(CharSequence charSequence) {
        this.f12931l = charSequence;
        b();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setNavigationIcon(Drawable drawable) {
        this.f12927h = drawable;
        c();
    }
}
