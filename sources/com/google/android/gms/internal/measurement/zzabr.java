package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabr {
    public static Object zza(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str.concat(" must not be null"));
    }

    public static void zzb(boolean z3, String str) {
        if (!z3) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void zzc(boolean z3, String str) {
        if (!z3) {
            throw new IllegalStateException(str);
        }
    }

    public static String zzd(String str) {
        if (!zze(str.charAt(0))) {
            throw new IllegalArgumentException("identifier must start with an ASCII letter: ".concat(str));
        }
        for (int i7 = 1; i7 < str.length(); i7++) {
            char cCharAt = str.charAt(i7);
            if (!zze(cCharAt) && ((cCharAt < '0' || cCharAt > '9') && cCharAt != '_')) {
                throw new IllegalArgumentException("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
            }
        }
        return str;
    }

    private static boolean zze(char c6) {
        if (c6 < 'a' || c6 > 'z') {
            return c6 >= 'A' && c6 <= 'Z';
        }
        return true;
    }
}
