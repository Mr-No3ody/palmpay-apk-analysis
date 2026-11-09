package androidx.appcompat.view.menu;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class o implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f12470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f12471b;

    public o(q qVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f12471b = qVar;
        this.f12470a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f12470a.onMenuItemActionCollapse(this.f12471b.c(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f12470a.onMenuItemActionExpand(this.f12471b.c(menuItem));
    }
}
