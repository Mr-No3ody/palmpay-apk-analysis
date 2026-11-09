package com.transsnet.adsdk.widgets.banner.bannerview.utils;

import android.content.res.Resources;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public class BannerUtils {
    private static final String TAG = "BVP";
    private static boolean debugMode = false;

    public static int dp2px(float dpValue) {
        return (int) ((dpValue * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static int getOriginalPosition(int pageSize) {
        return 500 - (500 % pageSize);
    }

    public static int getRealPosition(int position, int pageSize) {
        if (pageSize == 0) {
            return 0;
        }
        return (position + pageSize) % pageSize;
    }

    public static boolean isDebugMode() {
        return debugMode;
    }

    public static void log(String tag, String msg) {
        if (isDebugMode()) {
            Log.e(tag, msg);
        }
    }

    public static void setDebugMode(boolean isDebug) {
        debugMode = isDebug;
    }

    public static void log(String msg) {
        if (isDebugMode()) {
            log(TAG, msg);
        }
    }
}
