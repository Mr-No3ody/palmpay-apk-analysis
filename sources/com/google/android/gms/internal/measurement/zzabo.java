package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabo extends RuntimeException {
    private zzabo(String str, String str2) {
        super(str);
    }

    public static zzabo zza(String str, String str2, int i7, int i10) {
        return new zzabo(zze(str, str2, i7, i10), str2);
    }

    public static zzabo zzb(String str, String str2, int i7) {
        return new zzabo(zze(str, str2, i7, i7 + 1), str2);
    }

    public static zzabo zzc(String str, String str2, int i7) {
        return new zzabo(zze(str, str2, i7, -1), str2);
    }

    public static zzabo zzd(String str, String str2) {
        return new zzabo(str, str2);
    }

    private static String zze(String str, String str2, int i7, int i10) {
        if (i10 < 0) {
            i10 = str2.length();
        }
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(": ");
        if (i7 > 8) {
            sb2.append("...");
            sb2.append((CharSequence) str2, i7 - 5, i7);
        } else {
            sb2.append((CharSequence) str2, 0, i7);
        }
        sb2.append('[');
        sb2.append(str2.substring(i7, i10));
        sb2.append(']');
        if (str2.length() - i10 > 8) {
            sb2.append((CharSequence) str2, i10, i10 + 5);
            sb2.append("...");
        } else {
            sb2.append((CharSequence) str2, i10, str2.length());
        }
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
