package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzne {

    @Nullable
    private static zzne zza;

    private zzne() {
    }

    public static synchronized zzne zza() {
        try {
            if (zza == null) {
                zza = new zzne();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }

    public static void zzb() {
        zznd.zza();
    }
}
