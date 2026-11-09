package com.google.android.datatransport.runtime.logging;

import C0.G;
import N8.q0;
import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class Logging {
    private static final String LOG_PREFIX = "TRuntime.";
    private static final int MAX_LOG_TAG_SIZE_IN_SDK_N = 23;

    private Logging() {
    }

    private static String concatTag(String str, String str2) {
        String strJ = q0.j(str, str2);
        return strJ.length() > 23 ? strJ.substring(0, 23) : strJ;
    }

    public static void d(String str, String str2) {
        getTag(str);
    }

    public static void e(String str, String str2, Throwable th) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 6)) {
            Log.e(tag, str2, th);
        }
    }

    private static String getTag(String str) {
        return Build.VERSION.SDK_INT < 26 ? concatTag(LOG_PREFIX, str) : G.o(LOG_PREFIX, str);
    }

    public static void i(String str, String str2, Object obj) {
        if (Log.isLoggable(getTag(str), 4)) {
            String.format(str2, obj);
        }
    }

    public static void w(String str, String str2, Object obj) {
        if (Log.isLoggable(getTag(str), 5)) {
            String.format(str2, obj);
        }
    }

    public static void d(String str, String str2, Object obj) {
        if (Log.isLoggable(getTag(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static void d(String str, String str2, Object obj, Object obj2) {
        if (Log.isLoggable(getTag(str), 3)) {
            String.format(str2, obj, obj2);
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        if (Log.isLoggable(getTag(str), 3)) {
            String.format(str2, objArr);
        }
    }
}
