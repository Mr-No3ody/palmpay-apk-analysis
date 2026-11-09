package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.internal.view.SupportSubMenu;

/* JADX INFO: loaded from: classes.dex */
public final class x extends u implements SubMenu {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SupportSubMenu f12509e;

    public x(Context context, SupportSubMenu supportSubMenu) {
        super(context, supportSubMenu);
        this.f12509e = supportSubMenu;
    }

    @Override // android.view.SubMenu
    public final void clearHeader() {
        this.f12509e.clearHeader();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return c(this.f12509e.getItem());
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i7) {
        this.f12509e.setHeaderIcon(i7);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i7) {
        this.f12509e.setHeaderTitle(i7);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        this.f12509e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i7) {
        this.f12509e.setIcon(i7);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.f12509e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f12509e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f12509e.setIcon(drawable);
        return this;
    }
}
