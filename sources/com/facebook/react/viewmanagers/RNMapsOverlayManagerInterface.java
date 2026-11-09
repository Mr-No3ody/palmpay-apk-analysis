package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes.dex */
public interface RNMapsOverlayManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setBearing(T t, float f10);

    void setBounds(T t, @Nullable ReadableMap readableMap);

    void setImage(T t, @Nullable ReadableMap readableMap);

    void setOpacity(T t, float f10);

    void setTappable(T t, boolean z3);
}
