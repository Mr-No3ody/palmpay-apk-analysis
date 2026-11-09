package androidx.appcompat.widget;

import Pa.C0525w;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.appcompat.widget.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0894y0 extends ListPopupWindow implements MenuItemHoverListener {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final Method f13030t0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public C0525w f13031s0;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f13030t0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.appcompat.widget.DropDownListView, androidx.appcompat.widget.MenuPopupWindow$MenuDropDownListView] */
    @Override // androidx.appcompat.widget.ListPopupWindow
    public final DropDownListView a(final Context context, final boolean z3) {
        ?? r3 = new DropDownListView(context, z3) { // from class: androidx.appcompat.widget.MenuPopupWindow$MenuDropDownListView

            /* JADX INFO: renamed from: A, reason: collision with root package name */
            public MenuItemHoverListener f12733A;

            /* JADX INFO: renamed from: B, reason: collision with root package name */
            public androidx.appcompat.view.menu.m f12734B;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final int f12735v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final int f12736w;

            {
                super(context, z3);
                if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                    this.f12735v = 21;
                    this.f12736w = 22;
                } else {
                    this.f12735v = 22;
                    this.f12736w = 21;
                }
            }

            @Override // androidx.appcompat.widget.DropDownListView, android.view.View
            public final boolean onHoverEvent(MotionEvent motionEvent) {
                androidx.appcompat.view.menu.j jVar;
                int headersCount;
                int iPointToPosition;
                int i7;
                if (this.f12733A != null) {
                    ListAdapter adapter = getAdapter();
                    if (adapter instanceof HeaderViewListAdapter) {
                        HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                        headersCount = headerViewListAdapter.getHeadersCount();
                        jVar = (androidx.appcompat.view.menu.j) headerViewListAdapter.getWrappedAdapter();
                    } else {
                        jVar = (androidx.appcompat.view.menu.j) adapter;
                        headersCount = 0;
                    }
                    androidx.appcompat.view.menu.m mVarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i7 = iPointToPosition - headersCount) < 0 || i7 >= jVar.getCount()) ? null : jVar.b(i7);
                    androidx.appcompat.view.menu.m mVar = this.f12734B;
                    if (mVar != mVarB) {
                        androidx.appcompat.view.menu.k kVar = jVar.f12429a;
                        if (mVar != null) {
                            this.f12733A.onItemHoverExit(kVar, mVar);
                        }
                        this.f12734B = mVarB;
                        if (mVarB != null) {
                            this.f12733A.onItemHoverEnter(kVar, mVarB);
                        }
                    }
                }
                return super.onHoverEvent(motionEvent);
            }

            @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
            public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
                ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
                if (listMenuItemView != null && i7 == this.f12735v) {
                    if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                        performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                    }
                    return true;
                }
                if (listMenuItemView == null || i7 != this.f12736w) {
                    return super.onKeyDown(i7, keyEvent);
                }
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                (adapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (androidx.appcompat.view.menu.j) adapter).f12429a.close(false);
                return true;
            }

            public void setHoverListener(MenuItemHoverListener menuItemHoverListener) {
                this.f12733A = menuItemHoverListener;
            }

            @Override // androidx.appcompat.widget.DropDownListView, android.widget.AbsListView
            public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
                super.setSelector(drawable);
            }
        };
        r3.setHoverListener(this);
        return r3;
    }

    @Override // androidx.appcompat.widget.MenuItemHoverListener
    public final void onItemHoverEnter(androidx.appcompat.view.menu.k kVar, MenuItem menuItem) {
        C0525w c0525w = this.f13031s0;
        if (c0525w != null) {
            c0525w.onItemHoverEnter(kVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.MenuItemHoverListener
    public final void onItemHoverExit(androidx.appcompat.view.menu.k kVar, MenuItem menuItem) {
        C0525w c0525w = this.f13031s0;
        if (c0525w != null) {
            c0525w.onItemHoverExit(kVar, menuItem);
        }
    }
}
