package com.google.maps.android.data.kml;

import C0.G;
import android.graphics.Color;
import androidx.annotation.VisibleForTesting;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.data.Style;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public class KmlStyle extends Style {
    private static final int HSV_VALUES = 3;
    private static final int HUE_VALUE = 0;
    private static final int INITIAL_SCALE = 1;
    private String mIconUrl;
    private boolean mFill = true;
    private boolean mOutline = true;
    private String mStyleId = null;
    private final HashMap<String, String> mBalloonOptions = new HashMap<>();
    private final HashSet<String> mStylesSet = new HashSet<>();
    private double mScale = 1.0d;

    @VisibleForTesting
    float mMarkerColor = 0.0f;
    private boolean mIconRandomColorMode = false;
    private boolean mLineRandomColorMode = false;
    private boolean mPolyRandomColorMode = false;

    public static int computeRandomColor(int i7) {
        Random random = new Random();
        int iRed = Color.red(i7);
        int iGreen = Color.green(i7);
        int iBlue = Color.blue(i7);
        if (iRed != 0) {
            iRed = random.nextInt(iRed);
        }
        if (iBlue != 0) {
            iBlue = random.nextInt(iBlue);
        }
        if (iGreen != 0) {
            iGreen = random.nextInt(iGreen);
        }
        return Color.rgb(iRed, iGreen, iBlue);
    }

    private static String convertColor(String str) {
        String strTrim = str.trim();
        if (strTrim.length() <= 6) {
            return strTrim.substring(4, 6) + strTrim.substring(2, 4) + strTrim.substring(0, 2);
        }
        return strTrim.substring(0, 2) + strTrim.substring(6, 8) + strTrim.substring(4, 6) + strTrim.substring(2, 4);
    }

    private static MarkerOptions createMarkerOptions(MarkerOptions markerOptions, boolean z3, float f10) {
        MarkerOptions markerOptions2 = new MarkerOptions();
        markerOptions2.rotation(markerOptions.getRotation());
        markerOptions2.anchor(markerOptions.getAnchorU(), markerOptions.getAnchorV());
        if (z3) {
            markerOptions.icon(BitmapDescriptorFactory.defaultMarker(getHueValue(computeRandomColor((int) f10))));
        }
        markerOptions2.icon(markerOptions.getIcon());
        return markerOptions2;
    }

    private static PolygonOptions createPolygonOptions(PolygonOptions polygonOptions, boolean z3, boolean z8) {
        float strokeWidth;
        PolygonOptions polygonOptions2 = new PolygonOptions();
        if (z3) {
            polygonOptions2.fillColor(polygonOptions.getFillColor());
        }
        if (z8) {
            polygonOptions2.strokeColor(polygonOptions.getStrokeColor());
            strokeWidth = polygonOptions.getStrokeWidth();
        } else {
            strokeWidth = 0.0f;
        }
        polygonOptions2.strokeWidth(strokeWidth);
        polygonOptions2.clickable(polygonOptions.isClickable());
        return polygonOptions2;
    }

    private static PolylineOptions createPolylineOptions(PolylineOptions polylineOptions) {
        PolylineOptions polylineOptions2 = new PolylineOptions();
        polylineOptions2.color(polylineOptions.getColor());
        polylineOptions2.width(polylineOptions.getWidth());
        polylineOptions2.clickable(polylineOptions.isClickable());
        return polylineOptions2;
    }

    private static float getHueValue(int i7) {
        float[] fArr = new float[3];
        Color.colorToHSV(i7, fArr);
        return fArr[0];
    }

    public HashMap<String, String> getBalloonOptions() {
        return this.mBalloonOptions;
    }

    public double getIconScale() {
        return this.mScale;
    }

    public String getIconUrl() {
        return this.mIconUrl;
    }

    public MarkerOptions getMarkerOptions() {
        return createMarkerOptions(this.mMarkerOptions, isIconRandomColorMode(), this.mMarkerColor);
    }

    public PolygonOptions getPolygonOptions() {
        return createPolygonOptions(this.mPolygonOptions, this.mFill, this.mOutline);
    }

    public PolylineOptions getPolylineOptions() {
        return createPolylineOptions(this.mPolylineOptions);
    }

    public String getStyleId() {
        return this.mStyleId;
    }

    public boolean hasBalloonStyle() {
        return this.mBalloonOptions.size() > 0;
    }

    public boolean hasFill() {
        return this.mFill;
    }

    public boolean hasOutline() {
        return this.mOutline;
    }

    public boolean isIconRandomColorMode() {
        return this.mIconRandomColorMode;
    }

    public boolean isLineRandomColorMode() {
        return this.mLineRandomColorMode;
    }

    public boolean isPolyRandomColorMode() {
        return this.mPolyRandomColorMode;
    }

    public boolean isStyleSet(String str) {
        return this.mStylesSet.contains(str);
    }

    public void setFill(boolean z3) {
        this.mFill = z3;
    }

    public void setFillColor(String str) {
        setPolygonFillColor(Color.parseColor("#" + convertColor(str)));
        this.mStylesSet.add("fillColor");
    }

    public void setHeading(float f10) {
        setMarkerRotation(f10);
        this.mStylesSet.add("heading");
    }

    public void setHotSpot(float f10, float f11, String str, String str2) {
        setMarkerHotSpot(f10, f11, str, str2);
        this.mStylesSet.add("hotSpot");
    }

    public void setIconColorMode(String str) {
        this.mIconRandomColorMode = str.equals("random");
        this.mStylesSet.add("iconColorMode");
    }

    public void setIconScale(double d2) {
        this.mScale = d2;
        this.mStylesSet.add("iconScale");
    }

    public void setIconUrl(String str) {
        this.mIconUrl = str;
        this.mStylesSet.add("iconUrl");
    }

    public void setInfoWindowText(String str) {
        this.mBalloonOptions.put(ReactTextInputShadowNode.PROP_TEXT, str);
    }

    public void setLineColorMode(String str) {
        this.mLineRandomColorMode = str.equals("random");
        this.mStylesSet.add("lineColorMode");
    }

    public void setMarkerColor(String str) {
        float hueValue = getHueValue(Color.parseColor("#" + convertColor(str)));
        this.mMarkerColor = hueValue;
        this.mMarkerOptions.icon(BitmapDescriptorFactory.defaultMarker(hueValue));
        this.mStylesSet.add("markerColor");
    }

    public void setOutline(boolean z3) {
        this.mOutline = z3;
        this.mStylesSet.add("outline");
    }

    public void setOutlineColor(String str) {
        this.mPolylineOptions.color(Color.parseColor("#" + convertColor(str)));
        this.mPolygonOptions.strokeColor(Color.parseColor("#" + convertColor(str)));
        this.mStylesSet.add(ViewProps.OUTLINE_COLOR);
    }

    public void setPolyColorMode(String str) {
        this.mPolyRandomColorMode = str.equals("random");
        this.mStylesSet.add("polyColorMode");
    }

    public void setStyleId(String str) {
        this.mStyleId = str;
    }

    public void setWidth(Float f10) {
        setLineStringWidth(f10.floatValue());
        setPolygonStrokeWidth(f10.floatValue());
        this.mStylesSet.add("width");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Style{\n balloon options=");
        sb2.append(this.mBalloonOptions);
        sb2.append(",\n fill=");
        sb2.append(this.mFill);
        sb2.append(",\n outline=");
        sb2.append(this.mOutline);
        sb2.append(",\n icon url=");
        sb2.append(this.mIconUrl);
        sb2.append(",\n scale=");
        sb2.append(this.mScale);
        sb2.append(",\n style id=");
        return G.r(sb2, this.mStyleId, "\n}\n");
    }
}
