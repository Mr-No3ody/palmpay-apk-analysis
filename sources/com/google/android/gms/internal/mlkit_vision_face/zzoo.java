package com.google.android.gms.internal.mlkit_vision_face;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzoo {

    @Nullable
    private static zzoo zza;

    private zzoo() {
    }

    public static synchronized zzoo zza() {
        try {
            if (zza == null) {
                zza = new zzoo();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }
}
