package com.adjust.sdk;

/* JADX INFO: loaded from: classes.dex */
public enum LogLevel {
    VERBOSE(2),
    DEBUG(3),
    INFO(4),
    WARN(5),
    ERROR(6),
    ASSERT(7),
    SUPPRESS(8);

    final int androidLogLevel;

    LogLevel(int i7) {
        this.androidLogLevel = i7;
    }

    public int getAndroidLogLevel() {
        return this.androidLogLevel;
    }
}
