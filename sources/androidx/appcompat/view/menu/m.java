package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.AbstractC1051c;

/* JADX INFO: loaded from: classes.dex */
public final class m implements SupportMenuItem {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public AbstractC1051c f12438A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f12439B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f12441D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f12446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f12447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f12448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f12449h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char f12451j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f12453l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k f12455n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public w f12456o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f12457p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f12458q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f12459r;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12465y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f12466z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12450i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12452k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12454m = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f12460s = null;
    public PorterDuff.Mode t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f12461u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12462v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f12463w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12464x = 16;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f12440C = false;

    public m(k kVar, int i7, int i10, int i11, int i12, CharSequence charSequence, int i13) {
        this.f12455n = kVar;
        this.f12442a = i10;
        this.f12443b = i7;
        this.f12444c = i11;
        this.f12445d = i12;
        this.f12446e = charSequence;
        this.f12465y = i13;
    }

    public static void a(StringBuilder sb2, String str, int i7, int i10) {
        if ((i7 & i10) == i10) {
            sb2.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f12463w && (this.f12461u || this.f12462v)) {
            drawable = drawable.mutate();
            if (this.f12461u) {
                drawable.setTintList(this.f12460s);
            }
            if (this.f12462v) {
                drawable.setTintMode(this.t);
            }
            this.f12463w = false;
        }
        return drawable;
    }

    public final boolean c() {
        AbstractC1051c abstractC1051c;
        if ((this.f12465y & 8) != 0) {
            if (this.f12466z == null && (abstractC1051c = this.f12438A) != null) {
                this.f12466z = ((n) abstractC1051c).f12468c.onCreateActionView(this);
            }
            if (this.f12466z != null) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f12465y & 8) == 0) {
            return false;
        }
        if (this.f12466z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f12439B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f12455n.collapseItemActionView(this);
        }
        return false;
    }

    public final void d(boolean z3) {
        this.f12464x = (z3 ? 4 : 0) | (this.f12464x & (-5));
    }

    public final void e(boolean z3) {
        if (z3) {
            this.f12464x |= 32;
        } else {
            this.f12464x &= -33;
        }
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final boolean expandActionView() {
        if (!c()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f12439B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f12455n.expandItemActionView(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final View getActionView() {
        View view = this.f12466z;
        if (view != null) {
            return view;
        }
        AbstractC1051c abstractC1051c = this.f12438A;
        if (abstractC1051c == null) {
            return null;
        }
        View viewOnCreateActionView = ((n) abstractC1051c).f12468c.onCreateActionView(this);
        this.f12466z = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f12452k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f12451j;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f12458q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f12443b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f12453l;
        if (drawable != null) {
            return b(drawable);
        }
        if (this.f12454m == 0) {
            return null;
        }
        Drawable drawableQ = p264r5.a.q(this.f12454m, this.f12455n.getContext());
        this.f12454m = 0;
        this.f12453l = drawableQ;
        return b(drawableQ);
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f12460s;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f12448g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f12442a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f12441D;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f12450i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f12449h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f12444c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f12456o;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public final AbstractC1051c getSupportActionProvider() {
        return this.f12438A;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f12446e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f12447f;
        return charSequence != null ? charSequence : this.f12446e;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f12459r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f12456o != null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f12440C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f12464x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f12464x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f12464x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        AbstractC1051c abstractC1051c = this.f12438A;
        if (abstractC1051c == null || !((n) abstractC1051c).f12468c.overridesItemVisibility()) {
            return (this.f12464x & 8) == 0;
        }
        return (this.f12464x & 8) == 0 && ((n) this.f12438A).f12468c.isVisible();
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public final boolean requiresActionButton() {
        return (this.f12465y & 2) == 2;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public final boolean requiresOverflow() {
        return (requiresActionButton() || (this.f12465y & 1) == 1) ? false : true;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i7;
        this.f12466z = view;
        this.f12438A = null;
        if (view != null && view.getId() == -1 && (i7 = this.f12442a) > 0) {
            view.setId(i7);
        }
        this.f12455n.onItemActionRequestChanged(this);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c6) {
        if (this.f12451j == c6) {
            return this;
        }
        this.f12451j = Character.toLowerCase(c6);
        this.f12455n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z3) {
        int i7 = this.f12464x;
        int i10 = (z3 ? 1 : 0) | (i7 & (-2));
        this.f12464x = i10;
        if (i7 != i10) {
            this.f12455n.onItemsChanged(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z3) {
        int i7 = this.f12464x;
        if ((i7 & 4) != 0) {
            this.f12455n.setExclusiveItemChecked(this);
            return this;
        }
        int i10 = (z3 ? 2 : 0) | (i7 & (-3));
        this.f12464x = i10;
        if (i7 != i10) {
            this.f12455n.onItemsChanged(false);
        }
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z3) {
        if (z3) {
            this.f12464x |= 16;
        } else {
            this.f12464x &= -17;
        }
        this.f12455n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f12454m = 0;
        this.f12453l = drawable;
        this.f12463w = true;
        this.f12455n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f12460s = colorStateList;
        this.f12461u = true;
        this.f12463w = true;
        this.f12455n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.t = mode;
        this.f12462v = true;
        this.f12463w = true;
        this.f12455n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f12448g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c6) {
        if (this.f12449h == c6) {
            return this;
        }
        this.f12449h = c6;
        this.f12455n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f12439B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f12457p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c6, char c10) {
        this.f12449h = c6;
        this.f12451j = Character.toLowerCase(c10);
        this.f12455n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final void setShowAsAction(int i7) {
        int i10 = i7 & 3;
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f12465y = i7;
        this.f12455n.onItemActionRequestChanged(this);
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i7) {
        setShowAsAction(i7);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public final SupportMenuItem setSupportActionProvider(AbstractC1051c abstractC1051c) {
        AbstractC1051c abstractC1051c2 = this.f12438A;
        if (abstractC1051c2 != null) {
            abstractC1051c2.f16203a = null;
        }
        this.f12466z = null;
        this.f12438A = abstractC1051c;
        this.f12455n.onItemsChanged(true);
        AbstractC1051c abstractC1051c3 = this.f12438A;
        if (abstractC1051c3 != null) {
            n nVar = (n) abstractC1051c3;
            nVar.f12467b = new Sd.b(this, 10);
            nVar.f12468c.setVisibilityListener(nVar);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f12446e = charSequence;
        this.f12455n.onItemsChanged(false);
        w wVar = this.f12456o;
        if (wVar != null) {
            wVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f12447f = charSequence;
        this.f12455n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z3) {
        int i7 = this.f12464x;
        int i10 = (z3 ? 0 : 8) | (i7 & (-9));
        this.f12464x = i10;
        if (i7 != i10) {
            this.f12455n.onItemVisibleChanged(this);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f12446e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final SupportMenuItem setContentDescription(CharSequence charSequence) {
        this.f12458q = charSequence;
        this.f12455n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final SupportMenuItem setTooltipText(CharSequence charSequence) {
        this.f12459r = charSequence;
        this.f12455n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c6, int i7) {
        if (this.f12451j == c6 && this.f12452k == i7) {
            return this;
        }
        this.f12451j = Character.toLowerCase(c6);
        this.f12452k = KeyEvent.normalizeMetaState(i7);
        this.f12455n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c6, int i7) {
        if (this.f12449h == c6 && this.f12450i == i7) {
            return this;
        }
        this.f12449h = c6;
        this.f12450i = KeyEvent.normalizeMetaState(i7);
        this.f12455n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setShortcut(char c6, char c10, int i7, int i10) {
        this.f12449h = c6;
        this.f12450i = KeyEvent.normalizeMetaState(i7);
        this.f12451j = Character.toLowerCase(c10);
        this.f12452k = KeyEvent.normalizeMetaState(i10);
        this.f12455n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i7) {
        this.f12453l = null;
        this.f12454m = i7;
        this.f12463w = true;
        this.f12455n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i7) {
        setTitle(this.f12455n.getContext().getString(i7));
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setActionView(int i7) {
        int i10;
        Context context = this.f12455n.getContext();
        View viewInflate = LayoutInflater.from(context).inflate(i7, (ViewGroup) new LinearLayout(context), false);
        this.f12466z = viewInflate;
        this.f12438A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i10 = this.f12442a) > 0) {
            viewInflate.setId(i10);
        }
        this.f12455n.onItemActionRequestChanged(this);
        return this;
    }
}
