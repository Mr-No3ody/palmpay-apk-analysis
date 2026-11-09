package com.google.firebase.crashlytics.internal.stacktrace;

/* JADX INFO: loaded from: classes2.dex */
public class MiddleOutStrategy implements StackTraceTrimmingStrategy {
    private final int trimmedSize;

    public MiddleOutStrategy(int i7) {
        this.trimmedSize = i7;
    }

    @Override // com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy
    public StackTraceElement[] getTrimmedStackTrace(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i7 = this.trimmedSize;
        if (length <= i7) {
            return stackTraceElementArr;
        }
        int i10 = i7 / 2;
        int i11 = i7 - i10;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i7];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i11);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i10, stackTraceElementArr2, i11, i10);
        return stackTraceElementArr2;
    }
}
