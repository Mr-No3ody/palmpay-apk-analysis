package androidx.appcompat.view.menu;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class p implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f12472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f12473b;

    public p(q qVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f12473b = qVar;
        this.f12472a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f12472a.onMenuItemClick(this.f12473b.c(menuItem));
    }
}
