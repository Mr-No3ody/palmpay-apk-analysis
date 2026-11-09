package p343x;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import androidx.appcompat.view.menu.u;

/* JADX INFO: loaded from: classes.dex */
public final class c extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f43506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f43507b;

    public c(Context context, a aVar) {
        this.f43506a = context;
        this.f43507b = aVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f43507b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f43507b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new u(this.f43506a, this.f43507b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f43507b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f43507b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f43507b.f43498a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f43507b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f43507b.f43499b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f43507b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f43507b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f43507b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f43507b.k(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f43507b.f43498a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f43507b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z3) {
        this.f43507b.n(z3);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i7) {
        this.f43507b.j(i7);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i7) {
        this.f43507b.l(i7);
    }
}
