package com.google.android.material.internal;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.w;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public class NavigationSubMenu extends w {
    public NavigationSubMenu(Context context, NavigationMenu navigationMenu, m mVar) {
        super(context, navigationMenu, mVar);
    }

    @Override // androidx.appcompat.view.menu.k
    public void onItemsChanged(boolean z3) {
        super.onItemsChanged(z3);
        ((k) getParentMenu()).onItemsChanged(z3);
    }
}
