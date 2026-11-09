package com.daimajia.swipe.interfaces;

import com.daimajia.swipe.SwipeLayout;
import java.util.List;
import p018b2.a;

/* JADX INFO: loaded from: classes.dex */
public interface SwipeItemMangerInterface {
    void closeAllExcept(SwipeLayout swipeLayout);

    void closeAllItems();

    void closeItem(int i7);

    a getMode();

    List<Integer> getOpenItems();

    List<SwipeLayout> getOpenLayouts();

    boolean isOpen(int i7);

    void openItem(int i7);

    void removeShownLayouts(SwipeLayout swipeLayout);

    void setMode(a aVar);
}
