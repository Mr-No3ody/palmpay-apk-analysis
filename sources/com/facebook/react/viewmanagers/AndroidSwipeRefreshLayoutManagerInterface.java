package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes.dex */
public interface AndroidSwipeRefreshLayoutManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setColors(T t, @Nullable ReadableArray readableArray);

    void setEnabled(T t, boolean z3);

    void setNativeRefreshing(T t, boolean z3);

    void setProgressBackgroundColor(T t, @Nullable Integer num);

    void setProgressViewOffset(T t, float f10);

    void setRefreshing(T t, boolean z3);

    void setSize(T t, @Nullable String str);
}
