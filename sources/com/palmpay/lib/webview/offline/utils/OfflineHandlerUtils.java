package com.palmpay.lib.webview.offline.utils;

import android.os.Handler;
import android.os.Looper;
import com.palmpay.lib.webview.offline.OfflineWebManager;

/* JADX INFO: loaded from: classes3.dex */
public class OfflineHandlerUtils {
    private static final String TAG = "OfflineHandlerUtils";
    private static Handler sHandler;

    private OfflineHandlerUtils() {
    }

    public static void post(Runnable runnable) {
        if (sHandler == null) {
            sHandler = new Handler(Looper.getMainLooper());
        }
        sHandler.post(runnable);
    }

    public static void postDelayed(Runnable runnable, long j6) {
        if (sHandler == null) {
            sHandler = new Handler(Looper.getMainLooper());
        }
        sHandler.postDelayed(runnable, j6);
    }

    public static void runOnUiThread(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (sHandler == null) {
                sHandler = new Handler(Looper.getMainLooper());
            }
            sHandler.post(runnable);
        } else {
            try {
                runnable.run();
            } catch (Exception e10) {
                OfflineWebManager.getInstance().getLogger().e(TAG, e10);
            }
        }
    }
}
