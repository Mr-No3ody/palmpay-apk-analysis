package p291t5;

import V7.g;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import p381za.c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f42340a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Handler f42341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static PackageManager f42342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f42343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f42344e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x0077  */
    public static g a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        String str = c.UNKNOWN_PROCESS_NAME;
        boolean z3 = false;
        if (activeNetworkInfo == null) {
            return new g(false, false, false, c.UNKNOWN_PROCESS_NAME);
        }
        boolean zIsConnected = activeNetworkInfo.isConnected();
        boolean z8 = activeNetworkInfo.isConnected() && activeNetworkInfo.getType() != 1;
        if (activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1) {
            z3 = true;
        }
        if (activeNetworkInfo.isConnected()) {
            int type = activeNetworkInfo.getType();
            int subtype = activeNetworkInfo.getSubtype();
            String subtypeName = activeNetworkInfo.getSubtypeName();
            if (type != 1) {
                switch (subtype) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        str = "2G";
                        break;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        str = "3G";
                        break;
                    case 13:
                    case 18:
                        str = "4G";
                        break;
                    case 19:
                    default:
                        if ("TD-SCDMA".equalsIgnoreCase(subtypeName) || "WCDMA".equalsIgnoreCase(subtypeName) || "CDMA2000".equalsIgnoreCase(subtypeName)) {
                            str = "3G";
                        }
                        break;
                    case 20:
                        str = "5G";
                        break;
                }
            } else {
                str = "WIFI";
            }
        }
        return new g(zIsConnected, z8, z3, str);
    }

    public static DisplayMetrics b(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay == null) {
            return displayMetrics;
        }
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    public static String c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        try {
            String str = (String) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", new Class[0]).invoke(null, new Object[0]);
            if (str != null) {
                return str;
            }
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/" + Process.myPid() + "/cmdline")));
                try {
                    String strTrim = bufferedReader.readLine().trim();
                    bufferedReader.close();
                    return strTrim;
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e10) {
                throw new RuntimeException(e10);
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException(e12);
        } catch (IllegalAccessException e13) {
            throw new RuntimeException(e13);
        } catch (NoSuchMethodException e14) {
            throw new RuntimeException(e14);
        } catch (InvocationTargetException e15) {
            throw new RuntimeException(e15);
        }
    }

    public static Handler d() {
        Handler handler;
        synchronized (f42340a) {
            try {
                if (f42341b == null) {
                    f42341b = new Handler(Looper.getMainLooper());
                }
                handler = f42341b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public static void e(Runnable runnable) {
        if (d().getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            d().post(runnable);
        }
    }
}
