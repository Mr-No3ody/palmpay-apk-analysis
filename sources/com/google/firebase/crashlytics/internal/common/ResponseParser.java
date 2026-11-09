package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes2.dex */
public class ResponseParser {
    public static final int ResponseActionDiscard = 0;
    public static final int ResponseActionRetry = 1;

    public static int parse(int i7) {
        if (i7 < 200 || i7 > 299) {
            return ((i7 < 300 || i7 > 399) && i7 >= 400 && i7 <= 499) ? 0 : 1;
        }
        return 0;
    }
}
