package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class zzan {
    public static int zza(int i7) {
        boolean z3 = true;
        if (i7 != 100 && i7 != 102 && i7 != 104) {
            if (i7 == 105) {
                i7 = 105;
            } else {
                z3 = false;
            }
        }
        Preconditions.checkArgument(z3, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i7));
        return i7;
    }

    public static String zzb(int i7) {
        if (i7 == 100) {
            return "HIGH_ACCURACY";
        }
        if (i7 == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i7 == 104) {
            return "LOW_POWER";
        }
        if (i7 == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }
}
