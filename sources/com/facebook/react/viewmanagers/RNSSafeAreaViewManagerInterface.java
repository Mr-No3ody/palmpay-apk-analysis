package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes.dex */
public interface RNSSafeAreaViewManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setEdges(T t, @Nullable ReadableMap readableMap);

    void setInsetType(T t, @Nullable String str);
}
