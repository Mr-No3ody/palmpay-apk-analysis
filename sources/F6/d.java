package F6;

import Eg.g;
import M.n;
import N8.q0;
import android.text.TextUtils;
import android.util.Log;
import com.didiglobal.booster.instrument.ShadowExecutors;
import com.google.maps.android.BuildConfig;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f2601a = {'V', 'D', 'I', 'W', 'E', 'A'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f2602b = System.getProperty("file.separator");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f2603c = System.getProperty("line.separator");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f2604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static SimpleDateFormat f2605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ExecutorService f2606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n f2607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f2608h;

    static {
        g gVar = new g(1);
        gVar.f2441b = false;
        gVar.f2443d = G6.c.a();
        top.zibin.luban.io.a aVar = new top.zibin.luban.io.a(7, false);
        aVar.f42646c = new LinkedHashMap();
        aVar.f42647d = new LinkedHashMap();
        aVar.f42645b = "Log";
        gVar.f2444e = aVar;
        f2604d = gVar;
        f2606f = ShadowExecutors.newOptimizedSingleThreadExecutor("\u200bcom.palmpay.lib.pp.log.PpLog");
        f2607g = new n(0);
        f2608h = new Object();
    }

    public static boolean a(String str, String str2) throws Throwable {
        File file = new File(str);
        boolean zExists = file.exists();
        g gVar = f2604d;
        if (zExists) {
            if (!file.isFile()) {
                return false;
            }
            long length = file.length();
            gVar.getClass();
            if (length <= 5242880) {
                return true;
            }
            j(file);
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && (!parentFile.exists() ? parentFile.mkdirs() : parentFile.isDirectory())) {
            try {
                gVar.getClass();
                k();
                boolean zCreateNewFile = file.createNewFile();
                if (!zCreateNewFile) {
                    return zCreateNewFile;
                }
                i(str, str2);
                return zCreateNewFile;
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
        return false;
    }

    public static void b(String str, Object... objArr) {
        h(str, 3, objArr);
    }

    public static void c(String str, Object... objArr) {
        h(str, 6, objArr);
    }

    public static String d(Object obj) {
        String string;
        if (obj == null) {
            return BuildConfig.TRAVIS;
        }
        n nVar = f2607g;
        if (!nVar.isEmpty()) {
            Class<?> cls = obj.getClass();
            if (cls.isAnonymousClass() || cls.isSynthetic()) {
                Type[] genericInterfaces = cls.getGenericInterfaces();
                if (genericInterfaces.length == 1) {
                    Type rawType = genericInterfaces[0];
                    while (rawType instanceof ParameterizedType) {
                        rawType = ((ParameterizedType) rawType).getRawType();
                    }
                    string = rawType.toString();
                } else {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    while (genericSuperclass instanceof ParameterizedType) {
                        genericSuperclass = ((ParameterizedType) genericSuperclass).getRawType();
                    }
                    string = genericSuperclass.toString();
                }
                if (string.startsWith("class ")) {
                    string = string.substring(6);
                } else if (string.startsWith("interface ")) {
                    string = string.substring(10);
                }
                try {
                    cls = Class.forName(string);
                } catch (ClassNotFoundException e10) {
                    e10.printStackTrace();
                }
            }
            if (nVar.get(cls) != null) {
                throw new ClassCastException();
            }
        }
        return androidx.camera.core.impl.utils.executor.g.F(-1, obj);
    }

    public static String e(Date date) {
        if (f2605e == null) {
            f2605e = new SimpleDateFormat("yyyyMMdd HH:mm:ss.SSS ", Locale.getDefault());
        }
        return f2604d.d() + "util_" + f2605e.format(date).substring(0, 8) + "_Writing.txt";
    }

    public static String f(StackTraceElement stackTraceElement) {
        String fileName = stackTraceElement.getFileName();
        if (fileName != null) {
            return fileName;
        }
        String className = stackTraceElement.getClassName();
        String[] strArrSplit = className.split("\\.");
        if (strArrSplit.length > 0) {
            className = strArrSplit[strArrSplit.length - 1];
        }
        int iIndexOf = className.indexOf(36);
        if (iIndexOf != -1) {
            className = className.substring(0, iIndexOf);
        }
        return q0.j(className, ".java");
    }

    public static void g(String str, String str2) throws Throwable {
        boolean zCreateNewFile;
        f2604d.getClass();
        BufferedWriter bufferedWriter = null;
        File file = G6.c.d(str) ? null : new File(str);
        if (file == null || str2 == null) {
            return;
        }
        if (file.exists()) {
            zCreateNewFile = file.isFile();
        } else {
            File parentFile = file.getParentFile();
            if (parentFile != null && (!parentFile.exists() ? !parentFile.mkdirs() : !parentFile.isDirectory())) {
                try {
                    zCreateNewFile = file.createNewFile();
                } catch (IOException e10) {
                    e10.printStackTrace();
                    zCreateNewFile = false;
                }
            } else {
                zCreateNewFile = false;
            }
        }
        try {
            if (!zCreateNewFile) {
                Log.e("FileIOUtils", "create file <" + file + "> failed.");
                return;
            }
            try {
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file, true));
                    try {
                        bufferedWriter2.write(str2);
                        bufferedWriter2.close();
                    } catch (IOException e11) {
                        e = e11;
                        bufferedWriter = bufferedWriter2;
                        e.printStackTrace();
                        if (bufferedWriter == null) {
                        } else {
                            bufferedWriter.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedWriter = bufferedWriter2;
                        if (bufferedWriter != null) {
                            try {
                                bufferedWriter.close();
                            } catch (IOException e12) {
                                e12.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (IOException e13) {
                    e = e13;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e14) {
            e14.printStackTrace();
        }
    }

    public static void h(String str, int i7, Object... objArr) {
        c cVar;
        String string;
        g gVar = f2604d;
        if (gVar.f2441b) {
            int i10 = i7 & 15;
            int i11 = i7 & 240;
            if (i10 >= 2 || i10 >= 2) {
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                if (3 >= stackTrace.length) {
                    String strF = f(stackTrace[3]);
                    if (G6.c.d(str)) {
                        int iIndexOf = strF.indexOf(46);
                        str = iIndexOf == -1 ? strF : strF.substring(0, iIndexOf);
                    }
                    cVar = new c(str);
                } else {
                    String strF2 = f(stackTrace[3]);
                    if (G6.c.d(str)) {
                        int iIndexOf2 = strF2.indexOf(46);
                        str = iIndexOf2 == -1 ? strF2 : strF2.substring(0, iIndexOf2);
                    }
                    cVar = new c(str);
                }
                int length = objArr.length;
                int i12 = 1;
                String str2 = f2603c;
                if (length == 1) {
                    Object obj = objArr[0];
                    if (obj == null) {
                        string = BuildConfig.TRAVIS;
                    } else if (i11 == 32) {
                        string = androidx.camera.core.impl.utils.executor.g.F(32, obj);
                    } else {
                        string = i11 == 48 ? androidx.camera.core.impl.utils.executor.g.F(48, obj) : d(obj);
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    int length2 = objArr.length;
                    for (int i13 = 0; i13 < length2; i13++) {
                        Object obj2 = objArr[i13];
                        sb2.append("args[");
                        sb2.append(i13);
                        sb2.append("] = ");
                        sb2.append(d(obj2));
                        sb2.append(str2);
                    }
                    string = sb2.toString();
                }
                if (string.length() == 0) {
                    string = "log nothing";
                }
                if (i11 != 16 && i10 >= 2) {
                    String str3 = cVar.f2600a;
                    int length3 = string.length();
                    int i14 = length3 / 11000;
                    if (i14 > 0) {
                        int i15 = 11000;
                        Log.println(i10, str3, string.substring(0, 11000));
                        gVar.getClass();
                        while (i12 < i14) {
                            StringBuilder sb3 = new StringBuilder(" ");
                            sb3.append(str2);
                            int i16 = i15 + 11000;
                            sb3.append(string.substring(i15, i16));
                            Log.println(i10, str3, sb3.toString());
                            gVar.getClass();
                            i12++;
                            i15 = i16;
                        }
                        if (i15 != length3) {
                            Log.println(i10, str3, " " + str2 + string.substring(i15, length3));
                            gVar.getClass();
                        }
                    } else {
                        Log.println(i10, str3, string);
                        gVar.getClass();
                    }
                }
                if (i11 != 16 || i10 < 2) {
                    return;
                }
                f2606f.execute(new a(i10, cVar, string));
            }
        }
    }

    public static void i(String str, String str2) throws Throwable {
        g gVar = f2604d;
        LinkedHashMap linkedHashMap = (LinkedHashMap) ((top.zibin.luban.io.a) gVar.f2444e).f42646c;
        if (!TextUtils.isEmpty("Date of Log") && !TextUtils.isEmpty(str2)) {
            linkedHashMap.put("Date of Log" + "                   ".substring(0, 8), str2);
        }
        g(str, ((top.zibin.luban.io.a) gVar.f2444e).toString());
    }

    public static void j(File file) {
        File file2;
        if (file == null || !file.exists()) {
            return;
        }
        String name = file.getName();
        if (name.contains("Writing")) {
            String strReplace = name.replace("Writing", "Finished");
            StringBuilder sb2 = new StringBuilder();
            g gVar = f2604d;
            sb2.append(gVar.d());
            sb2.append(strReplace);
            File file3 = new File(sb2.toString());
            if (file3.exists()) {
                int i7 = 1;
                while (true) {
                    file2 = new File(gVar.d() + name.replace("Writing", "Finished_" + i7));
                    if (!file2.exists()) {
                        break;
                    } else {
                        i7++;
                    }
                }
                file3 = file2;
            }
            file.renameTo(file3);
        }
    }

    public static void k() {
        synchronized (f2608h) {
            try {
                File file = new File(f2604d.d());
                if (file.exists()) {
                    File[] fileArrListFiles = file.listFiles(new b(0));
                    if (fileArrListFiles == null) {
                        return;
                    }
                    for (File file2 : fileArrListFiles) {
                        j(file2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
