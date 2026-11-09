package com.rnmaps.maps;

import android.content.Context;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.google.android.gms.maps.model.Dash;
import com.google.android.gms.maps.model.Gap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.maps.android.collections.PolygonManager;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class MapPolygon extends MapFeature {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PolygonOptions f24800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Polygon f24801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f24802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f24803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f24806g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f24807i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f24808j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f24809o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ReadableArray f24810p;
    public ArrayList t;

    public MapPolygon(Context context) {
        super(context);
        this.f24806g = 10.0f;
    }

    public static Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        MapBuilder.Builder builder = MapBuilder.builder();
        builder.put("topPress", MapBuilder.of("registrationName", "topPress"));
        return builder.build();
    }

    @Override // com.rnmaps.maps.MapFeature
    public final void b(Object obj) {
        ((PolygonManager.Collection) obj).remove(this.f24801b);
    }

    @Override // com.rnmaps.maps.MapFeature
    public Object getFeature() {
        return this.f24801b;
    }

    public PolygonOptions getPolygonOptions() {
        if (this.f24800a == null) {
            PolygonOptions polygonOptions = new PolygonOptions();
            polygonOptions.addAll(this.f24802c);
            polygonOptions.fillColor(this.f24805f);
            polygonOptions.strokeColor(this.f24804e);
            polygonOptions.strokeWidth(this.f24806g);
            polygonOptions.geodesic(this.f24807i);
            polygonOptions.zIndex(this.f24809o);
            polygonOptions.strokePattern(this.t);
            polygonOptions.clickable(this.f24808j);
            if (this.f24803d != null) {
                for (int i7 = 0; i7 < this.f24803d.size(); i7++) {
                    polygonOptions.addHole((Iterable) this.f24803d.get(i7));
                }
            }
            this.f24800a = polygonOptions;
        }
        return this.f24800a;
    }

    public void setCoordinates(ReadableArray readableArray) {
        this.f24802c = new ArrayList(readableArray.size());
        for (int i7 = 0; i7 < readableArray.size(); i7++) {
            ReadableMap map = readableArray.getMap(i7);
            this.f24802c.add(i7, new LatLng(map.getDouble("latitude"), map.getDouble("longitude")));
        }
        Polygon polygon = this.f24801b;
        if (polygon != null) {
            polygon.setPoints(this.f24802c);
        }
    }

    public void setFillColor(int i7) {
        this.f24805f = i7;
        Polygon polygon = this.f24801b;
        if (polygon != null) {
            polygon.setFillColor(i7);
        }
    }

    public void setGeodesic(boolean z3) {
        this.f24807i = z3;
        Polygon polygon = this.f24801b;
        if (polygon != null) {
            polygon.setGeodesic(z3);
        }
    }

    public void setHoles(ReadableArray readableArray) {
        if (readableArray == null) {
            return;
        }
        this.f24803d = new ArrayList(readableArray.size());
        for (int i7 = 0; i7 < readableArray.size(); i7++) {
            ReadableArray array = readableArray.getArray(i7);
            if (array.size() >= 3) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < array.size(); i10++) {
                    ReadableMap map = array.getMap(i10);
                    arrayList.add(new LatLng(map.getDouble("latitude"), map.getDouble("longitude")));
                }
                if (arrayList.size() == 3) {
                    arrayList.add((LatLng) arrayList.get(0));
                }
                this.f24803d.add(arrayList);
            }
        }
        Polygon polygon = this.f24801b;
        if (polygon != null) {
            polygon.setHoles(this.f24803d);
        }
    }

    public void setLineDashPattern(ReadableArray readableArray) {
        this.f24810p = readableArray;
        if (readableArray == null) {
            return;
        }
        this.t = new ArrayList(this.f24810p.size());
        for (int i7 = 0; i7 < this.f24810p.size(); i7++) {
            float f10 = (float) this.f24810p.getDouble(i7);
            if (i7 % 2 != 0) {
                this.t.add(new Gap(f10));
            } else {
                this.t.add(new Dash(f10));
            }
        }
        Polygon polygon = this.f24801b;
        if (polygon != null) {
            polygon.setStrokePattern(this.t);
        }
    }

    public void setStrokeColor(int i7) {
        this.f24804e = i7;
        Polygon polygon = this.f24801b;
        if (polygon != null) {
            polygon.setStrokeColor(i7);
        }
    }

    public void setStrokeWidth(float f10) {
        this.f24806g = f10;
        Polygon polygon = this.f24801b;
        if (polygon != null) {
            polygon.setStrokeWidth(f10);
        }
    }

    public void setTappable(boolean z3) {
        this.f24808j = z3;
        Polygon polygon = this.f24801b;
        if (polygon != null) {
            polygon.setClickable(z3);
        }
    }

    public void setZIndex(float f10) {
        this.f24809o = f10;
        Polygon polygon = this.f24801b;
        if (polygon != null) {
            polygon.setZIndex(f10);
        }
    }
}
