package androidx.constraintlayout.widget;

import C0.G;
import N8.q0;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.camera.camera2.internal.F;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15699a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f15703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f15704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15706h;

    public a(a aVar, Object obj) {
        this.f15700b = aVar.f15700b;
        this.f15701c = aVar.f15701c;
        f(obj);
    }

    public static void d(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), p.CustomAttribute);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        int i7 = 0;
        boolean z3 = false;
        Object objValueOf = null;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == p.CustomAttribute_attributeName) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == p.CustomAttribute_methodName) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z3 = true;
            } else if (index == p.CustomAttribute_customBoolean) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i7 = 6;
            } else if (index == p.CustomAttribute_customColorValue) {
                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                i7 = 3;
            } else if (index == p.CustomAttribute_customColorDrawableValue) {
                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                i7 = 4;
            } else {
                if (index == p.CustomAttribute_customPixelDimension) {
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == p.CustomAttribute_customDimension) {
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == p.CustomAttribute_customFloatValue) {
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                    i7 = 2;
                } else if (index == p.CustomAttribute_customIntegerValue) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                    i7 = 1;
                } else if (index == p.CustomAttribute_customStringValue) {
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                    i7 = 5;
                } else if (index == p.CustomAttribute_customReference) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                    i7 = 8;
                }
                i7 = 7;
            }
        }
        if (string != null && objValueOf != null) {
            a aVar = new a();
            aVar.f15700b = string;
            aVar.f15701c = i7;
            aVar.f15699a = z3;
            aVar.f(objValueOf);
            map.put(string, aVar);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void e(View view, HashMap map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            a aVar = (a) map.get(str);
            String strO = !aVar.f15699a ? G.o("set", str) : str;
            try {
                int i7 = F.i(aVar.f15701c);
                Class cls2 = Float.TYPE;
                Class cls3 = Integer.TYPE;
                switch (i7) {
                    case 0:
                        cls.getMethod(strO, cls3).invoke(view, Integer.valueOf(aVar.f15702d));
                        break;
                    case 1:
                        cls.getMethod(strO, cls2).invoke(view, Float.valueOf(aVar.f15703e));
                        break;
                    case 2:
                        cls.getMethod(strO, cls3).invoke(view, Integer.valueOf(aVar.f15706h));
                        break;
                    case 3:
                        Method method = cls.getMethod(strO, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f15706h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(strO, CharSequence.class).invoke(view, aVar.f15704f);
                        break;
                    case 5:
                        cls.getMethod(strO, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f15705g));
                        break;
                    case 6:
                        cls.getMethod(strO, cls2).invoke(view, Float.valueOf(aVar.f15703e));
                        break;
                    case 7:
                        cls.getMethod(strO, cls3).invoke(view, Integer.valueOf(aVar.f15702d));
                        break;
                }
            } catch (IllegalAccessException e10) {
                StringBuilder sbQ = q0.q(" Custom Attribute \"", str, "\" not found on ");
                sbQ.append(cls.getName());
                Log.e("TransitionLayout", sbQ.toString());
                e10.printStackTrace();
            } catch (NoSuchMethodException e11) {
                Log.e("TransitionLayout", e11.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                Log.e("TransitionLayout", cls.getName() + " must have a method " + strO);
            } catch (InvocationTargetException e12) {
                StringBuilder sbQ2 = q0.q(" Custom Attribute \"", str, "\" not found on ");
                sbQ2.append(cls.getName());
                Log.e("TransitionLayout", sbQ2.toString());
                e12.printStackTrace();
            }
        }
    }

    public final float a() {
        switch (F.i(this.f15701c)) {
            case 0:
                return this.f15702d;
            case 1:
                return this.f15703e;
            case 2:
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
                throw new RuntimeException("Cannot interpolate String");
            case 5:
                return this.f15705g ? 1.0f : 0.0f;
            case 6:
                return this.f15703e;
            default:
                return Float.NaN;
        }
    }

    public final void b(float[] fArr) {
        switch (F.i(this.f15701c)) {
            case 0:
                fArr[0] = this.f15702d;
                return;
            case 1:
                fArr[0] = this.f15703e;
                return;
            case 2:
            case 3:
                int i7 = this.f15706h;
                int i10 = (i7 >> 24) & 255;
                float fPow = (float) Math.pow(((i7 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i7 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i7 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i10 / 255.0f;
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                fArr[0] = this.f15705g ? 1.0f : 0.0f;
                return;
            case 6:
                fArr[0] = this.f15703e;
                return;
            default:
                return;
        }
    }

    public final int c() {
        int i7 = F.i(this.f15701c);
        return (i7 == 2 || i7 == 3) ? 4 : 1;
    }

    public final void f(Object obj) {
        switch (F.i(this.f15701c)) {
            case 0:
            case 7:
                this.f15702d = ((Integer) obj).intValue();
                break;
            case 1:
                this.f15703e = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f15706h = ((Integer) obj).intValue();
                break;
            case 4:
                this.f15704f = (String) obj;
                break;
            case 5:
                this.f15705g = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f15703e = ((Float) obj).floatValue();
                break;
        }
    }
}
