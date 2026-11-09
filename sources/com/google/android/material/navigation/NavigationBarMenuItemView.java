package com.google.android.material.navigation;

import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuView;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public interface NavigationBarMenuItemView extends MenuView.ItemView {
    boolean isExpanded();

    boolean isOnlyVisibleWhenExpanded();

    void setExpanded(boolean z3);

    void setOnlyShowWhenExpanded(boolean z3);
}
