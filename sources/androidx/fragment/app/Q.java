package androidx.fragment.app;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.core.view.MenuProvider;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements MenuProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z f17038a;

    public Q(Z z3) {
        this.f17038a = z3;
    }

    @Override // androidx.core.view.MenuProvider
    public final void onCreateMenu(Menu menu, MenuInflater menuInflater) {
        this.f17038a.j(menu, menuInflater);
    }

    @Override // androidx.core.view.MenuProvider
    public final void onMenuClosed(Menu menu) {
        this.f17038a.p(menu);
    }

    @Override // androidx.core.view.MenuProvider
    public final boolean onMenuItemSelected(MenuItem menuItem) {
        return this.f17038a.o(menuItem);
    }

    @Override // androidx.core.view.MenuProvider
    public final void onPrepareMenu(Menu menu) {
        this.f17038a.s(menu);
    }
}
