package androidx.appcompat.app;

import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.MenuBuilder$Callback;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements AppCompatDelegateImpl$ActionBarMenuCallback, MenuBuilder$Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S f12163a;

    public /* synthetic */ Q(S s3) {
        this.f12163a = s3;
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl$ActionBarMenuCallback
    public View onCreatePanelView(int i7) {
        if (i7 == 0) {
            return new View(this.f12163a.f12164a.f12920a.getContext());
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder$Callback
    public boolean onMenuItemSelected(androidx.appcompat.view.menu.k kVar, MenuItem menuItem) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder$Callback
    public void onMenuModeChange(androidx.appcompat.view.menu.k kVar) {
        S s3 = this.f12163a;
        boolean zIsOverflowMenuShowing = s3.f12164a.f12920a.isOverflowMenuShowing();
        D d2 = s3.f12165b;
        if (zIsOverflowMenuShowing) {
            d2.onPanelClosed(108, kVar);
        } else if (d2.onPreparePanel(0, null, kVar)) {
            d2.onMenuOpened(108, kVar);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegateImpl$ActionBarMenuCallback
    public boolean onPreparePanel(int i7) {
        if (i7 != 0) {
            return false;
        }
        S s3 = this.f12163a;
        if (s3.f12167d) {
            return false;
        }
        s3.f12164a.f12933n = true;
        s3.f12167d = true;
        return false;
    }
}
