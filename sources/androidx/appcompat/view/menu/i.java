package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.app.C0833k;
import androidx.appcompat.app.DialogInterfaceC0834l;
import com.adjust.sdk.network.ErrorCodes;

/* JADX INFO: loaded from: classes.dex */
public final class i implements MenuPresenter, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f12422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LayoutInflater f12423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f12424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f12425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MenuPresenter.Callback f12427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h f12428g;

    public i(Context context, int i7) {
        this.f12426e = i7;
        this.f12422a = context;
        this.f12423b = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean collapseItemActionView(k kVar, m mVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean expandItemActionView(k kVar, m mVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final MenuView getMenuView(ViewGroup viewGroup) {
        if (this.f12425d == null) {
            this.f12425d = (ExpandedMenuView) this.f12423b.inflate(p241q.g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f12428g == null) {
                this.f12428g = new h(this);
            }
            this.f12425d.setAdapter((ListAdapter) this.f12428g);
            this.f12425d.setOnItemClickListener(this);
        }
        return this.f12425d;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void initForMenu(Context context, k kVar) {
        if (this.f12422a != null) {
            this.f12422a = context;
            if (this.f12423b == null) {
                this.f12423b = LayoutInflater.from(context);
            }
        }
        this.f12424c = kVar;
        h hVar = this.f12428g;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onCloseMenu(k kVar, boolean z3) {
        MenuPresenter.Callback callback = this.f12427f;
        if (callback != null) {
            callback.onCloseMenu(kVar, z3);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j6) {
        this.f12424c.performItemAction(this.f12428g.getItem(i7), this, 0);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f12425d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final Parcelable onSaveInstanceState() {
        if (this.f12425d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f12425d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean onSubMenuSelected(w wVar) {
        if (!wVar.hasVisibleItems()) {
            return false;
        }
        l lVar = new l();
        lVar.f12435a = wVar;
        C0833k c0833k = new C0833k(wVar.getContext());
        i iVar = new i(c0833k.getContext(), p241q.g.abc_list_menu_item_layout);
        lVar.f12437c = iVar;
        iVar.f12427f = lVar;
        wVar.addMenuPresenter(iVar);
        i iVar2 = lVar.f12437c;
        if (iVar2.f12428g == null) {
            iVar2.f12428g = new h(iVar2);
        }
        c0833k.setAdapter(iVar2.f12428g, lVar);
        View headerView = wVar.getHeaderView();
        if (headerView != null) {
            c0833k.setCustomTitle(headerView);
        } else {
            c0833k.setIcon(wVar.getHeaderIcon());
            c0833k.setTitle(wVar.getHeaderTitle());
        }
        c0833k.setOnKeyListener(lVar);
        DialogInterfaceC0834l dialogInterfaceC0834lCreate = c0833k.create();
        lVar.f12436b = dialogInterfaceC0834lCreate;
        dialogInterfaceC0834lCreate.setOnDismissListener(lVar);
        WindowManager.LayoutParams attributes = lVar.f12436b.getWindow().getAttributes();
        attributes.type = ErrorCodes.MALFORMED_URL_EXCEPTION;
        attributes.flags |= 131072;
        lVar.f12436b.show();
        MenuPresenter.Callback callback = this.f12427f;
        if (callback == null) {
            return true;
        }
        callback.onOpenSubMenu(wVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void setCallback(MenuPresenter.Callback callback) {
        this.f12427f = callback;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void updateMenuView(boolean z3) {
        h hVar = this.f12428g;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }
}
