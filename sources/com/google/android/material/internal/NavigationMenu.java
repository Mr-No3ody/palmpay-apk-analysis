package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public class NavigationMenu extends k {
    public NavigationMenu(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.k, android.view.Menu
    @NonNull
    public SubMenu addSubMenu(int i7, int i10, int i11, CharSequence charSequence) {
        m mVar = (m) addInternal(i7, i10, i11, charSequence);
        NavigationSubMenu navigationSubMenu = new NavigationSubMenu(getContext(), this, mVar);
        mVar.f12456o = navigationSubMenu;
        navigationSubMenu.setHeaderTitle(mVar.f12446e);
        return navigationSubMenu;
    }
}
