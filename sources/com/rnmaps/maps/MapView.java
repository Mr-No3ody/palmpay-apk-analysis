package com.rnmaps.maps;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.IndoorBuilding;
import com.google.android.gms.maps.model.IndoorLevel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PointOfInterest;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.maps.android.collections.CircleManager;
import com.google.maps.android.collections.GroundOverlayManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.collections.PolygonManager;
import com.google.maps.android.collections.PolylineManager;
import com.google.maps.android.data.Renderer;
import com.google.maps.android.data.kml.KmlContainer;
import com.google.maps.android.data.kml.KmlLayer;
import com.google.maps.android.data.kml.KmlPlacemark;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class MapView extends com.google.android.gms.maps.MapView implements GoogleMap.InfoWindowAdapter, GoogleMap.OnMarkerDragListener, OnMapReadyCallback, GoogleMap.OnPoiClickListener, GoogleMap.OnIndoorStateChangeListener, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final String[] f24838s1 = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public RelativeLayout f24839A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public ReadableMap f24840A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ImageView f24841B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public String f24842B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Boolean f24843C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public boolean f24844C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public boolean f24845D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public int f24846E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public MapMarker f24847F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public LifecycleOwner f24848G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Boolean f24849H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public boolean f24850H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public final ArrayList f24851I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public final HashMap f24852J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final HashMap f24853K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Integer f24854L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public final HashMap f24855L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public Integer f24856M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public final HashMap f24857M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public final HashMap f24858N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public final HashMap f24859O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public final GestureDetector f24860P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public LatLngBounds f24861Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public boolean f24862Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public boolean f24863R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public final ThemedReactContext f24864S0;
    public final C1448c T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public ViewAttacherGroup f24865U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public LatLng f24866V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public Float f24867W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public Float f24868X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public Boolean f24869Y0;
    public Boolean Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GoogleMap f24870a;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public Boolean f24871a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bundle f24872b;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public Boolean f24873b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f24874c;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public Boolean f24875c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24876d;
    public Boolean d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MarkerManager f24877e;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public Boolean f24878e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MarkerManager.Collection f24879f;
    public Boolean f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PolylineManager f24880g;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public Boolean f24881g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public Boolean f24882h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PolylineManager.Collection f24883i;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public String f24884i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PolygonManager f24885j;
    public int j1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public CameraUpdate f24886k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public int f24887k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public int f24888l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public int f24889m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public int f24890n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PolygonManager.Collection f24891o;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public int f24892o1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CircleManager.Collection f24893p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f24894p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public int f24895p1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f24896q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public int f24897q1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f24898r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public final androidx.customview.widget.e f24899r1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f24900s0;
    public GroundOverlayManager t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f24901t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f24902u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public GroundOverlayManager.Collection f24903v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f24904v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ProgressBar f24905w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f24906w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ReadableMap f24907x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ReadableMap f24908y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public ReadableMap f24909z0;

    @FunctionalInterface
    public interface EventCreator<T extends Event> {
        T create(int i7, int i10, WritableMap writableMap);
    }

    public MapView(ThemedReactContext themedReactContext, GoogleMapOptions googleMapOptions) {
        super(themedReactContext, googleMapOptions);
        this.f24874c = null;
        this.f24876d = false;
        Boolean bool = Boolean.FALSE;
        this.f24843C = bool;
        this.f24849H = bool;
        this.f24854L = null;
        this.f24856M = null;
        this.f24894p0 = false;
        this.f24896q0 = false;
        this.f24898r0 = true;
        this.f24900s0 = false;
        this.f24901t0 = false;
        this.f24902u0 = true;
        this.f24904v0 = false;
        this.f24906w0 = true;
        this.f24844C0 = false;
        this.f24845D0 = false;
        this.f24846E0 = -1;
        this.f24850H0 = false;
        this.f24851I0 = new ArrayList();
        this.f24852J0 = new HashMap();
        this.f24853K0 = new HashMap();
        this.f24855L0 = new HashMap();
        this.f24857M0 = new HashMap();
        this.f24858N0 = new HashMap();
        this.f24859O0 = new HashMap();
        this.f24862Q0 = false;
        this.f24863R0 = false;
        this.f24884i1 = null;
        this.f24899r1 = new androidx.customview.widget.e(this, 16);
        this.f24864S0 = themedReactContext;
        super.getMapAsync(this);
        this.T0 = new C1448c(themedReactContext);
        this.f24860P0 = new GestureDetector(themedReactContext, new androidx.camera.view.impl.e(this, 3));
        addOnLayoutChangeListener(new z(this));
        s();
    }

    public static void a(MapView mapView, MapMarker mapMarker) {
        synchronized (mapView) {
            try {
                MapMarker mapMarker2 = mapView.f24847F0;
                if (mapMarker2 == mapMarker) {
                    return;
                }
                if (mapMarker2 != null) {
                    WritableNativeMap writableNativeMapP = mapView.p(mapMarker2.getPosition());
                    writableNativeMapP.putString("action", "marker-deselect");
                    writableNativeMapP.putString("id", mapView.f24847F0.getIdentifier());
                    MapMarker mapMarker3 = mapView.f24847F0;
                    ThemedReactContext themedReactContext = mapMarker3.f24787w;
                    EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, mapMarker3.getId());
                    if (eventDispatcherForReactTag != null) {
                        eventDispatcherForReactTag.dispatchEvent(new p169l7.c(UIManagerHelper.getSurfaceId(themedReactContext), mapMarker3.getId(), writableNativeMapP, 2));
                    }
                    WritableNativeMap writableNativeMapP2 = mapView.p(mapView.f24847F0.getPosition());
                    writableNativeMapP2.putString("action", "marker-deselect");
                    writableNativeMapP2.putString("id", mapView.f24847F0.getIdentifier());
                    int id2 = mapView.getId();
                    ThemedReactContext themedReactContext2 = mapView.f24864S0;
                    EventDispatcher eventDispatcherForReactTag2 = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext2, id2);
                    if (eventDispatcherForReactTag2 != null) {
                        eventDispatcherForReactTag2.dispatchEvent(new p169l7.c(UIManagerHelper.getSurfaceId(themedReactContext2), id2, writableNativeMapP2, 13));
                    }
                }
                if (mapMarker != null) {
                    WritableNativeMap writableNativeMapP3 = mapView.p(mapMarker.getPosition());
                    writableNativeMapP3.putString("action", "marker-select");
                    writableNativeMapP3.putString("id", mapMarker.getIdentifier());
                    ThemedReactContext themedReactContext3 = mapMarker.f24787w;
                    EventDispatcher eventDispatcherForReactTag3 = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext3, mapMarker.getId());
                    if (eventDispatcherForReactTag3 != null) {
                        eventDispatcherForReactTag3.dispatchEvent(new p169l7.c(UIManagerHelper.getSurfaceId(themedReactContext3), mapMarker.getId(), writableNativeMapP3, 25));
                    }
                    WritableNativeMap writableNativeMapP4 = mapView.p(mapMarker.getPosition());
                    writableNativeMapP4.putString("action", "marker-select");
                    writableNativeMapP4.putString("id", mapMarker.getIdentifier());
                    int id3 = mapView.getId();
                    ThemedReactContext themedReactContext4 = mapView.f24864S0;
                    EventDispatcher eventDispatcherForReactTag4 = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext4, id3);
                    if (eventDispatcherForReactTag4 != null) {
                        eventDispatcherForReactTag4.dispatchEvent(new p169l7.c(UIManagerHelper.getSurfaceId(themedReactContext4), id3, writableNativeMapP4, 18));
                    }
                }
                mapView.f24847F0 = mapMarker;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private ImageView getCacheImageView() {
        if (this.f24841B == null) {
            ImageView imageView = new ImageView(getContext());
            this.f24841B = imageView;
            addView(imageView, new ViewGroup.LayoutParams(-1, -1));
            this.f24841B.setVisibility(4);
        }
        return this.f24841B;
    }

    public static Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        MapBuilder.Builder builder = MapBuilder.builder();
        builder.put("topPress", MapBuilder.of("registrationName", "topPress"));
        builder.put("topLongPress", MapBuilder.of("registrationName", "topLongPress"));
        return builder.build();
    }

    public static Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        MapBuilder.Builder builder = MapBuilder.builder();
        builder.put("topMarkerPress", MapBuilder.of("registrationName", "topMarkerPress"));
        builder.put("topCalloutPress", MapBuilder.of("registrationName", "topCalloutPress"));
        builder.put("topMarkerDrag", MapBuilder.of("registrationName", "topMarkerDrag"));
        builder.put("topMarkerDragStart", MapBuilder.of("registrationName", "topMarkerDragStart"));
        builder.put("topMarkerDragEnd", MapBuilder.of("registrationName", "topMarkerDragEnd"));
        builder.put("topPoiClick", MapBuilder.of("registrationName", "topPoiClick"));
        builder.put("topDoublePress", MapBuilder.of("registrationName", "topDoublePress"));
        builder.put("topPanDrag", MapBuilder.of("registrationName", "topPanDrag"));
        builder.put("topMarkerSelect", MapBuilder.of("registrationName", "topMarkerSelect"));
        builder.put("topMarkerDeselect", MapBuilder.of("registrationName", "topMarkerDeselect"));
        builder.put("topMapLoaded", MapBuilder.of("registrationName", "topMapLoaded"));
        builder.put("topMapReady", MapBuilder.of("registrationName", "topMapReady"));
        builder.put("topUserLocationChange", MapBuilder.of("registrationName", "topUserLocationChange"));
        builder.put("topRegionChange", MapBuilder.of("registrationName", "topRegionChange"));
        builder.put("topRegionChangeStart", MapBuilder.of("registrationName", "topRegionChangeStart"));
        builder.put("topRegionChangeComplete", MapBuilder.of("registrationName", "topRegionChangeComplete"));
        builder.put("topIndoorBuildingFocused", MapBuilder.of("registrationName", "topIndoorBuildingFocused"));
        builder.put("topIndoorLevelActivated", MapBuilder.of("registrationName", "topIndoorLevelActivated"));
        builder.put("topKmlReady", MapBuilder.of("registrationName", "topKmlReady"));
        return builder.build();
    }

    private RelativeLayout getMapLoadingLayoutView() {
        if (this.f24839A == null) {
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            this.f24839A = relativeLayout;
            relativeLayout.setBackgroundColor(-3355444);
            addView(this.f24839A, new ViewGroup.LayoutParams(-1, -1));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f24839A.addView(getMapLoadingProgressBar(), layoutParams);
            this.f24839A.setVisibility(4);
        }
        setLoadingBackgroundColor(this.f24854L);
        return this.f24839A;
    }

    private ProgressBar getMapLoadingProgressBar() {
        if (this.f24905w == null) {
            ProgressBar progressBar = new ProgressBar(getContext());
            this.f24905w = progressBar;
            progressBar.setIndeterminate(true);
        }
        Integer num = this.f24856M;
        if (num != null) {
            setLoadingIndicatorColor(num);
        }
        return this.f24905w;
    }

    public static CameraPosition h(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        CameraPosition.Builder builder = new CameraPosition.Builder();
        ReadableMap map = readableMap.getMap("center");
        if (map != null) {
            builder.target(new LatLng(map.getDouble("latitude"), map.getDouble("longitude")));
        }
        builder.tilt((float) readableMap.getDouble("pitch"));
        builder.bearing((float) readableMap.getDouble("heading"));
        if (readableMap.hasKey("zoom")) {
            builder.zoom((float) readableMap.getDouble("zoom"));
        }
        return builder.build();
    }

    public static void v(View view) {
        ViewGroup viewGroup;
        if (view == null || (viewGroup = (ViewGroup) view.getParent()) == null) {
            return;
        }
        viewGroup.removeView(view);
    }

    public final void b(int i7, View view) {
        if (view instanceof MapMarker) {
            MapMarker mapMarker = (MapMarker) view;
            MarkerManager.Collection collection = this.f24879f;
            mapMarker.getClass();
            mapMarker.f24768b = collection.addMarker(mapMarker.getMarkerOptions());
            mapMarker.f24791z0 = new SoftReference(collection);
            mapMarker.h();
            u(i7, mapMarker);
            int visibility = mapMarker.getVisibility();
            mapMarker.setVisibility(4);
            v(mapMarker);
            if (this.f24865U0 == null) {
                s();
            }
            this.f24865U0.addView(mapMarker);
            mapMarker.setVisibility(visibility);
            this.f24852J0.put((Marker) mapMarker.getFeature(), mapMarker);
            return;
        }
        if (view instanceof MapPolyline) {
            MapPolyline mapPolyline = (MapPolyline) view;
            PolylineManager.Collection collection2 = this.f24883i;
            mapPolyline.getClass();
            Polyline polylineAddPolyline = collection2.addPolyline(mapPolyline.getPolylineOptions());
            mapPolyline.f24812b = polylineAddPolyline;
            polylineAddPolyline.setClickable(mapPolyline.f24816f);
            ArrayList arrayList = mapPolyline.t;
            if (arrayList != null) {
                mapPolyline.f24812b.setSpans(arrayList);
            }
            u(i7, mapPolyline);
            this.f24853K0.put((Polyline) mapPolyline.getFeature(), mapPolyline);
            return;
        }
        if (view instanceof MapGradientPolyline) {
            MapGradientPolyline mapGradientPolyline = (MapGradientPolyline) view;
            GoogleMap googleMap = this.f24870a;
            mapGradientPolyline.getClass();
            mapGradientPolyline.f24738e = googleMap;
            mapGradientPolyline.f24739f = googleMap.addTileOverlay(mapGradientPolyline.c());
            u(i7, mapGradientPolyline);
            this.f24859O0.put((TileOverlay) mapGradientPolyline.getFeature(), mapGradientPolyline);
            return;
        }
        if (view instanceof MapPolygon) {
            MapPolygon mapPolygon = (MapPolygon) view;
            PolygonManager.Collection collection3 = this.f24891o;
            mapPolygon.getClass();
            mapPolygon.f24801b = collection3.addPolygon(mapPolygon.getPolygonOptions());
            u(i7, mapPolygon);
            this.f24855L0.put((Polygon) mapPolygon.getFeature(), mapPolygon);
            return;
        }
        if (view instanceof MapCircle) {
            MapCircle mapCircle = (MapCircle) view;
            CircleManager.Collection collection4 = this.f24893p;
            mapCircle.getClass();
            mapCircle.f24727b = collection4.addCircle(mapCircle.getCircleOptions());
            u(i7, mapCircle);
            return;
        }
        if (view instanceof MapUrlTile) {
            MapUrlTile mapUrlTile = (MapUrlTile) view;
            GoogleMap googleMap2 = this.f24870a;
            mapUrlTile.getClass();
            mapUrlTile.f24826b = googleMap2.addTileOverlay(mapUrlTile.getTileOverlayOptions());
            u(i7, mapUrlTile);
            return;
        }
        if (view instanceof MapWMSTile) {
            MapWMSTile mapWMSTile = (MapWMSTile) view;
            GoogleMap googleMap3 = this.f24870a;
            mapWMSTile.getClass();
            mapWMSTile.f24826b = googleMap3.addTileOverlay(mapWMSTile.getTileOverlayOptions());
            u(i7, mapWMSTile);
            return;
        }
        if (view instanceof MapLocalTile) {
            MapLocalTile mapLocalTile = (MapLocalTile) view;
            GoogleMap googleMap4 = this.f24870a;
            mapLocalTile.getClass();
            mapLocalTile.f24749b = googleMap4.addTileOverlay(mapLocalTile.getTileOverlayOptions());
            u(i7, mapLocalTile);
            return;
        }
        if (view instanceof MapOverlay) {
            MapOverlay mapOverlay = (MapOverlay) view;
            GroundOverlayManager.Collection collection5 = this.f24903v;
            mapOverlay.getClass();
            GroundOverlayOptions groundOverlayOptions = mapOverlay.getGroundOverlayOptions();
            if (groundOverlayOptions != null) {
                GroundOverlay groundOverlayAddGroundOverlay = collection5.addGroundOverlay(groundOverlayOptions);
                mapOverlay.f24793b = groundOverlayAddGroundOverlay;
                groundOverlayAddGroundOverlay.setClickable(mapOverlay.f24797f);
            } else {
                mapOverlay.f24799i = collection5;
            }
            u(i7, mapOverlay);
            this.f24857M0.put((GroundOverlay) mapOverlay.getFeature(), mapOverlay);
            return;
        }
        if (view instanceof MapHeatmap) {
            MapHeatmap mapHeatmap = (MapHeatmap) view;
            GoogleMap googleMap5 = this.f24870a;
            mapHeatmap.getClass();
            mapHeatmap.f24742b = googleMap5.addTileOverlay(mapHeatmap.getHeatmapOptions());
            u(i7, mapHeatmap);
            this.f24858N0.put((TileOverlay) mapHeatmap.getFeature(), mapHeatmap);
            return;
        }
        if (!(view instanceof ViewGroup)) {
            addView(view, i7);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            b(i7, viewGroup.getChildAt(i10));
        }
    }

    public final void c(ReadableMap readableMap, int i7) {
        GoogleMap googleMap = this.f24870a;
        if (googleMap == null) {
            return;
        }
        CameraPosition.Builder builder = new CameraPosition.Builder(googleMap.getCameraPosition());
        if (readableMap.hasKey("zoom")) {
            builder.zoom((float) readableMap.getDouble("zoom"));
        }
        if (readableMap.hasKey("heading")) {
            builder.bearing((float) readableMap.getDouble("heading"));
        }
        if (readableMap.hasKey("pitch")) {
            builder.tilt((float) readableMap.getDouble("pitch"));
        }
        if (readableMap.hasKey("center")) {
            ReadableMap map = readableMap.getMap("center");
            builder.target(new LatLng(map.getDouble("latitude"), map.getDouble("longitude")));
        }
        CameraPosition cameraPositionBuild = builder.build();
        if (this.f24870a == null) {
            return;
        }
        CameraUpdate cameraUpdateNewCameraPosition = CameraUpdateFactory.newCameraPosition(cameraPositionBuild);
        if (i7 <= 0) {
            this.f24870a.moveCamera(cameraUpdateNewCameraPosition);
        } else {
            this.f24870a.animateCamera(cameraUpdateNewCameraPosition, i7, null);
        }
    }

    public final void d(int i7, int i10, int i11, int i12) {
        double d2 = getResources().getDisplayMetrics().density;
        int i13 = (int) (((double) i7) * d2);
        this.f24890n1 = i13;
        int i14 = (int) (((double) i10) * d2);
        this.f24895p1 = i14;
        int i15 = (int) (((double) i11) * d2);
        this.f24892o1 = i15;
        int i16 = (int) (((double) i12) * d2);
        this.f24897q1 = i16;
        this.f24870a.setPadding(i13 + this.j1, i14 + this.f24888l1, i15 + this.f24887k1, i16 + this.f24889m1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewGroup viewGroup;
        this.f24860P0.onTouchEvent(motionEvent);
        int x3 = (int) motionEvent.getX();
        int y8 = (int) motionEvent.getY();
        GoogleMap googleMap = this.f24870a;
        if (googleMap != null) {
            this.f24866V0 = googleMap.getProjection().fromScreenLocation(new Point(x3, y8));
        }
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = false;
        if (actionMasked == 0) {
            GoogleMap googleMap2 = this.f24870a;
            if (googleMap2 != null && googleMap2.getUiSettings().isScrollGesturesEnabled()) {
                z3 = true;
            }
            ViewGroup viewGroup2 = (ViewGroup) getParent();
            if (viewGroup2 != null) {
                viewGroup2.requestDisallowInterceptTouchEvent(z3);
            }
        } else if (actionMasked == 1 && (viewGroup = (ViewGroup) getParent()) != null) {
            viewGroup.requestDisallowInterceptTouchEvent(false);
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public final void e(int i7, int i10, int i11, int i12) {
        if (super.getHeight() <= 0 || super.getWidth() <= 0) {
            this.j1 = i7;
            this.f24887k1 = i11;
            this.f24888l1 = i10;
            this.f24889m1 = i12;
            this.f24894p0 = true;
            return;
        }
        this.f24870a.setPadding(this.f24890n1 + this.j1, this.f24895p1 + this.f24888l1, this.f24892o1 + this.f24887k1, this.f24897q1 + this.f24889m1);
        CameraUpdate cameraUpdateNewCameraPosition = CameraUpdateFactory.newCameraPosition(this.f24870a.getCameraPosition());
        this.j1 = i7;
        this.f24887k1 = i11;
        this.f24888l1 = i10;
        this.f24889m1 = i12;
        this.f24870a.setPadding(this.f24890n1 + i7, this.f24895p1 + i10, this.f24892o1 + i11, this.f24897q1 + i12);
        this.f24870a.moveCamera(cameraUpdateNewCameraPosition);
        this.f24870a.setPadding(i7, i10, i11, i12);
        this.f24894p0 = false;
    }

    public final void f() {
        if (this.f24904v0) {
            ImageView cacheImageView = getCacheImageView();
            RelativeLayout mapLoadingLayoutView = getMapLoadingLayoutView();
            cacheImageView.setVisibility(4);
            mapLoadingLayoutView.setVisibility(0);
            if (this.f24843C.booleanValue()) {
                this.f24870a.snapshot(new y(cacheImageView, mapLoadingLayoutView));
                return;
            }
            return;
        }
        ImageView imageView = this.f24841B;
        if (imageView != null) {
            v(imageView);
            this.f24841B = null;
        }
        if (this.f24843C.booleanValue()) {
            ProgressBar progressBar = this.f24905w;
            if (progressBar != null) {
                v(progressBar);
                this.f24905w = null;
            }
            RelativeLayout relativeLayout = this.f24839A;
            if (relativeLayout != null) {
                v(relativeLayout);
                this.f24839A = null;
            }
        }
    }

    public final CameraPosition g(JSONObject jSONObject) {
        if (this.f24870a == null) {
            return null;
        }
        CameraPosition.Builder builder = new CameraPosition.Builder();
        if (jSONObject.has("center")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("center");
            if (jSONObject2 != null) {
                builder.target(new LatLng(jSONObject2.getDouble("latitude"), jSONObject2.getDouble("longitude")));
            }
        } else {
            builder.target(this.f24870a.getCameraPosition().target);
        }
        if (jSONObject.has("pitch")) {
            builder.tilt((float) jSONObject.getDouble("pitch"));
        } else {
            builder.tilt(this.f24870a.getCameraPosition().tilt);
        }
        if (jSONObject.has("heading")) {
            builder.bearing((float) jSONObject.getDouble("heading"));
        } else {
            builder.bearing(this.f24870a.getCameraPosition().bearing);
        }
        if (jSONObject.has("zoom")) {
            builder.zoom((float) jSONObject.getDouble("zoom"));
        } else {
            builder.zoom(this.f24870a.getCameraPosition().zoom);
        }
        return builder.build();
    }

    public int getFeatureCount() {
        return this.f24851I0.size();
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    public final View getInfoContents(Marker marker) {
        return n(marker).getInfoContents();
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    public final View getInfoWindow(Marker marker) {
        return n(marker).getCallout();
    }

    public double[][] getMapBoundaries() {
        LatLngBounds latLngBounds = this.f24870a.getProjection().getVisibleRegion().latLngBounds;
        LatLng latLng = latLngBounds.northeast;
        LatLng latLng2 = latLngBounds.southwest;
        return new double[][]{new double[]{latLng.longitude, latLng.latitude}, new double[]{latLng2.longitude, latLng2.latitude}};
    }

    public final void i(WritableMap writableMap, EventCreator eventCreator) {
        int id2 = getId();
        ThemedReactContext themedReactContext = this.f24864S0;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, id2);
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(eventCreator.create(UIManagerHelper.getSurfaceId(themedReactContext), id2, writableMap));
        }
    }

    public final synchronized void j() {
        try {
            if (this.f24863R0) {
                return;
            }
            this.f24863R0 = true;
            this.f24872b = null;
            this.f24874c = null;
            try {
                if (!this.f24862Q0) {
                    onPause();
                    this.f24862Q0 = true;
                }
                onDestroy();
                LifecycleOwner lifecycleOwner = this.f24848G0;
                if (lifecycleOwner != null && this.f24850H0) {
                    lifecycleOwner.getLifecycle().b(this);
                    this.f24850H0 = false;
                    this.f24848G0 = null;
                }
            } catch (Exception e10) {
                Log.e("MapView", "exception with destroying", e10);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void k(ReadableArray readableArray, ReadableMap readableMap, boolean z3) {
        if (this.f24870a == null) {
            return;
        }
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        for (int i7 = 0; i7 < readableArray.size(); i7++) {
            ReadableMap map = readableArray.getMap(i7);
            builder.include(new LatLng(map.getDouble("latitude"), map.getDouble("longitude")));
        }
        CameraUpdate cameraUpdateNewLatLngBounds = CameraUpdateFactory.newLatLngBounds(builder.build(), 0);
        if (readableMap != null) {
            d(readableMap.getInt(ViewProps.LEFT), readableMap.getInt(ViewProps.TOP), readableMap.getInt(ViewProps.RIGHT), readableMap.getInt(ViewProps.BOTTOM));
        }
        if (z3) {
            this.f24870a.animateCamera(cameraUpdateNewLatLngBounds);
        } else {
            this.f24870a.moveCamera(cameraUpdateNewLatLngBounds);
        }
        this.f24870a.setPadding(this.j1, this.f24888l1, this.f24887k1, this.f24889m1);
    }

    public final void l(ReadableMap readableMap, boolean z3) {
        boolean z8;
        if (this.f24870a == null) {
            return;
        }
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        ArrayList<MapFeature> arrayList = this.f24851I0;
        if (arrayList.size() > 0) {
            z8 = false;
            for (MapFeature mapFeature : arrayList) {
                if (mapFeature instanceof MapMarker) {
                    builder.include(((Marker) mapFeature.getFeature()).getPosition());
                    z8 = true;
                }
            }
        } else {
            z8 = false;
        }
        if (z8) {
            CameraUpdate cameraUpdateNewLatLngBounds = CameraUpdateFactory.newLatLngBounds(builder.build(), 0);
            if (readableMap != null) {
                d(readableMap.getInt(ViewProps.LEFT), readableMap.getInt(ViewProps.TOP), readableMap.getInt(ViewProps.RIGHT), readableMap.getInt(ViewProps.BOTTOM));
            }
            if (z3) {
                this.f24870a.animateCamera(cameraUpdateNewLatLngBounds);
            } else {
                this.f24870a.moveCamera(cameraUpdateNewLatLngBounds);
            }
            this.f24870a.setPadding(this.j1, this.f24888l1, this.f24887k1, this.f24889m1);
        }
    }

    public final void m(ReadableArray readableArray, ReadableMap readableMap, boolean z3) {
        if (this.f24870a == null) {
            return;
        }
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        String[] strArr = new String[readableArray.size()];
        for (int i7 = 0; i7 < readableArray.size(); i7++) {
            strArr[i7] = readableArray.getString(i7);
        }
        List listAsList = Arrays.asList(strArr);
        boolean z8 = false;
        for (MapFeature mapFeature : this.f24851I0) {
            if (mapFeature instanceof MapMarker) {
                String identifier = ((MapMarker) mapFeature).getIdentifier();
                Marker marker = (Marker) mapFeature.getFeature();
                if (listAsList.contains(identifier)) {
                    builder.include(marker.getPosition());
                    z8 = true;
                }
            }
        }
        if (z8) {
            CameraUpdate cameraUpdateNewLatLngBounds = CameraUpdateFactory.newLatLngBounds(builder.build(), 0);
            if (readableMap != null) {
                d(readableMap.getInt(ViewProps.LEFT), readableMap.getInt(ViewProps.TOP), readableMap.getInt(ViewProps.RIGHT), readableMap.getInt(ViewProps.BOTTOM));
            }
            if (z3) {
                this.f24870a.animateCamera(cameraUpdateNewLatLngBounds);
            } else {
                this.f24870a.moveCamera(cameraUpdateNewLatLngBounds);
            }
            this.f24870a.setPadding(this.j1, this.f24888l1, this.f24887k1, this.f24889m1);
        }
    }

    public final MapMarker n(Marker marker) {
        HashMap map = this.f24852J0;
        MapMarker mapMarker = (MapMarker) map.get(marker);
        if (mapMarker != null) {
            return mapMarker;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (((Marker) entry.getKey()).getPosition().equals(marker.getPosition()) && ((Marker) entry.getKey()).getTitle().equals(marker.getTitle())) {
                return (MapMarker) entry.getValue();
            }
        }
        return mapMarker;
    }

    public final boolean o() {
        Context context = getContext();
        String[] strArr = f24838s1;
        return androidx.core.content.d.b(context, strArr[0]) == 0 || androidx.core.content.d.b(getContext(), strArr[1]) == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        synchronized (this) {
            this.f24862Q0 = false;
        }
        ComponentCallbacks2 currentActivity = this.f24864S0.getCurrentActivity();
        if ((currentActivity instanceof LifecycleOwner) && !this.f24850H0) {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) currentActivity;
            this.f24848G0 = lifecycleOwner;
            lifecycleOwner.getLifecycle().a(this);
            this.f24850H0 = true;
        }
        Bundle bundle = this.f24872b;
        if (bundle != null) {
            super.onCreate(bundle);
            super.onStart();
            super.onResume();
            s();
            getMapAsync(new OnMapReadyCallback() { // from class: com.rnmaps.maps.x
                @Override // com.google.android.gms.maps.OnMapReadyCallback
                public final void onMapReady(GoogleMap googleMap) {
                    String[] strArr = MapView.f24838s1;
                    MapView mapView = this.f24994a;
                    mapView.onMapReady(googleMap);
                    ArrayList arrayList = mapView.f24874c;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        for (int i7 = 0; i7 < mapView.f24874c.size(); i7++) {
                            MapFeature mapFeature = (MapFeature) mapView.f24874c.get(i7);
                            if (mapFeature != null) {
                                mapView.b(i7, mapFeature);
                            }
                        }
                    }
                    mapView.f24874c = null;
                }
            });
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        super.onCreate((Bundle) null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        synchronized (this) {
            try {
                if (this.f24870a != null && this.f24849H.booleanValue()) {
                    try {
                        if (this.f24872b == null) {
                            this.f24872b = new Bundle();
                        }
                        super.onSaveInstanceState(this.f24872b);
                    } catch (Exception e10) {
                        Log.e("MapView", "Error saving state in onDetachedFromWindow: " + e10.getMessage());
                    }
                }
                if (!this.f24862Q0) {
                    onPause();
                    this.f24862Q0 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            onStop();
        } catch (Exception e11) {
            Log.e("MapView", "Error during stop in onDetachedFromWindow: " + e11.getMessage());
        }
        this.f24874c = new ArrayList(this.f24851I0);
        this.f24851I0.clear();
        this.f24876d = true;
        removeView(this.f24865U0);
        this.f24865U0 = null;
        super.onDetachedFromWindow();
        LifecycleOwner lifecycleOwner = this.f24848G0;
        if (lifecycleOwner == null || !this.f24850H0) {
            return;
        }
        lifecycleOwner.getLifecycle().b(this);
        this.f24850H0 = false;
        this.f24848G0 = null;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener
    public final void onIndoorBuildingFocused() {
        IndoorBuilding focusedBuilding = this.f24870a.getFocusedBuilding();
        int i7 = 0;
        if (focusedBuilding == null) {
            ReadableArray readableArrayCreateArray = Arguments.createArray();
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putArray("levels", readableArrayCreateArray);
            writableMapCreateMap.putInt("activeLevelIndex", 0);
            writableMapCreateMap.putBoolean("underground", false);
            i(writableMapCreateMap, new com.palmpay.lib.bridgewrapper.photo.upload.a(7));
            return;
        }
        List<IndoorLevel> levels = focusedBuilding.getLevels();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (IndoorLevel indoorLevel : levels) {
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putInt(FirebaseAnalytics.Param.INDEX, i7);
            writableMapCreateMap2.putString("name", indoorLevel.getName());
            writableMapCreateMap2.putString("shortName", indoorLevel.getShortName());
            writableArrayCreateArray.pushMap(writableMapCreateMap2);
            i7++;
        }
        WritableMap writableMapCreateMap3 = Arguments.createMap();
        writableMapCreateMap3.putArray("levels", writableArrayCreateArray);
        writableMapCreateMap3.putInt("activeLevelIndex", focusedBuilding.getActiveLevelIndex());
        writableMapCreateMap3.putBoolean("underground", focusedBuilding.isUnderground());
        i(writableMapCreateMap3, new com.palmpay.lib.bridgewrapper.photo.upload.a(7));
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener
    public final void onIndoorLevelActivated(IndoorBuilding indoorBuilding) {
        int activeLevelIndex;
        if (indoorBuilding != null && (activeLevelIndex = indoorBuilding.getActiveLevelIndex()) >= 0 && activeLevelIndex < indoorBuilding.getLevels().size()) {
            IndoorLevel indoorLevel = indoorBuilding.getLevels().get(activeLevelIndex);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("activeLevelIndex", activeLevelIndex);
            writableMapCreateMap.putString("name", indoorLevel.getName());
            writableMapCreateMap.putString("shortName", indoorLevel.getShortName());
            i(writableMapCreateMap, new com.palmpay.lib.bridgewrapper.photo.upload.a(6));
        }
    }

    @Override // com.google.android.gms.maps.OnMapReadyCallback
    public final void onMapReady(final GoogleMap googleMap) {
        if (this.f24863R0) {
            return;
        }
        this.f24870a = googleMap;
        Float f10 = this.f24867W0;
        if (f10 != null) {
            setMaxZoomLevel(f10.floatValue());
        }
        Float f11 = this.f24868X0;
        if (f11 != null) {
            setMinZoomLevel(f11.floatValue());
        }
        Boolean bool = this.f24869Y0;
        if (bool != null) {
            setPitchEnabled(bool.booleanValue());
        }
        Boolean bool2 = this.Z0;
        if (bool2 != null) {
            setShowsCompass(bool2.booleanValue());
        }
        Boolean bool3 = this.f24871a1;
        if (bool3 != null) {
            setRotateEnabled(bool3.booleanValue());
        }
        Boolean bool4 = this.f24873b1;
        if (bool4 != null) {
            setZoomEnabled(bool4.booleanValue());
        }
        Boolean bool5 = this.f24875c1;
        if (bool5 != null) {
            setZoomControlEnabled(bool5.booleanValue());
        }
        Boolean bool6 = this.d1;
        if (bool6 != null) {
            setShowBuildings(bool6.booleanValue());
        }
        Boolean bool7 = this.f24878e1;
        if (bool7 != null) {
            setShowsIndoorLevelPicker(bool7.booleanValue());
        }
        Boolean bool8 = this.f1;
        if (bool8 != null) {
            setShowIndoors(bool8.booleanValue());
        }
        Boolean bool9 = this.f24881g1;
        if (bool9 != null) {
            setScrollEnabled(bool9.booleanValue());
        }
        Boolean bool10 = this.f24882h1;
        if (bool10 != null) {
            setScrollDuringRotateOrZoomEnabled(bool10.booleanValue());
        }
        if (o()) {
            googleMap.setMyLocationEnabled(this.f24896q0);
            googleMap.setLocationSource(this.T0);
        }
        setShowsMyLocationButton(this.f24898r0);
        MarkerManager markerManager = new MarkerManager(googleMap);
        this.f24877e = markerManager;
        this.f24879f = markerManager.newCollection();
        PolylineManager polylineManager = new PolylineManager(googleMap);
        this.f24880g = polylineManager;
        this.f24883i = polylineManager.newCollection();
        PolygonManager polygonManager = new PolygonManager(googleMap);
        this.f24885j = polygonManager;
        this.f24891o = polygonManager.newCollection();
        this.f24893p = new CircleManager(googleMap).newCollection();
        GroundOverlayManager groundOverlayManager = new GroundOverlayManager(googleMap);
        this.t = groundOverlayManager;
        this.f24903v = groundOverlayManager.newCollection();
        this.f24879f.setInfoWindowAdapter(this);
        this.f24879f.setOnMarkerDragListener(this);
        this.f24870a.setOnIndoorStateChangeListener(this);
        ReadableMap readableMap = this.f24907x0;
        if (readableMap == null || this.f24844C0) {
            ReadableMap readableMap2 = this.f24908y0;
            if (readableMap2 != null) {
                r(readableMap2);
            } else {
                ReadableMap readableMap3 = this.f24909z0;
                if (readableMap3 == null || this.f24845D0) {
                    ReadableMap readableMap4 = this.f24840A0;
                    if (readableMap4 != null) {
                        q(h(readableMap4));
                    }
                } else {
                    q(h(readableMap3));
                    this.f24845D0 = true;
                }
            }
        } else {
            r(readableMap);
            this.f24844C0 = true;
        }
        if (this.f24842B0 != null) {
            this.f24870a.setMapStyle(new MapStyleOptions(this.f24842B0));
        }
        setPoiClickEnabled(this.f24906w0);
        int i7 = this.j1;
        if (i7 != 0 || this.f24888l1 != 0 || this.f24887k1 != 0 || this.f24889m1 != 0) {
            if (this.f24894p0) {
                e(i7, this.f24888l1, this.f24887k1, this.f24889m1);
            } else if (this.f24876d) {
                CameraUpdate cameraUpdateNewCameraPosition = CameraUpdateFactory.newCameraPosition(this.f24870a.getCameraPosition());
                this.f24870a.setPadding(this.j1, this.f24888l1, this.f24887k1, this.f24889m1);
                this.f24870a.moveCamera(cameraUpdateNewCameraPosition);
                this.f24876d = false;
            }
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        int id2 = getId();
        ThemedReactContext themedReactContext = this.f24864S0;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, id2);
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new p169l7.c(UIManagerHelper.getSurfaceId(themedReactContext), id2, writableNativeMap, 12));
        }
        googleMap.setOnMyLocationChangeListener(new A(this));
        this.f24879f.setOnMarkerClickListener(new B(this, this));
        this.f24891o.setOnPolygonClickListener(new C(this));
        this.f24883i.setOnPolylineClickListener(new D(this));
        this.f24879f.setOnInfoWindowClickListener(new u(this));
        googleMap.setOnMapClickListener(new E(this));
        googleMap.setOnMapLongClickListener(new F(this));
        this.f24903v.setOnGroundOverlayClickListener(new G(this));
        googleMap.setOnCameraMoveStartedListener(new v(this, googleMap));
        googleMap.setOnCameraMoveListener(new v(this, googleMap));
        googleMap.setOnCameraIdleListener(new GoogleMap.OnCameraIdleListener() { // from class: com.rnmaps.maps.w
            @Override // com.google.android.gms.maps.GoogleMap.OnCameraIdleListener
            public final void onCameraIdle() {
                MapView mapView = this.f24992a;
                boolean z3 = 1 == mapView.f24846E0;
                mapView.f24846E0 = -1;
                WritableNativeMap writableNativeMapA = p169l7.c.a(googleMap.getProjection().getVisibleRegion().latLngBounds, z3);
                int id3 = mapView.getId();
                ThemedReactContext themedReactContext2 = mapView.f24864S0;
                EventDispatcher eventDispatcherForReactTag2 = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext2, id3);
                if (eventDispatcherForReactTag2 != null) {
                    eventDispatcherForReactTag2.dispatchEvent(new p169l7.c(UIManagerHelper.getSurfaceId(themedReactContext2), id3, writableNativeMapA, 22));
                }
            }
        });
        googleMap.setOnMapLoadedCallback(new u(this));
        googleMap.setTrafficEnabled(this.f24900s0);
        this.f24849H = Boolean.TRUE;
        String str = this.f24884i1;
        if (str != null) {
            setKmlSrc(str);
            this.f24884i1 = null;
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public final void onMarkerDrag(Marker marker) {
        WritableNativeMap writableNativeMapP = p(marker.getPosition());
        int id2 = getId();
        ThemedReactContext themedReactContext = this.f24864S0;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, id2);
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new p169l7.c(UIManagerHelper.getSurfaceId(themedReactContext), id2, writableNativeMapP, 15));
        }
        MapMarker mapMarkerN = n(marker);
        WritableNativeMap writableNativeMapP2 = p(marker.getPosition());
        ThemedReactContext themedReactContext2 = mapMarkerN.f24787w;
        EventDispatcher eventDispatcherForReactTag2 = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext2, mapMarkerN.getId());
        if (eventDispatcherForReactTag2 != null) {
            eventDispatcherForReactTag2.dispatchEvent(new p169l7.c(UIManagerHelper.getSurfaceId(themedReactContext2), mapMarkerN.getId(), writableNativeMapP2, 5));
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public final void onMarkerDragEnd(Marker marker) {
        WritableNativeMap writableNativeMapP = p(marker.getPosition());
        int id2 = getId();
        ThemedReactContext themedReactContext = this.f24864S0;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, id2);
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new p169l7.c(UIManagerHelper.getSurfaceId(themedReactContext), id2, writableNativeMapP, 14));
        }
        MapMarker mapMarkerN = n(marker);
        WritableNativeMap writableNativeMapP2 = p(marker.getPosition());
        ThemedReactContext themedReactContext2 = mapMarkerN.f24787w;
        EventDispatcher eventDispatcherForReactTag2 = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext2, mapMarkerN.getId());
        if (eventDispatcherForReactTag2 != null) {
            eventDispatcherForReactTag2.dispatchEvent(new p169l7.c(UIManagerHelper.getSurfaceId(themedReactContext2), mapMarkerN.getId(), writableNativeMapP2, 4));
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public final void onMarkerDragStart(Marker marker) {
        WritableNativeMap writableNativeMapP = p(marker.getPosition());
        int id2 = getId();
        ThemedReactContext themedReactContext = this.f24864S0;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, id2);
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new p169l7.c(UIManagerHelper.getSurfaceId(themedReactContext), id2, writableNativeMapP, 16));
        }
        MapMarker mapMarkerN = n(marker);
        WritableNativeMap writableNativeMapP2 = p(marker.getPosition());
        ThemedReactContext themedReactContext2 = mapMarkerN.f24787w;
        EventDispatcher eventDispatcherForReactTag2 = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext2, mapMarkerN.getId());
        if (eventDispatcherForReactTag2 != null) {
            eventDispatcherForReactTag2.dispatchEvent(new p169l7.c(UIManagerHelper.getSurfaceId(themedReactContext2), mapMarkerN.getId(), writableNativeMapP2, 6));
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        GoogleMap googleMap;
        if (o() && (googleMap = this.f24870a) != null) {
            googleMap.setMyLocationEnabled(false);
        }
        synchronized (this) {
            try {
                if (!this.f24862Q0) {
                    super.onPause();
                    onPause();
                    this.f24862Q0 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnPoiClickListener
    public final void onPoiClick(PointOfInterest pointOfInterest) {
        WritableNativeMap writableNativeMapP = p(pointOfInterest.latLng);
        writableNativeMapP.putString("placeId", pointOfInterest.placeId);
        writableNativeMapP.putString("name", pointOfInterest.name);
        int id2 = getId();
        ThemedReactContext themedReactContext = this.f24864S0;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, id2);
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new p169l7.c(UIManagerHelper.getSurfaceId(themedReactContext), id2, writableNativeMapP, 20));
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        GoogleMap googleMap;
        if (o() && (googleMap = this.f24870a) != null) {
            googleMap.setMyLocationEnabled(this.f24896q0);
            this.f24870a.setLocationSource(this.T0);
        }
        synchronized (this) {
            try {
                if (!this.f24863R0) {
                    onResume();
                }
                this.f24862Q0 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        super.onStart();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        super.onStop();
    }

    public final WritableNativeMap p(LatLng latLng) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putDouble("latitude", latLng.latitude);
        writableNativeMap2.putDouble("longitude", latLng.longitude);
        writableNativeMap.putMap("coordinate", writableNativeMap2);
        Point screenLocation = this.f24870a.getProjection().toScreenLocation(latLng);
        WritableNativeMap writableNativeMap3 = new WritableNativeMap();
        writableNativeMap3.putDouble("x", screenLocation.x);
        writableNativeMap3.putDouble("y", screenLocation.y);
        writableNativeMap.putMap(ViewProps.POSITION, writableNativeMap3);
        return writableNativeMap;
    }

    public final void q(CameraPosition cameraPosition) {
        if (cameraPosition == null) {
            return;
        }
        CameraUpdate cameraUpdateNewCameraPosition = CameraUpdateFactory.newCameraPosition(cameraPosition);
        if (super.getHeight() <= 0 || super.getWidth() <= 0) {
            this.f24886k0 = cameraUpdateNewCameraPosition;
        } else {
            this.f24870a.moveCamera(cameraUpdateNewCameraPosition);
            this.f24886k0 = null;
        }
    }

    public final void r(ReadableMap readableMap) {
        LatLngBounds latLngBounds;
        if (readableMap == null) {
            latLngBounds = null;
        } else {
            double d2 = readableMap.getDouble("longitude");
            double d10 = readableMap.getDouble("latitude");
            double d11 = readableMap.getDouble("longitudeDelta");
            double d12 = readableMap.getDouble("latitudeDelta") / 2.0d;
            double d13 = d11 / 2.0d;
            latLngBounds = new LatLngBounds(new LatLng(d10 - d12, d2 - d13), new LatLng(d10 + d12, d2 + d13));
        }
        if (latLngBounds == null) {
            return;
        }
        double d14 = readableMap.getDouble("longitude");
        double d15 = readableMap.getDouble("latitude");
        if (super.getHeight() <= 0 || super.getWidth() <= 0) {
            this.f24870a.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(d15, d14), 10.0f));
            this.f24861Q = latLngBounds;
        } else {
            this.f24870a.moveCamera(CameraUpdateFactory.newLatLngBounds(latLngBounds, 0));
            this.f24861Q = null;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        post(this.f24899r1);
    }

    public final void s() {
        this.f24865U0 = new ViewAttacherGroup(this.f24864S0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
        layoutParams.width = 0;
        layoutParams.height = 0;
        layoutParams.leftMargin = 99999999;
        layoutParams.topMargin = 99999999;
        this.f24865U0.setLayoutParams(layoutParams);
        addView(this.f24865U0);
    }

    public void setCacheEnabled(boolean z3) {
        this.f24904v0 = z3;
        f();
    }

    public void setCamera(ReadableMap readableMap) {
        this.f24840A0 = readableMap;
        if (readableMap == null || this.f24870a == null) {
            return;
        }
        q(h(readableMap));
    }

    public void setHandlePanDrag(boolean z3) {
        this.f24901t0 = z3;
    }

    public void setIndoorActiveLevelIndex(int i7) {
        IndoorLevel indoorLevel;
        IndoorBuilding focusedBuilding = this.f24870a.getFocusedBuilding();
        if (focusedBuilding == null || i7 < 0 || i7 >= focusedBuilding.getLevels().size() || (indoorLevel = focusedBuilding.getLevels().get(i7)) == null) {
            return;
        }
        indoorLevel.activate();
    }

    public void setInitialCamera(ReadableMap readableMap) {
        this.f24909z0 = readableMap;
        if (this.f24845D0 || this.f24870a == null) {
            return;
        }
        q(h(readableMap));
        this.f24845D0 = true;
    }

    public void setInitialCameraSet(boolean z3) {
        this.f24845D0 = z3;
    }

    public void setInitialRegion(ReadableMap readableMap) {
        this.f24907x0 = readableMap;
        if (this.f24844C0 || this.f24870a == null) {
            return;
        }
        r(readableMap);
        this.f24844C0 = true;
    }

    public void setKmlSrc(String str) {
        if (!this.f24849H.booleanValue()) {
            this.f24884i1 = str;
            return;
        }
        try {
            ThemedReactContext themedReactContext = this.f24864S0;
            p012ad.f fVar = new p012ad.f(1);
            fVar.f11897b = themedReactContext;
            InputStream inputStream = (InputStream) fVar.execute(str).get();
            if (inputStream == null) {
                return;
            }
            KmlLayer kmlLayer = new KmlLayer(this.f24870a, inputStream, this.f24864S0, this.f24877e, this.f24885j, this.f24880g, this.t, (Renderer.ImagesCache) null);
            kmlLayer.addLayerToMap();
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            if (kmlLayer.getContainers() == null) {
                i(writableNativeMap, new com.palmpay.lib.bridgewrapper.photo.upload.a(8));
                return;
            }
            KmlContainer next = kmlLayer.getContainers().iterator().next();
            if (next != null && next.getContainers() != null) {
                if (next.getContainers().iterator().hasNext()) {
                    next = next.getContainers().iterator().next();
                }
                for (KmlPlacemark kmlPlacemark : next.getPlacemarks()) {
                    MarkerOptions markerOptions = new MarkerOptions();
                    if (kmlPlacemark.getInlineStyle() != null) {
                        markerOptions = kmlPlacemark.getMarkerOptions();
                    } else {
                        markerOptions.icon(BitmapDescriptorFactory.defaultMarker());
                    }
                    LatLng latLng = (LatLng) kmlPlacemark.getGeometry().getGeometryObject();
                    String property = "";
                    String property2 = kmlPlacemark.hasProperty("name") ? kmlPlacemark.getProperty("name") : "";
                    if (kmlPlacemark.hasProperty("description")) {
                        property = kmlPlacemark.getProperty("description");
                    }
                    markerOptions.position(latLng);
                    markerOptions.title(property2);
                    markerOptions.snippet(property);
                }
                writableNativeMap.putArray("markers", writableNativeArray);
                i(new WritableNativeMap(), new com.palmpay.lib.bridgewrapper.photo.upload.a(8));
                return;
            }
            i(writableNativeMap, new com.palmpay.lib.bridgewrapper.photo.upload.a(8));
        } catch (IOException e10) {
            e = e10;
            e.printStackTrace();
        } catch (InterruptedException e11) {
            e = e11;
            e.printStackTrace();
        } catch (ExecutionException e12) {
            e = e12;
            e.printStackTrace();
        } catch (XmlPullParserException e13) {
            e = e13;
            e.printStackTrace();
        }
    }

    public void setLoadingBackgroundColor(Integer num) {
        this.f24854L = num;
        RelativeLayout relativeLayout = this.f24839A;
        if (relativeLayout != null) {
            if (num == null) {
                relativeLayout.setBackgroundColor(-1);
            } else {
                relativeLayout.setBackgroundColor(num.intValue());
            }
        }
    }

    public void setLoadingEnabled(boolean z3) {
        if (!z3 || this.f24843C.booleanValue()) {
            return;
        }
        getMapLoadingLayoutView().setVisibility(0);
    }

    public void setLoadingIndicatorColor(Integer num) {
        this.f24856M = num;
        if (this.f24905w != null) {
            if (num == null) {
                Color.parseColor("#606060");
            }
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(num.intValue());
            ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(num.intValue());
            ColorStateList colorStateListValueOf3 = ColorStateList.valueOf(num.intValue());
            this.f24905w.setProgressTintList(colorStateListValueOf);
            this.f24905w.setSecondaryProgressTintList(colorStateListValueOf2);
            this.f24905w.setIndeterminateTintList(colorStateListValueOf3);
        }
    }

    public void setMapStyle(@Nullable String str) {
        this.f24842B0 = str;
        GoogleMap googleMap = this.f24870a;
        if (googleMap == null || str == null) {
            return;
        }
        googleMap.setMapStyle(new MapStyleOptions(str));
    }

    public void setMapType(int i7) {
        GoogleMap googleMap = this.f24870a;
        if (googleMap != null) {
            googleMap.setMapType(i7);
        }
    }

    public void setMaxZoomLevel(float f10) {
        this.f24867W0 = Float.valueOf(f10);
        GoogleMap googleMap = this.f24870a;
        if (googleMap != null) {
            googleMap.setMaxZoomPreference(f10);
        }
    }

    public void setMinZoomLevel(float f10) {
        this.f24868X0 = Float.valueOf(f10);
        GoogleMap googleMap = this.f24870a;
        if (googleMap != null) {
            googleMap.setMinZoomPreference(f10);
        }
    }

    public void setMoveOnMarkerPress(boolean z3) {
        this.f24902u0 = z3;
    }

    public void setPitchEnabled(boolean z3) {
        this.f24869Y0 = Boolean.valueOf(z3);
        GoogleMap googleMap = this.f24870a;
        if (googleMap != null) {
            googleMap.getUiSettings().setTiltGesturesEnabled(z3);
        }
    }

    public void setPoiClickEnabled(boolean z3) {
        this.f24906w0 = z3;
        GoogleMap googleMap = this.f24870a;
        if (googleMap != null) {
            googleMap.setOnPoiClickListener(z3 ? this : null);
        }
    }

    public void setRegion(ReadableMap readableMap) {
        this.f24908y0 = readableMap;
        if (readableMap == null || this.f24870a == null) {
            return;
        }
        r(readableMap);
    }

    public void setRotateEnabled(boolean z3) {
        this.f24871a1 = Boolean.valueOf(z3);
        GoogleMap googleMap = this.f24870a;
        if (googleMap != null) {
            googleMap.getUiSettings().setRotateGesturesEnabled(z3);
        }
    }

    public void setScrollDuringRotateOrZoomEnabled(boolean z3) {
        this.f24882h1 = Boolean.valueOf(z3);
        GoogleMap googleMap = this.f24870a;
        if (googleMap != null) {
            googleMap.getUiSettings().setScrollGesturesEnabledDuringRotateOrZoom(z3);
        }
    }

    public void setScrollEnabled(boolean z3) {
        this.f24881g1 = Boolean.valueOf(z3);
        GoogleMap googleMap = this.f24870a;
        if (googleMap != null) {
            googleMap.getUiSettings().setScrollGesturesEnabled(z3);
        }
    }

    public void setShowBuildings(boolean z3) {
        this.d1 = Boolean.valueOf(z3);
        GoogleMap googleMap = this.f24870a;
        if (googleMap != null) {
            googleMap.setBuildingsEnabled(z3);
        }
    }

    public void setShowIndoors(boolean z3) {
        this.f1 = Boolean.valueOf(z3);
        GoogleMap googleMap = this.f24870a;
        if (googleMap != null) {
            googleMap.setIndoorEnabled(z3);
        }
    }

    public void setShowsCompass(boolean z3) {
        this.Z0 = Boolean.valueOf(z3);
        GoogleMap googleMap = this.f24870a;
        if (googleMap != null) {
            googleMap.getUiSettings().setCompassEnabled(z3);
        }
    }

    public void setShowsIndoorLevelPicker(boolean z3) {
        this.f24878e1 = Boolean.valueOf(z3);
        GoogleMap googleMap = this.f24870a;
        if (googleMap != null) {
            googleMap.getUiSettings().setIndoorLevelPickerEnabled(z3);
        }
    }

    public void setShowsMyLocationButton(boolean z3) {
        this.f24898r0 = z3;
        if (this.f24870a != null) {
            if (o() || !z3) {
                this.f24870a.getUiSettings().setMyLocationButtonEnabled(z3);
            }
        }
    }

    public void setShowsTraffic(boolean z3) {
        this.f24900s0 = z3;
        GoogleMap googleMap = this.f24870a;
        if (googleMap != null) {
            googleMap.setTrafficEnabled(z3);
        }
    }

    public void setShowsUserLocation(boolean z3) {
        GoogleMap googleMap;
        this.f24896q0 = z3;
        if (!o() || (googleMap = this.f24870a) == null) {
            return;
        }
        googleMap.setLocationSource(this.T0);
        this.f24870a.setMyLocationEnabled(z3);
    }

    public void setToolbarEnabled(boolean z3) {
        if (this.f24870a != null) {
            if (o() || !z3) {
                this.f24870a.getUiSettings().setMapToolbarEnabled(z3);
            }
        }
    }

    public void setUserLocationFastestInterval(int i7) {
        this.T0.f24914b.setFastestInterval(i7);
    }

    public void setUserLocationPriority(int i7) {
        this.T0.f24914b.setPriority(i7);
    }

    public void setUserLocationUpdateInterval(int i7) {
        this.T0.f24914b.setInterval(i7);
    }

    public void setZoomControlEnabled(boolean z3) {
        this.f24875c1 = Boolean.valueOf(z3);
        GoogleMap googleMap = this.f24870a;
        if (googleMap != null) {
            googleMap.getUiSettings().setZoomControlsEnabled(z3);
        }
    }

    public void setZoomEnabled(boolean z3) {
        this.f24873b1 = Boolean.valueOf(z3);
        GoogleMap googleMap = this.f24870a;
        if (googleMap != null) {
            googleMap.getUiSettings().setZoomGesturesEnabled(z3);
        }
    }

    public final void t(int i7) {
        MapFeature mapFeature = (MapFeature) this.f24851I0.remove(i7);
        if (mapFeature instanceof MapMarker) {
            this.f24852J0.remove(mapFeature.getFeature());
            mapFeature.b(this.f24879f);
            ViewAttacherGroup viewAttacherGroup = this.f24865U0;
            if (viewAttacherGroup == null || mapFeature == null) {
                return;
            }
            viewAttacherGroup.removeView(mapFeature);
            return;
        }
        if (mapFeature instanceof MapHeatmap) {
            this.f24858N0.remove(mapFeature.getFeature());
            mapFeature.b(this.f24870a);
            return;
        }
        if (mapFeature instanceof MapCircle) {
            mapFeature.b(this.f24893p);
            return;
        }
        if (mapFeature instanceof MapOverlay) {
            mapFeature.b(this.f24903v);
            return;
        }
        if (mapFeature instanceof MapPolygon) {
            mapFeature.b(this.f24891o);
        } else if (mapFeature instanceof MapPolyline) {
            mapFeature.b(this.f24883i);
        } else if (mapFeature != null) {
            mapFeature.b(this.f24870a);
        }
    }

    public final void u(int i7, MapFeature mapFeature) {
        if (!this.f24862Q0) {
            ArrayList arrayList = this.f24851I0;
            if (arrayList.size() >= i7) {
                while (arrayList.size() <= i7) {
                    arrayList.add(null);
                }
                arrayList.set(i7, mapFeature);
                return;
            }
        }
        if (this.f24874c == null) {
            this.f24874c = new ArrayList();
        }
        while (this.f24874c.size() <= i7) {
            this.f24874c.add(null);
        }
        this.f24874c.set(i7, mapFeature);
    }

    public final void w(Object obj) {
        if (this.f24894p0 && super.getHeight() > 0 && super.getWidth() > 0) {
            CameraUpdate cameraUpdateNewCameraPosition = CameraUpdateFactory.newCameraPosition(this.f24870a.getCameraPosition());
            this.f24870a.setPadding(this.f24890n1 + this.j1, this.f24895p1 + this.f24888l1, this.f24892o1 + this.f24887k1, this.f24897q1 + this.f24889m1);
            this.f24870a.moveCamera(cameraUpdateNewCameraPosition);
            this.f24870a.setPadding(this.j1, this.f24888l1, this.f24887k1, this.f24889m1);
            this.f24894p0 = false;
        }
        if (this.f24861Q == null) {
            CameraUpdate cameraUpdate = this.f24886k0;
            if (cameraUpdate != null) {
                this.f24870a.moveCamera(cameraUpdate);
                this.f24886k0 = null;
                return;
            }
            return;
        }
        HashMap map = (HashMap) obj;
        int iIntValue = map.get("width") == null ? 0 : ((Float) map.get("width")).intValue();
        int iIntValue2 = map.get("height") == null ? 0 : ((Float) map.get("height")).intValue();
        if (iIntValue <= 0 || iIntValue2 <= 0) {
            this.f24870a.moveCamera(CameraUpdateFactory.newLatLngBounds(this.f24861Q, 0));
        } else {
            this.f24870a.moveCamera(CameraUpdateFactory.newLatLngBounds(this.f24861Q, iIntValue, iIntValue2, 0));
        }
        this.f24861Q = null;
        this.f24886k0 = null;
    }
}
