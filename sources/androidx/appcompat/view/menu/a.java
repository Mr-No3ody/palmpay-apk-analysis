package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.AbstractC1051c;

/* JADX INFO: loaded from: classes.dex */
public final class a implements SupportMenuItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f12361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f12362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Intent f12363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f12364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public char f12366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f12368h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f12369i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f12370j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f12371k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f12372l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f12373m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f12374n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f12375o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12376p;

    public final void a() {
        Drawable drawable = this.f12368h;
        if (drawable != null) {
            if (this.f12374n || this.f12375o) {
                this.f12368h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f12368h = drawableMutate;
                if (this.f12374n) {
                    drawableMutate.setTintList(this.f12372l);
                }
                if (this.f12375o) {
                    this.f12368h.setTintMode(this.f12373m);
                }
            }
        }
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f12367g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f12366f;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f12370j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f12368h;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f12372l;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f12373m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f12363c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f12365e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f12364d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public final AbstractC1051c getSupportActionProvider() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f12361a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f12362b;
        return charSequence != null ? charSequence : this.f12361a;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f12371k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f12376p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f12376p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f12376p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f12376p & 8) == 0;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public final boolean requiresActionButton() {
        return true;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public final boolean requiresOverflow() {
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c6) {
        this.f12366f = Character.toLowerCase(c6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z3) {
        this.f12376p = (z3 ? 1 : 0) | (this.f12376p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z3) {
        this.f12376p = (z3 ? 2 : 0) | (this.f12376p & (-3));
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f12370j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z3) {
        this.f12376p = (z3 ? 16 : 0) | (this.f12376p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f12368h = drawable;
        a();
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f12372l = colorStateList;
        this.f12374n = true;
        a();
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f12373m = mode;
        this.f12375o = true;
        a();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f12363c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c6) {
        this.f12364d = c6;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c6, char c10) {
        this.f12364d = c6;
        this.f12366f = Character.toLowerCase(c10);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final void setShowAsAction(int i7) {
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i7) {
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public final SupportMenuItem setSupportActionProvider(AbstractC1051c abstractC1051c) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f12361a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f12362b = charSequence;
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f12371k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z3) {
        this.f12376p = (this.f12376p & 8) | (z3 ? 0 : 8);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setActionView(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c6, int i7) {
        this.f12366f = Character.toLowerCase(c6);
        this.f12367g = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final SupportMenuItem setContentDescription(CharSequence charSequence) {
        this.f12370j = charSequence;
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c6, int i7) {
        this.f12364d = c6;
        this.f12365e = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i7) {
        this.f12361a = this.f12369i.getResources().getString(i7);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final SupportMenuItem setTooltipText(CharSequence charSequence) {
        this.f12371k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i7) {
        this.f12368h = this.f12369i.getDrawable(i7);
        a();
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setShortcut(char c6, char c10, int i7, int i10) {
        this.f12364d = c6;
        this.f12365e = KeyEvent.normalizeMetaState(i7);
        this.f12366f = Character.toLowerCase(c10);
        this.f12367g = KeyEvent.normalizeMetaState(i10);
        return this;
    }
}
