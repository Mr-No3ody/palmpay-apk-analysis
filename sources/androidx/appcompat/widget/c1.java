package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.appcompat.view.menu.MenuBuilder$Callback;
import androidx.core.view.MenuProvider;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c1 implements MenuBuilder$Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Toolbar f12874a;

    public c1(Toolbar toolbar) {
        this.f12874a = toolbar;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder$Callback
    public final boolean onMenuItemSelected(androidx.appcompat.view.menu.k kVar, MenuItem menuItem) {
        MenuBuilder$Callback menuBuilder$Callback = this.f12874a.mMenuBuilderCallback;
        return menuBuilder$Callback != null && menuBuilder$Callback.onMenuItemSelected(kVar, menuItem);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder$Callback
    public final void onMenuModeChange(androidx.appcompat.view.menu.k kVar) {
        Toolbar toolbar = this.f12874a;
        C0868l c0868l = toolbar.mMenuView.f12577e;
        if (c0868l == null || !c0868l.c()) {
            Iterator it = toolbar.mMenuHostHelper.f16269b.iterator();
            while (it.hasNext()) {
                ((MenuProvider) it.next()).onPrepareMenu(kVar);
            }
        }
        MenuBuilder$Callback menuBuilder$Callback = toolbar.mMenuBuilderCallback;
        if (menuBuilder$Callback != null) {
            menuBuilder$Callback.onMenuModeChange(kVar);
        }
    }
}
