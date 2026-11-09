package com.google.android.gms.internal.identity;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.horcrux.svg.d0;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class zzer {
    public static void zza(boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzb(boolean z3, @CheckForNull Object obj) {
        if (!z3) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static int zzc(int i7, int i10, String str) {
        String strZza;
        if (i7 >= 0 && i7 < i10) {
            return i7;
        }
        if (i7 < 0) {
            strZza = zzes.zza("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i7));
        } else {
            if (i10 < 0) {
                throw new IllegalArgumentException(d0.n(i10, "negative size: ", new StringBuilder(String.valueOf(i10).length() + 15)));
            }
            strZza = zzes.zza("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i7), Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzd(int i7, int i10, String str) {
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(zzf(i7, i10, FirebaseAnalytics.Param.INDEX));
        }
        return i7;
    }

    public static void zze(int i7, int i10, int i11) {
        String strZzf;
        if (i7 < 0 || i10 < i7 || i10 > i11) {
            if (i7 < 0 || i7 > i11) {
                strZzf = zzf(i7, i11, "start index");
            } else {
                strZzf = (i10 < 0 || i10 > i11) ? zzf(i10, i11, "end index") : zzes.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i7));
            }
            throw new IndexOutOfBoundsException(strZzf);
        }
    }

    private static String zzf(int i7, int i10, String str) {
        if (i7 < 0) {
            return zzes.zza("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i10 >= 0) {
            return zzes.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(d0.n(i10, "negative size: ", new StringBuilder(String.valueOf(i10).length() + 15)));
    }
}
