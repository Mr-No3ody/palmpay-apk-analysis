package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabq {
    private static final String[] zza = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    private static final zzabu zzb;

    static {
        zzabu zzabvVar;
        for (int i7 = 0; i7 < 2; i7++) {
            try {
                zzabvVar = (zzabu) Class.forName(zza[i7]).asSubclass(zzabu.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused) {
                zzabvVar = null;
            }
            if (zzabvVar != null) {
                zzb = zzabvVar;
            }
        }
        zzabvVar = new zzabv();
        zzb = zzabvVar;
    }

    public static StackTraceElement zza(Class cls, int i7) {
        zzabr.zza(cls, "target");
        return zzb.zza(cls, 2);
    }

    public static StackTraceElement[] zzb(Class cls, int i7, int i10) {
        if (i7 > 0 || i7 == -1) {
            return zzb.zzb(cls, i7, 2);
        }
        throw new IllegalArgumentException("invalid maximum depth: 0");
    }
}
