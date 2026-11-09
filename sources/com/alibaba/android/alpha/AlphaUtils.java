package com.alibaba.android.alpha;

import Gb.Q;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Process;
import android.text.TextUtils;
import androidx.camera.camera2.internal.F;
import java.io.Closeable;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AlphaUtils {
    private static String sProcessName;
    private static Comparator<Task> sTaskComparator = new Q(9);

    public static boolean closeSafely(Closeable closeable) {
        if (closeable == null) {
            return false;
        }
        try {
            closeable.close();
            return true;
        } catch (Exception e10) {
            AlphaLog.w(e10);
            return false;
        }
    }

    public static String getCurrProcessName(Context context) throws Throwable {
        String currentProcessNameViaLinuxFile = getCurrentProcessNameViaLinuxFile();
        return (!TextUtils.isEmpty(currentProcessNameViaLinuxFile) || context == null) ? currentProcessNameViaLinuxFile : getCurrentProcessNameViaActivityManager(context);
    }

    private static String getCurrentProcessNameViaActivityManager(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null) {
            return null;
        }
        String str = sProcessName;
        if (str != null) {
            return str;
        }
        int iMyPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo != null && runningAppProcessInfo.pid == iMyPid) {
                sProcessName = runningAppProcessInfo.processName;
                break;
            }
        }
        return sProcessName;
    }

    private static String getCurrentProcessNameViaLinuxFile() throws Throwable {
        FileInputStream fileInputStream;
        int i7;
        byte[] bArr = new byte[1024];
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(F.c(Process.myPid(), "/proc/", "/cmdline"));
            try {
                try {
                    i7 = fileInputStream.read(bArr);
                    closeSafely(fileInputStream);
                } catch (Exception e10) {
                    e = e10;
                    AlphaLog.w(e);
                    closeSafely(fileInputStream);
                    i7 = 0;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                closeSafely(fileInputStream2);
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            closeSafely(fileInputStream2);
            throw th;
        }
        if (i7 > 0) {
            return new String(bArr, 0, i7).trim();
        }
        return null;
    }

    public static boolean isInMainProcess(Context context) {
        String packageName = context.getPackageName();
        return packageName != null && packageName.equalsIgnoreCase(getCurrProcessName(context));
    }

    public static boolean isMatchMode(Context context, int i7) {
        if (i7 == 3) {
            return true;
        }
        if (isInMainProcess(context) && i7 == 1) {
            return true;
        }
        return !isInMainProcess(context) && i7 == 2;
    }

    public static boolean isMatchProcess(Context context, String str) {
        return TextUtils.equals(str, getCurrProcessName(context));
    }

    public static void sort(List<Task> list) {
        if (list.size() <= 1) {
            return;
        }
        Collections.sort(list, sTaskComparator);
    }

    public static boolean closeSafely(Cursor cursor) {
        if (cursor == null) {
            return false;
        }
        try {
            cursor.close();
            return true;
        } catch (Exception e10) {
            AlphaLog.w(e10);
            return false;
        }
    }
}
