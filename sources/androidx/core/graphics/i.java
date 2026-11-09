package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class i extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Class f16067a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Constructor f16068b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f16069c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f16070d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f16071e = false;

    public static boolean r(boolean z3, String str, int i7, Object obj) {
        s();
        try {
            return ((Boolean) f16069c.invoke(obj, str, Integer.valueOf(i7), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void s() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f16071e) {
            return;
        }
        f16071e = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f16068b = constructor;
        f16067a = cls;
        f16069c = method2;
        f16070d = method;
    }

    @Override // androidx.core.graphics.o
    public Typeface f(Context context, Y.c cVar, Resources resources, int i7) {
        s();
        try {
            Object objNewInstance = f16068b.newInstance(new Object[0]);
            for (Y.d dVar : cVar.f11237a) {
                File fileO = o.o(context);
                if (fileO == null) {
                    return null;
                }
                try {
                    if (!o.c(fileO, resources, dVar.f11243f)) {
                        return null;
                    }
                    if (!r(dVar.f11240c, fileO.getPath(), dVar.f11239b, objNewInstance)) {
                        return null;
                    }
                    fileO.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileO.delete();
                }
            }
            s();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f16067a, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f16070d.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // androidx.core.graphics.o
    public Typeface g(Context context, androidx.core.provider.j[] jVarArr, int i7) {
        File file;
        if (jVarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(n(jVarArr, i7).f16128a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                            file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (ErrnoException unused) {
                    }
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        Typeface typefaceI = i(context, fileInputStream);
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceI;
                    } catch (Throwable th3) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
