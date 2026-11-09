package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f16072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Constructor f16073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f16074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f16075d;

    static {
        Class<?> cls;
        Constructor<?> constructor;
        Method method;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
        }
        f16073b = constructor;
        f16072a = cls;
        f16074c = method;
        f16075d = method2;
    }

    public static boolean r(Object obj, ByteBuffer byteBuffer, int i7, int i10, boolean z3) {
        try {
            return ((Boolean) f16074c.invoke(obj, byteBuffer, Integer.valueOf(i7), null, Integer.valueOf(i10), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface s(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f16072a, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f16075d.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069 A[LOOP:0: B:9:0x0015->B:36:0x0069, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0068 A[SYNTHETIC] */
    @Override // androidx.core.graphics.o
    public final Typeface f(Context context, Y.c cVar, Resources resources, int i7) {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = f16073b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (Y.d dVar : cVar.f11237a) {
                int i10 = dVar.f11243f;
                File fileO = o.o(context);
                if (fileO != null) {
                    try {
                        if (o.c(fileO, resources, i10)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileO);
                                try {
                                    FileChannel channel = fileInputStream.getChannel();
                                    map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                    fileO.delete();
                                } catch (Throwable th) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                        } else {
                            fileO.delete();
                        }
                        if (map == null) {
                            if (!r(objNewInstance, map, dVar.f11242e, dVar.f11239b, dVar.f11240c)) {
                            }
                        }
                    } catch (Throwable th3) {
                        fileO.delete();
                        throw th3;
                    }
                }
                map = null;
                if (map == null) {
                    if (!r(objNewInstance, map, dVar.f11242e, dVar.f11239b, dVar.f11240c)) {
                    }
                }
            }
            return s(objNewInstance);
        }
        return null;
    }

    @Override // androidx.core.graphics.o
    public final Typeface g(Context context, androidx.core.provider.j[] jVarArr, int i7) {
        Object objNewInstance;
        try {
            objNewInstance = f16073b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            M.n nVar = new M.n(0);
            for (androidx.core.provider.j jVar : jVarArr) {
                Uri uri = jVar.f16128a;
                ByteBuffer byteBufferP = (ByteBuffer) nVar.get(uri);
                if (byteBufferP == null) {
                    byteBufferP = o.p(context, uri);
                    nVar.put(uri, byteBufferP);
                }
                if (byteBufferP != null) {
                    if (r(objNewInstance, byteBufferP, jVar.f16129b, jVar.f16130c, jVar.f16131d)) {
                    }
                }
            }
            Typeface typefaceS = s(objNewInstance);
            if (typefaceS != null) {
                return Typeface.create(typefaceS, i7);
            }
        }
        return null;
    }
}
