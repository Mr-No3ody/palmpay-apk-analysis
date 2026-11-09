package com.rnmaps.maps;

import android.content.Context;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.google.android.gms.maps.model.ButtCap;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.Dash;
import com.google.android.gms.maps.model.Dot;
import com.google.android.gms.maps.model.Gap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RoundCap;
import com.google.android.gms.maps.model.SquareCap;
import com.google.android.gms.maps.model.StrokeStyle;
import com.google.android.gms.maps.model.StyleSpan;
import com.google.maps.android.collections.PolylineManager;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class MapPolyline extends MapFeature {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PolylineOptions f24811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Polyline f24812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f24813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f24815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f24816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f24817g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f24818i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Cap f24819j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ReadableArray f24820o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f24821p;
    public ArrayList t;

    public MapPolyline(Context context) {
        super(context);
        this.f24819j = new RoundCap();
    }

    public static Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        MapBuilder.Builder builder = MapBuilder.builder();
        builder.put("topPress", MapBuilder.of("registrationName", "topPress"));
        return builder.build();
    }

    @Override // com.rnmaps.maps.MapFeature
    public final void b(Object obj) {
        ((PolylineManager.Collection) obj).remove(this.f24812b);
    }

    public final void c() {
        if (this.f24820o == null) {
            return;
        }
        this.f24821p = new ArrayList(this.f24820o.size());
        for (int i7 = 0; i7 < this.f24820o.size(); i7++) {
            float f10 = (float) this.f24820o.getDouble(i7);
            if (i7 % 2 != 0) {
                this.f24821p.add(new Gap(f10));
            } else {
                this.f24821p.add(this.f24819j instanceof RoundCap ? new Dot() : new Dash(f10));
            }
        }
        Polyline polyline = this.f24812b;
        if (polyline != null) {
            polyline.setPattern(this.f24821p);
        }
    }

    @Override // com.rnmaps.maps.MapFeature
    public Object getFeature() {
        return this.f24812b;
    }

    public PolylineOptions getPolylineOptions() {
        if (this.f24811a == null) {
            PolylineOptions polylineOptions = new PolylineOptions();
            polylineOptions.addAll(this.f24813c);
            polylineOptions.color(this.f24814d);
            polylineOptions.width(this.f24815e);
            polylineOptions.geodesic(this.f24817g);
            polylineOptions.zIndex(this.f24818i);
            polylineOptions.startCap(this.f24819j);
            polylineOptions.endCap(this.f24819j);
            polylineOptions.pattern(this.f24821p);
            this.f24811a = polylineOptions;
        }
        return this.f24811a;
    }

    public void setColor(int i7) {
        this.f24814d = i7;
        Polyline polyline = this.f24812b;
        if (polyline != null) {
            polyline.setColor(i7);
        }
    }

    public void setCoordinates(ReadableArray readableArray) {
        this.f24813c = new ArrayList(readableArray.size());
        for (int i7 = 0; i7 < readableArray.size(); i7++) {
            ReadableMap map = readableArray.getMap(i7);
            this.f24813c.add(i7, new LatLng(map.getDouble("latitude"), map.getDouble("longitude")));
        }
        Polyline polyline = this.f24812b;
        if (polyline != null) {
            polyline.setPoints(this.f24813c);
        }
    }

    public void setGeodesic(boolean z3) {
        this.f24817g = z3;
        Polyline polyline = this.f24812b;
        if (polyline != null) {
            polyline.setGeodesic(z3);
        }
    }

    public void setLineCap(Cap cap) {
        this.f24819j = cap;
        Polyline polyline = this.f24812b;
        if (polyline != null) {
            polyline.setStartCap(cap);
            this.f24812b.setEndCap(cap);
        }
        c();
    }

    public void setLineDashPattern(ReadableArray readableArray) {
        this.f24820o = readableArray;
        c();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    public void setLineJoin(String str) {
        byte b7;
        int iHashCode = str.hashCode();
        int i7 = 2;
        if (iHashCode != 93630586) {
            if (iHashCode != 103906565) {
                if (iHashCode == 108704142 && str.equals("round")) {
                    b7 = 0;
                } else {
                    b7 = -1;
                }
            } else if (str.equals("miter")) {
                b7 = 2;
            } else {
                b7 = -1;
            }
        } else if (str.equals("bevel")) {
            b7 = 1;
        } else {
            b7 = -1;
        }
        if (b7 != 0) {
            i7 = b7 != 1 ? 0 : 1;
        }
        Polyline polyline = this.f24812b;
        if (polyline != null) {
            polyline.setJointType(i7);
        }
    }

    public void setStrokeColors(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (i7 < readableArray.size()) {
            arrayList.add(new StyleSpan(i7 == 0 ? StrokeStyle.colorBuilder(readableArray.getInt(i7)).build() : StrokeStyle.gradientBuilder(readableArray.getInt(i7 - 1), readableArray.getInt(i7)).build()));
            i7++;
        }
        this.t = arrayList;
        Polyline polyline = this.f24812b;
        if (polyline != null) {
            polyline.setSpans(arrayList);
        }
    }

    public void setTappable(boolean z3) {
        this.f24816f = z3;
        Polyline polyline = this.f24812b;
        if (polyline != null) {
            polyline.setClickable(z3);
        }
    }

    public void setWidth(float f10) {
        this.f24815e = f10;
        Polyline polyline = this.f24812b;
        if (polyline != null) {
            polyline.setWidth(f10);
        }
    }

    public void setZIndex(float f10) {
        this.f24818i = f10;
        Polyline polyline = this.f24812b;
        if (polyline != null) {
            polyline.setZIndex(f10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0033  */
    public void setLineCap(String str) {
        byte b7;
        Cap roundCap;
        int iHashCode = str.hashCode();
        if (iHashCode != -894674659) {
            if (iHashCode != 3035667) {
                if (iHashCode == 108704142 && str.equals("round")) {
                    b7 = 0;
                } else {
                    b7 = -1;
                }
            } else if (str.equals("butt")) {
                b7 = 2;
            } else {
                b7 = -1;
            }
        } else if (str.equals("square")) {
            b7 = 1;
        } else {
            b7 = -1;
        }
        if (b7 == 0) {
            roundCap = new RoundCap();
        } else if (b7 != 1) {
            roundCap = new ButtCap();
        } else {
            roundCap = new SquareCap();
        }
        setLineCap(roundCap);
    }
}
