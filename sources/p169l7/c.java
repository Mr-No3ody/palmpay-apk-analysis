package p169l7;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.Event;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.api.Service;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WritableMap f39284b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i7, int i10, WritableMap writableMap, int i11) {
        super(i7, i10);
        this.f39283a = i11;
        this.f39284b = writableMap;
    }

    public static WritableNativeMap a(LatLngBounds latLngBounds, boolean z3) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        LatLng center = latLngBounds.getCenter();
        writableNativeMap2.putDouble("latitude", center.latitude);
        writableNativeMap2.putDouble("longitude", center.longitude);
        writableNativeMap2.putDouble("latitudeDelta", latLngBounds.northeast.latitude - latLngBounds.southwest.latitude);
        writableNativeMap2.putDouble("longitudeDelta", latLngBounds.northeast.longitude - latLngBounds.southwest.longitude);
        writableNativeMap.putMap("region", writableNativeMap2);
        writableNativeMap.putBoolean("isGesture", z3);
        return writableNativeMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final WritableMap getEventData() {
        switch (this.f39283a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                break;
        }
        return this.f39284b;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public final String getEventName() {
        switch (this.f39283a) {
            case 0:
                return "scanResult";
            case 1:
                return "topCalloutPress";
            case 2:
                return "topDeselect";
            case 3:
                return "topDoublePress";
            case 4:
                return "topDragEnd";
            case 5:
                return "topDrag";
            case 6:
                return "topDragStart";
            case 7:
                return "topIndoorBuildingFocused";
            case 8:
                return "topIndoorLevelActivated";
            case 9:
                return "topKmlReady";
            case 10:
                return "topLongPress";
            case 11:
                return "topMapLoaded";
            case 12:
                return "topMapReady";
            case 13:
                return "topMarkerDeselect";
            case 14:
                return "topMarkerDragEnd";
            case 15:
                return "topMarkerDrag";
            case 16:
                return "topMarkerDragStart";
            case 17:
                return "topMarkerPress";
            case 18:
                return "topMarkerSelect";
            case 19:
                return "topPanDrag";
            case 20:
                return "topPoiClick";
            case 21:
                return "topPress";
            case 22:
                return "topRegionChangeComplete";
            case 23:
                return "topRegionChange";
            case 24:
                return "topRegionChangeStart";
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return "topSelect";
            default:
                return "topUserLocationChange";
        }
    }
}
