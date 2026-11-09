package androidx.appcompat.view.menu;

import Ce.ViewOnAttachStateChangeListenerC0160b;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.C0894y0;
import androidx.appcompat.widget.DropDownListView;

/* JADX INFO: loaded from: classes.dex */
public final class v extends r implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final int f12490Q = p241q.g.abc_popup_menu_item_layout;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ViewTreeObserver f12491A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f12492B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f12493C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f12494H;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f12496M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f12497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f12498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f12499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f12500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f12502g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0894y0 f12503i;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public s f12506p;
    public View t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View f12507v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public MenuPresenter.Callback f12508w;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Be.c f12504j = new Be.c(this, 9);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0160b f12505o = new ViewOnAttachStateChangeListenerC0160b(this, 6);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f12495L = 0;

    public v(int i7, Context context, View view, k kVar, boolean z3) {
        this.f12497b = context;
        this.f12498c = kVar;
        this.f12500e = z3;
        this.f12499d = new j(kVar, LayoutInflater.from(context), z3, f12490Q);
        this.f12502g = i7;
        Resources resources = context.getResources();
        this.f12501f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(p241q.d.abc_config_prefDialogWidth));
        this.t = view;
        this.f12503i = new C0894y0(context, null, i7, 0);
        kVar.addMenuPresenter(this, context);
    }

    @Override // androidx.appcompat.view.menu.r
    public final void a(k kVar) {
    }

    @Override // androidx.appcompat.view.menu.r
    public final void c(View view) {
        this.t = view;
    }

    @Override // androidx.appcompat.view.menu.r
    public final void d(boolean z3) {
        this.f12499d.f12431c = z3;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void dismiss() {
        if (isShowing()) {
            this.f12503i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.r
    public final void e(int i7) {
        this.f12495L = i7;
    }

    @Override // androidx.appcompat.view.menu.r
    public final void f(int i7) {
        this.f12503i.f12717f = i7;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.r
    public final void g(PopupWindow.OnDismissListener onDismissListener) {
        this.f12506p = (s) onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final ListView getListView() {
        return this.f12503i.f12714c;
    }

    @Override // androidx.appcompat.view.menu.r
    public final void h(boolean z3) {
        this.f12496M = z3;
    }

    @Override // androidx.appcompat.view.menu.r
    public final void i(int i7) {
        this.f12503i.setVerticalOffset(i7);
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final boolean isShowing() {
        return !this.f12492B && this.f12503i.f12724p0.isShowing();
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onCloseMenu(k kVar, boolean z3) {
        if (kVar != this.f12498c) {
            return;
        }
        dismiss();
        MenuPresenter.Callback callback = this.f12508w;
        if (callback != null) {
            callback.onCloseMenu(kVar, z3);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f12492B = true;
        this.f12498c.close();
        ViewTreeObserver viewTreeObserver = this.f12491A;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f12491A = this.f12507v.getViewTreeObserver();
            }
            this.f12491A.removeGlobalOnLayoutListener(this.f12504j);
            this.f12491A = null;
        }
        this.f12507v.removeOnAttachStateChangeListener(this.f12505o);
        s sVar = this.f12506p;
        if (sVar != null) {
            sVar.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i7 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean onSubMenuSelected(w wVar) {
        boolean z3;
        if (wVar.hasVisibleItems()) {
            t tVar = new t(this.f12502g, this.f12497b, this.f12507v, wVar, this.f12500e);
            tVar.setPresenterCallback(this.f12508w);
            int size = wVar.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    z3 = false;
                    break;
                }
                MenuItem item = wVar.getItem(i7);
                if (item.isVisible() && item.getIcon() != null) {
                    z3 = true;
                    break;
                }
                i7++;
            }
            tVar.f12484g = z3;
            r rVar = tVar.f12486i;
            if (rVar != null) {
                rVar.d(z3);
            }
            tVar.f12487j = this.f12506p;
            this.f12506p = null;
            this.f12498c.close(false);
            C0894y0 c0894y0 = this.f12503i;
            int width = c0894y0.f12717f;
            int verticalOffset = c0894y0.getVerticalOffset();
            if ((Gravity.getAbsoluteGravity(this.f12495L, this.t.getLayoutDirection()) & 7) == 5) {
                width += this.t.getWidth();
            }
            if (!tVar.b()) {
                if (tVar.f12482e != null) {
                    tVar.d(width, verticalOffset, true, true);
                }
            }
            MenuPresenter.Callback callback = this.f12508w;
            if (callback != null) {
                callback.onOpenSubMenu(wVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void setCallback(MenuPresenter.Callback callback) {
        this.f12508w = callback;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void show() {
        View view;
        if (isShowing()) {
            return;
        }
        if (this.f12492B || (view = this.t) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f12507v = view;
        C0894y0 c0894y0 = this.f12503i;
        c0894y0.f12724p0.setOnDismissListener(this);
        c0894y0.f12703B = this;
        c0894y0.f12721k0 = true;
        c0894y0.f12724p0.setFocusable(true);
        View view2 = this.f12507v;
        boolean z3 = this.f12491A == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f12491A = viewTreeObserver;
        if (z3) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f12504j);
        }
        view2.addOnAttachStateChangeListener(this.f12505o);
        c0894y0.f12702A = view2;
        c0894y0.t = this.f12495L;
        boolean z8 = this.f12493C;
        Context context = this.f12497b;
        j jVar = this.f12499d;
        if (!z8) {
            this.f12494H = r.b(jVar, context, this.f12501f);
            this.f12493C = true;
        }
        c0894y0.b(this.f12494H);
        c0894y0.f12724p0.setInputMethodMode(2);
        Rect rect = this.f12476a;
        c0894y0.f12711Z = rect != null ? new Rect(rect) : null;
        c0894y0.show();
        DropDownListView dropDownListView = c0894y0.f12714c;
        dropDownListView.setOnKeyListener(this);
        if (this.f12496M) {
            k kVar = this.f12498c;
            if (kVar.getHeaderTitle() != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(p241q.g.abc_popup_menu_header_item_layout, (ViewGroup) dropDownListView, false);
                TextView textView = (TextView) frameLayout.findViewById(R.id.title);
                if (textView != null) {
                    textView.setText(kVar.getHeaderTitle());
                }
                frameLayout.setEnabled(false);
                dropDownListView.addHeaderView(frameLayout, null, false);
            }
        }
        c0894y0.setAdapter(jVar);
        c0894y0.show();
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void updateMenuView(boolean z3) {
        this.f12493C = false;
        j jVar = this.f12499d;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }
}
