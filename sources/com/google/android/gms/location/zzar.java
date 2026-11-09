package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class zzar {
    public static int zza(int i7) {
        boolean z3 = true;
        if (i7 != 0 && i7 != 1) {
            if (i7 == 2) {
                i7 = 2;
            } else {
                z3 = false;
            }
        }
        Preconditions.checkArgument(z3, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i7));
        return i7;
    }

    public static String zzb(int i7) {
        if (i7 == 0) {
            return "THROTTLE_BACKGROUND";
        }
        if (i7 == 1) {
            return "THROTTLE_ALWAYS";
        }
        if (i7 == 2) {
            return "THROTTLE_NEVER";
        }
        throw new IllegalArgumentException();
    }
}
