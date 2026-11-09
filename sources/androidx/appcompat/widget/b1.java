package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.core.view.MenuProvider;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b1 implements ActionMenuView.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Toolbar f12871a;

    public b1(Toolbar toolbar) {
        this.f12871a = toolbar;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Toolbar toolbar = this.f12871a;
        Iterator it = toolbar.mMenuHostHelper.f16269b.iterator();
        while (it.hasNext()) {
            if (((MenuProvider) it.next()).onMenuItemSelected(menuItem)) {
                return true;
            }
        }
        Toolbar.OnMenuItemClickListener onMenuItemClickListener = toolbar.mOnMenuItemClickListener;
        if (onMenuItemClickListener != null) {
            return onMenuItemClickListener.onMenuItemClick(menuItem);
        }
        return false;
    }
}
