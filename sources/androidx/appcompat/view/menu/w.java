package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class w extends k implements SubMenu {
    private m mItem;
    private k mParentMenu;

    public w(Context context, k kVar, m mVar) {
        super(context);
        this.mParentMenu = kVar;
        this.mItem = mVar;
    }

    @Override // androidx.appcompat.view.menu.k
    public boolean collapseItemActionView(m mVar) {
        return this.mParentMenu.collapseItemActionView(mVar);
    }

    @Override // androidx.appcompat.view.menu.k
    public boolean dispatchMenuItemSelected(@NonNull k kVar, @NonNull MenuItem menuItem) {
        return super.dispatchMenuItemSelected(kVar, menuItem) || this.mParentMenu.dispatchMenuItemSelected(kVar, menuItem);
    }

    @Override // androidx.appcompat.view.menu.k
    public boolean expandItemActionView(m mVar) {
        return this.mParentMenu.expandItemActionView(mVar);
    }

    @Override // androidx.appcompat.view.menu.k
    public String getActionViewStatesKey() {
        m mVar = this.mItem;
        int i7 = mVar != null ? mVar.f12442a : 0;
        if (i7 == 0) {
            return null;
        }
        return super.getActionViewStatesKey() + ":" + i7;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.mItem;
    }

    public Menu getParentMenu() {
        return this.mParentMenu;
    }

    @Override // androidx.appcompat.view.menu.k
    public k getRootMenu() {
        return this.mParentMenu.getRootMenu();
    }

    @Override // androidx.appcompat.view.menu.k
    public boolean isGroupDividerEnabled() {
        return this.mParentMenu.isGroupDividerEnabled();
    }

    @Override // androidx.appcompat.view.menu.k
    public boolean isQwertyMode() {
        return this.mParentMenu.isQwertyMode();
    }

    @Override // androidx.appcompat.view.menu.k
    public boolean isShortcutsVisible() {
        return this.mParentMenu.isShortcutsVisible();
    }

    @Override // androidx.appcompat.view.menu.k
    public void setCallback(MenuBuilder$Callback menuBuilder$Callback) {
        this.mParentMenu.setCallback(menuBuilder$Callback);
    }

    @Override // androidx.appcompat.view.menu.k, androidx.core.internal.view.SupportMenu, android.view.Menu
    public void setGroupDividerEnabled(boolean z3) {
        this.mParentMenu.setGroupDividerEnabled(z3);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.setHeaderIconInt(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.setHeaderTitleInt(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.setHeaderViewInt(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.mItem.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.k, android.view.Menu
    public void setQwertyMode(boolean z3) {
        this.mParentMenu.setQwertyMode(z3);
    }

    @Override // androidx.appcompat.view.menu.k
    public void setShortcutsVisible(boolean z3) {
        this.mParentMenu.setShortcutsVisible(z3);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i7) {
        return (SubMenu) super.setHeaderIconInt(i7);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i7) {
        return (SubMenu) super.setHeaderTitleInt(i7);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i7) {
        this.mItem.setIcon(i7);
        return this;
    }
}
