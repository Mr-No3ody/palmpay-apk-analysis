package com.adjust.sdk;

/* JADX INFO: loaded from: classes.dex */
public enum BackoffStrategy {
    LONG_WAIT(1, 120000, 86400000, 0.5d, 1.0d),
    SHORT_WAIT(1, 200, 3600000, 0.5d, 1.0d),
    TEST_WAIT(1, 200, 1000, 0.5d, 1.0d),
    NO_WAIT(100, 1, 1000, 1.0d, 1.0d);

    double maxRange;
    long maxWait;
    long milliSecondMultiplier;
    double minRange;
    int minRetries;

    BackoffStrategy(int i7, long j6, long j10, double d2, double d10) {
        this.minRetries = i7;
        this.milliSecondMultiplier = j6;
        this.maxWait = j10;
        this.minRange = d2;
        this.maxRange = d10;
    }
}
