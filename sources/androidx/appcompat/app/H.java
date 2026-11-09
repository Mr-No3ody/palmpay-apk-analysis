package androidx.appcompat.app;

import android.view.Window;
import androidx.appcompat.view.menu.MenuPresenter;

/* JADX INFO: loaded from: classes.dex */
public final class H implements MenuPresenter.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f12107a;

    public H(I i7) {
        this.f12107a = i7;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public final void onCloseMenu(androidx.appcompat.view.menu.k kVar, boolean z3) {
        G g7;
        androidx.appcompat.view.menu.k rootMenu = kVar.getRootMenu();
        int i7 = 0;
        boolean z8 = rootMenu != kVar;
        if (z8) {
            kVar = rootMenu;
        }
        I i10 = this.f12107a;
        G[] gArr = i10.f12113B0;
        int length = gArr != null ? gArr.length : 0;
        while (true) {
            if (i7 < length) {
                g7 = gArr[i7];
                if (g7 != null && g7.f12098h == kVar) {
                    break;
                } else {
                    i7++;
                }
            } else {
                g7 = null;
                break;
            }
        }
        if (g7 != null) {
            if (!z8) {
                i10.t(g7, z3);
            } else {
                i10.r(g7.f12091a, g7, rootMenu);
                i10.t(g7, true);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public final boolean onOpenSubMenu(androidx.appcompat.view.menu.k kVar) {
        Window.Callback callback;
        if (kVar != kVar.getRootMenu()) {
            return true;
        }
        I i7 = this.f12107a;
        if (!i7.f12152v0 || (callback = i7.t.getCallback()) == null || i7.f12119G0) {
            return true;
        }
        callback.onMenuOpened(108, kVar);
        return true;
    }
}
