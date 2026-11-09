package com.google.maps.android.data.geojson;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.maps.android.collections.GroundOverlayManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.collections.PolygonManager;
import com.google.maps.android.collections.PolylineManager;
import com.google.maps.android.data.Feature;
import com.google.maps.android.data.Layer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class GeoJsonLayer extends Layer {
    private LatLngBounds mBoundingBox;

    public interface GeoJsonOnFeatureClickListener extends Layer.OnFeatureClickListener {
    }

    public GeoJsonLayer(GoogleMap googleMap, JSONObject jSONObject, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("GeoJSON file cannot be null");
        }
        this.mBoundingBox = null;
        GeoJsonParser geoJsonParser = new GeoJsonParser(jSONObject);
        this.mBoundingBox = geoJsonParser.getBoundingBox();
        HashMap map = new HashMap();
        Iterator<GeoJsonFeature> it = geoJsonParser.getFeatures().iterator();
        while (it.hasNext()) {
            map.put(it.next(), null);
        }
        storeRenderer(new GeoJsonRenderer(googleMap, map, markerManager, polygonManager, polylineManager, groundOverlayManager));
    }

    private static JSONObject createJsonFileObject(InputStream inputStream) throws JSONException, IOException {
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return new JSONObject(sb2.toString());
            }
            sb2.append(line);
        }
    }

    public void addFeature(GeoJsonFeature geoJsonFeature) {
        if (geoJsonFeature == null) {
            throw new IllegalArgumentException("Feature cannot be null");
        }
        super.addFeature((Feature) geoJsonFeature);
    }

    @Override // com.google.maps.android.data.Layer
    public void addLayerToMap() {
        super.addGeoJsonToMap();
    }

    public LatLngBounds getBoundingBox() {
        return this.mBoundingBox;
    }

    @Override // com.google.maps.android.data.Layer
    public Iterable<GeoJsonFeature> getFeatures() {
        return super.getFeatures();
    }

    public void removeFeature(GeoJsonFeature geoJsonFeature) {
        if (geoJsonFeature == null) {
            throw new IllegalArgumentException("Feature cannot be null");
        }
        super.removeFeature((Feature) geoJsonFeature);
    }

    @NonNull
    public String toString() {
        return "Collection{\n Bounding box=" + this.mBoundingBox + "\n}\n";
    }

    public GeoJsonLayer(GoogleMap googleMap, int i7, Context context, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager) throws JSONException, IOException {
        this(googleMap, createJsonFileObject(context.getResources().openRawResource(i7)), markerManager, polygonManager, polylineManager, groundOverlayManager);
    }

    public GeoJsonLayer(GoogleMap googleMap, JSONObject jSONObject) {
        this(googleMap, jSONObject, null, null, null, null);
    }

    public GeoJsonLayer(GoogleMap googleMap, int i7, Context context) throws JSONException, IOException {
        this(googleMap, createJsonFileObject(context.getResources().openRawResource(i7)), null, null, null, null);
    }
}
