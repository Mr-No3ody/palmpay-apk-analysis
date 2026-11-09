package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface;
import com.google.android.material.navigation.NavigationBarView;
import com.google.api.Service;
import com.google.common.base.Ascii;
import com.google.protobuf.DescriptorProtos;
import com.transsnet.palmpay.core.config.BillBusinessType;
import com.transsnet.palmpay.core.dialog.ShareDialog;

/* JADX INFO: loaded from: classes.dex */
public class RNMapsMapViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNMapsMapViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNMapsMapViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: receiveCommand */
    public void kotlinCompat$receiveCommand(T t, String str, ReadableArray readableArray) {
        str.getClass();
        switch (str) {
            case "fitToSuppliedMarkers":
                ((RNMapsMapViewManagerInterface) this.mViewManager).fitToSuppliedMarkers(t, readableArray.getString(0), readableArray.getString(1), readableArray.getBoolean(2));
                break;
            case "setIndoorActiveLevelIndex":
                ((RNMapsMapViewManagerInterface) this.mViewManager).setIndoorActiveLevelIndex(t, readableArray.getInt(0));
                break;
            case "setCamera":
                ((RNMapsMapViewManagerInterface) this.mViewManager).setCamera(t, readableArray.getString(0));
                break;
            case "fitToElements":
                ((RNMapsMapViewManagerInterface) this.mViewManager).fitToElements(t, readableArray.getString(0), readableArray.getBoolean(1));
                break;
            case "animateCamera":
                ((RNMapsMapViewManagerInterface) this.mViewManager).animateCamera(t, readableArray.getString(0), readableArray.getInt(1));
                break;
            case "animateToRegion":
                ((RNMapsMapViewManagerInterface) this.mViewManager).animateToRegion(t, readableArray.getString(0), readableArray.getInt(1));
                break;
            case "fitToCoordinates":
                ((RNMapsMapViewManagerInterface) this.mViewManager).fitToCoordinates(t, readableArray.getString(0), readableArray.getString(1), readableArray.getBoolean(2));
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t, String str, @Nullable Object obj) {
        str.getClass();
        byte b7 = -1;
        switch (str.hashCode()) {
            case -1829317469:
                if (str.equals("userInterfaceStyle")) {
                    b7 = 0;
                }
                break;
            case -1782863279:
                if (str.equals("zoomTapEnabled")) {
                    b7 = 1;
                }
                break;
            case -1759547385:
                if (str.equals("showsTraffic")) {
                    b7 = 2;
                }
                break;
            case -1566201979:
                if (str.equals("cameraZoomRange")) {
                    b7 = 3;
                }
                break;
            case -1393473402:
                if (str.equals("minDelta")) {
                    b7 = 4;
                }
                break;
            case -1375324191:
                if (str.equals("pitchEnabled")) {
                    b7 = 5;
                }
                break;
            case -1367751899:
                if (str.equals("camera")) {
                    b7 = 6;
                }
                break;
            case -1267568177:
                if (str.equals("userLocationFastestInterval")) {
                    b7 = 7;
                }
                break;
            case -1151046732:
                if (str.equals("scrollEnabled")) {
                    b7 = 8;
                }
                break;
            case -1127683526:
                if (str.equals("kmlSrc")) {
                    b7 = 9;
                }
                break;
            case -1040869018:
                if (str.equals("rotateEnabled")) {
                    b7 = 10;
                }
                break;
            case -993771358:
                if (str.equals("followsUserLocation")) {
                    b7 = Ascii.VT;
                }
                break;
            case -934795532:
                if (str.equals("region")) {
                    b7 = Ascii.FF;
                }
                break;
            case -919980087:
                if (str.equals("showsBuildings")) {
                    b7 = Ascii.CR;
                }
                break;
            case -689983723:
                if (str.equals("mapPadding")) {
                    b7 = Ascii.SO;
                }
                break;
            case -628456567:
                if (str.equals("initialCamera")) {
                    b7 = Ascii.SI;
                }
                break;
            case -572752893:
                if (str.equals("poiClickEnabled")) {
                    b7 = Ascii.DLE;
                }
                break;
            case -513095866:
                if (str.equals("toolbarEnabled")) {
                    b7 = 17;
                }
                break;
            case -351898402:
                if (str.equals("googleMapId")) {
                    b7 = Ascii.DC2;
                }
                break;
            case -296636969:
                if (str.equals("zoomControlEnabled")) {
                    b7 = 19;
                }
                break;
            case -266033156:
                if (str.equals("pointsOfInterestFilter")) {
                    b7 = Ascii.DC4;
                }
                break;
            case -220452823:
                if (str.equals("handlePanDrag")) {
                    b7 = Ascii.NAK;
                }
                break;
            case -195500200:
                if (str.equals("initialRegion")) {
                    b7 = Ascii.SYN;
                }
                break;
            case -43140580:
                if (str.equals("googleRenderer")) {
                    b7 = Ascii.ETB;
                }
                break;
            case 5371973:
                if (str.equals("compassOffset")) {
                    b7 = Ascii.CAN;
                }
                break;
            case 104515312:
                if (str.equals("loadingIndicatorColor")) {
                    b7 = Ascii.EM;
                }
                break;
            case 120171641:
                if (str.equals("moveOnMarkerPress")) {
                    b7 = Ascii.SUB;
                }
                break;
            case 258247452:
                if (str.equals("showsCompass")) {
                    b7 = Ascii.ESC;
                }
                break;
            case 382723252:
                if (str.equals("maxDelta")) {
                    b7 = Ascii.FS;
                }
                break;
            case 397237599:
                if (str.equals("cacheEnabled")) {
                    b7 = Ascii.GS;
                }
                break;
            case 836737718:
                if (str.equals("mapType")) {
                    b7 = Ascii.RS;
                }
                break;
            case 844294999:
                if (str.equals("maxZoom")) {
                    b7 = Ascii.US;
                }
                break;
            case 875047705:
                if (str.equals("showsPointsOfInterests")) {
                    b7 = 32;
                }
                break;
            case 1064092997:
                if (str.equals("minZoom")) {
                    b7 = 33;
                }
                break;
            case 1100266704:
                if (str.equals("paddingAdjustmentBehavior")) {
                    b7 = 34;
                }
                break;
            case 1146474862:
                if (str.equals("userLocationUpdateInterval")) {
                    b7 = 35;
                }
                break;
            case 1174265046:
                if (str.equals("showsUserLocation")) {
                    b7 = 36;
                }
                break;
            case 1251345034:
                if (str.equals("showsIndoors")) {
                    b7 = 37;
                }
                break;
            case 1300116068:
                if (str.equals("userLocationPriority")) {
                    b7 = 38;
                }
                break;
            case 1316805545:
                if (str.equals("userLocationAnnotationTitle")) {
                    b7 = 39;
                }
                break;
            case 1327599912:
                if (str.equals("tintColor")) {
                    b7 = 40;
                }
                break;
            case 1360222065:
                if (str.equals("liteMode")) {
                    b7 = 41;
                }
                break;
            case 1381913122:
                if (str.equals("scrollDuringRotateOrZoomEnabled")) {
                    b7 = 42;
                }
                break;
            case 1668305364:
                if (str.equals("showsScale")) {
                    b7 = 43;
                }
                break;
            case 1755945966:
                if (str.equals("zoomEnabled")) {
                    b7 = 44;
                }
                break;
            case 1835773433:
                if (str.equals("loadingBackgroundColor")) {
                    b7 = 45;
                }
                break;
            case 1906749073:
                if (str.equals("legalLabelInsets")) {
                    b7 = 46;
                }
                break;
            case 2017177929:
                if (str.equals("showsMyLocationButton")) {
                    b7 = 47;
                }
                break;
            case 2028148329:
                if (str.equals("showsIndoorLevelPicker")) {
                    b7 = 48;
                }
                break;
            case 2059339185:
                if (str.equals("userLocationCalloutEnabled")) {
                    b7 = 49;
                }
                break;
            case 2089349111:
                if (str.equals("customMapStyleString")) {
                    b7 = 50;
                }
                break;
            case 2121180773:
                if (str.equals("loadingEnabled")) {
                    b7 = 51;
                }
                break;
        }
        switch (b7) {
            case 0:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setUserInterfaceStyle(t, (String) obj);
                break;
            case 1:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setZoomTapEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 2:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setShowsTraffic(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 3:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setCameraZoomRange(t, (ReadableMap) obj);
                break;
            case 4:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setMinDelta(t, obj != null ? ((Double) obj).doubleValue() : 0.0d);
                break;
            case 5:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setPitchEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 6:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setCamera(t, (ReadableMap) obj);
                break;
            case 7:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setUserLocationFastestInterval(t, obj != null ? ((Double) obj).intValue() : 5000);
                break;
            case 8:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setScrollEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 9:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setKmlSrc(t, obj != null ? (String) obj : null);
                break;
            case 10:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setRotateEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 11:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setFollowsUserLocation(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 12:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setRegion(t, (ReadableMap) obj);
                break;
            case 13:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setShowsBuildings(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 14:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setMapPadding(t, (ReadableMap) obj);
                break;
            case 15:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setInitialCamera(t, (ReadableMap) obj);
                break;
            case 16:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setPoiClickEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 17:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setToolbarEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 18:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setGoogleMapId(t, obj != null ? (String) obj : null);
                break;
            case 19:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setZoomControlEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 20:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setPointsOfInterestFilter(t, (ReadableArray) obj);
                break;
            case 21:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setHandlePanDrag(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 22:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setInitialRegion(t, (ReadableMap) obj);
                break;
            case 23:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setGoogleRenderer(t, (String) obj);
                break;
            case 24:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setCompassOffset(t, (ReadableMap) obj);
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setLoadingIndicatorColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case 26:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setMoveOnMarkerPress(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 27:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setShowsCompass(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 28:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setMaxDelta(t, obj != null ? ((Double) obj).doubleValue() : 0.0d);
                break;
            case 29:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setCacheEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setMapType(t, (String) obj);
                break;
            case 31:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setMaxZoom(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 32:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setShowsPointsOfInterests(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 33:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setMinZoom(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 34:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setPaddingAdjustmentBehavior(t, (String) obj);
                break;
            case 35:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setUserLocationUpdateInterval(t, obj != null ? ((Double) obj).intValue() : 5000);
                break;
            case 36:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setShowsUserLocation(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 37:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setShowsIndoors(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setUserLocationPriority(t, (String) obj);
                break;
            case 39:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setUserLocationAnnotationTitle(t, obj != null ? (String) obj : null);
                break;
            case 40:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setTintColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case 41:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setLiteMode(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setScrollDuringRotateOrZoomEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 43:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setShowsScale(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 44:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setZoomEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 45:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setLoadingBackgroundColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case 46:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setLegalLabelInsets(t, (ReadableMap) obj);
                break;
            case ShareDialog.SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK /* 47 */:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setShowsMyLocationButton(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 48:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setShowsIndoorLevelPicker(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setUserLocationCalloutEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 50:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setCustomMapStyleString(t, obj != null ? (String) obj : null);
                break;
            case 51:
                ((RNMapsMapViewManagerInterface) this.mViewManager).setLoadingEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.kotlinCompat$setProperty(t, str, obj);
                break;
        }
    }
}
