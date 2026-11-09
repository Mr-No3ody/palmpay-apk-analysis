package Y;

import Pa.C0505b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.content.res.FontResourcesParserCompat$FamilyResourceEntry;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[][] f11229a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[][] f11230b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float[] f11231c = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[][] f11232d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f11233e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Method f11234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f11235g;

    public static int a(Context context, int i7, int i10) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i7, typedValue, true);
        return typedValue.resourceId != 0 ? i7 : i10;
    }

    public static C0505b b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i7) {
        C0505b c0505bC;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i7, typedValue);
            int i10 = typedValue.type;
            if (i10 >= 28 && i10 <= 31) {
                return new C0505b((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                c0505bC = C0505b.c(theme, typedArray.getResources(), typedArray.getResourceId(i7, 0));
            } catch (Exception e10) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
                c0505bC = null;
            }
            if (c0505bC != null) {
                return c0505bC;
            }
        }
        return new C0505b((Shader) null, (ColorStateList) null, 0);
    }

    public static int c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i7, int i10) {
        return !e(xmlPullParser, str) ? i10 : typedArray.getInt(i7, i10);
    }

    public static String d(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i7) {
        if (e(xmlPullParser, str)) {
            return typedArray.getString(i7);
        }
        return null;
    }

    public static boolean e(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static int f(float f10) {
        if (f10 < 1.0f) {
            return -16777216;
        }
        if (f10 > 99.0f) {
            return -1;
        }
        float f11 = (f10 + 16.0f) / 116.0f;
        float f12 = f10 > 8.0f ? f11 * f11 * f11 : f10 / 903.2963f;
        float f13 = f11 * f11 * f11;
        boolean z3 = f13 > 0.008856452f;
        float f14 = z3 ? f13 : ((f11 * 116.0f) - 16.0f) / 903.2963f;
        if (!z3) {
            f13 = ((f11 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f11231c;
        return androidx.core.graphics.d.a(f14 * fArr[0], f12 * fArr[1], f13 * fArr[2]);
    }

    public static float g(int i7) {
        float f10 = i7 / 255.0f;
        return (f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static FontResourcesParserCompat$FamilyResourceEntry i(Resources resources, XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            k(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), W.d.FontFamily);
        String string = typedArrayObtainAttributes.getString(W.d.FontFamily_fontProviderAuthority);
        String string2 = typedArrayObtainAttributes.getString(W.d.FontFamily_fontProviderPackage);
        String string3 = typedArrayObtainAttributes.getString(W.d.FontFamily_fontProviderQuery);
        String string4 = typedArrayObtainAttributes.getString(W.d.FontFamily_fontProviderFallbackQuery);
        int resourceId = typedArrayObtainAttributes.getResourceId(W.d.FontFamily_fontProviderCerts, 0);
        int integer = typedArrayObtainAttributes.getInteger(W.d.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(W.d.FontFamily_fontProviderFetchTimeout, 500);
        String string5 = typedArrayObtainAttributes.getString(W.d.FontFamily_fontProviderSystemFontFamily);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlResourceParser.next() != 3) {
                k(xmlResourceParser);
            }
            List listJ = j(resources, resourceId);
            return new e(new androidx.core.provider.e(string, string2, string3, listJ), string4 != null ? new androidx.core.provider.e(string, string2, string4, listJ) : null, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == 2) {
                if (xmlResourceParser.getName().equals("font")) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), W.d.FontFamilyFont);
                    int i7 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(W.d.FontFamilyFont_fontWeight) ? W.d.FontFamilyFont_fontWeight : W.d.FontFamilyFont_android_fontWeight, 400);
                    boolean z3 = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(W.d.FontFamilyFont_fontStyle) ? W.d.FontFamilyFont_fontStyle : W.d.FontFamilyFont_android_fontStyle, 0);
                    int i10 = typedArrayObtainAttributes2.hasValue(W.d.FontFamilyFont_ttcIndex) ? W.d.FontFamilyFont_ttcIndex : W.d.FontFamilyFont_android_ttcIndex;
                    String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(W.d.FontFamilyFont_fontVariationSettings) ? W.d.FontFamilyFont_fontVariationSettings : W.d.FontFamilyFont_android_fontVariationSettings);
                    int i11 = typedArrayObtainAttributes2.getInt(i10, 0);
                    int i12 = typedArrayObtainAttributes2.hasValue(W.d.FontFamilyFont_font) ? W.d.FontFamilyFont_font : W.d.FontFamilyFont_android_font;
                    int resourceId2 = typedArrayObtainAttributes2.getResourceId(i12, 0);
                    String string7 = typedArrayObtainAttributes2.getString(i12);
                    typedArrayObtainAttributes2.recycle();
                    while (xmlResourceParser.next() != 3) {
                        k(xmlResourceParser);
                    }
                    arrayList.add(new d(i7, i11, resourceId2, string7, string6, z3));
                } else {
                    k(xmlResourceParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    public static List j(Resources resources, int i7) {
        if (i7 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i7);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i10 = 0; i10 < typedArrayObtainTypedArray.length(); i10++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i10, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i7);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void k(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int i7 = 1;
        while (i7 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i7++;
            } else if (next == 3) {
                i7--;
            }
        }
    }

    public static float l() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }
}
