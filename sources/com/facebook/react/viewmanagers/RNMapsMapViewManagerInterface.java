package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes.dex */
public interface RNMapsMapViewManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void animateCamera(T t, String str, int i7);

    void animateToRegion(T t, String str, int i7);

    void fitToCoordinates(T t, String str, String str2, boolean z3);

    void fitToElements(T t, String str, boolean z3);

    void fitToSuppliedMarkers(T t, String str, String str2, boolean z3);

    void setCacheEnabled(T t, boolean z3);

    void setCamera(T t, @Nullable ReadableMap readableMap);

    void setCamera(T t, String str);

    void setCameraZoomRange(T t, @Nullable ReadableMap readableMap);

    void setCompassOffset(T t, @Nullable ReadableMap readableMap);

    void setCustomMapStyleString(T t, @Nullable String str);

    void setFollowsUserLocation(T t, boolean z3);

    void setGoogleMapId(T t, @Nullable String str);

    void setGoogleRenderer(T t, @Nullable String str);

    void setHandlePanDrag(T t, boolean z3);

    void setIndoorActiveLevelIndex(T t, int i7);

    void setInitialCamera(T t, @Nullable ReadableMap readableMap);

    void setInitialRegion(T t, @Nullable ReadableMap readableMap);

    void setKmlSrc(T t, @Nullable String str);

    void setLegalLabelInsets(T t, @Nullable ReadableMap readableMap);

    void setLiteMode(T t, boolean z3);

    void setLoadingBackgroundColor(T t, @Nullable Integer num);

    void setLoadingEnabled(T t, boolean z3);

    void setLoadingIndicatorColor(T t, @Nullable Integer num);

    void setMapPadding(T t, @Nullable ReadableMap readableMap);

    void setMapType(T t, @Nullable String str);

    void setMaxDelta(T t, double d2);

    void setMaxZoom(T t, float f10);

    void setMinDelta(T t, double d2);

    void setMinZoom(T t, float f10);

    void setMoveOnMarkerPress(T t, boolean z3);

    void setPaddingAdjustmentBehavior(T t, @Nullable String str);

    void setPitchEnabled(T t, boolean z3);

    void setPoiClickEnabled(T t, boolean z3);

    void setPointsOfInterestFilter(T t, @Nullable ReadableArray readableArray);

    void setRegion(T t, @Nullable ReadableMap readableMap);

    void setRotateEnabled(T t, boolean z3);

    void setScrollDuringRotateOrZoomEnabled(T t, boolean z3);

    void setScrollEnabled(T t, boolean z3);

    void setShowsBuildings(T t, boolean z3);

    void setShowsCompass(T t, boolean z3);

    void setShowsIndoorLevelPicker(T t, boolean z3);

    void setShowsIndoors(T t, boolean z3);

    void setShowsMyLocationButton(T t, boolean z3);

    void setShowsPointsOfInterests(T t, boolean z3);

    void setShowsScale(T t, boolean z3);

    void setShowsTraffic(T t, boolean z3);

    void setShowsUserLocation(T t, boolean z3);

    void setTintColor(T t, @Nullable Integer num);

    void setToolbarEnabled(T t, boolean z3);

    void setUserInterfaceStyle(T t, @Nullable String str);

    void setUserLocationAnnotationTitle(T t, @Nullable String str);

    void setUserLocationCalloutEnabled(T t, boolean z3);

    void setUserLocationFastestInterval(T t, int i7);

    void setUserLocationPriority(T t, @Nullable String str);

    void setUserLocationUpdateInterval(T t, int i7);

    void setZoomControlEnabled(T t, boolean z3);

    void setZoomEnabled(T t, boolean z3);

    void setZoomTapEnabled(T t, boolean z3);
}
