package androidx.appcompat.view.menu;

import V0.V;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.core.internal.view.SupportMenu;
import androidx.core.internal.view.SupportMenuItem;

/* JADX INFO: loaded from: classes.dex */
public class u extends V implements Menu {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SupportMenu f12489d;

    public u(Context context, SupportMenu supportMenu) {
        super(context);
        if (supportMenu == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f12489d = supportMenu;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return c(this.f12489d.add(charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i7, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f12489d.addIntentOptions(i7, i10, i11, componentName, intentArr, intent, i12, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i13 = 0; i13 < length; i13++) {
                menuItemArr[i13] = c(menuItemArr2[i13]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f12489d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public final void clear() {
        M.n nVar = (M.n) this.f9906b;
        if (nVar != null) {
            nVar.clear();
        }
        M.n nVar2 = (M.n) this.f9907c;
        if (nVar2 != null) {
            nVar2.clear();
        }
        this.f12489d.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f12489d.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i7) {
        return c(this.f12489d.findItem(i7));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i7) {
        return c(this.f12489d.getItem(i7));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f12489d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        return this.f12489d.isShortcutKey(i7, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i7, int i10) {
        return this.f12489d.performIdentifierAction(i7, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i7, KeyEvent keyEvent, int i10) {
        return this.f12489d.performShortcut(i7, keyEvent, i10);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i7) {
        if (((M.n) this.f9906b) != null) {
            int i10 = 0;
            while (true) {
                M.n nVar = (M.n) this.f9906b;
                if (i10 >= nVar.f5695c) {
                    break;
                }
                if (((SupportMenuItem) nVar.f(i10)).getGroupId() == i7) {
                    ((M.n) this.f9906b).h(i10);
                    i10--;
                }
                i10++;
            }
        }
        this.f12489d.removeGroup(i7);
    }

    @Override // android.view.Menu
    public final void removeItem(int i7) {
        if (((M.n) this.f9906b) != null) {
            int i10 = 0;
            while (true) {
                M.n nVar = (M.n) this.f9906b;
                if (i10 >= nVar.f5695c) {
                    break;
                }
                if (((SupportMenuItem) nVar.f(i10)).getItemId() == i7) {
                    ((M.n) this.f9906b).h(i10);
                    break;
                }
                i10++;
            }
        }
        this.f12489d.removeItem(i7);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i7, boolean z3, boolean z8) {
        this.f12489d.setGroupCheckable(i7, z3, z8);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i7, boolean z3) {
        this.f12489d.setGroupEnabled(i7, z3);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i7, boolean z3) {
        this.f12489d.setGroupVisible(i7, z3);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z3) {
        this.f12489d.setQwertyMode(z3);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f12489d.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7) {
        return c(this.f12489d.add(i7));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7) {
        return d(this.f12489d.addSubMenu(i7));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i10, int i11, CharSequence charSequence) {
        return c(this.f12489d.add(i7, i10, i11, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i10, int i11, CharSequence charSequence) {
        return d(this.f12489d.addSubMenu(i7, i10, i11, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i10, int i11, int i12) {
        return c(this.f12489d.add(i7, i10, i11, i12));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i10, int i11, int i12) {
        return d(this.f12489d.addSubMenu(i7, i10, i11, i12));
    }
}
