package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes.dex */
public interface RNMapsMarkerManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void animateToCoordinates(T t, double d2, double d10, int i7);

    void hideCallout(T t);

    void redraw(T t);

    void redrawCallout(T t);

    void setAnchor(T t, @Nullable ReadableMap readableMap);

    void setCalloutAnchor(T t, @Nullable ReadableMap readableMap);

    void setCalloutOffset(T t, @Nullable ReadableMap readableMap);

    void setCenterOffset(T t, @Nullable ReadableMap readableMap);

    void setCoordinate(T t, @Nullable ReadableMap readableMap);

    void setCoordinates(T t, double d2, double d10);

    void setDescription(T t, @Nullable String str);

    void setDisplayPriority(T t, @Nullable String str);

    void setDraggable(T t, boolean z3);

    void setIdentifier(T t, @Nullable String str);

    void setImage(T t, @Nullable ReadableMap readableMap);

    void setIsPreselected(T t, boolean z3);

    void setOpacity(T t, double d2);

    void setPinColor(T t, @Nullable Integer num);

    void setSubtitleVisibility(T t, @Nullable String str);

    void setTitle(T t, @Nullable String str);

    void setTitleVisibility(T t, @Nullable String str);

    void setTracksViewChanges(T t, boolean z3);

    void setUseLegacyPinView(T t, boolean z3);

    void showCallout(T t);
}
