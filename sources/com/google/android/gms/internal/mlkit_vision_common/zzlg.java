package com.google.android.gms.internal.mlkit_vision_common;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlg {

    @Nullable
    private static zzlf zza;

    public static synchronized zzkx zza(zzkr zzkrVar) {
        try {
            if (zza == null) {
                zza = new zzlf(null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (zzkx) zza.get(zzkrVar);
    }

    public static synchronized zzkx zzb(String str) {
        return zza(zzkr.zzd("vision-common").zzd());
    }
}
