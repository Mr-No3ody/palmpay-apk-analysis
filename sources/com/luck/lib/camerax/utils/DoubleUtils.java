package com.luck.lib.camerax.utils;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public class DoubleUtils {
    private static final long TIME = 800;
    private static long lastClickTime;

    public static boolean isFastDoubleClick() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - lastClickTime < TIME) {
            return true;
        }
        lastClickTime = jElapsedRealtime;
        return false;
    }
}
