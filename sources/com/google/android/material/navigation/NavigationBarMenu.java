package com.google.android.material.navigation;

import N8.q0;
import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public final class NavigationBarMenu extends k {
    public static final int NO_MAX_ITEM_LIMIT = Integer.MAX_VALUE;
    private final int maxItemCount;
    private final boolean subMenuSupported;

    @NonNull
    private final Class<?> viewClass;

    public NavigationBarMenu(@NonNull Context context, @NonNull Class<?> cls, int i7, boolean z3) {
        super(context);
        this.viewClass = cls;
        this.maxItemCount = i7;
        this.subMenuSupported = z3;
    }

    @Override // androidx.appcompat.view.menu.k
    @NonNull
    public MenuItem addInternal(int i7, int i10, int i11, @NonNull CharSequence charSequence) {
        if (size() + 1 <= this.maxItemCount) {
            stopDispatchingItemsChanged();
            MenuItem menuItemAddInternal = super.addInternal(i7, i10, i11, charSequence);
            startDispatchingItemsChanged();
            return menuItemAddInternal;
        }
        String simpleName = this.viewClass.getSimpleName();
        StringBuilder sbQ = q0.q("Maximum number of items supported by ", simpleName, " is ");
        sbQ.append(this.maxItemCount);
        sbQ.append(". Limit can be checked with ");
        sbQ.append(simpleName);
        sbQ.append("#getMaxItemCount()");
        throw new IllegalArgumentException(sbQ.toString());
    }

    @Override // androidx.appcompat.view.menu.k, android.view.Menu
    @NonNull
    public SubMenu addSubMenu(int i7, int i10, int i11, @NonNull CharSequence charSequence) {
        if (!this.subMenuSupported) {
            throw new UnsupportedOperationException(this.viewClass.getSimpleName().concat(" does not support submenus"));
        }
        m mVar = (m) addInternal(i7, i10, i11, charSequence);
        NavigationBarSubMenu navigationBarSubMenu = new NavigationBarSubMenu(getContext(), this, mVar);
        mVar.f12456o = navigationBarSubMenu;
        navigationBarSubMenu.setHeaderTitle(mVar.f12446e);
        return navigationBarSubMenu;
    }

    public int getMaxItemCount() {
        return this.maxItemCount;
    }
}
