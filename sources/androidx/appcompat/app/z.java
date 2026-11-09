package androidx.appcompat.app;

import android.view.Window;
import androidx.appcompat.view.menu.MenuPresenter;

/* JADX INFO: loaded from: classes.dex */
public final class z implements MenuPresenter.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f12330a;

    public z(I i7) {
        this.f12330a = i7;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public final void onCloseMenu(androidx.appcompat.view.menu.k kVar, boolean z3) {
        this.f12330a.s(kVar);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public final boolean onOpenSubMenu(androidx.appcompat.view.menu.k kVar) {
        Window.Callback callback = this.f12330a.t.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, kVar);
        return true;
    }
}
