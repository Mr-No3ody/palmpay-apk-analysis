package com.google.maps.android.data;

import N8.q0;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class LineString implements Geometry<List<LatLng>> {
    private static final String GEOMETRY_TYPE = "LineString";
    private final List<LatLng> mCoordinates;

    public LineString(List<LatLng> list) {
        if (list == null) {
            throw new IllegalArgumentException("Coordinates cannot be null");
        }
        this.mCoordinates = list;
    }

    @Override // com.google.maps.android.data.Geometry
    public String getGeometryType() {
        return GEOMETRY_TYPE;
    }

    @NonNull
    public String toString() {
        return q0.o(new StringBuilder("LineString{\n coordinates="), this.mCoordinates, "\n}\n");
    }

    @Override // com.google.maps.android.data.Geometry
    public List<LatLng> getGeometryObject() {
        return this.mCoordinates;
    }
}
