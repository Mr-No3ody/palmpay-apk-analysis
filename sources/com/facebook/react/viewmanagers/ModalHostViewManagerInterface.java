package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes.dex */
public interface ModalHostViewManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setAllowSwipeDismissal(T t, boolean z3);

    void setAnimated(T t, boolean z3);

    void setAnimationType(T t, @Nullable String str);

    void setHardwareAccelerated(T t, boolean z3);

    void setIdentifier(T t, int i7);

    void setNavigationBarTranslucent(T t, boolean z3);

    void setPresentationStyle(T t, @Nullable String str);

    void setStatusBarTranslucent(T t, boolean z3);

    void setSupportedOrientations(T t, @Nullable ReadableArray readableArray);

    void setTransparent(T t, boolean z3);

    void setVisible(T t, boolean z3);
}
