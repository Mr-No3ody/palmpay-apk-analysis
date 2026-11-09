package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class k extends i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class f16076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Constructor f16077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Method f16078h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Method f16079i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Method f16080j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Method f16081k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Method f16082l;

    public k() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method methodY;
        Method method2;
        Method method3;
        Method methodZ;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            methodY = y(cls);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
            method3 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            methodZ = z(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e10.getClass().getName()), e10);
            cls = null;
            method = null;
            constructor = null;
            methodY = null;
            method2 = null;
            method3 = null;
            methodZ = null;
        }
        this.f16076f = cls;
        this.f16077g = constructor;
        this.f16078h = methodY;
        this.f16079i = method2;
        this.f16080j = method3;
        this.f16081k = method;
        this.f16082l = methodZ;
    }

    public static Method y(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override // androidx.core.graphics.i, androidx.core.graphics.o
    public final Typeface f(Context context, Y.c cVar, Resources resources, int i7) {
        if (this.f16078h == null) {
            return super.f(context, cVar, resources, i7);
        }
        Object objX = x();
        if (objX != null) {
            Y.d[] dVarArr = cVar.f11237a;
            int length = dVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                Y.d dVar = dVarArr[i10];
                String str = dVar.f11238a;
                FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(dVar.f11241d);
                Context context2 = context;
                if (!u(context2, objX, str, dVar.f11242e, dVar.f11239b, dVar.f11240c ? 1 : 0, fontVariationAxisArrFromFontVariationSettings)) {
                    t(objX);
                    return null;
                }
                i10++;
                context = context2;
            }
            if (w(objX)) {
                return v(objX);
            }
        }
        return null;
    }

    @Override // androidx.core.graphics.i, androidx.core.graphics.o
    public final Typeface g(Context context, androidx.core.provider.j[] jVarArr, int i7) {
        Typeface typefaceV;
        boolean zBooleanValue;
        if (jVarArr.length >= 1) {
            if (this.f16078h != null) {
                HashMap map = new HashMap();
                for (androidx.core.provider.j jVar : jVarArr) {
                    if (jVar.f16132e == 0) {
                        Uri uri = jVar.f16128a;
                        if (!map.containsKey(uri)) {
                            map.put(uri, o.p(context, uri));
                        }
                    }
                }
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                Object objX = x();
                if (objX != null) {
                    int length = jVarArr.length;
                    int i10 = 0;
                    boolean z3 = false;
                    while (i10 < length) {
                        androidx.core.provider.j jVar2 = jVarArr[i10];
                        ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(jVar2.f16128a);
                        if (byteBuffer != null) {
                            try {
                                zBooleanValue = ((Boolean) this.f16079i.invoke(objX, byteBuffer, Integer.valueOf(jVar2.f16129b), null, Integer.valueOf(jVar2.f16130c), Integer.valueOf(jVar2.f16131d ? 1 : 0))).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                                zBooleanValue = false;
                            }
                            if (!zBooleanValue) {
                                t(objX);
                                return null;
                            }
                            z3 = true;
                        }
                        i10++;
                        z3 = z3;
                    }
                    if (!z3) {
                        t(objX);
                        return null;
                    }
                    if (w(objX) && (typefaceV = v(objX)) != null) {
                        return Typeface.create(typefaceV, i7);
                    }
                }
            } else {
                androidx.core.provider.j jVarN = n(jVarArr, i7);
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(jVarN.f16128a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(jVarN.f16130c).setItalic(jVarN.f16131d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                } catch (IOException unused2) {
                }
            }
        }
        return null;
    }

    @Override // androidx.core.graphics.o
    public final Typeface j(Context context, Resources resources, int i7, String str, int i10) {
        if (this.f16078h == null) {
            return super.j(context, resources, i7, str, i10);
        }
        Object objX = x();
        if (objX != null) {
            if (!u(context, objX, str, 0, -1, -1, null)) {
                t(objX);
                return null;
            }
            if (w(objX)) {
                return v(objX);
            }
        }
        return null;
    }

    public final void t(Object obj) {
        try {
            this.f16081k.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean u(Context context, Object obj, String str, int i7, int i10, int i11, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f16078h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i7), Integer.valueOf(i10), Integer.valueOf(i11), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface v(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f16076f, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f16082l.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean w(Object obj) {
        try {
            return ((Boolean) this.f16080j.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final Object x() {
        try {
            return this.f16077g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method z(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
