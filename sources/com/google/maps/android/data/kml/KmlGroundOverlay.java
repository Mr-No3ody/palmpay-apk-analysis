package com.google.maps.android.data.kml;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class KmlGroundOverlay {
    private final GroundOverlayOptions mGroundOverlayOptions;
    private String mImageUrl;
    private LatLngBounds mLatLngBox;
    private final Map<String, String> mProperties;

    public KmlGroundOverlay(String str, LatLngBounds latLngBounds, float f10, int i7, HashMap<String, String> map, float f11) {
        GroundOverlayOptions groundOverlayOptions = new GroundOverlayOptions();
        this.mGroundOverlayOptions = groundOverlayOptions;
        this.mImageUrl = str;
        this.mProperties = map;
        if (latLngBounds == null) {
            throw new IllegalArgumentException("No LatLonBox given");
        }
        this.mLatLngBox = latLngBounds;
        groundOverlayOptions.positionFromBounds(latLngBounds);
        groundOverlayOptions.bearing(f11);
        groundOverlayOptions.zIndex(f10);
        groundOverlayOptions.visible(i7 != 0);
    }

    public GroundOverlayOptions getGroundOverlayOptions() {
        return this.mGroundOverlayOptions;
    }

    public String getImageUrl() {
        return this.mImageUrl;
    }

    public LatLngBounds getLatLngBox() {
        return this.mLatLngBox;
    }

    public Iterable<String> getProperties() {
        return this.mProperties.keySet();
    }

    public String getProperty(String str) {
        return this.mProperties.get(str);
    }

    public boolean hasProperty(String str) {
        return this.mProperties.get(str) != null;
    }

    @NonNull
    public String toString() {
        return "GroundOverlay{\n properties=" + this.mProperties + ",\n image url=" + this.mImageUrl + ",\n LatLngBox=" + this.mLatLngBox + "\n}\n";
    }
}
