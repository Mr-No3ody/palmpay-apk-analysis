package p343x;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.ActionMode$Callback;
import androidx.appcompat.view.menu.MenuBuilder$Callback;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p279s5.d;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a implements MenuBuilder$Callback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f43500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarContextView f43501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f43502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference f43503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f43504g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k f43505i;

    @Override // p343x.a
    public final void a() {
        if (this.f43504g) {
            return;
        }
        this.f43504g = true;
        this.f43502e.onDestroyActionMode(this);
    }

    @Override // p343x.a
    public final View b() {
        WeakReference weakReference = this.f43503f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p343x.a
    public final k c() {
        return this.f43505i;
    }

    @Override // p343x.a
    public final MenuInflater d() {
        return new f(this.f43501d.getContext());
    }

    @Override // p343x.a
    public final CharSequence e() {
        return this.f43501d.getSubtitle();
    }

    @Override // p343x.a
    public final CharSequence f() {
        return this.f43501d.getTitle();
    }

    @Override // p343x.a
    public final void g() {
        this.f43502e.onPrepareActionMode(this, this.f43505i);
    }

    @Override // p343x.a
    public final boolean h() {
        return this.f43501d.f12534L;
    }

    @Override // p343x.a
    public final void i(View view) {
        this.f43501d.setCustomView(view);
        this.f43503f = view != null ? new WeakReference(view) : null;
    }

    @Override // p343x.a
    public final void j(int i7) {
        k(this.f43500c.getString(i7));
    }

    @Override // p343x.a
    public final void k(CharSequence charSequence) {
        this.f43501d.setSubtitle(charSequence);
    }

    @Override // p343x.a
    public final void l(int i7) {
        m(this.f43500c.getString(i7));
    }

    @Override // p343x.a
    public final void m(CharSequence charSequence) {
        this.f43501d.setTitle(charSequence);
    }

    @Override // p343x.a
    public final void n(boolean z3) {
        this.f43499b = z3;
        this.f43501d.setTitleOptional(z3);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder$Callback
    public final boolean onMenuItemSelected(k kVar, MenuItem menuItem) {
        return ((ActionMode$Callback) this.f43502e.f42025b).onActionItemClicked(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder$Callback
    public final void onMenuModeChange(k kVar) {
        g();
        this.f43501d.i();
    }
}
