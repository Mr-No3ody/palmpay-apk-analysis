package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.maps.android.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1kSDK {
    public static final Object AFAdRevenueData = new Object() { // from class: com.appsflyer.internal.AFg1kSDK.3
        public final boolean equals(Object obj) {
            return obj == this || obj == null;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return BuildConfig.TRAVIS;
        }
    };
    private static final Double getCurrencyIso4217Code = Double.valueOf(-0.0d);
    private final LinkedHashMap<String, Object> getMonetizationNetwork;

    public AFg1kSDK() {
        this.getMonetizationNetwork = new LinkedHashMap<>();
    }

    public static Object getMediationNetwork(Object obj) throws Throwable {
        if (obj == null) {
            return AFAdRevenueData;
        }
        if (((Class) AFa1jSDK.getMonetizationNetwork(36 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 322 - View.combineMeasuredStates(0, 0), (char) TextUtils.getOffsetBefore("", 0))).isInstance(obj) || (obj instanceof AFg1kSDK)) {
            return obj;
        }
        try {
            if (obj instanceof JSONArray) {
                try {
                    Object[] objArr = {obj.toString()};
                    Map map = AFa1jSDK.unregisterClient;
                    Object declaredConstructor = map.get(-1647216982);
                    if (declaredConstructor == null) {
                        declaredConstructor = ((Class) AFa1jSDK.getMonetizationNetwork(35 - TextUtils.indexOf((CharSequence) "", '0'), Drawable.resolveOpacity(0, 0) + 322, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))).getDeclaredConstructor(String.class);
                        map.put(-1647216982, declaredConstructor);
                    }
                    obj = ((Constructor) declaredConstructor).newInstance(objArr);
                    return obj;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            if (obj instanceof JSONObject) {
                return new AFg1kSDK(obj.toString());
            }
        } catch (AFg1iSDK unused) {
        }
        if (obj.equals(AFAdRevenueData)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                try {
                    Object[] objArr2 = {(Collection) obj};
                    Map map2 = AFa1jSDK.unregisterClient;
                    Object declaredConstructor2 = map2.get(-1736772381);
                    if (declaredConstructor2 == null) {
                        declaredConstructor2 = ((Class) AFa1jSDK.getMonetizationNetwork(36 - Color.red(0), Gravity.getAbsoluteGravity(0, 0) + 322, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16))).getDeclaredConstructor(Collection.class);
                        map2.put(-1736772381, declaredConstructor2);
                    }
                    return ((Constructor) declaredConstructor2).newInstance(objArr2);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            if (obj.getClass().isArray()) {
                try {
                    Object[] objArr3 = {obj};
                    Map map3 = AFa1jSDK.unregisterClient;
                    Object declaredConstructor3 = map3.get(943236696);
                    if (declaredConstructor3 == null) {
                        declaredConstructor3 = ((Class) AFa1jSDK.getMonetizationNetwork((-16777180) - Color.rgb(0, 0, 0), TextUtils.indexOf("", "", 0, 0) + 322, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))))).getDeclaredConstructor(Object.class);
                        map3.put(943236696, declaredConstructor3);
                    }
                    return ((Constructor) declaredConstructor3).newInstance(objArr3);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 != null) {
                        throw cause3;
                    }
                    throw th3;
                }
            }
            if (obj instanceof Map) {
                return new AFg1kSDK((Map) obj);
            }
            if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
                return obj;
            }
            if (obj.getClass().getPackage().getName().startsWith("java.")) {
                return obj.toString();
            }
            return null;
        } catch (Exception unused2) {
        }
        return null;
    }

    public static String getRevenue(Number number) throws Throwable {
        if (number == null) {
            throw new AFg1iSDK("Number must be non-null");
        }
        double dDoubleValue = number.doubleValue();
        try {
            Object[] objArr = {Double.valueOf(dDoubleValue)};
            Map map = AFa1jSDK.unregisterClient;
            Object declaredMethod = map.get(-686708341);
            if (declaredMethod == null) {
                declaredMethod = ((Class) AFa1jSDK.getMonetizationNetwork(TextUtils.lastIndexOf("", '0', 0, 0) + 37, 286 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 57004))).getDeclaredMethod("getMediationNetwork", Double.TYPE);
                map.put(-686708341, declaredMethod);
            }
            ((Double) ((Method) declaredMethod).invoke(null, objArr)).getClass();
            if (number.equals(getCurrencyIso4217Code)) {
                return "-0";
            }
            long jLongValue = number.longValue();
            return dDoubleValue == ((double) jLongValue) ? Long.toString(jLongValue) : number.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final void AFAdRevenueData(AFg1jSDK aFg1jSDK) throws AFg1iSDK {
        aFg1jSDK.getMediationNetwork(AFg1jSDK.AFa1tSDK.EMPTY_OBJECT, "{");
        for (Map.Entry<String, Object> entry : this.getMonetizationNetwork.entrySet()) {
            String key = entry.getKey();
            if (key == null) {
                throw new AFg1iSDK("Names must be non-null");
            }
            aFg1jSDK.getRevenue();
            aFg1jSDK.AFAdRevenueData(key);
            aFg1jSDK.getMonetizationNetwork(entry.getValue());
        }
        aFg1jSDK.getRevenue(AFg1jSDK.AFa1tSDK.EMPTY_OBJECT, AFg1jSDK.AFa1tSDK.NONEMPTY_OBJECT, "}");
    }

    public final AFg1kSDK getMonetizationNetwork(String str, Object obj) throws Throwable {
        if (obj == null) {
            this.getMonetizationNetwork.remove(str);
            return this;
        }
        if (obj instanceof Number) {
            try {
                Object[] objArr = {Double.valueOf(((Number) obj).doubleValue())};
                Map map = AFa1jSDK.unregisterClient;
                Object method = map.get(-686708341);
                if (method == null) {
                    method = ((Class) AFa1jSDK.getMonetizationNetwork(TextUtils.lastIndexOf("", '0', 0) + 37, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 286, (char) (Color.rgb(0, 0, 0) + 16834220))).getMethod("getMediationNetwork", Double.TYPE);
                    map.put(-686708341, method);
                }
                ((Double) ((Method) method).invoke(null, objArr)).getClass();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        LinkedHashMap<String, Object> linkedHashMap = this.getMonetizationNetwork;
        if (str == null) {
            throw new AFg1iSDK("Names must be non-null");
        }
        linkedHashMap.put(str, obj);
        return this;
    }

    public final String toString() {
        try {
            AFg1jSDK aFg1jSDK = new AFg1jSDK();
            AFAdRevenueData(aFg1jSDK);
            return aFg1jSDK.toString();
        } catch (AFg1iSDK unused) {
            return null;
        }
    }

    public AFg1kSDK(Map map) {
        this();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                this.getMonetizationNetwork.put(str, getMediationNetwork(entry.getValue()));
            } else {
                throw new NullPointerException("key == null");
            }
        }
    }

    private AFg1kSDK(Object obj) throws Throwable {
        try {
            Map map = AFa1jSDK.unregisterClient;
            Object declaredMethod = map.get(-417077620);
            if (declaredMethod == null) {
                declaredMethod = ((Class) AFa1jSDK.getMonetizationNetwork(37 - TextUtils.getCapsMode("", 0, 0), 358 - Color.red(0), (char) (Color.alpha(0) + 64579))).getDeclaredMethod("getMonetizationNetwork", null);
                map.put(-417077620, declaredMethod);
            }
            Object objInvoke = ((Method) declaredMethod).invoke(obj, null);
            if (objInvoke instanceof AFg1kSDK) {
                this.getMonetizationNetwork = ((AFg1kSDK) objInvoke).getMonetizationNetwork;
                return;
            }
            Object[] objArr = {objInvoke, "AFJsonObject"};
            Object declaredMethod2 = map.get(-1636722845);
            if (declaredMethod2 == null) {
                declaredMethod2 = ((Class) AFa1jSDK.getMonetizationNetwork(36 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 286, (char) (TextUtils.lastIndexOf("", '0') + 57005))).getDeclaredMethod("AFAdRevenueData", Object.class, String.class);
                map.put(-1636722845, declaredMethod2);
            }
            throw ((Throwable) ((Method) declaredMethod2).invoke(null, objArr));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private AFg1kSDK(String str) throws Throwable {
        try {
            Object[] objArr = {str};
            Map map = AFa1jSDK.unregisterClient;
            Object declaredConstructor = map.get(314128517);
            if (declaredConstructor == null) {
                declaredConstructor = ((Class) AFa1jSDK.getMonetizationNetwork(37 - View.MeasureSpec.getMode(0), 358 - Drawable.resolveOpacity(0, 0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 64578))).getDeclaredConstructor(String.class);
                map.put(314128517, declaredConstructor);
            }
            this(((Constructor) declaredConstructor).newInstance(objArr));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
