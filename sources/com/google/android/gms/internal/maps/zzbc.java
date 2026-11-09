package com.google.android.gms.internal.maps;

import C0.G;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbc {
    public static int zza(int i7, int i10, String str) {
        String strZza;
        if (i7 >= 0 && i7 < i10) {
            return i7;
        }
        if (i7 < 0) {
            strZza = zzbd.zza("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i7));
        } else {
            if (i10 < 0) {
                throw new IllegalArgumentException(G.m(i10, "negative size: "));
            }
            strZza = zzbd.zza("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i7), Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i7, int i10, String str) {
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(zzd(i7, i10, FirebaseAnalytics.Param.INDEX));
        }
        return i7;
    }

    public static void zzc(int i7, int i10, int i11) {
        String strZzd;
        if (i7 < 0 || i10 < i7 || i10 > i11) {
            if (i7 < 0 || i7 > i11) {
                strZzd = zzd(i7, i11, "start index");
            } else {
                strZzd = (i10 < 0 || i10 > i11) ? zzd(i10, i11, "end index") : zzbd.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i7));
            }
            throw new IndexOutOfBoundsException(strZzd);
        }
    }

    private static String zzd(int i7, int i10, String str) {
        if (i7 < 0) {
            return zzbd.zza("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i10 >= 0) {
            return zzbd.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(G.m(i10, "negative size: "));
    }
}
