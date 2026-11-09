package androidx.appcompat.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.i1;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class S extends AbstractC0824b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1 f12164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D f12165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q f12166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f12170g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RunnableC0842u f12171h = new RunnableC0842u(this, 2);

    public S(Toolbar toolbar, CharSequence charSequence, D d2) {
        O o10 = new O(this);
        i1 i1Var = new i1(toolbar, false);
        this.f12164a = i1Var;
        d2.getClass();
        this.f12165b = d2;
        i1Var.f12932m = d2;
        toolbar.setOnMenuItemClickListener(o10);
        i1Var.setWindowTitle(charSequence);
        this.f12166c = new Q(this);
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final boolean a() {
        return this.f12164a.f12920a.hideOverflowMenu();
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final boolean b() {
        i1 i1Var = this.f12164a;
        if (!i1Var.f12920a.hasExpandedActionView()) {
            return false;
        }
        i1Var.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final void c(boolean z3) {
        if (z3 == this.f12169f) {
            return;
        }
        this.f12169f = z3;
        ArrayList arrayList = this.f12170g;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((ActionBar$OnMenuVisibilityListener) arrayList.get(i7)).onMenuVisibilityChanged(z3);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final View d() {
        return this.f12164a.f12924e;
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final int e() {
        return this.f12164a.f12921b;
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final Context f() {
        return this.f12164a.f12920a.getContext();
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final CharSequence g() {
        return this.f12164a.f12920a.getTitle();
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final void h() {
        this.f12164a.setVisibility(8);
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final boolean i() {
        i1 i1Var = this.f12164a;
        Toolbar toolbar = i1Var.f12920a;
        RunnableC0842u runnableC0842u = this.f12171h;
        toolbar.removeCallbacks(runnableC0842u);
        Toolbar toolbar2 = i1Var.f12920a;
        WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
        toolbar2.postOnAnimation(runnableC0842u);
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final void k() {
        this.f12164a.f12920a.removeCallbacks(this.f12171h);
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final boolean l(int i7, KeyEvent keyEvent) {
        Menu menuX = x();
        if (menuX == null) {
            return false;
        }
        menuX.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuX.performShortcut(i7, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final boolean m(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            n();
        }
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final boolean n() {
        return this.f12164a.f12920a.showOverflowMenu();
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final void o(boolean z3) {
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final void p(boolean z3) {
        int i7 = z3 ? 4 : 0;
        i1 i1Var = this.f12164a;
        i1Var.setDisplayOptions((i7 & 4) | (i1Var.f12921b & (-5)));
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final void q() {
        i1 i1Var = this.f12164a;
        i1Var.setDisplayOptions(i1Var.f12921b & (-9));
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final void r(int i7) {
        this.f12164a.setNavigationContentDescription(i7);
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final void s(Drawable drawable) {
        this.f12164a.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final void t(boolean z3) {
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final void u(CharSequence charSequence) {
        this.f12164a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final void v(CharSequence charSequence) {
        this.f12164a.setWindowTitle(charSequence);
    }

    public final Menu x() {
        boolean z3 = this.f12168e;
        i1 i1Var = this.f12164a;
        if (!z3) {
            i1Var.setMenuCallbacks(new P(this), new Q(this));
            this.f12168e = true;
        }
        return i1Var.f12920a.getMenu();
    }

    @Override // androidx.appcompat.app.AbstractC0824b
    public final void j() {
    }
}
