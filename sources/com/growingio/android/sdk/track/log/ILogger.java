package com.growingio.android.sdk.track.log;

/* JADX INFO: loaded from: classes3.dex */
public interface ILogger {
    void d(String tag, String message, Object... args);

    void d(String tag, Throwable t);

    void d(String tag, Throwable t, String message, Object... args);

    void e(String tag, String message, Object... args);

    void e(String tag, Throwable t);

    void e(String tag, Throwable t, String message, Object... args);

    String getType();

    void i(String tag, String message, Object... args);

    void i(String tag, Throwable t);

    void i(String tag, Throwable t, String message, Object... args);

    void v(String tag, String message, Object... args);

    void v(String tag, Throwable t);

    void v(String tag, Throwable t, String message, Object... args);

    void w(String tag, String message, Object... args);

    void w(String tag, Throwable t);

    void w(String tag, Throwable t, String message, Object... args);

    void wtf(String tag, String message, Object... args);

    void wtf(String tag, Throwable t);

    void wtf(String tag, Throwable t, String message, Object... args);
}
