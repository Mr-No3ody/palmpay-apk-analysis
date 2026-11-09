package com.facebook.soloader;

import android.os.Build;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Stack;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    public static void a(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.canWrite() && !parentFile.setWritable(true)) {
            Log.e("SysUtil", "Enable write permission failed: " + parentFile);
        }
        if (!file.delete() && file.exists()) {
            throw new IOException(androidx.camera.video.u.k(file, "Could not delete file "));
        }
    }

    public static void b(File file) throws IOException {
        Stack stack = new Stack();
        stack.push(file);
        ArrayList arrayList = new ArrayList();
        while (!stack.isEmpty()) {
            File file2 = (File) stack.pop();
            if (file2.isDirectory()) {
                arrayList.add(file2);
                File[] fileArrListFiles = file2.listFiles();
                if (fileArrListFiles != null) {
                    for (File file3 : fileArrListFiles) {
                        stack.push(file3);
                    }
                }
            } else {
                a(file2);
            }
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a((File) arrayList.get(size));
        }
    }

    public static void c(File file) throws IOException {
        Stack stack = new Stack();
        stack.push(file);
        while (!stack.isEmpty()) {
            File file2 = (File) stack.pop();
            if (file2.isDirectory()) {
                File[] fileArrListFiles = file2.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException(androidx.camera.video.u.k(file2, "cannot list directory "));
                }
                for (File file3 : fileArrListFiles) {
                    stack.push(file3);
                }
            } else if (file2.getPath().endsWith("_lock")) {
                continue;
            } else {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "r");
                    try {
                        randomAccessFile.getFD().sync();
                        randomAccessFile.close();
                    } catch (Throwable th) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e10) {
                    Log.e("SysUtil", "Syncing failed for " + file2 + ": " + e10.getMessage());
                }
            }
        }
    }

    public static n d(File file, File file2) throws Throwable {
        boolean z3;
        try {
            return new n(file2);
        } catch (FileNotFoundException e10) {
            z3 = true;
            try {
                if (!file.setWritable(true)) {
                    throw e10;
                }
                n nVar = new n(file2);
                if (!file.setWritable(false)) {
                    file.getCanonicalPath();
                }
                return nVar;
            } catch (Throwable th) {
                th = th;
                if (z3 && !file.setWritable(false)) {
                    file.getCanonicalPath();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z3 = false;
            if (z3) {
                file.getCanonicalPath();
            }
            throw th;
        }
    }

    @DoNotOptimize
    @Nullable
    public static String getClassLoaderLdLoadLibrary() {
        ClassLoader classLoader = SoLoader.class.getClassLoader();
        if (classLoader != null && !(classLoader instanceof BaseDexClassLoader)) {
            throw new IllegalStateException("ClassLoader " + classLoader.getClass().getName() + " should be of type BaseDexClassLoader");
        }
        try {
            return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
        } catch (Exception e10) {
            Log.e("SysUtil", "Cannot call getLdLibraryPath", e10);
            return null;
        }
    }

    @DoNotOptimize
    @Nullable
    public static Method getNativeLoadRuntimeMethod() {
        if (Build.VERSION.SDK_INT > 27) {
            return null;
        }
        try {
            Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", String.class, ClassLoader.class, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Exception unused) {
            return null;
        }
    }
}
