package com.google.firebase.crashlytics.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class Logger {
    private int logLevel = 4;
    private final String tag;
    public static final String TAG = "FirebaseCrashlytics";
    static final Logger DEFAULT_LOGGER = new Logger(TAG);

    public Logger(String str) {
        this.tag = str;
    }

    private boolean canLog(int i7) {
        return this.logLevel <= i7 || Log.isLoggable(this.tag, i7);
    }

    public static Logger getLogger() {
        return DEFAULT_LOGGER;
    }

    public void d(String str, Throwable th) {
        canLog(3);
    }

    public void e(String str, Throwable th) {
        if (canLog(6)) {
            Log.e(this.tag, str, th);
        }
    }

    public void i(String str, Throwable th) {
        canLog(4);
    }

    public void log(int i7, String str) {
        log(i7, str, false);
    }

    public void v(String str, Throwable th) {
        canLog(2);
    }

    public void w(String str, Throwable th) {
        canLog(5);
    }

    public void d(String str) {
        d(str, null);
    }

    public void i(String str) {
        i(str, null);
    }

    public void log(int i7, String str, boolean z3) {
        if (z3 || canLog(i7)) {
            Log.println(i7, this.tag, str);
        }
    }

    public void v(String str) {
        v(str, null);
    }

    public void w(String str) {
        w(str, null);
    }

    public void e(String str) {
        e(str, null);
    }
}
