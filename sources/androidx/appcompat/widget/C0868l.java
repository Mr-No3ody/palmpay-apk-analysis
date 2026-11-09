package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuView;
import androidx.core.view.AbstractC1051c;
import androidx.core.view.ActionProvider$SubUiVisibilityListener;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.appcompat.widget.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0868l extends androidx.appcompat.view.menu.d implements ActionProvider$SubUiVisibilityListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f12942A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f12943B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f12944C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f12945H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final SparseBooleanArray f12946L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public C0862i f12947M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public C0854e f12948Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public RunnableC0858g f12949X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public C0856f f12950Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final C0864j f12951Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f12952k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ActionMenuPresenter$OverflowMenuButton f12953o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Drawable f12954p;
    public boolean t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12955v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f12956w;

    public C0868l(Context context) {
        int i7 = p241q.g.abc_action_menu_layout;
        int i10 = p241q.g.abc_action_menu_item_layout;
        this.f12378a = context;
        this.f12381d = LayoutInflater.from(context);
        this.f12383f = i7;
        this.f12384g = i10;
        this.f12946L = new SparseBooleanArray();
        this.f12951Z = new C0864j(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.d
    public final View a(androidx.appcompat.view.menu.m mVar, View view, ViewGroup viewGroup) {
        MenuView.ItemView itemView;
        View actionView = mVar.getActionView();
        if (actionView == null || mVar.c()) {
            if (view instanceof MenuView.ItemView) {
                itemView = (MenuView.ItemView) view;
            } else {
                itemView = (MenuView.ItemView) this.f12381d.inflate(this.f12384g, viewGroup, false);
            }
            itemView.initialize(mVar, 0);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) itemView;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f12385i);
            if (this.f12950Y == null) {
                this.f12950Y = new C0856f(this);
            }
            actionMenuItemView.setPopupCallback(this.f12950Y);
            actionView = (View) itemView;
        }
        actionView.setVisibility(mVar.f12440C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof ActionMenuView.LayoutParams)) {
            actionView.setLayoutParams(ActionMenuView.b(layoutParams));
        }
        return actionView;
    }

    public final boolean b() {
        Object obj;
        RunnableC0858g runnableC0858g = this.f12949X;
        if (runnableC0858g != null && (obj = this.f12385i) != null) {
            ((View) obj).removeCallbacks(runnableC0858g);
            this.f12949X = null;
            return true;
        }
        C0862i c0862i = this.f12947M;
        if (c0862i == null) {
            return false;
        }
        c0862i.dismiss();
        return true;
    }

    public final boolean c() {
        C0862i c0862i = this.f12947M;
        return c0862i != null && c0862i.b();
    }

    public final boolean d() {
        androidx.appcompat.view.menu.k kVar;
        if (!this.f12955v || c() || (kVar = this.f12380c) == null || this.f12385i == null || this.f12949X != null || kVar.getNonActionItems().isEmpty()) {
            return false;
        }
        RunnableC0858g runnableC0858g = new RunnableC0858g(0, this, new C0862i(this, this.f12379b, this.f12380c, this.f12953o));
        this.f12949X = runnableC0858g;
        ((View) this.f12385i).post(runnableC0858g);
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean flagActionItems() {
        ArrayList<androidx.appcompat.view.menu.m> visibleItems;
        int size;
        boolean z3;
        boolean z8;
        boolean z10;
        boolean z11;
        C0868l c0868l = this;
        androidx.appcompat.view.menu.k kVar = c0868l.f12380c;
        View view = null;
        boolean z12 = false;
        if (kVar != null) {
            visibleItems = kVar.getVisibleItems();
            size = visibleItems.size();
        } else {
            visibleItems = null;
            size = 0;
        }
        int i7 = c0868l.f12944C;
        int i10 = c0868l.f12943B;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0868l.f12385i;
        int i11 = 0;
        boolean z13 = false;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            z3 = true;
            if (i11 >= size) {
                break;
            }
            androidx.appcompat.view.menu.m mVar = visibleItems.get(i11);
            if (mVar.requiresActionButton()) {
                i12++;
                z11 = z13;
            } else if ((mVar.f12465y & 1) == 1) {
                i13++;
                z11 = z13;
            } else {
                z11 = true;
            }
            if (c0868l.f12945H && mVar.f12440C) {
                i7 = 0;
            }
            i11++;
            z13 = z11;
        }
        if (c0868l.f12955v && (z13 || i13 + i12 > i7)) {
            i7--;
        }
        int i14 = i7 - i12;
        SparseBooleanArray sparseBooleanArray = c0868l.f12946L;
        sparseBooleanArray.clear();
        int i15 = 0;
        int i16 = 0;
        while (i15 < size) {
            androidx.appcompat.view.menu.m mVar2 = visibleItems.get(i15);
            boolean zRequiresActionButton = mVar2.requiresActionButton();
            int i17 = mVar2.f12443b;
            if (zRequiresActionButton) {
                View viewA = c0868l.a(mVar2, view, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i10 -= measuredWidth;
                if (i16 == 0) {
                    i16 = measuredWidth;
                }
                if (i17 != 0) {
                    sparseBooleanArray.put(i17, z3);
                }
                mVar2.e(z3);
                z8 = z12;
                z10 = z3 ? 1 : 0;
            } else if ((mVar2.f12465y & (z3 ? 1 : 0)) == z3) {
                boolean z14 = sparseBooleanArray.get(i17);
                boolean z15 = ((i14 > 0 || z14) && i10 > 0) ? z3 ? 1 : 0 : z12;
                if (z15) {
                    View viewA2 = c0868l.a(mVar2, view, viewGroup);
                    viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i10 -= measuredWidth2;
                    if (i16 == 0) {
                        i16 = measuredWidth2;
                    }
                    z15 = (z15 ? 1 : 0) & (i10 + i16 > 0 ? z3 ? 1 : 0 : false);
                }
                boolean z16 = z15;
                if (z16 && i17 != 0) {
                    sparseBooleanArray.put(i17, z3);
                } else if (z14) {
                    sparseBooleanArray.put(i17, false);
                    int i18 = 0;
                    while (i18 < i15) {
                        androidx.appcompat.view.menu.m mVar3 = visibleItems.get(i18);
                        boolean z17 = z3 ? 1 : 0;
                        if (mVar3.f12443b == i17) {
                            if ((mVar3.f12464x & 32) == 32) {
                                i14++;
                            }
                            mVar3.e(false);
                        }
                        i18++;
                        z3 = z17 ? 1 : 0;
                    }
                }
                z10 = z3;
                if (z16) {
                    i14--;
                }
                mVar2.e(z16);
                z8 = false;
            } else {
                z8 = z12;
                z10 = z3 ? 1 : 0;
                mVar2.e(z8);
            }
            i15++;
            z12 = z8;
            z3 = z10;
            view = null;
            c0868l = this;
        }
        return z3 ? 1 : 0;
    }

    @Override // androidx.appcompat.view.menu.d, androidx.appcompat.view.menu.MenuPresenter
    public final MenuView getMenuView(ViewGroup viewGroup) {
        MenuView menuView = this.f12385i;
        MenuView menuView2 = super.getMenuView(viewGroup);
        if (menuView != menuView2) {
            ((ActionMenuView) menuView2).setPresenter(this);
        }
        return menuView2;
    }

    @Override // androidx.appcompat.view.menu.d, androidx.appcompat.view.menu.MenuPresenter
    public final void initForMenu(Context context, androidx.appcompat.view.menu.k kVar) {
        super.initForMenu(context, kVar);
        Resources resources = context.getResources();
        p382zb.H hA = p382zb.H.a(context);
        if (!this.f12956w) {
            this.f12955v = true;
        }
        this.f12942A = ((Context) hA.f44527a).getResources().getDisplayMetrics().widthPixels / 2;
        this.f12944C = hA.b();
        int measuredWidth = this.f12942A;
        if (this.f12955v) {
            if (this.f12953o == null) {
                ActionMenuPresenter$OverflowMenuButton actionMenuPresenter$OverflowMenuButton = new ActionMenuPresenter$OverflowMenuButton(this, this.f12378a);
                this.f12953o = actionMenuPresenter$OverflowMenuButton;
                if (this.t) {
                    actionMenuPresenter$OverflowMenuButton.setImageDrawable(this.f12954p);
                    this.f12954p = null;
                    this.t = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f12953o.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f12953o.getMeasuredWidth();
        } else {
            this.f12953o = null;
        }
        this.f12943B = measuredWidth;
        float f10 = resources.getDisplayMetrics().density;
    }

    @Override // androidx.appcompat.view.menu.d, androidx.appcompat.view.menu.MenuPresenter
    public final void onCloseMenu(androidx.appcompat.view.menu.k kVar, boolean z3) {
        b();
        C0854e c0854e = this.f12948Q;
        if (c0854e != null) {
            c0854e.dismiss();
        }
        super.onCloseMenu(kVar, z3);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i7;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof ActionMenuPresenter$SavedState) && (i7 = ((ActionMenuPresenter$SavedState) parcelable).f12572a) > 0 && (menuItemFindItem = this.f12380c.findItem(i7)) != null) {
            onSubMenuSelected((androidx.appcompat.view.menu.w) menuItemFindItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final Parcelable onSaveInstanceState() {
        ActionMenuPresenter$SavedState actionMenuPresenter$SavedState = new ActionMenuPresenter$SavedState();
        actionMenuPresenter$SavedState.f12572a = this.f12952k0;
        return actionMenuPresenter$SavedState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.d, androidx.appcompat.view.menu.MenuPresenter
    public final boolean onSubMenuSelected(androidx.appcompat.view.menu.w wVar) {
        boolean z3;
        if (wVar.hasVisibleItems()) {
            androidx.appcompat.view.menu.w wVar2 = wVar;
            while (wVar2.getParentMenu() != this.f12380c) {
                wVar2 = (androidx.appcompat.view.menu.w) wVar2.getParentMenu();
            }
            MenuItem item = wVar2.getItem();
            ViewGroup viewGroup = (ViewGroup) this.f12385i;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = viewGroup.getChildAt(i7);
                    if ((childAt instanceof MenuView.ItemView) && ((MenuView.ItemView) childAt).getItemData() == item) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                this.f12952k0 = wVar.getItem().getItemId();
                int size = wVar.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        z3 = false;
                        break;
                    }
                    MenuItem item2 = wVar.getItem(i10);
                    if (item2.isVisible() && item2.getIcon() != null) {
                        z3 = true;
                        break;
                    }
                    i10++;
                }
                C0854e c0854e = new C0854e(this, this.f12379b, wVar, view);
                this.f12948Q = c0854e;
                c0854e.f12484g = z3;
                androidx.appcompat.view.menu.r rVar = c0854e.f12486i;
                if (rVar != null) {
                    rVar.d(z3);
                }
                C0854e c0854e2 = this.f12948Q;
                if (!c0854e2.b()) {
                    if (c0854e2.f12482e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c0854e2.d(0, 0, false, false);
                }
                super.onSubMenuSelected(wVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.view.ActionProvider$SubUiVisibilityListener
    public final void onSubUiVisibilityChanged(boolean z3) {
        if (z3) {
            super.onSubMenuSelected(null);
            return;
        }
        androidx.appcompat.view.menu.k kVar = this.f12380c;
        if (kVar != null) {
            kVar.close(false);
        }
    }

    @Override // androidx.appcompat.view.menu.d, androidx.appcompat.view.menu.MenuPresenter
    public final void updateMenuView(boolean z3) {
        super.updateMenuView(z3);
        ((View) this.f12385i).requestLayout();
        androidx.appcompat.view.menu.k kVar = this.f12380c;
        boolean z8 = false;
        if (kVar != null) {
            ArrayList<androidx.appcompat.view.menu.m> actionItems = kVar.getActionItems();
            int size = actionItems.size();
            for (int i7 = 0; i7 < size; i7++) {
                AbstractC1051c abstractC1051c = actionItems.get(i7).f12438A;
                if (abstractC1051c != null) {
                    abstractC1051c.f16203a = this;
                }
            }
        }
        androidx.appcompat.view.menu.k kVar2 = this.f12380c;
        ArrayList<androidx.appcompat.view.menu.m> nonActionItems = kVar2 != null ? kVar2.getNonActionItems() : null;
        if (this.f12955v && nonActionItems != null) {
            int size2 = nonActionItems.size();
            if (size2 == 1) {
                z8 = !nonActionItems.get(0).f12440C;
            } else if (size2 > 0) {
                z8 = true;
            }
        }
        if (z8) {
            if (this.f12953o == null) {
                this.f12953o = new ActionMenuPresenter$OverflowMenuButton(this, this.f12378a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f12953o.getParent();
            if (viewGroup != this.f12385i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f12953o);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f12385i;
                ActionMenuPresenter$OverflowMenuButton actionMenuPresenter$OverflowMenuButton = this.f12953o;
                actionMenuView.getClass();
                ActionMenuView.LayoutParams layoutParamsA = ActionMenuView.a();
                layoutParamsA.f12584a = true;
                actionMenuView.addView(actionMenuPresenter$OverflowMenuButton, layoutParamsA);
            }
        } else {
            ActionMenuPresenter$OverflowMenuButton actionMenuPresenter$OverflowMenuButton2 = this.f12953o;
            if (actionMenuPresenter$OverflowMenuButton2 != null) {
                Object parent = actionMenuPresenter$OverflowMenuButton2.getParent();
                Object obj = this.f12385i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f12953o);
                }
            }
        }
        ((ActionMenuView) this.f12385i).setOverflowReserved(this.f12955v);
    }
}
