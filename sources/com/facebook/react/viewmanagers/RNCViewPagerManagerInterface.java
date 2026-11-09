package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes.dex */
public interface RNCViewPagerManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setInitialPage(T t, int i7);

    void setKeyboardDismissMode(T t, @Nullable String str);

    void setLayoutDirection(T t, @Nullable String str);

    void setOffscreenPageLimit(T t, int i7);

    void setOrientation(T t, @Nullable String str);

    void setOverScrollMode(T t, @Nullable String str);

    void setOverdrag(T t, boolean z3);

    void setPage(T t, int i7);

    void setPageMargin(T t, int i7);

    void setPageWithoutAnimation(T t, int i7);

    void setScrollEnabled(T t, boolean z3);

    void setScrollEnabledImperatively(T t, boolean z3);
}
