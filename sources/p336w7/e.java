package p336w7;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;
import com.rnmaps.maps.MapView;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UIManager f43280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f43281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Promise f43282c;

    public e(UIManager uIManager, double d2, Promise promise) {
        this.f43280a = uIManager;
        this.f43281b = d2;
        this.f43282c = promise;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        GoogleMap googleMap;
        MapView mapView = (MapView) this.f43280a.resolveView((int) this.f43281b);
        Promise promise = this.f43282c;
        if (mapView == null || (googleMap = mapView.f24870a) == null) {
            promise.reject("E_MAP_CAMERA", "Cannot get camera position because map view is null");
            return;
        }
        CameraPosition cameraPosition = googleMap.getCameraPosition();
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putDouble("latitude", cameraPosition.target.latitude);
        writableMapCreateMap2.putDouble("longitude", cameraPosition.target.longitude);
        writableMapCreateMap.putMap("center", writableMapCreateMap2);
        writableMapCreateMap.putDouble("heading", cameraPosition.bearing);
        writableMapCreateMap.putDouble("pitch", cameraPosition.tilt);
        writableMapCreateMap.putDouble("zoom", cameraPosition.zoom);
        promise.resolve(writableMapCreateMap);
    }
}
