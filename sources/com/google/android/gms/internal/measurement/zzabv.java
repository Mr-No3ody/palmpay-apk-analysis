package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class zzabv implements zzabu {
    private static final int zzc(StackTraceElement[] stackTraceElementArr, Class cls, int i7) {
        String name = cls.getName();
        boolean z3 = false;
        for (int i10 = 3; i10 < stackTraceElementArr.length; i10++) {
            if (stackTraceElementArr[i10].getClassName().equals(name)) {
                z3 = true;
            } else if (z3) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzabu
    public final StackTraceElement zza(Class cls, int i7) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iZzc = zzc(stackTrace, cls, 3);
        if (iZzc != -1) {
            return stackTrace[iZzc];
        }
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzabu
    public final StackTraceElement[] zzb(Class cls, int i7, int i10) {
        boolean z3 = true;
        if (i7 != -1 && i7 <= 0) {
            z3 = false;
        }
        zzabr.zzb(z3, "maxDepth must be > 0 or -1");
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iZzc = zzc(stackTrace, cls, 3);
        if (iZzc == -1) {
            return new StackTraceElement[0];
        }
        int length = stackTrace.length - iZzc;
        if (i7 <= 0 || i7 >= length) {
            i7 = length;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i7];
        System.arraycopy(stackTrace, iZzc, stackTraceElementArr, 0, i7);
        return stackTraceElementArr;
    }
}
