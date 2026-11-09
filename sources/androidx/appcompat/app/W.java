package androidx.appcompat.app;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.ActionMode$Callback;
import androidx.appcompat.view.menu.MenuBuilder$Callback;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class W extends p343x.a implements MenuBuilder$Callback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f12180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.view.menu.k f12181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p279s5.d f12182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference f12183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ X f12184g;

    public W(X x3, Context context, p279s5.d dVar) {
        this.f12184g = x3;
        this.f12180c = context;
        this.f12182e = dVar;
        androidx.appcompat.view.menu.k defaultShowAsAction = new androidx.appcompat.view.menu.k(context).setDefaultShowAsAction(1);
        this.f12181d = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
    }

    @Override // p343x.a
    public final void a() {
        X x3 = this.f12184g;
        if (x3.f12195i != this) {
            return;
        }
        boolean z3 = x3.f12203q;
        boolean z8 = x3.f12204r;
        if (z3 || z8) {
            x3.f12196j = this;
            x3.f12197k = this.f12182e;
        } else {
            this.f12182e.onDestroyActionMode(this);
        }
        this.f12182e = null;
        x3.x(false);
        ActionBarContextView actionBarContextView = x3.f12192f;
        if (actionBarContextView.f12538p == null) {
            actionBarContextView.g();
        }
        x3.f12189c.setHideOnContentScrollEnabled(x3.f12208w);
        x3.f12195i = null;
    }

    @Override // p343x.a
    public final View b() {
        WeakReference weakReference = this.f12183f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p343x.a
    public final androidx.appcompat.view.menu.k c() {
        return this.f12181d;
    }

    @Override // p343x.a
    public final MenuInflater d() {
        return new p343x.f(this.f12180c);
    }

    @Override // p343x.a
    public final CharSequence e() {
        return this.f12184g.f12192f.getSubtitle();
    }

    @Override // p343x.a
    public final CharSequence f() {
        return this.f12184g.f12192f.getTitle();
    }

    @Override // p343x.a
    public final void g() {
        if (this.f12184g.f12195i != this) {
            return;
        }
        androidx.appcompat.view.menu.k kVar = this.f12181d;
        kVar.stopDispatchingItemsChanged();
        try {
            this.f12182e.onPrepareActionMode(this, kVar);
        } finally {
            kVar.startDispatchingItemsChanged();
        }
    }

    @Override // p343x.a
    public final boolean h() {
        return this.f12184g.f12192f.f12534L;
    }

    @Override // p343x.a
    public final void i(View view) {
        this.f12184g.f12192f.setCustomView(view);
        this.f12183f = new WeakReference(view);
    }

    @Override // p343x.a
    public final void j(int i7) {
        k(this.f12184g.f12187a.getResources().getString(i7));
    }

    @Override // p343x.a
    public final void k(CharSequence charSequence) {
        this.f12184g.f12192f.setSubtitle(charSequence);
    }

    @Override // p343x.a
    public final void l(int i7) {
        m(this.f12184g.f12187a.getResources().getString(i7));
    }

    @Override // p343x.a
    public final void m(CharSequence charSequence) {
        this.f12184g.f12192f.setTitle(charSequence);
    }

    @Override // p343x.a
    public final void n(boolean z3) {
        this.f43499b = z3;
        this.f12184g.f12192f.setTitleOptional(z3);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder$Callback
    public final boolean onMenuItemSelected(androidx.appcompat.view.menu.k kVar, MenuItem menuItem) {
        p279s5.d dVar = this.f12182e;
        if (dVar != null) {
            return ((ActionMode$Callback) dVar.f42025b).onActionItemClicked(this, menuItem);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder$Callback
    public final void onMenuModeChange(androidx.appcompat.view.menu.k kVar) {
        if (this.f12182e == null) {
            return;
        }
        g();
        this.f12184g.f12192f.i();
    }
}
