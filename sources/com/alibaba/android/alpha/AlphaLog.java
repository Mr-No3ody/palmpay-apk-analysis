package com.alibaba.android.alpha;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class AlphaLog {
    public static final String GLOBAL_TAG = "==ALPHA==";

    public static void d(String str, Object obj) {
        if (AlphaConfig.isLoggable()) {
            obj.toString();
        }
    }

    public static void e(String str, Object obj) {
        if (AlphaConfig.isLoggable()) {
            Log.e(str, obj.toString());
        }
    }

    public static void i(String str, Object obj) {
        if (AlphaConfig.isLoggable()) {
            obj.toString();
        }
    }

    public static void print(Object obj) {
        d(GLOBAL_TAG, obj);
    }

    public static void w(Exception exc) {
        if (AlphaConfig.isLoggable()) {
            exc.printStackTrace();
        }
    }

    public static void print(String str, Object... objArr) {
        d(GLOBAL_TAG, str, objArr);
    }

    public static void d(String str, String str2, Object... objArr) {
        if (AlphaConfig.isLoggable()) {
            String.format(str2, objArr);
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        if (AlphaConfig.isLoggable()) {
            Log.e(str, String.format(str2, objArr));
        }
    }

    public static void d(String str, Object... objArr) {
        d(GLOBAL_TAG, str, objArr);
    }
}
