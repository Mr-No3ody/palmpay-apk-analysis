package com.rnmaps.maps;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Property;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.drawee.view.DraweeView;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.Event;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.collections.MarkerManager;
import java.lang.ref.SoftReference;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class MapMarker extends MapFeature {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f24755A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final J2.b f24756A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public BitmapDescriptor f24757B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public ImageManager.OnImageLoadedListener f24758B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Bitmap f24759C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public p360y2.b f24760C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final C1451f f24761D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public Bitmap f24762E0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f24763H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f24764L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f24765M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f24766Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MarkerOptions f24767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Marker f24768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f24771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LatLng f24772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f24773g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f24774i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f24775j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public float f24776k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f24777o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f24778p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public float f24779p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f24780q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f24781r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f24782s0;
    public MapCallout t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f24783t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f24784u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LinearLayout f24785v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f24786v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ThemedReactContext f24787w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final MapMarkerManager f24788w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public String f24789x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f24790y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public SoftReference f24791z0;

    @FunctionalInterface
    public interface EventCreator<T extends Event> {
        T create(int i7, int i10, WritableMap writableMap);
    }

    public MapMarker(ThemedReactContext themedReactContext, MapMarkerManager mapMarkerManager) {
        super(themedReactContext);
        this.f24755A = 0.0f;
        this.f24763H = 0.0f;
        this.f24764L = false;
        this.f24765M = false;
        this.f24766Q = 0;
        this.f24776k0 = 1.0f;
        this.f24782s0 = 0;
        this.f24783t0 = true;
        this.f24784u0 = false;
        this.f24786v0 = false;
        this.f24761D0 = new C1451f(this);
        this.f24762E0 = null;
        this.f24787w = themedReactContext;
        this.f24788w0 = mapMarkerManager;
        I2.b bVar = new I2.b(getResources());
        bVar.f3984l = com.facebook.drawee.drawable.o.f21333f;
        bVar.f3974b = 0;
        J2.b bVar2 = new J2.b(bVar.a());
        this.f24756A0 = bVar2;
        bVar2.e();
    }

    public static Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        MapBuilder.Builder builder = MapBuilder.builder();
        builder.put("topPress", MapBuilder.of("registrationName", "topPress"));
        return builder.build();
    }

    public static Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.of("topSelect", MapBuilder.of("registrationName", "topSelect"), "topDeselect", MapBuilder.of("registrationName", "topDeselect"), "topDrag", MapBuilder.of("registrationName", "topDrag"), "topDragStart", MapBuilder.of("registrationName", "topDragStart"), "topDragEnd", MapBuilder.of("registrationName", "topDragEnd"));
    }

    private BitmapDescriptor getIcon() {
        if (!this.f24786v0) {
            BitmapDescriptor bitmapDescriptor = this.f24757B;
            return bitmapDescriptor != null ? bitmapDescriptor : BitmapDescriptorFactory.defaultMarker(this.f24755A);
        }
        if (this.f24757B == null) {
            return BitmapDescriptorFactory.fromBitmap(d());
        }
        Bitmap bitmapD = d();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(this.f24759C.getWidth(), bitmapD.getWidth()), Math.max(this.f24759C.getHeight(), bitmapD.getHeight()), this.f24759C.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(this.f24759C, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(bitmapD, 0.0f, 0.0f, (Paint) null);
        return BitmapDescriptorFactory.fromBitmap(bitmapCreateBitmap);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7) {
        super.addView(view, i7);
        if (!(view instanceof MapCallout)) {
            this.f24786v0 = true;
            h();
            if (view instanceof DraweeView) {
                try {
                    DraweeView draweeView = (DraweeView) view;
                    Method declaredMethod = DraweeView.class.getDeclaredMethod("onAttachedToWindow", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(view, new Object[0]);
                    Handler handler = new Handler(Looper.getMainLooper());
                    if (draweeView.getController() instanceof F2.c) {
                        F2.c cVar = (F2.c) draweeView.getController();
                        C1454i listener = new C1454i(this, handler, draweeView);
                        S2.g gVar = cVar.f2538e;
                        synchronized (gVar) {
                            Intrinsics.checkNotNullParameter(listener, "listener");
                            gVar.f8656b.add(listener);
                        }
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        f(true);
    }

    @Override // com.rnmaps.maps.MapFeature
    public final void b(Object obj) {
        Marker marker = this.f24768b;
        if (marker == null) {
            return;
        }
        ((MarkerManager.Collection) obj).remove(marker);
        this.f24768b = null;
        h();
    }

    public final void c(LatLng latLng, Integer num) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f24768b, (Property<Marker, V>) Property.of(Marker.class, LatLng.class, ViewProps.POSITION), new C1452g(this), latLng);
        objectAnimatorOfObject.setDuration(num.intValue());
        objectAnimatorOfObject.start();
    }

    public final Bitmap d() {
        int i7 = this.f24769c;
        if (i7 <= 0) {
            i7 = 100;
        }
        int i10 = this.f24770d;
        int i11 = i10 > 0 ? i10 : 100;
        Bitmap bitmapCreateBitmap = this.f24762E0;
        if (bitmapCreateBitmap == null || bitmapCreateBitmap.isRecycled() || bitmapCreateBitmap.getWidth() != i7 || bitmapCreateBitmap.getHeight() != i11) {
            bitmapCreateBitmap = Bitmap.createBitmap(i7, i11, Bitmap.Config.ARGB_8888);
            this.f24762E0 = bitmapCreateBitmap;
        } else {
            bitmapCreateBitmap.eraseColor(0);
        }
        draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public final void e(double d2, double d10) {
        this.f24775j = true;
        float f10 = (float) d2;
        this.f24777o = f10;
        float f11 = (float) d10;
        this.f24778p = f11;
        Marker marker = this.f24768b;
        if (marker != null) {
            marker.setAnchor(f10, f11);
        }
        f(false);
    }

    public final void f(boolean z3) {
        if (this.f24768b == null) {
            return;
        }
        if (z3) {
            g();
        }
        if (this.f24775j) {
            this.f24768b.setAnchor(this.f24777o, this.f24778p);
        } else {
            this.f24768b.setAnchor(0.5f, 1.0f);
        }
        if (this.f24781r0) {
            this.f24768b.setInfoWindowAnchor(this.f24779p0, this.f24780q0);
        } else {
            this.f24768b.setInfoWindowAnchor(0.5f, 0.0f);
        }
        this.f24782s0++;
    }

    public final void g() {
        Marker marker = this.f24768b;
        if (marker == null) {
            return;
        }
        marker.setIcon(getIcon());
    }

    public View getCallout() {
        if (this.t == null) {
            return null;
        }
        if (this.f24785v == null) {
            i();
        }
        if (this.t.getTooltip()) {
            return this.f24785v;
        }
        return null;
    }

    public MapCallout getCalloutView() {
        return this.t;
    }

    @Override // com.rnmaps.maps.MapFeature
    public Object getFeature() {
        return this.f24768b;
    }

    public String getIdentifier() {
        return this.f24771e;
    }

    public ImageManager.OnImageLoadedListener getImageLoadedListener() {
        return this.f24758B0;
    }

    public View getInfoContents() {
        if (this.t == null) {
            return null;
        }
        if (this.f24785v == null) {
            i();
        }
        if (this.t.getTooltip()) {
            return null;
        }
        return this.f24785v;
    }

    public MarkerOptions getMarkerOptions() {
        if (this.f24767a == null) {
            this.f24767a = new MarkerOptions();
        }
        MarkerOptions markerOptions = this.f24767a;
        markerOptions.position(this.f24772f);
        if (this.f24775j) {
            markerOptions.anchor(this.f24777o, this.f24778p);
        }
        if (this.f24781r0) {
            markerOptions.infoWindowAnchor(this.f24779p0, this.f24780q0);
        }
        markerOptions.title(this.f24773g);
        markerOptions.snippet(this.f24774i);
        markerOptions.rotation(this.f24763H);
        markerOptions.flat(this.f24764L);
        markerOptions.draggable(this.f24765M);
        markerOptions.zIndex(this.f24766Q);
        markerOptions.alpha(this.f24776k0);
        markerOptions.icon(getIcon());
        return this.f24767a;
    }

    public LatLng getPosition() {
        return this.f24772f;
    }

    public final void h() {
        boolean z3 = this.f24783t0 && this.f24786v0 && this.f24768b != null;
        if (z3 == this.f24784u0) {
            return;
        }
        this.f24784u0 = z3;
        if (!z3) {
            ((LinkedList) M.a().f24720c).remove(this);
            g();
            return;
        }
        M mA = M.a();
        ((LinkedList) mA.f24720c).add(this);
        if (mA.f24718a) {
            return;
        }
        mA.f24718a = true;
        ((Handler) mA.f24719b).postDelayed((androidx.customview.widget.e) mA.f24722e, 40L);
    }

    public final void i() {
        MapCallout mapCallout = this.t;
        if (mapCallout == null || mapCallout.getChildCount() == 0) {
            return;
        }
        ThemedReactContext themedReactContext = this.f24787w;
        LinearLayout linearLayout = new LinearLayout(themedReactContext);
        linearLayout.setOrientation(1);
        MapCallout mapCallout2 = this.t;
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(mapCallout2.f24724b, mapCallout2.f24725c, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(themedReactContext);
        linearLayout2.setOrientation(0);
        MapCallout mapCallout3 = this.t;
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(mapCallout3.f24724b, mapCallout3.f24725c, 0.0f));
        linearLayout.addView(linearLayout2);
        linearLayout2.addView(this.t);
        this.f24785v = linearLayout;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        super.onLayout(z3, i7, i10, i11, i12);
        this.f24770d = i12 - i10;
        this.f24769c = i11 - i7;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        if (getChildCount() != 0) {
            if ((getChildAt(0) instanceof MapCallout) || this.f24782s0 != 0) {
                return;
            }
            this.f24782s0 = 1;
            h();
            return;
        }
        if (this.f24786v0) {
            this.f24786v0 = false;
            this.f24762E0 = null;
            h();
            f(true);
        }
    }

    public void setCalloutView(MapCallout mapCallout) {
        this.t = mapCallout;
    }

    public void setCoordinate(ReadableMap readableMap) {
        setCoordinate(new LatLng(readableMap.getDouble("latitude"), readableMap.getDouble("longitude")));
    }

    public void setDraggable(boolean z3) {
        this.f24765M = z3;
        Marker marker = this.f24768b;
        if (marker != null) {
            marker.setDraggable(z3);
        }
        f(false);
    }

    public void setFlat(boolean z3) {
        this.f24764L = z3;
        Marker marker = this.f24768b;
        if (marker != null) {
            marker.setFlat(z3);
        }
        f(false);
    }

    public void setIconBitmap(Bitmap bitmap) {
        this.f24759C = bitmap;
    }

    public void setIdentifier(String str) {
        this.f24771e = str;
        f(false);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0053  */
    public void setImage(String str) {
        boolean z3;
        MapMarkerManager mapMarkerManager = this.f24788w0;
        if (mapMarkerManager == null) {
            z3 = true;
        } else {
            String str2 = this.f24789x0;
            if (str2 != null) {
                C1455j sharedIcon = mapMarkerManager.getSharedIcon(str2);
                synchronized (sharedIcon) {
                    sharedIcon.f24938c.remove(this);
                }
                this.f24788w0.removeSharedIconIfEmpty(this.f24789x0);
            }
            if (str != null) {
                C1455j sharedIcon2 = this.f24788w0.getSharedIcon(str);
                synchronized (sharedIcon2) {
                    sharedIcon2.f24938c.put(this, Boolean.TRUE);
                    BitmapDescriptor bitmapDescriptor = sharedIcon2.f24936a;
                    if (bitmapDescriptor != null) {
                        Bitmap bitmap = sharedIcon2.f24937b;
                        this.f24757B = bitmapDescriptor;
                        this.f24759C = bitmap;
                        f(true);
                    }
                }
                synchronized (sharedIcon2) {
                    if (sharedIcon2.f24939d) {
                        z3 = false;
                    } else {
                        sharedIcon2.f24939d = true;
                        z3 = true;
                    }
                }
            } else {
                z3 = true;
            }
        }
        this.f24789x0 = str;
        if (z3) {
            if (str == null) {
                this.f24757B = null;
                f(true);
                return;
            }
            if (str.startsWith("http://") || str.startsWith("https://") || str.startsWith("file://") || str.startsWith("asset://") || str.startsWith("data:")) {
                com.facebook.imagepipeline.request.d dVarA = com.facebook.imagepipeline.request.e.d(Uri.parse(str)).a();
                this.f24760C0 = p118hf.a.w().a(dVarA, this);
                C2.b bVar = p118hf.a.f37380c.get();
                bVar.f2561b = dVarA;
                bVar.f2563d = this.f24761D0;
                bVar.f2565f = this.f24756A0.f4487e;
                this.f24756A0.g(bVar.build());
                return;
            }
            this.f24757B = BitmapDescriptorFactory.fromResource(getResources().getIdentifier(str, "drawable", getContext().getPackageName()));
            int identifier = getResources().getIdentifier(str, "drawable", getContext().getPackageName());
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), identifier);
            this.f24759C = bitmapDecodeResource;
            if (bitmapDecodeResource == null) {
                Drawable drawable = getResources().getDrawable(identifier);
                this.f24759C = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                drawable.draw(new Canvas(this.f24759C));
            }
            MapMarkerManager mapMarkerManager2 = this.f24788w0;
            if (mapMarkerManager2 != null) {
                mapMarkerManager2.getSharedIcon(str).a(this.f24757B, this.f24759C);
            }
            f(true);
        }
    }

    public void setImageLoadedListener(ImageManager.OnImageLoadedListener onImageLoadedListener) {
        this.f24758B0 = onImageLoadedListener;
    }

    public void setMarkerHue(float f10) {
        this.f24755A = f10;
        f(true);
    }

    public void setOpacity(float f10) {
        this.f24776k0 = f10;
        Marker marker = this.f24768b;
        if (marker != null) {
            marker.setAlpha(f10);
        }
        f(false);
    }

    @Override // android.view.View
    public void setRotation(float f10) {
        this.f24763H = f10;
        Marker marker = this.f24768b;
        if (marker != null) {
            marker.setRotation(f10);
        }
        f(false);
    }

    public void setSnippet(String str) {
        this.f24774i = str;
        Marker marker = this.f24768b;
        if (marker != null) {
            marker.setSnippet(str);
        }
        f(false);
    }

    public void setTitle(String str) {
        this.f24773g = str;
        Marker marker = this.f24768b;
        if (marker != null) {
            marker.setTitle(str);
        }
        f(false);
    }

    public void setTracksViewChanges(boolean z3) {
        this.f24783t0 = z3;
        h();
    }

    public void setUpdated(boolean z3) {
        if (z3) {
            this.f24782s0++;
        } else {
            this.f24782s0 = 0;
        }
    }

    public void setZIndex(int i7) {
        this.f24766Q = i7;
        Marker marker = this.f24768b;
        if (marker != null) {
            marker.setZIndex(i7);
        }
        f(false);
    }

    public void setCoordinate(LatLng latLng) {
        this.f24772f = latLng;
        Marker marker = this.f24768b;
        if (marker != null) {
            marker.setPosition(latLng);
        }
        f(false);
    }

    public MapMarker(ThemedReactContext themedReactContext, MarkerOptions markerOptions) {
        super(themedReactContext);
        this.f24755A = 0.0f;
        this.f24763H = 0.0f;
        this.f24764L = false;
        this.f24765M = false;
        this.f24766Q = 0;
        this.f24776k0 = 1.0f;
        this.f24782s0 = 0;
        this.f24783t0 = true;
        this.f24784u0 = false;
        this.f24786v0 = false;
        this.f24761D0 = new C1451f(this);
        this.f24762E0 = null;
        this.f24787w = themedReactContext;
        this.f24788w0 = null;
        I2.b bVar = new I2.b(getResources());
        bVar.f3984l = com.facebook.drawee.drawable.o.f21333f;
        bVar.f3974b = 0;
        J2.b bVar2 = new J2.b(bVar.a());
        this.f24756A0 = bVar2;
        bVar2.e();
        this.f24772f = markerOptions.getPosition();
        e(markerOptions.getAnchorU(), markerOptions.getAnchorV());
        double infoWindowAnchorU = markerOptions.getInfoWindowAnchorU();
        double infoWindowAnchorV = markerOptions.getInfoWindowAnchorV();
        this.f24781r0 = true;
        float f10 = (float) infoWindowAnchorU;
        this.f24779p0 = f10;
        float f11 = (float) infoWindowAnchorV;
        this.f24780q0 = f11;
        Marker marker = this.f24768b;
        if (marker != null) {
            marker.setInfoWindowAnchor(f10, f11);
        }
        f(false);
        setTitle(markerOptions.getTitle());
        setSnippet(markerOptions.getSnippet());
        setRotation(markerOptions.getRotation());
        setFlat(markerOptions.isFlat());
        setDraggable(markerOptions.isDraggable());
        setZIndex(Math.round(markerOptions.getZIndex()));
        setOpacity(markerOptions.getAlpha());
        this.f24757B = markerOptions.getIcon();
    }
}
