package com.google.android.gms.internal.mlkit_vision_face;

import C0.G;
import com.google.firebase.analytics.FirebaseAnalytics;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class zzab {
    public static int zza(int i7, int i10, String str) {
        String strZza;
        if (i7 >= 0 && i7 < i10) {
            return i7;
        }
        if (i7 < 0) {
            strZza = zzac.zza("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i7));
        } else {
            if (i10 < 0) {
                throw new IllegalArgumentException(G.m(i10, "negative size: "));
            }
            strZza = zzac.zza("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i7), Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i7, int i10, String str) {
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(zze(i7, i10, FirebaseAnalytics.Param.INDEX));
        }
        return i7;
    }

    public static void zzc(int i7, int i10, int i11) {
        String strZze;
        if (i7 < 0 || i10 < i7 || i10 > i11) {
            if (i7 < 0 || i7 > i11) {
                strZze = zze(i7, i11, "start index");
            } else {
                strZze = (i10 < 0 || i10 > i11) ? zze(i10, i11, "end index") : zzac.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i7));
            }
            throw new IndexOutOfBoundsException(strZze);
        }
    }

    public static void zzd(boolean z3, @CheckForNull Object obj) {
        if (!z3) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zze(int i7, int i10, String str) {
        if (i7 < 0) {
            return zzac.zza("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i10 >= 0) {
            return zzac.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(G.m(i10, "negative size: "));
    }
}
