package com.google.android.material.navigation;

import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.k;
import androidx.camera.video.u;
import java.util.ArrayList;
import java.util.List;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public class NavigationBarMenuBuilder {
    private final k menuBuilder;
    private int contentItemCount = 0;
    private int visibleContentItemCount = 0;
    private int visibleMainItemCount = 0;
    private final List<MenuItem> items = new ArrayList();

    public NavigationBarMenuBuilder(k kVar) {
        this.menuBuilder = kVar;
        refreshItems();
    }

    public int getContentItemCount() {
        return this.contentItemCount;
    }

    @NonNull
    public MenuItem getItemAt(int i7) {
        return this.items.get(i7);
    }

    public int getVisibleContentItemCount() {
        return this.visibleContentItemCount;
    }

    public int getVisibleMainContentItemCount() {
        return this.visibleMainItemCount;
    }

    public boolean performItemAction(@NonNull MenuItem menuItem, @NonNull MenuPresenter menuPresenter, int i7) {
        return this.menuBuilder.performItemAction(menuItem, menuPresenter, i7);
    }

    public void refreshItems() {
        this.items.clear();
        this.contentItemCount = 0;
        this.visibleContentItemCount = 0;
        this.visibleMainItemCount = 0;
        for (int i7 = 0; i7 < this.menuBuilder.size(); i7++) {
            MenuItem item = this.menuBuilder.getItem(i7);
            if (item.hasSubMenu()) {
                if (!this.items.isEmpty() && !(u.e(1, this.items) instanceof DividerMenuItem) && item.isVisible()) {
                    this.items.add(new DividerMenuItem());
                }
                this.items.add(item);
                SubMenu subMenu = item.getSubMenu();
                for (int i10 = 0; i10 < subMenu.size(); i10++) {
                    MenuItem item2 = subMenu.getItem(i10);
                    if (!item.isVisible()) {
                        item2.setVisible(false);
                    }
                    this.items.add(item2);
                    this.contentItemCount++;
                    if (item2.isVisible()) {
                        this.visibleContentItemCount++;
                    }
                }
                this.items.add(new DividerMenuItem());
            } else {
                this.items.add(item);
                this.contentItemCount++;
                if (item.isVisible()) {
                    this.visibleContentItemCount++;
                    this.visibleMainItemCount++;
                }
            }
        }
        if (this.items.isEmpty() || !(u.e(1, this.items) instanceof DividerMenuItem)) {
            return;
        }
        List<MenuItem> list = this.items;
        list.remove(list.size() - 1);
    }

    public int size() {
        return this.items.size();
    }
}
