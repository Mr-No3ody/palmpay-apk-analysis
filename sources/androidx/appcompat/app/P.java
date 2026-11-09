package androidx.appcompat.app;

import androidx.appcompat.view.menu.MenuPresenter;

/* JADX INFO: loaded from: classes.dex */
public final class P implements MenuPresenter.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S f12162b;

    public P(S s3) {
        this.f12162b = s3;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public final void onCloseMenu(androidx.appcompat.view.menu.k kVar, boolean z3) {
        if (this.f12161a) {
            return;
        }
        this.f12161a = true;
        S s3 = this.f12162b;
        s3.f12164a.dismissPopupMenus();
        s3.f12165b.onPanelClosed(108, kVar);
        this.f12161a = false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public final boolean onOpenSubMenu(androidx.appcompat.view.menu.k kVar) {
        this.f12162b.f12165b.onMenuOpened(108, kVar);
        return true;
    }
}
