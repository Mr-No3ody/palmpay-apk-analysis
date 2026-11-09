package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public abstract class r implements ShowableListMenu, MenuPresenter, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rect f12476a;

    public static int b(ListAdapter listAdapter, Context context, int i7) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i10 = 0;
        int i11 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i12 = 0; i12 < count; i12++) {
            int itemViewType = listAdapter.getItemViewType(i12);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i12, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i7) {
                return i7;
            }
            if (measuredWidth > i10) {
                i10 = measuredWidth;
            }
        }
        return i10;
    }

    public abstract void a(k kVar);

    public abstract void c(View view);

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean collapseItemActionView(k kVar, m mVar) {
        return false;
    }

    public abstract void d(boolean z3);

    public abstract void e(int i7);

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean expandItemActionView(k kVar, m mVar) {
        return false;
    }

    public abstract void f(int i7);

    public abstract void g(PopupWindow.OnDismissListener onDismissListener);

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final MenuView getMenuView(ViewGroup viewGroup) {
        throw new UnsupportedOperationException("MenuPopups manage their own views");
    }

    public abstract void h(boolean z3);

    public abstract void i(int i7);

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void initForMenu(Context context, k kVar) {
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j6) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (j) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (j) listAdapter).f12429a.performItemAction((MenuItem) listAdapter.getItem(i7), this, !(this instanceof g) ? 0 : 4);
    }
}
