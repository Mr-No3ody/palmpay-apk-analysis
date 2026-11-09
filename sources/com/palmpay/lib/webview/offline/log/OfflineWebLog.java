package com.palmpay.lib.webview.offline.log;

import android.util.Log;
import com.palmpay.lib.webview.offline.OfflineWebManager;

/* JADX INFO: loaded from: classes3.dex */
public class OfflineWebLog {
    private static final String DEFAULT_TAG = "OffLineWeb_";

    private OfflineWebLog() {
    }

    public static void d(String str, String str2) {
        if (getLogger() != null) {
            getLogger().d(DEFAULT_TAG + str, str2);
            return;
        }
        if (OfflineWebManager.getInstance().isDebug()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Thread.currentThread().getName());
            sb2.append("-");
            sb2.append(str);
        }
    }

    public static void e(String str, String str2) {
        if (getLogger() != null) {
            getLogger().e(str, str2);
            return;
        }
        if (OfflineWebManager.getInstance().isDebug()) {
            Log.e(DEFAULT_TAG + (Thread.currentThread().getName() + "-" + str), str2);
        }
    }

    private static Logger getLogger() {
        return OfflineWebManager.getInstance().getLogger();
    }

    public static void i(String str, String str2) {
        if (getLogger() != null) {
            getLogger().i(DEFAULT_TAG + str, str2);
            return;
        }
        if (OfflineWebManager.getInstance().isDebug()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Thread.currentThread().getName());
            sb2.append("-");
            sb2.append(str);
        }
    }

    public static boolean loggable() {
        return getLogger() != null || OfflineWebManager.getInstance().isDebug();
    }

    public static void d(String str, String str2, Object... objArr) {
        if (loggable()) {
            d(str, String.format(str2, objArr));
        }
    }

    public static void i(String str, String str2, Object... objArr) {
        if (loggable()) {
            i(str, String.format(str2, objArr));
        }
    }

    public static void e(String str, Throwable th) {
        if (getLogger() == null) {
            if (OfflineWebManager.getInstance().isDebug()) {
                try {
                    Log.e(DEFAULT_TAG + (Thread.currentThread().getName() + "-" + str), th.getMessage());
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            }
            return;
        }
        getLogger().e(DEFAULT_TAG + str, th);
    }

    public static void e(String str, String str2, Object... objArr) {
        if (loggable()) {
            e(str, String.format(str2, objArr));
        }
    }
}
