package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes.dex */
public interface RNMapsCircleManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setCenter(T t, @Nullable ReadableMap readableMap);

    void setFillColor(T t, @Nullable Integer num);

    void setRadius(T t, double d2);

    void setStrokeColor(T t, @Nullable Integer num);

    void setStrokeWidth(T t, float f10);

    void setTappable(T t, boolean z3);
}
