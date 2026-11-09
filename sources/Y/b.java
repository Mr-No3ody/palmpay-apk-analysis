package Y;

import O.l;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f11236a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    public static ColorStateList b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        float f10;
        int iF;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z3 = true;
        int depth2 = xmlResourceParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr = new int[20];
        int i7 = 0;
        int i10 = 0;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == z3 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr2 = W.d.ColorStateListItem;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, i7, i7);
                int resourceId = typedArrayObtainAttributes.getResourceId(W.d.ColorStateListItem_android_color, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f11236a;
                    TypedValue typedValue = (TypedValue) threadLocal.get();
                    if (typedValue == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    }
                    resources.getValue(resourceId, typedValue, z3);
                    int i11 = typedValue.type;
                    if (i11 < 28 || i11 > 31) {
                        try {
                            color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = typedArrayObtainAttributes.getColor(W.d.ColorStateListItem_android_color, -65281);
                        }
                    } else {
                        color = typedArrayObtainAttributes.getColor(W.d.ColorStateListItem_android_color, -65281);
                    }
                } else {
                    color = typedArrayObtainAttributes.getColor(W.d.ColorStateListItem_android_color, -65281);
                }
                float f11 = 1.0f;
                if (typedArrayObtainAttributes.hasValue(W.d.ColorStateListItem_android_alpha)) {
                    f10 = typedArrayObtainAttributes.getFloat(W.d.ColorStateListItem_android_alpha, 1.0f);
                } else {
                    f10 = typedArrayObtainAttributes.hasValue(W.d.ColorStateListItem_alpha) ? typedArrayObtainAttributes.getFloat(W.d.ColorStateListItem_alpha, 1.0f) : 1.0f;
                }
                boolean z8 = z3;
                float f12 = (Build.VERSION.SDK_INT < 31 || !typedArrayObtainAttributes.hasValue(W.d.ColorStateListItem_android_lStar)) ? typedArrayObtainAttributes.getFloat(W.d.ColorStateListItem_lStar, -1.0f) : typedArrayObtainAttributes.getFloat(W.d.ColorStateListItem_android_lStar, -1.0f);
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i12 = i7;
                int i13 = i12;
                while (i12 < attributeCount) {
                    float f13 = f11;
                    int attributeNameResource = attributeSet.getAttributeNameResource(i12);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != W.a.alpha && attributeNameResource != W.a.lStar) {
                        int i14 = i13 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i12, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i13] = attributeNameResource;
                        i13 = i14;
                    }
                    i12++;
                    f11 = f13;
                }
                float f14 = f11;
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr3, i13);
                float f15 = 100.0f;
                Object[] objArr2 = (f12 < 0.0f || f12 > 100.0f) ? null : z8 ? 1 : 0;
                if (f10 == f14 && objArr2 == null) {
                    iArrTrimStateSet = iArrTrimStateSet;
                    depth2 = depth2;
                } else {
                    int iM = p118hf.a.m((int) ((Color.alpha(color) * f10) + 0.5f), 0, 255);
                    if (objArr2 != null) {
                        l lVarB = l.b(color);
                        k kVar = k.f11257k;
                        float f16 = lVarB.f6525b;
                        if (f16 >= 1.0d && Math.round(f12) > 0.0d && Math.round(f12) < 100.0d) {
                            float f17 = lVarB.f6524a;
                            float fMin = f17 < 0.0f ? 0.0f : Math.min(360.0f, f17);
                            float f18 = 0.0f;
                            float f19 = f16;
                            Object[] objArr3 = z8 ? 1 : 0;
                            l lVar = null;
                            while (true) {
                                if (Math.abs(f18 - f16) < 0.4f) {
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                    if (lVar != null) {
                                        iF = lVar.d(kVar);
                                        break;
                                    }
                                    iF = a.f(f12);
                                    break;
                                }
                                float f20 = 1000.0f;
                                float f21 = f15;
                                float f22 = 0.0f;
                                float f23 = 1000.0f;
                                l lVar2 = null;
                                while (true) {
                                    if (Math.abs(f22 - f21) <= 0.01f) {
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        depth2 = depth2;
                                        f15 = f15;
                                        break;
                                    }
                                    f15 = f15;
                                    float f24 = ((f21 - f22) / 2.0f) + f22;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    int iD = l.c(f24, f19, fMin).d(k.f11257k);
                                    float fG = a.g(Color.red(iD));
                                    float fG2 = a.g(Color.green(iD));
                                    float fG3 = a.g(Color.blue(iD));
                                    float[] fArr = a.f11232d[z8 ? 1 : 0];
                                    float f25 = ((fG3 * fArr[2]) + ((fG2 * fArr[z8 ? 1 : 0]) + (fG * fArr[0]))) / f15;
                                    float fCbrt = f25 <= 0.008856452f ? f25 * 903.2963f : (((float) Math.cbrt(f25)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f12 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        l lVarB2 = l.b(iD);
                                        l lVarC = l.c(lVarB2.f6526c, lVarB2.f6525b, fMin);
                                        float f26 = lVarB2.f6527d - lVarC.f6527d;
                                        float f27 = lVarB2.f6528e - lVarC.f6528e;
                                        float f28 = lVarB2.f6529f - lVarC.f6529f;
                                        depth2 = depth2;
                                        float fPow = (float) (Math.pow(Math.sqrt((f28 * f28) + (f27 * f27) + (f26 * f26)), 0.63d) * 1.41d);
                                        if (fPow <= f14) {
                                            f23 = fPow;
                                            f20 = fAbs;
                                            lVar2 = lVarB2;
                                        }
                                    } else {
                                        depth2 = depth2;
                                    }
                                    if (f20 == 0.0f && f23 == 0.0f) {
                                        break;
                                    }
                                    if (fCbrt < f12) {
                                        f22 = f24;
                                    } else {
                                        f21 = f24;
                                    }
                                    f15 = f15;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                }
                                l lVar3 = lVar2;
                                if (objArr3 == null) {
                                    if (lVar3 == null) {
                                        f16 = f19;
                                    } else {
                                        lVar = lVar3;
                                        f18 = f19;
                                    }
                                    f19 = ((f16 - f18) / 2.0f) + f18;
                                } else {
                                    if (lVar3 != null) {
                                        iF = lVar3.d(kVar);
                                        break;
                                    }
                                    f19 = ((f16 - f18) / 2.0f) + f18;
                                    objArr3 = null;
                                }
                            }
                        } else {
                            iArrTrimStateSet = iArrTrimStateSet;
                            depth2 = depth2;
                            iF = a.f(f12);
                        }
                        color = iF;
                    } else {
                        iArrTrimStateSet = iArrTrimStateSet;
                        depth2 = depth2;
                    }
                    color = (16777215 & color) | (iM << 24);
                }
                int i15 = i10 + 1;
                if (i15 > iArr.length) {
                    int[] iArr4 = new int[i10 <= 4 ? 8 : i10 * 2];
                    System.arraycopy(iArr, 0, iArr4, 0, i10);
                    iArr = iArr4;
                }
                iArr[i10] = color;
                if (i15 > objArr.length) {
                    Object[] objArr4 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10 > 4 ? i10 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr4, 0, i10);
                    objArr = objArr4;
                }
                objArr[i10] = iArrTrimStateSet;
                objArr = (int[][]) objArr;
                i10 = i15;
                z3 = z8 ? 1 : 0;
                depth2 = depth2;
                i7 = 0;
            } else {
                int i16 = depth2;
                z3 = z3 ? 1 : 0;
                depth2 = i16;
                i7 = 0;
            }
        }
        int[] iArr5 = new int[i10];
        int[][] iArr6 = new int[i10][];
        System.arraycopy(iArr, 0, iArr5, 0, i10);
        System.arraycopy(objArr, 0, iArr6, 0, i10);
        return new ColorStateList(iArr6, iArr5);
    }
}
