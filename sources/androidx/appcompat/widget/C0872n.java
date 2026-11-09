package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.appcompat.view.menu.MenuBuilder$Callback;

/* JADX INFO: renamed from: androidx.appcompat.widget.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0872n implements MenuBuilder$Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f12978a;

    public C0872n(ActionMenuView actionMenuView) {
        this.f12978a = actionMenuView;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder$Callback
    public final boolean onMenuItemSelected(androidx.appcompat.view.menu.k kVar, MenuItem menuItem) {
        ActionMenuView.OnMenuItemClickListener onMenuItemClickListener = this.f12978a.t;
        return onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(menuItem);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder$Callback
    public final void onMenuModeChange(androidx.appcompat.view.menu.k kVar) {
        MenuBuilder$Callback menuBuilder$Callback = this.f12978a.f12579g;
        if (menuBuilder$Callback != null) {
            menuBuilder$Callback.onMenuModeChange(kVar);
        }
    }
}
