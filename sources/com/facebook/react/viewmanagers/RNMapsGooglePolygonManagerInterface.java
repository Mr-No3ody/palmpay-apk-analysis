package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes.dex */
public interface RNMapsGooglePolygonManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setCoordinates(T t, @Nullable ReadableArray readableArray);

    void setFillColor(T t, @Nullable Integer num);

    void setGeodesic(T t, boolean z3);

    void setHoles(T t, @Nullable ReadableArray readableArray);

    void setStrokeColor(T t, @Nullable Integer num);

    void setStrokeWidth(T t, float f10);

    void setTappable(T t, boolean z3);
}
