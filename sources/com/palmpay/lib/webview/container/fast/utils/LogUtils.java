package com.palmpay.lib.webview.container.fast.utils;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public class LogUtils {
    public static boolean DEBUG = false;
    private static final String TAG = "PPWebView";

    public static void d(String str) {
    }

    public static void e(String str) {
        if (DEBUG) {
            Log.e(TAG, str);
        }
    }
}
