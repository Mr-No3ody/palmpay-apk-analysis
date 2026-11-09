package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0868l;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements MenuPresenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f12378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f12379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f12380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LayoutInflater f12381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MenuPresenter.Callback f12382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12384g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MenuView f12385i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12386j;

    public abstract View a(m mVar, View view, ViewGroup viewGroup);

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean collapseItemActionView(k kVar, m mVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean expandItemActionView(k kVar, m mVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final int getId() {
        return this.f12386j;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public MenuView getMenuView(ViewGroup viewGroup) {
        if (this.f12385i == null) {
            MenuView menuView = (MenuView) this.f12381d.inflate(this.f12383f, viewGroup, false);
            this.f12385i = menuView;
            menuView.initialize(this.f12380c);
            updateMenuView(true);
        }
        return this.f12385i;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(Context context, k kVar) {
        this.f12379b = context;
        LayoutInflater.from(context);
        this.f12380c = kVar;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(k kVar, boolean z3) {
        MenuPresenter.Callback callback = this.f12382e;
        if (callback != null) {
            callback.onCloseMenu(kVar, z3);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(w wVar) {
        MenuPresenter.Callback callback = this.f12382e;
        k kVar = wVar;
        if (callback == null) {
            return false;
        }
        if (wVar == null) {
            kVar = this.f12380c;
        }
        return callback.onOpenSubMenu(kVar);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void setCallback(MenuPresenter.Callback callback) {
        this.f12382e = callback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z3) {
        ViewGroup viewGroup = (ViewGroup) this.f12385i;
        if (viewGroup == null) {
            return;
        }
        k kVar = this.f12380c;
        int i7 = 0;
        if (kVar != null) {
            kVar.flagActionItems();
            ArrayList<m> visibleItems = this.f12380c.getVisibleItems();
            int size = visibleItems.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                m mVar = visibleItems.get(i11);
                if ((mVar.f12464x & 32) == 32) {
                    View childAt = viewGroup.getChildAt(i10);
                    m itemData = childAt instanceof MenuView.ItemView ? ((MenuView.ItemView) childAt).getItemData() : null;
                    View viewA = a(mVar, childAt, viewGroup);
                    if (mVar != itemData) {
                        viewA.setPressed(false);
                        viewA.jumpDrawablesToCurrentState();
                    }
                    if (viewA != childAt) {
                        ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(viewA);
                        }
                        ((ViewGroup) this.f12385i).addView(viewA, i10);
                    }
                    i10++;
                }
            }
            i7 = i10;
        }
        while (i7 < viewGroup.getChildCount()) {
            if (viewGroup.getChildAt(i7) == ((C0868l) this).f12953o) {
                i7++;
            } else {
                viewGroup.removeViewAt(i7);
            }
        }
    }
}
