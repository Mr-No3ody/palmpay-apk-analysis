package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes.dex */
public interface ActivityIndicatorViewManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setAnimating(T t, boolean z3);

    void setColor(T t, @Nullable Integer num);

    void setHidesWhenStopped(T t, boolean z3);

    void setSize(T t, @Nullable String str);
}
