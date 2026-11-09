package com.google.android.gms.internal.mlkit_vision_common;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlk {

    @Nullable
    private static zzlk zza;

    private zzlk() {
    }

    public static synchronized zzlk zza() {
        try {
            if (zza == null) {
                zza = new zzlk();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }

    public static final boolean zzb() {
        return zzlj.zza("mlkit-dev-profiling");
    }
}
