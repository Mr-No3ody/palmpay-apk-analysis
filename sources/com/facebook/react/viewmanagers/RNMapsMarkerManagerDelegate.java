package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNMapsMarkerManagerInterface;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes.dex */
public class RNMapsMarkerManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNMapsMarkerManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNMapsMarkerManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: receiveCommand */
    public void kotlinCompat$receiveCommand(T t, String str, ReadableArray readableArray) {
        str.getClass();
        switch (str) {
            case "redraw":
                ((RNMapsMarkerManagerInterface) this.mViewManager).redraw(t);
                break;
            case "animateToCoordinates":
                ((RNMapsMarkerManagerInterface) this.mViewManager).animateToCoordinates(t, readableArray.getDouble(0), readableArray.getDouble(1), readableArray.getInt(2));
                break;
            case "setCoordinates":
                ((RNMapsMarkerManagerInterface) this.mViewManager).setCoordinates(t, readableArray.getDouble(0), readableArray.getDouble(1));
                break;
            case "hideCallout":
                ((RNMapsMarkerManagerInterface) this.mViewManager).hideCallout(t);
                break;
            case "redrawCallout":
                ((RNMapsMarkerManagerInterface) this.mViewManager).redrawCallout(t);
                break;
            case "showCallout":
                ((RNMapsMarkerManagerInterface) this.mViewManager).showCallout(t);
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
            case -1832195190:
                if (str.equals("useLegacyPinView")) {
                    b7 = 0;
                }
                break;
            case -1724546052:
                if (str.equals("description")) {
                    b7 = 1;
                }
                break;
            case -1618432855:
                if (str.equals("identifier")) {
                    b7 = 2;
                }
                break;
            case -1413299531:
                if (str.equals("anchor")) {
                    b7 = 3;
                }
                break;
            case -1267206133:
                if (str.equals(ViewProps.OPACITY)) {
                    b7 = 4;
                }
                break;
            case -612807350:
                if (str.equals("subtitleVisibility")) {
                    b7 = 5;
                }
                break;
            case -460635442:
                if (str.equals("pinColor")) {
                    b7 = 6;
                }
                break;
            case -304480883:
                if (str.equals("draggable")) {
                    b7 = 7;
                }
                break;
            case -176699064:
                if (str.equals("centerOffset")) {
                    b7 = 8;
                }
                break;
            case 100313435:
                if (str.equals("image")) {
                    b7 = 9;
                }
                break;
            case 110371416:
                if (str.equals("title")) {
                    b7 = 10;
                }
                break;
            case 198931832:
                if (str.equals("coordinate")) {
                    b7 = Ascii.VT;
                }
                break;
            case 424261302:
                if (str.equals("tracksViewChanges")) {
                    b7 = Ascii.FF;
                }
                break;
            case 931298053:
                if (str.equals("calloutAnchor")) {
                    b7 = Ascii.CR;
                }
                break;
            case 1324817635:
                if (str.equals("calloutOffset")) {
                    b7 = Ascii.SO;
                }
                break;
            case 1450660746:
                if (str.equals("titleVisibility")) {
                    b7 = Ascii.SI;
                }
                break;
            case 1589440180:
                if (str.equals("isPreselected")) {
                    b7 = Ascii.DLE;
                }
                break;
            case 1934365830:
                if (str.equals("displayPriority")) {
                    b7 = 17;
                }
                break;
        }
        switch (b7) {
            case 0:
                ((RNMapsMarkerManagerInterface) this.mViewManager).setUseLegacyPinView(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 1:
                ((RNMapsMarkerManagerInterface) this.mViewManager).setDescription(t, obj != null ? (String) obj : null);
                break;
            case 2:
                ((RNMapsMarkerManagerInterface) this.mViewManager).setIdentifier(t, obj != null ? (String) obj : null);
                break;
            case 3:
                ((RNMapsMarkerManagerInterface) this.mViewManager).setAnchor(t, (ReadableMap) obj);
                break;
            case 4:
                ((RNMapsMarkerManagerInterface) this.mViewManager).setOpacity(t, obj == null ? 1.0d : ((Double) obj).doubleValue());
                break;
            case 5:
                ((RNMapsMarkerManagerInterface) this.mViewManager).setSubtitleVisibility(t, (String) obj);
                break;
            case 6:
                ((RNMapsMarkerManagerInterface) this.mViewManager).setPinColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case 7:
                ((RNMapsMarkerManagerInterface) this.mViewManager).setDraggable(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 8:
                ((RNMapsMarkerManagerInterface) this.mViewManager).setCenterOffset(t, (ReadableMap) obj);
                break;
            case 9:
                ((RNMapsMarkerManagerInterface) this.mViewManager).setImage(t, (ReadableMap) obj);
                break;
            case 10:
                ((RNMapsMarkerManagerInterface) this.mViewManager).setTitle(t, obj != null ? (String) obj : null);
                break;
            case 11:
                ((RNMapsMarkerManagerInterface) this.mViewManager).setCoordinate(t, (ReadableMap) obj);
                break;
            case 12:
                ((RNMapsMarkerManagerInterface) this.mViewManager).setTracksViewChanges(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 13:
                ((RNMapsMarkerManagerInterface) this.mViewManager).setCalloutAnchor(t, (ReadableMap) obj);
                break;
            case 14:
                ((RNMapsMarkerManagerInterface) this.mViewManager).setCalloutOffset(t, (ReadableMap) obj);
                break;
            case 15:
                ((RNMapsMarkerManagerInterface) this.mViewManager).setTitleVisibility(t, (String) obj);
                break;
            case 16:
                ((RNMapsMarkerManagerInterface) this.mViewManager).setIsPreselected(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 17:
                ((RNMapsMarkerManagerInterface) this.mViewManager).setDisplayPriority(t, (String) obj);
                break;
            default:
                super.kotlinCompat$setProperty(t, str, obj);
                break;
        }
    }
}
