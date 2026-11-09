package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes.dex */
public interface RNMapsPolylineManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setCoordinates(T t, @Nullable ReadableArray readableArray);

    void setGeodesic(T t, boolean z3);

    void setLineCap(T t, @Nullable String str);

    void setLineDashPattern(T t, @Nullable ReadableArray readableArray);

    void setLineJoin(T t, @Nullable String str);

    void setStrokeColor(T t, @Nullable Integer num);

    void setStrokeColors(T t, @Nullable ReadableArray readableArray);

    void setStrokeWidth(T t, float f10);

    void setTappable(T t, boolean z3);
}
