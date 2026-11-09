package com.transsnet.palmpay.util;

import C0.G;
import N8.q0;
import android.annotation.SuppressLint;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.camera.camera2.internal.F;
import com.didiglobal.booster.instrument.ShadowExecutors;
import com.google.android.gms.measurement.AppMeasurement;
import com.luck.picture.lib.permissions.PermissionConfig;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes4.dex */
public final class CrashUtils {
    private static final String CRASH_HEAD;
    private static final Thread.UncaughtExceptionHandler DEFAULT_UNCAUGHT_EXCEPTION_HANDLER;
    private static final String FILE_SEP = System.getProperty("file.separator");

    @SuppressLint({"SimpleDateFormat"})
    private static final Format FORMAT = new SimpleDateFormat("MM-dd-HH-mm-ss");
    private static final Thread.UncaughtExceptionHandler UNCAUGHT_EXCEPTION_HANDLER;
    private static String defaultDir;
    private static String dir;
    private static OnCrashListener sOnCrashListener;
    private static int versionCode;
    private static String versionName;

    public interface OnCrashListener {
        void onCrash(String str, Throwable th);
    }

    static {
        try {
            PackageInfo packageInfo = Utils.getApp().getPackageManager().getPackageInfo(Utils.getApp().getPackageName(), 0);
            if (packageInfo != null) {
                versionName = packageInfo.versionName;
                versionCode = packageInfo.versionCode;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
        }
        StringBuilder sb2 = new StringBuilder("************* Crash Log Head ****************\nDevice Manufacturer: ");
        sb2.append(Build.MANUFACTURER);
        sb2.append("\nDevice Model       : ");
        sb2.append(Build.MODEL);
        sb2.append("\nAndroid Version    : ");
        sb2.append(Build.VERSION.RELEASE);
        sb2.append("\nAndroid SDK        : ");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append("\nApp VersionName    : ");
        sb2.append(versionName);
        sb2.append("\nApp VersionCode    : ");
        CRASH_HEAD = G.n(versionCode, "\n************* Crash Log Head ****************\n\n", sb2);
        DEFAULT_UNCAUGHT_EXCEPTION_HANDLER = Thread.getDefaultUncaughtExceptionHandler();
        UNCAUGHT_EXCEPTION_HANDLER = new Thread.UncaughtExceptionHandler() { // from class: com.transsnet.palmpay.util.CrashUtils.1
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                if (th == null) {
                    if (CrashUtils.DEFAULT_UNCAUGHT_EXCEPTION_HANDLER != null) {
                        CrashUtils.DEFAULT_UNCAUGHT_EXCEPTION_HANDLER.uncaughtException(thread, null);
                        return;
                    } else {
                        Process.killProcess(Process.myPid());
                        System.exit(1);
                        return;
                    }
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(CrashUtils.CRASH_HEAD);
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
                    cause.printStackTrace(printWriter);
                }
                printWriter.flush();
                sb3.append(stringWriter.toString());
                String string = sb3.toString();
                String strR = G.r(new StringBuilder(), CrashUtils.dir == null ? CrashUtils.defaultDir : CrashUtils.dir, CrashUtils.FORMAT.format(new Date(System.currentTimeMillis())) + ".txt");
                if (CrashUtils.createOrExistsFile(strR)) {
                    CrashUtils.input2File(string, strR);
                } else {
                    Log.e("CrashUtils", "create " + strR + " failed!");
                }
                if (CrashUtils.sOnCrashListener != null) {
                    CrashUtils.sOnCrashListener.onCrash(string, th);
                }
                if (CrashUtils.DEFAULT_UNCAUGHT_EXCEPTION_HANDLER != null) {
                    CrashUtils.DEFAULT_UNCAUGHT_EXCEPTION_HANDLER.uncaughtException(thread, th);
                }
            }
        };
    }

    private CrashUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static boolean createOrExistsDir(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isDirectory();
        }
        return file.mkdirs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean createOrExistsFile(String str) {
        File file = new File(str);
        if (file.exists()) {
            return file.isFile();
        }
        if (!createOrExistsDir(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    @RequiresPermission(PermissionConfig.WRITE_EXTERNAL_STORAGE)
    public static void init() {
        init("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void input2File(final String str, final String str2) {
        try {
            if (((Boolean) ShadowExecutors.newOptimizedSingleThreadExecutor("\u200bcom.transsnet.palmpay.util.CrashUtils").submit(new Callable<Boolean>() { // from class: com.transsnet.palmpay.util.CrashUtils.2
                /* JADX WARN: Can't rename method to resolve collision */
                /* JADX WARN: Code duplicated, block: B:35:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // java.util.concurrent.Callable
                public Boolean call() throws Exception {
                    BufferedWriter bufferedWriter;
                    Throwable th;
                    IOException e10;
                    try {
                        bufferedWriter = new BufferedWriter(new FileWriter(str2, true));
                        try {
                            try {
                                bufferedWriter.write(str);
                                Boolean bool = Boolean.TRUE;
                                try {
                                    bufferedWriter.close();
                                    return bool;
                                } catch (IOException e11) {
                                    e11.printStackTrace();
                                    return bool;
                                }
                            } catch (IOException e12) {
                                e10 = e12;
                                e10.printStackTrace();
                                Boolean bool2 = Boolean.FALSE;
                                if (bufferedWriter != null) {
                                    try {
                                        bufferedWriter.close();
                                    } catch (IOException e13) {
                                        e13.printStackTrace();
                                    }
                                }
                                return bool2;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (bufferedWriter != null) {
                                try {
                                    bufferedWriter.close();
                                } catch (IOException e14) {
                                    e14.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e15) {
                        bufferedWriter = null;
                        e10 = e15;
                    } catch (Throwable th3) {
                        bufferedWriter = null;
                        th = th3;
                        if (bufferedWriter != null) {
                            bufferedWriter.close();
                        }
                        throw th;
                    }
                }
            }).get()).booleanValue()) {
                return;
            }
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        } catch (ExecutionException e11) {
            e11.printStackTrace();
        }
        Log.e("CrashUtils", "write crash info to " + str2 + " failed!");
    }

    private static boolean isSpace(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (!Character.isWhitespace(str.charAt(i7))) {
                return false;
            }
        }
        return true;
    }

    @RequiresPermission(PermissionConfig.WRITE_EXTERNAL_STORAGE)
    public static void init(@NonNull File file) {
        init(file.getAbsolutePath(), (OnCrashListener) null);
    }

    @RequiresPermission(PermissionConfig.WRITE_EXTERNAL_STORAGE)
    public static void init(String str) {
        init(str, (OnCrashListener) null);
    }

    @RequiresPermission(PermissionConfig.WRITE_EXTERNAL_STORAGE)
    public static void init(OnCrashListener onCrashListener) {
        init("", onCrashListener);
    }

    @RequiresPermission(PermissionConfig.WRITE_EXTERNAL_STORAGE)
    public static void init(@NonNull File file, OnCrashListener onCrashListener) {
        init(file.getAbsolutePath(), onCrashListener);
    }

    @RequiresPermission(PermissionConfig.WRITE_EXTERNAL_STORAGE)
    public static void init(String str, OnCrashListener onCrashListener) {
        if (isSpace(str)) {
            dir = null;
        } else {
            String str2 = FILE_SEP;
            if (!str.endsWith(str2)) {
                str = q0.j(str, str2);
            }
            dir = str;
        }
        if ("mounted".equals(Environment.getExternalStorageState()) && Utils.getApp().getExternalCacheDir() != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Utils.getApp().getExternalCacheDir());
            String str3 = FILE_SEP;
            defaultDir = F.d(sb2, str3, AppMeasurement.CRASH_ORIGIN, str3);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Utils.getApp().getCacheDir());
            String str4 = FILE_SEP;
            defaultDir = F.d(sb3, str4, AppMeasurement.CRASH_ORIGIN, str4);
        }
        sOnCrashListener = onCrashListener;
        Thread.setDefaultUncaughtExceptionHandler(UNCAUGHT_EXCEPTION_HANDLER);
    }
}
