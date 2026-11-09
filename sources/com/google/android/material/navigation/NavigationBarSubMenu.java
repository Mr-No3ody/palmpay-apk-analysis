package com.google.android.material.navigation;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.w;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public class NavigationBarSubMenu extends w {
    public NavigationBarSubMenu(@NonNull Context context, @NonNull NavigationBarMenu navigationBarMenu, @NonNull m mVar) {
        super(context, navigationBarMenu, mVar);
    }

    @Override // androidx.appcompat.view.menu.k
    public void onItemsChanged(boolean z3) {
        super.onItemsChanged(z3);
        ((k) getParentMenu()).onItemsChanged(z3);
    }
}
