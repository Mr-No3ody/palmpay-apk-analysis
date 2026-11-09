package p189me.jessyan.autosize.utils;

import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class AutoSizeLog {
    private static final String TAG = "AndroidAutoSize";
    private static boolean debug;

    private AutoSizeLog() {
        throw new IllegalStateException("you can't instantiate me!");
    }

    public static void d(String str) {
    }

    public static void e(String str) {
        if (debug) {
            Log.e(TAG, str);
        }
    }

    public static boolean isDebug() {
        return debug;
    }

    public static void setDebug(boolean z3) {
        debug = z3;
    }

    public static void w(String str) {
    }
}
