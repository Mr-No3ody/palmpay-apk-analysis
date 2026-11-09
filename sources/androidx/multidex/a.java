package androidx.multidex;

import N8.q0;
import android.util.Log;
import com.alibaba.android.arouter.utils.Consts;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f17487a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f17488b;

    static {
        String property = System.getProperty("java.vm.version");
        boolean z3 = false;
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, Consts.DOT);
            String strNextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (strNextToken != null && strNextToken2 != null) {
                try {
                    int i7 = Integer.parseInt(strNextToken);
                    int i10 = Integer.parseInt(strNextToken2);
                    if (i7 > 2 || (i7 == 2 && i10 >= 1)) {
                        z3 = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        f17488b = z3;
    }

    public static void a(b bVar) {
        File file = new File(bVar.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            file.getPath();
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                file.getPath();
                return;
            }
            for (File file2 : fileArrListFiles) {
                file2.getPath();
                file2.length();
                if (file2.delete()) {
                    file2.getPath();
                } else {
                    file2.getPath();
                }
            }
            if (file.delete()) {
                file.getPath();
            } else {
                file.getPath();
            }
        }
    }

    public static void b(b bVar, File file, File file2) {
        ClassLoader classLoader;
        HashSet hashSet = f17487a;
        synchronized (hashSet) {
            try {
                if (hashSet.contains(file)) {
                    return;
                }
                hashSet.add(file);
                System.getProperty("java.vm.version");
                IOException e10 = null;
                try {
                    classLoader = bVar.getClassLoader();
                    if (!(classLoader instanceof BaseDexClassLoader)) {
                        Log.e("MultiDex", "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching.");
                        classLoader = null;
                    }
                } catch (RuntimeException unused) {
                }
                if (classLoader == null) {
                    return;
                }
                try {
                    a(bVar);
                } catch (Throwable unused2) {
                }
                File file3 = new File(file2, "code_cache");
                try {
                    e(file3);
                } catch (IOException unused3) {
                    file3 = new File(bVar.getFilesDir(), "code_cache");
                    e(file3);
                }
                File file4 = new File(file3, "secondary-dexes");
                e(file4);
                e eVar = new e(file, file4);
                try {
                    try {
                        d((BaseDexClassLoader) classLoader, file4, eVar.c(bVar, false));
                    } catch (IOException unused4) {
                        d((BaseDexClassLoader) classLoader, file4, eVar.c(bVar, true));
                    }
                    try {
                        eVar.close();
                    } catch (IOException e11) {
                        e10 = e11;
                    }
                    if (e10 != null) {
                        throw e10;
                    }
                } catch (Throwable th) {
                    try {
                        eVar.close();
                    } catch (IOException unused5) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Field c(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        StringBuilder sbQ = q0.q("Field ", str, " not found in ");
        sbQ.append(obj.getClass());
        throw new NoSuchFieldException(sbQ.toString());
    }

    public static void d(BaseDexClassLoader baseDexClassLoader, File file, ArrayList arrayList) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, IOException {
        Method declaredMethod;
        IOException[] iOExceptionArr;
        if (arrayList.isEmpty()) {
            return;
        }
        Object obj = c(baseDexClassLoader, "pathList").get(baseDexClassLoader);
        ArrayList<IOException> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList);
        Class<?>[] clsArr = {ArrayList.class, File.class, ArrayList.class};
        Class<?> superclass = obj.getClass();
        while (true) {
            if (superclass == null) {
                throw new NoSuchMethodException("Method makeDexElements with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
            }
            try {
                declaredMethod = superclass.getDeclaredMethod("makeDexElements", clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                    break;
                }
                break;
            } catch (NoSuchMethodException unused) {
                superclass = superclass.getSuperclass();
            }
        }
        Object[] objArr = (Object[]) declaredMethod.invoke(obj, arrayList3, file, arrayList2);
        Field fieldC = c(obj, "dexElements");
        Object[] objArr2 = (Object[]) fieldC.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        fieldC.set(obj, objArr3);
        if (arrayList2.size() > 0) {
            for (IOException iOException : arrayList2) {
            }
            Field fieldC2 = c(obj, "dexElementsSuppressedExceptions");
            IOException[] iOExceptionArr2 = (IOException[]) fieldC2.get(obj);
            if (iOExceptionArr2 == null) {
                iOExceptionArr = (IOException[]) arrayList2.toArray(new IOException[arrayList2.size()]);
            } else {
                IOException[] iOExceptionArr3 = new IOException[arrayList2.size() + iOExceptionArr2.length];
                arrayList2.toArray(iOExceptionArr3);
                System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList2.size(), iOExceptionArr2.length);
                iOExceptionArr = iOExceptionArr3;
            }
            fieldC2.set(obj, iOExceptionArr);
            IOException iOException2 = new IOException("I/O exception during makeDexElement");
            iOException2.initCause((Throwable) arrayList2.get(0));
            throw iOException2;
        }
    }

    public static void e(File file) throws IOException {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". Parent file is null.");
        } else {
            Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
        }
        throw new IOException("Failed to create directory " + file.getPath());
    }
}
