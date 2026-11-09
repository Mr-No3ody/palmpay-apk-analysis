package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class zzq {
    public static int zza(int i7) {
        boolean z3 = true;
        if (i7 != 0 && i7 != 1) {
            if (i7 == 2) {
                i7 = 2;
            } else {
                z3 = false;
            }
        }
        Preconditions.checkArgument(z3, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i7));
        return i7;
    }

    public static String zzb(int i7) {
        if (i7 == 0) {
            return "GRANULARITY_PERMISSION_LEVEL";
        }
        if (i7 == 1) {
            return "GRANULARITY_COARSE";
        }
        if (i7 == 2) {
            return "GRANULARITY_FINE";
        }
        throw new IllegalArgumentException();
    }
}
